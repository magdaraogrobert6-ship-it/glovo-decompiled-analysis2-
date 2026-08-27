package kotlinx.coroutines.android;

import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import o.IInAppMessageViewFactory;
import o.InAppMessageActivityTransitionCoordinator;

/* JADX INFO: loaded from: classes5.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final MainCoroutineDispatcher createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new IInAppMessageViewFactory(InAppMessageActivityTransitionCoordinator.IconCompatParcelizer(mainLooper));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The main looper is not available");
        return null;
    }
}
