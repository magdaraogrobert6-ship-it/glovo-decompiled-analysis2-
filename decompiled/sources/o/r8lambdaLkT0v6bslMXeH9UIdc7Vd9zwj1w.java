package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.settings.data.model.PromotionComponent$Companion;
import kotlinx.serialization.Serializable;
import o.r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w {
    public static final PromotionComponent$Companion Companion = new Object() { // from class: com.roadrunner.settings.data.model.PromotionComponent$Companion
        private static int read = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 27;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4.write;
            }
            r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4 r8lambdaktdkirrtgseewc_aurrrcqv4ep4 = r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4.write;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final String iconUrl;
    public final String label;
    public final String timeRange;
    public final String type;
    public final boolean value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.settings.data.model.PromotionComponent$Companion] */
    static {
        int i = write + 39;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w(int i, String str, String str2, String str3, String str4, boolean z) {
        if (31 == (i & 31)) {
            this.type = str;
            this.label = str2;
            this.timeRange = str3;
            this.value = z;
            this.iconUrl = str4;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, r8lambdaKtdKiRrtgSEewC_AURrRCqv4EP4.write.getDescriptor());
        throw null;
    }

    public r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w(String str, String str2, String str3, String str4, boolean z) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.type = str;
        this.label = str2;
        this.timeRange = str3;
        this.value = z;
        this.iconUrl = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PromotionComponent(type=", this.type, ", label=", this.label, ", timeRange=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.timeRange, ", value=", ", iconUrl=", sbM, this.value);
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.iconUrl, ")");
        int i4 = IconCompatParcelizer + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.iconUrl.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.label), 31, this.timeRange), 31, this.value);
        int i4 = IconCompatParcelizer + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w)) {
            return false;
        }
        r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w = (r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.label, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.label}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 77;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timeRange, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.timeRange}, getCieXyz.write())).booleanValue()) {
            int i4 = IconCompatParcelizer + 91;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (this.value != r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.value) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.iconUrl, r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.iconUrl}, getCieXyz.write())).booleanValue();
    }
}
