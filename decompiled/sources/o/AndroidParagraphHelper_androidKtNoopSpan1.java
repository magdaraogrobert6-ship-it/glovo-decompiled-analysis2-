package o;

import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidParagraphHelper_androidKtNoopSpan1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ EntrancePictureIconUiModelImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphHelper_androidKtNoopSpan1(EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = entrancePictureIconUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return EntrancePictureIconUiModelImpl.access$saveTooltipShownForCurrentDelivery(this.write, null, this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        EntrancePictureIconUiModelImpl.access$saveTooltipShownForCurrentDelivery(this.write, null, this);
        obj2.hashCode();
        throw null;
    }
}
