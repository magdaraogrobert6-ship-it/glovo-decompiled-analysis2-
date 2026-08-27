package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.login.data.forgotpassword.entity.ForgotPasswordTimerEntity$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setSuccessfulruntime {
    public static final ForgotPasswordTimerEntity$Companion Companion = new ForgotPasswordTimerEntity$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final long timerEndTimeInMillis;

    static {
        int i = IconCompatParcelizer + 53;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 36 / 0;
        }
    }

    public /* synthetic */ setSuccessfulruntime(int i, long j) {
        if (1 == (i & 1)) {
            this.timerEndTimeInMillis = j;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, setChildrenSuccessfulruntime.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Long.hashCode(this.timerEndTimeInMillis);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Long.hashCode(this.timerEndTimeInMillis);
        int i3 = read + 75;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return m1$$ExternalSyntheticOutline0.m(this.timerEndTimeInMillis, "ForgotPasswordTimerEntity(timerEndTimeInMillis=", ")");
        }
        m1$$ExternalSyntheticOutline0.m(this.timerEndTimeInMillis, "ForgotPasswordTimerEntity(timerEndTimeInMillis=", ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSuccessfulruntime)) {
            int i2 = RemoteActionCompatParcelizer + 109;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 103;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return z;
        }
        if (this.timerEndTimeInMillis != ((setSuccessfulruntime) obj).timerEndTimeInMillis) {
            int i6 = read + 31;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = read + 107;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public setSuccessfulruntime(long j) {
        this.timerEndTimeInMillis = j;
    }
}
