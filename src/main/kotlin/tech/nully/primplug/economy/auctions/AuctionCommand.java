package tech.nully.primplug.economy.auctions;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tech.nully.primplug.economy.Time;

import java.util.HashMap;

public class AuctionCommand implements CommandExecutor{

    public static HashMap<Long, Auction> auctions = new HashMap<Long, Auction>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        //Player checker
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can execute this Command");
            return false;
        }
        Player p = (Player) sender;

        // Command handler
        if (cmd.getName().equalsIgnoreCase("auc")) {
            if (args[0].equalsIgnoreCase("start") && args.length == 6) {

                // Checks if all of the number args are int
                boolean allIsNumb = true;
                for (int i = 1; i < 6; i++) {
                    String num = args[i];
                    try {
                        int time = Integer.parseInt(num);
                    } catch (NumberFormatException nfe) {
                        allIsNumb = false;
                        return false;
                    }
                    allIsNumb = true;
                }

                // Creates the auction
                if (allIsNumb) {
                    Time time = new Time(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
                    long timeInSecs = time.getSeconds() + (time.getMinutes()* 60L) + ((long) time.getHours() *60*60) + ((long) time.getDays() *24*60*60);
                    Auction auc = new Auction(p, Integer.parseInt(args[5]), p.getItemInHand(), time);
                    auctions.put(timeInSecs, auc);
                    Auction.sortAuctions();
                }
            }

            if (args[0].equalsIgnoreCase("list") || args.length == 1) {
                AuctionListGUI.OpenAuctionList(p);
            }
        }
        return false;
    }
}
