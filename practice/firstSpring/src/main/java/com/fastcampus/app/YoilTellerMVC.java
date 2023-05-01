package com.fastcampus.app;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YoilTellerMVC {
    @RequestMapping("/getYoilMVC") // http://localhost:8080/ch2/getYoil?year=2023&month=4&day=30
    //public void main(HttpServletRequest request, HttpServletResponse response) throws IOException { //response ���� ȭ�� ���
    public String main(int year, int month, int day, Model model) throws IOException { //view �̸�
       
    	
    	if (!isValid(year, month, day))
    		return "yoilError";
    	char yoil = getYoil(year, month, day);
    	
    	model.addAttribute("year",year);
    	model.addAttribute("month",month);
    	model.addAttribute("day",day);
    	model.addAttribute("yoil",yoil);
    	
        return "yoil";

//        // 3. ��� 
////        System.out.println(year + "�� " + month + "�� " + day + "���� "); // �ܼ� ���
////        System.out.println(yoil + "�����Դϴ�.");
//        response.setContentType("text/html");    // ������ ������ html�� ����
//        response.setCharacterEncoding("utf-8");  // ������ ���ڵ��� utf-8�� ���� ������ �ѱ� ����
//        PrintWriter out = response.getWriter();  // ���������� ��� ��Ʈ��(out)�� ��´�.
//        out.println("<html>"); // HTML �������� ����
//        out.println("<head>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println(year + "�� " + month + "�� " + day + "���� ");
//        out.println(yoil + "�����Դϴ�.");
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
        return " �Ͽ�ȭ�������".charAt(dayOfWeek);   // �Ͽ���:1, ������:2, ... 
	}
}