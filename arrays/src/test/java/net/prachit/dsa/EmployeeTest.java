package net.prachit.dsa;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {


    class Employee{
        String name;
        int salary;
        String dept;
        int id;

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        public String getDept() {
            return dept;
        }

        public int getId() {
            return id;
        }

        public Employee(String name, int salary, String dept, int id) {
            this.name = name;
            this.salary = salary;
            this.dept = dept;
            this.id = id;
        }
    }

    @Test
    void test() {
        System.out.println(avgDept(Arrays.asList( new Employee("A",100,"D1",1)
                , new Employee("B",200,"D1",1) ,
                new Employee("C",300,"D2",1)),"D1"));
    }

    Double avgDept(List<Employee> employees, String department) {
         //return  employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingInt(Employee::getSalary)));
         return  employees.stream().filter(e -> e.getDept().equalsIgnoreCase(department)).collect(Collectors.averagingInt(Employee::getSalary));
    }

    public int getSecondHighest(int []a){
        int max = Math.max(a[0],a[1]);
        int secondMax = Math.min(a[0],a[1]);

        for (int i = 2; i < a.length; i++) {
            if(a[i] > max){
                secondMax =max;
                max = a[i];
            }else if (secondMax < a[i]){
                secondMax = a[i];
            }
        }

        return secondMax;
    }

    @Test
    void secondMaxTest() {
        System.out.println(getSecondHighest(new int[]{1,2,4,3}));
    }
}
