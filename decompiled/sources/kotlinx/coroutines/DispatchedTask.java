package kotlinx.coroutines;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.IInAppMessageAnimationFactory;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o._set_shouldNextUnregisterBeSkipped_lambda0;
import o.getClosingAnimation;
import o.getPreviouslyFocusedView;
import o.getQueryParameterslambda2;
import o.isItemDismissable;
import o.onAnimationEndlambda1;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DispatchedTask extends _set_shouldNextUnregisterBeSkipped_lambda0 {
    public int MediaSessionCompatQueueItem;

    public abstract Object PlaybackStateCompat();

    public Object read(Object obj) {
        return obj;
    }

    public abstract ShortNewsContentCardView write();

    public void write(CancellationException cancellationException) {
    }

    public DispatchedTask(int i) {
        super(0L, false);
        this.MediaSessionCompatQueueItem = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory;
        int i;
        try {
            ShortNewsContentCardView shortNewsContentCardViewWrite = write();
            shortNewsContentCardViewWrite.getClass();
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) shortNewsContentCardViewWrite;
            ShortNewsContentCardView shortNewsContentCardView = dispatchedContinuation.RemoteActionCompatParcelizer;
            Object obj = dispatchedContinuation.serializer;
            TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
            Object objSerializer = ThreadContextKt.serializer(context, obj);
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = null;
            if (objSerializer != ThreadContextKt.IconCompatParcelizer) {
                iInAppMessageAnimationFactory = (IInAppMessageAnimationFactory) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 391625664, new Object[]{shortNewsContentCardView, context, objSerializer}, getQueryParameterslambda2.serializer(), -391625664, getQueryParameterslambda2.serializer());
            } else {
                iInAppMessageAnimationFactory = null;
            }
            try {
                TextAnnouncementContentCardView context2 = shortNewsContentCardView.getContext();
                Object objPlaybackStateCompat = PlaybackStateCompat();
                Throwable thIconCompatParcelizer = IconCompatParcelizer(objPlaybackStateCompat);
                if (thIconCompatParcelizer == null && ((i = this.MediaSessionCompatQueueItem) == 1 || i == 2)) {
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) context2.get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
                }
                if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null && !setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_()) {
                    CancellationException cancellationExceptionWrite = setallviewgroupchildrenasnonaccessibilityimportantlambda0.write();
                    write(cancellationExceptionWrite);
                    shortNewsContentCardView.resumeWith(ExtrasKt.IconCompatParcelizer(cancellationExceptionWrite));
                } else if (thIconCompatParcelizer != null) {
                    shortNewsContentCardView.resumeWith(new isItemDismissable(thIconCompatParcelizer));
                } else {
                    shortNewsContentCardView.resumeWith(read(objPlaybackStateCompat));
                }
            } finally {
                if (iInAppMessageAnimationFactory == null || iInAppMessageAnimationFactory.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                    ThreadContextKt.write(context, objSerializer);
                }
            }
        } catch (DispatchException e) {
            TimeoutKt.read(write().getContext(), e.write);
        } catch (Throwable th) {
            IconCompatParcelizer(th);
        }
    }

    public Throwable IconCompatParcelizer(Object obj) {
        getClosingAnimation getclosinganimation = obj instanceof getClosingAnimation ? (getClosingAnimation) obj : null;
        if (getclosinganimation != null) {
            return getclosinganimation.IconCompatParcelizer;
        }
        return null;
    }

    public final void IconCompatParcelizer(Throwable th) {
        TimeoutKt.read(write().getContext(), new getPreviouslyFocusedView("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}
