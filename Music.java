package d1119;

public class Music {
	//pirvate field 3��
//	1. title 
//	2. singer
//	3. path
//	
//	mothod
//	�Ű� ���� 3��¥�� ������
//	���� field�� getter�޼ҵ� �����
	
	private String title;
	private String singer;
	private String path;
	
	public Music(String title, String singer, String path) {
		this.title = title;
		this.singer = singer;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public String getPath() {
		return path;
	}
	

	
	

}
