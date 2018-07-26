package com.example.command;

/**
 * Created  by kzp on 2018/7/19
 */
public class RemotrControlWithUndo {

    Command[] onCommands;

    Command[] offCommands;

    Command undoCommand;//前一个命令将被记录在这里

    public RemotrControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }
        undoCommand = noCommand;//一开始，并没有所谓的"前"一个命令，所以将它设置成NoCommand的对象

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {//当按下按钮，我们取得这个命令并优先执行它，然后将它在undoCommand实例变量中。不管是开或关命令，我们处理方法都一样
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed(){//当按下撤销按钮，我们调用undoCommand实例变量的undo()方法，就可以倒转前一个命令
        undoCommand.undo();
    }

   /* public String toString() {
        return         System.out.println();

    }*/
}
