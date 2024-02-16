package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ReplyRepository;
import com.example.demo.util.Ut;
import com.example.demo.vo.Article;
import com.example.demo.vo.Reply;
import com.example.demo.vo.ResultData;

@Service
public class ReplyService {

	@Autowired
	private ReplyRepository replyRepsitory;

	public ResultData<Integer> doReply(int memberId, String body) {
		replyRepsitory.doReply(memberId, body);

		int id = replyRepsitory.getLastInsertId();

		return ResultData.from("S-1", Ut.f("댓글이 등록되었습니다", id), "id", id);
	}

	public List<Reply> getForPrintReplies(int id) {
		return replyRepsitory.getReplies();
	}




}
