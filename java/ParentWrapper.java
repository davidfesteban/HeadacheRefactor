public class ParentWrapper<T extends ParentMessageData> {

    final T messageData;

    ParentWrapper(T messageData) {
        this.messageData = messageData;
    }

    public int parse() {
        int result = 0;

        if (messageData != null) {
            result = messageData.getSizeOf();
        }

        return result;
    }

}
