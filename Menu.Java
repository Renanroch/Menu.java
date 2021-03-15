import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

public static void menu() {

System.out.println(" MENU ");

System.out.println("       ESCOLHA    ");
System.out.println(" 1.    Cadastrar  ");
System.out.println(" 2.    Editar     ");
System.out.println("      3. Sair          ");
}

public static void main(String[] args) {
int opcao;
boolean sair = true;
Scanner menu = new Scanner(System.in);
do {
try {
menu();
opcao = menu.nextInt();

switch(opcao) {
case 1:
System.out.println("Cadastrar");
sair = true;
break;
case 2:
System.out.println("Editar");
sair = true;
break;
case 3:
System.out.println("Sair");
sair = false;
break;
default:
System.out.println("Seleção inválida");
sair = true;
}
} catch (InputMismatchException e) {
System.out.println("Só é permitido números");
}
} while (sair);
}
}
