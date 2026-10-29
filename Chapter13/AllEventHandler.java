import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.AdjustmentEvent;

class AllEventHandler implements ActionListener, ComponentListener, MouseMotionListener, MouseListener,
    MouseWheelListener, KeyListener, TextListener, FocusListener, ItemListener, AdjustmentListener, WindowListener,
    WindowFocusListener, WindowStateListener, ContainerListener {
        //ActionListener method
        public void actionPerformed(ActionEvent ae) {}

        //ComponentListener method
        public void componentMoved(ComponentEvent ce) {}
        public void componentHidden(ComponentEvent ce) {}
        public void componentResized(ComponentEvent ce) {}
        public void componentShown(ComponentEvent ce) {}

        //MouseMotionListener method
        public void mouseDragged(MouseEvent me) {}
        public void mouseMoved(MouseEvent me) {}
        
        //MouseListener method
        public void mousePressed(MouseEvent me) {}
        public void mouseReleased(MouseEvent me) {}
        public void mouseEntered(MouseEvent me) {}
        public void mouseExited(MouseEvent me) {}
        public void mouseClicked(MouseEvent me) {}

        // MouseWheelListener method
        public void MouseWheelListener(MouseWheelEvent e) {}

        //KeyListener method 
        public void keyPressed(KeyEvent ke) {}
        public void keyReleased(KeyEvent ke) {}
        public void keyTyped(KeyEvent ke) {}

        //TextListener method
        public void textValueChanged(TextEvent te) {}

        //FocusListener method
        public void focusGained(FocusEvent fe) {}
        public void focustLost(FocusEvent fe) {}

        //ItemListener method
        public void itemStateChanged(ItemEvent ie) {}

        //AdjustmentListener method
        public void adjustmentValueChanged(AdjustmentEvent ae) {}

        //WindowListener method
        public void windowClosing(WindowEvent we) {}
        public void windowOpened(WindowEvent we) {}
        public void windowIconified(WindowEvent we) {}
        public void windowDeiconified(WindowEvent we) {}
        public void windowClosed(WindowEvent we) {}
        public void windowACtivated(WindowEvent we) {}
        public void windowDeactivated(WindowEvent we) {}

        //WindowFocusListener method
        public void windowGainedFocus(WindowEvent we) {}
        public void windowStateChanged(WindowEvent we) {}

        //ContainerListener method
        public void componentAddded(ComponentEvent ce) {}
        public void componentRemoved(ComponentEvent ce) {}

}