package com.greedy.section02.users;

public class MemberSelectManager {

	public MemberDTO[] selectAllMembers() {
		
		return new MemberDTO[] {
				
				 new MemberDTO(1, "users01", "pass01 ", "홍길동", 20, '남'),
				 new MemberDTO(2, "users02", "pass02 ", "유관순", 16, '여'),
				 new MemberDTO(3, "users03", "pass03 ", "이순신", 40, '남'),
				 new MemberDTO(4, "users04", "pass04 ", "신사임당", 36, '여'),
				 new MemberDTO(5, "users05", "pass05 ", "윤봉길", 22, '남')
		};
	}
	}

