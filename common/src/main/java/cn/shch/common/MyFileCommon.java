package cn.shch.common;

public class MyFileCommon {
	private MyFileCommon() {}
	/**
	 * 根据给出的文件名返回其文件后缀（不带点"."）,如果文件没有后缀，返回null
	 * @param fileName
	 * @return
	 */
	public static String getFileNameSuffix(String fileName) {
		int dot=fileName.lastIndexOf(".");
		if(dot>=0) {
			return fileName.substring(dot+1);
		}
		return null;
	}
}
