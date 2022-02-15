package me.softwarecraftsman.lox;

import java.util.HashMap;
import java.util.Map;

class Environment {
    private final Map<String, Object> values = new HashMap();
   
    void define(String name, Object value) {
        values.put(name, value);
    }
}