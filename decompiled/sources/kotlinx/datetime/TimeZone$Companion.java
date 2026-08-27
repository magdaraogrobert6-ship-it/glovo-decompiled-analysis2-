package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import o.BrazeInAppMessageParams;
import o.DefaultInAppMessageFullViewFactory;
import o.InAppMessageManagerBaseExternalSyntheticLambda2;
import o.getGraphicModalMaxHeightDp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeZone$Companion {
    public final setGraphicModalMaxWidthDp serializer() {
        return DefaultInAppMessageFullViewFactory.serializer;
    }

    public static getGraphicModalMaxHeightDp serializer(String str) throws Exception {
        str.getClass();
        try {
            ZoneId zoneIdOf = ZoneId.of(str);
            zoneIdOf.getClass();
            return IconCompatParcelizer(zoneIdOf);
        } catch (Exception e) {
            if (e instanceof DateTimeException) {
                throw new IllegalTimeZoneException(e);
            }
            throw e;
        }
    }

    public static getGraphicModalMaxHeightDp IconCompatParcelizer(ZoneId zoneId) {
        if (zoneId instanceof ZoneOffset) {
            ZoneOffset zoneOffset = (ZoneOffset) zoneId;
            new BrazeInAppMessageParams(zoneOffset);
            return new InAppMessageManagerBaseExternalSyntheticLambda2(zoneOffset);
        }
        try {
            if (zoneId.getRules().isFixedOffset()) {
                ZoneId zoneIdNormalized = zoneId.normalized();
                zoneIdNormalized.getClass();
                new BrazeInAppMessageParams((ZoneOffset) zoneIdNormalized);
                return new InAppMessageManagerBaseExternalSyntheticLambda2(zoneId);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return new getGraphicModalMaxHeightDp(zoneId);
    }
}
