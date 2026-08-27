package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.nafath.data.NafathTimerEntity$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class q3ExternalSyntheticLambda1 {
    public static final NafathTimerEntity$Companion Companion = new NafathTimerEntity$Companion();
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final long expiresAtEpochSeconds;
    public final long startedAtEpochSeconds;

    static {
        int i = IconCompatParcelizer + 119;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    public /* synthetic */ q3ExternalSyntheticLambda1(long j, long j2, int i) {
        if (3 == (i & 3)) {
            this.startedAtEpochSeconds = j;
            this.expiresAtEpochSeconds = j2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, q4.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.expiresAtEpochSeconds) + (Long.hashCode(this.startedAtEpochSeconds) * 31);
        int i4 = serializer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = c8$$ExternalSyntheticOutline0.m(this.expiresAtEpochSeconds, ")", c8$$ExternalSyntheticOutline0.m(this.startedAtEpochSeconds, "NafathTimerEntity(startedAtEpochSeconds=", ", expiresAtEpochSeconds="));
            int i3 = serializer + 31;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        c8$$ExternalSyntheticOutline0.m(this.expiresAtEpochSeconds, ")", c8$$ExternalSyntheticOutline0.m(this.startedAtEpochSeconds, "NafathTimerEntity(startedAtEpochSeconds=", ", expiresAtEpochSeconds="));
        obj.hashCode();
        throw null;
    }

    public q3ExternalSyntheticLambda1(long j, long j2) {
        this.startedAtEpochSeconds = j;
        this.expiresAtEpochSeconds = j2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 23;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof q3ExternalSyntheticLambda1)) {
            return false;
        }
        q3ExternalSyntheticLambda1 q3externalsyntheticlambda1 = (q3ExternalSyntheticLambda1) obj;
        if (this.startedAtEpochSeconds != q3externalsyntheticlambda1.startedAtEpochSeconds) {
            return false;
        }
        if (this.expiresAtEpochSeconds == q3externalsyntheticlambda1.expiresAtEpochSeconds) {
            return true;
        }
        int i4 = read;
        int i5 = i4 + 121;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        boolean z = i5 % 2 == 0;
        int i6 = i4 + 51;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return z;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
