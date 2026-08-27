package o;

import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.TimeZone$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = DefaultInAppMessageFullViewFactory.class)
public class getGraphicModalMaxHeightDp {
    public static final TimeZone$Companion Companion = new TimeZone$Companion();
    public static final InAppMessageManagerBaseExternalSyntheticLambda2 UTC;
    public final ZoneId zoneId;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        new BrazeInAppMessageParams(zoneOffset);
        UTC = new InAppMessageManagerBaseExternalSyntheticLambda2(zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getGraphicModalMaxHeightDp) {
            return this.zoneId.equals(((getGraphicModalMaxHeightDp) obj).zoneId);
        }
        return false;
    }

    public final int hashCode() {
        return this.zoneId.hashCode();
    }

    public final String toString() {
        String string = this.zoneId.toString();
        string.getClass();
        return string;
    }

    public getGraphicModalMaxHeightDp(ZoneId zoneId) {
        this.zoneId = zoneId;
    }
}
