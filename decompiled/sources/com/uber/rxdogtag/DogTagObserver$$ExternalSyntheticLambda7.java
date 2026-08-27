package com.uber.rxdogtag;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagObserver$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DogTagObserver$$ExternalSyntheticLambda7(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i == 0) {
            ((Observer) obj).onComplete();
        } else if (i != 1) {
            ((FwFClientaddFeatureKeysfeaturesUpdated1) obj).onComplete();
        } else {
            ((MaybeObserver) obj).onComplete();
        }
    }
}
