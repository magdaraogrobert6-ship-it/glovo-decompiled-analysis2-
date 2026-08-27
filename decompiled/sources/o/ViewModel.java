package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.NestAutoAcceptComponent$SubComponent$Preferences$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ViewModel extends onActivityPrePaused {
    public static final NestAutoAcceptComponent$SubComponent$Preferences$Companion Companion = new NestAutoAcceptComponent$SubComponent$Preferences$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public final String description;
    public final FlowExtKtcollectAsStateWithLifecycle1112 details;
    public final getCloseable dialogMessage;
    public final boolean isShiftEnding;
    public final AudioAttributesImpl pushMessage;
    public final String stateOffText;
    public final String stateOnText;
    public final String statePausedText;
    public final String title;
    public final String type;

    static {
        int i = read + 93;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    public ViewModel(int i, String str, String str2, boolean z, String str3, String str4, String str5, FlowExtKtcollectAsStateWithLifecycle1112 flowExtKtcollectAsStateWithLifecycle1112, AudioAttributesImpl audioAttributesImpl, getCloseable getcloseable, String str6) {
        if (1 != (i & 1)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, addCloseable.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        this.title = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.isShiftEnding = false;
        } else {
            this.isShiftEnding = z;
        }
        if ((i & 8) == 0) {
            this.stateOnText = null;
            int i2 = serializer + 53;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 4 % 3;
            } else {
                int i4 = 2 % 2;
            }
        } else {
            this.stateOnText = str3;
            int i5 = serializer + 53;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            } else {
                int i7 = 2 % 2;
            }
        }
        if ((i & 16) == 0) {
            this.stateOffText = null;
        } else {
            this.stateOffText = str4;
        }
        if ((i & 32) == 0) {
            int i8 = serializer + 71;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            this.statePausedText = null;
        } else {
            this.statePausedText = str5;
            int i10 = 2 % 2;
        }
        if ((i & 64) == 0) {
            this.details = null;
        } else {
            this.details = flowExtKtcollectAsStateWithLifecycle1112;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.pushMessage = null;
        } else {
            this.pushMessage = audioAttributesImpl;
            int i11 = RemoteActionCompatParcelizer + 97;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            int i14 = serializer + 23;
            RemoteActionCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                this.dialogMessage = null;
                int i15 = 88 / 0;
            } else {
                this.dialogMessage = null;
            }
        } else {
            this.dialogMessage = getcloseable;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.type = "preferences";
        } else {
            this.type = str6;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Preferences(title=", this.title, ", description=", this.description, ", isShiftEnding=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", stateOnText=", this.stateOnText, ", stateOffText=", sbM, this.isShiftEnding);
        c8$$ExternalSyntheticOutline0.m(sbM, this.stateOffText, ", statePausedText=", this.statePausedText, ", details=");
        sbM.append(this.details);
        sbM.append(", pushMessage=");
        sbM.append(this.pushMessage);
        sbM.append(", dialogMessage=");
        sbM.append(this.dialogMessage);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = serializer + 25;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026 A[PHI: r1 r3
  0x0026: PHI (r1v23 int) = (r1v5 int), (r1v25 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v7 java.lang.String) = (r3v0 java.lang.String), (r3v9 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v25 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.title.hashCode();
            str = this.description;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.title.hashCode();
            str = this.description;
            if (str == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        int iM = d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + iHashCode2) * 31, 31, this.isShiftEnding);
        String str2 = this.stateOnText;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.stateOffText;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.statePausedText;
        if (str4 == null) {
            int i3 = serializer + 25;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        FlowExtKtcollectAsStateWithLifecycle1112 flowExtKtcollectAsStateWithLifecycle1112 = this.details;
        int iHashCode6 = flowExtKtcollectAsStateWithLifecycle1112 == null ? 0 : flowExtKtcollectAsStateWithLifecycle1112.hashCode();
        AudioAttributesImpl audioAttributesImpl = this.pushMessage;
        int iHashCode7 = audioAttributesImpl == null ? 0 : audioAttributesImpl.hashCode();
        getCloseable getcloseable = this.dialogMessage;
        return ((((((((((iM + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (getcloseable != null ? getcloseable.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewModel) {
            ViewModel viewModel = (ViewModel) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, viewModel.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, viewModel.description}, getCieXyz.write())).booleanValue()) {
                if (this.isShiftEnding != viewModel.isShiftEnding) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stateOnText, viewModel.stateOnText}, getCieXyz.write())).booleanValue()) {
                    int i2 = serializer + 3;
                    RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stateOffText, viewModel.stateOffText}, getCieXyz.write())).booleanValue())) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.statePausedText, viewModel.statePausedText}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, viewModel.details}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pushMessage, viewModel.pushMessage}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dialogMessage, viewModel.dialogMessage}, getCieXyz.write())).booleanValue()) {
                                return true;
                            }
                            int i4 = RemoteActionCompatParcelizer + 59;
                            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            return i4 % 2 != 0;
                        }
                        int i5 = RemoteActionCompatParcelizer + 117;
                        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        return false;
                    }
                    int i7 = serializer + 99;
                    RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i7 % 2 == 0;
                }
                int i8 = serializer + 27;
                RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return false;
            }
            int i10 = RemoteActionCompatParcelizer + 105;
            serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = RemoteActionCompatParcelizer + 115;
        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i12 % 2 != 0;
    }
}
