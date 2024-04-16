package Assignment6;
import java.time.LocalDateTime;

class MessageMemento {
   private String messageContent;
   private LocalDateTime timestamp;

   public MessageMemento(String messageContent, LocalDateTime timestamp2) {
       this.messageContent = messageContent;
       this.timestamp = timestamp2;
   }

   public String getMessageContent() {
       return messageContent;
   }

   public LocalDateTime getTimestamp() {
       return timestamp;
   }
}