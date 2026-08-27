package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class accessconstructAnnotationsFromSpansAndParagraphs {
    private static int IconCompatParcelizer = 1;
    private static int read;

    @SerializedName("global_entity_configs")
    private final List<read> globalEntityConfigs;

    public static final class read {
        private static int IconCompatParcelizer = 1;
        private static int read;

        @SerializedName("global_entity_id")
        private final String globalEntityId;

        @SerializedName("register_device_token_for_p2p_chat")
        private final boolean registerDeviceTokenForP2pChat;

        @SerializedName("self_service_brand")
        private final String selfServiceBrand;

        @SerializedName("self_service_region")
        private final String selfServiceRegion;

        public final String IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = read + 13;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            String str = this.globalEntityId;
            int i5 = i3 + 35;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String RemoteActionCompatParcelizer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 23;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.selfServiceRegion;
            int i5 = i2 + 33;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 93 / 0;
            }
            return str;
        }

        public final String serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.selfServiceBrand;
            }
            throw null;
        }

        public final boolean write() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 83;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            boolean z = this.registerDeviceTokenForP2pChat;
            int i5 = i3 + 93;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return z;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = read + 3;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                String str = this.globalEntityId;
                String str2 = this.selfServiceRegion;
                ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("GlobalEntityConfigResponse(globalEntityId=", str, ", selfServiceRegion=", str2, ", registerDeviceTokenForP2pChat=REDACTED, selfServiceBrand="), this.selfServiceBrand, ")");
                throw null;
            }
            String str3 = this.globalEntityId;
            String str4 = this.selfServiceRegion;
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("GlobalEntityConfigResponse(globalEntityId=", str3, ", selfServiceRegion=", str4, ", registerDeviceTokenForP2pChat=REDACTED, selfServiceBrand="), this.selfServiceBrand, ")");
            int i3 = IconCompatParcelizer + 1;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            throw null;
        }

        public final int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 61;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.globalEntityId.hashCode() * 31, 31, this.selfServiceRegion), 31, this.registerDeviceTokenForP2pChat);
            String str = this.selfServiceBrand;
            if (str == null) {
                i = 0;
            } else {
                int iHashCode = str.hashCode();
                int i5 = IconCompatParcelizer + 17;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i = iHashCode;
            }
            return iM + i;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = read + 43;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, readVar.globalEntityId}, getCieXyz.write())).booleanValue()) {
                int i3 = IconCompatParcelizer + 119;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selfServiceRegion, readVar.selfServiceRegion}, getCieXyz.write())).booleanValue() || this.registerDeviceTokenForP2pChat != readVar.registerDeviceTokenForP2pChat) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selfServiceBrand, readVar.selfServiceBrand}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = IconCompatParcelizer + 19;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
    }

    public final List read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        List<read> list = this.globalEntityConfigs;
        int i5 = i3 + 67;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.globalEntityConfigs.hashCode();
        }
        this.globalEntityConfigs.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("HelpCenterEntityConfigEndpointResponse(globalEntityConfigs=", ")", this.globalEntityConfigs);
        int i4 = IconCompatParcelizer + 63;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.accessconstructAnnotationsFromSpansAndParagraphs) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 105;
        r13 = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.accessconstructAnnotationsFromSpansAndParagraphs.read = r13;
        r2 = r2 % 2;
        r13 = r13 + 79;
        o.accessconstructAnnotationsFromSpansAndParagraphs.IconCompatParcelizer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if ((r13 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r13 = 28 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r10 = new java.lang.Object[]{r12.globalEntityConfigs, ((o.accessconstructAnnotationsFromSpansAndParagraphs) r13).globalEntityConfigs};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.accessconstructAnnotationsFromSpansAndParagraphs.read
            int r1 = r1 + 53
            int r2 = r1 % 128
            o.accessconstructAnnotationsFromSpansAndParagraphs.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 77
            int r1 = r1 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r13 instanceof o.accessconstructAnnotationsFromSpansAndParagraphs
            if (r1 != 0) goto L31
            int r2 = r2 + 105
            int r13 = r2 % 128
            o.accessconstructAnnotationsFromSpansAndParagraphs.read = r13
            int r2 = r2 % r0
            int r13 = r13 + 79
            int r1 = r13 % 128
            o.accessconstructAnnotationsFromSpansAndParagraphs.IconCompatParcelizer = r1
            int r13 = r13 % r0
            if (r13 != 0) goto L30
            r13 = 28
            int r13 = r13 / r4
        L30:
            return r4
        L31:
            o.accessconstructAnnotationsFromSpansAndParagraphs r13 = (o.accessconstructAnnotationsFromSpansAndParagraphs) r13
            java.util.List<o.accessconstructAnnotationsFromSpansAndParagraphs$read> r0 = r12.globalEntityConfigs
            java.util.List<o.accessconstructAnnotationsFromSpansAndParagraphs$read> r13 = r13.globalEntityConfigs
            java.lang.Object[] r10 = new java.lang.Object[]{r0, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L5e
            return r4
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessconstructAnnotationsFromSpansAndParagraphs.equals(java.lang.Object):boolean");
    }
}
