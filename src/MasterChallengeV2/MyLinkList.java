package MasterChallengeV2;

import java.util.List;

public class MyLinkList implements NodeList{

    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null)
        {   //if empty
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null)
        {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0)
            {
                //newItem is grater move it to the right
                if(currentItem.next() != null)
                {
                    currentItem = currentItem.next();
                }
                else
                {   //add at the end of the list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    //newItem.setPrevious(currentItem);
                    return true;
                }
            }
            else if(comparison >0) {
                // newItem is less, insert before the current item
                // check if previous item exits
                if(currentItem.previous() != null) {
                    // previous item exists so on the previous item set the next item to be the current item
                    // setNext returns the item that was set as next in this case newItem
                    // so for the new item that was insert set the previous
                    // setPrevious call will set previous link to be the same item that is previous on current item
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());

                    // for the new item setNext to be current and again returns the currentItem itself
                    // again call setPrevious on the current to be new item
                    newItem.setNext(currentItem).setPrevious(newItem);

                    //OR same thing

//                    currentItem.previous().setNext(newItem); // on the previous of current item set next to be new item
//                    newItem.setPrevious(currentItem.previous()); // on new item set previous to be previous of current item
//                    newItem.setNext(currentItem); // on new item set next to be current item
//                    currentItem.setPrevious(newItem); // on current item set previous to be new item



                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }
            else
            {
                //equal
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if(item != null)
        {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currntItem = this.root;
        while(currntItem != null)
        {
            int comparison = currntItem.compareTo(item);
            if(comparison == 0)
            {//found item to delete
                if(currntItem ==this.root)
                {//make its pointing at that next item (iteratoration)
                    this.root = currntItem.next();
                }
                else
                {
                    currntItem.previous().setNext(currntItem.next());
                    if (currntItem.next() != null)
                    {
                        currntItem.next().setPrevious(currntItem.previous());
                    }
                }
                return true;
            }
            else if (comparison < 0)
            {
                currntItem = currntItem.next();
            }
            else
            {
                //if grater than 0
                // we are at n item grater than the one to be deleted
                //so return anyother than that one taht needs to be deleted
                return false;
            }
        }
        ///we have reached the end of the list
        //without finding item to delete
        return false;

    }

    @Override
    public void traverse(ListItem root) {

        if (root == null)
        {

            System.out.println("The list is empty");
        }
        else
        {
            while(root != null)
            {
                System.out.println(root.getValue());
                root = root.next();
            }
        }


        //        //SECOND VERSION if to bigg it will crash
//
//        if(root != null)
//        {
//            System.out.println(root.getValue());
//            traverse((root.next()));
//        }



    }

}
