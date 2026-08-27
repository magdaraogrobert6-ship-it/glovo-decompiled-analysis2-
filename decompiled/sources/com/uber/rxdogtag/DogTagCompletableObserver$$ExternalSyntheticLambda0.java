package com.uber.rxdogtag;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagCompletableObserver$$ExternalSyntheticLambda0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DogTagCompletableObserver f$0;

    public /* synthetic */ DogTagCompletableObserver$$ExternalSyntheticLambda0(DogTagCompletableObserver dogTagCompletableObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = dogTagCompletableObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DogTagCompletableObserver dogTagCompletableObserver = this.f$0;
        Throwable th = (Throwable) obj;
        if (i != 0) {
            dogTagCompletableObserver.lambda$onSubscribe$0(th);
        } else {
            dogTagCompletableObserver.lambda$onComplete$4(th);
        }
    }
}
