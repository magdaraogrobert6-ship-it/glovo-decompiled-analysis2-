package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class unregisterInAppMessageManagerlambda1 implements Iterator, displayInAppMessagelambda121 {
    public final /* synthetic */ r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4 IconCompatParcelizer;
    public final Iterator RemoteActionCompatParcelizer;
    public int read = -1;
    public Object write;

    public final void RemoteActionCompatParcelizer() {
        Iterator it = this.RemoteActionCompatParcelizer;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.IconCompatParcelizer.read).invoke(next)).booleanValue()) {
                this.read = 1;
                this.write = next;
                return;
            }
        }
        this.read = 0;
    }

    public unregisterInAppMessageManagerlambda1(r8lambdaDrmJdx1j9gjzqwvv4qL9c3NutF4 r8lambdadrmjdx1j9gjzqwvv4ql9c3nutf4) {
        this.IconCompatParcelizer = r8lambdadrmjdx1j9gjzqwvv4ql9c3nutf4;
        this.RemoteActionCompatParcelizer = ((resumeWebviewIfNecessarylambda0) r8lambdadrmjdx1j9gjzqwvv4ql9c3nutf4.serializer).iterator();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.read == -1) {
            RemoteActionCompatParcelizer();
        }
        return this.read == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.read == -1) {
            RemoteActionCompatParcelizer();
        }
        if (this.read == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object obj = this.write;
        this.write = null;
        this.read = -1;
        return obj;
    }
}
