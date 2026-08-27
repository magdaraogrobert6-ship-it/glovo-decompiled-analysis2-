package com.roadrunner.phonenumber.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.push.PushEventPublisherImpl$emit$1;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCustomerPhoneNumberUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final transferSessionPackageI serializer;
    public final GetAppStateImpl write;

    public GetCustomerPhoneNumberUseCaseImpl(GetAppStateImpl getAppStateImpl, transferSessionPackageI transfersessionpackagei, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = getAppStateImpl;
        this.serializer = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public final Object m5002invokegIAlus(r8lambdapwU9vT7rpJZcI3849jLOV6VNoHA r8lambdapwu9vt7rpjzci3849jlov6vnoha, ContinuationImpl continuationImpl) {
        GetCustomerPhoneNumberUseCaseImpl$invoke$1 getCustomerPhoneNumberUseCaseImpl$invoke$1;
        int i = 2 % 2;
        int i2 = read + 59;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof GetCustomerPhoneNumberUseCaseImpl$invoke$1;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof GetCustomerPhoneNumberUseCaseImpl$invoke$1) {
            getCustomerPhoneNumberUseCaseImpl$invoke$1 = (GetCustomerPhoneNumberUseCaseImpl$invoke$1) continuationImpl;
            int i3 = getCustomerPhoneNumberUseCaseImpl$invoke$1.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IconCompatParcelizer + 77;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getCustomerPhoneNumberUseCaseImpl$invoke$1.serializer = i3 - Integer.MIN_VALUE;
            } else {
                getCustomerPhoneNumberUseCaseImpl$invoke$1 = new GetCustomerPhoneNumberUseCaseImpl$invoke$1(this, continuationImpl);
            }
        } else {
            getCustomerPhoneNumberUseCaseImpl$invoke$1 = new GetCustomerPhoneNumberUseCaseImpl$invoke$1(this, continuationImpl);
        }
        Object objWithContext = getCustomerPhoneNumberUseCaseImpl$invoke$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = getCustomerPhoneNumberUseCaseImpl$invoke$1.serializer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
            PushEventPublisherImpl$emit$1 pushEventPublisherImpl$emit$1 = new PushEventPublisherImpl$emit$1(this, r8lambdapwu9vt7rpjzci3849jlov6vnoha, shortNewsContentCardView, 29);
            getCustomerPhoneNumberUseCaseImpl$invoke$1.serializer = 1;
            objWithContext = BuildersKt.withContext(defaultIoScheduler, pushEventPublisherImpl$emit$1, getCustomerPhoneNumberUseCaseImpl$invoke$1);
            if (objWithContext == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        }
        return ((onItemDismiss) objWithContext).IconCompatParcelizer;
    }
}
