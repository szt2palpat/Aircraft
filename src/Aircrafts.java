public class Aircrafts {
    public int ammo;
    public int damage;
    public String type;


    public Aircrafts(int ammo,int damage){
        this.ammo=ammo;
        this.damage=damage;
    }
    public int flight(){
        int alldm=ammo*damage;
        ammo=0;
        return alldm;
    }
    public int refillAmmo(int amount){
int ramain=ammo-()

    }
    public void getType(String Type){
        this.type=Type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus(){
        return "Type: "+type+"Ammo: "+ammo+"Damage: "+damage;
    }
    public boolean isPriority(){
        if(type=="F35"){
            return true;
        }else
        {

            return false;
        }
    }
}
