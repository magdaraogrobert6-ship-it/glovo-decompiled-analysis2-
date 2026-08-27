package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShadowSpan;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreAutoAcceptedDeliveryIdsImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final ShadowSpan serializer;

    public StoreAutoAcceptedDeliveryIdsImpl(ShadowSpan shadowSpan) {
        this.serializer = shadowSpan;
    }

    public final Object invoke(List list, ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 69;
        write = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            list.isEmpty();
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (!zIsEmpty) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new BridgeManager$trackEvent$2(this.serializer, list, shortNewsContentCardView, 26), continuationImpl);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objWithContext == coroutineSingletons) {
                int i3 = write + 17;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                objWithContext = createfromparcel2;
            }
            if (objWithContext == coroutineSingletons) {
                int i5 = write + 13;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 0 / 0;
                }
                return objWithContext;
            }
        }
        return createfromparcel2;
    }
}
