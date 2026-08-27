package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.Flow;
import o.IInAppMessageViewWrapper;
import o.TextAnnouncementContentCardView;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public interface FusibleFlow<T> extends Flow<T> {
    Flow serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper);

    public static final class DefaultImpls {
        public static /* synthetic */ Flow write(FusibleFlow fusibleFlow, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper, int i2) {
            if ((i2 & 1) != 0) {
                textAnnouncementContentCardView = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                iInAppMessageViewWrapper = IInAppMessageViewWrapper.SUSPEND;
            }
            return fusibleFlow.serializer(textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
        }
    }
}
