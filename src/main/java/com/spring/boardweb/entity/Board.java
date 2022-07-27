package com.spring.boardweb.entity;

import java.time.LocalDateTime;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Table(name = "T_BOARD")
@Data
@SequenceGenerator(
		// name: SequenceGenerator의 이름 지정
		name = "T_BOARD_SEQ_GENERATOR",
		// sequenceName: DB에 생성될 시퀀스 이름 지정
		sequenceName="T_BOARD_SEQ",
		// initialValue: 초기값 설정
		initialValue = 1,
		// allocationSize: 몇 씩 증가할 지 결정
		allocationSize = 1
		)
public class Board {
	@Id
	// 키 값 생성 전략을 설정
	// @GeneratedValue를 사용하지 않으면 직접 할당
	// GeneratedType의 속성
	//		AUTO: 기본 설정 값. 데이터베이스에 맞게 자동생성
	// 		IDENTITY: AUTO_INCREMENT로 자동적으로 키 값이 1씩 증가하도록 설정
	// 		SEQUENCE: 시퀀스를 생성하여 키 값에 배정하는 방식, 이 설정을 사용하기 위해서 SequenceGenerator를 함께 사용
	//		TABLE: 키로 사용될 숫자를 보관 테이블로 별도로 만들어서 엔티티가 생성될 때마다 값을 갱신하여 키값으로 지정
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "T_BOARD_SEQ_GENERATOR")
	private int boardSeq;
	
	private String boardTitle;
	
	private String boardWriter;
	
	private String boardContent;
	
	private LocalDateTime boardRegdate = LocalDateTime.now();
	
	private LocalDateTime boardMdfdate = LocalDateTime.now();
	
	private int boardCnt;
	
	@Transient
	private String searchCondition;

	@Transient
	private String searchKeyword;
}
