public class Element 
{
	//defines two variables
    private int element;//value of each square
    private boolean called;//tracking if it is called or not
    public Element()
    {
    	element=0;
    	called=false;
    }
    public Element(int e,boolean c)
    {
    	element=e;
    	called=c;
    }
    public int getElement()
    {
    	return element;
    }
    public boolean getCalled()
    {
    	return called;
    }
    public void setElement(int e)
    {
    	element=e;
    }
    public void setCalled(boolean c)
    {
    	called=c;
    }
}
