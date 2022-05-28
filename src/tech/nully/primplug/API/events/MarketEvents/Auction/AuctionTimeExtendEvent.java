package tech.nully.primplug.API.events.MarketEvents.Auction;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class AuctionTimeExtendEvent extends Event implements Cancellable {
    private Player BidderBefore;
    private Player BidSniper;

    public AuctionTimeExtendEvent(Player BidderBefore, Player BidSniper, List<ItemStack> hotbar, List<String> spells) {
        // TODO: Add the setters and getters Flag: Labor
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean arg0) {
        this.isCancelled = arg0;
    }

    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
