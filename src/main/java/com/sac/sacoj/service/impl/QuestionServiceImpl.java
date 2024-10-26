package com.sac.sacoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sac.sacoj.model.entity.Question;
import com.sac.sacoj.service.QuestionService;
import com.sac.sacoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 30419
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-10-26 16:05:56
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




