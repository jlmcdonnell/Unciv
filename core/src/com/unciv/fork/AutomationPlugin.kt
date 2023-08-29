package com.unciv.fork

import com.unciv.logic.civilization.Civilization
import com.unciv.models.ruleset.INonPerpetualConstruction

object AutomationPlugin {
    fun allowSpendingResource(civInfo: Civilization, construction: INonPerpetualConstruction): Boolean {
        val requiredResources = construction.getResourceRequirementsPerTurn()

        if (civInfo.isHuman() && requiredResources.containsKey("Uranium")) {
            println("Don't allow uranium")
            return false
        }

        if (construction.name == "Spaceship Factory") {
            println("Don't allow Spaceship Factory")
            return false
        }

        return true
    }
}
