package com.braze.push;

import android.content.Context;
import android.content.Intent;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class BrazePushReceiver$Companion$handleReceivedIntent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazePushReceiver$Companion$handleReceivedIntent$1(Context context, Intent intent, ShortNewsContentCardView<? super BrazePushReceiver$Companion$handleReceivedIntent$1> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$context = context;
        this.$intent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new BrazePushReceiver$Companion$handleReceivedIntent$1(this.$context, this.$intent, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BrazePushReceiver.Companion companion = BrazePushReceiver.Companion;
        Context applicationContext = this.$context.getApplicationContext();
        applicationContext.getClass();
        companion.handlePush(applicationContext, this.$intent);
        return createFromParcel.INSTANCE;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((BrazePushReceiver$Companion$handleReceivedIntent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
