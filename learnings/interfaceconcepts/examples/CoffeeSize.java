package learnings.interfaceconcepts.examples;

 enum  CoffeeSize {

    BIG(8), HUGE(9),BIGGEST(32);

    //This constructor does not have the string value so ity is confusing
    CoffeeSize(int size){
    this.size = size;

    }


    private int size;

    public int getSize(){
        return size;
    }
}
