package cp25_EventHandler;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MouseEventHandler implements MouseListener{
	
	public void mouseClicked(MouseEvent e)
	{
		int w , h;
		JButton button = (JButton)e.getComponent();
		w = button.getWidth();
		h= button.getHeight();
		button.setPreferredSize(new Dimension(w, h));

		
		button.setText("Clicked");
		System.out.println("Clicked Button " + e.getButton());
		System.out.println("마우스 버튼 눌렸다 풀림");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int w , h;
		JButton button = (JButton)e.getComponent();
		w = button.getWidth();
		h= button.getHeight();
		button.setPreferredSize(new Dimension(w, h));
		System.out.println("mouse entered");
		/*
		try{
		Icon i = new ImageIcon(getClass().getClassLoader().getResource("resources/ui/image.jpg"));
		
		button.setIcon(i);
		
		} catch (NullPointerException err) {
			System.out.println(err.getMessage());
		}*/
		
		new Thread(new Runnable(){
			public void run(){
				Dimension d = new Dimension(w,h);
				while(true)
				{
					d.setSize(d.getWidth()+1,d.getHeight()+1);
					button.setSize(d);
					try {
						Thread.sleep(10);
					} catch (InterruptedException err) {
						// TODO Auto-generated catch block
						err.printStackTrace();
					}
					if(d.getHeight() > h+10)
						break;
				}
			}
		}).start();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		((JButton)e.getComponent()).setIcon(null);
		
		int w , h;
		JButton button = (JButton)e.getComponent();
		w = button.getWidth();
		h= button.getHeight();
		
		System.out.println("mouse exit");
		
		new Thread(new Runnable(){
			public void run(){
				Dimension d = new Dimension(w,h);
				while(true)
				{
					d.setSize(d.getWidth()-1,d.getHeight()-1);
					button.setSize(d);
					try {
						Thread.sleep(10);
					} catch (InterruptedException err) {
						// TODO Auto-generated catch block
						err.printStackTrace();
					}
					if(d.getHeight() == h-10)
						break;
				}
			}
		}).start();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

}
