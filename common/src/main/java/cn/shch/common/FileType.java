package cn.shch.common;
/**
 * 方便根据不同类型查询
 * @author shangcheng
 *
 */
public interface FileType {
	String ALL="0";
	String FILE="2";
	String DIRECTORY="1";
	String FILE_DOCUMENT="22";
	String FILE_MEDIA="21";
	String FILE_ARCHIVE="23";
	String FILE_OTHER="29";

	String FILE_MEDIA_IMAGE="211";
	String FILE_MEDIA_AUDIO="212";
	String FILE_MEDIA_VIDEO="213";
	
	String FILE_DOCUMENT_MSOFFICE="221";
	String FILE_DOCUMENT_PDF="222";
	String FILE_DOCUMENT_TXT="223";
	String FILE_DOCUMENT_HTML="224";
	
	String FILE_DOCUMENT_MSOFFICE_WORD="2211";
	String FILE_DOCUMENT_MSOFFICE_EXCEL="2212";
	String FILE_DOCUMENT_MSOFFICE_PPT="2213";
	
	String FILE_ARCHIVE_RAR="231";
	String FILE_ARCHIVE_ZIP="232";
	String FILE_ARCHIVE_GZ="233";
	String FILE_ARCHIVE_TAR="234";
	String FILE_ARCHIVE_JAR="235";
	String FILE_ARCHIVE_7Z="236";
}
