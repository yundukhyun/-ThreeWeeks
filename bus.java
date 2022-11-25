public class bus {
    int maxGuest = 30;//최대 허용 손님
    int todayGuest; //현재 손님
    int pay=1000;   //인당 요금
    static int busNumber=0;  //버스 번호
    int oil;        //주유량
    int speed=30;      //현재 속도
    String situation="운행중";  //상태
    public bus(int todayGuest,int oil){

        this.todayGuest = todayGuest;
        this.oil = oil;
        busNumber++;

        System.out.println();

    }
    public void busMass(){
        maxGuest -= todayGuest;

        System.out.println(busNumber+"번째 버스입니다.");
        if(maxGuest < 30 && maxGuest > 0){
            System.out.println("탑승 승객 수:" + todayGuest);
            System.out.println("잔여 승객 수:" + maxGuest);
        }else{
            System.out.println("정원초과입니다");
        }
        System.out.println("요금 확인:" + (todayGuest*pay) );
    }
    public void busOil(int oilUse,int speed){
        this.oil += oilUse;

        if(oil<=10){
            System.out.println("주유가 필요합니다.");
        }else{
            System.out.println("주유량"+ oil);
            System.out.println("현재 속도:"+(this.speed + speed));
        }
    }
    public void busSituation(String situation){
                                             //100
        if(situation.equals(this.situation) && oil>10){
            System.out.println("현재상태:" + "운행중");
        }else{
            System.out.println("현재상태:" + "차고지행");
        }

    }
    }
