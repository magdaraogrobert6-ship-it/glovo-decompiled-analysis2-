package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.Instruction$InstructionV2$Companion;
import com.roadrunner.delivery.state.pudo.TagIconTokenV1;
import kotlinx.serialization.Serializable;
import o.accessgetParentLayoutCoordinates;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "instructions_v2")
public final class getDisplayBounds extends accessgetPropertiesp {
    public static final Instruction$InstructionV2$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$InstructionV2$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 11;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            accessgetParentLayoutCoordinates accessgetparentlayoutcoordinates = accessgetParentLayoutCoordinates.IconCompatParcelizer;
            int i4 = IconCompatParcelizer + 19;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return accessgetparentlayoutcoordinates;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String description;
    public final TagIconTokenV1 icon;
    public final PopupLayout link;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$InstructionV2$Companion] */
    static {
        int i = write + 109;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getDisplayBounds(int i, String str, String str2, TagIconTokenV1 tagIconTokenV1, PopupLayout popupLayout) {
        if (5 != (i & 5)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 5, accessgetParentLayoutCoordinates.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.description = null;
            int i2 = 2 % 2;
        } else {
            this.description = str2;
        }
        this.icon = tagIconTokenV1;
        if ((i & 8) != 0) {
            this.link = popupLayout;
            int i3 = IconCompatParcelizer + 75;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        int i5 = read + 113;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            this.link = null;
        } else {
            this.link = null;
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("InstructionV2(title=", this.title, ", description=", this.description, ", icon=");
        sbM.append(this.icon);
        sbM.append(", link=");
        sbM.append(this.link);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.title.hashCode();
        String str = this.description;
        int iHashCode3 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = IconCompatParcelizer + 113;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int iHashCode4 = this.icon.hashCode();
        PopupLayout popupLayout = this.link;
        if (popupLayout == null) {
            int i4 = read + 37;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            iHashCode3 = popupLayout.hashCode();
        }
        return ((iHashCode4 + (((iHashCode2 * 31) + iHashCode) * 31)) * 31) + iHashCode3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.getDisplayBounds) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = r4 + 119;
        o.getDisplayBounds.read = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = (o.getDisplayBounds) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.title, r1.title}, o.getCieXyz.write())).booleanValue()) == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.description, r1.description}, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r21.icon == r1.icon) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        r1 = o.getDisplayBounds.read + 1;
        o.getDisplayBounds.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.link, r1.link}, o.getCieXyz.write())).booleanValue() == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        r1 = o.getDisplayBounds.IconCompatParcelizer + 61;
        o.getDisplayBounds.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        r1 = o.getDisplayBounds.IconCompatParcelizer + 117;
        o.getDisplayBounds.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDisplayBounds.equals(java.lang.Object):boolean");
    }
}
