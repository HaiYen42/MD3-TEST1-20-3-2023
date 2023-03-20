package ra.bussinessImp;

import ra.bussiness.IProduct;

import java.util.Comparator;
import java.util.Scanner;

public class Product implements IProduct, Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, float importPrice, float exportPrice, float interest, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest() {
        this.interest = (this.exportPrice- this.importPrice);
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData() {
        Scanner input= new Scanner(System.in);
        System.out.print("\nEnter Product Id ");
        this.setProductId(Integer.parseInt(input.nextLine()));
        System.out.print("Enter Product Name: ");
        this.setProductName(input.nextLine());
        System.out.print("Enter Product title: ");
        this.setTitle(input.nextLine());
        System.out.print("Enter Product description: ");
        this.setDescriptions(input.nextLine());
        System.out.print("Enter Product Import Price: ");
        this.setImportPrice(input.nextFloat());
        System.out.print("Enter Product Export Price: ");
        this.setExportPrice(input.nextFloat());
        System.out.print("Enter Product Status: ");
        this.setProductStatus(input.nextBoolean());

    }

    @Override
    public void displayData() {
        setInterest();
        System.out.println(
                "Product{" +
                "productId=" + productId +
                ", productName='" + getProductName() + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + getDescriptions() + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + this.interest +
                ", productStatus=" + (productStatus?"còn hàng":"hết hàng") +
                '}');
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + this.productName + '\'' +
                ", title='" + title + '\'' +
                ", descriptions='" + getDescriptions() + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + this.interest +
                ", productStatus=" + productStatus +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        int temp= (int) (this.getInterest()-o.getInterest());
        return temp;
    }
}
