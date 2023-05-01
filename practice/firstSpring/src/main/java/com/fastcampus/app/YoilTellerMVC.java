package com.fastcampus.app;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTellerMVC {
    @RequestMapping("/getYoilMVC") // http://localhost:8080/ch2/getYoil?year=2023&month=4&day=30
    //public void main(HttpServletRequest request, HttpServletResponse response) throws IOException { //response 서버 화면 출력
    public String main(int year, int month, int day, Model model) throws IOException { //view 이름
       
    	
    	if (!isValid(year, month, day))
    		return "yoilError";
    	char yoil = getYoil(year, month, day);
    	
    	model.addAttribute("year",year);
    	model.addAttribute("month",month);
    	model.addAttribute("day",day);
    	model.addAttribute("yoil",yoil);
    	
        return "yoil";

//        // 3. 출력 
////        System.out.println(year + "년 " + month + "월 " + day + "일은 "); // 콘솔 출력
////        System.out.println(yoil + "요일입니다.");
//        response.setContentType("text/html");    // 응답의 형식을 html로 지정
//        response.setCharacterEncoding("utf-8");  // 응답의 인코딩을 utf-8로 지정 없으면 한글 깨짐
//        PrintWriter out = response.getWriter();  // 브라우저로의 출력 스트림(out)을 얻는다.
//        out.println("<html>"); // HTML 형식으로 보냄
//        out.println("<head>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println(year + "년 " + month + "월 " + day + "일은 ");
//        out.println(yoil + "요일입니다.");
//        out.println("</body>");
//        out.println("</html>");
//        out.close();
//    }
        
        
        
        
}

	private boolean isValid(int year, int month, int day) {
		// TODO Auto-generated method stub
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
    	cal.set(year,  month-1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);   
        return " 일월화수목금토".charAt(dayOfWeek);   // 일요일:1, 월요일:2, ... 
	}
}