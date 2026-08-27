package com.roadrunner.customerchat.usecase;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatPreloadingObserverImpl$onCreate$1$1$1 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Boolean IconCompatParcelizer;
    public /* synthetic */ boolean read;
    public /* synthetic */ List write;

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        CustomerChatPreloadingObserverImpl$onCreate$1$1$1 customerChatPreloadingObserverImpl$onCreate$1$1$1 = new CustomerChatPreloadingObserverImpl$onCreate$1$1$1(4, (ShortNewsContentCardView) obj4);
        customerChatPreloadingObserverImpl$onCreate$1$1$1.IconCompatParcelizer = (Boolean) obj;
        customerChatPreloadingObserverImpl$onCreate$1$1$1.read = zBooleanValue;
        customerChatPreloadingObserverImpl$onCreate$1$1$1.write = (List) obj3;
        Object objInvokeSuspend = customerChatPreloadingObserverImpl$onCreate$1$1$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = serializer + 33;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = serializer + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Boolean bool = this.IconCompatParcelizer;
            List list = this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            bool.booleanValue();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Boolean bool2 = this.IconCompatParcelizer;
        boolean z2 = this.read;
        List list2 = this.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (bool2.booleanValue() && z2) {
            int i3 = RemoteActionCompatParcelizer + 13;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Boolean.valueOf(z), list2);
        int i5 = RemoteActionCompatParcelizer + 29;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onviewattachedtowindowlambda0;
    }

    public CustomerChatPreloadingObserverImpl$onCreate$1$1$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
