package pl.sda.designpatterns.callback;

import java.util.Random;

public class Callee {

    private final Callback callback;

    public Callee(Callback callback) {
        this.callback = callback != null ? callback : new DummyCallback();
    }

    public void getRandomNumberAsync() {
        new Thread(() -> {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            callback.onActionFinished(new Random().nextInt());
        }).start();
    }

    private class DummyCallback implements Callback {
        @Override
        public void onActionFinished(int randNumber) {
        }
    }
}
