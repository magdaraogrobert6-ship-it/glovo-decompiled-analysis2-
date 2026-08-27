package com.roadrunner.diagnostics.domain;

import androidx.compose.ui.graphics.Fields;
import com.data.util.AndroidScheduleProvider;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda1;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleFlatMap;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import o.accessgetOldDependenciesSetp;
import o.getPivotOffsetF1C5BW0;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import org.bouncycastle.asn1.ASN1UniversalType;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckDeviceTokenUseCase extends ASN1UniversalType {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final accessgetOldDependenciesSetp RemoteActionCompatParcelizer;
    public final getPivotOffsetF1C5BW0 serializer;
    public final NotificationsDiagnosticsRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckDeviceTokenUseCase(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, accessgetOldDependenciesSetp accessgetolddependenciessetp, NotificationsDiagnosticsRepository notificationsDiagnosticsRepository) {
        super(5, ((AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        accessgetolddependenciessetp.getClass();
        notificationsDiagnosticsRepository.getClass();
        this.serializer = getpivotoffsetf1c5bw0;
        this.RemoteActionCompatParcelizer = accessgetolddependenciessetp;
        this.write = notificationsDiagnosticsRepository;
    }

    @Override // org.bouncycastle.asn1.ASN1UniversalType
    public final Single IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        SingleFlatMap singleFlatMap = new SingleFlatMap(new SingleObserveOn(new SingleResumeNext(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), new RetryWithDelay$$ExternalSyntheticLambda1(15, new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(16))), ((AndroidScheduleProvider) this.serializer).IconCompatParcelizer()), new RetryWithDelay$$ExternalSyntheticLambda1(16, new RetryWithDelay$$ExternalSyntheticLambda0(14, this)));
        int i2 = read + 125;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return singleFlatMap;
    }
}
