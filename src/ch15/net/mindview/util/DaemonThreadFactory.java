//: net/mindview/util/DaemonThreadFactory.java
package ch15.net.mindview.util;

import java.util.concurrent.*;

/**
 * @author coofive
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
} ///:~
