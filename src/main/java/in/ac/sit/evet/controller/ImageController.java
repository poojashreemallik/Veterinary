package in.ac.sit.evet.controller;

import in.ac.sit.evet.service.CaseService;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImageController {

	@Autowired
	CaseService caseService;
	
	@RequestMapping(value="/imagedisplay", method=RequestMethod.GET)
	public void showImage(@RequestParam("caseId") Integer  caseId, HttpServletResponse response)
	{
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		try {
			response.getOutputStream().write(caseService.viewCase(caseId).getImageRawData());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
