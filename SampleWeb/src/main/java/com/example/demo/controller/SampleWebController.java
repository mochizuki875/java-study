package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;

@Controller
@RequestMapping
public class SampleWebController {

    @Autowired
    MemberService memberService;

    @GetMapping("/")
    public String Show(Model model){
        try{
            Iterable<Member> memberList = memberService.selectAll();
            model.addAttribute("list", memberList);

            // [Debug] getterメソッド動作確認
            for (Member obj : memberList) {
                System.out.println(obj.getName());
            }            

            return "top";
        }
        catch(Exception e){
            throw e;
        }
    }
}
