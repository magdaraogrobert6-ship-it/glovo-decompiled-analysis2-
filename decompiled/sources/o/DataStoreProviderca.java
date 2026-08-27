package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.tile.roaddirection.store.ZippedRoadDirectionTileStore;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(componentName = "LocationBasedRoadDirectionTileDownloader", guardType = Guard$Type.REFERENCE_COUNTED)
public final class DataStoreProviderca extends readLong {
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final ZippedRoadDirectionTileStore serializer;
    private final String write;

    @Override // o.readLong
    public final String read() {
        return this.write;
    }

    @Override // o.readLong
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.readLong
    public final int write() {
        return this.IconCompatParcelizer;
    }

    @Override // o.readLong
    public final boolean IconCompatParcelizer(String str) {
        return this.serializer.read(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProviderca(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, ZippedRoadDirectionTileStore zippedRoadDirectionTileStore, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getVerticalAccuracy getverticalaccuracy, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaqVoOSJOznoqisXPnhKfJUexpc r8lambdaqvoosjoznoqisxpnhkfjuexpc) {
        super(parselonglambda0, readandroid_sdk_base_releaseVar, getanalyticsenabledenterannotations, getverticalaccuracy, r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaqvoosjoznoqisxpnhkfjuexpc);
        parselonglambda0.getClass();
        readandroid_sdk_base_releaseVar.getClass();
        zippedRoadDirectionTileStore.getClass();
        getanalyticsenabledenterannotations.getClass();
        getverticalaccuracy.getClass();
        r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4.getClass();
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        r8lambdaqvoosjoznoqisxpnhkfjuexpc.getClass();
        this.serializer = zippedRoadDirectionTileStore;
        this.write = "LocationBasedRoadDirectionTileDownloader";
        this.RemoteActionCompatParcelizer = 12;
        this.IconCompatParcelizer = 23;
    }
}
