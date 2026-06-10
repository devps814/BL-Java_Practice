package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observers> subscriber = new ArrayList<>();

    @Override
    public void subscribe(Observers ob) {
        this.subscriber.add(ob);
    }

    @Override
    public void unsubscribe(Observers ob) {
        this.subscriber.remove(ob);
    }

    @Override
    public void notifychanges() {
        for (Observers ob : this.subscriber){
            ob.notified();
        }
    }
}
