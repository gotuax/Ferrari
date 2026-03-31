package com.ferrari.boss.Controller;

import com.ferrari.boss.DTO.DipartimentoDTO;
import com.ferrari.boss.Service.DipartimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Dipartimento")
@CrossOrigin(origins = "http://localhost:4200")
public class DipartimentoController {
    @Autowired
    private DipartimentoService service;

    @GetMapping("/FindByNomeReparto")
    public DipartimentoDTO findByNomeReparto(@RequestParam String nomeReparto) {
        return service.findDipartimentoByNomeReparto(nomeReparto);
    }

    @GetMapping("/FindBySedeGeografica")
    public List<DipartimentoDTO> findBySedeGeografica(@RequestParam String sedeGeografica) {
        return service.findDipartimentoBySedeGeografica(sedeGeografica);
    }

}
