package com.superapi.gamerealm.dto;

import com.superapi.gamerealm.model.troop.TroopType;

public class TroopDTO {
    private Long id;
    private TroopType type;
    private int level;
    private int trainingTime;
    private int[] resourcesNeeded;
    private int attack;
    private int defense;
    private int health;

    public TroopDTO(Long id, TroopType type, int level, int trainingTime, int[] resourcesNeeded, int attack, int defense, int health) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.trainingTime = trainingTime;
        this.resourcesNeeded = resourcesNeeded;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TroopType getType() {
        return type;
    }

    public void setType(TroopType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(int trainingTime) {
        this.trainingTime = trainingTime;
    }

    public int[] getResourcesNeeded() {
        return resourcesNeeded;
    }

    public void setResourcesNeeded(int[] resourcesNeeded) {
        this.resourcesNeeded = resourcesNeeded;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    // constructors, getters, and setters omitted for brevity
}
