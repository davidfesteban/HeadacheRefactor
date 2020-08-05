public class ChildWrapper extends ParentWrapper<ChildWrapper.ChildMessageData> {

    public ChildWrapper() {
        super(new ChildMessageData());
    }

    public final int foo() {
        return messageData.things;
    }

    //Improved memory usage with static and final. Access and usage also were improved with a ParentMessageData.
    static final class ChildMessageData extends ParentMessageData {
        int things;
        int moreThings;
        int lotsOfThings;

        private ChildMessageData() {
            things = 5;
            moreThings = 6;
            lotsOfThings = 7;
        }

        @Override
        int getSizeOf() {
            return things + moreThings + lotsOfThings;
        }
    }
}
