/* 
 * 队列接口
*/

package dsa;

public interface Queue {
    public int getSize();//返回队列中的元素数目
    public boolean isEmpty();//判断队列是否为空
    public Object front() throws ExceptionQueueEmpty;//取队首元素（但不删除）
    public void enqueue (Object obj) throws ExceptionQueueFull;//入队
    public Object dequeue() throws ExceptionQueueEmpty;//出队
    public void Traversal();//遍历
}