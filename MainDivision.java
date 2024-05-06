
// Se importa la libreria Scanner
import java.util.Scanner;

// Se declara la clase
public class MainDivision {
    // Se agrega el metodo main
    public static void main(String[] args) {
        // Se llama al metodo Scanner
        Scanner n1 = new Scanner(System.in);
        // Se ingresa el mensaje que se le dara al usuario
        Division d1 = new Division();
        System.out.println("Ingresa un numero");
        // Se almacena el valor del usuario
        d1.setA(n1.nextInt());
        // Se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // Se almacena el valor del usuario
        d1.setB(n1.nextInt());
        // Se imprime el resultado de la operacion y se muestra en pantalla
        System.out.println("el resultado es : ");
        System.out.println(d1.dividir());
        System.out.println(d1);

        d1.getA();
        d1.getB();
        // Se cierra el metodo mian
    }
    // Se cierra clase
}