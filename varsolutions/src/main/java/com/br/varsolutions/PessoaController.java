package com.br.varsolutions;
//configurações pré-definidas
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins = "*")
@Slf4j  //log
public class PessoaController {
    //endpoint
    @GetMapping
    public ResponseEntity<Object> get(){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Dryelle");
        pessoa1.setSobrenome("Ebelin");
        pessoa1.setEndereco("São Paulo, Brasil");
        pessoa1.setIdade(18);
        pessoa1.setPeso(53);
        pessoa1.setAltura(1.66f);

        return ResponseEntity.ok(pessoa1);
    }
    @GetMapping("/resumo")
    public ResponseEntity<Object> getPessoa(@RequestBody Pessoa pessoa){
        String imc = null;
        int anoNascimento = 0;
        String impostoRenda = null;
        String validaMundial = null;

        if(!pessoa.getNome().isEmpty()) {

            log.info("Iniciando o processo de resumo da pessoa: ", pessoa);

            if(Objects.nonNull(pessoa.getPeso()) && Objects.nonNull(pessoa.getAltura())) {
                log.info("Iniciando o calculo do IMC");
                imc = calculaIMC(pessoa.getPeso(), pessoa.getAltura());
            }

            if(Objects.nonNull(pessoa.getIdade())){
                log.info("Iniciando o calculo do ano de nascimento");
                anoNascimento = calculaAnoNascimento(pessoa.getIdade());
            }

            if(Objects.nonNull(pessoa.getSalario())){
                log.info("Iniciando do calculo do imposto de reda");
                impostoRenda = calculaFaixaImpostoRenda(pessoa.getSalario());
            }

            if(Objects.nonNull(pessoa.getTime())){
                log.info("Validando se o time de coração tem Mundial");
                validaMundial = calculaMundial(pessoa.getTime());
            }

            log.info("Montando objeto de retorno para o front-end.");
            Object resumo = montarRespostaFrontEnd(imc, anoNascimento, impostoRenda, validaMundial);

            return ResponseEntity.ok(resumo);
        }
        return ResponseEntity.noContent().build();
    }

    private Object montarRespostaFrontEnd(String imc, int anoNascimento, String impostoRenda, String validaMundial) {

    }

    private String calculaMundial(String time) {

    }

    private String calculaFaixaImpostoRenda(double salario) {

    }

    private int calculaAnoNascimento(int idade) {

    }

    private String calculaIMC(float peso, float altura) {

    }
}