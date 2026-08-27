package kotlinx.coroutines;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.getParentViewGroup;
import o.isAnimatingClose;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DefaultExecutorKt {
    public static final isAnimatingClose write;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        isAnimatingClose isanimatingclose;
        String strRemoteActionCompatParcelizer = SystemPropsKt.RemoteActionCompatParcelizer("kotlinx.coroutines.main.delay");
        if (strRemoteActionCompatParcelizer == null || !Boolean.parseBoolean(strRemoteActionCompatParcelizer)) {
            isanimatingclose = getParentViewGroup.write;
        } else {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.read;
            isanimatingclose = (MainDispatchersKt.IconCompatParcelizer(mainCoroutineDispatcher) || !(mainCoroutineDispatcher instanceof isAnimatingClose)) ? getParentViewGroup.write : (isAnimatingClose) mainCoroutineDispatcher;
        }
        write = isanimatingclose;
    }
}
