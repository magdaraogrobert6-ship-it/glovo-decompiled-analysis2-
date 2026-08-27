package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.api.data.PaginationText$Companion;
import kotlinx.serialization.Serializable;
import o.doInstallation;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class findMethod {
    public static final PaginationText$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.PaginationText$Companion
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return doInstallation.RemoteActionCompatParcelizer;
            }
            doInstallation doinstallation = doInstallation.RemoteActionCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String showLess;
    public final String showMore;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.PaginationText$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 3;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ findMethod(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.showMore = str;
            this.showLess = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, doInstallation.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PaginationText(showMore=", this.showMore, ", showLess=", this.showLess, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PaginationText(showMore=", this.showMore, ", showLess=", this.showLess, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.showLess.hashCode() << (this.showMore.hashCode() * 99);
        }
        return (this.showMore.hashCode() * 31) + this.showLess.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 59;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 11;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof findMethod) {
            findMethod findmethod = (findMethod) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.showMore, findmethod.showMore}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.showLess, findmethod.showLess}, getCieXyz.write())).booleanValue();
        }
        int i7 = i2 + 71;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 31;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return false;
    }
}
