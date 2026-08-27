package o;

import com.roadrunner.incognia.implementation.IncogniaInitializerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class scrapView extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public setCustomInAppMessageAnimationFactorylambda0 IconCompatParcelizer;
    public final /* synthetic */ IncogniaInitializerImpl MediaMetadataCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scrapView(IncogniaInitializerImpl incogniaInitializerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = incogniaInitializerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInitSdk;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 21;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objInitSdk = this.MediaMetadataCompat.initSdk(null, this);
            int i3 = 85 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objInitSdk = this.MediaMetadataCompat.initSdk(null, this);
        }
        int i4 = MediaDescriptionCompat + 103;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInitSdk;
    }
}
