package o;

import com.roadrunner.map.integration.search.naver.NaverReverseGeocoder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class o6 extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ NaverReverseGeocoder RatingCompat;
    public r8lambdaaAzn5eL4WKW0o5J25K1E0csgpOI RemoteActionCompatParcelizer;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM read;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(NaverReverseGeocoder naverReverseGeocoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = naverReverseGeocoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.RatingCompat.invoke(0.0d, 0.0d, null, null, null, this);
        int i4 = MediaMetadataCompat + 23;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return objInvoke;
    }
}
