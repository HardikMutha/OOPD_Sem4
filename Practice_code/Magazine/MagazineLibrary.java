
import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;
    MagazineLibrary()
    {
        this.magazines = new ArrayList<>();
    }
    public Magazine getMagazine(int index)
    {
        return new Magazine(magazines.get(index));
    }
    public void setMagazine(Magazine currMagazine,int index)
    {
        magazines.set(index, new Magazine(currMagazine));
    }
    public void addMagazine(Magazine m)
    {
        magazines.add(new Magazine(m));
    }
}
