package helpers;

import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import static helpers.ConsoleColors.*;

public class ColorPrinter {
    public static void printMessageInYellow(String message) {
        System.out.println(YELLOW + message + RESET);
    }

    public static void printColorMessage(String message, Logger logger, @NotNull Level level){
        switch (level){
            case INFO:
                logger.info(GREEN + message + RESET);
                break;
            case DEBUG:
                logger.debug(BLUE + message + RESET);
                break;
            case ERROR:
                logger.debug(RED + message + RESET);
        }
    }
}
