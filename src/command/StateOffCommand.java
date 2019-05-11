package command;

public class StateOffCommand implements Command {
    State state;

    public StateOffCommand(State state) {
        this.state = state;
    }

    @Override
    public void execute() {
        state.off();
    }
}