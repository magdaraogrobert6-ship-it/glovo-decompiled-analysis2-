package o;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: loaded from: classes4.dex */
public final class getMApplicationContextannotations {
    public int IconCompatParcelizer = -1;
    public final Object MediaBrowserCompatMediaItem;
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY MediaDescriptionCompat;
    public final /* synthetic */ SelectImplementation MediaSessionCompatQueueItem;
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public final Object read;
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;
    public final SuspendLambda write;

    public final void RemoteActionCompatParcelizer() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj instanceof Segment) {
            ((Segment) obj).RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer);
            return;
        }
        setAndStartAnimation setandstartanimation = obj instanceof setAndStartAnimation ? (setAndStartAnimation) obj : null;
        if (setandstartanimation != null) {
            setandstartanimation.RemoteActionCompatParcelizer();
        }
    }

    public getMApplicationContextannotations(SelectImplementation selectImplementation, Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, Symbol symbol, SuspendLambda suspendLambda, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3) {
        this.MediaSessionCompatQueueItem = selectImplementation;
        this.read = obj;
        this.MediaDescriptionCompat = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.RatingCompat = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        this.MediaBrowserCompatMediaItem = symbol;
        this.write = suspendLambda;
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
    }
}
