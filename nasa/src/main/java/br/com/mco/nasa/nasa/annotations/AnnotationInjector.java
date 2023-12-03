package br.com.mco.nasa.nasa.annotations;

import java.lang.reflect.Field;

public class AnnotationInjector {
    public static void inject(Object instance) {
        Field[] fields = instance.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Tenacidade.class)) {
                Tenacidade set = field.getAnnotation(Tenacidade.class);
                field.setAccessible(true); // should work on private fields
                try {
                    field.set(instance, set.value());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
