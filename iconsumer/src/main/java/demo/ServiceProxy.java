package demo;

import com.tf.demo.dubbo.api.CalculateService;
import com.tf.demo.dubbo.api.ResultCode;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class ServiceProxy {
    @Reference(interfaceClass = CalculateService.class)
    CalculateService calculateService;
    public ResultCode<Integer> sum(int a,int b){
        return calculateService.sum(a,b);
    }
}
