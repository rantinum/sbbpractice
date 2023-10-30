package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 1; i <= 30; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용뭉탱이";
            this.questionService.create(subject, content);
        }
    }
}
