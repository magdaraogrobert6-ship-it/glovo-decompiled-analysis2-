package com.mapbox.navigation.core.routerefresh;

import com.huawei.wisesecurity.ucs_credential.x;
import com.sentiance.core.model.events.I$b;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ boolean $shouldNotifyOnStart;
    public final /* synthetic */ I$b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlannedRouteRefreshController$executePlannedRefresh$routeRefresherResult$1(boolean z, I$b i$b) {
        super(0);
        this.$shouldNotifyOnStart = z;
        this.this$0 = i$b;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        if (this.$shouldNotifyOnStart) {
            ((x) this.this$0.serializer).onNewState("STARTED", null);
        }
        return createFromParcel.INSTANCE;
    }
}
