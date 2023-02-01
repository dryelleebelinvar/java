package com.br.varsolutions;
//configurações pré-definidas
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    //endpoint
    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<Object> get(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Dryelle");
        pessoa1.setSobrenome("Ebelin");
        pessoa1.setEndereco("São Paulo, Brasil");
        pessoa1.setIdade(18);
        pessoa1.setPeso(53);
        pessoa1.setAltura(1.66);

        return ResponseEntity.ok(pessoa1);
    }
}