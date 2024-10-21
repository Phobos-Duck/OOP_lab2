import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш пароль: ");
        String password = scanner.nextLine();

        boolean password_check = Functions.check_password(password);
        if (password_check)
        {
            System.out.println("Пароль соответствует");
        }
        else {
            System.out.println("В пароле не хватает символов");
        }
    }
}
