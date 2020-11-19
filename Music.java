package d1119;

public class Music {
	//pirvate field 3개
//	1. title 
//	2. singer
//	3. path
//	
//	mothod
//	매개 변수 3개짜리 생성자
//	각각 field의 getter메소드 만들기
	
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
