package net.prachit.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

class MapWrapper{
    Map<String, String> map = new HashMap<>();
    StampedLock stampedLock = new StampedLock();

    public String put(String key, String value){
        long stamp = stampedLock.writeLock();
        String oldValue = map.put(key, value);
        stampedLock.unlockWrite(stamp);
        return oldValue;
    }

    public String get(String key){
        long stamp = stampedLock.readLock();
        String value;
        try {
            value = map.get(key);
        }finally {
            stampedLock.unlockRead(stamp);
        }
        return value;
    }
}
public interface MyMap {

    int calculate(int i);
}

class AMap implements MyMap{

    StampedLock lock = new StampedLock();
    @Override
    public int calculate(int i) {
        long l = lock.readLock();
        int i1 = i * 2;
        lock.unlockRead(l);
        return i1;
    }
}



class PMap implements MyMap{

    @Override
    public int calculate(int i) {
        return i *3;
    }
}

/**
 * 1. Display
 * 2. Accept Money device
 * 3. Dispenser
 * 4. Calculation
 *
 *
 * Item Inventory
 *      item_id Name cost quantity
 *
 *
 * Ledger
 *
 *      id item_id quantity
 *
 * Calcualtion{
 *
 *     acceptCash(){
 *         money += money+cash;
 *     }
 *
 *     accepty(){
 *         valdation(money >= itemcost)
 *         dispense();
 *         updateInventory();
 *         notify()
 *     }
 *
 *     check(){ //API
 *         return invntory;
 *     }
 *
 *     notify(){
 *         if invnetory [item] == 0 ;
 *     }
 *
 *
 * }
 *
 *
 * class item {
 *     name,cost
 * }
 *
 *
 *
 *
 *
 */