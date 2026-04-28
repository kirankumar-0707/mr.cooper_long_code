import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InventoryService service = new InventoryService();
        System.out.println("1 : addsupplier"+" 2:addproduct"+" 3 :staockin"+" 4:stockout"+" 5: displayInventory"+" 6: stockmovement"+" 7:exit");
        int sid=1;
        int pid=1;
        boolean val=true;
        while(val){
            System.out.print(" Enter your choice: ");
            int n=sc.nextInt();
            sc.nextLine();
            if(n==1){
                String s=sc.nextLine();
                service.addSupplier(new Supplier(sid,s));
                System.out.println("suceess");
                sid++;
            }
            else if(n==2){
                System.out.print("name");
                String v1=sc.nextLine();2
                System.out.println(" reorder level");
                int v2=sc.nextInt();
                service.addProduct(new Product(pid, v1, v2, sid));
                System.out.println("Added");
                pid++;
            }
            else if(n==3){
                System.out.println(" Enter the details for stock in");
                System.out.println("enterid");
                int n1=sc.nextInt();
                System.out.println("quantity");
                int n2=sc.nextInt();
                service.stockIn(n1, n2);
                System.out.println("Stockout");
            }
            else if(n==4){
                System.out.println(" Enter the details for stock out");
                System.out.println("enterid");
                int m1=sc.nextInt();
                System.out.println("quantity");
                int m2=sc.nextInt();
                service.stockOut(m1, m2);
            }
            else if(n==5){
                System.out.println("Inventory Status:");
                service.displayInventory();
            }
            else if(n==6){
                System.out.println("Stock Movements:");
                service.showMovements();
            }
            else{
                break;
            }
        }

    }
}