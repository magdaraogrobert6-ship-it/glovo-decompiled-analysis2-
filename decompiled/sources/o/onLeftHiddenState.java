package o;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public final class onLeftHiddenState {
    private static int RatingCompat = 1;
    private static int read;
    public final int IconCompatParcelizer;
    public final onEnteredHiddenState RemoteActionCompatParcelizer;
    public final GregorianCalendar serializer;
    public final GregorianCalendar write;

    public final int RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 91;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        int i6 = i2 + 111;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final Calendar read() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 63;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        GregorianCalendar gregorianCalendar = this.serializer;
        int i5 = i2 + 99;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return gregorianCalendar;
    }

    public final Calendar serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 69;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        GregorianCalendar gregorianCalendar = this.write;
        int i4 = i2 + 9;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return gregorianCalendar;
        }
        obj.hashCode();
        throw null;
    }

    public final onEnteredHiddenState write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        onEnteredHiddenState onenteredhiddenstate = this.RemoteActionCompatParcelizer;
        int i4 = i3 + 57;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onenteredhiddenstate;
        }
        obj.hashCode();
        throw null;
    }

    public onLeftHiddenState(int i, GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2, onEnteredHiddenState onenteredhiddenstate) {
        this.IconCompatParcelizer = i;
        this.write = gregorianCalendar;
        this.serializer = gregorianCalendar2;
        this.RemoteActionCompatParcelizer = onenteredhiddenstate;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = RatingCompat + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "InstantShift(shiftId=" + this.IconCompatParcelizer + ", start=" + this.write + ", end=" + this.serializer + ", zone=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = RatingCompat + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof onLeftHiddenState)) {
                return false;
            }
            onLeftHiddenState onlefthiddenstate = (onLeftHiddenState) obj;
            if (this.IconCompatParcelizer != onlefthiddenstate.IconCompatParcelizer) {
                return false;
            }
            if (!this.write.equals(onlefthiddenstate.write)) {
                int i3 = read + 1;
                RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!this.serializer.equals(onlefthiddenstate.serializer) || !this.RemoteActionCompatParcelizer.equals(onlefthiddenstate.RemoteActionCompatParcelizer)) {
                return false;
            }
        }
        return true;
    }
}
