package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TestDao;
import pojo.TestPojo;
import service.TestService;


@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDao testDao;
	

	public List<TestPojo> selectList() {
		List<TestPojo> list = testDao.selectList();
		return list;
	}
	

	public int updateList(TestPojo testPojo) {
		int result = testDao.updateList(testPojo);
		return result;
	}

}
