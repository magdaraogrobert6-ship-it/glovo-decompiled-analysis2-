package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.tile.roaddirection.store.ZippedRoadDirectionTileStore;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "RoadDirectionInfoProvider")
public final class DataStoreProvidereExternalSyntheticLambda0 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final ZippedRoadDirectionTileStore IconCompatParcelizer;
    private final writeandroid_sdk_base_release<r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14> RemoteActionCompatParcelizer;
    private final int read;
    private final parseLonglambda0 serializer;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return new ArrayList();
    }

    public final void serializer() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public DataStoreProvidereExternalSyntheticLambda0(readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, ZippedRoadDirectionTileStore zippedRoadDirectionTileStore) {
        readandroid_sdk_base_releaseVar.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        parselonglambda0.getClass();
        zippedRoadDirectionTileStore.getClass();
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = zippedRoadDirectionTileStore;
        this.RemoteActionCompatParcelizer = new writeandroid_sdk_base_release<>(readandroid_sdk_base_releaseVar, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, 0L, 0, 12, null);
        this.read = 12;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    public final DataStoreProviderea IconCompatParcelizer(String str) {
        DataStoreProviderea dataStoreProvidereaRemoteActionCompatParcelizer;
        str.getClass();
        parseLonglambda0 parselonglambda0 = this.serializer;
        parselonglambda0.IconCompatParcelizer("Requesting road direction info for quad key: %s", str);
        String strSubstring = str.substring(0, this.read);
        r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14 r8lambdag1lfbqyro3zscbzcmaqly52kh14 = (r8lambdaG1LFBqyRo3zscbZCMaqLy52Kh14) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer, strSubstring);
        if (r8lambdag1lfbqyro3zscbzcmaqly52kh14 != null) {
            String str2 = shutdownAllDataStoresdefault.read(str, strSubstring);
            try {
                TuplesKt.RemoteActionCompatParcelizer(4);
                dataStoreProvidereaRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdag1lfbqyro3zscbzcmaqly52kh14.IconCompatParcelizer().serializer(Integer.parseInt(str2, 4)));
            } catch (NumberFormatException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to extract road direction data for quad key %s", str);
                dataStoreProvidereaRemoteActionCompatParcelizer = null;
            }
            if (dataStoreProvidereaRemoteActionCompatParcelizer != null) {
                parselonglambda0.IconCompatParcelizer("Road direction info for quad key %s: %s", str, dataStoreProvidereaRemoteActionCompatParcelizer);
            } else {
                parselonglambda0.IconCompatParcelizer("No road direction info for quad key %s", str);
            }
            return dataStoreProvidereaRemoteActionCompatParcelizer;
        }
        parselonglambda0.IconCompatParcelizer("Tile for quadKey %s is unavailable.", str);
        dataStoreProvidereaRemoteActionCompatParcelizer = null;
        if (dataStoreProvidereaRemoteActionCompatParcelizer != null) {
            parselonglambda0.IconCompatParcelizer("Road direction info for quad key %s: %s", str, dataStoreProvidereaRemoteActionCompatParcelizer);
        } else {
            parselonglambda0.IconCompatParcelizer("No road direction info for quad key %s", str);
        }
        return dataStoreProvidereaRemoteActionCompatParcelizer;
    }

    public static DataStoreProviderea RemoteActionCompatParcelizer(byte b) {
        if (b == 0) {
            return null;
        }
        return new DataStoreProviderea((((byte) (b & 127)) - 61) * 3, ((b >> 7) & 1) == 1);
    }
}
