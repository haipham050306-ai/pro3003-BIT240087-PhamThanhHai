/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong3.mavenproject9;

/**
 *
 * @author Admin
 */
   import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 

// Tạo class Employee
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class bai3 {
    public static void main(String[] args) {
        // Tạo danh sách 4 nhân viên với mức lương khác nhau
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Tran Thi C", 900),
            new Employee(2, "Nguyen Van A", 1500),
            new Employee(3, "Pham Dinh D", 800),
            new Employee(4, "Le Van B", 1200)
        );

        // Sử dụng Stream API
        List<String> highSalaryNames = employees.stream()
            // 1. Lọc nhân viên có lương > 1000
            .filter(emp -> emp.getSalary() > 1000)
            // Lấy ra tên của nhân viên (chuyển đổi Employee -> String)
            .map(Employee::getName)
            // 2. Sắp xếp tên theo thứ tự Alpha-beta
            .sorted()
            // 3. Gom kết quả về một List
            .collect(Collectors.toList());

        // In kết quả
        System.out.println("Danh sách nhân viên có lương > 1000 (đã sắp xếp):");
        highSalaryNames.forEach(System.out::println);
    }
}
    

