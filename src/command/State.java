package command;

public class State {
    private boolean isOn = false;
    private String name;
    public State (String name) { this.name = name; }
    public void  on(){
        isOn = true;
        String state = new String("");
        if (name.equals("light")) state = "on";
        if (name.equals("door")) state = "open";
        if (name.equals("fan")) state = "high";
        if (name.equals("stereo")) state = "on";
        System.out.println(name + " is "+ state);
    }

    public void off(){
        isOn = false;
        String state = new String("");
        if (name.equals("light")) state = "off";
        if (name.equals("door")) state = "closed";
        if (name.equals("fan")) state = "low";
        if (name.equals("stereo")) state = "off";
        System.out.println(name + " is "+ state);
    }

}
