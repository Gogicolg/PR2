// Клас Працівник
public final class Worker {
    // Поля
    private final String surnameAndInitsials; // Фамілія і ініціали
    private final String position; // Посада
    private final int yearOfEmployment; // Рік прибуття на роботу
    private final double salary; // Зарплата

    // Конструктор
    public Worker(String surnameAndInitsials, String position, int yearOfEmployment, double salary) {
        this.surnameAndInitsials = surnameAndInitsials;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = salary;
    }

    // гетери
    public String getsurnameAndInitsials() {
        return surnameAndInitsials;
    }

    public String getposition() {
        return position;
    }

    public int getyearOfEmployment() {
        return yearOfEmployment;
    }

    public double getSalary() {
        return salary;
    }

    //вивід
    public void printInfo() {
        System.out.println("Фамілія і ініціали: " + surnameAndInitsials);
        System.out.println("Посада: " + position);
        System.out.println("Рік прибуття на роботу: " + yearOfEmployment);
        System.out.println("Зарплата: " + salary);
        System.out.println();
    }
}



