package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.data.model.ReportPictureRequest$Companion;
import kotlinx.serialization.Serializable;
import o.NullableInputConnectionWrapperApi24;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class sendKeyEvent {
    public static final ReportPictureRequest$Companion Companion = new Object() { // from class: com.roadrunner.delivery.ontheway.crowdsourcing.gallery.data.model.ReportPictureRequest$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 119;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            NullableInputConnectionWrapperApi24 nullableInputConnectionWrapperApi24 = NullableInputConnectionWrapperApi24.IconCompatParcelizer;
            int i4 = RemoteActionCompatParcelizer + 115;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 68 / 0;
            }
            return nullableInputConnectionWrapperApi24;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final boolean blockUploader;
    public final String reason;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.ontheway.crowdsourcing.gallery.data.model.ReportPictureRequest$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 79;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ sendKeyEvent(String str, int i, boolean z) {
        if (3 == (i & 3)) {
            this.reason = str;
            this.blockUploader = z;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, NullableInputConnectionWrapperApi24.IconCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.blockUploader) + (this.reason.hashCode() * 31);
        int i4 = IconCompatParcelizer + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public sendKeyEvent(String str, boolean z) {
        str.getClass();
        this.reason = str;
        this.blockUploader = z;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof sendKeyEvent) {
            sendKeyEvent sendkeyevent = (sendKeyEvent) obj;
            Object[] objArr = {this.reason, sendkeyevent.reason};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.blockUploader == sendkeyevent.blockUploader) {
                return true;
            }
            int i5 = IconCompatParcelizer + 79;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i6 = i3 + 29;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ReportPictureRequest(reason=" + this.reason + ", blockUploader=" + this.blockUploader + ")";
        int i2 = IconCompatParcelizer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
