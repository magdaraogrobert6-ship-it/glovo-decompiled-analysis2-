package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class setHoldoutKeysfwf_client_release {
    public static final Map serializer;
    public final MemoryCacheclearEvaluations1 IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final getEvaluationfwf_client_release write;

    static {
        HashMap map = new HashMap();
        getNetworkModule getnetworkmodule = TranslationsENABLEDCompanion.read;
        map.put(1, new setHoldoutKeysfwf_client_release(20, 2, getnetworkmodule));
        TranslationsCompanion.RemoteActionCompatParcelizer(20, 4, getnetworkmodule, map, 2);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 2, getnetworkmodule, map, 3);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 4, getnetworkmodule, map, 4);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 8, getnetworkmodule, map, 5);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 3, getnetworkmodule, map, 6);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 6, getnetworkmodule, map, 7);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 12, getnetworkmodule, map, 8);
        getNetworkModule getnetworkmodule2 = TranslationsENABLEDCompanion.serializer;
        map.put(9, new setHoldoutKeysfwf_client_release(20, 2, getnetworkmodule2));
        TranslationsCompanion.RemoteActionCompatParcelizer(20, 4, getnetworkmodule2, map, 10);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 2, getnetworkmodule2, map, 11);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 4, getnetworkmodule2, map, 12);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 8, getnetworkmodule2, map, 13);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 3, getnetworkmodule2, map, 14);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 6, getnetworkmodule2, map, 15);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 12, getnetworkmodule2, map, 16);
        getNetworkModule getnetworkmodule3 = TranslationsENABLEDCompanion.MediaDescriptionCompat;
        map.put(17, new setHoldoutKeysfwf_client_release(20, 2, getnetworkmodule3));
        TranslationsCompanion.RemoteActionCompatParcelizer(20, 4, getnetworkmodule3, map, 18);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 2, getnetworkmodule3, map, 19);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 4, getnetworkmodule3, map, 20);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 8, getnetworkmodule3, map, 21);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 3, getnetworkmodule3, map, 22);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 6, getnetworkmodule3, map, 23);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 12, getnetworkmodule3, map, 24);
        getNetworkModule getnetworkmodule4 = TranslationsENABLEDCompanion.MediaMetadataCompat;
        map.put(25, new setHoldoutKeysfwf_client_release(20, 2, getnetworkmodule4));
        TranslationsCompanion.RemoteActionCompatParcelizer(20, 4, getnetworkmodule4, map, 26);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 2, getnetworkmodule4, map, 27);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 4, getnetworkmodule4, map, 28);
        TranslationsCompanion.RemoteActionCompatParcelizer(40, 8, getnetworkmodule4, map, 29);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 3, getnetworkmodule4, map, 30);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 6, getnetworkmodule4, map, 31);
        TranslationsCompanion.RemoteActionCompatParcelizer(60, 12, getnetworkmodule4, map, 32);
        serializer = Collections.unmodifiableMap(map);
    }

    public setHoldoutKeysfwf_client_release(int i, int i2, getNetworkModule getnetworkmodule) {
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        if (i < 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("totalHeight must be > 1");
            throw null;
        }
        if (i % i2 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("layers must divide totalHeight without remainder");
            throw null;
        }
        int i3 = i / i2;
        if (i3 == 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("height / layers must be greater than 1");
            throw null;
        }
        MemoryCacheclearEvaluations1 memoryCacheclearEvaluations1 = new MemoryCacheclearEvaluations1(i3, getnetworkmodule);
        this.IconCompatParcelizer = memoryCacheclearEvaluations1;
        int i4 = memoryCacheclearEvaluations1.RatingCompat.read;
        String str = memoryCacheclearEvaluations1.write;
        if (str != null) {
            this.write = (getEvaluationfwf_client_release) getEvaluationfwf_client_release.RemoteActionCompatParcelizer.get(getEvaluationfwf_client_release.serializer(str, memoryCacheclearEvaluations1.MediaDescriptionCompat, memoryCacheclearEvaluations1.MediaBrowserCompatMediaItem, i4, i, i2));
        } else {
            Map map = getEvaluationfwf_client_release.RemoteActionCompatParcelizer;
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("algorithmName == null");
            throw null;
        }
    }

    public setHoldoutKeysfwf_client_release(int i, int i2, CustomerChatModulestartChat2 customerChatModulestartChat2) {
        this(i, i2, getFeature.RemoteActionCompatParcelizer(customerChatModulestartChat2.serializer()));
    }
}
