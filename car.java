public class car {
    
    private String make;
    private String modle;
    private Double maxHP;
    private Double price;
    private Integer inStock = 5;
    private Integer sold = 0;
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String carMake) {
        this.make = carMake;
    }

    public String getModel() {
        return modle;
    }
    
    public void setModel(String carModel) {
        this.modle = carModel;
    }

    public Double getmaxHP() {
        return maxHP;
    }
    
    public void setmaxHP(Double MaxHP) {
        this.maxHP = MaxHP;
    }

    public Double getPrice() {
        return price;
    }
    
    public void setPrice(double carPrice) {
        this.price = carPrice;
    }

    public Integer getInStock() {
        return inStock;
    }
    
    public void setStock(Integer aviability) {
        this.inStock = aviability;
    }

    public Integer getSold() {
        return sold;
    }
    
    public void setSold(Integer carSold) {
        this.sold = carSold;
    }

    public void selling(){
        inStock--;
        sold++;
        System.out.println(getMake());
        System.out.print(getModel());
        System.out.print(getPrice());
    }
    
    public void advertising(){
        
        System.out.println(getMake() + getModel());
        System.out.println(getPrice());
        System.out.println(getmaxHP());
        System.out.println(getInStock());

    }

    public void compare(car x, car y){
        if (x.price > y.price){
            System.out.println(y.getMake()+" "+y.getModel()+" is "+ (x.price - y.price) +" cheaper than "+ x.getMake() +" "+ x.getModel());
        }
        else{
            System.out.println(x.getMake()+" "+x.getModel()+" is "+ (y.price - x.price) +" cheaper than "+ y.getMake() +" "+ y.getModel());
        }

        if (x.maxHP > y.maxHP){
            System.out.println(x.getMake()+" "+x.getModel()+"'s maximum horsepower is "+ (x.maxHP - y.maxHP) +" greater than "+ y.getMake() +" "+ y.getModel());
        }
        else{
            System.out.println(y.getMake()+" "+y.getModel()+"'s maximum horsepower is "+ (y.maxHP - x.maxHP) +" greater than "+ x.getMake() +" "+ x.getModel());
        }
    }
}
