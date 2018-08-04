package pl.sda.designpatterns.nullobject;

public class NOMain {

    private Action action;

    public static void main(String[] args) {
        new NOMain().run();
    }

    public void run() {
        setAction(new ActionImpl());
        System.out.println(action.getTime());

        setAction(null);
        System.out.println(action.getTime());
    }

    public void setAction(Action action) {
        if(action == null) {
            this.action = new DummyAction();
        } else {
            this.action = action;
        }
    }

    // NullObject
    class DummyAction implements Action {

        @Override
        public long getTime() {
            return 0;
        }
    }

    class ActionImpl implements Action {

        @Override
        public long getTime() {
            return System.currentTimeMillis();
        }
    }
}
