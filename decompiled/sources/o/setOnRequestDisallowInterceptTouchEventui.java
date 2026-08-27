package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$SubjectInfo$Companion;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setUpdate;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "info")
public final class setOnRequestDisallowInterceptTouchEventui implements setRelease {
    public static final DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$SubjectInfo$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$SubjectInfo$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setUpdate setupdate = setUpdate.read;
            int i4 = IconCompatParcelizer + 41;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return setupdate;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final String subtitle;
    public final String title;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.DestinationInfo$ScrollableComponent$LocationDetail$EntrancePicture$PictureUpload$SubjectInfo$Companion] */
    static {
        int i = IconCompatParcelizer + 75;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ setOnRequestDisallowInterceptTouchEventui(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.title = str;
            this.subtitle = str2;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, setUpdate.read.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("SubjectInfo(title=", this.title, ", subtitle=", this.subtitle, ")");
            int i3 = write + 53;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strWrite;
            }
            throw null;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("SubjectInfo(title=", this.title, ", subtitle=", this.subtitle, ")");
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.subtitle.hashCode() - (this.title.hashCode() / 52);
        }
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof setOnRequestDisallowInterceptTouchEventui) {
                setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = (setOnRequestDisallowInterceptTouchEventui) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, setonrequestdisallowintercepttoucheventui.title}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.subtitle, setonrequestdisallowintercepttoucheventui.subtitle}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = write + 125;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            int i3 = write + 57;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = RemoteActionCompatParcelizer + 123;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
