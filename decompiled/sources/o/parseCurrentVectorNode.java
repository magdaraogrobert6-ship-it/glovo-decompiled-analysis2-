package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class parseCurrentVectorNode extends InAppMessageManagerBaseWhenMappings {
    private static int read = 0;
    private static int write = 1;
    public final isAtEnd IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public final String serializer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 31;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.RemoteActionCompatParcelizer;
        int i4 = i2 + 111;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final isAtEnd write() {
        int i = 2 % 2;
        int i2 = write + 21;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        throw null;
    }

    public parseCurrentVectorNode(String str, isAtEnd isatend) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = isatend;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = (this.IconCompatParcelizer.serializer.hashCode() + af$$ExternalSyntheticOutline0.m(1759926247, 31, this.RemoteActionCompatParcelizer)) * 31;
        int i4 = write + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BlockingDialogViewModel(dialogTag=dialog_tag_force_update, message=" + this.RemoteActionCompatParcelizer + ", actions=" + this.IconCompatParcelizer + ", title=null)";
        int i2 = read + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 77;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof parseCurrentVectorNode)) {
                return false;
            }
            parseCurrentVectorNode parsecurrentvectornode = (parseCurrentVectorNode) obj;
            if (!this.RemoteActionCompatParcelizer.equals(parsecurrentvectornode.RemoteActionCompatParcelizer) || (!this.IconCompatParcelizer.equals(parsecurrentvectornode.IconCompatParcelizer))) {
                return false;
            }
        }
        return true;
    }
}
