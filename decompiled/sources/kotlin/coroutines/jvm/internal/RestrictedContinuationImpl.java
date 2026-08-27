package kotlin.coroutines.jvm.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    @Override // o.ShortNewsContentCardView
    public TextAnnouncementContentCardView getContext() {
        return r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
    }

    public RestrictedContinuationImpl(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        if (shortNewsContentCardView == null || shortNewsContentCardView.getContext() == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }
}
