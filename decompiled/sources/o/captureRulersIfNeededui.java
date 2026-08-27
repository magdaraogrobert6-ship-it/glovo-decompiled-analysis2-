package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class captureRulersIfNeededui {
    public String IconCompatParcelizer = null;
    public int MediaSessionCompatQueueItem;
    public final HashSet RatingCompat;
    public getPlacementScope RemoteActionCompatParcelizer;
    public final HashSet read;
    public int serializer;
    public final HashSet write;

    public final void write(provideRelativeRulerValue providerelativerulervalue) {
        if (this.write.contains(providerelativerulervalue.serializer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.read.add(providerelativerulervalue);
        }
    }

    public captureRulersIfNeededui(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.write = hashSet;
        this.read = new HashSet();
        this.serializer = 0;
        this.MediaSessionCompatQueueItem = 0;
        this.RatingCompat = new HashSet();
        hashSet.add(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls));
        for (Class cls2 : clsArr) {
            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 1390870901, -1390870897, trackEventI.IconCompatParcelizer(), new Object[]{cls2, "Null interface"});
            this.write.add(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls2));
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (this.serializer == 0) {
            this.serializer = i;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Instantiation type has already been set.");
        }
    }

    public final getHasMeasureResult IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != null) {
            return new getHasMeasureResult(this.IconCompatParcelizer, new HashSet(this.write), new HashSet(this.read), this.serializer, this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer, this.RatingCompat);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required property: factory.");
        return null;
    }

    public captureRulersIfNeededui(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, LookaheadCapablePlaceableCompaniononCommitAffectingRuler1[] lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr) {
        HashSet hashSet = new HashSet();
        this.write = hashSet;
        this.read = new HashSet();
        this.serializer = 0;
        this.MediaSessionCompatQueueItem = 0;
        this.RatingCompat = new HashSet();
        hashSet.add(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1);
        for (LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler2 : lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr) {
            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 1390870901, -1390870897, trackEventI.IconCompatParcelizer(), new Object[]{lookaheadCapablePlaceableCompaniononCommitAffectingRuler2, "Null interface"});
        }
        Collections.addAll(this.write, lookaheadCapablePlaceableCompaniononCommitAffectingRuler1Arr);
    }
}
