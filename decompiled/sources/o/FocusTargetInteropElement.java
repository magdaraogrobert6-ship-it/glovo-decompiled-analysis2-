package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeclineDetails$Companion;
import kotlinx.serialization.Serializable;
import o.accessonFocusStateChange;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FocusTargetInteropElement {
    public static final StateV3$AcceptData$DeclineDetails$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeclineDetails$Companion
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer;

        public final setGraphicModalMaxWidthDp serializer() {
            accessonFocusStateChange accessonfocusstatechange;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                accessonfocusstatechange = accessonFocusStateChange.IconCompatParcelizer;
                int i3 = 5 / 0;
            } else {
                accessonfocusstatechange = accessonFocusStateChange.IconCompatParcelizer;
            }
            int i4 = IconCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return accessonfocusstatechange;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final FocusGroupPropertiesNodeonExit1 data;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeclineDetails$Companion] */
    static {
        int i = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ FocusTargetInteropElement(int i, String str, FocusGroupPropertiesNodeonExit1 focusGroupPropertiesNodeonExit1) {
        if (3 == (i & 3)) {
            this.url = str;
            this.data = focusGroupPropertiesNodeonExit1;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, accessonFocusStateChange.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.data.hashCode() / (this.url.hashCode() << 27);
        }
        return this.data.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "DeclineDetails(url=" + this.url + ", data=" + this.data + ")";
        int i2 = serializer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 63;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusTargetInteropElement) {
            FocusTargetInteropElement focusTargetInteropElement = (FocusTargetInteropElement) obj;
            Object[] objArr = {this.url, focusTargetInteropElement.url};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i5 = serializer + 79;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            Object[] objArr2 = {this.data, focusTargetInteropElement.data};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i7 = read + 101;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = i2 + 11;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
