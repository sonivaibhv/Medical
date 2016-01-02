         
        import java.awt.*;
        import java.awt.event.*;

        public class printer {
                public static void main(String[] argv) {
                        printgraphics w = new printgraphics();
                }

        }

        class printgraphics extends Frame {
           printgraphics() {
                PrintJob p = getToolkit().getPrintJob(this, "Print graphics", null);
                Graphics g = p.getGraphics();
                g.drawRect(1, 1, 40, 40);
                g.drawLine(1, 1, 40, 40);
                g.dispose();
                p.end();
           }

        }
        

