package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$AlreadyScanned$Companion;
import kotlinx.serialization.Serializable;
import o.SlotTreeKtextractFromLegacyFieldsinlinedsortedBy1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SourceContext extends invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 {
    public static final MultipleCodeScanTaskUiItem$ScanState$AlreadyScanned$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$AlreadyScanned$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SlotTreeKtextractFromLegacyFieldsinlinedsortedBy1 slotTreeKtextractFromLegacyFieldsinlinedsortedBy1 = SlotTreeKtextractFromLegacyFieldsinlinedsortedBy1.RemoteActionCompatParcelizer;
            int i4 = read + 113;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return slotTreeKtextractFromLegacyFieldsinlinedsortedBy1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final mapTreeWithStitching message;
    public final String scannedCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$AlreadyScanned$Companion] */
    static {
        int i = IconCompatParcelizer + 11;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ SourceContext(int i, mapTreeWithStitching maptreewithstitching, String str) {
        if (3 == (i & 3)) {
            this.message = maptreewithstitching;
            this.scannedCode = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, SlotTreeKtextractFromLegacyFieldsinlinedsortedBy1.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.scannedCode.hashCode() << (this.message.hashCode() + 123);
        }
        return (this.message.hashCode() * 31) + this.scannedCode.hashCode();
    }

    public SourceContext(mapTreeWithStitching maptreewithstitching, String str) {
        maptreewithstitching.getClass();
        str.getClass();
        this.message = maptreewithstitching;
        this.scannedCode = str;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AlreadyScanned(message=" + this.message + ", scannedCode=" + this.scannedCode + ")";
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceContext)) {
            return false;
        }
        SourceContext sourceContext = (SourceContext) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, sourceContext.message}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scannedCode, sourceContext.scannedCode}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = write + 47;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 == 0;
        }
        int i3 = read + 77;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
