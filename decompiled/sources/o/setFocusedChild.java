package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.StateV3$AcceptData$DeclineConfirmationV2$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.FocusGroupPropertiesNodeonEnter1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setFocusedChild {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final List acceptDetails;
    public final String acceptanceRateAfterDecline;
    public final String actionAccept;
    public final String actionConfirm;
    public final int currentAcceptanceRate;
    public final FocusTargetInteropElement declineDetails;
    public final int reducedDelta;
    public final String title;
    public static final StateV3$AcceptData$DeclineConfirmationV2$Companion Companion = new Object() { // from class: com.roadrunner.delivery.state.StateV3$AcceptData$DeclineConfirmationV2$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 19;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return FocusGroupPropertiesNodeonEnter1.write;
            }
            FocusGroupPropertiesNodeonEnter1 focusGroupPropertiesNodeonEnter1 = FocusGroupPropertiesNodeonEnter1.write;
            throw null;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new ComposableSingletonsAndroidDialog_androidKt(4))};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.state.StateV3$AcceptData$DeclineConfirmationV2$Companion] */
    static {
        int i = read + 87;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 85 / 0;
        }
    }

    public /* synthetic */ setFocusedChild(int i, String str, int i2, int i3, String str2, String str3, String str4, FocusTargetInteropElement focusTargetInteropElement, List list) {
        if (247 == (i & 247)) {
            this.title = str;
            this.currentAcceptanceRate = i2;
            this.reducedDelta = i3;
            if ((i & 8) == 0) {
                this.acceptanceRateAfterDecline = null;
            } else {
                this.acceptanceRateAfterDecline = str2;
                int i4 = IconCompatParcelizer + 79;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 3;
                } else {
                    int i6 = 2 % 2;
                }
            }
            this.actionConfirm = str3;
            this.actionAccept = str4;
            this.declineDetails = focusTargetInteropElement;
            this.acceptDetails = list;
            int i7 = IconCompatParcelizer + 1;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 247, FocusGroupPropertiesNodeonEnter1.write.getDescriptor());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x004f A[PHI: r1 r3
  0x004f: PHI (r1v18 int) = (r1v8 int), (r1v23 int) binds: [B:8:0x0042, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r3v10 java.lang.String) = (r3v2 java.lang.String), (r3v13 java.lang.String) binds: [B:8:0x0042, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0044 A[PHI: r1
  0x0044: PHI (r1v9 int) = (r1v8 int), (r1v23 int) binds: [B:8:0x0042, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.reducedDelta, af$$ExternalSyntheticOutline0.m(this.currentAcceptanceRate, this.title.hashCode() >> 16, 127), 116);
            str = this.acceptanceRateAfterDecline;
            if (str == null) {
                int i3 = write + 29;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.reducedDelta, af$$ExternalSyntheticOutline0.m(this.currentAcceptanceRate, this.title.hashCode() * 31, 31), 31);
            str = this.acceptanceRateAfterDecline;
            if (str == null) {
                int i5 = write + 29;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + iHashCode) * 31, 31, this.actionConfirm), 31, this.actionAccept);
        return this.acceptDetails.hashCode() + ((this.declineDetails.hashCode() + iM2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("DeclineConfirmationV2(title=", this.currentAcceptanceRate, this.title, ", currentAcceptanceRate=", ", reducedDelta=");
        sbM.append(this.reducedDelta);
        sbM.append(", acceptanceRateAfterDecline=");
        sbM.append(this.acceptanceRateAfterDecline);
        sbM.append(", actionConfirm=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.actionConfirm, ", actionAccept=", this.actionAccept, ", declineDetails=");
        sbM.append(this.declineDetails);
        sbM.append(", acceptDetails=");
        sbM.append(this.acceptDetails);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 63;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        Object obj2 = null;
        if (this != obj) {
            if (obj instanceof setFocusedChild) {
                setFocusedChild setfocusedchild = (setFocusedChild) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, setfocusedchild.title}, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 23;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (this.currentAcceptanceRate != setfocusedchild.currentAcceptanceRate) {
                    int i3 = IconCompatParcelizer + 91;
                    write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return false;
                }
                if (this.reducedDelta != setfocusedchild.reducedDelta) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.acceptanceRateAfterDecline, setfocusedchild.acceptanceRateAfterDecline}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionConfirm, setfocusedchild.actionConfirm}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionAccept, setfocusedchild.actionAccept}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.declineDetails, setfocusedchild.declineDetails}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.acceptDetails, setfocusedchild.acceptDetails}, getCieXyz.write())).booleanValue();
            }
            int i5 = write + 117;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        int i6 = write + 61;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}
