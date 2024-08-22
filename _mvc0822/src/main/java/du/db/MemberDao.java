package du.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import du.MemberMapper;
import mybatis.SqlMapConfig;

public class MemberDao {

	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public MemberDao() {

		session = sqlsession_f.openSession(true);
	}

	public int isMember(MemberDto memberDto) {
		MemberMapper mm=session.getMapper(MemberMapper.class);
		return mm.isMember(memberDto);
	}
	public MemberDto findMember(MemberDto memberDto) {
		MemberMapper mm=session.getMapper(MemberMapper.class);
		return mm.findMember(memberDto);
	}

	
}
