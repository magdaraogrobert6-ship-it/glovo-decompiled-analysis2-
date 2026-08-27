package com.uber.rxdogtag;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiFunction;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RxDogTag$$ExternalSyntheticLambda0 implements BiFunction {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RxDogTag.Configuration f$0;

    public /* synthetic */ RxDogTag$$ExternalSyntheticLambda0(RxDogTag.Configuration configuration, int i) {
        this.$r8$classId = i;
        this.f$0 = configuration;
    }

    @Override // io.reactivex.functions.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.$r8$classId;
        if (i == 0) {
            return RxDogTag.lambda$installWithBuilder$0(this.f$0, (Observable) obj, (Observer) obj2);
        }
        if (i == 1) {
            return RxDogTag.lambda$installWithBuilder$1(this.f$0, (Flowable) obj, (FwFClientaddFeatureKeysfeaturesUpdated1) obj2);
        }
        if (i == 2) {
            return RxDogTag.lambda$installWithBuilder$2(this.f$0, (Single) obj, (SingleObserver) obj2);
        }
        if (i != 3) {
            return RxDogTag.lambda$installWithBuilder$4(this.f$0, (Completable) obj, (CompletableObserver) obj2);
        }
        return RxDogTag.lambda$installWithBuilder$3(this.f$0, (Maybe) obj, (MaybeObserver) obj2);
    }
}
