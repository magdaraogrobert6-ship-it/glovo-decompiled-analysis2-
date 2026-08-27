package o;

import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.ui.common.base.BaseRxViewModel;
import com.ui.common.base.BaseRxViewModelKt;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: renamed from: o.getOrderId, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0169getOrderId extends BaseRxViewModel {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final SharedResourcePool IconCompatParcelizer;
    public final BrazeLogger MediaMetadataCompat;
    public final setTransactionSuccessful MediaSessionCompatQueueItem;
    public final NetworkErrorMapperImpl RemoteActionCompatParcelizer;
    public final OtpLogger read;
    public final AdjustEventFailure serializer;
    public final BrazeExternalSyntheticLambda28 write;

    public final SharedResourcePool read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    public final BrazeLogger serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        BrazeLogger brazeLogger = this.MediaMetadataCompat;
        int i5 = i3 + 79;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return brazeLogger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169getOrderId(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, ConstraintHelper constraintHelper, AdjustEventFailure adjustEventFailure, setTransactionSuccessful settransactionsuccessful, NetworkErrorMapperImpl networkErrorMapperImpl, OtpLogger otpLogger, SharedResourcePool sharedResourcePool) {
        super(getpivotoffsetf1c5bw0);
        getpivotoffsetf1c5bw0.getClass();
        brazeExternalSyntheticLambda28.getClass();
        constraintHelper.getClass();
        adjustEventFailure.getClass();
        settransactionsuccessful.getClass();
        networkErrorMapperImpl.getClass();
        otpLogger.getClass();
        sharedResourcePool.getClass();
        this.write = brazeExternalSyntheticLambda28;
        this.serializer = adjustEventFailure;
        this.MediaSessionCompatQueueItem = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = networkErrorMapperImpl;
        this.read = otpLogger;
        this.IconCompatParcelizer = sharedResourcePool;
        this.MediaMetadataCompat = new BrazeLogger(new byte2HexFormatted(null, instance_delegatelambda0.write));
        BaseRxViewModelKt.read(this, constraintHelper.serializer(setDeduplicationId.IconCompatParcelizer), new TncContentKt$$ExternalSyntheticLambda2(14, this));
    }
}
