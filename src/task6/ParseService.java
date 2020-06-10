package task6;

public class ParseService {
    public TaskExecutor parseArgs(String[] args) throws NumberFormatException {
        TaskExecutor executor = new TaskExecutor();
        executor.setDays(Integer.parseInt(args[0]));
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            sb.append(args[i] + " ");
        }
        executor.setName(sb.toString());
        return executor;
    }
}
