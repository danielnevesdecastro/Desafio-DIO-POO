import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Carreira em Java");
        mentoria1.setDescricao("guiando no roadmap da carreira em java");
        mentoria1.setData(LocalDate.now());//.now pega a data de criação

        System.out.println(curso1+"\n"+curso2);
        System.out.println(mentoria1);


    }
}
