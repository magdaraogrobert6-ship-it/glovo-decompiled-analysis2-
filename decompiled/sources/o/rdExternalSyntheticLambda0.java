package o;

import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class rdExternalSyntheticLambda0 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ PushWithAppStateDataStoreImpl read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdExternalSyntheticLambda0(PushWithAppStateDataStoreImpl pushWithAppStateDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = pushWithAppStateDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return PushWithAppStateDataStoreImpl.access$decodeFromJson(this.read, null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        PushWithAppStateDataStoreImpl.access$decodeFromJson(this.read, null, this);
        throw null;
    }
}
