package com.roadrunner.rider.state.cashblock.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.displayInAppMessagelambda1;
import o.getHttpsURLConnectionProvider;
import o.getInstallSessionBackoffStrategy;
import o.getSdkClickBackoffStrategy;
import o.transferSessionPackageI;
import o.updateAdidI;
import o.verifyAndTrackPlayStorePurchaseI;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCashBlockUiState {
    private static int read = 0;
    private static int serializer = 1;
    public final GetShiftInfoImpl IconCompatParcelizer;
    public final CachedDeliveryRepository RemoteActionCompatParcelizer;
    public final FormBody.Builder write;

    public GetCashBlockUiState(FormBody.Builder builder, GetShiftInfoImpl getShiftInfoImpl, CachedDeliveryRepository cachedDeliveryRepository) {
        this.write = builder;
        this.IconCompatParcelizer = getShiftInfoImpl;
        this.RemoteActionCompatParcelizer = cachedDeliveryRepository;
    }

    public final Flow RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 53;
        read = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            ((FirebaseRemoteConfigImpl) ((transferSessionPackageI) this.write.RemoteActionCompatParcelizer)).IconCompatParcelizer(updateAdidI.IS_CASH_BLOCK_ENABLED);
            throw null;
        }
        FormBody.Builder builder = this.write;
        if (((FirebaseRemoteConfigImpl) ((transferSessionPackageI) builder.RemoteActionCompatParcelizer)).IconCompatParcelizer(updateAdidI.IS_CASH_BLOCK_ENABLED)) {
            if (((Gen2FunWithFlagsConfigRepository) ((verifyAndTrackPlayStorePurchaseI) builder.serializer)).serializer(getHttpsURLConnectionProvider.write, displayInAppMessagelambda1.serializer(getSdkClickBackoffStrategy.class)) == getSdkClickBackoffStrategy.TREATMENT) {
                return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.RemoteActionCompatParcelizer.write(), this.IconCompatParcelizer.write(), new GetCashBlockUiState$invoke$1(3, 0, shortNewsContentCardView));
            }
        }
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(getInstallSessionBackoffStrategy.IconCompatParcelizer);
        int i3 = serializer + 57;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
    }
}
