package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$WrongShelf$Companion;
import kotlinx.serialization.Serializable;
import o.SourceLocation;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class UiToolingDataApi extends invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 {
    public static final MultipleCodeScanTaskUiItem$ScanState$WrongShelf$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$WrongShelf$Companion
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 97;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                SourceLocation sourceLocation = SourceLocation.RemoteActionCompatParcelizer;
                throw null;
            }
            SourceLocation sourceLocation2 = SourceLocation.RemoteActionCompatParcelizer;
            int i3 = serializer + 105;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return sourceLocation2;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final mapTreeWithStitching message;
    public final String scannedCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$WrongShelf$Companion] */
    static {
        int i = IconCompatParcelizer + 47;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ UiToolingDataApi(int i, mapTreeWithStitching maptreewithstitching, String str) {
        if (3 == (i & 3)) {
            this.message = maptreewithstitching;
            this.scannedCode = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, SourceLocation.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.scannedCode.hashCode() + (this.message.hashCode() * 31);
        int i4 = RemoteActionCompatParcelizer + 111;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public UiToolingDataApi(mapTreeWithStitching maptreewithstitching, String str) {
        maptreewithstitching.getClass();
        str.getClass();
        this.message = maptreewithstitching;
        this.scannedCode = str;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WrongShelf(message=" + this.message + ", scannedCode=" + this.scannedCode + ")";
        int i2 = read + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof UiToolingDataApi) {
            UiToolingDataApi uiToolingDataApi = (UiToolingDataApi) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, uiToolingDataApi.message}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scannedCode, uiToolingDataApi.scannedCode}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = RemoteActionCompatParcelizer + 75;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = RemoteActionCompatParcelizer + 21;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i3 % 2 == 0;
    }
}
