public class Base {
    public int l,w,h;
    
    Base()
    {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Base(int length,int width,int height){
        this.l = length;
        this.w = width;
        this.h = height;
    }
}

class Child extends Base {
    public int weight;
    public Child(int l,int w,int h,int weight)
    {
        super(l,w,h);
        this.weight = weight;
    }
}


