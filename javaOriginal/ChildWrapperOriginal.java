// PLEASE remember this is a simplified part of the original code which is written in other language

public class ChildWrapperOriginal extends ParentWrapper {

    public ChildWrapperOriginal() {
    }

    //This is the problem. Duplicated code everywhere.
    @Override
    public int parse() {
        return (new MessageData()).getSizeOf();
    }

    public int foo() {
        return messageData.things;
    }

   class MessageData {
        int things;
        int moreThings;
        int lotsOfThings;

        public MessageData() {
            things = 5;
            moreThings = 6;
            lotsOfThings = 7;
        }

        int getSizeOf() {
            return things + moreThings + lotsOfThings;
        }
    }
}
