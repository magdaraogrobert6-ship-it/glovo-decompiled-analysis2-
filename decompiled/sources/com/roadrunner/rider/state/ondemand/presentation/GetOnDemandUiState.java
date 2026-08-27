package com.roadrunner.rider.state.ondemand.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.opportunities.map.GetCityBoundariesMapLayer$invoke$1;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.getAppInstallTime;
import o.setTransactionSuccessful;
import o.subscribeToBannersUpdateslambda2;
import o.v9;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOnDemandUiState {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final GetStatusUseCaseImpl IconCompatParcelizer;
    public final CanRequestLocationUpdatesImpl RemoteActionCompatParcelizer;
    public final v9 read;
    public final subscribeToBannersUpdateslambda2 serializer;
    public final setTransactionSuccessful write;

    public GetOnDemandUiState(setTransactionSuccessful settransactionsuccessful, GetStatusUseCaseImpl getStatusUseCaseImpl, v9 v9Var, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl) {
        this.write = settransactionsuccessful;
        this.IconCompatParcelizer = getStatusUseCaseImpl;
        this.read = v9Var;
        this.serializer = subscribetobannersupdateslambda2;
        this.RemoteActionCompatParcelizer = canRequestLocationUpdatesImpl;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        getAppInstallTime getappinstalltime;
        int i = 2 % 2;
        int i2 = 1;
        if (!(continuationImpl instanceof getAppInstallTime)) {
            getappinstalltime = new getAppInstallTime(this, continuationImpl);
        } else {
            getappinstalltime = (getAppInstallTime) continuationImpl;
            int i3 = getappinstalltime.read;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = RatingCompat + 31;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                getappinstalltime.read = i4 % 2 != 0 ? i3 * Integer.MIN_VALUE : i3 - Integer.MIN_VALUE;
            } else {
                getappinstalltime = new getAppInstallTime(this, continuationImpl);
            }
        }
        Object obj = getappinstalltime.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getappinstalltime.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 != 0) {
            int i6 = MediaMetadataCompat + 53;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i8 = MediaMetadataCompat + 53;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getappinstalltime.read = 1;
            obj = this.IconCompatParcelizer.read();
            if (obj == obj2) {
                int i10 = RatingCompat + 85;
                MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return obj2;
            }
        }
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1((Flow) obj, this.RemoteActionCompatParcelizer.serializer(), new GetCityBoundariesMapLayer$invoke$1(this, shortNewsContentCardView, i2));
    }
}
