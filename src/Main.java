import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

import static java.lang.System.*;

public class Main {
public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("curso java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("curso js");
    curso2.setDescricao("descricao curso js");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria de java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    out.println(curso1);
    out.println(curso2);
    out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDevsInscritos("Describes Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devVanessa = new Dev();
    devVanessa.setNome("Vanessa");
    devVanessa.inscreverBootcamp(bootcamp);
    out.println("Conteúdos Inscritos Vanessa:" + devVanessa.getConteudosInscritos());
    devVanessa.progredir();
    devVanessa.progredir();
    out.println("-");
    out.println("Conteúdos Inscritos Vanessa:" + devVanessa.getConteudosInscritos());
    out.println("Conteúdos Concluídos Vanessa:" + devVanessa.getConteudosConcluidos());
    out.println("XP:"+ devVanessa.calcularTotalXp());

    out.println("------");

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
    devCamila.progredir();
    devCamila.progredir();
    devCamila.progredir();
    out.println("-");
    out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
    out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
    out.println("XP:"+ devCamila.calcularTotalXp());

}


}

