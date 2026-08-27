package o;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$CodeSuccess$Companion;
import kotlinx.serialization.Serializable;
import o.SourceInformationContext;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getPackageHash extends invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 {
    public static final MultipleCodeScanTaskUiItem$ScanState$CodeSuccess$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$CodeSuccess$Companion
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 57;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SourceInformationContext sourceInformationContext = SourceInformationContext.read;
            int i4 = serializer + 95;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return sourceInformationContext;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    public final mapTreeWithStitching message;
    public final String scannedCode;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$ScanState$CodeSuccess$Companion] */
    static {
        int i = write + 85;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getPackageHash(int i, mapTreeWithStitching maptreewithstitching, String str) {
        if (3 == (i & 3)) {
            this.message = maptreewithstitching;
            this.scannedCode = str;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, SourceInformationContext.read.getDescriptor());
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.scannedCode.hashCode() >> (this.message.hashCode() >>> 115);
        } else {
            iHashCode = (this.message.hashCode() * 31) + this.scannedCode.hashCode();
        }
        int i3 = serializer + 15;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public getPackageHash(mapTreeWithStitching maptreewithstitching, String str) {
        maptreewithstitching.getClass();
        str.getClass();
        this.message = maptreewithstitching;
        this.scannedCode = str;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CodeSuccess(message=" + this.message + ", scannedCode=" + this.scannedCode + ")";
        int i2 = serializer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
        if (!(obj instanceof getPackageHash)) {
            return false;
        }
        getPackageHash getpackagehash = (getPackageHash) obj;
        Object[] objArr = {this.message, getpackagehash.message};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.scannedCode, getpackagehash.scannedCode};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                int i2 = RemoteActionCompatParcelizer + 13;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = RemoteActionCompatParcelizer + 71;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 95;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        int i8 = serializer + 121;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
