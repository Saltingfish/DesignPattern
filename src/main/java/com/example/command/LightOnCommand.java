package com.example.command;

/**
 * Created  by kzp on 2018/7/19
 */
public class LightOnCommand  implements  Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public void undo(){
        light.off();
    }
}
