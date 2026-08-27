package com.braze.ui.inappmessage;

import coil3.ExtrasKt;
import com.braze.models.inappmessage.IInAppMessage;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeInAppMessageManager$registerInAppMessageManager$5$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    final /* synthetic */ IInAppMessage $it;
    int label;
    final /* synthetic */ BrazeInAppMessageManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeInAppMessageManager$registerInAppMessageManager$5$2(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, ShortNewsContentCardView<? super BrazeInAppMessageManager$registerInAppMessageManager$5$2> shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = brazeInAppMessageManager;
        this.$it = iInAppMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this.this$0, this.$it, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            BrazeInAppMessageManager brazeInAppMessageManager = this.this$0;
            IInAppMessage iInAppMessage = this.$it;
            this.label = 1;
            if (brazeInAppMessageManager.displayInAppMessage(iInAppMessage, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return ((BrazeInAppMessageManager$registerInAppMessageManager$5$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
