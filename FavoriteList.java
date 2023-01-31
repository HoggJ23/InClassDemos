public class FavoriteList extends ListADT<Favorite>{ // creating a Favortie list with characteristcis of ListADT 
    private static final int MAX_FAVORTIES = 50;
    private int numFavorites;
    private Favorite[] favorites;

    public FavoriteList() {//  creating a constructor
        
        this.numFavorites = 0;
        this.favorites = new Favorite[MAX_FAVORITES];

    }

    @Override 
    public boolean isEmpty() {
        return (this.numFavorites == 0);
    }

    @Override 
    public int getSize() {
        return this.numFavorites;
    }
    @Override 
    public void add (int index, Favorite item) { // getting the index of the added Item
        if((index < 0 || index > this.getSize()))// throwing the exception
        throw new ListException("" + index + "index is invalid for list of size " + this.getSize());


        for(int i = this.getSize(); i < index; i--) // here the loop is strarting at the end of the array 
            this.favorotes[i] = this.favorites[i- 1];// taking the index and subtracting it by one 

            this.favorites[index] = item;
            this.numFavorites++;// adding more boxes the array 

    }

    @Override 
    public void remove(int index) {// to remove you have to find the empty one and then shift to the left, subtract overall index -1 
        if((index < 0 || index >= this.getSize()))// throwing the exception
        throw new ListException("" + index + "index is invalid for list of size " + this.getSize());

        
        for(int i = index + 1; i < this.getSize(); i++)
            this.favorotes[i - 1] = this.favorites[i];// taking the index and subtracting it by one 

            this.numFavorties--; // 
    }

    @Override 
    public void removeall() {
        this.numFavorties = 0;
        this.favorites = new Favorite[MAX_FAVORITES];
    }

    @Override 
    public Favorite get(int index) { // checks and see if the index is out of bounds and if it is it gets thrown 
        if((index < 0 || index >= this.getSize()))
            throw new ListException("" + index + "index is invalid for list of size " + this.getSize());

        return this.favorites[index];
    }
}
