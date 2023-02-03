package h230111;

//캡슐화된 멤버변수와 getter,setter 메소드가 있는 데이터를 저장할 수 있는 클래스
//회원정보(아이디, 비밀번호, 이름 , 연락처 , email, 주소, 취미, 관심분야....)
//상품정보(상품명, 상품가격, 컬러, 사이즈, 할인률, ....)

//DTO클래스(Data Transfer Object) -> setter를 이용해 데이터를 변경할 수 있다.

//VO클래스(Value of Object) - > read only로 사용할 때 



public class MemberDTO {
	//캡슐화된 변수
	private String userid;//초기값이 null
	private String userpwd;
	private String username;
	private String tel;
	private String email;
	
	public MemberDTO() {
		
	}
	//변수를 하나씩 입력해주기 힘드니 아래와 같이 입력
	public MemberDTO(String userid, String username, String tel) {
		this.userid=userid;
		this.username=username;
		this.tel=tel;
	}
	
	// 우클릭 -> source -> generate toString
	@Override
	public String toString() {
		return "MeberDTO [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", tel=" + tel
				+ ", email=" + email + "]";
	}


	// getter get변수명 -> 변수명 첫 글자만 대문자로하고 나머지는 변수명 그대로 쓰기
	public String getUserid() {
		return userid;
	}
	// setter
	public void setUserid(String userid) {
		this.userid = userid;
	}
	// 우클릭 -> source -> generate getters and setters
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
