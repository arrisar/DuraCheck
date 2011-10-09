package arrisar.DuraCheck;
/**
 * DuraCheck - Simple and Easy durability check
 * @author Arrisar <james.dean.norman@gmail.com>
 */
import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;

public class DuraCheck extends JavaPlugin{
	
	private final Logger log = Logger.getLogger("Minecraft");

	public boolean usepermissions;
	
	public int woodMax = 60;
	public int stoneMax = 132;
	public int ironMax = 251;
	public int g_pick = 32;
	public int goldMax = 33;
	public int d_pick = 1563;
	public int diamondMax = 1562;
	public int flintSteel = 65;
	public int fishingRod = 33;
	public int shears = 238;
	
	public int uses;

	public static PermissionHandler permissionHandler;
	private void setupPermissions() {
	    if (permissionHandler != null) {
	        return;
	    }

	    Plugin permissionsPlugin = this.getServer().getPluginManager().getPlugin("Permissions");

	    if (permissionsPlugin == null) {
	        log.info("[" + getDescription().getName() + "] Permissions not detected, Everyone can use DuraCheck!");
	        usepermissions = false;
	        return;
	    }

	    permissionHandler = ((Permissions) permissionsPlugin).getHandler();
	    log.info("[" + getDescription().getName() + "] Found and will use plugin "+((Permissions)permissionsPlugin).getDescription().getFullName());
	    usepermissions = true;
	}
	public void onDisable() {
		log.info("[" + getDescription().getName() + "] " + getDescription().getName() + " was disabled.");		
	}
	public void onEnable() {
		
		setupPermissions();
		//Register Events

		// Loaded
		log.info("[" + getDescription().getName() + "] " + getDescription().getName() + " version " + getDescription().getVersion() + " by Arrisar: enabled.");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		readCommand((Player) sender, commandLabel);
		return false;
	}
	
	public void readCommand(Player player, String cmd){
		
			if(cmd.equalsIgnoreCase("dura")){

					if(player.getItemInHand().getType().equals(Material.FLINT_AND_STEEL)){
							uses = player.getItemInHand().getDurability();
							player.sendMessage("Tool used " + uses + " times. " + (flintSteel - uses) + " uses left.");
			 }
					
					if(player.getItemInHand().getType().equals(Material.SHEARS)){
							uses = player.getItemInHand().getDurability();
							player.sendMessage("Tool used " + uses + " times. " + (shears - uses) + " uses left.");
			 }
					
					if(player.getItemInHand().getType().equals(Material.FISHING_ROD)){
							uses = player.getItemInHand().getDurability();
							player.sendMessage("Tool used " + uses + " times. " + (flintSteel - uses) + " uses left.");
			 }
					
	            	if(player.getItemInHand().getType().equals(Material.WOOD_PICKAXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (woodMax - uses) + " uses left.");
	         }
	            	
	            	if(player.getItemInHand().getType().equals(Material.WOOD_AXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (woodMax - uses) + " uses left.");
	         }
	            	
	            	if(player.getItemInHand().getType().equals(Material.WOOD_SPADE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (woodMax - uses) + " uses left.");
	         }
	            	
	            	if(player.getItemInHand().getType().equals(Material.WOOD_HOE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (woodMax - uses) + " uses left.");
	         }
	            	
	            	if(player.getItemInHand().getType().equals(Material.STONE_AXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (stoneMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.STONE_PICKAXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (stoneMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.STONE_SPADE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (stoneMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.STONE_HOE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (stoneMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.IRON_AXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (ironMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.IRON_PICKAXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (ironMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.IRON_SPADE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (ironMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.IRON_HOE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (ironMax - uses) + " uses left.");
	         }
	            	if(player.getItemInHand().getType().equals(Material.GOLD_PICKAXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (g_pick - uses) + " uses left.");
	            	}
	            	if(player.getItemInHand().getType().equals(Material.GOLD_AXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (goldMax - uses) + " uses left.");
	            	}
	            	if(player.getItemInHand().getType().equals(Material.GOLD_SPADE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (goldMax - uses) + " uses left.");
	            	}
	            	if(player.getItemInHand().getType().equals(Material.GOLD_HOE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (goldMax - uses) + " uses left.");
	            	}
	            		if(player.getItemInHand().getType().equals(Material.DIAMOND_PICKAXE)){
		            	uses = player.getItemInHand().getDurability();
		            	player.sendMessage("Tool used " + uses + " times. " + (d_pick - uses) + " uses left.");
	            	}
	            		if(player.getItemInHand().getType().equals(Material.DIAMOND_AXE)){
			            	uses = player.getItemInHand().getDurability();
			            	player.sendMessage("Tool used " + uses + " times. " + (diamondMax - uses) + " uses left.");
		            	}
	            		if(player.getItemInHand().getType().equals(Material.DIAMOND_SPADE)){
			            	uses = player.getItemInHand().getDurability();
			            	player.sendMessage("Tool used " + uses + " times. " + (diamondMax - uses) + " uses left.");
		            	}
	            		if(player.getItemInHand().getType().equals(Material.DIAMOND_HOE)){
			            	uses = player.getItemInHand().getDurability();
			            	player.sendMessage("Tool used " + uses + " times. " + (diamondMax - uses) + " uses left.");
		            	}
		}
	}
}
