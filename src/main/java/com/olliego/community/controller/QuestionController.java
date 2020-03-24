package com.olliego.community.controller;

import com.olliego.community.dto.CommentCreateDTO;
import com.olliego.community.dto.CommentDTO;
import com.olliego.community.dto.QuestionDTO;
import com.olliego.community.service.CommentService;
import com.olliego.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

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

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Long id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);

        List<CommentDTO> comments = commentService.listByTargetId(id);

        //增加阅读数
        questionService.incView(id);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        return "question";
    }
}
