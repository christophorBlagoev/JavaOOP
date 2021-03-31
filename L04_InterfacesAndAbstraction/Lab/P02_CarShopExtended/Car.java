package Lab.P02_CarShopExtended;
/* @created by Ch.B. on 22-Mar-21 - 19:09 */

import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();
}
