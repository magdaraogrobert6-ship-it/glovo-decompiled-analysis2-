package o;

import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class eventDeduplicationIdExists extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ PermissionHistoryRepository RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eventDeduplicationIdExists(PermissionHistoryRepository permissionHistoryRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = permissionHistoryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objIsActivityRecognitionPermissionRequestedBefore = this.RemoteActionCompatParcelizer.isActivityRecognitionPermissionRequestedBefore(this);
        int i4 = write + 125;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 44 / 0;
        }
        return objIsActivityRecognitionPermissionRequestedBefore;
    }
}
