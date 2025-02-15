package main.java.Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
 * Listener to handle Key Event and actions
 *
 * @author Luu Pham Manh Ha - 1752001
 */

public class MyKeyListener implements KeyListener {

    private final Controller controller;
    private boolean isPressed;

    public MyKeyListener (Controller controller) {
        this.controller = controller;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (isPressed)
            return;
        isPressed = true;
        controller.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

        isPressed = false;
        controller.keyReleased(e);
    }
}
