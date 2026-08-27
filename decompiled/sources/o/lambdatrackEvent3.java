package o;

import com.roadrunner.realtime.data.ReconnectScheduler$schedule$1;
import com.roadrunner.realtime.data.SocketIoGuard;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdatrackEvent3 implements FlowCollector {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ SocketIoGuard write;

    public /* synthetic */ lambdatrackEvent3(SocketIoGuard socketIoGuard, int i) {
        this.read = i;
        this.write = socketIoGuard;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        lambdasetOfflineMode7 lambdasetofflinemode7;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        SocketIoGuard socketIoGuard = this.write;
        int i3 = 0;
        if (i2 == 0) {
            String str = socketIoGuard.IconCompatParcelizer;
            if (str != null) {
                socketIoGuard.IconCompatParcelizer(str, false);
            }
            return createfromparcel;
        }
        StateFlow stateFlow = socketIoGuard.RatingCompat;
        lambdasetPushToken32 lambdasetpushtoken32 = socketIoGuard.MediaMetadataCompat;
        int i4 = lambdasetPushToken33.write[((lambdaremoveGlobalPartnerParameter26) stateFlow.read()).ordinal()];
        if (i4 == 1) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Realtime socket reconnection: schedule request received", new Object[0]);
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = lambdasetpushtoken32.MediaMetadataCompat;
            ShortNewsContentCardView shortNewsContentCardView2 = null;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                int i5 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            lambdasetpushtoken32.MediaMetadataCompat = null;
            lambdasetCoppaComplianceInDelay49 lambdasetcoppacomplianceindelay49 = lambdasetpushtoken32.RemoteActionCompatParcelizer;
            String str2 = ((FirebaseRemoteConfigImpl) lambdasetcoppacomplianceindelay49.write).IconCompatParcelizer.read("realtime_reconnect_configuration");
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                lambdasetofflinemode7 = new lambdasetOfflineMode7();
            } else {
                try {
                    resetTransientState resettransientstate = (resetTransientState) lambdasetcoppacomplianceindelay49.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                    resettransientstate.getClass();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = lambdasetOfflineMode7.Companion.serializer();
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                    lambdasetofflinemode7 = (lambdasetOfflineMode7) resettransientstate.serializer(str2, setgraphicmodalmaxwidthdpSerializer);
                    int i7 = IconCompatParcelizer + 9;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                } catch (Exception e) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to parse reconnect configuration, using defaults", new Object[0]);
                    lambdasetofflinemode7 = new lambdasetOfflineMode7();
                }
            }
            int i9 = lambdasetpushtoken32.MediaSessionCompatQueueItem;
            if (i9 == 0) {
                lambdasetpushtoken32.RatingCompat = lambdasetofflinemode7.initialBackoffDelayInSeconds;
            }
            if (i9 >= lambdasetofflinemode7.maxReconnectAttempts) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Realtime socket reconnection: stopping reconnection, exhausted maximum retry count", new Object[0]);
                lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = lambdasetpushtoken32.IconCompatParcelizer;
                EnumColumnAdapter.serializer(lambdaremoveglobalcallbackparameter24.write, "realtime_connection_reconnect_stop", executeAsList.OA, "Realtime connection: reconnect attempts exhausted");
                if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                    lambdaremoveglobalcallbackparameter24.serializer.logEvent("rtc_state_stop_reconnect", null);
                }
            } else {
                lambdasetpushtoken32.MediaMetadataCompat = BuildersKt.RemoteActionCompatParcelizer(lambdasetpushtoken32.write, null, null, new ReconnectScheduler$schedule$1(lambdasetpushtoken32, lambdasetofflinemode7, shortNewsContentCardView2, i3), 3);
            }
        } else if (i4 != 2) {
            int i10 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 4 / 2;
            }
        } else {
            lambdasetpushtoken32.RemoteActionCompatParcelizer();
        }
        return createfromparcel;
    }
}
