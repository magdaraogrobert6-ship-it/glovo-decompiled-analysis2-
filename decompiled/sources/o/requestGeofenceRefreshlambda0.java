package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.twofa.data.entity.TwoFaTimerEntity$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class requestGeofenceRefreshlambda0 {
    public static final TwoFaTimerEntity$Companion Companion = new TwoFaTimerEntity$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final long timerEndTimeInMillis;

    static {
        int i = serializer + 43;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ requestGeofenceRefreshlambda0(int i, long j) {
        if (1 == (i & 1)) {
            this.timerEndTimeInMillis = j;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, requestGeofenceRefreshlambda3.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.timerEndTimeInMillis);
        int i4 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return m1$$ExternalSyntheticOutline0.m(this.timerEndTimeInMillis, "TwoFaTimerEntity(timerEndTimeInMillis=", ")");
        }
        m1$$ExternalSyntheticOutline0.m(this.timerEndTimeInMillis, "TwoFaTimerEntity(timerEndTimeInMillis=", ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 21;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i2 + 27;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof requestGeofenceRefreshlambda0)) {
            return false;
        }
        if (this.timerEndTimeInMillis == ((requestGeofenceRefreshlambda0) obj).timerEndTimeInMillis) {
            return true;
        }
        int i7 = i4 + 79;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 == 0;
    }

    public requestGeofenceRefreshlambda0(long j) {
        this.timerEndTimeInMillis = j;
    }
}
