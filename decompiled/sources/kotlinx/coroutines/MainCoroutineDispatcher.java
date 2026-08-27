package kotlinx.coroutines;

import kotlin.text.RegexKt;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.NamedDispatcher;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    public abstract MainCoroutineDispatcher IconCompatParcelizer();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer;
        String str;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherIconCompatParcelizer = mainCoroutineDispatcher.IconCompatParcelizer();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherIconCompatParcelizer = null;
            }
            str = this == mainCoroutineDispatcherIconCompatParcelizer ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + RegexKt.IconCompatParcelizer(this);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.RemoteActionCompatParcelizer(i);
        return str != null ? new NamedDispatcher(this, str) : this;
    }
}
