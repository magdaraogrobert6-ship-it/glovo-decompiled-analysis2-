package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan$ScannedItemsDialog$Companion;
import kotlinx.serialization.Serializable;
import o.FontFamilyResolverImplpreload1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class resolvelambda0 {
    public static final MultipleCodeScan$ScannedItemsDialog$Companion Companion = new Object() { // from class: com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan$ScannedItemsDialog$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 111;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            FontFamilyResolverImplpreload1 fontFamilyResolverImplpreload1 = FontFamilyResolverImplpreload1.RemoteActionCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 23;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return fontFamilyResolverImplpreload1;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final getDismissOnBackPress closeButton;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.common.data.model.tasks.MultipleCodeScan$ScannedItemsDialog$Companion] */
    static {
        int i = IconCompatParcelizer + 45;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 93;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 31;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final getDismissOnBackPress write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 61;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getDismissOnBackPress getdismissonbackpress = this.closeButton;
        int i5 = i2 + 39;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return getdismissonbackpress;
    }

    public /* synthetic */ resolvelambda0(int i, String str, getDismissOnBackPress getdismissonbackpress) {
        if (3 == (i & 3)) {
            this.title = str;
            this.closeButton = getdismissonbackpress;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FontFamilyResolverImplpreload1.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 13;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = this.title.hashCode();
            iHashCode = this.closeButton.hashCode();
            i = iHashCode2 >> 111;
        } else {
            int iHashCode3 = this.title.hashCode();
            iHashCode = this.closeButton.hashCode();
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ScannedItemsDialog(title=" + this.title + ", closeButton=" + this.closeButton + ")";
        int i2 = serializer + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resolvelambda0)) {
            return false;
        }
        resolvelambda0 resolvelambda0Var = (resolvelambda0) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, resolvelambda0Var.title}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.closeButton, resolvelambda0Var.closeButton}, getCieXyz.write())).booleanValue();
        }
        int i3 = RemoteActionCompatParcelizer + 43;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
