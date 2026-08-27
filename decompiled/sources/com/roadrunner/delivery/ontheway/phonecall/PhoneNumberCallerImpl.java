package com.roadrunner.delivery.ontheway.phonecall;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.SpannableExtensions_androidKt;
import o.getBoldannotations;
import o.getSpanVerticalAligndo9XGg;
import o.isItemDismissable;
import o.localeSpan;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneNumberCallerImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final SendTestPushUseCase read;
    public final localeSpan serializer;
    public final SpannableExtensions_androidKt write;

    public PhoneNumberCallerImpl(SendTestPushUseCase sendTestPushUseCase, SpannableExtensions_androidKt spannableExtensions_androidKt, localeSpan localespan) {
        this.read = sendTestPushUseCase;
        this.write = spannableExtensions_androidKt;
        this.serializer = localespan;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX INFO: renamed from: call-gIAlu-s, reason: not valid java name */
    public final Object m4918callgIAlus(getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg, ContinuationImpl continuationImpl) {
        PhoneNumberCallerImpl$call$1 phoneNumberCallerImpl$call$1;
        Object objM4957invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof PhoneNumberCallerImpl$call$1) {
            phoneNumberCallerImpl$call$1 = (PhoneNumberCallerImpl$call$1) continuationImpl;
            int i2 = phoneNumberCallerImpl$call$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 101;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                phoneNumberCallerImpl$call$1.IconCompatParcelizer = i3 % 2 == 0 ? i2 % Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                phoneNumberCallerImpl$call$1 = new PhoneNumberCallerImpl$call$1(this, continuationImpl);
            }
        } else {
            phoneNumberCallerImpl$call$1 = new PhoneNumberCallerImpl$call$1(this, continuationImpl);
        }
        Object obj = phoneNumberCallerImpl$call$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = phoneNumberCallerImpl$call$1.IconCompatParcelizer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            phoneNumberCallerImpl$call$1.serializer = getspanverticalaligndo9xgg;
            phoneNumberCallerImpl$call$1.IconCompatParcelizer = 1;
            objM4957invokegIAlus = this.read.m4957invokegIAlus(getspanverticalaligndo9xgg, phoneNumberCallerImpl$call$1);
            if (objM4957invokegIAlus == coroutineSingletons) {
                int i5 = RemoteActionCompatParcelizer + 121;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            getspanverticalaligndo9xgg = phoneNumberCallerImpl$call$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4957invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4957invokegIAlus);
        if (thSerializer != null) {
            return new isItemDismissable(thSerializer);
        }
        Object obj2 = this.write.read(((getBoldannotations) objM4957invokegIAlus).number);
        if (!(obj2 instanceof isItemDismissable)) {
            this.serializer.RemoteActionCompatParcelizer.put(Long.valueOf(getspanverticalaligndo9xgg.serializer), Long.valueOf(System.currentTimeMillis()));
        }
        return obj2;
    }
}
