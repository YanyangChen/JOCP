package javaapplication1;

import java.util.*;

public class ShopData_zh_HK extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
        { "open", new GregorianCalendar(0,0,0,11,00,0) },
        { "close", new GregorianCalendar(0,0,0,23,30,0) },
        { "telephone", "+(852)2332-6544" }
    };
}
