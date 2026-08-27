package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationCompatBigPictureStyle extends instantiateService {
    private static int read = 1;
    private static int write;
    public final StartWorkingNavAction.StartWorkNow IconCompatParcelizer;

    public NotificationCompatBigPictureStyle(StartWorkingNavAction.StartWorkNow startWorkNow) {
        this.IconCompatParcelizer = startWorkNow;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = write + 19;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartWorkNow(startWorkingNavAction=" + this.IconCompatParcelizer + ")";
        int i2 = read + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof NotificationCompatBigPictureStyle) || (!this.IconCompatParcelizer.equals(((NotificationCompatBigPictureStyle) obj).IconCompatParcelizer)))) {
            return false;
        }
        int i4 = write + 9;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
