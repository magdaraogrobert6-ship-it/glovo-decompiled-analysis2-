package o;

import com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SkewXSpan extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ AutoAcceptRequestStateRepositoryImpl read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkewXSpan(AutoAcceptRequestStateRepositoryImpl autoAcceptRequestStateRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = autoAcceptRequestStateRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object lastRequestTime = this.read.getLastRequestTime(this);
        int i4 = write + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return lastRequestTime;
    }
}
