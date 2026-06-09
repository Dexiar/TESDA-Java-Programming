package otherFolder;

import chapter4.AccessModifier;

//rmp return type method name parenthesis 
public class hello {
    public static void main(String[] args) {
        AccessModifier greetings = new AccessModifier();
        greetings.greetMe();
    }
}

class MoonFLower extends AccessModifier{
    public static void main(String[] args) {
        MoonFLower mf = new MoonFLower();
        mf.greetMe();
        mf.greetMe3();
    }
}
