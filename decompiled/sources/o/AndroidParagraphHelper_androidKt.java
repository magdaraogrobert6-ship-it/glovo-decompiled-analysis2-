package o;

import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidParagraphHelper_androidKt extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ EntrancePictureRepository IconCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphHelper_androidKt(EntrancePictureRepository entrancePictureRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = entrancePictureRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.incrementTooltipShownCount(this);
        }
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.incrementTooltipShownCount(this);
        throw null;
    }
}
