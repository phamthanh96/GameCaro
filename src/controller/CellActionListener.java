/**
 * Copyright(C) 2019  Luvina Software CellActionListener.java
 * 8 thg 10, 2019 PhamThanh
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Common.Common;
import logic.GameLogic;
import model.Cell;

/**
 * @author PhamThanh
 *
 */
public class CellActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// lấy source
		Cell cell = (Cell) e.getSource();
		// Người chơi đánh vào ô chưa đánh "T"
		if ("T".equals(cell.getValue())) {
			// Gán giá trị cho cell là X
			cell.setValue("X");
			// Gán icon
			cell.setIcon(Common.X_ICON);
			// Thêm cell vào LIST_CELL
			Common.LIST_CELL[cell.getxPoint()][cell.getyPoint()] = cell;
			// Tăng số cell được tíc
			Common.countCell++;
			// Check win xem game đã thắng chưa (thêm hàm check win)
			if (GameLogic.checkWin(cell)) {
				// hàm end game
				// showdialog thống báo người hoặc máy thắng
				JOptionPane.showMessageDialog(null, GameLogic.showWin(cell.getValue()));
			}
			if (GameLogic.isOver()) {
				// hàm end game (còn thiếu)
				// showdialog thống báo người hoặc máy thắng
				JOptionPane.showMessageDialog(null, "Game hòa");
			}
			// nếu chưa thắng thì tới lượt máy đánh
		} else {
			// code máy đánh
			
		}
	}

}
