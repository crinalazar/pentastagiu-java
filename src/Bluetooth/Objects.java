package Bluetooth;

import java.util.ArrayList;
import java.util.List;

public class Objects implements Connectable{

    String name;

    Objects (String name) {
        this.name = name;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress..." + name);
    }


}
