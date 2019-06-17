package com.gmail.nossr50.skills.repair;


import com.gmail.nossr50.skills.repair.RepairCost;

import java.util.HashSet;

/**
 * Represents a complete repair transaction
 * A repair transaction is made up of a multiple RepairCost objects
 * A RepairCost object is used to find a matching ItemStack in a players inventory if one exists
 * A RepairCost object can be a single item or it can be multiple items representing a range of compatible items to pay that part of the RepairTransaction
 */
public class RepairTransaction {
    private HashSet<RepairCost> repairItems;

    public RepairTransaction() {

    }

}
