import generics.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(00001, "Jason Borne");
        SalariedEmployee salEmployee = new SalariedEmployee(00002, "James Bond", 1000001.01);
        GenericClass<Employee> genericClassEmp = new GenericClass<>(employee);
        GenericClass<SalariedEmployee> genericClassSalEmp = new GenericClass<>(salEmployee);

        genericClassEmp.displayEmployeeDetails();
        genericClassSalEmp.displayEmployeeDetails();

        GenericInterface<Employee> genericInterface = new GenericInterfaceImpl<>();
        genericInterface.print(employee);

        List<Employee> genericEmployeeList = Arrays.asList(employee, salEmployee);
        System.out.println("List of Employees:");
        GenericMethod.printList(genericEmployeeList);
    }
  }