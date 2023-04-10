import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Aprenda tudo sobre Java");
        curso.setCargaHoraria(90);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Aprenda tudo sobre C#");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Ajudando a entender sobre Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de C#");
        mentoria2.setDescricao("Ajudando a entender sobre C#");
        mentoria2.setData(LocalDate.of(2023, 4, 15));

        Curso cursoOnline = new Curso();
        cursoOnline.setTitulo("Novo curso online sobre Python");
        cursoOnline.setDescricao("Aprenda tudo sobre Python");
        cursoOnline.setCargaHoraria(60);


//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Varias Linguagens");
        bootcamp.setDescricao("Diversos conhecimentos sobre diversas linguagens");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(cursoOnline);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        devAlexandre.progredir();
        devAlexandre.progredir();
        System.out.println("*____*");
        System.out.println("Conteudos Inscritos Alexandre: " + devAlexandre.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Alexandre: " + devAlexandre.getConteudosConcluidos());
        System.out.println("XP:" + devAlexandre.calcularXP());

        Dev devLiz = new Dev();
        devLiz.setNome("Liz");
        devLiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Liz: " + devLiz.getConteudosInscritos());
        devLiz.progredir();
        devLiz.progredir();
        System.out.println("*____*");
        System.out.println("Conteudos Inscritos Liz: " + devLiz.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Liz: " + devLiz.getConteudosConcluidos());
        System.out.println("XP:" + devLiz.calcularXP());
    }
}