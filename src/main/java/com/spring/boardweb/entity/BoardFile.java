package com.spring.boardweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="T_Board_File")
@Data
// 다중 pk 설정
// 다중 pk가 모여있는 객체를 만들어서 연결해줌
@IdClass(BoardFileId.class)
public class BoardFile {
	@Id
	// foreign key 설정
	// 매핑 관계
	// 1:1매핑 일때 : @OneToOne
	// n:1매핑 일때 : @ManyToOne
	// 1:n매핑 일때 : @OneToMany
	@ManyToOne
	@JoinColumn(name="BOARD_SEQ")
	private Board board;
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fileSeq;
	
	private String originalFileName;
	
	private String fileName;
	
	private String filePath;
}
