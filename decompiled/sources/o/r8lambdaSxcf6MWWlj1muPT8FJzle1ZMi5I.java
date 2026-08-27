package o;

import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import io.grpc.internal.SharedResourcePool;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I extends androidx.lifecycle.ViewModel {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s IconCompatParcelizer;
    public final StateFlow RemoteActionCompatParcelizer;
    public final r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU read;
    public final SharedResourcePool serializer;
    public final MutableStateFlow write;

    public final SharedResourcePool IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 13;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        SharedResourcePool sharedResourcePool = this.serializer;
        int i5 = i2 + 43;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public final r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 53;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU r8lambda_8tdj25vpd8y8rn041xoxhmn3eu = this.read;
        int i4 = i2 + 91;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 36 / 0;
        }
        return r8lambda_8tdj25vpd8y8rn041xoxhmn3eu;
    }

    public r8lambdaSxcf6MWWlj1muPT8FJzle1ZMi5I(setTransactionSuccessful settransactionsuccessful, SharedResourcePool sharedResourcePool, r8lambdaJfSwS2PRWMpHRIytRV9qwrOw8s r8lambdajfsws2prwmphriytrv9qwrow8s, r8lambdaGsxfkYxRefLxpEZ6flYq5eiAOLo r8lambdagsxfkyxreflxpez6flyq5eiaolo) {
        settransactionsuccessful.getClass();
        sharedResourcePool.getClass();
        r8lambdajfsws2prwmphriytrv9qwrow8s.getClass();
        r8lambdagsxfkyxreflxpez6flyq5eiaolo.getClass();
        this.serializer = sharedResourcePool;
        this.IconCompatParcelizer = r8lambdajfsws2prwmphriytrv9qwrow8s;
        r8lambdagsxfkyxreflxpez6flyq5eiaolo.read();
        this.read = new r8lambda_8tdJ25vpD8Y8RN041XoXhmn3eU(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.location_access_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.gps_location_access_description), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.enable_gps_action));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks(true));
        this.write = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new NafathModalUiModelImpl$1(this, null, 7), 3);
    }

    public final void RemoteActionCompatParcelizer(nowInMillisecondslambda0 nowinmillisecondslambda0) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 15;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (!(!(nowinmillisecondslambda0 instanceof isValidTimeZone))) {
            int i5 = i2 + 51;
            MediaMetadataCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            this.serializer.serializer(r8lambdaSNLjO_HuHH0BcjkmeJ_eXZT7iMA.OPEN_SETTINGS);
        }
        int i7 = MediaMetadataCompat + 61;
        MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }
}
