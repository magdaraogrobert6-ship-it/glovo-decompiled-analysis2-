package o;

import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setSuffix extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ PermissionHistoryRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setSuffix(PermissionHistoryRepository permissionHistoryRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = permissionHistoryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object permissionRequestCount = this.serializer.getPermissionRequestCount(this);
        int i4 = IconCompatParcelizer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return permissionRequestCount;
        }
        throw null;
    }
}
