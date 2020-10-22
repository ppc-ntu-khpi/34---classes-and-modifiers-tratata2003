> # Працював у середовищі NetBeans 8.2

![NetBeans](https://upload.wikimedia.org/wikipedia/commons/9/98/Apache_NetBeans_Logo.svg)
-----
Виконав другу практичну по Java:
## Перше завдання 
### Код створення приватних атрибутів:
    private int ID;
    private boolean isNew;
    private float total;
 
## Друге завдання
### Код методу displayCustomerInfo():
        System.out.println("Id customers: " + ID);
        System.out.println("Customer new? : " + isNew);
        System.out.println("Total purchases are: " + total);
## Вийшло:
![img](https://github.com/ppc-ntu-khpi/34---classes-and-modifiers-tratata2003/blob/main/Solution/done.png)


# На 5 балів
## Перероблений клас Customer:
   
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
     //Сетери  
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
## Результат роботи програми:
![img](https://github.com/ppc-ntu-khpi/34---classes-and-modifiers-tratata2003/blob/main/Solution/advanced.png)
