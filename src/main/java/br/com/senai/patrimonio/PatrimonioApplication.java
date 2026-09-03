package br.com.senai.patrimonio;

import br.com.senai.patrimonio.avaliacao.Evento;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.model.Empresa;
import br.com.senai.patrimonio.model.Endereco;
import br.com.senai.patrimonio.model.Funcionario;
import br.com.senai.patrimonio.model.Sala;
import br.com.senai.patrimonio.model.enums.Cargo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Participante participante = new Participante("Gabriel", "gabriel@gmail.com", "48988445478", "00324123", Nivel.AVANCADO);
		System.out.println("participante: " + participante.getNome() +", "+ participante.getMatricula() +", "+ participante.getEmail() +", "+ participante.getTelefone() +", "+ participante.getNivel());
	}

}
