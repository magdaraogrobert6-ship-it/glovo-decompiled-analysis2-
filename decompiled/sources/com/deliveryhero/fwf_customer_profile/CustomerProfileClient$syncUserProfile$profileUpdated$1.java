package com.deliveryhero.fwf_customer_profile;

import coil3.ExtrasKt;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomerProfileClient$syncUserProfile$profileUpdated$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    int label;
    final /* synthetic */ CustomerProfileClient this$0;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_customer_profile.CustomerProfileClient$syncUserProfile$profileUpdated$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;
        final /* synthetic */ CustomerProfileClient this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.this$0, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                CustomerProfileClient customerProfileClient = this.this$0;
                this.label = 1;
                obj = customerProfileClient.loadUserProfile(this);
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
            SyncResult syncResult = (SyncResult) obj;
            if (this.this$0.getConfig().getUpdateProfile()) {
                CustomerProfileClient customerProfileClient2 = this.this$0;
                customerProfileClient2.startUserProfileTimer(customerProfileClient2.getConfig().getProfileExpirationTime());
            }
            return syncResult;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CustomerProfileClient customerProfileClient, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.this$0 = customerProfileClient;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
        return new CustomerProfileClient$syncUserProfile$profileUpdated$1(this.this$0, shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 1;
        Object objWithContext = BuildersKt.withContext(defaultIoScheduler, anonymousClass1, this);
        return objWithContext == coroutineSingletons ? coroutineSingletons : objWithContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerProfileClient$syncUserProfile$profileUpdated$1(CustomerProfileClient customerProfileClient, ShortNewsContentCardView<? super CustomerProfileClient$syncUserProfile$profileUpdated$1> shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = customerProfileClient;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        return ((CustomerProfileClient$syncUserProfile$profileUpdated$1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
    }
}
