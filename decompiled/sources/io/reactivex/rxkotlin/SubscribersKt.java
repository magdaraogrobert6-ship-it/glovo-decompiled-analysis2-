package io.reactivex.rxkotlin;

import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.network.NetworkFetcher;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableInterval;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SubscribersKt {
    public static Disposable write(ObservableInterval observableInterval, final NetworkFetcher.AnonymousClass2 anonymousClass2, final f2$$ExternalSyntheticLambda4 f2__externalsyntheticlambda4) {
        Disposable disposableSubscribe = observableInterval.subscribe(f2__externalsyntheticlambda4 == new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: io.reactivex.rxkotlin.SubscribersKt$onNextStub$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                obj.getClass();
                return createFromParcel.INSTANCE;
            }
        } ? Functions.serializer : new Consumer() { // from class: io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                f2__externalsyntheticlambda4.invoke(obj).getClass();
            }
        }, anonymousClass2 == new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                ((Throwable) obj).getClass();
                return createFromParcel.INSTANCE;
            }
        } ? Functions.RemoteActionCompatParcelizer : new Consumer() { // from class: io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Object obj) {
                anonymousClass2.invoke(obj).getClass();
            }
        }, Functions.read);
        disposableSubscribe.getClass();
        return disposableSubscribe;
    }
}
