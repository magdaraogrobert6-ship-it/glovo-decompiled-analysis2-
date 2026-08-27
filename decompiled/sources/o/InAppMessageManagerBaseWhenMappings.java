package o;

import java.time.Instant;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InAppMessageManagerBaseWhenMappings {
    public static final long read(setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped, setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped2, setCustomInAppMessageViewWrapperFactory setcustominappmessageviewwrapperfactory) {
        Instant instant = setshouldnextunregisterbeskipped.value;
        Instant instant2 = setshouldnextunregisterbeskipped2.value;
        setcustominappmessageviewwrapperfactory.getClass();
        try {
            return getGraphicModalMaxHeightDpannotations.write(instant2.getEpochSecond() - instant.getEpochSecond(), instant2.getNano() - instant.getNano(), setcustominappmessageviewwrapperfactory.nanoseconds);
        } catch (ArithmeticException unused) {
            return setshouldnextunregisterbeskipped.compareTo(setshouldnextunregisterbeskipped2) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }
}
