package com.google.android.gms.internal.mlkit_vision_face;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UseCaseUtilsKt$executeIfValid$1;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UseCaseUtilsKt$validateAndExecuteApiCall$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AnimationSearchSearch;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzng {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static final Object validateAndExecuteApiCall(AnimationSearchSearch animationSearchSearch, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, String str, ContinuationImpl continuationImpl) {
        UseCaseUtilsKt$validateAndExecuteApiCall$1 useCaseUtilsKt$validateAndExecuteApiCall$1;
        int i = 2 % 2;
        if (continuationImpl instanceof UseCaseUtilsKt$validateAndExecuteApiCall$1) {
            int i2 = RemoteActionCompatParcelizer + 67;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            useCaseUtilsKt$validateAndExecuteApiCall$1 = (UseCaseUtilsKt$validateAndExecuteApiCall$1) continuationImpl;
            int i4 = useCaseUtilsKt$validateAndExecuteApiCall$1.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 91;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                useCaseUtilsKt$validateAndExecuteApiCall$1.read = i4 - Integer.MIN_VALUE;
            } else {
                useCaseUtilsKt$validateAndExecuteApiCall$1 = new UseCaseUtilsKt$validateAndExecuteApiCall$1(continuationImpl);
            }
        } else {
            useCaseUtilsKt$validateAndExecuteApiCall$1 = new UseCaseUtilsKt$validateAndExecuteApiCall$1(continuationImpl);
        }
        Object obj = useCaseUtilsKt$validateAndExecuteApiCall$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = useCaseUtilsKt$validateAndExecuteApiCall$1.read;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            useCaseUtilsKt$validateAndExecuteApiCall$1.read = 1;
            Object objExecuteIfValid = executeIfValid(animationSearchSearch, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, str, useCaseUtilsKt$validateAndExecuteApiCall$1);
            return objExecuteIfValid == coroutineSingletons ? coroutineSingletons : objExecuteIfValid;
        }
        int i8 = read;
        int i9 = i8 + 45;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i9 % 2 == 0 ? i7 != 1 : i7 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i10 = RemoteActionCompatParcelizer + 85;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = i8 + 89;
        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object executeIfValid(AnimationSearchSearch animationSearchSearch, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, String str, ContinuationImpl continuationImpl) {
        UseCaseUtilsKt$executeIfValid$1 useCaseUtilsKt$executeIfValid$1;
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof UseCaseUtilsKt$executeIfValid$1) {
            useCaseUtilsKt$executeIfValid$1 = (UseCaseUtilsKt$executeIfValid$1) continuationImpl;
            int i4 = useCaseUtilsKt$executeIfValid$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                useCaseUtilsKt$executeIfValid$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                useCaseUtilsKt$executeIfValid$1 = new UseCaseUtilsKt$executeIfValid$1(continuationImpl);
            }
        } else {
            useCaseUtilsKt$executeIfValid$1 = new UseCaseUtilsKt$executeIfValid$1(continuationImpl);
        }
        Object objInvoke = useCaseUtilsKt$executeIfValid$1.write;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = useCaseUtilsKt$executeIfValid$1.IconCompatParcelizer;
        Object obj2 = null;
        if (i5 != 0) {
            int i6 = read + 55;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) animationSearchSearch.read)) {
                return new isItemDismissable(new IllegalArgumentException(str + " " + animationSearchSearch));
            }
            Object obj3 = animationSearchSearch.read;
            Object obj4 = animationSearchSearch.IconCompatParcelizer;
            useCaseUtilsKt$executeIfValid$1.IconCompatParcelizer = 1;
            objInvoke = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(obj3, obj4, useCaseUtilsKt$executeIfValid$1);
            if (objInvoke == obj) {
                int i7 = read + 11;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return obj;
            }
        }
        Object obj5 = ((onItemDismiss) objInvoke).IconCompatParcelizer;
        int i9 = read + 63;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return obj5;
        }
        obj2.hashCode();
        throw null;
    }
}
