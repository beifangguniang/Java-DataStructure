/*
 * 当作为参数的数组下标、向量的秩或列表的位置非法时，该异常将被抛出 
 */

 package dsa;

 public class ExceptionPositionInvalid extends RuntimeException {
     public ExceptionPositionInvalid(String err) {
         super(err);
     }
 }