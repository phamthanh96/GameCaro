/**
 * Copyright(C) 2019  Luvina Software CaroChessBoardView.java
 * 7 thg 10, 2019 PhamThanh
 */
package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Common.Common;
import controller.CellActionListener;
import model.Cell;

/**
 * @author PhamThanh
 *
 */
public class CaroChessBoardView extends JFrame {
	/**
	 * Hàm vẽ bàn cờ 20x20
	 *
	 */
	public void createChessBoard() {
		// tạo khung chứa các
		Container container = getContentPane();
		// tạo panel
		JPanel chessBoardJPanel = new JPanel();
		chessBoardJPanel.setLayout(new GridLayout(Common.ROWS, Common.COLUMS, 0, 0));
		
		// tạo bàn cờ 20x20
		for (int i = 0; i < Common.ROWS; i++) {
			for (int j = 0; j < Common.COLUMS; j++) {
				// tạo một cell mới
				Cell cell = new Cell();
				// setValue  = T (trống)
				cell.setValue("T");
				// Tọa độ X
				cell.setxPoint(i);
				// Tọa độ Y
				cell.setyPoint(j);
				// Gán sự kiện khi được cell đc Click vào
				cell.addActionListener(new CellActionListener());
				// Thêm ô cờ vào List để xử lý
				Common.LIST_CELL[i][j] = cell;
				// Thêm cell vào chessBoardJPanel
				chessBoardJPanel.add(cell);
			}
		}
	}
	/**
	 * Hàm hiển thị bàn cờ
	 *
	 */
	public void showChessBoard() {
		// Tiêu đề
		this.setTitle("Caro Chess");
		// Kích cỡ board
		this.setSize(1000, 1000);
		// Tắt chương trình khi click X
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Hiện Chương trình
		this.isVisible();
	}
}
