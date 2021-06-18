public class Nil implements ImmutableList {
    public Nil() {
     }//NILL constructor
     
     public int length(){
        return 0;}
    
    public int sum(){
       return 0;}
    
    public ImmutableList append (final ImmutableList m){
       return m; }
      
       public boolean contains(final int value){
        return false;}

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode
} // Nil
    