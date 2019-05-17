package com.zz.blog.controller;


import com.alibaba.fastjson.JSON;
import com.zz.blog.entity.Result;
import com.zz.blog.pojo.Author;
import com.zz.blog.service.IAuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zz
 * @since 2019-05-17
 */
@Slf4j
@Controller
@RequestMapping("/blog/author")
@Api(tags = "author message")
public class AuthorController {

    @Autowired
    private IAuthorService iAuthorService;

    /**
     *
     * Description:查询单个作者信息
     * @auther: zz
     * @date: 2019/5/17 11:20
     */

    @RequestMapping(value = "findOneAuthor",method = {RequestMethod.POST})
    @ResponseBody
    @ApiOperation(value = "获取博客作者相关信息")
    @ApiResponses({
            @ApiResponse(code = 200,message = "请求成功"),
            @ApiResponse(code = 500,message = "服务器错误.")
    })
    public Result findOneAuthor(){

        Author author = iAuthorService.selectById(1);
        log.info("作者信息为: "+ JSON.toJSON(author));

        return  new Result(true,200,"作者信息成功返回!",author);
    }
}
