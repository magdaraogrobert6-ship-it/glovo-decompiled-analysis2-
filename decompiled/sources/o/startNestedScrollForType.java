package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.inappnotifications.data.TextComponent$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.smoothScrollBy1;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "text")
public final class startNestedScrollForType implements setLayoutManager, setRecyclerListener {
    public static final TextComponent$Companion Companion = new Object() { // from class: com.roadrunner.inappnotifications.data.TextComponent$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 97;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                smoothScrollBy1 smoothscrollby1 = smoothScrollBy1.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            smoothScrollBy1 smoothscrollby2 = smoothScrollBy1.serializer;
            int i3 = RemoteActionCompatParcelizer + 59;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 1 / 0;
            }
            return smoothscrollby2;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final String color;
    public final String style;
    public final String text;
    public final Float weight;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.inappnotifications.data.TextComponent$Companion] */
    static {
        int i = IconCompatParcelizer + 67;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ startNestedScrollForType(int i, String str, String str2, String str3, Float f) {
        Object obj = null;
        if (7 == (i & 7)) {
            this.text = str;
            this.style = str2;
            this.color = str3;
            if ((i & 8) == 0) {
                this.weight = null;
                int i2 = serializer + 67;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.weight = f;
            int i3 = serializer + 125;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, smoothScrollBy1.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.style), 31, this.color);
        Float f = this.weight;
        if (f == null) {
            int i3 = RemoteActionCompatParcelizer + 69;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = f.hashCode();
            int i5 = serializer + 55;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TextComponent(text=", this.text, ", style=", this.style, ", color=");
        sbM.append(this.color);
        sbM.append(", weight=");
        sbM.append(this.weight);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 47;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof startNestedScrollForType))) {
            startNestedScrollForType startnestedscrollfortype = (startNestedScrollForType) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, startnestedscrollfortype.text}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, startnestedscrollfortype.style}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.color, startnestedscrollfortype.color}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weight, startnestedscrollfortype.weight}, getCieXyz.write())).booleanValue()) {
                int i2 = serializer + 49;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 24 / 0;
                }
                return true;
            }
            int i4 = serializer + 41;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i5 = serializer + 85;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
