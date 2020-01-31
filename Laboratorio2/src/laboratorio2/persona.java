/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author Jacky
 */
class persona {
  private String nombre;
  
    private float sueldo;
    private float igss;
    private float isr;
    private float isrt;
    
    public persona()
    {
    nombre= "";
        sueldo= 0;
        igss=0;
        isr=0;
        isrt=0;
    }
    public persona(String n, float s, float ig, float is,float isp){
    
        nombre= n;
        sueldo= s;
        igss=ig;
        isr=is;
        isrt=isp;
    }
    public void setnombre(String n){
        this.nombre=n;
        
    }
    public String getnombre(){
        
        return nombre;
                
    }
    public void setsueldo(float s){
        this.sueldo=s;
        
    }
    public float getsueldo(){
        if(sueldo<5999){
           sueldo= (float)(sueldo*1); 
        }else if(sueldo>=6000&sueldo<=8000){
            sueldo=(float) (sueldo*0.05);
        }else if (sueldo>=8001&sueldo<=9500){
            sueldo=(float) (sueldo*0.06);
        }else if (sueldo>9501){
            sueldo=(float) (sueldo*0.08);
        }
        return sueldo;
                
}public void setigss(float ig){
        this.igss=ig;
        
    }
    public float getigss(){
        igss=   (float) (sueldo*0.0483);
        return igss;
                
    }public void setisr(float is){
        this.isr=is;
        
    }
    public float getis(){
        //isrt= (float)(sueldo*0.0483);
        return isr;
                
    }  
    public void setisrt(float isp){
        this.isrt=isp;
        
    }
    public float getisrt(){
        isrt= (float)(sueldo*0.05);
        return isrt;
                
    }  
}
