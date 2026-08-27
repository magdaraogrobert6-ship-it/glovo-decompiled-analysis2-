package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class startElement extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ com.roadrunner.customerchat.selfservice.domain.analytics.AnalyticsImpl IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public startElement(com.roadrunner.customerchat.selfservice.domain.analytics.AnalyticsImpl analyticsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = analyticsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objTrack = this.IconCompatParcelizer.track(null, this);
        int i4 = RemoteActionCompatParcelizer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objTrack;
    }
}
