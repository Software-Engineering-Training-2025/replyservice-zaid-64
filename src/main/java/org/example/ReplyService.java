package org.example;

import java.util.HashMap;
import java.util.Map;

import static org.example.ReplyType.FORMAL;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {
    Map<String, Map<ReplyType, String>> repliesMap = new HashMap<>();

    public ReplyService() {
        addHi();
        addHello();
        addBye();
        addAccountHelp();
        addThanksReply();
        addHowRU();
        addNeedHelp();
        addWrongTextReply();
        addYourName();
    }

    private void addHi() {
        Map<ReplyType, String> Hi = new HashMap<>();
        Hi.put(FORMAL, "Hello. How may I assist you today?");
        Hi.put(ReplyType.FRIENDLY, "Hey there! \uD83D\uDE0A How can I help?");
        Hi.put(ReplyType.CONCISE, "Hello. How can I help?");
        repliesMap.put("hi", Hi);
    }

    private void addHello() {
        Map<ReplyType, String> hello = new HashMap<>();
        hello.put(FORMAL, "Hello. How may I assist you today?");
        hello.put(ReplyType.FRIENDLY, "Hi! \uD83D\uDC4B What’s up?");
        hello.put(ReplyType.CONCISE, "Hello. How can I help?");
        repliesMap.put("hello", hello);
    }

    private void addHowRU() {
        Map<ReplyType, String> howru = new HashMap<>();
        howru.put(FORMAL, "I am functioning properly. How may I assist you?");
        howru.put(ReplyType.FRIENDLY, "Doing great! \uD83D\uDE04 How can I help?");
        howru.put(ReplyType.CONCISE, "I’m good. How can I help?");
        repliesMap.put("how are you", howru);
    }

    private void addNeedHelp() {
        Map<ReplyType, String> NeedHelp = new HashMap<>();
        NeedHelp.put(FORMAL, "I can assist with that. Please provide more details.");
        NeedHelp.put(ReplyType.FRIENDLY, "I’ve got you! \uD83D\uDE42 Tell me a bit more.");
        NeedHelp.put(ReplyType.CONCISE, "Share details; I’ll help.");
        repliesMap.put("i need help", NeedHelp);
    }

    private void addAccountHelp() {
        Map<ReplyType, String> AccountHelp = new HashMap<>();
        AccountHelp.put(FORMAL, "Certainly. Please describe the account issue.");
        AccountHelp.put(ReplyType.FRIENDLY, "Sure thing! \uD83D\uDE0A What’s wrong with the account?");
        AccountHelp.put(ReplyType.CONCISE, "Describe the account issue…");
        repliesMap.put("can you help me with my account", AccountHelp);
    }

    private void addThanksReply() {
        Map<ReplyType, String> thanks = new HashMap<>();
        thanks.put(FORMAL, "You are welcome.");
        thanks.put(ReplyType.FRIENDLY, "Anytime! \uD83D\uDE4C");
        thanks.put(ReplyType.CONCISE, "You’re welcome.");
        repliesMap.put("thanks", thanks);
    }

    private void addBye() {
        Map<ReplyType, String> bye = new HashMap<>();
        bye.put(FORMAL, "Goodbye.");
        bye.put(ReplyType.FRIENDLY, "See you later! \uD83D\uDC4B");
        bye.put(ReplyType.CONCISE, "Goodbye.");
        repliesMap.put("bye", bye);
    }

    private void addYourName() {
        Map<ReplyType, String> yourName = new HashMap<>();
        yourName.put(FORMAL, "I am your virtual assistant.");
        yourName.put(ReplyType.FRIENDLY, "I’m your helper bot \uD83E\uDD16");
        yourName.put(ReplyType.CONCISE, "I’m your assistant.");
        repliesMap.put("what is your name", yourName);
    }

    private void addWrongTextReply() {
        Map<ReplyType, String> wrongText = new HashMap<>();
        wrongText.put(FORMAL, "Could you clarify your request?");
        wrongText.put(ReplyType.FRIENDLY, "Could you tell me more?");
        wrongText.put(ReplyType.CONCISE, "Please clarify.");
        repliesMap.put("anything", wrongText);
    }


    public String reply(String message, ReplyType type) {
        if (message == null || message.startsWith(" ")|| message.equals(""))
            return "Please say something.";

        message=message.toLowerCase();

        Map<ReplyType, String> replies = repliesMap.get(message);
        if (replies == null)
            replies = repliesMap.get("anything");
        return replies.get(type);


    }

}
