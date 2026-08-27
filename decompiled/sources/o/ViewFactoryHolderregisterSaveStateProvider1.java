package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$Message$Companion;
import kotlinx.serialization.Serializable;
import o.ViewFactoryHolderreleaseBlock1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "message")
public final class ViewFactoryHolderregisterSaveStateProvider1 extends accessgetCurrentlyFocusedRect {
    public static final StateV3$AcceptData$Message$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$Message$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 59;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ViewFactoryHolderreleaseBlock1 viewFactoryHolderreleaseBlock1 = ViewFactoryHolderreleaseBlock1.write;
            int i4 = write + 125;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return viewFactoryHolderreleaseBlock1;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String image;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$Message$Companion] */
    static {
        int i = serializer + 113;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ ViewFactoryHolderregisterSaveStateProvider1(int i, String str, String str2) {
        Object obj = null;
        if ((i & 1) == 0) {
            this.title = null;
            int i2 = 2 % 2;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            int i3 = IconCompatParcelizer + 33;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.image = null;
            return;
        }
        this.image = str2;
        int i5 = IconCompatParcelizer + 43;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Message(title=", this.title, ", image=", this.image, ")");
        int i4 = IconCompatParcelizer + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return strWrite;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.title;
        if (str == null) {
            int i2 = IconCompatParcelizer + 71;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = read + 25;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        String str2 = this.image;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewFactoryHolderregisterSaveStateProvider1) {
            ViewFactoryHolderregisterSaveStateProvider1 viewFactoryHolderregisterSaveStateProvider1 = (ViewFactoryHolderregisterSaveStateProvider1) obj;
            Object[] objArr = {this.title, viewFactoryHolderregisterSaveStateProvider1.title};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.image, viewFactoryHolderregisterSaveStateProvider1.image};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = IconCompatParcelizer + 123;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 37;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i6 = IconCompatParcelizer + 27;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
