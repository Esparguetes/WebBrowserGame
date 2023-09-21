package com.superapi.gamerealm.controller;

import com.superapi.gamerealm.model.Village;
import com.superapi.gamerealm.model.troop.VillageTroops;
import com.superapi.gamerealm.service.CombatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/combat")
public class CombatController {

    private final CombatService combatService;

    @Autowired
    public CombatController(CombatService combatService) {
        this.combatService = combatService;
    }

    @PostMapping("/attack")
    public String initiateAttack(@RequestBody AttackRequest request) {
        List<VillageTroops> attackingTroops = request.getAttackingTroops();
        List<VillageTroops> defendingTroops = request.getDefendingTroops();
        Village defendingVillage = request.getDefendingVillage();

        combatService.basicAttack(attackingTroops, defendingTroops, defendingVillage);
        return "Attack completed";
    }
}