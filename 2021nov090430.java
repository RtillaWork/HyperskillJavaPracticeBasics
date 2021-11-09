import java.util.Optional;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();        
        Optional<String> value = reader.getValue();
        if (value.isPresent()) {
            System.out.println("Value is present: " + value.get());
        } else {
            System.out.println("Value is empty");
        }
    }
}

class InputStringReader {
    public Optional<String> getValue() {
        // implement
        final String EMPTY_STRING = "empty";
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if (EMPTY_STRING.equals(line)) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(line);
        }

    }
}
