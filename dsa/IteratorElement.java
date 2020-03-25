/*
 * 基于列表实现的元素迭代器 
 */

package dsa;

public class IteratorElement implements Iterator {
    private List list; //列表
    private Position nextPosition; //当前（下一个）元素的位置

//默认构造方法
    public IteratorElement() {
        list = null;
    }

//构造方法
    public IteratorElement(List L) {
    list = L;
    if (list.isEmpty()) //若列表为空，则
       nextPosition = null; //当前位置置空
    else //否则
       nextPosition = list.first(); //从第一个元素开始
    }

//从检查迭代器中是否还有剩余的元素
    public boolean hasNext() {
    return(null != nextPosition);
    } 

//返回迭代器中的下一元素
    public Object getNext() throws ExceptionNoSuchElement {
        if (!hasNext()) throw new ExceptionNoSuchElement("异常：没有下一元素");
           Position currentPosition = nexPosition;
        if (currentPosition == list.last()) //若已到达尾元素，则
           nextPosition = null; //不再有下一个元素
        else //否则
           nextPosition = list.getNext(currentPostition); //转向下一元素
        return currentPosition.getElem();
    }
}