
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
        int a = n1.nextInt();
        // Se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // Se almacena el valor del usuario
        int b = n1.nextInt();
        // Se hace la operacion con los datos ingresados por el usuario
        int r = a / b;
        // Se imprime el resultado de la operacion y se muestra en pantalla
        d1.a=a;
        d1.b=b;
        d1.dividir(a, b);
        System.out.println("el resultado es :"+ d1.dividir(a, b));

        // Se cierra el metodo mian
    }
    // Se cierra clase
}