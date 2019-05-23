package service;

import java.util.List;

import pojo.TestPojo;

/**
 * 首页serivce方法
 * @author Admin
 * @date 2019年5月23日
 */
public interface TestService {

	/**
	 * 查询TestPojo列表
	 * @return List<TestPojo> testPojo列表
	 */
	public List<TestPojo> selectList();

	/**
	 * 更新列表
	 * @param testPojo pojo 实体类
	 * @return 更新结果
	 */
	public int updateList(TestPojo testPojo);

}
