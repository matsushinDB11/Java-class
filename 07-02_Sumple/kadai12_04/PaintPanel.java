package kadai12_04;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

/**
 * @author onishi
 *
 */
public class PaintPanel extends JPanel implements MouseMotionListener, MouseListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Graphics2D g2d;
	private Point startPoint = new Point(-1,-1);
	private Point endPoint   = new Point(-1,-1);
	private Point mPoint = new Point(-1,-1);
	Dimension size;
	private int colorcode;
	
	public PaintPanel() {
		super();
		this.setBackground(Color.WHITE);
		addMouseMotionListener(this);
		addMouseListener(this);
		size=getSize();
		colorcode = 0;
	}  
	
	public void paintComponent(Graphics g) {    
		g2d = (Graphics2D) g;
		// 全体のクリア
		//g2d.clearRect(0, 0, getWidth(), getHeight());
		
		// BasicStrokeの引数でペンの太さを定義
		g2d.setStroke(new BasicStroke(3.0F));
		
		// setPaintの引数でペンの色を定義
		switch(colorcode){
		case 0://黒
			g2d.setPaint(Color.BLACK);
			break;
		case 1://赤
			g2d.setPaint(Color.RED);
			break;
		case 2://青
			g2d.setPaint(Color.BLUE);
			break;
		default:
			g2d.setPaint(Color.BLACK);			
		}
		
		// startPointからendPointまでの線を描画
//		g2d.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
//		startPoint = endPoint;
		
		if(mPoint.x != -1 && mPoint.y != -1){
			g2d.fillRect(mPoint.x , mPoint.y, 100, 100);			
		}

		g2d.dispose();
	}  
	
	// エラーの可能性あり
	public void clearComponent()
	{
		Graphics g = getGraphics();
		size.getSize();
		g.clearRect(0,0,getWidth(), getHeight());
		g.dispose();
	}

	// MouseListenerに含まれるメソッド
	
	public void mouseClicked(MouseEvent e) {}

	// マウスがコンポーネント外に出たときの処理
	public void mouseExited(MouseEvent e) {
		mPoint = new Point(-1,-1);
		repaint();
		
	}
	public void mouseEntered(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		startPoint = e.getPoint();
	}
	public void mouseReleased(MouseEvent e) {
	}

	// MouseMotionListenerに含まれるメソッド
	public void mouseDragged(MouseEvent e) {
		endPoint = e.getPoint();
		repaint();  
	}  
	
	private Point mpoint = new Point(-1, -1);
	
	public void mouseMoved(MouseEvent e) {
		mPoint = e.getPoint();
		
//		Graphics g = getGraphics();
//		
//		g.clearRect(0, 0, getWidth(), getHeight());
//		mpoint = e.getPoint();
//		g.fillRect(mpoint.x-50, mpoint.y-50, 100, 100);
//		g.dispose();
		
		repaint();
	}  
	
	public void setColor(int color){
		colorcode = color;
	}
	
}
