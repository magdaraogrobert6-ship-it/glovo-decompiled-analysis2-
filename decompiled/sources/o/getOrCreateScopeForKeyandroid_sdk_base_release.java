package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.tile.gis.store.ZippedGisTileStore;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "LocationBasedGisTileDownloader", guardType = Guard$Type.REFERENCE_COUNTED)
public final class getOrCreateScopeForKeyandroid_sdk_base_release extends readLong {
    private final int RemoteActionCompatParcelizer;
    private final ZippedGisTileStore read;
    private final String serializer;
    private final int write;

    @Override // o.readLong
    public final String read() {
        return this.serializer;
    }

    @Override // o.readLong
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.readLong
    public final int write() {
        return this.write;
    }

    @Override // o.readLong
    public final boolean IconCompatParcelizer(String str) {
        return this.read.read(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getOrCreateScopeForKeyandroid_sdk_base_release(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, ZippedGisTileStore zippedGisTileStore, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getDataStoreInstanceCacheandroid_sdk_base_release getdatastoreinstancecacheandroid_sdk_base_release) {
        super(parselonglambda0, readandroid_sdk_base_releaseVar, getanalyticsenabledenterannotations, getverticalaccuracy, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getdatastoreinstancecacheandroid_sdk_base_release);
        parselonglambda0.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        zippedGisTileStore.getClass();
        getanalyticsenabledenterannotations.getClass();
        getverticalaccuracy.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        getdatastoreinstancecacheandroid_sdk_base_release.getClass();
        this.read = zippedGisTileStore;
        this.serializer = "LocationBasedGisTileDownloader";
        this.RemoteActionCompatParcelizer = 10;
        this.write = 21;
    }
}
