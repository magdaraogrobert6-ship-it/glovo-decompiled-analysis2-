package kotlin;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.prepareInAppMessageWithBitmapDownload;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public final class DeepRecursiveScopeImpl implements ShortNewsContentCardView {
    public JsonTreeReader$readDeepRecursive$1 read;
    public ShortNewsContentCardView serializer;
    public Object write;

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        this.serializer = null;
        this.write = obj;
    }

    public final CoroutineSingletons callRecursive(prepareInAppMessageWithBitmapDownload prepareinappmessagewithbitmapdownload) {
        this.serializer = prepareinappmessagewithbitmapdownload;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
