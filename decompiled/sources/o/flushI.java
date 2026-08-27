package o;

import com.roadrunner.rider.state.realtime.RealtimeStatusUpdateManagerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class flushI extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ RealtimeStatusUpdateManagerImpl RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flushI(RealtimeStatusUpdateManagerImpl realtimeStatusUpdateManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = realtimeStatusUpdateManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            RealtimeStatusUpdateManagerImpl.access$updateState(this.RemoteActionCompatParcelizer, null, this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$updateState = RealtimeStatusUpdateManagerImpl.access$updateState(this.RemoteActionCompatParcelizer, null, this);
        int i3 = write + 121;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objAccess$updateState;
        }
        obj2.hashCode();
        throw null;
    }
}
