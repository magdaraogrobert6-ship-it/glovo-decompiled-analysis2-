package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.overdue.data.IssueRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FocusGroupPropertiesNodeonExit1;
import o.copyNs73l9s;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class DeclineDeliveriesUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final IssueRepository RemoteActionCompatParcelizer;

    public DeclineDeliveriesUseCaseImpl(IssueRepository issueRepository) {
        this.RemoteActionCompatParcelizer = issueRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m4901invokegIAlus(copyNs73l9s copyns73l9s, ContinuationImpl continuationImpl) {
        DeclineDeliveriesUseCaseImpl$invoke$1 declineDeliveriesUseCaseImpl$invoke$1;
        int i = 2 % 2;
        if (!(continuationImpl instanceof DeclineDeliveriesUseCaseImpl$invoke$1)) {
            declineDeliveriesUseCaseImpl$invoke$1 = new DeclineDeliveriesUseCaseImpl$invoke$1(this, continuationImpl);
            int i2 = IconCompatParcelizer + 85;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            declineDeliveriesUseCaseImpl$invoke$1 = (DeclineDeliveriesUseCaseImpl$invoke$1) continuationImpl;
            int i4 = declineDeliveriesUseCaseImpl$invoke$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = read + 19;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                declineDeliveriesUseCaseImpl$invoke$1.write = i4 - Integer.MIN_VALUE;
            } else {
                declineDeliveriesUseCaseImpl$invoke$1 = new DeclineDeliveriesUseCaseImpl$invoke$1(this, continuationImpl);
                int i7 = IconCompatParcelizer + 85;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        DeclineDeliveriesUseCaseImpl$invoke$1 declineDeliveriesUseCaseImpl$invoke$2 = declineDeliveriesUseCaseImpl$invoke$1;
        Object obj = declineDeliveriesUseCaseImpl$invoke$2.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = declineDeliveriesUseCaseImpl$invoke$2.write;
        Object obj2 = null;
        if (i9 != 0) {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = read + 39;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 28 / 0;
                }
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
            int i12 = IconCompatParcelizer + 95;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                return obj3;
            }
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        String str = copyns73l9s.RemoteActionCompatParcelizer;
        FocusGroupPropertiesNodeonExit1 focusGroupPropertiesNodeonExit1 = copyns73l9s.write;
        declineDeliveriesUseCaseImpl$invoke$2.write = 1;
        Object objM4921reportIssueyxL6bBk = this.RemoteActionCompatParcelizer.m4921reportIssueyxL6bBk(str, "Delivery declined by Courier", "courier_decline", focusGroupPropertiesNodeonExit1, declineDeliveriesUseCaseImpl$invoke$2);
        if (objM4921reportIssueyxL6bBk != coroutineSingletons) {
            return objM4921reportIssueyxL6bBk;
        }
        int i13 = read + 21;
        int i14 = i13 % Fields.SpotShadowColor;
        IconCompatParcelizer = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 31;
        read = i16 % Fields.SpotShadowColor;
        if (i16 % 2 != 0) {
            return coroutineSingletons;
        }
        obj2.hashCode();
        throw null;
    }
}
