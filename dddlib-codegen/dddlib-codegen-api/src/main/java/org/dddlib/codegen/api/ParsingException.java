package org.dddlib.codegen.api;

/**
 * Created by yyang on 2016/12/21.
 */
public class ParsingException extends RuntimeException {
    public ParsingException() {
    }

    public ParsingException(String message) {
        super(message);
    }

    public ParsingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParsingException(Throwable cause) {
        super(cause);
    }
}
