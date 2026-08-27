package kotlinx.coroutines.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes4.dex */
public final class LimitedDispatcherKt {
    public static final void RemoteActionCompatParcelizer(int i) {
        if (i >= 1) {
            return;
        }
        DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Expected positive parallelism level, but got "));
    }
}
