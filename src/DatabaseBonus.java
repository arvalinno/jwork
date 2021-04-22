import java.util.ArrayList;

/**
 * kelas DatabaseBonus
 *
 * @author Arvalinno
 * @version 01.04.2021
 */
public class DatabaseBonus
{
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id){
        Bonus bonusA = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonusA = bonus;
            }
        }
        return bonusA;
    }

    public static Bonus getBonusByRefferalCode(String refferalCode){
        Bonus bonusA = null;

        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                bonusA = bonus;
            }
        }
        return bonusA;
    }

    /**
     * method menambahkan bonus
     * @param bonus
     * @return boolean
     */
    public static boolean addBonus(Bonus bonus){
        for (Bonus element : BONUS_DATABASE) {
            if (bonus.getReferralCode() == element.getReferralCode()) {
                return false;
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activateBonus(int id){
        boolean booleanA = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                booleanA = true;
            }
        }
        return booleanA;
    }

    public static boolean deactivateBonus(int id){
        boolean booleanA = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                booleanA = true;
            }
        }
        return booleanA;
    }
    /**
     * method menghapus bonus
     * @param id
     * @return boolean
     */
    public static boolean removeBonus(int id){
        for (Bonus bonus : BONUS_DATABASE) {
            if (bonus.getId() == id) {
                BONUS_DATABASE.remove(bonus);
                return true;
            }
        }
        return false;
    }
}
