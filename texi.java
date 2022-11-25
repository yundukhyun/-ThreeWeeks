public class texi {
    static int texiNumber; //택시 번호
    int oil=100; //주유량
    int speed; //현재 속도
    int destination; // 목적지(거리)
    int baseDistance = 1000; // 기본거리(거리)
    int basePay = 5000;// 기본요금
    int distancePay = 500;//거리당 요금
    public texi(int oil,int destination ){     //목적지 택시번호 주유량
        texiNumber++;

    }
}
