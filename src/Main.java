import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO");
        curso1.setDescricao("java e orientação a objetos");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Spring");
        curso2.setDescricao("framework Spring para microserviços");
        curso2.setCargaHoraria(4);
        Conteudo curso3 = new Curso(); // polimorfismo, intancia especifica a partir de uma classe abstrata(genérica)

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Carreira em Java");
        mentoria1.setDescricao("guiando no roadmap da carreira em java");
        mentoria1.setData(LocalDate.now());//.now pega a data de criação

        /*
        System.out.println(curso1+"\n"+curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Imersão Java Developer");
        bootcamp1.setDescricao("45 dias de imersão total em Java para Web");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Daniel");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcular());

        System.out.println("\n------------------------\n");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp1);
        dev2.progredir();
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcular());


    }
}
