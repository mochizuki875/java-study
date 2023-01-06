package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberCrudRepository;

@SpringBootApplication
public class SpringDataJDBCSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJDBCSampleApplication.class, args).getBean(SpringDataJDBCSampleApplication.class).execute();		
	}


	// DI
	// MemberCrudRepositoryはCrudRepositoryの拡張インターフェイス
	// CrudRepositoryは@Compornentとして実装クラスがSpringBootで定義されてる？

	@Autowired
	MemberCrudRepository repository;

	private void execute(){
		executeInsert(); // 登録
		executeSelect(); // 全件取得
	}

	private void executeInsert(){
		Member member = new Member("花子"); // エンティティ作成
		member = repository.save(member); // 登録(INSERT or UPDATE)

		System.out.println("登録したデータ: " + member.getId() + ", " + member.getName());
	}

	private void executeSelect(){
		System.out.println("--- 全件取得 ---");

		Iterable<Member> members = repository.findAll();
		for (Member member : members) {
			System.out.println(member.getId() + ", " + member.getName());
		}
	}

}
