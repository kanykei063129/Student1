import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kanykei", 16, Gender.F, new BigDecimal(3452), "Akjoltoi kyzy");
        Student student1 = new Student("Adil", 18, Gender.M, new BigDecimal(4564), "Aitbaev");
        Student student2 = new Student("Erlan", 21, Gender.M, new BigDecimal(678), "Buzurmanaliev");
        Student student3 = new Student("Aiderim", 17, Gender.F, new BigDecimal(87), "Bektenova");
        List<Student> students = new LinkedList<>();
        System.err.println("А дан башталгандар");students.stream().filter(s -> s.getName().startsWith("А")).forEach(System.out::println);
        System.err.println("жашы 15 тен чон жана акчасы 2000 ден коп");
        students.stream().filter(s -> s.getAge()>15 && s.getMoney().intValue()>2000).forEach(System.out::println);
        System.err.println("Эн коп акчасы бар студент");
        Optional<Student> max = students.stream().max(Comparator.comparing(Student :: getMoney));
        System.out.println(max);
        System.out.println("Эн акчасы коп кыз");
        Optional<Student> max1 = students.stream().filter(s -> s.getGender().equals(Gender.F)).max(Comparator.comparing(Student::getMoney));
        System.out.println(max1);
        System.out.println("Баардык студенттердин аты");
        students.stream().map(Student::getName).forEach(System.out::println);
        System.out.println("Бардык студеттердин акчасына 1000 сомдон кошуу");
        students.stream().map(s -> s.getMoney().intValue()+1000).forEach(System.out::println);
        System.out.println("Биринчи турган студент");
        System.out.println(students.stream().findFirst());
        System.out.println("Канча студент бар экен чыгаруу");
        System.out.println((long) students.size());
        List<Student> boys = students.stream().filter(s -> s.getGender().equals(Gender.M)).toList();
        List<Student> girls = students.stream().filter(s -> s.getGender().equals(Gender.F)).toList();
        System.out.println("boys\n"+boys);
        System.out.println("gris\n"+girls);

    }
}



