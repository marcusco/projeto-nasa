package br.com.mco.nasa.nasa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mco.nasa.nasa.domain.Tenant_Id;
import br.com.mco.nasa.nasa.service.TenantIdService;

@RestController
@RequestMapping("tenant_id/")
public class TenantIdController {

    private final TenantIdService tenantIdService;

    public TenantIdController(TenantIdService tenantIdService) {
        this.tenantIdService = tenantIdService;
    }

    @GetMapping("{id}")
    public Tenant_Id frindById(Long id){
        return tenantIdService.findById(id);
    }

    @PostMapping
    public Tenant_Id save(@RequestBody Tenant_Id tenantId){
        return tenantIdService.save(tenantId);
    }
    
}
