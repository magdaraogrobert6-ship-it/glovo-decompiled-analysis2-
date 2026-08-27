package o;

import com.roadrunner.realtime.data.SocketIoGuard;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdatrackAdRevenue41 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SocketIoGuard RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdatrackAdRevenue41(SocketIoGuard socketIoGuard, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = socketIoGuard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        CoroutineSingletons coroutineSingletonsAccess$observeDisconnectedStateAndScheduleReconnect = SocketIoGuard.access$observeDisconnectedStateAndScheduleReconnect(this.RemoteActionCompatParcelizer, this);
        int i4 = write + 19;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return coroutineSingletonsAccess$observeDisconnectedStateAndScheduleReconnect;
    }
}
