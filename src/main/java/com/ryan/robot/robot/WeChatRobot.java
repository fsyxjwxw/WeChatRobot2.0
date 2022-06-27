package com.ryan.robot.robot;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

public class WeChatRobot {

    private Robot bot = null;
    private Clipboard clip = null;

    public WeChatRobot() {
        try {
            this.clip = Toolkit.getDefaultToolkit().getSystemClipboard();
            this.bot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void OpenWeChat() {
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_ALT);
        bot.keyPress(KeyEvent.VK_W);

        bot.keyRelease(KeyEvent.VK_CONTROL);
        bot.keyRelease(KeyEvent.VK_ALT);

        bot.delay(1000);
    }

    public void ChooseFriends(String name) {
        Transferable text = new StringSelection(name);
        clip.setContents(text, null);
        bot.delay(1000);
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_F);
        bot.keyRelease(KeyEvent.VK_CONTROL);

        bot.delay(1000);

        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_CONTROL);

        bot.delay(2000);

        bot.keyPress(KeyEvent.VK_ENTER);

    }

    public void SendMessage(String message) {
        Transferable text = new StringSelection(message);
        clip.setContents(text, null);
        bot.delay(1000);
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_V);
        bot.keyRelease(KeyEvent.VK_CONTROL);
        bot.delay(1000);

        bot.keyPress(KeyEvent.VK_ENTER);

        bot.delay(1000);
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_ALT);
        bot.keyPress(KeyEvent.VK_W);

        bot.keyRelease(KeyEvent.VK_CONTROL);
        bot.keyRelease(KeyEvent.VK_ALT);
    }
}
