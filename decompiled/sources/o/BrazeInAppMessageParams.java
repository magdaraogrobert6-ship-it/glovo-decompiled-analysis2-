package o;

import java.time.ZoneOffset;
import kotlinx.datetime.UtcOffset$Companion;
import kotlinx.datetime.serializers.UtcOffsetSerializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = UtcOffsetSerializer.class)
public final class BrazeInAppMessageParams {
    public static final UtcOffset$Companion Companion = new Object() { // from class: kotlinx.datetime.UtcOffset$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return UtcOffsetSerializer.read;
        }
    };
    public final ZoneOffset zoneOffset;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.datetime.UtcOffset$Companion] */
    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        new BrazeInAppMessageParams(zoneOffset);
    }

    public final int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public final String toString() {
        String string = this.zoneOffset.toString();
        string.getClass();
        return string;
    }

    public BrazeInAppMessageParams(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.zoneOffset = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrazeInAppMessageParams)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.zoneOffset, ((BrazeInAppMessageParams) obj).zoneOffset}, getCieXyz.write())).booleanValue();
    }
}
