package o;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class IBannerView {
    private final LinkedHashMap RemoteActionCompatParcelizer;
    private final DataStoreProvidereExternalSyntheticLambda0 write;

    public final void serializer() {
        this.RemoteActionCompatParcelizer.clear();
        this.write.serializer();
    }

    public IBannerView(DataStoreProvidereExternalSyntheticLambda0 dataStoreProvidereExternalSyntheticLambda0) {
        dataStoreProvidereExternalSyntheticLambda0.getClass();
        this.write = dataStoreProvidereExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
    }

    public final DataStoreProviderea IconCompatParcelizer(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        Object objIconCompatParcelizer = linkedHashMap.get(str);
        if (objIconCompatParcelizer == null) {
            objIconCompatParcelizer = this.write.IconCompatParcelizer(str);
            linkedHashMap.put(str, objIconCompatParcelizer);
        }
        return (DataStoreProviderea) objIconCompatParcelizer;
    }

    public final boolean IconCompatParcelizer() {
        return onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) this.RemoteActionCompatParcelizer.values()).isEmpty();
    }
}
