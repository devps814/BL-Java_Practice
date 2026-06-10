package DesignPatterns.Observer;

interface Subject {
    void subscribe(Observers ob);
    void unsubscribe(Observers ob);
    void notifychanges();

}

// Observer Pattern : > It is a behavioral design pattern.
//                    > In this when subject changes the
//                      state all its dependent objects notified the changes.
//                    > One-to-many relation
