class RoohAfza extends  Decorator{
    RoohAfza(Offering offering){
        this.offering = offering;
    }
    
    String getName(){
        return offering.getName() + " with Rooh Afza";
    }
    
    int getPrice(){
        return offering.getPrice() + 100;
    }
}