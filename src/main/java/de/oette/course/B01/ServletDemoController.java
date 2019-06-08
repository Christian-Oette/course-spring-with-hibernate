package de.oette.course.B01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class ServletDemoController {

    @GetMapping
    public void demo(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, InterruptedException {

        String userName = servletRequest.getParameter("user");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("The username is "+userName);
    }
}
