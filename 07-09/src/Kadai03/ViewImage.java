package Kadai03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ViewImage implements ActionListener {
    private String ImagePath;
    Image img;

    ViewImage(String path) {
        ImagePath = path;
    }

    public void actionPerformed(ActionEvent e) {
        class output extends Frame {
            public output() {
                super("画像");
                Toolkit tk = getToolkit();
                img = tk.getImage(ImagePath);
            }

            public void paint(Graphics g) {
                g.drawImage(img, 100, 100, this);
            }
        }
        new output();
    }
}
