import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        orderingPizza();
    }

    public static void orderingPizza() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Добро Пожаловать в нашу  пиццерию:");
            System.out.println("""
                    Меню Пиццы:\s
                     1.Маргарита\s
                     2.Гавайская \s
                     3.Пепперони \s
                     4.Четыре сезона\s
                     5.Четыре сыра \s
                     что бы хотите выбрать пишите цифру:\s""");
            String numberPizza = scanner.next();
            System.out.println("Вы заказали пиццу под номером " + numberPizza);
            System.out.println("Если хотите выйти из программы пишите exit");
            String exit = scanner.next();
            if (exit.equalsIgnoreCase("exit")) {
                System.out.println("Спасибо вам");
                break;
            }
        }
    }
}
