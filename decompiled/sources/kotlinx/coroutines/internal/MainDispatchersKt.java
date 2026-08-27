package kotlinx.coroutines.internal;

import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class MainDispatchersKt {
    public static final boolean IconCompatParcelizer(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.IconCompatParcelizer() instanceof MissingMainCoroutineDispatcher;
    }
}
