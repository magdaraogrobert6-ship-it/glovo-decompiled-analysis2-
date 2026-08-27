package o;

import com.roadrunner.delivery.stacked.delivery.details.ui.StackedDeliveryDetailsViewModel$init$1;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class timesadjELrA extends androidx.lifecycle.ViewModel {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final SharedResourcePool IconCompatParcelizer;
    public final MutableStateFlow MediaSessionCompatQueueItem;
    public final ComposeViewAdapter_androidKt RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final transferSessionPackageI serializer;
    public final getMToDpValues write;

    public final SharedResourcePool write() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 9;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.IconCompatParcelizer;
        int i5 = i2 + 73;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return sharedResourcePool;
    }

    public timesadjELrA(SharedResourcePool sharedResourcePool, ComposeViewAdapter_androidKt composeViewAdapter_androidKt, getMToDpValues getmtodpvalues, transferSessionPackageI transfersessionpackagei) {
        sharedResourcePool.getClass();
        composeViewAdapter_androidKt.getClass();
        getmtodpvalues.getClass();
        transfersessionpackagei.getClass();
        this.IconCompatParcelizer = sharedResourcePool;
        this.RemoteActionCompatParcelizer = composeViewAdapter_androidKt;
        this.write = getmtodpvalues;
        this.serializer = transfersessionpackagei;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new getUnspecifiedUIouoOA(null));
        this.read = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
    }

    public final void read(long j) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new StackedDeliveryDetailsViewModel$init$1(this, j, null, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new StackedDeliveryDetailsViewModel$init$1(this, j, null, 1), 3);
        int i2 = MediaBrowserCompatMediaItem + 37;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
