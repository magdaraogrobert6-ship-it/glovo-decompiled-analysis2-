package o;

import com.roadrunner.rider.state.polling.RiderStatusPollingWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getOaidParameters extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ RiderStatusPollingWorker IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOaidParameters(RiderStatusPollingWorker riderStatusPollingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = riderStatusPollingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.doWork(this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objDoWork = this.IconCompatParcelizer.doWork(this);
        int i3 = RemoteActionCompatParcelizer + 71;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objDoWork;
        }
        throw null;
    }
}
