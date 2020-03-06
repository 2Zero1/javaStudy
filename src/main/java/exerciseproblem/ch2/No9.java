package exerciseproblem.ch2;

//x축을 따라 이동하며 가스를 소비하는 자동차를 모델링하는 Car 클래스를 구현하라. 지정한 마일(mile)만큼 드라이브하는 메서드, 지정한 수 만큼 가스 탱크에 갤런을
// 채우는 메서드, 원점과 연료 레벨로 현재 거리를 구하는 메서드를 구현하라. 생성자에 갤런당 마일 단위(miles/gallons)로 연료 효율성을 지정하라. 불변 클래스
//로 만들어야 하는가? 그렇거나 그렇지 않은 이유를 제시하라.

//지정한 마일만큼 드라이브 하는 메서드
// 지정한 수 만큼 가스 탱크에 갤런을 채우는 메서드.
// 원점과 연료 레벨로 현재 거리를 구하는 메서드를
// 생성자에 갤런당 마일 단위로 연료 효율성을 지정하라

// 얼마나 주행했는지 누적된 상태를 갖기 때문에 매번 상태가 바껴야 할 때마다 객체를 새로 생성한다면 메모리를 비효율적으로 사용하게 된다.

public class No9 {
    public static void main(String[] args) {
        Car car = new Car(10);
        car.fillFuel(1000);
        car.drive(100);
        System.out.println(car.getDrivingDistance());
    }


    public static class Car {
        private double kmPerMile;
        private double fuelAmount = 0;
        private double usedFuel = 0;
        public Car(double kmPerMile) {
            this.kmPerMile = kmPerMile;
        }

        public void drive(double mile) {
            if(isFuelEnough(mile)) {
                fuelAmount -= (1 / kmPerMile) * mile;
                usedFuel += (1 / kmPerMile) * mile;
            }
        }

        public void fillFuel(double gallon){
            this.fuelAmount += gallon;
        }

        public double getDrivingDistance() {
            return usedFuel * kmPerMile;
        }

        public boolean isFuelEnough(double mile) {
            return (fuelAmount - (1/kmPerMile) * mile) >= 0;
        }

    }
}
