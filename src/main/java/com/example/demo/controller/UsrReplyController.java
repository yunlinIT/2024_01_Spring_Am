package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.ArticleService;
import com.example.demo.service.BoardService;
import com.example.demo.service.ReactionPointService;
import com.example.demo.service.ReplyService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Article;
import com.example.demo.vo.Board;
import com.example.demo.vo.Reply;
import com.example.demo.vo.ResultData;
import com.example.demo.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UsrReplyController {

	@Autowired
	private Rq rq;

	@Autowired
	private ReplyService replyService;

	@Autowired
	private BoardService boardService;

	@Autowired
	private ReactionPointService reactionPointService;

	public UsrReplyController() {

	}

	// 액션 메서드



//	@RequestMapping("/usr/article/doReply")
//	@ResponseBody
//	public String doReply(HttpServletRequest req, String body) {
//
//		Rq rq = (Rq) req.getAttribute("rq");
//
//		if (Ut.isNullOrEmpty(body)) {
//			return Ut.jsHistoryBack("F-2", "댓글을 입력해주세요");
//		}
//
//		ResultData<Integer> doReplyRd = replyService.doReply(rq.getLoginedMemberId(), body);
//
//		int id = (int) doReplyRd.getData1();
//
////		Reply reply = replyService.getReply(id);
//
//		return Ut.jsReplace(doReplyRd.getResultCode(), doReplyRd.getMsg(), "../article/detail?id=" + id);
//
//	}
	
//	@RequestMapping("/usr/article/showReply")
//	public String showReplyt(HttpServletRequest req, Model model, int id, int boardId) {
//
//		Rq rq = (Rq) req.getAttribute("rq");
//
//		List<Reply> replies = replyService.getForPrintReplies(id);
//
//
//
////		int replysCount = replyService.getReplysCount(boardId);
//
////		if (reply == null) {
////			return rq.historyBackOnView("작성된 댓글이 없습니다");
////		}
//
//		// 한페이지에 글 10개씩이야
//		// 글 20개 -> 2 page
//		// 글 24개 -> 3 page
////		int itemsInAPage = 10;
////
////		int pagesCount = (int) Math.ceil(articlesCount / (double) itemsInAPage);
////
////		List<Article> articles = articleService.getForPrintArticles(boardId, itemsInAPage, page, searchKeywordTypeCode,
////				searchKeyword);
//
////		model.addAttribute("board", board);
////		model.addAttribute("boardId", boardId);
////		model.addAttribute("page", page);
////		model.addAttribute("pagesCount", pagesCount);
////		model.addAttribute("searchKeywordTypeCode", searchKeywordTypeCode);
////		model.addAttribute("searchKeyword", searchKeyword);
////		model.addAttribute("articlesCount", articlesCount);
//		model.addAttribute("replies", replies);
//
//		return "../article/detail?id=" + id;
//	}



}