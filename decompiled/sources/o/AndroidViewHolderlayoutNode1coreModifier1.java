package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.MapComponent$ActionableDetails$Companion;
import kotlinx.serialization.Serializable;
import o.AndroidViewHolderlayoutNode1coreModifier2;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AndroidViewHolderlayoutNode1coreModifier1 {
    public static final MapComponent$ActionableDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.MapComponent$ActionableDetails$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            AndroidViewHolderlayoutNode1coreModifier2 androidViewHolderlayoutNode1coreModifier2 = AndroidViewHolderlayoutNode1coreModifier2.serializer;
            int i4 = IconCompatParcelizer + 13;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return androidViewHolderlayoutNode1coreModifier2;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final int displayedNumber;
    public final String highlightedContent;
    public final String primaryContent;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.MapComponent$ActionableDetails$Companion] */
    static {
        int i = write + 25;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }

    public final int IconCompatParcelizer() {
        int i;
        int i2 = 2 % 2;
        int i3 = read + 63;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 == 0) {
            i = this.displayedNumber;
            int i5 = 23 / 0;
        } else {
            i = this.displayedNumber;
        }
        int i6 = i4 + 77;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.primaryContent;
        int i4 = i3 + 89;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.highlightedContent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ AndroidViewHolderlayoutNode1coreModifier1(int i, String str, int i2, String str2) {
        if ((i & 1) == 0) {
            this.primaryContent = null;
        } else {
            this.primaryContent = str;
        }
        int i3 = 2 % 2;
        if ((i & 2) == 0) {
            int i4 = read + 53;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.highlightedContent = null;
                int i5 = 72 / 0;
            } else {
                this.highlightedContent = null;
            }
        } else {
            this.highlightedContent = str2;
        }
        if ((i & 4) == 0) {
            this.displayedNumber = 0;
            return;
        }
        this.displayedNumber = i2;
        int i6 = RemoteActionCompatParcelizer + 115;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = af$$ExternalSyntheticOutline0.m(this.displayedNumber, ")", c8$$ExternalSyntheticOutline0.m("ActionableDetails(primaryContent=", this.primaryContent, ", highlightedContent=", this.highlightedContent, ", displayedNumber="));
        int i4 = read + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.primaryContent;
        if (str == null) {
            int i2 = RemoteActionCompatParcelizer + 121;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.highlightedContent;
        int iHashCode2 = Integer.hashCode(this.displayedNumber) + (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
        int i3 = read + 39;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidViewHolderlayoutNode1coreModifier1) {
            AndroidViewHolderlayoutNode1coreModifier1 androidViewHolderlayoutNode1coreModifier1 = (AndroidViewHolderlayoutNode1coreModifier1) obj;
            Object[] objArr = {this.primaryContent, androidViewHolderlayoutNode1coreModifier1.primaryContent};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.highlightedContent, androidViewHolderlayoutNode1coreModifier1.highlightedContent};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.displayedNumber == androidViewHolderlayoutNode1coreModifier1.displayedNumber) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 1;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
