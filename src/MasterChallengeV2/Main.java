package MasterChallengeV2;

public class Main {
    public static void main(String[] args) {

//        MyLinkList mLL = new MyLinkList(null);
//        mLL.traverse(mLL.getRoot());

//        String stringData = "5 7 3 9 8 2 1 0 4 6";
//
//        String[] data = stringData.split(" ");
//        for(String s : data)
//        {
//            mLL.addItem(new Node(s));
//        }
//        mLL.traverse(mLL.getRoot());


        //remove
//        mLL.traverse(mLL.getRoot());
//        mLL.removeItem(new Node("3"));
//        mLL.traverse(mLL.getRoot());


        SearchTree st = new SearchTree(null);
        st.traverse(st.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for(String s : data)
        {
            st.addItem(new Node(s));
        }
        st.traverse(st.getRoot());



    }
}
