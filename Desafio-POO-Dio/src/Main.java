import java.time.LocalDate;

import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
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

        // System.out.println(curso);
        // System.out.println(curso1);
        // System.out.println(mentoria);
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAngelo = new Dev();
        devAngelo.setNome("Ângelo");
        devAngelo.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " + devAngelo.getNome() + " " + devAngelo.getConteudosInscritos());
        devAngelo.progredir();
        devAngelo.progredir();
        System.out.println("\nConteúdos inscritos " + devAngelo.getNome() + " " + devAngelo.getConteudosInscritos());
        System.out.println("\nConteúdos concluidos " + devAngelo.getNome() + " " + devAngelo.getConteudosConcluidos());
        System.out.println("XP: " + devAngelo.calcularTotalXP());

        System.out.println("-------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos " + devJoao.getNome() + " " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("\nConteúdos inscritos " + devJoao.getNome() + " " + devJoao.getConteudosInscritos());
        System.out.println("\nConteúdos concluidos " + devJoao.getNome() + " " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());


    }
}
