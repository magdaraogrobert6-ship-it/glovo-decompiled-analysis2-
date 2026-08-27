package o;

import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class resetSessionAttributes extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public final /* synthetic */ PermissionHistoryRepository serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetSessionAttributes(PermissionHistoryRepository permissionHistoryRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = permissionHistoryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.isBackgroundLocationPermissionRequestedBefore(this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objIsBackgroundLocationPermissionRequestedBefore = this.serializer.isBackgroundLocationPermissionRequestedBefore(this);
        int i3 = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return objIsBackgroundLocationPermissionRequestedBefore;
    }
}
