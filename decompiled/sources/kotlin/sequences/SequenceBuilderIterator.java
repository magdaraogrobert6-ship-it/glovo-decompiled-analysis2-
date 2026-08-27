package kotlin.sequences;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.displayInAppMessagelambda121;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public final class SequenceBuilderIterator implements Iterator, ShortNewsContentCardView, displayInAppMessagelambda121 {
    public Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public ShortNewsContentCardView read;
    public Iterator serializer;

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
    }

    public final void write(ShortNewsContentCardView shortNewsContentCardView) {
        this.read = shortNewsContentCardView;
    }

    public final CoroutineSingletons yield(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = 3;
        this.read = shortNewsContentCardView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        shortNewsContentCardView.getClass();
        return coroutineSingletons;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        this.RemoteActionCompatParcelizer = 4;
    }

    public final RuntimeException serializer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.RemoteActionCompatParcelizer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        if (i == 2) {
            this.RemoteActionCompatParcelizer = 1;
            Iterator it = this.serializer;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw serializer();
        }
        this.RemoteActionCompatParcelizer = 0;
        Object obj = this.IconCompatParcelizer;
        this.IconCompatParcelizer = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw serializer();
                }
                Iterator it = this.serializer;
                it.getClass();
                if (it.hasNext()) {
                    this.RemoteActionCompatParcelizer = 2;
                    return true;
                }
                this.serializer = null;
            }
            this.RemoteActionCompatParcelizer = 5;
            ShortNewsContentCardView shortNewsContentCardView = this.read;
            shortNewsContentCardView.getClass();
            this.read = null;
            shortNewsContentCardView.resumeWith(createFromParcel.INSTANCE);
        }
    }
}
