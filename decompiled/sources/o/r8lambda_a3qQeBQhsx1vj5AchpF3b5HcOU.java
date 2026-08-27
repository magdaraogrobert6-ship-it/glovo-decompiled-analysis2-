package o;

import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda_a3qQeBQhsx1vj5AchpF3b5HcOU extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer;
    public final /* synthetic */ ConfirmButtonV1UiModelImpl read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda_a3qQeBQhsx1vj5AchpF3b5HcOU(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = confirmButtonV1UiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            ConfirmButtonV1UiModelImpl.access$onConfirmSuccess(this.read, null, this);
            throw null;
        }
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$onConfirmSuccess = ConfirmButtonV1UiModelImpl.access$onConfirmSuccess(this.read, null, this);
        int i3 = IconCompatParcelizer + 15;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objAccess$onConfirmSuccess;
        }
        throw null;
    }
}
