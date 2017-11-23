package javaapplication1;

import java.util.*;

public class ShopData_de extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
        { "open", new GregorianCalendar(0,0,0,11,00,0) },
        { "close", new GregorianCalendar(0,0,0,20,00,0) },
        { "telephone", "+49-89-23326-54" }
    };
}
