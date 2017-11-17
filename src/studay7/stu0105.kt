package studay7
//内联函数
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}
fun function1()
{
   var lockmethod= ReentrantLock();
    lockmethod.lock();
    try {
        println("hello")
    }
    finally {
        lockmethod.unlock();
    }

}
fun function2():Int
{
    var lockmethod= ReentrantLock();
    lock(lockmethod)
    {
        println("hello")
        return 2;
    };
}
fun main(args:Array<String>)
{
    function1()//非内联函数实现方式
    function2()//  内联函数实现方式
}