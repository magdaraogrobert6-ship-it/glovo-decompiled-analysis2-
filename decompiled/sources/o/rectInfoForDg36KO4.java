package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientChatTranslationToggled$Companion;
import kotlinx.serialization.Serializable;
import o.ThrottledCallbacksKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_TRANSLATION_TOGGLE_CLICK")
public final class rectInfoForDg36KO4 extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientChatTranslationToggled$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientChatTranslationToggled$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 95;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                ThrottledCallbacksKt throttledCallbacksKt = ThrottledCallbacksKt.serializer;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ThrottledCallbacksKt throttledCallbacksKt2 = ThrottledCallbacksKt.serializer;
            int i3 = RemoteActionCompatParcelizer + 85;
            read = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 43 / 0;
            }
            return throttledCallbacksKt2;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String bridgeMessageId;
    public final setTopLeft payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientChatTranslationToggled$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 121;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 53;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.bridgeMessageId;
        int i5 = i2 + 23;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rectInfoForDg36KO4(int i, String str, String str2, setTopLeft settopleft) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = settopleft;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, ThrottledCallbacksKt.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.payload.translationEnabled) * (this.bridgeMessageId.hashCode() % 38);
        }
        return Boolean.hashCode(this.payload.translationEnabled) + (this.bridgeMessageId.hashCode() * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rectInfoForDg36KO4(String str, setTopLeft settopleft) {
        super("CLIENT_CHAT_NOTIFIES_ABOUT_TRANSLATION_TOGGLE_CLICK", 0);
        settopleft.getClass();
        this.bridgeMessageId = str;
        this.payload = settopleft;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ClientChatTranslationToggled(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = serializer + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.rectInfoForDg36KO4) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r1 = (o.rectInfoForDg36KO4) r22;
        r12 = new java.lang.Object[]{r21.bridgeMessageId, r1.bridgeMessageId};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        r19 = new java.lang.Object[]{r21.payload, r1.payload};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        r1 = o.rectInfoForDg36KO4.write + 27;
        o.rectInfoForDg36KO4.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
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
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.rectInfoForDg36KO4.write
            int r3 = r3 + 109
            int r4 = r3 % 128
            o.rectInfoForDg36KO4.serializer = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1a
            r3 = 34
            int r3 = r3 / r5
            if (r0 != r1) goto L1d
            goto L1c
        L1a:
            if (r0 != r1) goto L1d
        L1c:
            return r4
        L1d:
            boolean r3 = r1 instanceof o.rectInfoForDg36KO4
            if (r3 != 0) goto L22
            return r5
        L22:
            o.rectInfoForDg36KO4 r1 = (o.rectInfoForDg36KO4) r1
            java.lang.String r3 = r0.bridgeMessageId
            java.lang.String r6 = r1.bridgeMessageId
            java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
            int r7 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r13 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            r15 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r16 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r8 = r15
            r9 = r16
            java.lang.Object r3 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L52
            return r5
        L52:
            o.setTopLeft r3 = r0.payload
            o.setTopLeft r1 = r1.payload
            java.lang.Object[] r19 = new java.lang.Object[]{r3, r1}
            int r14 = o.getCieXyz.write()
            int r18 = o.getCieXyz.write()
            int r20 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L80
            int r1 = o.rectInfoForDg36KO4.write
            int r1 = r1 + 27
            int r3 = r1 % 128
            o.rectInfoForDg36KO4.serializer = r3
            int r1 = r1 % r2
            return r5
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.rectInfoForDg36KO4.equals(java.lang.Object):boolean");
    }
}
