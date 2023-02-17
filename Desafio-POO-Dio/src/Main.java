import java.time.LocalDate;

import desafio.Curso;
import desafio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descrição curso JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JS");
        mentoria1.setDescricao("Descrição Mentoria JS");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(mentoria1);

    }
}
