package me.eglp.gv2.console.command;

import me.eglp.gv2.console.AbstractConsoleCommand;
import me.eglp.gv2.main.Graphite;
import me.eglp.gv2.main.GraphiteShard;
import me.mrletsplay.mrcore.command.event.CommandInvokedEvent;
import net.dv8tion.jda.api.JDA;

public class CommandCache extends AbstractConsoleCommand {

	public CommandCache() {
		super("cache");
	}

	@Override
	public void action(CommandInvokedEvent event) {
		event.getSender().sendMessage("--- Bot Graphite ---");
		for(GraphiteShard s : Graphite.getShards()) {
			event.getSender().sendMessage("+ Shard " + s.getID());
			JDA jda = s.getJDA();
			event.getSender().sendMessage("Users            = " + jda.getUserCache().size());
			event.getSender().sendMessage("Guilds           = " + jda.getGuildCache().size());
			event.getSender().sendMessage("Roles            = " + jda.getRoleCache().size());
			event.getSender().sendMessage("News channels    = " + jda.getNewsChannelCache().size());
			event.getSender().sendMessage("Private channels = " + jda.getPrivateChannelCache().size());
			event.getSender().sendMessage("Stage channels   = " + jda.getStageChannelCache().size());
			event.getSender().sendMessage("Text channels    = " + jda.getTextChannelCache().size());
			event.getSender().sendMessage("Thread channels  = " + jda.getThreadChannelCache().size());
			event.getSender().sendMessage("Voice channels   = " + jda.getVoiceChannelCache().size());
			event.getSender().sendMessage("Emoji            = " + jda.getEmojiCache().size());
			event.getSender().sendMessage("Audio managers   = " + jda.getAudioManagerCache().size());
			event.getSender().sendMessage("");
		}
	}

}
