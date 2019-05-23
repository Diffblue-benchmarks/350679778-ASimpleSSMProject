package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;

import pojo.TestPojo;
import service.TestService;

/**
 *	进入首页及基础的增删改查功能
 * @author Admin
 * @date 2019年5月23日
 */
@Controller
@RequestMapping("/home")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	/**
	 * 	示例静态常量
	 */
	private static final String TEST_STRING = "String";
	
	/**
	 * 	打开主页
	 * @return 跳转首页
	 */
	@RequestMapping("/login")
	public String homePage() {
		//单行注释
		return "index";
	}
	
	/**
	 * 	查询列表，返回列表结果数据
	 * @return 查询列表结果
	 */
	@RequestMapping("/select")
	@ResponseBody
	public String selectList() {
		/*	多行注释
		 * 	多行注释
		 */
		List<TestPojo> list = testService.selectList();
		String jsonString = JSONUtils.toJSONString(list);
		return jsonString;
	}
	
	/**
	 * 	更新列表
	 * @param TestPojo testPojo类
	 * @return 返回成功或失败，0失败，大于0即成功
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String updatePojo(TestPojo TestPojo) {
		int result = testService.updateList(TestPojo);
		String resultStr = Integer.toString(result);
		return resultStr;
	}
	
}
