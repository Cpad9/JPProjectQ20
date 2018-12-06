import java.util.ArrayList;
import java.util.Date;

//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18
public abstract class Product implements Item, Comparable<Product> {

  private int serialNumber;
  private Date manufacturedOn;
  private String name;
  private String manufacturer = Item.MANUFACTURER;

  private static int currentProductionNumber = 1;

  Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber++;
    manufacturedOn = new Date();

  }

  //Print method to print array of type of product

  static <T> void printType(ArrayList<T> arrayList, Class c) {
    for (T element : arrayList) {
      if (element.getClass() == c) {
        System.out.println(element);
      }
    }

  }

  public void setProductionNumber(int number) {
    serialNumber = number;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name + "\n";
  }

  @Override
  public int compareTo(Product product) {
    return this.name.compareTo(product.name);
  }

}
