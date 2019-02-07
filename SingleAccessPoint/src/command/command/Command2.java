package command.command;

@FunctionalInterface
public interface Command2<E,F> {
    Object execute(E arg1, F arg2) throws Exception;
}
