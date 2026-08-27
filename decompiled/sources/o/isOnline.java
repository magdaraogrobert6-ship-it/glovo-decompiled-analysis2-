package o;

import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import java.util.LinkedHashMap;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class isOnline {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final AppEventInfoChangeHandler read;
    public final setConfig serializer;

    public isOnline(AppEventInfoChangeHandler appEventInfoChangeHandler, setConfig setconfig) {
        this.read = appEventInfoChangeHandler;
        this.serializer = setconfig;
    }

    public final void serializer(String str, String str2) {
        int i = 2 % 2;
        String str3 = (String) this.serializer.read.write.serializer.MediaSessionCompatResultReceiverWrapper();
        str3.getClass();
        LinkedHashMap linkedHashMapIconCompatParcelizer = onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("device_id", str3));
        if (str2 != null) {
            int i2 = write + 61;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
        }
        if (str != null) {
            int i4 = write + 19;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
        AppEventInfoChangeHandler appEventInfoChangeHandler = this.read;
        ((TraceTimeMeasurementWithPerformanceKit) appEventInfoChangeHandler.MediaMetadataCompat).read("asti_app_event_update_properties", new SealedClassSerializer$$ExternalSyntheticLambda0(appEventInfoChangeHandler, 3, linkedHashMapIconCompatParcelizer));
        int i5 = write + 11;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
