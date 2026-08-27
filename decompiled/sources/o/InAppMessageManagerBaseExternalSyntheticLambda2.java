package o;

import java.time.ZoneId;
import kotlinx.datetime.FixedOffsetTimeZone$Companion;
import kotlinx.datetime.serializers.FixedOffsetTimeZoneSerializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = FixedOffsetTimeZoneSerializer.class)
public final class InAppMessageManagerBaseExternalSyntheticLambda2 extends getGraphicModalMaxHeightDp {
    public static final FixedOffsetTimeZone$Companion Companion = new Object() { // from class: kotlinx.datetime.FixedOffsetTimeZone$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return FixedOffsetTimeZoneSerializer.IconCompatParcelizer;
        }
    };

    public InAppMessageManagerBaseExternalSyntheticLambda2(ZoneId zoneId) {
        super(zoneId);
    }
}
