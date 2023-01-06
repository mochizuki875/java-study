package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("member")
public class Member {
    @Id
	@Column("id")
    private int id;

    @Column("name")
    private String name;

    // デフォルトコンストラクタ
    public Member(){
    }

    public Member(int id){
        this.id = id;
    }

    public Member(String name){
        this.name = name;
    }

    public Member(int id, String name){
        this.id = id;
        this.name = name;
    }

    // getter
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    // setter
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

}


