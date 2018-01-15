package com.hpwenxue.aspect;import com.hpwenxue.domain.User;import com.hpwenxue.utils.E;import org.aspectj.lang.JoinPoint;import org.aspectj.lang.annotation.Aspect;import org.aspectj.lang.annotation.Before;import org.aspectj.lang.annotation.Pointcut;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.stereotype.Component;import org.springframework.web.bind.annotation.RestControllerAdvice;/** * 保留字拦截，在发帖、注册、评论等请求时，进行拦截，如果内容包含相应对关键字，在此处进行处理 * @author : liuwenlong * @date : 2018/1/15 15:04 */@Aspect@Componentpublic class ReservedAspect {    private Logger logger = LoggerFactory.getLogger(getClass());    @Pointcut("execution(public * com.hpwenxue.controller.UserController.*.*(..))")    public void registerCut() {    }    @Before("registerCut()")    public void doBefore(JoinPoint joinPoint){        logger.info("------------");        String key = joinPoint.getSignature().getDeclaringTypeName();        logger.debug("切面拦截到到参数:"+key);        if (key.contains("sb")){            throw new E(1,"包含保留字，请重新输入");        }    }}