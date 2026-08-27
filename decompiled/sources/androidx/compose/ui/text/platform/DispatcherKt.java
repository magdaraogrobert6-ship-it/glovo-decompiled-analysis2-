package androidx.compose.ui.text.platform;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes.dex */
public final class DispatcherKt {
    private static final CoroutineDispatcher FontCacheManagementDispatcher;

    public static final CoroutineDispatcher getFontCacheManagementDispatcher() {
        return FontCacheManagementDispatcher;
    }

    static {
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        FontCacheManagementDispatcher = MainDispatcherLoader.read;
    }
}
