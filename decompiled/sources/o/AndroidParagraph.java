package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Companion;
import kotlinx.serialization.Serializable;
import o.ActualAtomicReferenceJvm_jvmAndAndroidKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "CLIENT_CHAT_NOTIFIES_ABOUT_CALL_BUTTON_CLICK")
public final class AndroidParagraph extends updateOffsetsLDcG7Xg {
    public static final BridgeMessage$ClientNotifiesCallButtonClick$Companion Companion = new Object() { // from class: com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Companion
        private static int serializer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 13;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ActualAtomicReferenceJvm_jvmAndAndroidKt actualAtomicReferenceJvm_jvmAndAndroidKt = ActualAtomicReferenceJvm_jvmAndAndroidKt.serializer;
            int i4 = serializer + 71;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return actualAtomicReferenceJvm_jvmAndAndroidKt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String bridgeMessageId;
    public final r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI payload;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.customerchat.selfservice.data.bridge.BridgeMessage$ClientNotifiesCallButtonClick$Companion] */
    static {
        int i = serializer + 107;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.updateOffsetsLDcG7Xg
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.bridgeMessageId;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidParagraph(int i, String str, String str2, r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI r8lambdafjidyyxjs4ynxmaxk_yjia8tzki) {
        super(str);
        if (15 == (i & 15)) {
            this.bridgeMessageId = str2;
            this.payload = r8lambdafjidyyxjs4ynxmaxk_yjia8tzki;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, ActualAtomicReferenceJvm_jvmAndAndroidKt.serializer.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.payload.phoneNumber.hashCode() % (this.bridgeMessageId.hashCode() >> 20);
        }
        return this.payload.phoneNumber.hashCode() + (this.bridgeMessageId.hashCode() * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph(String str, r8lambdaFJiDYYxJs4YNXmAXK_YJia8TzKI r8lambdafjidyyxjs4ynxmaxk_yjia8tzki) {
        super("CLIENT_CHAT_NOTIFIES_ABOUT_CALL_BUTTON_CLICK", 0);
        r8lambdafjidyyxjs4ynxmaxk_yjia8tzki.getClass();
        this.bridgeMessageId = str;
        this.payload = r8lambdafjidyyxjs4ynxmaxk_yjia8tzki;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ClientNotifiesCallButtonClick(bridgeMessageId=" + this.bridgeMessageId + ", payload=" + this.payload + ")";
        int i2 = write + 73;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidParagraph) {
            AndroidParagraph androidParagraph = (AndroidParagraph) obj;
            Object[] objArr = {this.bridgeMessageId, androidParagraph.bridgeMessageId};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.payload, androidParagraph.payload};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 111;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 49;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
