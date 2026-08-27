package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCacheclearEvaluations1 {
    public static final Map read;
    public final getFeatures IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final isActive RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int serializer;
    public final String write;

    static {
        HashMap map = new HashMap();
        getNetworkModule getnetworkmodule = TranslationsENABLEDCompanion.read;
        map.put(1, new MemoryCacheclearEvaluations1(10, getnetworkmodule));
        map.put(2, new MemoryCacheclearEvaluations1(16, getnetworkmodule));
        map.put(3, new MemoryCacheclearEvaluations1(20, getnetworkmodule));
        getNetworkModule getnetworkmodule2 = TranslationsENABLEDCompanion.serializer;
        map.put(4, new MemoryCacheclearEvaluations1(10, getnetworkmodule2));
        map.put(5, new MemoryCacheclearEvaluations1(16, getnetworkmodule2));
        map.put(6, new MemoryCacheclearEvaluations1(20, getnetworkmodule2));
        getNetworkModule getnetworkmodule3 = TranslationsENABLEDCompanion.MediaDescriptionCompat;
        map.put(7, new MemoryCacheclearEvaluations1(10, getnetworkmodule3));
        map.put(8, new MemoryCacheclearEvaluations1(16, getnetworkmodule3));
        map.put(9, new MemoryCacheclearEvaluations1(20, getnetworkmodule3));
        getNetworkModule getnetworkmodule4 = TranslationsENABLEDCompanion.MediaMetadataCompat;
        map.put(10, new MemoryCacheclearEvaluations1(10, getnetworkmodule4));
        map.put(11, new MemoryCacheclearEvaluations1(16, getnetworkmodule4));
        map.put(12, new MemoryCacheclearEvaluations1(20, getnetworkmodule4));
        read = Collections.unmodifiableMap(map);
    }

    public MemoryCacheclearEvaluations1(int i, getNetworkModule getnetworkmodule) {
        if (i < 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("height must be >= 2");
            throw null;
        }
        if (getnetworkmodule == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("digest == null");
            throw null;
        }
        this.RemoteActionCompatParcelizer = i;
        int i2 = 2;
        while (true) {
            int i3 = this.RemoteActionCompatParcelizer;
            if (i2 > i3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("should never happen...");
                throw null;
            }
            if ((i3 - i2) % 2 == 0) {
                this.serializer = i2;
                String str = (String) getFeature.RemoteActionCompatParcelizer.get(getnetworkmodule);
                if (str == null) {
                    Gson$$ExternalSyntheticBUOutline0.m(getnetworkmodule, "unrecognized digest oid: ");
                    throw null;
                }
                this.write = str;
                isActive isactive = new isActive(getnetworkmodule);
                this.RatingCompat = isactive;
                int i4 = isactive.write;
                this.MediaDescriptionCompat = i4;
                int i5 = isactive.serializer;
                this.MediaBrowserCompatMediaItem = i5;
                this.IconCompatParcelizer = (getFeatures) getFeatures.RemoteActionCompatParcelizer.get(getFeatures.serializer(i4, i5, isactive.read, i, str));
                return;
            }
            i2++;
        }
    }

    public MemoryCacheclearEvaluations1(int i, CustomerChatModulestartChat2 customerChatModulestartChat2) {
        this(i, getFeature.RemoteActionCompatParcelizer(customerChatModulestartChat2.serializer()));
    }
}
