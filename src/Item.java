import java.util.Date;
//Created by: Chris Padgett
//Date: 9/26/18
//Last updated 12/05/18

public interface Item {

  public static final String MANUFACTURER = "OracleProduction";

  public void setProductionNumber(int number);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();

}
