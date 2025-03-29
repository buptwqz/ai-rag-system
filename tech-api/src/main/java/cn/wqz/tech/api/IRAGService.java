package cn.wqz.tech.api;

import cn.wqz.tech.api.response.Response;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/3/29 上午10:54
 * @GitHub: https://github.com/buptwqz
 * @Description:
 **/
public interface IRAGService {
    Response<List<String>> queryRagTagList();

    Response<String> uploadFile(String ragTag, List<MultipartFile> files);
}
