package com.olliego.community.controller;

import com.olliego.community.dto.QuestionDTO;
import com.olliego.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Classname QuestionController
 * @Description 问题控制器
 * @Date 2020/3/16 11:01
 * @Created by OllieGo
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        //增加阅读数
        questionService.incView(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
