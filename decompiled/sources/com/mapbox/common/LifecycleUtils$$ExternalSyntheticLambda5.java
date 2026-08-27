package com.mapbox.common;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class LifecycleUtils$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LifecycleUtils$$ExternalSyntheticLambda5(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$17$lambda$16((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
            return;
        }
        if (i == 1) {
            LifecycleManager.getLifecycleState$lambda$10$lambda$9((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
            return;
        }
        if (i == 2) {
            LifecycleManager.getLifecycleState$lambda$14$lambda$13$lambda$12((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
        } else if (i != 3) {
            ((ConnectionChangeCallback) obj).lambda$notifyReachability$0();
        } else {
            LifecycleUtils.getLifecycleState$lambda$24$lambda$23$lambda$22$lambda$21((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj);
        }
    }
}
