package businessman381.businesstools.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import businessman381.businesstools.Main;

public class Gamemode implements CommandExecutor, TabCompleter {
	
	Plugin plugin = Main.getPlugin(Main.class);
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
		
			if (args.length == 1) {
				
				Player player = (Player) sender;
				if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
					player.setGameMode(GameMode.SURVIVAL);
					player.sendMessage(ChatColor.GRAY + "Your gamemode has been changed to " + ChatColor.YELLOW + "survival.");
				} else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
					player.setGameMode(GameMode.CREATIVE);
					player.sendMessage(ChatColor.GRAY + "Your gamemode has been changed to " + ChatColor.YELLOW + "creative.");
				} else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
					player.setGameMode(GameMode.ADVENTURE);
					player.sendMessage(ChatColor.GRAY + "Your gamemode has been changed to " + ChatColor.YELLOW + "adventure.");
				} else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
					player.setGameMode(GameMode.SPECTATOR);
					player.sendMessage(ChatColor.GRAY + "Your gamemode has been changed to " + ChatColor.YELLOW + "spectator.");
				} else {
					sendInvalid(sender);
				}
				
			} else if (args.length == 2) {
				
				if (args[1].equalsIgnoreCase("@a")) {
				
					Player player = (Player) sender;
					if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
						for (Player target : Bukkit.getOnlinePlayers()) {
							if (target.getGameMode() == GameMode.SURVIVAL) continue;
							else {
								target.setGameMode(GameMode.SURVIVAL);
								try {
									if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
											plugin.getConfig().getList("notsilent-commands").contains("gm") ||
											plugin.getConfig().getList("notsilent-commands").contains("all"))
												target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "survival.");
								} catch (NullPointerException ex) {}
							}
						}
						player.sendMessage(ChatColor.GREEN + "All players' " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "survival.");
					} else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
						for (Player target : Bukkit.getOnlinePlayers()) {
							if (target.getGameMode() == GameMode.CREATIVE) continue;
							else {
								target.setGameMode(GameMode.CREATIVE);
								try {
									if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
											plugin.getConfig().getList("notsilent-commands").contains("gm") ||
											plugin.getConfig().getList("notsilent-commands").contains("all"))
												target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "creative.");
								} catch (NullPointerException ex) {}
							}
						}
						player.sendMessage(ChatColor.GREEN + "All players' " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "creative.");
					} else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
						for (Player target : Bukkit.getOnlinePlayers()) {
							if (target.getGameMode() == GameMode.ADVENTURE) continue;
							else {
								target.setGameMode(GameMode.ADVENTURE);
								try {
									if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
											plugin.getConfig().getList("notsilent-commands").contains("gm") ||
											plugin.getConfig().getList("notsilent-commands").contains("all"))
												target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "adventure.");
								} catch (NullPointerException ex) {}
							}
						}
						player.sendMessage(ChatColor.GREEN + "All players' " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "adventure.");
					} else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
						for (Player target : Bukkit.getOnlinePlayers()) {
							if (target.getGameMode() == GameMode.SPECTATOR) continue;
							else {
								target.setGameMode(GameMode.SPECTATOR);
								try {
									if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
											plugin.getConfig().getList("notsilent-commands").contains("gm") ||
											plugin.getConfig().getList("notsilent-commands").contains("all"))
												target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "spectator.");
								} catch (NullPointerException ex) {}
							}
						}
						player.sendMessage(ChatColor.GREEN + "All players' " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "spectator.");
					} else {
						sendInvalid(sender);
					}
					
				} else {
					
					if (Bukkit.getPlayer(args[1]) != null) {
					
					Player target = Bukkit.getPlayer(args[1]);
					Player player = (Player) sender;
					if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
						target.setGameMode(GameMode.SURVIVAL);
						try {
							if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
									plugin.getConfig().getList("notsilent-commands").contains("gm") ||
									plugin.getConfig().getList("notsilent-commands").contains("all"))
										target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "survival.");
						} catch (NullPointerException ex) {}
						player.sendMessage(ChatColor.GREEN + target.getName() + "'s " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "survival.");
					} else if (args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
						target.setGameMode(GameMode.CREATIVE);
						try {
							if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
									plugin.getConfig().getList("notsilent-commands").contains("gm") ||
									plugin.getConfig().getList("notsilent-commands").contains("all"))
										target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "creative.");
						} catch (NullPointerException ex) {}
						player.sendMessage(ChatColor.GREEN + target.getName() + "'s " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "creative.");
					} else if (args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
						target.setGameMode(GameMode.ADVENTURE);
						try {
							if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
									plugin.getConfig().getList("notsilent-commands").contains("gm") ||
									plugin.getConfig().getList("notsilent-commands").contains("all"))
										target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "adventure.");
						} catch (NullPointerException ex) {}
						player.sendMessage(ChatColor.GREEN + target.getName() + "'s " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "adventure.");
					} else if (args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
						target.setGameMode(GameMode.SPECTATOR);
						try {
							if (plugin.getConfig().getList("notsilent-commands").contains("gamemode") ||
									plugin.getConfig().getList("notsilent-commands").contains("gm") ||
									plugin.getConfig().getList("notsilent-commands").contains("all"))
										target.sendMessage(ChatColor.GREEN + player.getName() + ChatColor.GRAY + " has changed your gamemode to " + ChatColor.YELLOW + "spectator.");
						} catch (NullPointerException ex) {}
						player.sendMessage(ChatColor.GREEN + target.getName() + "'s " + ChatColor.GRAY + "gamemode has been changed to " + ChatColor.YELLOW + "spectator.");
					} else {
						sendInvalid(sender);
					}
					
					} else {
					
						sendInvalidPlayer(sender);
					
					}
					
				}
				
			} else {
				
				sendInvalid(sender);
				
			}
		
		} else {
		
			System.out.println("You can't use this command through console!");
			
		}
		
		return false;
		
	}
	
	private void sendInvalid(CommandSender sender) {
		
	    sender.sendMessage(ChatColor.RED + "Invalid usage." + ChatColor.GRAY + " Please use:");
	    sender.sendMessage(ChatColor.GRAY + "/gamemode [0/1/2/3] [player]");
	    sender.sendMessage(ChatColor.GRAY + "Aliases: " + ChatColor.YELLOW + "gm");
	  
	}
	
	private void sendInvalidPlayer(CommandSender sender) {
		
		sender.sendMessage(ChatColor.RED + "There is no such player on the server.");
		
	}
	
	@Override
	public ArrayList<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		if (args.length == 1) {
			
			l.clear();
			l.add("creative");
			l.add("survival");
			l.add("spectator");
			l.add("adventure");
			
		} else if (args.length == 2) {
			
			l.clear();
			for (Player p : Bukkit.getOnlinePlayers()) {
				l.add(p.getName());
			}
		
		}
		return l;
	}

}
