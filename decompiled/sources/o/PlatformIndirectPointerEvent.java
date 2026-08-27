package o;

import androidx.cardview.widget.CardView$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformIndirectPointerEvent extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ CardView$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformIndirectPointerEvent(CardView$1 cardView$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = cardView$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.updatePushToken(null, this);
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.write.updatePushToken(null, this);
        obj2.hashCode();
        throw null;
    }
}
