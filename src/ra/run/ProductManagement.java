package ra.run;

import ra.bussinessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> productArray = new ArrayList<>();
        int option;
        do {
            System.out.println("****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                    "1. Nhập số sản phẩm và nhập thông tin sản phẩm\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "3. Sắp xếp sản phẩm theo lợi nhuận tăng dần\n" +
                    "4. Xóa sản phẩm theo mã sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên sản phẩm\n " +
                    "6. Thay đổi trạng thái của sản phẩm theo mã sản phẩm\n " +
                    "7. Thoát\n");
            System.out.print("Vui lòng chọn 1 lựa chọn ");
            option = input.nextInt();
            int size = 0;

            switch (option) {
                case 1:
                    //Nhập thông tin sản phẩm
                    System.out.print("Enter number of Product: ");
                    size = input.nextInt();
                    inputProductInfo(productArray, size);
                    break;
                case 2://Hiển thị thông tin sản phẩm
                    printProductInfo(productArray);
                    break;
                case 3: //Hển thị tăng dần
                    SortProduct(productArray);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Bạn đã thoát khỏi chương trình ");
                    System.exit(0);
                    break;
            }
        } while (option != 7);
    }

    //Option 1: Nhập thông tin sản phẩm
    public static void inputProductInfo(ArrayList<Product> productArray, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter information for Product no. " + (i + 1));
            productArray.add(new Product());
            productArray.get(i).inputData();
        }
    }

    //    Option 2: Hiển thị thông tin sản phẩm
    public static void printProductInfo(ArrayList<Product> productArray) {
        for (int i = 0; i < productArray.size(); i++) {
            productArray.get(i).displayData();
        }
    }
//    Option3: Sắp xếp sản phẩm theo interest
    public static void SortProduct(ArrayList<Product> productArray){
    Collections.sort(productArray);
    }
}
