import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int edad;
System.out.println("Ingrese su edad: ");
edad = sc.nextInt();
if (edad > 18){
    System.out.println("Eres mayor de edad");
}
else {
    System.out.println("Usted aún no es maor de edad");
}
}
sc.close();

}
