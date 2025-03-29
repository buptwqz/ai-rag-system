package cn.wqz.tech.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/3/29 上午10:55
 * @GitHub: https://github.com/buptwqz
 * @Description:
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> implements Serializable {
    private String code;
    private String info;
    private T data;
}
