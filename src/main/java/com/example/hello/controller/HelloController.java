package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//↓Springがコントローラクラスとして認識するためにつけるアノテーション。クラス名の先頭につける。
@Controller
public class HelloController {
	
	//RequestMapping：Controllerの処理対象のパスを指定するアノテーション
	//valueは処理対象となるURLを指定。最初の/は省略可
	//methodは、HTTPメソッドを指定する（GET、POST）
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", "HelloWorld!!");
		return "index";	//インデックスに返す
	}
}
