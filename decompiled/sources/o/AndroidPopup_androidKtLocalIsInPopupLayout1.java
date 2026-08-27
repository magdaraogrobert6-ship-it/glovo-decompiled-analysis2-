package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AutoAcceptData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.isPopupLayoutdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "auto_accept")
public final class AndroidPopup_androidKtLocalIsInPopupLayout1 extends AndroidPopup_androidKtPopup41 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final List components;
    public final String subtitle;
    public final String title;
    public final String type;
    public static final StateV3$AutoAcceptData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AutoAcceptData$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 55;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                isPopupLayoutdefault ispopuplayoutdefault = isPopupLayoutdefault.write;
                throw null;
            }
            isPopupLayoutdefault ispopuplayoutdefault2 = isPopupLayoutdefault.write;
            int i3 = IconCompatParcelizer + 17;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return ispopuplayoutdefault2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(24))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AutoAcceptData$Companion] */
    static {
        int i = write + 61;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.AndroidPopup_androidKtPopup41
    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 117;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 65;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ AndroidPopup_androidKtLocalIsInPopupLayout1(int i, String str, String str2, String str3, List list) {
        Object obj = null;
        if (10 != (i & 10)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 10, isPopupLayoutdefault.write.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            int i2 = 2 % 2;
            str = "auto_accept";
        }
        this.type = str;
        this.title = str2;
        if ((i & 4) == 0) {
            int i3 = IconCompatParcelizer + 49;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        this.components = list;
        int i5 = IconCompatParcelizer + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("AutoAcceptData(type=", this.type, ", title=", this.title, ", subtitle="), this.subtitle, ", components=", this.components, ")");
        }
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(c8$$ExternalSyntheticOutline0.m("AutoAcceptData(type=", this.type, ", title=", this.title, ", subtitle="), this.subtitle, ", components=", this.components, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.type;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = IconCompatParcelizer + 89;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 2 / 2;
            }
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.title);
        String str2 = this.subtitle;
        return this.components.hashCode() + ((iM + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidPopup_androidKtLocalIsInPopupLayout1) {
            AndroidPopup_androidKtLocalIsInPopupLayout1 androidPopup_androidKtLocalIsInPopupLayout1 = (AndroidPopup_androidKtLocalIsInPopupLayout1) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, androidPopup_androidKtLocalIsInPopupLayout1.type}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, androidPopup_androidKtLocalIsInPopupLayout1.title}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 37;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, androidPopup_androidKtLocalIsInPopupLayout1.subtitle}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, androidPopup_androidKtLocalIsInPopupLayout1.components}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = IconCompatParcelizer + 1;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 83;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }
}
