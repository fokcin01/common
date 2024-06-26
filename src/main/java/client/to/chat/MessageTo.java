package client.to.chat;

import client.to.AbstractTo;
import client.to.UserTO;

import java.util.Date;

public class MessageTo extends AbstractTo {
    private final UserTO sender;
    private final Date date;
    private final String text;
    private final int chatId;

    public MessageTo(Integer id, UserTO sender, Date date, String text, int chatId) {
        super(id);
        this.sender = sender;
        this.date = date;
        this.text = text;
        this.chatId = chatId;
    }

    public UserTO getSender() {
        return sender;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public int getChatId() {
        return chatId;
    }
}
