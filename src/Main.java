public class Main {
    public static void main(String[] args) {
        ////////////TASK1//////////
        System.out.println("////////////TASK1//////////");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }


    {////////////TASK2//////////
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("////////////TASK1//////////");

        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);
    }

    { ////////////TASK3//////////
        System.out.println("////////////TASK3//////////");
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
    }
}
