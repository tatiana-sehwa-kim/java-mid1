package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress(("서울"));

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원 A, 회원 B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원 B의 주소를 부산으로 변경해야 함
//        memberB.getAddress().setValue("부산");  // 컴파일 오류
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");    //
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}

//    memberA = MemberV1{name='회원A', address=Address{value='서울'}}
//    memberB = MemberV1{name='회원B', address=Address{value='서울'}}
//    부산 -> memberB.address
//    memberA = MemberV1{name='회원A', address=Address{value='서울'}}
//    memberB = MemberV1{name='회원B', address=Address{value='부산'}}   memberB의 주소 새로 생성


