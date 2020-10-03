package demo.controller;



import com.tf.demo.dubbo.api.ResultCode;
import demo.ServiceProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ControllerTest {
    @Resource
    ServiceProxy serviceProxy;
    @GetMapping("/sum")
    @ResponseBody
    public ResultCode<Integer> sum(Integer a, Integer b){
        return serviceProxy.sum(a,b);
    }
}
