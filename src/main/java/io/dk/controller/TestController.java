package io.dk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.plugins.Page;

import io.dk.entity.BeautifulPictures;
import io.dk.service.BeautifulPicturesService;



/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author DavidKing
 * @since 18/04/08 下午3:04.
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	BeautifulPicturesService beautifulPicturesService;
	
	@RequestMapping("/test1")  //参数：current 要获取当前页数  ；size  获取的条数
	public String view(Model model,Page<BeautifulPictures> page) {
		Page<BeautifulPictures> pageList= beautifulPicturesService.selectPage(page);
		model.addAttribute("user",JSON.toJSONString(pageList.getRecords()));
		return "index";
    }
	@RequestMapping("/test2")
	public String t_io(){
		return "t_io_Test";
	}
}
