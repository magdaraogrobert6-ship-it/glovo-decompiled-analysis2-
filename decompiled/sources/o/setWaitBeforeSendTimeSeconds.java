package o;

import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setWaitBeforeSendTimeSeconds extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ PermissionHistoryRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setWaitBeforeSendTimeSeconds(PermissionHistoryRepository permissionHistoryRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = permissionHistoryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvalidate;
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objInvalidate = this.write.invalidate(this);
            int i3 = 64 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objInvalidate = this.write.invalidate(this);
        }
        int i4 = read + 67;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvalidate;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
