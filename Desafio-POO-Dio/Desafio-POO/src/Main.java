import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Curso Java");
        curso1.setDescricao(" Curso básico de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso JavaScript");
        curso2.setDescricao(" Curso básico de JS");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Mentoria de Java");
        mentoria.setDescricao(" Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos de Fernando: " + devFernando.getConteudosInscritos());
        devFernando.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos de Fernando: " + devFernando.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluídos de Fernando: " + devFernando.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP: " + devFernando.calcularTotalXp());

        System.out.println("--------------------------------------------");
        System.out.println("--------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos de João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos de João: " + devJoao.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("-");
        System.out.println("XP: " + devJoao.calcularTotalXp());





    }
}
