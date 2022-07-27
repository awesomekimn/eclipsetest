package com.spring.boardweb.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class BoardFileId implements Serializable{
	private int board; // BoardFile의 private Board board의 변수명과 같아야함
	private int fileSeq;
}
