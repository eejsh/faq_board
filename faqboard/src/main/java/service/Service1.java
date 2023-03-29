package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import model.ListVo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class Service1 implements ServiceInter {
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "query";
		
	
	
	@Override
	public List<ListVo> listvo() throws Exception {
	
		Map<String, String> map = new HashMap<String, String>();
		
		List<ListVo> listvo = sqlSession.selectList(namespace+".lselect", map);
		
	return listvo;
	
	}

}
