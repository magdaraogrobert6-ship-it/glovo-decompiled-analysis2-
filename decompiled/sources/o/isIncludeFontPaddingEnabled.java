package o;

import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isIncludeFontPaddingEnabled extends androidx.lifecycle.ViewModel {
    private static int RatingCompat = 1;
    private static int read;
    public final createCharSequence IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final StateFlow serializer;
    public final getQueryContext write;

    public isIncludeFontPaddingEnabled(transferSessionPackageI transfersessionpackagei, SendTestPushUseCase sendTestPushUseCase, createCharSequence createcharsequence, getQueryContext getquerycontext) {
        transfersessionpackagei.getClass();
        sendTestPushUseCase.getClass();
        createcharsequence.getClass();
        getquerycontext.getClass();
        this.IconCompatParcelizer = createcharsequence;
        this.write = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(PlatformLocaleKt.read);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.serializer = mutableStateFlow;
        int iSerializer = com.mapbox.navigator.R.serializer();
        int iSerializer2 = com.mapbox.navigator.R.serializer();
        int iSerializer3 = com.mapbox.navigator.R.serializer();
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(52023560, iSerializer2, com.mapbox.navigator.R.serializer(), -52023556, iSerializer3, iSerializer, new Object[]{(FirebaseRemoteConfigImpl) transfersessionpackagei})).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new DeliveryNotesUiModelImpl.AnonymousClass1(sendTestPushUseCase, this, null, 12), 3);
            int i = RatingCompat + 51;
            read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = read + 45;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 84 / 0;
        }
    }

    public final void write() {
        int i = 2 % 2;
        int i2 = read + 125;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createCharSequence createcharsequence = this.IconCompatParcelizer;
            createcharsequence.serializer.logEvent("entrance_image_open", createcharsequence.write());
            int i3 = 4 / 0;
        } else {
            createCharSequence createcharsequence2 = this.IconCompatParcelizer;
            createcharsequence2.serializer.logEvent("entrance_image_open", createcharsequence2.write());
        }
        int i4 = read + 53;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final getPlatformLocaleDelegate serializer() {
        int i = 2 % 2;
        Object obj = this.RemoteActionCompatParcelizer.read();
        Object obj2 = null;
        if (!(obj instanceof getPlatformLocaleDelegate)) {
            int i2 = RatingCompat + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = RatingCompat + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return (getPlatformLocaleDelegate) obj;
        }
        obj2.hashCode();
        throw null;
    }
}
