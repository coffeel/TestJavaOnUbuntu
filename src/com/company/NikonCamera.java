package com.company;

/**
 * Created by xue on 16-7-3.
 */
public class NikonCamera implements ICamera {
    @Override
    public void takePhoto() {
        System.out.println("Nikon photo taken");
    }
}
