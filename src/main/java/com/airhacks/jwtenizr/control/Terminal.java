
package com.airhacks.jwtenizr.control;

/**
 *
 * @author airhacks.com
 */
public interface Terminal {

    public static void info(String message) {
        System.out.println(message);
    }
    public static void info(byte[] message) {
        System.out.write(message, 0, message.length);
    }
}
