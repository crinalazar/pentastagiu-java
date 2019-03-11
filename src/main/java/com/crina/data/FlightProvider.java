//package com.crina.data;
//
//import com.crina.model.Flight;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//public class FlightProvider {
//    private static Map<String, Flight> flights = new HashMap<>();
//
//    private FlightProvider() {
//        // it's an utility class, with static methods,
//        // so we use a private constructor to avoid instantiating this class
//    }
//
//
//    //populate initial flights
//    static {
////        String id = UUID.randomUUID().toString();
////        Flight firstFlight = new Flight(id, "First Flight");
////        flights.put(id, firstFlight);
////        id = UUID.randomUUID().toString();
////        Flight secondFlight = new Flight(id, "Second Flight");
////        flights.put(id, secondFlight);
////        id = UUID.randomUUID().toString();
////        Flight thirdFlight = new Flight(id, "Third Flight");
////        flights.put(id, thirdFlight);
//    }
//
//    public static List<Flight> list() {
//        return new ArrayList<>(flights.values());
//    }
//
//    public static Flight create(Flight flight) {
//        String id = UUID.randomUUID().toString();
//        flight.setId(id);
//        flights.put(id, flight);
//        return flight;
//    }
//
//    public static Flight get(String id) {
//        return flights.get(id);
//    }
//
//    public static Flight update(Flight flight) {
//        flights.put(flight.getId(), flight);
//        return flight;
//    }
//
//    public static Flight delete(String id) {
//        return flights.remove(id);
//    }
//}