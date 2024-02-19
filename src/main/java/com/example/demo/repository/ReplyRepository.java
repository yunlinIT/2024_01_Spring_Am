package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Article;
import com.example.demo.vo.Reply;

@Mapper
public interface ReplyRepository {

	@Insert("""
			INSERT INTO
			reply SET
			regDate = NOW(),
			updateDate = NOW(),
			memberId = #{memberId},
			relTypeCode = #{relTypeCode},
			relId = #{relId},
			`body` = #{body}
			""")
	public void doReply(int memberId, String body);

	@Select("SELECT LAST_INSERT_ID()")
	public int getLastInsertId();


	
	@Select("""
			SELECT *
			FROM reply
			ORDER BY id DESC
			""")
	public List<Reply> getReplies();

	

}