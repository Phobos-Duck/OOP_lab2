import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш пароль: ");
        String password = scanner.nextLine();

        while (password.length() < 8)
        {
            System.out.println("Ваш пароль меньше 8 символов. Попробуйте ввести ещё раз");
            password = scanner.nextLine();
        }

        double password_check = Functions.check_password(password);
        if (password_check == 1)
        {
            System.out.println("Пароль соответствует");
        }
        else {
            System.out.println("В пароле не хватает символов");
        }
    }
}
