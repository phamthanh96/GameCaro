/**
 * Copyright(C) 2019  Luvina Software Common.java
 * 7 thg 10, 2019 PhamThanh
 */
package Common;

import javax.swing.ImageIcon;

import model.Cell;

/**
 * @author PhamThanh
 *
 */
public class Common {
	// Số dòng
	public static int ROWS = 20;
	// Số cột
	public static int COLUMS = 20;
	// Icon cho X
	public static ImageIcon X_ICON = new ImageIcon("");
	// Icon cho Y
	public static ImageIcon Y_ICON = new ImageIcon("");
	// File thế cờ
	public static String FILE_NAME = "";
	// List chứa các ô cờ(ma trận các cell)
	public static Cell[][] LIST_CELL = new Cell[ROWS][COLUMS];
	// Đếm số cell đã được tính
	public static int countCell = 0;
}
