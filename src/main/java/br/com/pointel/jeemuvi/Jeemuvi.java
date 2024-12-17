package br.com.pointel.jeemuvi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author emuvi
 */
public class Jeemuvi {

    private static final Logger logger = LoggerFactory.getLogger(Jeemuvi.class);

    public static void main(String[] args) {
        logger.info("Started");
        JeemuviDesk.start(args);
    }
    
}
