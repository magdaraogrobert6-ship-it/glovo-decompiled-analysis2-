package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class dispatchKeyShortcutEvent {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final getLifecycleRegistryannotations IconCompatParcelizer;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final getLifecycleRegistryannotations IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 1;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getLifecycleRegistryannotations getlifecycleregistryannotations = this.IconCompatParcelizer;
        int i5 = i2 + 69;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return getlifecycleregistryannotations;
        }
        throw null;
    }

    public final String MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        String str = this.RatingCompat;
        int i5 = i3 + 25;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 119;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serializer;
        int i5 = i2 + 33;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 7;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 85;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 71;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 75;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        int i5 = i2 + 21;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public dispatchKeyShortcutEvent(String str, String str2, String str3, String str4, getLifecycleRegistryannotations getlifecycleregistryannotations, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.write = str;
        this.RatingCompat = str2;
        this.read = str3;
        this.serializer = str4;
        this.IconCompatParcelizer = getlifecycleregistryannotations;
        this.RemoteActionCompatParcelizer = str5;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RatingCompat), 31, this.read), 31, this.serializer);
        getLifecycleRegistryannotations getlifecycleregistryannotations = this.IconCompatParcelizer;
        if (getlifecycleregistryannotations == null) {
            int i4 = MediaDescriptionCompat + 29;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getlifecycleregistryannotations.hashCode();
        }
        return this.RemoteActionCompatParcelizer.hashCode() + ((iM + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FeedbackData(recipients=", this.write, ", versionName=", this.RatingCompat, ", osVersion=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", deviceInfo=", this.serializer, ", user=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", courierId=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 39;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof dispatchKeyShortcutEvent) {
            dispatchKeyShortcutEvent dispatchkeyshortcutevent = (dispatchKeyShortcutEvent) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, dispatchkeyshortcutevent.write}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, dispatchkeyshortcutevent.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, dispatchkeyshortcutevent.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, dispatchkeyshortcutevent.serializer}, getCieXyz.write())).booleanValue()) {
                int i2 = MediaDescriptionCompat + 13;
                MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, dispatchkeyshortcutevent.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i4 = MediaDescriptionCompat + 125;
                MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, dispatchkeyshortcutevent.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i6 = MediaSessionCompatQueueItem + 21;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
