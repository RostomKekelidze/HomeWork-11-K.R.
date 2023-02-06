import java.time.LocalDate;

public class HomeWork {

    public static void main(String[] args) {
        int year = 2020;
        printInfoAboutYear(year);
        printInfoAboutVersion(0, 2023);
        int deliveryDistance = 40;
        System.out.println("Задача 3");
        int days = calculatedDeliveriDays(deliveryDistance);
        if (days == -1) {
            System.out.println("Доставка невозможна на растояние " + deliveryDistance + "км");
        } else {
            System.out.println("Время доставки " + days + "дней");
        }
    }

    private static int calculatedDeliveriDays(int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }

    }

    private static void printInfoAboutVersion(int os, int productionYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        StringBuilder result = new StringBuilder("Установите ");
        if (productionYear < currentYear) {
            result.append("облегченную версию для");
        } else {
            result.append("версия для ");
        }
        if (os == 0) {
            result.append("IOS");
        } else {
            result.append("Android");
        }
        System.out.println(result);

    }

    private static void printInfoAboutYear(int year) {
        System.out.println("Задача 1");
        if (isLeapYear(year)) {
            System.out.println(year + "Год является високостным");
        } else {
            System.out.println(year + "Год не является високостным");
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}





