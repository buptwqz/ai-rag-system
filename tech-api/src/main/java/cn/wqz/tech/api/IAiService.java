package cn.wqz.tech.api;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.web.bind.annotation.RequestParam;
import reactor.core.publisher.Flux;

/**
 * @Author: Qizheng Wang
 * @Email: qizheng.wang@foxmail.com
 * @Date: 2025/3/28 下午6:57
 * @GitHub: https://github.com/buptwqz
 * @Description:
 **/
public interface IAiService {
    ChatResponse generate(String model, String message);
    Flux<ChatResponse> generateStream(String model, String message);
    Flux<ChatResponse> generateStreamRag(String model, String ragTag, String message);
}
