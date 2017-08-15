//package com.nowcoder.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.*;
//import java.util.*;
//
///**
// * Created by 元海洋、 on 2017/7/29.
// */@Controller
//public class IndexController {
//
//     @RequestMapping("/hello/{id}")
//     @ResponseBody
//     public String hello(HttpServletRequest request,
//                         @RequestParam("age") Integer age,
//                         @PathVariable("id") String id){
//
//         return "age"+age+id;
//     }
//
//     @RequestMapping("/vm")
//     public String news(Model model){
//         model.addAttribute("value1","vv1");
//         List<String>colors= Arrays.asList(new String[]{"red","green","blue"});
//         Map<String,String>map=new HashMap<String,String>();
//         for(int i=1;i<5;i++){
//             map.put(String.valueOf(i),String.valueOf(i*i));
//         }
//         model.addAttribute("colors",colors);
//         model.addAttribute("map",map);
//         return "news";
//     }
//
//    @RequestMapping("/request")
//    @ResponseBody
//    public String request(HttpServletRequest request,
//                          HttpServletResponse response){
//        Enumeration<String>headerNames=request.getHeaderNames();
//        StringBuffer sb=new StringBuffer();
//        while(headerNames.hasMoreElements()){
//            String name=headerNames.nextElement();
//            sb.append(name+";"+request.getHeader(name)+"<br>");
//        }
//        Cookie cookie1=new Cookie("username","username");
//        response.addCookie(cookie1);
//        for(Cookie cookies:request.getCookies()){
//            sb.append(cookies.getName());
//            sb.append(":");
//            sb.append(cookies.getValue());
//            sb.append("<br>");
//        }
//
//        return sb.toString();
//    }
//
//
//    @RequestMapping("/session")
//    @ResponseBody
//    public Object session(HttpServletRequest request,
//                          HttpServletResponse response,HttpSession session) {
//        session.setAttribute("name","yhy");
//        return session.getAttribute("name");
//    }
//
//    //302跳转
//@RequestMapping(value = "/redirect",method = RequestMethod.GET)
//    public String redirect(){
//        return "redirect:/vm";
//}
//
//}
