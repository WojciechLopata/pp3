import java.util.ArrayList;

public class ShoppingList{
    private ArrayList<Product> lista =new ArrayList<Product>();

    public ArrayList<Product> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Product> lista) {
        this.lista = lista;
    }

    public void add(Product product){
        lista.add(product);

    }
    public String toString(){
        String zakupy="";
        for (Product product : lista){
            zakupy=zakupy+product.getName()+",";
        }
        return zakupy.substring(0,zakupy.length()-1);

    }
    public int total(){
        int sum=0;
        for (Product product : lista){
            sum=sum+product.getQuantity();
        }
        return sum;



    }
    
     public static void main(String[] args){
        ShoppingList a= new ShoppingList();
        a.add(new Product("Herbata", 3));
        a.add(new Product("Pomarańcze", 12));
        System.out.println(a.total());
        System.out.println(a.toString());



     }
}

