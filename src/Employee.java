/*
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 */
public class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(this);
    }
// Создать массив из 5 сотрудников.
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
             persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan","892312312", 30000, 30);
             persArray[1] = new Employee("Petrov Petya", "QA", "petpet", "892312310", 60000, 36);
             persArray[2] = new Employee("Bokova Katya", "Manager", "bokka", "892312323", 60000, 41);
             persArray[3] = new Employee("Smirnov Vasya", "Trainee", "smirvasya", "892312322", 30000, 25);
             persArray[4] = new Employee("Sidorov Oleg", "Product Manager", "sidol", "892312344", 60000, 32);

// С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].info();
        }
    }