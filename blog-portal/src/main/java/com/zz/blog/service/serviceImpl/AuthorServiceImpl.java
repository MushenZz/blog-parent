package com.zz.blog.service.serviceImpl;

import com.zz.blog.pojo.Author;
import com.zz.blog.mapper.AuthorMapper;
import com.zz.blog.service.IAuthorService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zz
 * @since 2019-05-17
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements IAuthorService {
	
}
