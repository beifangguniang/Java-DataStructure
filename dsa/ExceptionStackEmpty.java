/*
  * 当试图对空栈应用pop或者top方法时，本意外将被抛出 
 */

package dsa;

public class ExceptionStackEmpty extends RuntimeException {
    public ExceptionStackEmpty(String err) {
        super(err);
    }
}