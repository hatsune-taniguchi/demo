package com.example.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.domain.Member;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepositoryTest {

//	MemberRepository memberRepository = new MemberRepository();は使わずにDIをする。

	@Autowired
	private MemberRepository memberRepository;

	Member member = new Member();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindAll() {
		List<Member> memberList = memberRepository.findAll();
//		Member member1 = memberList.get(0);
//		Member member2 = memberList.get(1);
//		Member member3 = memberList.get(2);
		int count = memberList.size();
		assertEquals(3, count, "エラー");
	}

	@Test
	void test2() {
		List<Member> memberList = memberRepository.findAll();
		Member member3 = memberList.get(2);
		// System.out.println(member3.getName());
		assertEquals("piyo", member3.getName(), "piyoエラー");
	}

	@Test
	void test3() {
		List<Member> memberList = memberRepository.findAll();
		Member member2 = memberList.get(1);

		assertEquals(20, member2.getAge(), "20歳エラー");
	}

}
