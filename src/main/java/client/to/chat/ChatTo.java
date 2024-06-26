package client.to.chat;

import client.to.AbstractTo;
import client.to.UserTO;

import java.util.Date;
import java.util.Set;

public class ChatTo extends AbstractTo {
    /**
     * директ или группа
     */
    private boolean isGroup;
    /**
     * участники чата
     */
    private Set<UserTO> participants;
    private Date lastMessageDate;

    public ChatTo() {
    }

    public ChatTo(Integer id, boolean isGroup, Set<UserTO> participants, Date lastMessageDate) {
        super(id);
        this.isGroup = isGroup;
        this.participants = participants;
        this.lastMessageDate = lastMessageDate;
    }

    public boolean isGroup() {
        return isGroup;
    }

    public void setGroup(boolean group) {
        isGroup = group;
    }

    public Set<UserTO> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<UserTO> participants) {
        this.participants = participants;
    }

    public Date getLastMessageDate() {
        return lastMessageDate;
    }

    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }
}
