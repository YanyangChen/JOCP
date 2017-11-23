package javaapplication1;

import java.util.*;

public class ShopData_ja extends ListResourceBundle {
    public Object[][] getContents() {
        return contents;
    }

    private Object[][] contents = {
        { "open", new GregorianCalendar(0,0,0,9,00,0) },
        { "close", new GregorianCalendar(0,0,0,21,00,0) },
        { "telephone", "+81-80-2332-6544" }
    };
}
