package ru.klokov.restguitarproject.controller.admin.response;

public class Response {
    String message;
    String error;
    String errorMessage;

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", error='" + error + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Response(String message, String error, String errorMessage) {
        this.message = message;
        this.error = error;
        this.errorMessage = errorMessage;
    }
}
