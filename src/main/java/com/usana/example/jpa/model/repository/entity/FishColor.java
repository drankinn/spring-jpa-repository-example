package com.usana.example.jpa.model.repository.entity;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

/**
 * User: lancea10
 * Date: 4/3/12
 * Time: 6:18 PM
 */
public enum FishColor {
    YELLOW ("00FFFF"),
    RED    ("FF0000"),
    GREEN  ("00FF00"),
    BLUE   ("0000FF");

    private final String color;
    FishColor(String hexColor){
        this.color = hexColor;
    }
}
