/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitapchuong3.mavenproject9;

/**
 *
 * @author Admin
 */


    

// 1. Tạo interface MessageService (đặt bên ngoài class chính)
interface MessageService {
    void sendMessage(String message);
}

// 2. Tạo lớp implement: EmailService
class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Đang gửi Email: " + message);
    }
}

// 2. Tạo lớp implement: SMSService
class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Đang gửi SMS: " + message);
    }
}

// 3. Tạo lớp Notification sử dụng Setter Injection
class Notification {
    private MessageService messageService;

    // Phương thức Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyMessage(String message) {
        if (messageService != null) {
            messageService.sendMessage(message);
        } else {
            System.out.println("Lỗi: Chưa cấu hình dịch vụ gửi tin nhắn!");
        }
    }
}

// 4. Class chính chứa hàm main (Phải có chữ public và tên khớp với file bai2.java)
public class bai2 {
    public static void main(String[] args) {
        Notification notification = new Notification();

        System.out.println("--- Demo Setter Injection ---");
        
        // Inject EmailService và gửi
        notification.setMessageService(new EmailService());
        notification.notifyMessage("Thông báo hệ thống đã được cập nhật!");

        // Thay đổi dependency sang SMSService và gửi
        notification.setMessageService(new SMSService());
        notification.notifyMessage("Mã OTP của bạn là 123456.");
    }
}

