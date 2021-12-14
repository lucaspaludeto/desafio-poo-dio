import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso Java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lucas" + devLucas.getConteudosInscritos());


        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Lucas" + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lucas" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devLucas.calcularTotalXP());

        System.out.println("-----------");

        Dev devKarina = new Dev();
        devKarina.setNome("Karina");
        devKarina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Karina" + devKarina.getConteudosInscritos());
        devKarina.progredir();
        devKarina.progredir();
        devKarina.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Karina" + devKarina.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + devLucas.getConteudosConcluidos());
        System.out.println("XP:" + devKarina.calcularTotalXP());
    }
}
