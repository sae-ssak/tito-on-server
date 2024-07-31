package com.example.demo.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<Member, String> {

	 @Query(value = "SELECT nextval('seq_Member')", nativeQuery = true)
	    Long getNextSequenceValue();


}
