package com.company;

import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException, ClassNotFoundException, JsonMappingException {
	// write your code here
        Configuration configuration=Configuration.loadConfiguration(args[0]);
        String location=configuration.getLocation();
        URL url=new URL(location);
        URLClassLoader ucl=new URLClassLoader(new URL[]{url});
        Class<ICameraFactory> cls=(Class<ICameraFactory>)Class.forName(configuration.getFactoryType(),true,ucl);
        ICameraFactory cameraFactory=cls.newInstance();
        ICamera camera=cameraFactory.createCamera();

        camera.takePhoto();
    }
}
