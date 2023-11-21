public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Іванов І.І.", "Директор", 2018, 50000.0);
        workers[1] = new Worker("Петров П.П.", "Бухгалтер", 2019, 30000.0);
        workers[2] = new Worker("Сидоров С.С.", "Програміст", 2020, 40000.0);
        workers[3] = new Worker("Коваленко К.К.", "Менеджер", 2021, 35000.0);
        workers[4] = new Worker("Шевченко Ш.Ш.", "Адміністратор", 2021, 25000.0);

        int year = 2;
        double salary = 30000.0;
        String position = "Програміст";

        System.out.println("Список працівників, етап роботи яких на даному підприємстві старше " + year + " роки:");
        for (Worker p : workers) {
            if (2023 - p.getyearOfEmployment() > year) {
                p.printInfo();
            }
        }

        System.out.println("Список працівників, зарплата яких більше " + salary+ " грн:");
        for (Worker p : workers) {
            if (p.getSalary() > salary) {
                p.printInfo();
            }
        }

        System.out.println("Список працівників, які займають посаду " + position + ":");
        for (Worker p : workers) {
            if (p.getposition().equals(position)) {
                p.printInfo();
            }
        }
    }
}