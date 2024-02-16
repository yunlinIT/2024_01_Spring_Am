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
			`body` = #{body}
			""")
	public void doReply(int memberId, String body);

	@Select("SELECT LAST_INSERT_ID()")
	public int getLastInsertId();

	
	
	
//	@Select("""
//			SELECT A.*, M.nickname AS extra__writer
//			FROM article AS A
//			INNER JOIN `member` AS M
//			ON A.memberId = M.id
//			ORDER BY A.id DESC
//			""")
	
	
	@Select("""
			SELECT *
			FROM reply
			ORDER BY id DESC
			""")
	public List<Reply> getReplies();

	

}