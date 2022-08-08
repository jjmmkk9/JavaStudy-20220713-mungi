package j19_익명클래스.윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("검색버튼 클릭");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 릴리즈");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스프레스");
				super.mousePressed(e);
			}
		});
		btnNewButton.setBounds(12, 22, 190, 63);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("확인");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("확인버튼 클릭");
			}
		});
		btnNewButton_1.setBounds(214, 22, 190, 63);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("취소");
		btnNewButton_1_1.setBounds(416, 22, 190, 63);
		contentPane.add(btnNewButton_1_1);
	}
}
