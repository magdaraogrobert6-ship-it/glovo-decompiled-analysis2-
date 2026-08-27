package o;

import android.annotation.SuppressLint;
import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.tile.SpeedLimit;
import com.sentiance.sdk.tile.speed.store.ZippedSpeedTileStore;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "SpeedLimitProvider")
public class DataStoreProviderga extends readString implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final ZippedSpeedTileStore IconCompatParcelizer;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final writeandroid_sdk_base_release<DataStoreProviderh> read;
    private final int serializer;
    private final int write;

    @SuppressLint
    private final int write(String str) {
        String strSubstring = str.substring(0, this.serializer);
        DataStoreProviderh dataStoreProviderh = (DataStoreProviderh) this.read.RemoteActionCompatParcelizer(this.IconCompatParcelizer, strSubstring);
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        if (dataStoreProviderh == null) {
            parselonglambda0.IconCompatParcelizer("Tile for quadKey %s is unavailable.", str);
            return -1;
        }
        String str2 = shutdownAllDataStoresdefault.read(str, strSubstring);
        try {
            TuplesKt.RemoteActionCompatParcelizer(4);
            return Byte.toUnsignedInt(dataStoreProviderh.read().serializer(Integer.parseInt(str2, 4)));
        } catch (NumberFormatException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to parse speed limit for quad key %s", str);
            return -1;
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.read.IconCompatParcelizer();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return new ArrayList();
    }

    public DataStoreProviderga(readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, ZippedSpeedTileStore zippedSpeedTileStore) {
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        parselonglambda0.getClass();
        zippedSpeedTileStore.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = zippedSpeedTileStore;
        this.read = new writeandroid_sdk_base_release<>(readandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, 0L, 0, 12, null);
        this.serializer = 10;
        this.write = 21;
    }

    @Override // o.readString
    @SuppressLint
    public final SpeedLimit write(double d, double d2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Requesting speed limit for coordinates: (%f, %f)", objArr);
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        int i = this.write;
        String strRemoteActionCompatParcelizer = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(latitude, longitude, i));
        int iWrite = write(strRemoteActionCompatParcelizer);
        if (iWrite <= 0) {
            for (String str : shutdownAllDataStoresdefault.read(location, i)) {
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                int iWrite4 = getCieXyz.write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite2, 1803334089, -1803334089, getCieXyz.write(), iWrite3, new Object[]{str, strRemoteActionCompatParcelizer}, iWrite4)).booleanValue()) {
                    str.getClass();
                    int iWrite5 = write(str);
                    if (iWrite5 > iWrite) {
                        iWrite = iWrite5;
                    }
                }
            }
        }
        SpeedLimit speedLimitFromTileSpeedLimitValue = SpeedLimit.fromTileSpeedLimitValue(iWrite);
        int iKmph = speedLimitFromTileSpeedLimitValue.kmph();
        parselonglambda0.IconCompatParcelizer("Speed limit for coordinates (%f, %f): %d km/h, type: %s", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(iKmph), speedLimitFromTileSpeedLimitValue.name());
        return speedLimitFromTileSpeedLimitValue;
    }

    @Override // o.readString
    public final void RemoteActionCompatParcelizer() {
        this.read.IconCompatParcelizer();
    }
}
