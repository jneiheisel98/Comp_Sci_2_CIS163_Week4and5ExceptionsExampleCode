package week4and5exceptions;

import java.io.FileNotFoundException;

public class myCheckException extends FileNotFoundException {
    private String s;

    public myCheckException(String s) {
        super();
        this.s = s;
    }
}
