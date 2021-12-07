package com.openplatform.board.dto;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardDto {
	private int bnum;
	private String btitle;
	private String bcontents;
	private String bid;//작성자 id(외래키)
	private String mname;//작성자 이름
	private Timestamp bdate;
	private int bviews;
}
