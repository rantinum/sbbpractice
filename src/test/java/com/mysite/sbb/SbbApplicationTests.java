package com.mysite.sbb;

import com.mysite.sbb.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("안녕하세요");
        q1.setContent("나는 심유정이다!!!!");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1); // 첫번째 질문 저장

        Question q2 = new Question();
        q2.setSubject("무슨 게시판 인가요?.");
        q2.setContent("QnA게시판 인가요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1); // 두번째 질문 저장

    }



}
