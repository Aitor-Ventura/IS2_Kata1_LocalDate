import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    public static void main(String[] args) throws Exception {
        Person aitor = new Person("Aitor Ventura Delgado", LocalDate.of(2000, Month.JULY, 14));
        System.out.println("El nombre completo de Aitor es " + aitor.getName() + 
                           ", tiene " + aitor.getAge() + 
                           " años y su fecha de nacimiento es " + aitor.getBirthdate());
    }
}
