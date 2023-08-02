package com.superapi.gamerealm.dto;

import com.superapi.gamerealm.model.buildings.BuildingType;

import java.math.BigDecimal;


    public class ResourceBuildingDTO {
        private Long id;
        private BuildingType type;
        private int level;
        private BigDecimal productionRate;
        private int maxLevel;
        private int[] resourcesNeeded;
        private long timeLeft;

        public ResourceBuildingDTO() {
        }

        public ResourceBuildingDTO(Long id, BuildingType type, int level, BigDecimal bigDecimal, int maxLevel, int[] resourceBuildingResourcesNeeded) {
        }


        public ResourceBuildingDTO(Long id, BuildingType type, int level, BigDecimal productionRate, int maxLevel, int[] resourcesNeeded, long timeLeft) {
            this.id = id;
            this.type = type;
            this.level = level;
            this.productionRate = productionRate;
            this.maxLevel = maxLevel;
            this.resourcesNeeded = resourcesNeeded;
            this.timeLeft = timeLeft;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public BuildingType getType() {
            return type;
        }

        public void setType(BuildingType type) {
            this.type = type;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public BigDecimal getProductionRate() {
            return productionRate;
        }

        public void setProductionRate(BigDecimal productionRate) {
            this.productionRate = productionRate;
        }

        public int getMaxLevel() {
            return maxLevel;
        }

        public void setMaxLevel(int maxLevel) {
            this.maxLevel = maxLevel;
        }

        public int[] getResourcesNeeded() {
            return resourcesNeeded;
        }

        public void setResourcesNeeded(int[] resourcesNeeded) {
            this.resourcesNeeded = resourcesNeeded;
        }

        public long getTimeLeft() {
            return timeLeft;
        }

        public void setTimeLeft(long timeLeft) {
            this.timeLeft = timeLeft;
        }
    }

