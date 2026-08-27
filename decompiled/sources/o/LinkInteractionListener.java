package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkInteractionListener {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final int IconCompatParcelizer;
    public final ArrayList read;

    public LinkInteractionListener(int i, ArrayList arrayList) {
        this.read = arrayList;
        this.IconCompatParcelizer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IconCompatParcelizer) + (this.read.hashCode() * 31);
        int i4 = write + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 5 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof LinkInteractionListener) {
            LinkInteractionListener linkInteractionListener = (LinkInteractionListener) obj;
            if (this.read.equals(linkInteractionListener.read) && this.IconCompatParcelizer == linkInteractionListener.IconCompatParcelizer) {
                return true;
            }
        }
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "UnreadCountDetails(chats=" + this.read + ", totalUnreadMessageCount=" + this.IconCompatParcelizer + ")";
        int i2 = write + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
