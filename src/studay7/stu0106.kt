package studay7

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
//非内联函数
inline fun <T> lockfnl(lock:Lock, noinline body:()->T):T
{
    lock.lock();
    try {
        return body();
    }
    finally {
        lock.unlock()
    }
}
fun function3():Int
{
    var lockmethod= ReentrantLock();
    lockfnl(lockmethod)
    {
        println("hello")
    };
    return 3;//非内联行数必须
}
fun main(args:Array<String>)
{
    function3();
}