package o;

import android.annotation.SuppressLint;
import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.tile.gis.store.ZippedGisTileStore;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "GisFeaturesProvider")
public final class DataStoreProviderCompanionExternalSyntheticLambda2 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final ZippedGisTileStore read;
    private final writeandroid_sdk_base_release<setEventPublisherandroid_sdk_base_release> write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.write.IconCompatParcelizer();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return new ArrayList();
    }

    public DataStoreProviderCompanionExternalSyntheticLambda2(readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, ZippedGisTileStore zippedGisTileStore) {
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        parselonglambda0.getClass();
        zippedGisTileStore.getClass();
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = zippedGisTileStore;
        this.write = new writeandroid_sdk_base_release<>(readandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, 0L, 0, 12, null);
    }

    @SuppressLint
    public final DataStoreProvidera read(Location location) {
        location.getClass();
        Object[] objArr = {Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Requesting GIS features for coordinates: (%f, %f)", objArr);
        String strRemoteActionCompatParcelizer = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(location.getLatitude(), location.getLongitude(), 21));
        String strSubstring = strRemoteActionCompatParcelizer.substring(0, 10);
        setEventPublisherandroid_sdk_base_release seteventpublisherandroid_sdk_base_release = (setEventPublisherandroid_sdk_base_release) this.write.RemoteActionCompatParcelizer(this.read, strSubstring);
        if (seteventpublisherandroid_sdk_base_release == null) {
            parselonglambda0.IconCompatParcelizer("Tile for quadKey %s is unavailable.", strRemoteActionCompatParcelizer);
            return null;
        }
        String str = shutdownAllDataStoresdefault.read(strRemoteActionCompatParcelizer, strSubstring);
        try {
            TuplesKt.RemoteActionCompatParcelizer(4);
            byte bSerializer = seteventpublisherandroid_sdk_base_release.write().serializer(Integer.parseInt(str, 4));
            boolean z = true;
            boolean z2 = ((bSerializer >> 7) & 1) == 1;
            boolean z3 = ((bSerializer >> 6) & 1) == 1;
            if (((bSerializer >> 5) & 1) != 1) {
                z = false;
            }
            return new DataStoreProvidera(z2, z3, z);
        } catch (NumberFormatException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to parse gis features for quad key %s", strRemoteActionCompatParcelizer);
            return null;
        }
    }
}
