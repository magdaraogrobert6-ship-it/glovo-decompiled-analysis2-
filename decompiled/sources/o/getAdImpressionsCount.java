package o;

import com.roadrunner.rider.safety.report.data.WelcomeMessageRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdImpressionsCount extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int read;
    public final /* synthetic */ WelcomeMessageRepository IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public WelcomeMessageRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAdImpressionsCount(WelcomeMessageRepository welcomeMessageRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = welcomeMessageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 85;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.incrementDisplayCount(this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 52 / 0;
        return this.IconCompatParcelizer.incrementDisplayCount(this);
    }
}
