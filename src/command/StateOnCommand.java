package command;

public class StateOnCommand implements Command {
    State state;

    public StateOnCommand(State state) {
        this.state = state;
    }

    @Override
    public void execute() {
        state.on();
    }
}
