package com.example.command;

/**
 * Created  by kzp on 2018/7/19
 */
public class LightOffCommand implements  Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo(){
        light.on();
    }
}
