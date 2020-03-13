package com.aaron.design.pattern.creational.prototype;

import java.util.HashMap;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ProtoTypeManager {

    private HashMap<String, Shape> ht = new HashMap<String, Shape>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addShape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return temp.clone();
    }
}
