package o;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeSendPoolingContainerAttach {
    private static int read = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final processAdapterUpdatesAndSetAnimationFlags serializer;

    public maybeSendPoolingContainerAttach(String str, processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags) {
        this.IconCompatParcelizer = str;
        this.serializer = processadapterupdatesandsetanimationflags;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = read + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PushInAppMessageData(inAppMessageData=" + this.IconCompatParcelizer + ", inAppNotificationAnalyticsData=" + this.serializer + ")";
        int i2 = read + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maybeSendPoolingContainerAttach)) {
            return false;
        }
        maybeSendPoolingContainerAttach maybesendpoolingcontainerattach = (maybeSendPoolingContainerAttach) obj;
        if (this.IconCompatParcelizer.equals(maybesendpoolingcontainerattach.IconCompatParcelizer)) {
            return this.serializer.equals(maybesendpoolingcontainerattach.serializer);
        }
        int i4 = write + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
