package com.superapi.gamerealm.model.resources;

public class Upgrade {


    public static final int[] RESOURCE_BUILDING_PRODUCTION_RATES = {4, 10, 22, 46, 94, 140, 200, 306, 500, 1070};
    public static final int[] RESOURCE_BUILDING_UPGRADE_TIMES = {1, 5, 10, 40, 80, 120, 240, 640, 1280, 2560};
    public static final int[][] FOREST_RESOURCES_NEEDED = {
            {100, 200, 100, 50},
            {150, 300, 150, 75},
            {225, 450, 225, 113},
            {338, 675, 338, 169},
            {507, 1013, 507, 253},
            {761, 1522, 761, 380},
            {1142, 2283, 1142, 571},
            {1713, 3425, 1713, 857},
            {2570, 5141, 2570, 1285},
            {3855, 7709, 3855, 1927}
    };

    public static final int[][] MINE_RESOURCES_NEEDED = {
            {250, 250, 250, 50},
            {375, 375, 375, 75},
            {563, 563, 563, 113},
            {845, 845, 845, 169},
            {1267, 1267, 1267, 253},
            {1901, 1901, 1901, 380},
            {2851, 2851, 2851, 571},
            {4276, 4276, 4276, 857},
            {6414, 6414, 6414, 1285},
            {9621, 9621, 9621, 1927}
    };
    public static final int[][] QUARRY_RESOURCES_NEEDED = {
            {200, 100, 100, 50},
            {300, 150, 150, 75},
            {450, 225, 225, 113},
            {675, 338, 338, 169},
            {1013, 507, 507, 253},
            {1522, 761, 761, 380},
            {2283, 1142, 1142, 571},
            {3425, 1713, 1713, 857},
            {5141, 2570, 2570, 1285},
            {7709, 3855, 3855, 1927}
    };

    public static final int[][] FARM_RESOURCES_NEEDED = {
            {200, 100, 100, 50},
            {300, 150, 150, 75},
            {450, 225, 225, 113},
            {675, 338, 338, 169},
            {1013, 507, 507, 253},
            {1522, 761, 761, 380},
            {2283, 1142, 1142, 571},
            {3425, 1713, 1713, 857},
            {5141, 2570, 2570, 1285},
            {7709, 3855, 3855, 1927}
    };
    public static int[] getResourceBuildingResourcesNeeded(String type, int level) {
        if (type.equals("forest")) {
            return FOREST_RESOURCES_NEEDED[level - 1];
        } else if (type.equals("mine")) {
            return MINE_RESOURCES_NEEDED[level - 1];
        } else if (type.equals("quarry")) {
            return QUARRY_RESOURCES_NEEDED[level - 1];
        } else if (type.equals("farm")) {
            return FARM_RESOURCES_NEEDED[level - 1];
        } else {
            throw new IllegalArgumentException("Invalid building type: " + type);
        }
    }
}
