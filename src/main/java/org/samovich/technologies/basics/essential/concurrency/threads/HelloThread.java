/**
 * @file HelloThread.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/09
 */

package org.samovich.technologies.basics.essential.concurrency.threads;

public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        // Invoke Thread.start to start the new thread
        (new HelloThread()).start();
    }

}
