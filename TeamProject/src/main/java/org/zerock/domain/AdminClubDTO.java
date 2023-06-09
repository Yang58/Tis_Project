package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AdminClubDTO {
	
	private int rn;
	private Long cno;
	private String club_name;
	private String content;
	private Date apply_date;
	private String meeting_day;
	private String meeting_time;
	private String status;
	private int like_count;
	private int count;
	private String cate_num;
	private String id;

	private String name;
	private String cate_kind;
	
	
}
