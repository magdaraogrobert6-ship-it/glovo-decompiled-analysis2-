package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class resetAfterInAppMessageCloselambda0 implements Iterator, displayInAppMessagelambda121 {
    public int RemoteActionCompatParcelizer = -2;
    public Object read;
    public final /* synthetic */ resetAfterInAppMessageCloselambda1 write;

    public resetAfterInAppMessageCloselambda0(resetAfterInAppMessageCloselambda1 resetafterinappmessagecloselambda1) {
        this.write = resetafterinappmessagecloselambda1;
    }

    public final void IconCompatParcelizer() {
        Object objInvoke;
        int i = this.RemoteActionCompatParcelizer;
        resetAfterInAppMessageCloselambda1 resetafterinappmessagecloselambda1 = this.write;
        if (i == -2) {
            objInvoke = resetafterinappmessagecloselambda1.serializer.invoke();
        } else {
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = resetafterinappmessagecloselambda1.IconCompatParcelizer;
            Object obj = this.read;
            obj.getClass();
            objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj);
        }
        this.read = objInvoke;
        this.RemoteActionCompatParcelizer = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.RemoteActionCompatParcelizer < 0) {
            IconCompatParcelizer();
        }
        return this.RemoteActionCompatParcelizer == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.RemoteActionCompatParcelizer < 0) {
            IconCompatParcelizer();
        }
        if (this.RemoteActionCompatParcelizer == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object obj = this.read;
        obj.getClass();
        this.RemoteActionCompatParcelizer = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
