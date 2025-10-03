package practice.Animal;

public class Zoo  {
    private Soundable[] animals;

    public Zoo(Soundable[] animals){
        this.animals  = animals;
    }
    public void makeAllSound(){
        for(Soundable animal : animals){
            animal.sound();
        }
    }







}
