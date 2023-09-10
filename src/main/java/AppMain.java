import domain.Employee;
import services.clients.FactoryEmployee;
import services.clients.FactoryEmployeeAdapter;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    static List<Employee> employees = new ArrayList<>();
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petr", "Ivanov");
        Employee emp2 = new Employee("Vasyz", "Sidorov");
        FactoryEmployee factoryEmployee = new FactoryEmployee("Ivan", "Zavodov");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(new FactoryEmployeeAdapter(factoryEmployee));

        printList(employees);


    }

    static void printList(List<Employee> employees) {
        employees.forEach(employee -> System.out.println(String.format("Id: %s; Name: %s; Last Name: %s", employee.getId(), employee.getName(), employee.getLastName())));
    }
}

