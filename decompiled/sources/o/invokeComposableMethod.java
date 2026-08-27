package o;

import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeComposableMethod extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public Throwable RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ ConfirmButtonV1UiModelImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public invokeComposableMethod(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = confirmButtonV1UiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 33;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return ConfirmButtonV1UiModelImpl.access$onConfirmFailure(this.serializer, null, null, this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        ConfirmButtonV1UiModelImpl.access$onConfirmFailure(this.serializer, null, null, this);
        throw null;
    }
}
