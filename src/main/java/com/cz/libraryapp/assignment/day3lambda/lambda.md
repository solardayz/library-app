# 자바에서 람다의 예제

## 람다를 사용하는 이유
### 간결한 문법
람다식을 사용하면 코드를 간결하게 표현할 수 있습니다. 함수형 인터페이스의 구현을 한 줄로 표현할 수 있어서 코드 양이 줄어듭니다.

### 익명 클래스 대체
람다식은 익명 클래스를 대체하여 코드를 간소화하며, 특히 함수형 인터페이스를 구현할 때 보다 간단하게 작성할 수 있습니다.

### 스트림 API와의 통합
람다식은 스트림 API와 자연스럽게 통합되어 데이터 처리를 더 간단하게 만들어줍니다.

### 함수형 프로그래밍 지원
람다식을 통해 함수를 값으로 다룰 수 있어 함수형 프로그래밍 패러다임을 적용하기 용이합니다.
```java
@FunctionalInterface
interface Adder {
    int add(int a, int b);
}
```

## 람다식을 사용하여 함수 구현:
```java
public class LambdaExample {
    public static void main(String[] args) {
        // 람다식을 사용하여 두 숫자를 더하는 함수 구현
        Adder addFunction = (a, b) -> a + b;

        // 함수 호출 및 결과 출력
        int result = addFunction.add(3, 5);
        System.out.println("두 숫자의 합: " + result);
    }
}
```
