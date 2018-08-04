package pl.sda.designpatterns.callback;

public class Caller implements Callback {

    public static void main(String[] args) {
        new Caller().callAction();
    }

    public void callAction() {
        final Callee callee = new Callee(this);
//        final Callee callee = new Callee(new Callback() {
//            @Override
//            public void onActionFinished(int randNumber) {
//
//            }
//        });
        callee.getRandomNumberAsync();
        System.out.println("finished");
    }

    @Override
    public void onActionFinished(int randNumber) {
        System.out.println("a number is: " + randNumber);
    }
}
