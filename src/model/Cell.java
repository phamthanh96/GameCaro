/**
 * Copyright(C) 2019  Luvina Software Cell.java
 * 7 thg 10, 2019 PhamThanh
 */
package model;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author PhamThanh
 *
 */

public class Cell extends JButton {
	// Giá trị của cell
	private String value;
	// Tọa độ của cell
	private int xPoint,yPoint;
	// icon của cell
	private ImageIcon icon;
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * @return the xPoint
	 */
	public int getxPoint() {
		return xPoint;
	}
	
	/**
	 * @param xPoint the xPoint to set
	 */
	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}
	
	/**
	 * @return the yPoint
	 */
	public int getyPoint() {
		return yPoint;
	}
	
	/**
	 * @param yPoint the yPoint to set
	 */
	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}
	
	/**
	 * @return the icon
	 */
	public ImageIcon getIcon() {
		return icon;
	}
	
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
	
}
