package o;

import com.roadrunner.opportunities.domain.OpportunitiesMapper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class wd extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public w4ExternalSyntheticLambda0 read;
    public final /* synthetic */ OpportunitiesMapper serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(OpportunitiesMapper opportunitiesMapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = opportunitiesMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(null, this);
        int i4 = RemoteActionCompatParcelizer + 105;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
