package task4;

public class PasswordSample {
    private final String sample = "qwerty";

    public String comparePassword(String password) {
        StringBuilder message = new StringBuilder("Password ");
        if (password.compareTo(sample) == 0) {
            message.append("matches ");
        } else {
            message.append("doesn't match ");
        }
        message.append("the sample!");
        return message.toString();
    }
}
