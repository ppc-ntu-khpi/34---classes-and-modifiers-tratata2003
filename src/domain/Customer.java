
package src.domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private float total;
    
    public Customer(){
         ID = 2;
         isNew = true;
         total = 2000F;
    }
        
    public void setID(int id){
        if(id > 0 && id < 100)
        {
            ID = id;
        }
        else
        {
           ID = 0; 
        }
    }
    public void setIsNew(boolean isnew){
        isNew = isnew;
    }
    
    public void setTotal(float _total){
        if(_total > 0)
        {
            total = _total;
        }
        else
        {
           total = 0; 
        }
    }
    
    public void displayCustomerInfo()
    {
        System.out.println("Id customers: " + ID);
        System.out.println("Customer new? : " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
