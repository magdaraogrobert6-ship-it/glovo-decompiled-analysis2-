package kotlinx.coroutines.internal;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import o.IInAppMessageAnimationFactory;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.getClosingAnimation;
import o.getQueryParameterslambda2;
import o.onAnimationEndlambda1;
import o.onItemDismiss;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class DispatchedContinuationKt {
    public static final Symbol read = new Symbol("UNDEFINED");
    public static final Symbol serializer = new Symbol("REUSABLE_CLAIMED");

    public static final void serializer(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory;
        if (!(shortNewsContentCardView instanceof DispatchedContinuation)) {
            shortNewsContentCardView.resumeWith(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) shortNewsContentCardView;
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.MediaMetadataCompat;
        ShortNewsContentCardView shortNewsContentCardView2 = dispatchedContinuation.RemoteActionCompatParcelizer;
        Throwable thSerializer = onItemDismiss.serializer(obj);
        Object getclosinganimation = thSerializer == null ? obj : new getClosingAnimation(thSerializer, false);
        if (write(coroutineDispatcher, shortNewsContentCardView2.getContext())) {
            dispatchedContinuation.read = getclosinganimation;
            dispatchedContinuation.MediaSessionCompatQueueItem = 1;
            write(coroutineDispatcher, shortNewsContentCardView2.getContext(), dispatchedContinuation);
            return;
        }
        EventLoop eventLoopWrite = ThreadLocalEventLoop.write();
        if (eventLoopWrite.MediaBrowserCompatMediaItem >= 4294967296L) {
            dispatchedContinuation.read = getclosinganimation;
            dispatchedContinuation.MediaSessionCompatQueueItem = 1;
            eventLoopWrite.write(dispatchedContinuation);
            return;
        }
        eventLoopWrite.serializer(true);
        try {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) shortNewsContentCardView2.getContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
            if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 == null || setallviewgroupchildrenasnonaccessibilityimportantlambda0.I_()) {
                Object obj2 = dispatchedContinuation.serializer;
                TextAnnouncementContentCardView context = shortNewsContentCardView2.getContext();
                Object objSerializer = ThreadContextKt.serializer(context, obj2);
                if (objSerializer != ThreadContextKt.IconCompatParcelizer) {
                    int iSerializer = getQueryParameterslambda2.serializer();
                    iInAppMessageAnimationFactory = (IInAppMessageAnimationFactory) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 391625664, new Object[]{shortNewsContentCardView2, context, objSerializer}, getQueryParameterslambda2.serializer(), -391625664, iSerializer);
                } else {
                    iInAppMessageAnimationFactory = null;
                }
                try {
                    shortNewsContentCardView2.resumeWith(obj);
                    if (iInAppMessageAnimationFactory == null || iInAppMessageAnimationFactory.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                        ThreadContextKt.write(context, objSerializer);
                    }
                } catch (Throwable th) {
                    if (iInAppMessageAnimationFactory == null || iInAppMessageAnimationFactory.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()) {
                        ThreadContextKt.write(context, objSerializer);
                    }
                    throw th;
                }
            } else {
                dispatchedContinuation.resumeWith(ExtrasKt.IconCompatParcelizer(setallviewgroupchildrenasnonaccessibilityimportantlambda0.write()));
            }
            while (eventLoopWrite.IconCompatParcelizer()) {
            }
        } catch (Throwable th2) {
            try {
                dispatchedContinuation.IconCompatParcelizer(th2);
            } finally {
                eventLoopWrite.read(true);
            }
        }
    }

    public static final void write(CoroutineDispatcher coroutineDispatcher, TextAnnouncementContentCardView textAnnouncementContentCardView, Runnable runnable) {
        try {
            coroutineDispatcher.dispatch(textAnnouncementContentCardView, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, textAnnouncementContentCardView);
        }
    }

    public static final boolean write(CoroutineDispatcher coroutineDispatcher, TextAnnouncementContentCardView textAnnouncementContentCardView) throws DispatchException {
        try {
            return coroutineDispatcher.isDispatchNeeded(textAnnouncementContentCardView);
        } catch (Throwable th) {
            throw new DispatchException(th, coroutineDispatcher, textAnnouncementContentCardView);
        }
    }
}
