package o;

import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pe extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public long serializer;
    public final /* synthetic */ H$b write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = h$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        H$b h$b;
        long j;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            h$b = this.write;
            j = 1;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            h$b = this.write;
            j = 0;
        }
        return h$b.savedStartedAt(j, this);
    }
}
