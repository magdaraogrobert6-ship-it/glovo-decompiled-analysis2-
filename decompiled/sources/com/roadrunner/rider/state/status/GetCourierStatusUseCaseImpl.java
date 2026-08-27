package com.roadrunner.rider.state.status;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import o.accessisMainThread;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCourierStatusUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final GetRiderStateImpl RemoteActionCompatParcelizer;

    public GetCourierStatusUseCaseImpl(GetRiderStateImpl getRiderStateImpl, accessisMainThread accessismainthread) {
        this.RemoteActionCompatParcelizer = getRiderStateImpl;
    }

    public final GetMapScope$invoke$$inlined$map$1 write() {
        int i = 2 % 2;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(this.RemoteActionCompatParcelizer.write(), this, 14);
        int i2 = write + 69;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getMapScope$invoke$$inlined$map$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
