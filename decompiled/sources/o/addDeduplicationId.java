package o;

import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class addDeduplicationId extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public String IconCompatParcelizer;
    public com.data.util.sharedPreferences.SharedPreferencesManagerImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ PermissionHistoryRepository read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addDeduplicationId(PermissionHistoryRepository permissionHistoryRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = permissionHistoryRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 13;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.read.incrementPermissionRequestCount(this);
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        this.read.incrementPermissionRequestCount(this);
        throw null;
    }
}
