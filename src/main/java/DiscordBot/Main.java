package DiscordBot;

import DiscordBot.listener.impl.*;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;


public class Main {

    public static void main(String[] args) {

        String token = "ODkwNjM5Mjg2MTI5NTQ5Mzcy.YUyueQ.1veTM90PAJkvS1I77DO1UrcRXmc";
        DiscordApi api = new DiscordApiBuilder().setToken(token)
                .setAllNonPrivilegedIntents()
                .login()
                .join();

        PingListenerImpl Ping = new PingListenerImpl();
        RateListenerImpl Rate = new RateListenerImpl();
        GayListenerImpl Gay = new GayListenerImpl();
        AlanMomentListnerImpl Alan = new AlanMomentListnerImpl();
        HelpListenerImpl Help = new HelpListenerImpl();

        api.addMessageCreateListener(Ping);
        api.addMessageCreateListener(Rate);
        api.addMessageCreateListener(Gay);
        api.addMessageCreateListener(Alan);
        api.addMessageCreateListener(Help);
    }
}