public class MausException extends RuntimeException {

    private final int numberOfEyes;

    public MausException(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }
}
