package o;

import com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAnnotationRangeSaverannotations extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ GetAcknowledgmentParamsImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public onBackInvoked serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAnnotationRangeSaverannotations(GetAcknowledgmentParamsImpl getAcknowledgmentParamsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = getAcknowledgmentParamsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 53;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.shouldSendAcknowledgment(null, this);
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.shouldSendAcknowledgment(null, this);
        obj2.hashCode();
        throw null;
    }
}
