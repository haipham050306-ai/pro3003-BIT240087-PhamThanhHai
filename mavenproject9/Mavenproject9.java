/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitapchuong3.mavenproject9;

/**
 *
 * @author Admin
 */

public class Mavenproject9 {

  



    // Phương thức tĩnh nhận vào mảng của bất kỳ kiểu đối tượng nào E[]
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong mảng
    }

    // Hàm main để kiểm thử
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "C#", "Python", "JavaScript"};

        System.out.print("Mảng Integer: ");
        printArray(intArray);

        System.out.print("Mảng String: ");
        printArray(stringArray);
    }
}
