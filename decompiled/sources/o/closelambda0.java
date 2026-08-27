package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class closelambda0 implements Iterator, displayInAppMessagelambda121 {
    public final addInAppMessageViewToViewGrouplambda22 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public int write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write < this.IconCompatParcelizer.read();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final addInAppMessageViewToViewGrouplambda2 next() {
        addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22 = this.IconCompatParcelizer;
        if (addinappmessageviewtoviewgrouplambda22.write.RemoteActionCompatParcelizer != this.serializer) {
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object obj = this.read;
        this.RemoteActionCompatParcelizer = obj;
        this.MediaBrowserCompatMediaItem = true;
        this.write++;
        V v = addinappmessageviewtoviewgrouplambda22.write.get(obj);
        if (v != 0) {
            addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) v;
            this.read = addinappmessageviewtoviewgrouplambda2.serializer;
            return addinappmessageviewtoviewgrouplambda2;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.read + ") has changed after it was added to the persistent map.");
    }

    public closelambda0(Object obj, addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22) {
        addinappmessageviewtoviewgrouplambda22.getClass();
        this.read = obj;
        this.IconCompatParcelizer = addinappmessageviewtoviewgrouplambda22;
        this.RemoteActionCompatParcelizer = closelambda20.serializer;
        this.serializer = addinappmessageviewtoviewgrouplambda22.write.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.MediaBrowserCompatMediaItem) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
            return;
        }
        Object obj = this.RemoteActionCompatParcelizer;
        addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22 = this.IconCompatParcelizer;
        pauseWebviewIfNecessarylambda10.serializer(addinappmessageviewtoviewgrouplambda22).remove(obj);
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatMediaItem = false;
        this.serializer = addinappmessageviewtoviewgrouplambda22.write.RemoteActionCompatParcelizer;
        this.write--;
    }
}
