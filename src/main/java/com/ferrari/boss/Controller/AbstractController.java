package com.ferrari.boss.Controller;

import com.ferrari.boss.Service.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AbstractController <DTO> {

    @Autowired
    private ServiceDTO<DTO> service;

    @GetMapping("/getAll")
    public Iterable<DTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/read")
    public DTO read(Integer id) {
        return service.read(id);
    }

    @PostMapping("/insert")
    public DTO insert(DTO dto) {
        return service.insert(dto);
    }

    @PutMapping
    public DTO update(DTO dto) {
        return service.update(dto);
    }

    @DeleteMapping
    public void delete(Integer id) {
        service.delete(id);
    }
}
