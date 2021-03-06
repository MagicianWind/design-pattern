package com.ir.dp.behavior.chain;

import com.ir.dp.behavior.chain.core.AbstractLogger;
import com.ir.dp.behavior.chain.core.DebugLogger;
import com.ir.dp.behavior.chain.core.ErrorLogger;
import com.ir.dp.behavior.chain.core.InfoLogger;

/**
 * @author i-rain
 */
public class ChainDemo {

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLogger();
        logger.logMessage(AbstractLogger.INFO, "info message");
        logger.logMessage(AbstractLogger.DEBUG, "debug message");
        logger.logMessage(AbstractLogger.ERROR, "error message");
    }

    public static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(infoLogger);
        return errorLogger;
    }
}
