package io.sentry.android.core;

import java.util.Arrays;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackPressedDispatcher_delegatelambda0 {
    public final Integer RemoteActionCompatParcelizer;
    public final Boolean serializer;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.serializer});
    }

    public onBackPressedDispatcher_delegatelambda0(Integer num, Boolean bool) {
        this.RemoteActionCompatParcelizer = num;
        this.serializer = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof onBackPressedDispatcher_delegatelambda0)) {
            return false;
        }
        onBackPressedDispatcher_delegatelambda0 onbackpresseddispatcher_delegatelambda0 = (onBackPressedDispatcher_delegatelambda0) obj;
        return setNativeShader.write((Object) this.RemoteActionCompatParcelizer, (Object) onbackpresseddispatcher_delegatelambda0.RemoteActionCompatParcelizer) && setNativeShader.write(this.serializer, onbackpresseddispatcher_delegatelambda0.serializer);
    }
}
