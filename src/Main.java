import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String myVariablableName;
        final int NUM = 1;
        String word = "Hello";
        myVariablableName = (NUM + "myVariablableName");
        System.out.println(myVariablableName);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрициательное число");
        } else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String userName = scanner.nextLine();
        System.out.println("Привет," + userName + "!");
    }
}
