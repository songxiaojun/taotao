package com.taotao.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.common.utils.JsonUtils;
import com.taotao.content.service.ContentService;
import com.taotao.pojo.TbContent;
import com.taotao.portal.pojo.AD1Node;

/**
 * 首页展示Controller
 * <p>Title: IndexController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class IndexController {
	
	@Value("${AD1_CATEGORY_ID}")
	private Long AD1_CATEGORY_ID;
	@Value("${AD1_WIDTH}")
	private Integer AD1_WIDTH;
	@Value("${AD1_WIDTH_B}")
	private Integer AD1_WIDTH_B;
	@Value("${AD1_HEIGHT}")
	private Integer AD1_HEIGHT;
	@Value("${AD1_HEIGHT_B}")
	private Integer AD1_HEIGHT_B;
	
	@Autowired
	private ContentService contentService;

	@RequestMapping("/index")
	public String showIndex(Model model) {
		//根据cid查询轮播图内容列表
		List<TbContent> contentList = contentService.getContentByCid(AD1_CATEGORY_ID);
		//把列表转换为Ad1Node列表
		List<AD1Node> ad1Nodes = new ArrayList<>();
		for (TbContent tbContent : contentList) {
			AD1Node node = new AD1Node();
			node.setAlt(tbContent.getTitle());
			node.setHeight(AD1_HEIGHT);
			node.setHeightB(AD1_HEIGHT_B);
			node.setWidth(AD1_WIDTH);
			node.setWidthB(AD1_WIDTH_B);
			node.setSrc(tbContent.getPic());
			node.setSrcB(tbContent.getPic2());
			node.setHref(tbContent.getUrl());
			//添加到节点列表
			ad1Nodes.add(node);
		}
		//把列表转换成json数据
		String ad1Json = JsonUtils.objectToJson(ad1Nodes);
		//把json数据传递给页面
		model.addAttribute("ad1", ad1Json);
		return "index";
	}
}
