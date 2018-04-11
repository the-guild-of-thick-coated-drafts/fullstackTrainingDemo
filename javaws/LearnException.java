public class LearnException{
    public static void main (String[] args){
        String s="hello";
        try{
        System.out.println("length is "+ s.length());
        System.out.println( "first argument is "+ args[0]);
        int i = Integer.parseInt(args[0]);
        int k = i/0;
        }catch(NullPointerException e1){
             System.out.println(" String s contains null value");
        }
        catch(ArrayIndexOutOfBoundsException e2){
             System.out.println(
                 " Arguments are not passed in command Line");
        } catch(Exception e){
            e.printStackTrace();
             System.out.println(
                "error occured in the program "+
                e.getMessage());
        }
        finally{
            System.out.println(
                " finally executes in all conditions");
        }

        System.out.println(" end of main statements");
    }
}