package chapter6.usingtry;

public class ForgottenException {
    void forget() throws Exception {
        try {
            throw new RuntimeException("Try RuntimeException");
        } catch (RuntimeException e) { //Forgotten exception
            throw new RuntimeException("catch RuntimeException");
        } finally {
            throw new Exception("Finally exception");
        }
    }

    public static void main(String[] args) throws Exception {
        ForgottenException exception = new ForgottenException();
        exception.forget();
    }
}
