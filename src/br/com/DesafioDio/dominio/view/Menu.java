package br.com.DesafioDio.dominio.view;

import br.com.DesafioDio.dominio.model.Bootcamp;
import br.com.DesafioDio.dominio.model.Curso;
import br.com.DesafioDio.dominio.model.Dev;
import br.com.DesafioDio.dominio.model.Mentoria;

import java.time.LocalDate;

public class Menu {
    public static void menu(){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());
        mentoria.setXpMentoria(50d);

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.imprimirConteudosInscritos();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        devCamila.imprimirConteudosInscritos();
        devCamila.imprimirConteudosConcluidos();
        devCamila.imprimirXp();

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.imprimirConteudosInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        devJoao.imprimirConteudosInscritos();
        devJoao.imprimirConteudosConcluidos();
        devJoao.imprimirXp();

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        devPaula.imprimirConteudosInscritos();
        devPaula.progredirTodos();
        System.out.println("-");
        devPaula.imprimirConteudosInscritos();
        devPaula.imprimirConteudosConcluidos();
        devPaula.imprimirXp();
    }

}
