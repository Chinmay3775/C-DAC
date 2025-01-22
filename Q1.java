
public class Q1 {
    
        public static void main(String[] args) {
            
            String[] str= {"The","fifty","mannequin","heads","floating","in","the","apple","kind","of","freaked","them","out"};
    
            for( String s:str){
                if(endsWithVowel(s)){
                                System.out.println("String ends with vowel");
                            }
                            else System.out.println("String doesnt end with Vowel");
                        }
                
                    }
                
                    private static boolean endsWithVowel(String s) {
                        if(s==null||s.isEmpty()){
                        return false;
                        }

                        else{
                            char ch=s.charAt(s.length()-1);
                            return "aeiouAEIOU".indexOf(ch)!=-1;
                        }
            }                    
}

