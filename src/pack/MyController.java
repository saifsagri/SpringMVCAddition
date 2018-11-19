package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.model.Calculation;

public class MyController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("index ");
		
		Calculation c = new Calculation();
		
		c.setN1(Integer.parseInt(arg0.getParameter("n1")));
		
		c.setN2(Integer.parseInt(arg0.getParameter("n2")));
		
		mv.addObject("addition",c.getAdd());


		
		return mv;
		
	}

}
