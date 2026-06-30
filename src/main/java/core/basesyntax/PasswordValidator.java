package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        if (repeatPassword == null || password == null) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.\n");
        } else if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords\n");
        } else if (password.length() < 10) {
            throw new PasswordValidationException("Your passwords are incorrect. Try again.\n");
        }
    }
}
