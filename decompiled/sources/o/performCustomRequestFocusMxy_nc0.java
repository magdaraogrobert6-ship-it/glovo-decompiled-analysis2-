package o;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes.dex */
public final class performCustomRequestFocusMxy_nc0 extends ContinuationImpl {
    public int IconCompatParcelizer;
    public Iterator RemoteActionCompatParcelizer;
    public Serializable read;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return TextStreamsKt.access$runMigrations(null, null, this);
    }

    public performCustomRequestFocusMxy_nc0(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
