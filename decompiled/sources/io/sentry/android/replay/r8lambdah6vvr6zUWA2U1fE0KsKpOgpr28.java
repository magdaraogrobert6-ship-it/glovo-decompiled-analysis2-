package io.sentry.android.replay;

import kotlin.LazyKt__LazyJVMKt;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 {
    public static final onViewDetachedFromWindowlambda1 read;
    public static final onViewDetachedFromWindowlambda1 serializer;
    public static final onViewDetachedFromWindowlambda1 write;

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.NONE;
        read = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, accessensureViewModelStore.write);
        serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, accessensureViewModelStore.serializer);
        write = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, accessensureViewModelStore.RemoteActionCompatParcelizer);
    }
}
