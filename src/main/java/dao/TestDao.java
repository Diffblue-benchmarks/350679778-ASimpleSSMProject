package dao;

import com.sun.tools.javac.util.List;

import pojo.TestPojo;

/**
 * .首页列表Dao层
 * @author Admin
 * @date 2019年5月23日
 */
public interface TestDao {
	
	/**
	 * 查询列表
	 * @return List<TestPojo> 返回结果
	 */
	public List<TestPojo> selectList();

	/**
	 * 更新列表
	 * @param testPojo pojo 实体类
	 * @return 更新结果
	 */
	public int updateList(TestPojo testPojo);
	
}
