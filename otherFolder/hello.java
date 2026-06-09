package otherFolder;

import chapter4.AccessModifier;
import static chapter4.VarArgsLesson.getEarthsGravity;;

//rmp return type method name parenthesis 
public class hello {
    public static void main(String[] args) {
        AccessModifier gm1 = new AccessModifier();
        gm1.greetMe();
        // acm1.greetMe2();
        // acm1.greetMe3();
        // acm1.greetMe4();
    }

    
}

class MoonFlower extends AccessModifier{
    public static void main(String[] args) {
        MoonFlower mf = new MoonFlower();
        mf.greetMe();
        mf.greetMe3();
        // mf.greetMe4();
        System.out.println(getEarthsGravity());
    }
}
