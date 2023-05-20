package xyz.device.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExceptionAspect {

    @AfterThrowing(value = "execution(* xyz.device.service.*.*(..))", throwing = "ex")
    public void afterException(Throwable ex) {
        if (ex instanceof NullPointerException) {
            System.out.println("NullPointerException 발생");
        } else if (ex instanceof IllegalArgumentException) {
            System.out.println("IllegalArgumentException 발생");
        } else if (ex instanceof ArithmeticException) {
            System.out.println("ArithmeticException 발생");
        } else if (ex instanceof RuntimeException) {
            // TODO 예외 타입 수정 필요?
            System.out.println("RuntimeException 발생");
        } else {
            System.out.println("기타 Exception 발생");
        }
    }
}
