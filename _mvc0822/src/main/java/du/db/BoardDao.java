package du.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlMapConfig;

public class BoardDao {

	// SqlSessionFactory를 SqlMapConfig를 통하여 생성한다.
	SqlSessionFactory sqlsession_f = SqlMapConfig.getSqlMapInstance();
	SqlSession session;

	public BoardDao() {
		// SqlSessionFactory에서 session을 할당받는다.
		// 이 때 openSession에 true를 주어야 자동 커밋이 된다.
		// default는 false이다.
		session = sqlsession_f.openSession(true);
	}
	
	public int getNumRecords() {
		return session.selectOne("BoardMapper.getNumRecords");
	}

	public List<BoardDto> selectList(int start, int listSize) {
		// session을 통해 쿼리를 실행하고 값을 받아온다.
		Map<String, Integer> map=new HashMap<>();
		map.put("start",start);
		map.put("listSize", listSize);
		
		return session.selectList("BoardMapper.selectList",map);
	}

	public void insertOne(BoardDto boarddto) {
		session.insert("BoardMapper.insertBoard", boarddto);
	}

	public BoardDto selectOne(int id,boolean flag) {
		return session.selectOne("BoardMapper.selectBoardById", id);
	}

	public void updateOne(BoardDto boarddto) {
		session.update("BoardMapper.updateBoard", boarddto);
	}

	
    public boolean deleteOne(int id) {
    	try {
    		session.update("BoardMapper.updateMapper",id);
    		
    		
    	}catch(Exception e) {
    	System.out.println("여기!");
    	return true;
    	}
    	return false;
    }
//    public void decreaseStock(int id) {
//    	session.update("BoardMapper.updateMapper",id);
//    }
//    public int count
}
