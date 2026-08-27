package o;

import android.location.Location;
import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.protobuf.ByteString;
import com.sentiance.sdk.drivinginsights.api.DrivingInsightsDebug;
import com.sentiance.sdk.util.BoundingBox;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class setUpGeofenceslambda0 {
    private static String write(String str, int i) {
        TuplesKt.RemoteActionCompatParcelizer(4);
        String string = Integer.toString(i, 4);
        string.getClass();
        while (string.length() < 11) {
            string = "0".concat(string);
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m(str);
        String strReplace = string.replace('3', '4');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('2', '3');
        strReplace2.getClass();
        String strReplace3 = strReplace2.replace('1', '2');
        strReplace3.getClass();
        String strReplace4 = strReplace3.replace('0', '1');
        strReplace4.getClass();
        sbM.append(strReplace4);
        return sbM.toString();
    }

    public static void RemoteActionCompatParcelizer(int i, int i2, ByteString byteString, DataStoreProvidereExternalSyntheticLambda0 dataStoreProvidereExternalSyntheticLambda0, setUpGeofenceslambda0 setupgeofenceslambda0, String str, BoundingBox boundingBox, ArrayList arrayList, Semaphore semaphore) {
        Location locationIconCompatParcelizer;
        str.getClass();
        int i3 = i * i2;
        try {
            int iSerializer = i == 1 ? byteString.serializer() : i3 + i2;
            while (i3 < iSerializer) {
                byte bSerializer = byteString.serializer(i3);
                dataStoreProvidereExternalSyntheticLambda0.getClass();
                DataStoreProviderea dataStoreProvidereaRemoteActionCompatParcelizer = DataStoreProvidereExternalSyntheticLambda0.RemoteActionCompatParcelizer(bSerializer);
                if (dataStoreProvidereaRemoteActionCompatParcelizer != null && (locationIconCompatParcelizer = getDataStoreInstanceCacheandroid_sdk_base_releaseannotations.IconCompatParcelizer(write(str, i3))) != null) {
                    if (boundingBox.RemoteActionCompatParcelizer(locationIconCompatParcelizer)) {
                        synchronized (arrayList) {
                            arrayList.add(new DrivingInsightsDebug.RoadDirectionDebugApiTile(dataStoreProvidereaRemoteActionCompatParcelizer.write(), dataStoreProvidereaRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), locationIconCompatParcelizer.getLatitude(), locationIconCompatParcelizer.getLongitude()));
                        }
                    }
                }
                i3++;
            }
            semaphore.release();
        } catch (Throwable th) {
            semaphore.release();
            throw th;
        }
    }
}
