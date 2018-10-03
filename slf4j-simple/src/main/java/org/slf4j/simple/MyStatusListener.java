package org.slf4j.simple;

import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusListener;

/**
 * @author oldflame-jm
 * @create 2018/10
 * @see
 * @since
 */
public class MyStatusListener implements StatusListener {
    @Override
    public void addStatusEvent(Status status) {
        System.out.println("logback customer StatusListener ={" + status.getMessage() + "}");
    }
}
