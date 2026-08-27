package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.quests.data.BannerResponse$Companion;
import com.roadrunner.rider.state.quests.data.QuestStatus;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getGdprParameters;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getAttributionParameters {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String description;
    public final String iconUrl;
    public final getEventSuffix progress;
    public final QuestStatus status;
    public final String title;
    public final String url;
    public static final BannerResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.quests.data.BannerResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 81;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                getGdprParameters getgdprparameters = getGdprParameters.serializer;
                throw null;
            }
            getGdprParameters getgdprparameters2 = getGdprParameters.serializer;
            int i3 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return getgdprparameters2;
            }
            obj.hashCode();
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(18)), null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.quests.data.BannerResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 31;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getAttributionParameters(int i, String str, String str2, QuestStatus questStatus, String str3, String str4, getEventSuffix geteventsuffix) {
        if (15 == (i & 15)) {
            this.title = str;
            this.description = str2;
            this.status = questStatus;
            this.url = str3;
            if ((i & 16) == 0) {
                this.iconUrl = null;
            } else {
                this.iconUrl = str4;
                int i2 = read + 99;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            int i4 = 2 % 2;
            if ((i & 32) == 0) {
                int i5 = serializer + 105;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                this.progress = null;
                return;
            }
            this.progress = geteventsuffix;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, getGdprParameters.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 1;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m((this.status.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description)) * 31, 31, this.url);
        String str = this.iconUrl;
        if (str == null) {
            int i4 = read + 69;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        getEventSuffix geteventsuffix = this.progress;
        return ((iM + iHashCode) * 31) + (geteventsuffix != null ? geteventsuffix.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BannerResponse(title=", this.title, ", description=", this.description, ", status=");
        sbM.append(this.status);
        sbM.append(", url=");
        sbM.append(this.url);
        sbM.append(", iconUrl=");
        sbM.append(this.iconUrl);
        sbM.append(", progress=");
        sbM.append(this.progress);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.getAttributionParameters) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 19;
        o.getAttributionParameters.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.getAttributionParameters) r22;
        r12 = new java.lang.Object[]{r21.title, r1.title};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r1 = o.getAttributionParameters.serializer + 57;
        o.getAttributionParameters.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r19 = new java.lang.Object[]{r21.description, r1.description};
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r21.status == r1.status) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r1 = o.getAttributionParameters.read + 27;
        o.getAttributionParameters.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        r19 = new java.lang.Object[]{r21.url, r1.url};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00be, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r1 = o.getAttributionParameters.serializer + 111;
        o.getAttributionParameters.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        r19 = new java.lang.Object[]{r21.iconUrl, r1.iconUrl};
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f2, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f4, code lost:
    
        r1 = o.getAttributionParameters.read + 125;
        o.getAttributionParameters.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        if ((r1 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        r19 = new java.lang.Object[]{r21.progress, r1.progress};
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAttributionParameters.equals(java.lang.Object):boolean");
    }
}
