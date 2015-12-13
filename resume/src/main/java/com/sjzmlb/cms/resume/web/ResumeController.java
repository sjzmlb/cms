package com.sjzmlb.cms.resume.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sjzmlb.cms.resume.service.IResumeService;
import com.sjzmlb.cms.resume.vo.ResumeModel;
import com.sjzmlb.cms.resume.vo.ResumeQueryModel;
import com.sjzmlb.pageutil.Page;
import com.sjzmlb.util.json.JsonHelper;

@Controller
@RequestMapping(value="/resume")
public class ResumeController {
	@Autowired
	private IResumeService irs = null;
	
	@RequestMapping(value="toAdd",method=RequestMethod.GET)
	public String toAdd(){
		
		return "resume/add";
	}
	@RequestMapping(value="addStep1",method=RequestMethod.GET)
	public String addStep1(){
		
		return "resume/addStep1";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("rm") ResumeModel rm){
//		rm.setRegisterTime(DateFormatHelper.long2str(System.currentTimeMillis()));
		irs.create(rm);
		return "resume/success";
	}
	@RequestMapping(value="toUpdate/{resumeUuid}",method=RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable("resumeUuid") int resumeUuid){
		ResumeModel rm = irs.getByUuid(resumeUuid);
		model.addAttribute("rm", rm);
		return "resume/update";
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String post(@ModelAttribute("rm") ResumeModel rm){
		irs.update(rm);
		return "resume/success";
	}
	@RequestMapping(value="toDelete/{resumeUuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("resumeUuid") int resumeUuid){
		ResumeModel rm = irs.getByUuid(resumeUuid);
		model.addAttribute("rm", rm);
		return "resume/delete";
	}
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int resumeUuid){
		irs.delete(resumeUuid);
		return "resume/success";
	}
	@RequestMapping(value="toList",method=RequestMethod.GET)
	public String toList(@ModelAttribute("wm")ResumeWebModel wm,Model model){
		ResumeQueryModel cqm = null;
		if(wm.getQueryJsonStr()==null || wm.getQueryJsonStr().trim().length()==0){
			cqm =  new ResumeQueryModel();
		}else{
			cqm = (ResumeQueryModel)JsonHelper.str2Object(wm.getQueryJsonStr(), ResumeQueryModel.class);
		}
		
		cqm.getPage().setNowPage(wm.getNowPage());
		if(wm.getPageShow() > 0){
			cqm.getPage().setPageShow(wm.getPageShow());
		}
		
		Page dbPage = irs.getByConditionPage(cqm);
		
		//
		model.addAttribute("wm", wm);
		model.addAttribute("page", dbPage);
				
		return "resume/list";
	}
	@RequestMapping(value="toQuery",method=RequestMethod.GET)
	public String toQuery(){
		return "resume/query";
	}	
}
