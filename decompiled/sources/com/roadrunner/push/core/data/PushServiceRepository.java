package com.roadrunner.push.core.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.access1500;
import o.onItemDismiss;
import o.r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k;

/* JADX INFO: loaded from: classes3.dex */
public final class PushServiceRepository {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k RemoteActionCompatParcelizer;
    public final ExecuteApiRequest read;
    public final r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k write;

    public PushServiceRepository(r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k, r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k2, ExecuteApiRequest executeApiRequest) {
        this.write = r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k;
        this.RemoteActionCompatParcelizer = r8lambdaxxf_oxjqyqvagkbotvkqpfwgj2k2;
        this.read = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    /* JADX INFO: renamed from: registerPushForApplicant-gIAlu-s, reason: not valid java name */
    public final Object m5003registerPushForApplicantgIAlus(access1500 access1500Var, ContinuationImpl continuationImpl) {
        PushServiceRepository$registerPushForApplicant$1 pushServiceRepository$registerPushForApplicant$1;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ShortNewsContentCardView shortNewsContentCardView;
        int i3;
        Object objM4875invokegIAlus;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 95;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            if (continuationImpl instanceof PushServiceRepository$registerPushForApplicant$1) {
                pushServiceRepository$registerPushForApplicant$1 = (PushServiceRepository$registerPushForApplicant$1) continuationImpl;
                i = pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
                }
            }
            obj = pushServiceRepository$registerPushForApplicant$1.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer;
            shortNewsContentCardView = null;
            i3 = 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return ((onItemDismiss) obj).IconCompatParcelizer;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                i4 = serializer + 105;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i7 = 84 / 0;
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PushServiceRepository$registerPushForRider$2 pushServiceRepository$registerPushForRider$2 = new PushServiceRepository$registerPushForRider$2(this, access1500Var, shortNewsContentCardView, i3);
            pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer = 1;
            objM4875invokegIAlus = this.read.m4875invokegIAlus(pushServiceRepository$registerPushForRider$2, pushServiceRepository$registerPushForApplicant$1);
            if (objM4875invokegIAlus != coroutineSingletons) {
                return objM4875invokegIAlus;
            }
            int i8 = IconCompatParcelizer + 19;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return coroutineSingletons;
        }
        int i10 = 94 / 0;
        if (continuationImpl instanceof PushServiceRepository$registerPushForApplicant$1) {
            pushServiceRepository$registerPushForApplicant$1 = (PushServiceRepository$registerPushForApplicant$1) continuationImpl;
            i = pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            }
        }
        obj = pushServiceRepository$registerPushForApplicant$1.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer;
        shortNewsContentCardView = null;
        i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            i4 = serializer + 105;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i11 = 84 / 0;
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        PushServiceRepository$registerPushForRider$2 pushServiceRepository$registerPushForRider$3 = new PushServiceRepository$registerPushForRider$2(this, access1500Var, shortNewsContentCardView, i3);
        pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer = 1;
        objM4875invokegIAlus = this.read.m4875invokegIAlus(pushServiceRepository$registerPushForRider$3, pushServiceRepository$registerPushForApplicant$1);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i12 = IconCompatParcelizer + 19;
        serializer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return coroutineSingletons;
        pushServiceRepository$registerPushForApplicant$1 = new PushServiceRepository$registerPushForApplicant$1(this, continuationImpl);
        int i14 = serializer + 115;
        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        obj = pushServiceRepository$registerPushForApplicant$1.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer;
        shortNewsContentCardView = null;
        i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            i4 = serializer + 105;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i16 = 84 / 0;
            }
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        PushServiceRepository$registerPushForRider$2 pushServiceRepository$registerPushForRider$4 = new PushServiceRepository$registerPushForRider$2(this, access1500Var, shortNewsContentCardView, i3);
        pushServiceRepository$registerPushForApplicant$1.RemoteActionCompatParcelizer = 1;
        objM4875invokegIAlus = this.read.m4875invokegIAlus(pushServiceRepository$registerPushForRider$4, pushServiceRepository$registerPushForApplicant$1);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i17 = IconCompatParcelizer + 19;
        serializer = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: registerPushForRider-gIAlu-s, reason: not valid java name */
    public final Object m5004registerPushForRidergIAlus(access1500 access1500Var, ContinuationImpl continuationImpl) {
        PushServiceRepository$registerPushForRider$1 pushServiceRepository$registerPushForRider$1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof PushServiceRepository$registerPushForRider$1) {
            pushServiceRepository$registerPushForRider$1 = (PushServiceRepository$registerPushForRider$1) continuationImpl;
            int i4 = pushServiceRepository$registerPushForRider$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pushServiceRepository$registerPushForRider$1.read = i4 - Integer.MIN_VALUE;
                int i5 = IconCompatParcelizer + 95;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                pushServiceRepository$registerPushForRider$1 = new PushServiceRepository$registerPushForRider$1(this, continuationImpl);
            }
        } else {
            pushServiceRepository$registerPushForRider$1 = new PushServiceRepository$registerPushForRider$1(this, continuationImpl);
        }
        Object obj = pushServiceRepository$registerPushForRider$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = pushServiceRepository$registerPushForRider$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PushServiceRepository$registerPushForRider$2 pushServiceRepository$registerPushForRider$2 = new PushServiceRepository$registerPushForRider$2(this, access1500Var, shortNewsContentCardView, 0);
            pushServiceRepository$registerPushForRider$1.read = 1;
            Object objM4875invokegIAlus = this.read.m4875invokegIAlus(pushServiceRepository$registerPushForRider$2, pushServiceRepository$registerPushForRider$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        if (i7 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i8 = serializer + 31;
        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return null;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
