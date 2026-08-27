package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda5 implements Iterator, displayInAppMessagelambda121 {
    public final closeInAppMessageViewlambda2 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.read;
        closeInAppMessageViewlambda2 closeinappmessageviewlambda2 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 1 ? closeinappmessageviewlambda2.read().write : new AnchoredDragFinishedSignal(closeinappmessageviewlambda2.serializer, 2, closeinappmessageviewlambda2.read().write);
        }
        Object obj = closeinappmessageviewlambda2.serializer;
        closeinappmessageviewlambda2.read();
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? this.RemoteActionCompatParcelizer.hasNext() : this.RemoteActionCompatParcelizer.hasNext();
        }
        return this.RemoteActionCompatParcelizer.hasNext();
    }

    public addInAppMessageViewToViewGrouplambda5(addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20, int i) {
        this.read = i;
        if (i == 1) {
            this.RemoteActionCompatParcelizer = new closeInAppMessageViewlambda2(addinappmessageviewtoviewgrouplambda20.serializer, addinappmessageviewtoviewgrouplambda20.read, 2);
        } else if (i != 2) {
            this.RemoteActionCompatParcelizer = new closeInAppMessageViewlambda2(addinappmessageviewtoviewgrouplambda20.serializer, addinappmessageviewtoviewgrouplambda20.read, 2);
        } else {
            this.RemoteActionCompatParcelizer = new closeInAppMessageViewlambda2(addinappmessageviewtoviewgrouplambda20.serializer, addinappmessageviewtoviewgrouplambda20.read, 2);
        }
    }
}
