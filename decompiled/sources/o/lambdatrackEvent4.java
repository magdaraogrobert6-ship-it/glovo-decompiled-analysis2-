package o;

import com.roadrunner.realtime.data.SocketIoGuard;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdatrackEvent4 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SocketIoGuard read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdatrackEvent4(SocketIoGuard socketIoGuard, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = socketIoGuard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        CoroutineSingletons coroutineSingletonsAccess$observeReconnectionTrigger = SocketIoGuard.access$observeReconnectionTrigger(this.read, this);
        int i4 = serializer + 55;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return coroutineSingletonsAccess$observeReconnectionTrigger;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
