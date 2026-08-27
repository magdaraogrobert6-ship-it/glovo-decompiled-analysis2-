package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlRequest$Companion;
import kotlinx.serialization.Serializable;
import o.BackStackRecordState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EmojiProcessor {
    public static final HelpCenterUrlRequest$Companion Companion = new Object() { // from class: com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlRequest$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 103;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            BackStackRecordState backStackRecordState = BackStackRecordState.read;
            int i4 = serializer + 87;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return backStackRecordState;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final String brand;
    public final String brazeId;
    public final Integer deliveryId;
    public final String flowVersion;
    public final String globalEntityId;
    public final boolean isHelpCenterMode;
    public final boolean isOffShiftSupportEnabled;
    public final String pageId;
    public final String uiMode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.helpcenter.data.help_center_url.HelpCenterUrlRequest$Companion] */
    static {
        int i = read + 47;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ EmojiProcessor(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, Integer num, String str5, String str6) {
        if (31 != (i & 31)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, BackStackRecordState.read.getDescriptor());
            throw null;
        }
        this.globalEntityId = str;
        this.brand = str2;
        this.brazeId = str3;
        this.isHelpCenterMode = z;
        this.isOffShiftSupportEnabled = z2;
        if ((i & 32) == 0) {
            this.pageId = null;
        } else {
            this.pageId = str4;
            int i2 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.deliveryId = null;
        } else {
            this.deliveryId = num;
            int i3 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.flowVersion = null;
        } else {
            this.flowVersion = str5;
            int i4 = RemoteActionCompatParcelizer + 43;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) != 0) {
            this.uiMode = str6;
            return;
        }
        this.uiMode = null;
        int i6 = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HelpCenterUrlRequest(globalEntityId=", this.globalEntityId, ", brand=", this.brand, ", brazeId=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.brazeId, ", isHelpCenterMode=", ", isOffShiftSupportEnabled=", sbM, this.isHelpCenterMode);
        IconCompatParcelizer.RemoteActionCompatParcelizer(", pageId=", this.pageId, ", deliveryId=", sbM, this.isOffShiftSupportEnabled);
        sbM.append(this.deliveryId);
        sbM.append(", flowVersion=");
        sbM.append(this.flowVersion);
        sbM.append(", uiMode=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.uiMode, ")");
        int i4 = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public EmojiProcessor(String str, String str2, String str3, String str4, Integer num, String str5, String str6) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.globalEntityId = str;
        this.brand = str2;
        this.brazeId = str3;
        this.isHelpCenterMode = true;
        this.isOffShiftSupportEnabled = true;
        this.pageId = str4;
        this.deliveryId = num;
        this.flowVersion = str5;
        this.uiMode = str6;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.globalEntityId.hashCode() * 31, 31, this.brand), 31, this.brazeId), 31, this.isHelpCenterMode), 31, this.isOffShiftSupportEnabled);
        String str = this.pageId;
        int iHashCode2 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = RemoteActionCompatParcelizer + 47;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        Integer num = this.deliveryId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.flowVersion;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.uiMode;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            int i4 = RemoteActionCompatParcelizer + 31;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return ((((((iM + iHashCode) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiProcessor)) {
            return false;
        }
        EmojiProcessor emojiProcessor = (EmojiProcessor) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, emojiProcessor.globalEntityId}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, emojiProcessor.brand}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brazeId, emojiProcessor.brazeId}, getCieXyz.write())).booleanValue()) {
                if (this.isHelpCenterMode == emojiProcessor.isHelpCenterMode) {
                    if (this.isOffShiftSupportEnabled == emojiProcessor.isOffShiftSupportEnabled) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pageId, emojiProcessor.pageId}, getCieXyz.write())).booleanValue()) {
                            int i2 = IconCompatParcelizer + 17;
                            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryId, emojiProcessor.deliveryId}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.flowVersion, emojiProcessor.flowVersion}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.uiMode, emojiProcessor.uiMode}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i4 = RemoteActionCompatParcelizer + 119;
                        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        return i4 % 2 != 0;
                    }
                    int i5 = RemoteActionCompatParcelizer + 83;
                    IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i5 % 2 != 0;
                }
                int i6 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i7 = IconCompatParcelizer + 87;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 == 0;
        }
        int i8 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
