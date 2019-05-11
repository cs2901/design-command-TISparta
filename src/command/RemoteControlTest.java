package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Living Room
        State livingRoomLight;
        livingRoomLight = new State("light");
        remoteControl.setCommand(0, "Living room", livingRoomLight);

        // Kitchen room
        State kitchenRoomLight;
        kitchenRoomLight = new State("light");
        remoteControl.setCommand(1, "Kitchen room", kitchenRoomLight);

        // Ceiling fan
        State ceilingFanState;
        ceilingFanState = new State("fan");
        remoteControl.setCommand(2, "Ceiling fan", ceilingFanState);

        // Garage door
        State garageDoor;
        garageDoor = new State("door");
        remoteControl.setCommand(3, "Garage door", garageDoor);

        // Stereo
        State stereo;
        stereo = new State("stereo");
        remoteControl.setCommand(4, "Stereo", stereo);

        // Living room lights tests
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        // Kitchen room lights tests
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);

         // Ceiling fan tests
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);

        // Garage door tests
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);

        // Stereo tests
        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);

    }
}
