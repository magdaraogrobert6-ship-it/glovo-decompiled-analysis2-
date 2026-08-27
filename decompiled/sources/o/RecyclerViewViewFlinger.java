package o;

import com.roadrunner.incognia.implementation.IncogniaInitializerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclerViewViewFlinger extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public final /* synthetic */ IncogniaInitializerImpl RemoteActionCompatParcelizer;
    public boolean read;
    public /* synthetic */ Object serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewViewFlinger(IncogniaInitializerImpl incogniaInitializerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = incogniaInitializerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 3;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objCheckIfIncogniaEnabledInitIfRequired = this.RemoteActionCompatParcelizer.checkIfIncogniaEnabledInitIfRequired(null, this);
        int i4 = RatingCompat + 79;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objCheckIfIncogniaEnabledInitIfRequired;
        }
        throw null;
    }
}
