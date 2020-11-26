package com.java.nine.training.features.factory;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FactoryExample {

    private static final Logger LOGGER = Logger.getLogger(FactoryExample.class.getName());

    public static void main(String[] args) {
        List<String> names = List.of("Adam", "John", "Nancy");
        // Exception in thread "main" java.lang.UnsupportedOperationException
        // Any modification on the collections is not allowed
        //names.add("Paul");
        LOGGER.log(Level.INFO, "Names as List: {0}", names);

        // Exception in thread "main" java.lang.NullPointerException
        // null elements are not allowed in ImmutableCollections
        //List<String> assignatures = List.of("Math", "Biology", null);

        // Element insertion order is not guaranteed.
        Set<String> tasks = Set.of("Cook", "Work", "Read");
        // Exception in thread "main" java.lang.UnsupportedOperationException
        // Any modification on the collection is not allowed.
        // tasks.add("Sleep");
        LOGGER.log(Level.INFO, "Tasks as Set: {0}", tasks);

        // Exception in thread "main" java.lang.NullPointerException
        // null elements are not allowed in ImmutableCollections
        // Set<Double> qualifications = Set.of(2.8d, 3.7d, null);

        // Exception in thread "main" java.lang.IllegalArgumentException: duplicate element: 3.7
        // duplications are not allowed in Immutable Set.
        // Set<Double> qualifications = Set.of(2.8d, 3.7d, 3.7d);

        // Element insertion order is not guaranteed.
        Map<String, Double> studentsAverages = Map.of("Adam", 4.0d, "Nancy", 3.8d, "Sean", 4.0d);
        LOGGER.log(Level.INFO, "Students Averages as Map: {0}", studentsAverages);

        // Exception in thread "main" java.lang.UnsupportedOperationException
        // Any modification on the collection is not allowed.
        // studentsAverages.put("John", 4.7d);

        // Exception in thread "main" java.lang.NullPointerException
        // null values are not allowed for Immutable Maps
        //Map<String, Integer> studentsAges = Map.of("Adam", 15, "Nancy", 14, "John", null);

        // Exception in thread "main" java.lang.NullPointerException
        // null keys are not allowed for Immutable Maps
        // Map<String, Integer> studentsAges = Map.of("Adam", 15, "Nancy", 14, null, 15);

        // Exception in thread "main" java.lang.IllegalArgumentException: duplicate key: Adam
        // duplicated keys are not allowed for Immutable Maps.
        // Map<String, Integer> studentsAges = Map.of("Adam", 15, "Nancy", 14, "Adam", 15);
    }
}
