package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$Companion;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.mapTreeWithStitchingdefault;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class sourceInformationContextOf implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final MultipleCodeScanTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 17;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            mapTreeWithStitchingdefault maptreewithstitchingdefault = mapTreeWithStitchingdefault.read;
            int i4 = IconCompatParcelizer + 15;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return maptreewithstitchingdefault;
        }
    };
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final SlotTreeKtExternalSyntheticLambda0 codeScanScreenUiItem;
    public final String description;
    public final boolean isOptional;
    public final boolean isSuccess;
    public final ComposeAnimationState scanCodesButton;
    public final Set scannedCodes;
    public final String taskId;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(18)), null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(19))};
        int i = RemoteActionCompatParcelizer + 61;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 51 / 0;
        }
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            str = this.taskId;
            int i4 = 75 / 0;
        } else {
            str = this.taskId;
        }
        int i5 = i3 + 31;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Set RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Set set = this.scannedCodes;
        int i5 = i2 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return set;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        boolean z = this.isOptional;
        int i5 = i3 + 103;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return z;
    }

    public final boolean serializer() {
        boolean z;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 99;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            z = this.isSuccess;
            int i4 = 23 / 0;
        } else {
            z = this.isSuccess;
        }
        int i5 = i2 + 11;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ sourceInformationContextOf(int i, String str, boolean z, String str2, String str3, boolean z2, Set set, ComposeAnimationState composeAnimationState, SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0, List list) {
        if (511 == (i & 511)) {
            this.taskId = str;
            this.isOptional = z;
            this.title = str2;
            this.description = str3;
            this.isSuccess = z2;
            this.scannedCodes = set;
            this.scanCodesButton = composeAnimationState;
            this.codeScanScreenUiItem = slotTreeKtExternalSyntheticLambda0;
            this.trackingEvents = list;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 511, mapTreeWithStitchingdefault.read.getDescriptor());
        throw null;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        if (!this.isOptional) {
            int i2 = serializer + 7;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (!this.isSuccess) {
                return false;
            }
        }
        int i4 = read + 123;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public sourceInformationContextOf(String str, boolean z, String str2, String str3, boolean z2, Set set, ComposeAnimationState composeAnimationState, SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.taskId = str;
        this.isOptional = z;
        this.title = str2;
        this.description = str3;
        this.isSuccess = z2;
        this.scannedCodes = set;
        this.scanCodesButton = composeAnimationState;
        this.codeScanScreenUiItem = slotTreeKtExternalSyntheticLambda0;
        this.trackingEvents = list;
    }

    public static sourceInformationContextOf RemoteActionCompatParcelizer(sourceInformationContextOf sourceinformationcontextof, boolean z, Set set) {
        int i = 2 % 2;
        String str = sourceinformationcontextof.taskId;
        boolean z2 = sourceinformationcontextof.isOptional;
        String str2 = sourceinformationcontextof.title;
        String str3 = sourceinformationcontextof.description;
        ComposeAnimationState composeAnimationState = sourceinformationcontextof.scanCodesButton;
        SlotTreeKtExternalSyntheticLambda0 slotTreeKtExternalSyntheticLambda0 = sourceinformationcontextof.codeScanScreenUiItem;
        List list = sourceinformationcontextof.trackingEvents;
        sourceinformationcontextof.getClass();
        str.getClass();
        str2.getClass();
        set.getClass();
        composeAnimationState.getClass();
        slotTreeKtExternalSyntheticLambda0.getClass();
        list.getClass();
        sourceInformationContextOf sourceinformationcontextof2 = new sourceInformationContextOf(str, z2, str2, str3, z, set, composeAnimationState, slotTreeKtExternalSyntheticLambda0, list);
        int i2 = serializer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return sourceinformationcontextof2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.isOptional), 31, this.title);
        String str = this.description;
        if (str == null) {
            int i4 = serializer + 59;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.isSuccess);
        int iHashCode2 = this.scannedCodes.hashCode();
        int iHashCode3 = this.scanCodesButton.hashCode();
        return this.trackingEvents.hashCode() + ((this.codeScanScreenUiItem.hashCode() + ((iHashCode3 + ((iHashCode2 + iM2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("MultipleCodeScanTaskUiItem(taskId=", this.taskId, ", isOptional=", ", title=", this.isOptional);
        c8$$ExternalSyntheticOutline0.m(sbM, this.title, ", description=", this.description, ", isSuccess=");
        sbM.append(this.isSuccess);
        sbM.append(", scannedCodes=");
        sbM.append(this.scannedCodes);
        sbM.append(", scanCodesButton=");
        sbM.append(this.scanCodesButton);
        sbM.append(", codeScanScreenUiItem=");
        sbM.append(this.codeScanScreenUiItem);
        sbM.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.trackingEvents, ")");
        int i4 = serializer + 25;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sourceInformationContextOf)) {
            return false;
        }
        sourceInformationContextOf sourceinformationcontextof = (sourceInformationContextOf) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, sourceinformationcontextof.taskId}, getCieXyz.write())).booleanValue() || this.isOptional != sourceinformationcontextof.isOptional) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, sourceinformationcontextof.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, sourceinformationcontextof.description}, getCieXyz.write())).booleanValue() || this.isSuccess != sourceinformationcontextof.isSuccess) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scannedCodes, sourceinformationcontextof.scannedCodes}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.scanCodesButton, sourceinformationcontextof.scanCodesButton}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.codeScanScreenUiItem, sourceinformationcontextof.codeScanScreenUiItem}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, sourceinformationcontextof.trackingEvents}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = serializer + 51;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = read + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
