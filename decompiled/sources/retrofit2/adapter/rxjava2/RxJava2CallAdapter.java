package retrofit2.adapter.rxjava2;

import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable;
import io.reactivex.internal.operators.observable.ObservableSingleMaybe;
import io.reactivex.internal.operators.observable.ObservableSingleSingle;
import java.lang.reflect.Type;
import o.getSegments;
import o.useEvaluationsCache;
import o.writeSelffwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class RxJava2CallAdapter implements useEvaluationsCache {
    public final boolean IconCompatParcelizer;
    public final boolean MediaDescriptionCompat;
    public final Type MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;
    public final boolean write;

    @Override // o.useEvaluationsCache
    public final Type RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public RxJava2CallAdapter(Type type, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.MediaMetadataCompat = type;
        this.serializer = z;
        this.IconCompatParcelizer = z2;
        this.read = z3;
        this.MediaDescriptionCompat = z4;
        this.write = z5;
        this.RemoteActionCompatParcelizer = z6;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046 A[RETURN] */
    @Override // o.useEvaluationsCache
    public final Object write(writeSelffwf_client_release writeselffwf_client_release) {
        getSegments getsegments;
        getSegments getsegments2 = new getSegments(2, writeselffwf_client_release);
        if (this.serializer) {
            getsegments = new getSegments(1, getsegments2);
        } else {
            if (this.IconCompatParcelizer) {
                getsegments = new getSegments(0, getsegments2);
            }
            if (this.read) {
                return getsegments2.serializer(BackpressureStrategy.MISSING);
            }
            if (this.MediaDescriptionCompat) {
                return new ObservableSingleSingle(getsegments2);
            }
            if (this.write) {
                return new ObservableSingleMaybe(getsegments2);
            }
            if (this.RemoteActionCompatParcelizer) {
                return new ObservableIgnoreElementsCompletable(getsegments2);
            }
            return getsegments2;
        }
        getsegments2 = getsegments;
        if (this.read) {
            return getsegments2.serializer(BackpressureStrategy.MISSING);
        }
        if (this.MediaDescriptionCompat) {
            return new ObservableSingleSingle(getsegments2);
        }
        if (this.write) {
            return new ObservableSingleMaybe(getsegments2);
        }
        if (this.RemoteActionCompatParcelizer) {
            return new ObservableIgnoreElementsCompletable(getsegments2);
        }
        return getsegments2;
    }
}
