package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.model.Analytics$Parameter$Companion;
import kotlinx.serialization.Serializable;
import o.accessgetDecorFitsSystemWindowsp;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getMaxDialogHeightExcludingInsets {
    public static final Analytics$Parameter$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.model.Analytics$Parameter$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 29;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return accessgetDecorFitsSystemWindowsp.serializer;
            }
            accessgetDecorFitsSystemWindowsp accessgetdecorfitssystemwindowsp = accessgetDecorFitsSystemWindowsp.serializer;
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String key;
    public final String value;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.model.Analytics$Parameter$Companion] */
    static {
        int i = write + 115;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getMaxDialogHeightExcludingInsets(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.key = str;
            this.value = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessgetDecorFitsSystemWindowsp.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Parameter(key=", this.key, ", value=", this.value, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Parameter(key=", this.key, ", value=", this.value, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.value.hashCode() + (this.key.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 5;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getMaxDialogHeightExcludingInsets) {
            getMaxDialogHeightExcludingInsets getmaxdialogheightexcludinginsets = (getMaxDialogHeightExcludingInsets) obj;
            Object[] objArr = {this.key, getmaxdialogheightexcludinginsets.key};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.value, getmaxdialogheightexcludinginsets.value};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    int i2 = read + 57;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read + 31;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            int i5 = RemoteActionCompatParcelizer + 109;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 23;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
