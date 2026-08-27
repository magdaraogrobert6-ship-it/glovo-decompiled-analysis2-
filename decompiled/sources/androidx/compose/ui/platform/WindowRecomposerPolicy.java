package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.ui.InternalComposeUiApi;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt;
import o.IInAppMessageViewFactory;
import o.InAppMessageActivityTransitionCoordinator;
import o.getBitmapFromCache;
import o.markOnScreenCardsAsReadlambda1;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.sendContentCaptureAppearEvents;
import o.setViewAccessibilityFlagMap;

/* JADX INFO: loaded from: classes.dex */
@InternalComposeUiApi
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory, WindowRecomposerFactory windowRecomposerFactory2) {
        return getBitmapFromCache.write(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    public final sendContentCaptureAppearEvents createAndInstallWindowRecomposer$ui(View view) {
        sendContentCaptureAppearEvents sendcontentcaptureappeareventsCreateRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, sendcontentcaptureappeareventsCreateRecomposer);
        Handler handler = view.getHandler();
        int i = InAppMessageActivityTransitionCoordinator.RemoteActionCompatParcelizer;
        IInAppMessageViewFactory iInAppMessageViewFactory = new IInAppMessageViewFactory(handler, "windowRecomposer cleanup", false);
        final r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(setViewAccessibilityFlagMap.serializer, iInAppMessageViewFactory.serializer, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(sendcontentcaptureappeareventsCreateRecomposer, view, null), 2);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer.write(null);
            }
        });
        return sendcontentcaptureappeareventsCreateRecomposer;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(WindowRecomposerFactory windowRecomposerFactory, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R r = (R) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                return r;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    throw th2;
                }
                markOnScreenCardsAsReadlambda1.read(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}
