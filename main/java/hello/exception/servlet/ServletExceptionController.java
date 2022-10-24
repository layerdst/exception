package hello.exception.servlet;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Controller
public class ServletExceptionController {
    @GetMapping("/error-ex")
    public void errorEx(){
        throw new RuntimeException("예외발생");
    }

    @GetMapping("/error-404")
    public void error404(HttpServletResponse resp) throws IOException {
        resp.sendError(404, "404오륲");
    }

    @GetMapping("/error-500")
    public void error500(HttpServletResponse resp) throws IOException {
        resp.sendError(500);
    }
}
