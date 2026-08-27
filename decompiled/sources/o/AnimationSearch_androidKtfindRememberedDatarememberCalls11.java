package o;

import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UtccTaskStateRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearch_androidKtfindRememberedDatarememberCalls11 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ UtccTaskStateRepositoryImpl RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationSearch_androidKtfindRememberedDatarememberCalls11(UtccTaskStateRepositoryImpl utccTaskStateRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = utccTaskStateRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objAccess$decodeFromJson = UtccTaskStateRepositoryImpl.access$decodeFromJson(this.RemoteActionCompatParcelizer, null, this);
        int i4 = IconCompatParcelizer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$decodeFromJson;
        }
        obj2.hashCode();
        throw null;
    }
}
