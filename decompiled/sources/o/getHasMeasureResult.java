package o;

import io.sentry.util.UrlUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getHasMeasureResult {
    public final getPlacementScope IconCompatParcelizer;
    public final int MediaMetadataCompat;
    public final Set RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final Set read;
    public final Set serializer;
    public final int write;

    public static getHasMeasureResult IconCompatParcelizer(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
        for (Class cls2 : clsArr) {
            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 1390870901, -1390870897, trackEventI.IconCompatParcelizer(), new Object[]{cls2, "Null interface"});
            hashSet.add(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls2));
        }
        return new getHasMeasureResult(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new findRulerValue(1, obj), hashSet3);
    }

    public getHasMeasureResult(String str, Set set, Set set2, int i, int i2, getPlacementScope getplacementscope, Set set3) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = Collections.unmodifiableSet(set);
        this.read = Collections.unmodifiableSet(set2);
        this.write = i;
        this.MediaMetadataCompat = i2;
        this.IconCompatParcelizer = getplacementscope;
        this.RatingCompat = Collections.unmodifiableSet(set3);
    }

    public static captureRulersIfNeededui write(Class cls) {
        return new captureRulersIfNeededui(cls, new Class[0]);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.serializer.toArray()) + ">{" + this.write + ", type=" + this.MediaMetadataCompat + ", deps=" + Arrays.toString(this.read.toArray()) + "}";
    }

    public static captureRulersIfNeededui RemoteActionCompatParcelizer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        return new captureRulersIfNeededui(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1[0]);
    }
}
