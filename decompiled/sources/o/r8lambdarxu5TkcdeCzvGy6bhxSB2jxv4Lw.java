package o;

import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ConfirmButtonV1UiModelImpl read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdarxu5TkcdeCzvGy6bhxSB2jxv4Lw(ConfirmButtonV1UiModelImpl confirmButtonV1UiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = confirmButtonV1UiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return ConfirmButtonV1UiModelImpl.access$loadAnalytics(this.read, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        ConfirmButtonV1UiModelImpl.access$loadAnalytics(this.read, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
