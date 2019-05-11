package command;

import java.util.ArrayList;

public class RemoteControl {
    private ArrayList<SimpleRemoteControl> onCommand, offCommand;
    private ArrayList<String>name;
    public RemoteControl () {
        onCommand = new ArrayList<>();
        offCommand = new ArrayList<>();
        name = new ArrayList<>();
    }
    public void setCommand (int slot, String commandName, State state) {
        while (slot >= name.size()) name.add(null);
        name.set(slot, commandName);
        while (slot >= onCommand.size()) onCommand.add(null);
        SimpleRemoteControl remoteOn = new SimpleRemoteControl();
        remoteOn.setCommand(new StateOnCommand(state));
        onCommand.set(slot, remoteOn);
        while (slot >= offCommand.size()) offCommand.add(null);
        SimpleRemoteControl remoteOff = new SimpleRemoteControl();
        remoteOff.setCommand(new StateOffCommand(state));
        offCommand.set(slot, remoteOff);
    }

    public void onButtonWasPressed (int slot) {
        System.out.println(name.get(slot));
        onCommand.get(slot).buttonWasPressed();
    }

    public void offButtonWasPressed (int slot) {
        System.out.println(name.get(slot));
        offCommand.get(slot).buttonWasPressed();
    }

}
