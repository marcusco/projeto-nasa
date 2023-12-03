package br.com.mco.nasa.nasa.annotations;

import java.lang.reflect.Field;

public class AnnotationInjector {
    public static void inject(Object instance) {
        if(instance.getClass().isAnnotationPresent(Tenacidade.class)){
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.getName().equals("tenant_id")) {
                    //Tenacidade set = field.getAnnotation(Tenacidade.class);
            
                    field.setAccessible(true); // should work on private fields
                   
                    try {
                        field.set(instance, 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
