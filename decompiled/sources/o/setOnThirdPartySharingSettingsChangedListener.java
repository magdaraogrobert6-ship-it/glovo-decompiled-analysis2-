package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnThirdPartySharingSettingsChangedListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final setOnSessionTrackingFailedListener read;

    public setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener, boolean z) {
        setonsessiontrackingfailedlistener.getClass();
        this.read = setonsessiontrackingfailedlistener;
        this.IconCompatParcelizer = z;
    }

    public /* synthetic */ setOnThirdPartySharingSettingsChangedListener(setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener) {
        this(setonsessiontrackingfailedlistener, false);
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.IconCompatParcelizer) - (this.read.hashCode() % 85);
        }
        return Boolean.hashCode(this.IconCompatParcelizer) + (this.read.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 57;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof setOnThirdPartySharingSettingsChangedListener)) {
            return false;
        }
        setOnThirdPartySharingSettingsChangedListener setonthirdpartysharingsettingschangedlistener = (setOnThirdPartySharingSettingsChangedListener) obj;
        return this.read == setonthirdpartysharingsettingschangedlistener.read && this.IconCompatParcelizer == setonthirdpartysharingsettingschangedlistener.IconCompatParcelizer;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StateApiParams(trigger=" + this.read + ", isStateUpdateFromBackground=" + this.IconCompatParcelizer + ")";
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
