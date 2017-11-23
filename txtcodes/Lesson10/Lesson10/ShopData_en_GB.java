package javaapplication1;

import java.util.*;

public class ShopData_en_GB extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
        { "open", new GregorianCalendar(0,0,0,10,00,0) },
        { "close", new GregorianCalendar(0,0,0,20,00,0) },
        { "telephone", "+44-20-2332-6544" }
    };
}
