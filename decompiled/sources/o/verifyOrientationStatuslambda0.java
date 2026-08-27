package o;

import androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1;
import androidx.collection.MutableSetWrapper$iterator$1$iterator$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.sequences.SequenceBuilderIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class verifyOrientationStatuslambda0 implements Iterator, displayInAppMessagelambda121 {
    public final Iterator IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ int write;

    public verifyOrientationStatuslambda0(ContentInViewNodelaunchAnimation21 contentInViewNodelaunchAnimation21) {
        this.write = 2;
        this.read = contentInViewNodelaunchAnimation21;
        this.serializer = -1;
        this.IconCompatParcelizer = LazyKt__LazyJVMKt.read(new MutableSetWrapper$iterator$1$iterator$1(contentInViewNodelaunchAnimation21, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.write;
        Iterator it = this.IconCompatParcelizer;
        if (i != 0) {
            return i != 1 ? ((SequenceBuilderIterator) it).hasNext() : ((SequenceBuilderIterator) it).hasNext();
        }
        unregisterInAppMessageManagerlambda0 unregisterinappmessagemanagerlambda0 = (unregisterInAppMessageManagerlambda0) this.read;
        while (this.serializer < unregisterinappmessagemanagerlambda0.serializer && it.hasNext()) {
            it.next();
            this.serializer++;
        }
        return this.serializer < unregisterinappmessagemanagerlambda0.RemoteActionCompatParcelizer && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.write;
        Iterator it = this.IconCompatParcelizer;
        if (i != 0) {
            return i != 1 ? ((SequenceBuilderIterator) it).next() : ((SequenceBuilderIterator) it).next();
        }
        unregisterInAppMessageManagerlambda0 unregisterinappmessagemanagerlambda0 = (unregisterInAppMessageManagerlambda0) this.read;
        while (this.serializer < unregisterinappmessagemanagerlambda0.serializer && it.hasNext()) {
            it.next();
            this.serializer++;
        }
        int i2 = this.serializer;
        if (i2 < unregisterinappmessagemanagerlambda0.RemoteActionCompatParcelizer) {
            this.serializer = i2 + 1;
            return it.next();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.write;
        Object obj = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i != 1) {
            int i2 = this.serializer;
            if (i2 != -1) {
                ((ContentInViewNodelaunchAnimation21) obj).serializer.RemoteActionCompatParcelizer(i2);
                this.serializer = -1;
                return;
            }
            return;
        }
        int i3 = this.serializer;
        if (i3 != -1) {
            ((accesscalculateScrollDeltaI_oMVgE) obj).RemoteActionCompatParcelizer.IconCompatParcelizer(i3);
            this.serializer = -1;
        }
    }

    public verifyOrientationStatuslambda0(unregisterInAppMessageManagerlambda0 unregisterinappmessagemanagerlambda0) {
        this.write = 0;
        this.read = unregisterinappmessagemanagerlambda0;
        this.IconCompatParcelizer = unregisterinappmessagemanagerlambda0.write.iterator();
    }

    public verifyOrientationStatuslambda0(accesscalculateScrollDeltaI_oMVgE accesscalculatescrolldeltai_omvge) {
        this.write = 1;
        this.read = accesscalculatescrolldeltai_omvge;
        this.serializer = -1;
        this.IconCompatParcelizer = LazyKt__LazyJVMKt.read(new MutableOrderedSetWrapper$iterator$1$iterator$1(accesscalculatescrolldeltai_omvge, this, null));
    }
}
