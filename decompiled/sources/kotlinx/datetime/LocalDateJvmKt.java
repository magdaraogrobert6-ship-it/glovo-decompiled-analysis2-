package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import o.InAppMessageManagerBaseExternalSyntheticLambda1;
import o.setCustomInAppMessageAnimationFactory;
import o.setCustomInAppMessageManagerListener;
import o.setCustomInAppMessageViewFactory;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LocalDateJvmKt {
    public static final long read = LocalDate.MIN.toEpochDay();
    public static final long write = LocalDate.MAX.toEpochDay();

    public static final InAppMessageManagerBaseExternalSyntheticLambda1 serializer(InAppMessageManagerBaseExternalSyntheticLambda1 inAppMessageManagerBaseExternalSyntheticLambda1, long j, setCustomInAppMessageManagerListener setcustominappmessagemanagerlistener) {
        LocalDate localDatePlusMonths;
        LocalDate localDate = inAppMessageManagerBaseExternalSyntheticLambda1.value;
        setcustominappmessagemanagerlistener.getClass();
        try {
            if (setcustominappmessagemanagerlistener instanceof setCustomInAppMessageAnimationFactory) {
                long jAddExact = Math.addExact(localDate.toEpochDay(), Math.multiplyExact(j, ((setCustomInAppMessageAnimationFactory) setcustominappmessagemanagerlistener).days));
                long j2 = read;
                if (jAddExact > write || j2 > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                localDatePlusMonths = LocalDate.ofEpochDay(jAddExact);
                localDatePlusMonths.getClass();
            } else {
                if (!(setcustominappmessagemanagerlistener instanceof setCustomInAppMessageViewFactory)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = localDate.plusMonths(Math.multiplyExact(j, ((setCustomInAppMessageViewFactory) setcustominappmessagemanagerlistener).months));
            }
            return new InAppMessageManagerBaseExternalSyntheticLambda1(localDatePlusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new DateTimeArithmeticException("The result of adding " + j + " of " + setcustominappmessagemanagerlistener + " to " + inAppMessageManagerBaseExternalSyntheticLambda1 + " is out of LocalDate range.", e);
        }
    }
}
