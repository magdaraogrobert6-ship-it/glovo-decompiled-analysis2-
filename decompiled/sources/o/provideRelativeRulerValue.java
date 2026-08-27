package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class provideRelativeRulerValue {
    public final int IconCompatParcelizer;
    public final LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 serializer;
    public final int write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.write) * 1000003) ^ this.IconCompatParcelizer;
    }

    public static provideRelativeRulerValue IconCompatParcelizer(Class cls) {
        return new provideRelativeRulerValue(0, 1, cls);
    }

    public static provideRelativeRulerValue read(Class cls) {
        return new provideRelativeRulerValue(1, 0, cls);
    }

    public static provideRelativeRulerValue write(Class cls) {
        return new provideRelativeRulerValue(0, 2, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof provideRelativeRulerValue)) {
            return false;
        }
        provideRelativeRulerValue providerelativerulervalue = (provideRelativeRulerValue) obj;
        return this.serializer.equals(providerelativerulervalue.serializer) && this.write == providerelativerulervalue.write && this.IconCompatParcelizer == providerelativerulervalue.IconCompatParcelizer;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.serializer);
        sb.append(", type=");
        int i = this.write;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else if (i2 == 2) {
            str2 = "deferred";
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) c8$$ExternalSyntheticOutline0.m(i2, "Unsupported injection: "));
            return null;
        }
        return ff$$ExternalSyntheticOutline0.m(sb, str2, "}");
    }

    public provideRelativeRulerValue(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, int i, int i2) {
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, 1390870901, -1390870897, iIconCompatParcelizer3, new Object[]{lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, "Null dependency anInterface."});
        this.serializer = lookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
        this.write = i;
        this.IconCompatParcelizer = i2;
    }

    public static provideRelativeRulerValue serializer(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1) {
        return new provideRelativeRulerValue(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, 1, 0);
    }

    public provideRelativeRulerValue(int i, int i2, Class cls) {
        this(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(cls), i, i2);
    }
}
