package enumDemo;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println(ResponseCode.SUCCESS.getCode());
        System.out.println(ResponseCode.ERROR.getCode());
        System.out.println(ResponseCode.ILLEGAL_ARGUMENT.getCode());
        System.out.println(ResponseCode.NEED_LOGIN.getCode());

        System.out.println(ResponseCode.SUCCESS.getDesc());

    }
}
