package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.domain.Member;

@Repository

public class MemberRepository {

	@Autowired
	NamedParameterJdbcTemplate template;

	private static final RowMapper<Member> MEMBER_ROW_MAPPER = (rs, i) -> {
		Member member = new Member();
		member.setId(rs.getInt("id"));
		member.setName(rs.getString("name"));
		member.setAge(rs.getInt("age"));

		return member;
	};

	public List<Member> findAll() {
		String sql = "select id,name,age from member order by id";
		List<Member> memberList = template.query(sql, MEMBER_ROW_MAPPER);
		return memberList;
	}

}
