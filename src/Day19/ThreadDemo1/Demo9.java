package Day19.ThreadDemo1;
/*
线程的状态答案只有唯一的一个：6种
线程的状态：
    NEW 新建的状态 线程对象被创建，没有调用start()方法
        状态转换：
            可以转换成"运行状态"：开始执行start()方法
    RUNNABLE 运行状态 线程对象调用start()，开始执行线程的具体动作
        状态转换：
            可以转换成堵塞状态，遇到了同步，没有争夺到锁资源
            可以转换成无限等待状态，调用了wait()
            可以转换成计时等待状态，调用了sleep()
            可以转换成终止状态，执行完线程的具体动作(寿终正寝)
    BLOCKED 堵塞状态
        当线程没有争夺到锁资源的时候
        状态转换：
            可以转换成运行状态，线程争夺到了锁资源
    WAITING 无限等待
        线程被调用wait()，从而进行没有时间限制的等待
        状态转换：
            可以转换成运行状态，线程被调用了notify()或者notifyAll()，并且争夺到了锁资源
            可以转换成阻塞状态，线程被调用了notify()或者notifyAll()，并且没有争夺到锁资源
    TIMED_WAiTING 计时等待
        正在运行的线程被调用了sleep()方法，休息固定的时间
        状态转换：
            可以转换成运行状态，争取到了锁资源
            可以转换成阻塞的状态，并且没有争夺到锁资源
    TERMINATED 终止
        执行完线程的具体动作
        无法转换成其他的状态

 */
public class Demo9 {
}