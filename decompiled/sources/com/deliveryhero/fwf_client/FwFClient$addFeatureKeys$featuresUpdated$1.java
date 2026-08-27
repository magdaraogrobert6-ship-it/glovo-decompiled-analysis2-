package com.deliveryhero.fwf_client;

import coil3.ExtrasKt;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClient$addFeatureKeys$featuresUpdated$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ Set<String> $keys;
    int label;
    final /* synthetic */ FwFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClient$addFeatureKeys$featuresUpdated$1(FwFClient fwFClient, Set<String> set, ShortNewsContentCardView<? super FwFClient$addFeatureKeys$featuresUpdated$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = fwFClient;
        this.$keys = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new FwFClient$addFeatureKeys$featuresUpdated$1(this.this$0, this.$keys, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!this.this$0.getConfig$fwf_client_release().addKeys$fwf_client_release(this.$keys)) {
                return Boolean.TRUE;
            }
            FwFClient fwFClient = this.this$0;
            this.label = 1;
            obj = fwFClient.updateFeatures(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return Boolean.valueOf(((SyncResult) obj).getSuccess());
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super Boolean> shortNewsContentCardView) {
        return ((FwFClient$addFeatureKeys$featuresUpdated$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
