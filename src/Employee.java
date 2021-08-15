public class Employee
{
    String fullName;
    String position;
    String email;
    String phoneNumber;
    float salary;
    int age;

     public Employee(String fullName,
                     String position,
                     String email,
                     String phoneNumber,
                     float salary,
                     int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    void printInfo()
    {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Тел.: " + phoneNumber);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static class Main
    {
        public static void main(String[] args)
        {
            Employee[] employees =
                    {
                    new Employee(
                            "Пушкин Иван Адамович",
                            "Инженер",
                            "engi007@gmail.com",
                            "+1-111-111-11-11",
                            100,
                            55),
                    new Employee(
                            "Некрасов Фёдор Иванович",
                            "Менеджер",
                            "adm007@gmail.com",
                            "+2-222-222-22-22",
                            200,
                            44),
                    new Employee(
                            "Жуковский Михаил Ромеович",
                            "Уборщик",
                            "clar007@gmail.com",
                            "+3-333-333-33-33",
                            300,
                            33),
                    new Employee(
                            "Борщ Игнат Александрович",
                            "Слесарь",
                            "sles007@gmail.com",
                            "+4-444-444-44-44",
                            400,
                            22),
                    new Employee(
                            "Романова Елизавета Петровна",
                            "Бухгалтер",
                            "buh007@gmail.com",
                            "+5-555-555-55-55",
                            500,
                            11)
            };
            int minAge = 40;
            for (Employee employee : employees) {
                if (employee.age > minAge) {
                    employee.printInfo();
                    System.out.println();
                }
            }
        }
    }
}



