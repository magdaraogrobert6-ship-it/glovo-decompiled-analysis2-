package o;

import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNumberPjHm6EE extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SendTestPushUseCase read;
    public getPreviouseUduSuo serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNumberPjHm6EE(SendTestPushUseCase sendTestPushUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sendTestPushUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 23;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.isTooltipAvailable(null, null, this);
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.read.isTooltipAvailable(null, null, this);
        throw null;
    }
}
