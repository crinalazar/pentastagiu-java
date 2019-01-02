package Bluetooth;

import java.util.ArrayList;
import java.util.List;

public class BluetoothMain {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList();


        Objects phone = new Phones( "Samsung" );
        Objects refrigerator = new SmartRefrigerators( "Arctic" );
        Objects car = new Cars( "Audi" );
        Objects student = new Student( "Bogdan" );


        objects.add( phone );
        objects.add( refrigerator );
        objects.add( car );
        objects.add( student );

        for ( int i =0; i < objects.size(); i++) {

            if (objects.get( i ) instanceof Cars) {
                ((Cars) objects.get( i )).connectToBluetooth();
            }
            if (objects.get( i ) instanceof  SmartRefrigerators) {
                ((SmartRefrigerators)objects.get( i )).connectToBluetooth();
            }
            if (objects.get( i ) instanceof  Phones) {
                ((Phones)objects.get( i )).connectToBluetooth();
            }
            if (objects.get( i ) instanceof  Student) {
                ((Student)objects.get( i )).connectToBluetooth();
            }
        }

        }






    }

