/**
 * Copyright(C) 2019  Luvina Software ReadFile.java
 * 8 thg 10, 2019 PhamThanh
 */
package logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Common.Common;

/**
 * @author PhamThanh
 * Đọc và lấy các thế cờ trong file theco.txt
 *
 */
public class ReadFile {
	/**
	 * Hàm đọc file thế cờ
	 * @return trả về List các thế cờ trong file theco
	 * @throws IOException 
	 */
	public static List<String> getListMatrixFromFile() throws IOException {
		
		try {
			List<String> listMatrix = new ArrayList<String>();
			// Tạo biến br đọc dl
			BufferedReader br = new BufferedReader(new FileReader(Common.FILE_NAME));
			//
			StringBuilder matrixBuilder =  new StringBuilder();
			// Biến đếm số dòng của matrix
			int index = 0;
			// đọc dòng hiện tại
			String curLine = br.readLine();
			// Thêm dòng hiện tại vào matrix
			matrixBuilder.append(curLine + "\n");
			while (curLine != null) {
				// Tăng chỉ số dòng lên 1 khi đọc một dòng mới
				index++;
				// Thêm dòng hiện tại vào matrix
				matrixBuilder.append(curLine + "\n");
				// Đọc dòng tiếp theo
				curLine = br.readLine();
				// Nếu đã đọc được 5 dòng
				if (index % 5 == 0) {
					// Thêm ma trận vào list matraanj
					listMatrix.add(matrixBuilder.toString());
					// Xóa dữ liệu trong matrix để thêm matrix mới
					matrixBuilder.delete(0, matrixBuilder.length());
					// Đọc thêm 1 dòng ngăn cách 2 ma trận
					curLine = br.readLine();
				}
			}
			// Trả về list các ma trận lấy đc từ file
			return listMatrix;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// Throw cho lớp khác xử lí
			throw e;
		} 
		
	}
}
