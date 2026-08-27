package o;

import java.time.DateTimeException;
import java.time.Instant;
import kotlinx.datetime.Instant$Companion;
import kotlinx.datetime.serializers.InstantIso8601Serializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = InstantIso8601Serializer.class)
public final class setShouldNextUnregisterBeSkipped implements Comparable<setShouldNextUnregisterBeSkipped> {
    public static final Instant$Companion Companion = new Object() { // from class: kotlinx.datetime.Instant$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return InstantIso8601Serializer.read;
        }
    };
    public static final setShouldNextUnregisterBeSkipped MAX;
    public static final setShouldNextUnregisterBeSkipped MIN;
    public final Instant value;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.datetime.Instant$Companion] */
    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        instantOfEpochSecond.getClass();
        new setShouldNextUnregisterBeSkipped(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        instantOfEpochSecond2.getClass();
        new setShouldNextUnregisterBeSkipped(instantOfEpochSecond2);
        Instant instant = Instant.MIN;
        instant.getClass();
        MIN = new setShouldNextUnregisterBeSkipped(instant);
        Instant instant2 = Instant.MAX;
        instant2.getClass();
        MAX = new setShouldNextUnregisterBeSkipped(instant2);
    }

    public final long RemoteActionCompatParcelizer() {
        Instant instant = this.value;
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setShouldNextUnregisterBeSkipped)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((setShouldNextUnregisterBeSkipped) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public final setShouldNextUnregisterBeSkipped write(long j) throws Exception {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        try {
            Instant instantPlusNanos = this.value.plusSeconds(BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(j, setUnregisteredInAppMessage.SECONDS)).plusNanos(BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(j));
            instantPlusNanos.getClass();
            return new setShouldNextUnregisterBeSkipped(instantPlusNanos);
        } catch (Exception e) {
            if ((e instanceof ArithmeticException) || (e instanceof DateTimeException)) {
                return j > 0 ? MAX : MIN;
            }
            throw e;
        }
    }

    public setShouldNextUnregisterBeSkipped(Instant instant) {
        instant.getClass();
        this.value = instant;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final int compareTo(setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskipped) {
        setshouldnextunregisterbeskipped.getClass();
        return this.value.compareTo(setshouldnextunregisterbeskipped.value);
    }
}
