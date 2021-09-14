public class carselling {
    public static void main(String[] args) {
        Integer i = 0;
        car comparation = new car();
        
        car mers = new car();
        mers.setMake("Mercesdes");
        mers.setModel("2022 C 300");
        mers.setPrice(45000);
        mers.setmaxHP(255.00);

        car pors = new car();
        pors.setMake("Porsche");
        pors.setModel("2022 718 Cayman");
        pors.setPrice(60500);
        pors.setmaxHP(300.00);

        car bent = new car();
        bent.setMake("Bentley");
        bent.setModel("2022 FLYING SPUR MULLINER");
        bent.setPrice(250000);
        bent.setmaxHP(542.00);

        car roll = new car();
        roll.setMake("Roll Royce");
        roll.setModel("2022 Ghost");
        roll.setPrice(311000);
        roll.setmaxHP(563.00);

        car audi = new car();
        audi.setMake("Audi");
        audi.setModel("2021 330i");
        audi.setPrice(41000);
        audi.setmaxHP(255.00);

        car[] list = new car[5];
        list[0]=mers;
        list[1]=pors;
        list[2]=bent;
        list[3]=roll;
        list[4]=audi;

        while(i<=4){
            comparation.compare(list[i], list[i+1]);
            i++;
        }
    }
}
