package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.delivery.state.pudo.Instruction$Tag$Companion;
import com.roadrunner.delivery.state.pudo.TagToken;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.getPositionProvider;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = RemoteMessageConst.Notification.TAG)
public final class getParamsui extends accessgetPropertiesp {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final TagToken colorToken;
    public final String description;
    public final String title;
    public static final Instruction$Tag$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.pudo.Instruction$Tag$Companion
        private static int IconCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 37;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getPositionProvider.read;
            }
            getPositionProvider getpositionprovider = getPositionProvider.read;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKtlambda2101488961(16))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.pudo.Instruction$Tag$Companion] */
    static {
        int i = write + 41;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    public /* synthetic */ getParamsui(int i, String str, String str2, TagToken tagToken) {
        if (7 == (i & 7)) {
            this.title = str;
            this.description = str2;
            this.colorToken = tagToken;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, getPositionProvider.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        String str;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 67;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int iHashCode = this.title.hashCode();
            str = this.description;
            i2 = iHashCode << 56;
            i = 20;
        } else {
            int iHashCode2 = this.title.hashCode();
            str = this.description;
            i = 31;
            i2 = iHashCode2 * 31;
        }
        int iHashCode3 = this.colorToken.hashCode() + af$$ExternalSyntheticOutline0.m(i2, i, str);
        int i5 = serializer + 33;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return iHashCode3;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Tag(title=", this.title, ", description=", this.description, ", colorToken=");
        sbM.append(this.colorToken);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getParamsui)) {
            int i2 = RemoteActionCompatParcelizer + 39;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        getParamsui getparamsui = (getParamsui) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getparamsui.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getparamsui.description}, getCieXyz.write())).booleanValue()) {
            int i3 = serializer + 91;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 125;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 99 / 0;
            }
            return false;
        }
        if (this.colorToken == getparamsui.colorToken) {
            return true;
        }
        int i8 = RemoteActionCompatParcelizer + 71;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
