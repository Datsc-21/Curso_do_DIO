package br.com.dio.expcetion;

public class NotFoundsEnoughException extends RuntimeException {
    public NotFoundsEnoughException(String message) {
        super(message);
    }
}
