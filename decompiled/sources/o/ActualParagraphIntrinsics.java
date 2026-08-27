package o;

import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActualParagraphIntrinsics extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveEntrancePicture read;
    public /* synthetic */ Object serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActualParagraphIntrinsics(ObserveEntrancePicture observeEntrancePicture, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = observeEntrancePicture;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$shouldShowTooltip = ObserveEntrancePicture.access$shouldShowTooltip(this.read, null, this);
        int i4 = RatingCompat + 99;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return objAccess$shouldShowTooltip;
    }
}
