import java.util.HashMap;

/**
 * Name: David DeBow
 * Date: 11/28/2021
 * Explanation: Extends Monster.java. A bad rat like guy that isn't too tough to beat.
 * Title: Kobold.java
 **/

public class Kobold extends Monster{

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP,xp,items);
    }

    @Override
    public String toString(){
        return "Kobold has : " + super.toString();
    }
}
