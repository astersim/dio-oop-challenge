import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);
    }
}