package com.example.command;

/**
 * Created  by kzp on 2018/7/19
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println(getClass().getMethods()+"NoCommand");
    }

    @Override
    public void undo() {
        System.out.println("NoCommand");

    }
}
