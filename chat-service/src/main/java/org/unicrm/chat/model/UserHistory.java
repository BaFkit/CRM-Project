package org.unicrm.chat.model;

import lombok.Data;
import org.unicrm.chat.entity.ChatRoom;

import java.util.List;
import java.util.UUID;

@Data
public class UserHistory {

    private UUID senderId;
    private String senderName;
    private UUID recipientId;
    private String recipientName;
    private Long groupId;
    private List<ChatRoom> chatRoom;
    private List<GroupHistory> chatGroup;

    public UserHistory() {
    }
}
