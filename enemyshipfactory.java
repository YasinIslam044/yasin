/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemyshiptesting;

/**
 *
 * @author User
 */
public class enemyshipfactory {
    public enemyship makeEnemyShip(String newShipType){

         

        enemyship newShip = null;

         

        switch (newShipType) {
            case "U":
                return new ufoenemyship();
            case "R":
                return new rocketenemyship();
            case "B":
                return new bigufoenemyship();
            default:
                return null;
        }
    }

    
}
