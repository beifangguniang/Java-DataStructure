/*
 * 迭代器ADT接口 
 */

package dsa;

public interface Iterator {
    boolean hasNext(); //检查迭代器是否还剩余的元素
    Object getNext(); //返回迭代器中的下一个元素
}