package o;

import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.TakePictureTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LinearFontScaleConverter extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ TakePictureTaskUiModelImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearFontScaleConverter(TakePictureTaskUiModelImpl takePictureTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = takePictureTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            TakePictureTaskUiModelImpl.access$loadAnalytics(this.IconCompatParcelizer, this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$loadAnalytics = TakePictureTaskUiModelImpl.access$loadAnalytics(this.IconCompatParcelizer, this);
        int i3 = serializer + 109;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$loadAnalytics;
    }
}
