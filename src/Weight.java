public class Weight {

    private Memory memory = new Memory();

    public double kgtog (double weight) {
        weight = weight*1000 ;
        memory.addToMemory(weight);
        System.out.println("The weight from kg in g is " + weight);
        return weight;
    }
    public double gtokg (double weight) {
        weight = weight/1000;
        memory.addToMemory(weight);
        System.out.println("The weight from g to kg is " + weight);
        return weight;


    }
}
