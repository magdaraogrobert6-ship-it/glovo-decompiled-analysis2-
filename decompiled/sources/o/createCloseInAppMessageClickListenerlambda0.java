package o;

import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createCloseInAppMessageClickListenerlambda0 extends JobSupport implements ShortNewsContentCardView, getContentViewGroupParentLayout {
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return this.RemoteActionCompatParcelizer;
    }

    public void write(Object obj) {
    }

    public void write(Throwable th, boolean z) {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void read(CompletionHandlerException completionHandlerException) {
        TimeoutKt.read(this.RemoteActionCompatParcelizer, completionHandlerException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String IconCompatParcelizer() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void serializer(Object obj) {
        if (!(obj instanceof getClosingAnimation)) {
            write(obj);
        } else {
            getClosingAnimation getclosinganimation = (getClosingAnimation) obj;
            write(getclosinganimation.IconCompatParcelizer, getClosingAnimation.write.get(getclosinganimation) == 1);
        }
    }

    public createCloseInAppMessageClickListenerlambda0(TextAnnouncementContentCardView textAnnouncementContentCardView, boolean z, boolean z2) {
        super(z2);
        if (z) {
            RemoteActionCompatParcelizer((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer));
        }
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView.plus(this);
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            obj = new getClosingAnimation(thSerializer, false);
        }
        Object objMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(obj);
        if (objMediaBrowserCompatMediaItem == JobKt.IconCompatParcelizer) {
            return;
        }
        IconCompatParcelizer(objMediaBrowserCompatMediaItem);
    }
}
