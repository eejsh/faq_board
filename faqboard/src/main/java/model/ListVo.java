package model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ListVo {
	
	// vo : 값 오브젝트로서 쓰임 read-only 특징 변경불가능)
	// DTO와 유사하나 DTO는 setter를 가지고 있어 값 변경가능함
	
	
	private String inx;
	private String fcate;
	private String fwrite;
	private String faq_qc;
	private String faq_aw;
	private String faq_view;
	private String indate;

}
