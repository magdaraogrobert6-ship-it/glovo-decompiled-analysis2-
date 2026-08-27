package o;

import com.roadrunner.delivery.accept.acknowledgment.implementation.data.AckNewOrderSeenWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlAnnotationSaverlambda1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ AckNewOrderSeenWorker IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlAnnotationSaverlambda1(AckNewOrderSeenWorker ackNewOrderSeenWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = ackNewOrderSeenWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return AckNewOrderSeenWorker.access$storeAcknowledgmentTimestamp(this.IconCompatParcelizer, this);
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        AckNewOrderSeenWorker.access$storeAcknowledgmentTimestamp(this.IconCompatParcelizer, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
