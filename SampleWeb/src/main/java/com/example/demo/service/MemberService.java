package com.example.demo.service;

import com.example.demo.entity.Member;

public interface MemberService {
    public Iterable<Member> selectAll();
}
