package com.tf.demo.dubbo.sb.zk.provider;

import com.tf.demo.dubbo.api.CalculateService;
import com.tf.demo.dubbo.api.ResultCode;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ServiceImpl implements CalculateService {
    @Override
    public ResultCode<Integer> sum(int i, int i1) {
        return new ResultCode<>(i+i1);
    }
}
