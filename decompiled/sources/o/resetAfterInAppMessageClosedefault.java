package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class resetAfterInAppMessageClosedefault implements Iterator, displayInAppMessagelambda121 {
    public Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ resumeWebviewIfNecessarylambda0 read;
    public final Iterator serializer;
    public final /* synthetic */ int write;

    public resetAfterInAppMessageClosedefault(requestDisplayInAppMessagelambda7 requestdisplayinappmessagelambda7) {
        this.write = 0;
        this.read = requestdisplayinappmessagelambda7;
        this.serializer = requestdisplayinappmessagelambda7.write.iterator();
        this.RemoteActionCompatParcelizer = -1;
    }

    public boolean IconCompatParcelizer() {
        Iterator it;
        Iterator it2 = (Iterator) this.IconCompatParcelizer;
        if (it2 != null && it2.hasNext()) {
            this.RemoteActionCompatParcelizer = 1;
            return true;
        }
        do {
            Iterator it3 = this.serializer;
            if (!it3.hasNext()) {
                this.RemoteActionCompatParcelizer = 2;
                this.IconCompatParcelizer = null;
                return false;
            }
            Object next = it3.next();
            requestDisplayInAppMessagelambda9 requestdisplayinappmessagelambda9 = (requestDisplayInAppMessagelambda9) this.read;
            it = (Iterator) requestdisplayinappmessagelambda9.IconCompatParcelizer.invoke(requestdisplayinappmessagelambda9.RemoteActionCompatParcelizer.invoke(next));
        } while (!it.hasNext());
        this.IconCompatParcelizer = it;
        this.RemoteActionCompatParcelizer = 1;
        return true;
    }

    public void RemoteActionCompatParcelizer() {
        Object next;
        requestDisplayInAppMessagelambda7 requestdisplayinappmessagelambda7 = (requestDisplayInAppMessagelambda7) this.read;
        do {
            Iterator it = this.serializer;
            if (!it.hasNext()) {
                this.RemoteActionCompatParcelizer = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) requestdisplayinappmessagelambda7.serializer.invoke(next)).booleanValue() != requestdisplayinappmessagelambda7.read);
        this.IconCompatParcelizer = next;
        this.RemoteActionCompatParcelizer = 1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.write == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.write == 0) {
            if (this.RemoteActionCompatParcelizer == -1) {
                RemoteActionCompatParcelizer();
            }
            return this.RemoteActionCompatParcelizer == 1;
        }
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return IconCompatParcelizer();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.write == 0) {
            if (this.RemoteActionCompatParcelizer == -1) {
                RemoteActionCompatParcelizer();
            }
            if (this.RemoteActionCompatParcelizer == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            Object obj = this.IconCompatParcelizer;
            this.IconCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = -1;
            return obj;
        }
        int i = this.RemoteActionCompatParcelizer;
        if (i == 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (i == 0 && !IconCompatParcelizer()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.RemoteActionCompatParcelizer = 0;
        Iterator it = (Iterator) this.IconCompatParcelizer;
        it.getClass();
        return it.next();
    }

    public resetAfterInAppMessageClosedefault(requestDisplayInAppMessagelambda9 requestdisplayinappmessagelambda9) {
        this.write = 1;
        this.read = requestdisplayinappmessagelambda9;
        this.serializer = requestdisplayinappmessagelambda9.write.iterator();
    }
}
