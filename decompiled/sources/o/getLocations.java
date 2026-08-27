package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$MoveCloser$Companion;
import kotlinx.serialization.Serializable;
import o.getRepeatOffset;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getLocations extends invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 {
    public static final MultipleCodeScanTaskUiItem$ScanState$MoveCloser$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$MoveCloser$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 11;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getRepeatOffset getrepeatoffset = getRepeatOffset.read;
            int i4 = RemoteActionCompatParcelizer + 17;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 40 / 0;
            }
            return getrepeatoffset;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public final mapTreeWithStitching message;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$MoveCloser$Companion] */
    static {
        int i = read + 37;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getLocations(int i, mapTreeWithStitching maptreewithstitching) {
        if (1 == (i & 1)) {
            this.message = maptreewithstitching;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, getRepeatOffset.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.message.hashCode();
            throw null;
        }
        int iHashCode = this.message.hashCode();
        int i3 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MoveCloser(message=" + this.message + ")";
        int i2 = IconCompatParcelizer + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public getLocations(mapTreeWithStitching maptreewithstitching) {
        maptreewithstitching.getClass();
        this.message = maptreewithstitching;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 15;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getLocations)) {
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((getLocations) obj).message}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 69;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 3;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }
}
