/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package comp.menu_drogueria;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhoan
 */
public class Menu_drogueria {
    /*
    
    */

    public static void main(String[] args) {
       /*
       creamos un do while y le ponemos como cnidcion al while que mientras sea si se repita
       despues le mostarmos al usuario las categorias de los medicamentos que hay y que elija una 
        despues creamos un switch y un caso para cada una de las opciones y dentro de esta vamos a mostrar los tipos de medicamentos 
        que hay de esa categoria y luego creamos otro switch y un caso para cada tipo de medicamento y dentro de estos mostraremos el precio del medicamento 
        e iremos sumando este en una variable tipo int, por ultimo preguntamos al usuario si quiere otro medicamento, si el digita Si se repite el proceso y 
       si digita no se termina el ciclo y se le muestra el total a pagar 
        
        */
       int m,m1,precio,total = 0;
        String s;
    do{
        m=Integer.parseInt(JOptionPane.showInputDialog("Elija la categoria de medicamento que necesita"
                + "\n1 Antibioticos"
                + "\n2 Antiinflamatorio"
                + "\n3 Antidepresivo"
                + "\n4 Anticolinergico"
                + "\n5 Anticonceptivo"));
        switch(m){
            case 1:
               m1=Integer.parseInt(JOptionPane.showInputDialog("Elija el medicamento que desea comprar"
                + "\n1 Amoxicilina"
                + "\n2 Ampicilina"
                + "\n3 Cefalaxina"
                + "\n4 Colistina"
                + "\n5 Colistina"
                + "\n6 Clofazimina"
                       + "\n7 Sulfadiazina"
                       + "\n8 Vancomicina"
                       + "\n9 Ciprofloxacina"
                       + "\n10 Eritromicina"));
               switch(m1){
                   case 1:
                       precio=10000;
                       total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 2:
                        precio=5000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                       case 3:
                        precio=4000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 4:
                        precio=12000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                   case 5:
                       precio=11000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 6:
                       precio=8000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 7:
                       precio=2000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 8:
                       precio=12000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 9:
                       precio=8000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 10:
                       precio=3800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                     }
               break;
            case 2:
                 m1=m=Integer.parseInt(JOptionPane.showInputDialog("Elija el medicamento que desea comprar"
                + "\n1 Ibuprofeno"
                + "\n2 Aspirina"
                + "\n3 Paracetamol"
                + "\n4 Naproxeno"
                + "\n5 Enantyum"
                + "\n6 Flurbiprofeno"
                       + "\n7 Piroxicam"
                       + "\n8 Diclofenaco"
                       + "\n9 Celecoxib"
                       + "\n10 Fenilbutazona"));
               switch(m1){
                   case 1:precio=14000;
                       total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 2:
                        precio=15000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                       case 3:
                        precio=9000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 4:
                        precio=16500;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                   case 5:
                       precio=6000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 6:
                       precio=9000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 7:
                       precio=11500;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 8:
                       precio=7800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 9:
                       precio=20000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 10:
                       precio=18000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                     }
               break;
               
            case 3:
                m1=m=Integer.parseInt(JOptionPane.showInputDialog("Elija el medicamento que desea comprar"
                + "\n1 Citalopram"
                + "\n2 Escitalopram"
                + "\n3 Fluoxetina"
                + "\n4 paroxetina"
                + "\n5 sertralina"
                + "\n6 Mirtazapina"
                       + "\n7 Bupropión"
                       + "\n8 Venlafaxina"
                       + "\n9 Sertralina"
                       + "\n10 Nefazodona"));
               switch(m1){
                   case 1:
                       precio=24000;
                       total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 2:
                        precio=15000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                       case 3:
                        precio=30000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 4:
                        precio=46500;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                   case 5:
                       precio=29000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 6:
                       precio=45000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 7:
                       precio=31800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 8:
                       precio=27800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 9:
                       precio=12300;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 10:
                       precio=9700;
                        total+=precio;
                     JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                     }
               break;
            case 4:
                m1=m=Integer.parseInt(JOptionPane.showInputDialog("Elija el medicamento que desea comprar"
                + "\n1 Diciclomina"
                + "\n2 Flavoxato"
                + "\n3 Ipratropio"
                + "\n4 Oxibutinina"
                + "\n5 Pirenzepina"
                + "\n6 Tiotropio"
                       + "\n7 Tolterodina"
                       + "\n8 Trimetafan"
                       + "\n9 Doxacurio"
                       + "\n10 Pancuronio"));
               switch(m1){
                   case 1:
                       precio=44000;
                       total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 2:
                        precio=55000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                       case 3:
                        precio=20000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 4:
                        precio=16500;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                   case 5:
                       precio=39000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 6:
                       precio=65000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 7:
                       precio=81800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 8:
                       precio=47800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 9:
                       precio=62300;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 10:
                       precio=29700;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                     }
               break;
            case 5:
                m1=m=Integer.parseInt(JOptionPane.showInputDialog("Elija el medicamento que desea comprar"
                + "\n1 Preservativo masculino"
                + "\n2 Preservativo femenino"
                + "\n3 Diafragma"
                + "\n4 Pastilla"
                + "\n5 Anillo"
                + "\n6 Parche Transdermico"
                       + "\n7 Inyección"
                       + "\n8 Implante "
                       + "\n9 Espermicidas"
                       + "\n10 Esponja vaginal"));
               switch(m1){
                   case 1:
                       precio=12000;
                       total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 2:
                        precio=10000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                       case 3:
                        precio=15000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 4:
                        precio=26500;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                   case 5:
                       precio=19000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 6:
                       precio=38000;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 7:
                       precio=21800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 8:
                       precio=17800;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 9:
                       precio=22300;
                        total+=precio;
                       JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                   case 10:
                       precio=9700;
                        total+=precio;
                     JOptionPane.showMessageDialog(null,"El precio de este medicamento es: $"+precio);
                       break;
                     }
               break;
            default:
               JOptionPane.showMessageDialog(null,"ERROR,Digitaste un opcion incorrecta");                
        }
       s=JOptionPane.showInputDialog("desea comprar otro medicamento");
        
    }while(s.equals("SI") || s.equals("Si")|| s.equals("si"));    
        
    JOptionPane.showMessageDialog(null,"El total a pagar es: $"+total); 
    }
}
