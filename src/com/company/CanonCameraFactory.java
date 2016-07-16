package com.company;

/**
 * Created by xue on 16-7-3.
 */
public class CanonCameraFactory implements ICameraFactory {

    @Override
    public ICamera createCamera() {
        return new CanonCamera();
    }
}
