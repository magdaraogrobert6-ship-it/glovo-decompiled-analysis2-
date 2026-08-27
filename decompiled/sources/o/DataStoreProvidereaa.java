package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.tile.speed.store.ZippedSpeedTileStore;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "LocationBasedSpeedTileDownloader", guardType = Guard$Type.REFERENCE_COUNTED)
public final class DataStoreProvidereaa extends readLong {
    private final ZippedSpeedTileStore IconCompatParcelizer;
    private final String read;
    private final int serializer;
    private final int write;

    @Override // o.readLong
    public final String read() {
        return this.read;
    }

    @Override // o.readLong
    public final int serializer() {
        return this.serializer;
    }

    @Override // o.readLong
    public final int write() {
        return this.write;
    }

    @Override // o.readLong
    public final boolean IconCompatParcelizer(String str) {
        return this.IconCompatParcelizer.read(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProvidereaa(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, ZippedSpeedTileStore zippedSpeedTileStore, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, DataStoreProvidergaaa dataStoreProvidergaaa) {
        super(parselonglambda0, readandroid_sdk_base_releaseVar, getanalyticsenabledenterannotations, getverticalaccuracy, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, dataStoreProvidergaaa);
        parselonglambda0.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        zippedSpeedTileStore.getClass();
        getanalyticsenabledenterannotations.getClass();
        getverticalaccuracy.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        dataStoreProvidergaaa.getClass();
        this.IconCompatParcelizer = zippedSpeedTileStore;
        this.read = "LocationBasedSpeedTileDownloader";
        this.serializer = 10;
        this.write = 21;
    }
}
