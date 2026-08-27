package com.deliveryhero.chatui.view.root;

import android.os.Bundle;
import coil3.ExtrasKt;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerChatActivity$observeState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Bundle read;
    public final /* synthetic */ CustomerChatActivity serializer;
    public final /* synthetic */ CustomerChatModule write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerChatActivity$observeState$1(CustomerChatActivity customerChatActivity, Bundle bundle, CustomerChatModule customerChatModule, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = customerChatActivity;
        this.read = bundle;
        this.write = customerChatModule;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((CustomerChatActivity$observeState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((CustomerChatActivity$observeState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 1;
        if (this.RemoteActionCompatParcelizer == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.IconCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.CREATED;
                CustomerChatActivity customerChatActivity = this.serializer;
                CustomerChatActivity$observeState$1 customerChatActivity$observeState$1 = new CustomerChatActivity$observeState$1(customerChatActivity, this.read, this.write, null, 1);
                this.IconCompatParcelizer = 1;
                if (UrlUtils.repeatOnLifecycle(customerChatActivity, tocolorlong8_81lla, customerChatActivity$observeState$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.IconCompatParcelizer;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CustomerChatActivity customerChatActivity2 = this.serializer;
            StateFlow stateFlow = customerChatActivity2.RemoteActionCompatParcelizer().IconCompatParcelizer;
            GetNestScope$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2 = new GetNestScope$invoke$$inlined$map$1.AnonymousClass2(customerChatActivity2, this.read, this.write, i);
            this.IconCompatParcelizer = 1;
            if (stateFlow.collect(anonymousClass2, this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        DrawableTransformation.read();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return new CustomerChatActivity$observeState$1(this.serializer, this.read, this.write, shortNewsContentCardView, 1);
        }
        return new CustomerChatActivity$observeState$1(this.serializer, this.read, this.write, shortNewsContentCardView, 0);
    }
}
