package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.ReactionPointService;
import com.example.demo.util.Ut;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UsrReactionPointController {

	@Autowired
	private Rq rq;

	@Autowired
	private ReactionPointService reactionPointService;

	// 액션 메서드

	@RequestMapping("/usr/reactionPoint/doGoodReaction")
	@ResponseBody
	public String doGoodReaction(String relTypeCode, int relId, String replaceUri) {

		int usersReaction = reactionPointService.usersReaction(rq.getLoginedMemberId(), relTypeCode, relId);

		if (usersReaction == 1) {
			
			return Ut.jsHistoryBack("F-1", "이미 함");
		}

		ResultData reactionRd = reactionPointService.increaseReactionPoint(rq.getLoginedMemberId(), relTypeCode, relId);

		return Ut.jsReplace(reactionRd.getResultCode(), reactionRd.getMsg(), replaceUri);
	}

}