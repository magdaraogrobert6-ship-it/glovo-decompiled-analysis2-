package com.roadrunner.push.core.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.push.core.data.PushServiceRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.access1500;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateApplicantPushToken {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final PushServiceRepository read;

    public UpdateApplicantPushToken(PushServiceRepository pushServiceRepository) {
        this.read = pushServiceRepository;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5005invokegIAlus(String str, ContinuationImpl continuationImpl) {
        UpdateApplicantPushToken$invoke$1 updateApplicantPushToken$invoke$1;
        int i = 2 % 2;
        int i2 = write + 47;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof UpdateApplicantPushToken$invoke$1) {
            updateApplicantPushToken$invoke$1 = (UpdateApplicantPushToken$invoke$1) continuationImpl;
            int i4 = updateApplicantPushToken$invoke$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 25;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                updateApplicantPushToken$invoke$1.serializer = i5 % 2 == 0 ? i4 / Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                updateApplicantPushToken$invoke$1 = new UpdateApplicantPushToken$invoke$1(this, continuationImpl);
            }
        } else {
            updateApplicantPushToken$invoke$1 = new UpdateApplicantPushToken$invoke$1(this, continuationImpl);
        }
        Object obj = updateApplicantPushToken$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = updateApplicantPushToken$invoke$1.serializer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            access1500 access1500Var = new access1500(str);
            updateApplicantPushToken$invoke$1.serializer = 1;
            Object objM5003registerPushForApplicantgIAlus = this.read.m5003registerPushForApplicantgIAlus(access1500Var, updateApplicantPushToken$invoke$1);
            return objM5003registerPushForApplicantgIAlus == coroutineSingletons ? coroutineSingletons : objM5003registerPushForApplicantgIAlus;
        }
        int i7 = RemoteActionCompatParcelizer + 73;
        write = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        if (i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i9 = write + 105;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return obj2;
    }
}
