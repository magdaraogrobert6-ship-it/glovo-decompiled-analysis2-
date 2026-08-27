package o;

import com.roadrunner.rider.state.data.RiderStatusSyncWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setSdkClickBackoffStrategy extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ RiderStatusSyncWorker write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSdkClickBackoffStrategy(RiderStatusSyncWorker riderStatusSyncWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = riderStatusSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.doWork(this);
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.write.doWork(this);
        throw null;
    }
}
