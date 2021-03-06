package com.tts.day3;

import com.tts.day3.abs.Guitar;
import com.tts.day3.abs.Shoe;
import com.tts.day3.abs.Trumpet;
import com.tts.day3.abs.WingTips;
import com.tts.day3.dealership.LightTruck;
import com.tts.day3.dealership.VehicleClassification;
import com.tts.day3.enumeration.Day;
import com.tts.day3.enumeration.EnumTest;
import com.tts.day3.factory.Department;
import com.tts.day3.factory.DepartmentFactory;
import com.tts.day3.factory.DepartmentNames;

import java.util.ArrayList;
import java.util.List;

// a class is a blueprint to create an object
// an object is going to be an instance of class
public class Main {

    //entrypoint
    public static void main(String[] args) {

        System.out.println("==== Vehicle, myGuiter,myTrumpet and Shoe Examples === ");
        // make an instance of vehicle
        Vehicle myVehicle = new Vehicle();
        System.out.println(myVehicle.wheels);

        Guitar myGuiter  = new Guitar();
        Trumpet myTrumpet = new Trumpet();

        System.out.println(myTrumpet.createSound());
        System.out.println(myGuiter.createSound());


        System.out.println("\n======= Shoe =======");

        Shoe myShoe = new Shoe() {
            @Override
            public void getLaces() {
                System.out.println("You have nice laces!!");

            }
        };

        WingTips wingTips = new WingTips();
        wingTips.getLaces();
        wingTips.getLaces();

        System.out.println("\n====== Enums  =====");


        EnumTest weekday = new EnumTest(Day.MONDAY);
        weekday.weekendOrWeekday();

        EnumTest weekend = new EnumTest(Day.SATURDAY);
        weekend.weekendOrWeekday();


        System.out.println("\n ======LightTruck ====");
        LightTruck myLightTruck = new LightTruck(true);
        System.out.println(myLightTruck.transferCase.getNumGears());
        System.out.println();

        //        myLightTruck.transferCase.setNumGears(4);
        System.out.println(myLightTruck.transferCase.getNumGears());

        System.out.println("\n====== Dealership ====");

        /// Set myLightTruck VehicleClassification to NEW
        myLightTruck.setVehicleClassification(VehicleClassification.NEW);

        System.out.println(myLightTruck.getVehicleClassification());


        // We can't access private constructor for VehicleClassification
        // enum constructors have private access by default
        // This method below is illegal
        //VehicleClassification vehicleClassification = new VehicleClassification();

        System.out.println("\n===== Department =====");

        Department serviceDepartment = DepartmentFactory.
                CreateDepartment(DepartmentNames.SERVICE);


        Department financialDepartment = DepartmentFactory.
                CreateDepartment(DepartmentNames.FINANCE);

        Department salesDepartment = DepartmentFactory.
                CreateDepartment(DepartmentNames.SALES);

        List<Department> depts = new ArrayList<>();
        depts.add(serviceDepartment);
        depts.add(financialDepartment);
        depts.add(salesDepartment);














    }
}
