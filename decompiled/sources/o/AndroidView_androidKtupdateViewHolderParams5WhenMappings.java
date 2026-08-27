package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$AcceptanceRate$Companion;
import kotlinx.serialization.Serializable;
import o.getRequester;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "acceptance_rate")
public final class AndroidView_androidKtupdateViewHolderParams5WhenMappings extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$AcceptanceRate$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$AcceptanceRate$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 99;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getRequester getrequester = getRequester.read;
            int i4 = read + 73;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 12 / 0;
            }
            return getrequester;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$AcceptanceRate$Companion] */
    static {
        int i = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ AndroidView_androidKtupdateViewHolderParams5WhenMappings(int i, String str) {
        if (1 == (i & 1)) {
            this.title = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getRequester.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.title.hashCode();
        int i4 = serializer + 99;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("AcceptanceRate(title=", this.title, ")");
            int i3 = write + 89;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m("AcceptanceRate(title=", this.title, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidView_androidKtupdateViewHolderParams5WhenMappings) {
            Object[] objArr = {this.title, ((AndroidView_androidKtupdateViewHolderParams5WhenMappings) obj).title};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i2 = serializer + 105;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = serializer + 57;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 121;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 71;
        write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
