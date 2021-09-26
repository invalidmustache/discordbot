package DiscordBot.listener.impl;

import DiscordBot.Services.Impl.MessagingServiceImpl;
import DiscordBot.listener.AlanMomentListener;
import org.javacord.api.event.message.MessageCreateEvent;

public class AlanMomentListnerImpl implements AlanMomentListener {

    MessagingServiceImpl messagingService = new MessagingServiceImpl();

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if ((messageCreateEvent.getMessageContent().contains("nigger")) ||
            (messageCreateEvent.getMessageContent().contains("nazi")) ||
            (messageCreateEvent.getMessageContent().contains("nigga")))
            messagingService.sendMessage(
                    messageCreateEvent.getMessageAuthor(),
                    "Alan Moment",
                    messageCreateEvent.getMessageAuthor().getMessage().getContent(),
                    null,
                    "https://cdn.discordapp.com/attachments/890883747778543616/890971456387821578/image0.jpg",
                    messageCreateEvent.getChannel(),
                    false);
        }
    }
