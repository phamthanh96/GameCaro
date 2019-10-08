/**
 * Copyright(C) 2019  Luvina GameLogic.java, Oct 8, 2019 PhamThanh
 */
package logic;

import org.omg.CORBA.PRIVATE_MEMBER;

import Common.Common;
import model.Cell;

/**
 * @author PhamThanh
 *
 */
public class GameLogic {

	/**
	 * Hàm checkWin
	 * 
	 * @param truyền vào 1 ô cờ Kiểm tra 1 trong các điều kiện check có sai hay
	 *               không
	 * @return trả về true nếu win false nếu không phải
	 */
	public static boolean checkWin(Cell cell) {
		// kiểm tra điều kiện, nếu sai return true
		if (checkWinTyperHorizontal(cell) || checkWinTyperVertical(cell) || checkDiagonalLeft(cell)
				|| checkDiagonalRight(cell)) {
			return true;
		}
		return false;
	}

	/**
	 * Hàm check win theo hàng ngang
	 * 
	 * @param truyền vào 1 ô cờ
	 * @return trả về true nếu win false nếu không phải
	 */
	public static boolean checkWinTyperHorizontal(Cell cell) {
		// biến đếm số lượng quân cờ
		int count = 1;
		// tọa độ X hiện tại
		int indexX = cell.getxPoint();
		// tọa độ Y hiện tại
		int indexY = cell.getyPoint();
		// từ Cell đếm sang phải 5 cell
		for (int i = 1; i < 5; i++) {
			// so sánh value của cell hiện tại với các cell lân cận.
			if (cell.getValue() == Common.LIST_CELL[indexX + i][indexY].getValue()) {
				count++;
			} else {
				break;
			}
		}
		// từ Cell đếm sang trái 5 cell
		for (int i = -1; i > -5; i--) {
			// so sánh value của cell hiện tại với các cell lân cận.
			if (cell.getValue() == Common.LIST_CELL[indexX + i][indexY].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}
		// nếu đếm được >=5 thì return true
		if (count >= 5) {
			return true;
		}
		// nếu count <5 return false
		return false;
	}

	/**
	 * Hàm check win theo hàng dọc
	 * 
	 * @param truyền vào 1 ô cờ
	 * @return trả về true nếu win false nếu không phải
	 */
	public static boolean checkWinTyperVertical(Cell cell) {
		// biến đếm số lượng quân cờ
		int count = 1;
		// tọa độ X hiện tại
		int indexX = cell.getxPoint();
		// tọa độ Y hiện tại
		int indexY = cell.getyPoint();
		// kiển tra theo chiều dọc
		// đếm từ trên xuống dưới 5cell
		for (int i = 1; i < 5; i++) {
			if (cell.getValue() == Common.LIST_CELL[indexX][indexY + i].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}

		for (int i = -1; i > -5; i--) {
			if (cell.getValue() == Common.LIST_CELL[indexX][indexY + i].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}
		// nếu đếm được >=5 thì return true
		if (count >= 5) {
			return true;
		}
		// nếu count <5 return false
		return false;
	}

	/**
	 * Hàm check win theo đường chéo từ trái
	 * 
	 * @param truyền vào 1 ô cờ
	 * @return trả về true nếu win false nếu không phải
	 */
	public static boolean checkDiagonalLeft(Cell cell) {
		// biến đếm số lượng quân cờ
		int count = 1;
		// tọa độ X hiện tại
		int indexX = cell.getxPoint();
		// tọa độ Y hiện tại
		int indexY = cell.getyPoint();
		// thực hiện check 4 cell bên trái phía trên
		for (int i = -1; i > -5; i--) {
			if (cell.getValue() == Common.LIST_CELL[indexX + i][indexY + i].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}
		// thực hiện check 4 cell bên phải phía dưới
		for (int i = 1; i < 5; i++) {
			if (cell.getValue() == Common.LIST_CELL[indexX + i][indexY + i].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}
		// nếu đếm được >=5 thì return true
		if (count >= 5) {
			return true;
		}
		// nếu count <5 return false
		return false;
	}

	/**
	 * Hàm check win theo đường chéo từ phải
	 * 
	 * @param truyền vào 1 ô cờ
	 * @return trả về true nếu win false nếu không phải
	 */
	public static boolean checkDiagonalRight(Cell cell) {
		// biến đếm số lượng quân cờ
		int count = 1;
		// tọa độ X hiện tại
		int indexX = cell.getxPoint();
		// tọa độ Y hiện tại
		int indexY = cell.getyPoint();
		// thực hiện check 4 cell bên phải phía trên
		for (int i = -1; i > -5; i--) {
			if (cell.getValue() == Common.LIST_CELL[indexX - i][indexY + i].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}
		// thực hiện check 4 cell bên trái phía dưới
		for (int i = 1; i < 5; i++) {
			if (cell.getValue() == Common.LIST_CELL[indexX - i][indexY + i].getValue()) {
				// đúng thì tăng count
				count++;
			} else {
				// thoát khỏi vòng
				break;
			}
		}
		// nếu đếm được >=5 thì return true
		if (count >= 5) {
			return true;
		}
		// nếu count <5 return false
		return false;
	}

	/**
	 * Hàm kiểm tra thế cờ hòa
	 * 
	 * @param truyền vào 1 ô cờ
	 * @return trả về true nếu cờ hòa
	 */
	public static boolean isOver() {
		// kiểm tra số lượng ô đã được đánh so với tổng số ô trong ma trận
		if (Common.countCell < Common.COLUMS * Common.ROWS) {
			return false;
		}
		return true;
	}
	/**
	 * @return "X or O đã thắng"
	 */
	public static String showWin(String who) {
		return who + " đã thắng!!!";
	}
}
