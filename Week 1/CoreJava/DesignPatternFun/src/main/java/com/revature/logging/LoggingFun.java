package com.revature.logging;

import org.apache.log4j.Logger;

public class LoggingFun {
  private static Logger log = Logger.getRootLogger();

  public void someMethod() {
    log.trace("trace msg");
    log.debug("debug msg");
    log.info("info msg");
    log.warn("warn msg");
    log.error("error msg");
    log.fatal("fatal msg");
  }

  public void giveFatal(Throwable t) {
    log.fatal(t.getMessage(), t);
  }
}