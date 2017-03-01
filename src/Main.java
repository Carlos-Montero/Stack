

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        StackImpl<Integer> st = new StackImpl<Integer>(10);

        try{
            st.push(10);
            st.push(12);
            st.push(15);
            st.push(15);
            st.push(15);
            st.push(15);
            st.push(15);


            st.pop();
            st.pop();
            st.pop();


        }

        catch (Exception ex) {
            System.out.println("Recovered StackTrace: \n");
            ex.printStackTrace();
        }
    }
}