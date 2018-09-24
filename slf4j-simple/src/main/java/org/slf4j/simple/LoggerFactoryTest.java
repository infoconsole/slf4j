package org.slf4j.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author oldflame-jm
 * @create 2018/9/15
 * ${DESCRIPTION}
 */
public class LoggerFactoryTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LoggerFactoryTest.class);
        logger.info("hello slf4j {}", "mitix");
    }
}
