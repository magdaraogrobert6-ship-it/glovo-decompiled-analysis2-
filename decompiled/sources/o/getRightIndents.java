package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedAddress$Companion;
import kotlinx.serialization.Serializable;
import o.getLineSpacingMultiplier;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "selected_address")
public final class getRightIndents extends getLineSpacingExtra {
    public static final LastStopScreen$LastStopScreenComponent$SelectedAddress$Companion Companion = new Object() { // from class: com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedAddress$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 61;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getLineSpacingMultiplier.serializer;
            }
            int i3 = 81 / 0;
            return getLineSpacingMultiplier.serializer;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public final String address;
    public final String hint;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.accept.laststop.api.data.models.LastStopScreen$LastStopScreenComponent$SelectedAddress$Companion] */
    static {
        int i = IconCompatParcelizer + 93;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.address;
        int i5 = i2 + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ getRightIndents(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.hint = str;
            if ((i & 2) == 0) {
                this.address = null;
                int i2 = read + 31;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            this.address = str2;
            int i4 = RemoteActionCompatParcelizer + 41;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
                return;
            }
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getLineSpacingMultiplier.serializer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("SelectedAddress(hint=", this.hint, ", address=", this.address, ")");
        }
        int i3 = 3 / 0;
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("SelectedAddress(hint=", this.hint, ", address=", this.address, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.hint.hashCode();
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.hint.hashCode();
        String str = this.address;
        int iHashCode2 = (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        int i3 = read + 49;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 7;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 109;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof getRightIndents) {
            getRightIndents getrightindents = (getRightIndents) obj;
            Object[] objArr = {this.hint, getrightindents.hint};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.address, getrightindents.address};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = read + 99;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = RemoteActionCompatParcelizer + 91;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
