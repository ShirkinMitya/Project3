package Handler;

import Service.Storage;

public abstract class BaseHandler implements Handler {

    protected Handler next;
    protected Storage storage;

    public BaseHandler(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
}
