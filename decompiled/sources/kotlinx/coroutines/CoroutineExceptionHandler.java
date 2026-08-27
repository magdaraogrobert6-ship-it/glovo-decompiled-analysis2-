package kotlinx.coroutines;

import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes4.dex */
public interface CoroutineExceptionHandler extends ShortNewsContentCardViewViewHolder {
    void handleException(TextAnnouncementContentCardView textAnnouncementContentCardView, Throwable th);
}
