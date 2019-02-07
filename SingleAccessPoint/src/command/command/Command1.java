package command.command;

@FunctionalInterface
public interface Command1<E> {
    Object execute(E arg) throws Exception;
}
