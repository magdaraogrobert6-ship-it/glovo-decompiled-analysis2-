package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.eventtimeline.timelines.creators.SafetyScoreType;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k {
    private final double IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final SafetyScoreType serializer;

    public final SafetyScoreType IconCompatParcelizer() {
        return this.serializer;
    }

    public final double write() {
        return this.IconCompatParcelizer;
    }

    public r8lambdalJNxQUFANCKWLgXbV6bNxcttL0k(String str, SafetyScoreType safetyScoreType, double d) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = safetyScoreType;
        this.IconCompatParcelizer = d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafetyScore{transportId='");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("', type=");
        sb.append(this.serializer);
        sb.append(", value=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, '}');
    }
}
