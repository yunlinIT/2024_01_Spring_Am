package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.Article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Controller
public class UsrHomeController {

	@RequestMapping("/usr/home/getArticle")
	@ResponseBody
	public Article getArticle() {
		Article article = new Article(1, "제목1", "내용1"); 

		return article;
	}

	@RequestMapping("/usr/home/getList")
	@ResponseBody
	public List<String> getList() {
		List<String> list = new ArrayList<>(); // 인덱스 -> 1개의 값

		list.add("철수나이");
		list.add("영수나이");

		return list;
	}

	@RequestMapping("/usr/home/getMap")
	@ResponseBody
	public Map<String, Object> getMap() {
		Map<String, Object> map = new HashMap<>();

		map.put("철수나이", 11); // 키 -> 벨류
		map.put("영수나이", 12);

		return map;
	}

	@RequestMapping("/usr/home/getDouble")
	@ResponseBody
	public double getDouble() {
		return 3.3;
	}

	@RequestMapping("/usr/home/getBoolean")
	@ResponseBody
	public boolean getBoolean() {
		return true;
	}

	@RequestMapping("/usr/home/getString")
	@ResponseBody
	public String getString() {
		return "abc";
	}

	@RequestMapping("/usr/home/getInt")
	@ResponseBody
	public int getInt() {
		return 1;
	}
}

