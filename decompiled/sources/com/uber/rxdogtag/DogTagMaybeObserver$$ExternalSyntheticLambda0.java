package com.uber.rxdogtag;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DogTagMaybeObserver$$ExternalSyntheticLambda0 implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DogTagMaybeObserver f$0;

    public /* synthetic */ DogTagMaybeObserver$$ExternalSyntheticLambda0(DogTagMaybeObserver dogTagMaybeObserver, int i) {
        this.$r8$classId = i;
        this.f$0 = dogTagMaybeObserver;
    }

    @Override // com.uber.rxdogtag.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        DogTagMaybeObserver dogTagMaybeObserver = this.f$0;
        Throwable th = (Throwable) obj;
        if (i == 0) {
            dogTagMaybeObserver.lambda$onSubscribe$0(th);
            return;
        }
        if (i == 1) {
            dogTagMaybeObserver.lambda$onComplete$6(th);
        } else if (i != 2) {
            dogTagMaybeObserver.lambda$onError$4(th);
        } else {
            dogTagMaybeObserver.lambda$onSuccess$2(th);
        }
    }
}
