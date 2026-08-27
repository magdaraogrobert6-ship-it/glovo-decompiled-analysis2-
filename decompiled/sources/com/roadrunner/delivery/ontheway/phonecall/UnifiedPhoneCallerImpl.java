package com.roadrunner.delivery.ontheway.phonecall;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.n0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getSpanVerticalAligndo9XGg;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UnifiedPhoneCallerImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final PhoneNumberCallerImpl write;

    public UnifiedPhoneCallerImpl(PhoneNumberCallerImpl phoneNumberCallerImpl, n0 n0Var) {
        this.write = phoneNumberCallerImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    /* JADX INFO: renamed from: call-gIAlu-s, reason: not valid java name */
    public final Object m4919callgIAlus(getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg, ContinuationImpl continuationImpl) {
        UnifiedPhoneCallerImpl$call$1 unifiedPhoneCallerImpl$call$1;
        int i = 2 % 2;
        int i2 = read + 23;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (continuationImpl instanceof UnifiedPhoneCallerImpl$call$1) {
            int i5 = i3 + 37;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            unifiedPhoneCallerImpl$call$1 = (UnifiedPhoneCallerImpl$call$1) continuationImpl;
            int i7 = unifiedPhoneCallerImpl$call$1.RemoteActionCompatParcelizer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                unifiedPhoneCallerImpl$call$1.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
            } else {
                unifiedPhoneCallerImpl$call$1 = new UnifiedPhoneCallerImpl$call$1(this, continuationImpl);
            }
        } else {
            unifiedPhoneCallerImpl$call$1 = new UnifiedPhoneCallerImpl$call$1(this, continuationImpl);
        }
        Object obj = unifiedPhoneCallerImpl$call$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = unifiedPhoneCallerImpl$call$1.RemoteActionCompatParcelizer;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getspanverticalaligndo9xgg.getClass();
            unifiedPhoneCallerImpl$call$1.RemoteActionCompatParcelizer = 1;
            Object objM4918callgIAlus = this.write.m4918callgIAlus(getspanverticalaligndo9xgg, unifiedPhoneCallerImpl$call$1);
            return objM4918callgIAlus == coroutineSingletons ? coroutineSingletons : objM4918callgIAlus;
        }
        if (i8 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i9 = read + 19;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i9 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }
}
