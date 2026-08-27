package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.appmigration.model.PhaseVariant;
import com.roadrunner.appmigration.model.Popup$Companion;
import com.roadrunner.appmigration.model.UrgencyVariant;
import kotlinx.serialization.Serializable;
import o.getBoundsInWindow;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getBoundsInRoot {
    public static final Popup$Companion Companion = new Object() { // from class: com.roadrunner.appmigration.model.Popup$Companion
        private static int IconCompatParcelizer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 107;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return getBoundsInWindow.RemoteActionCompatParcelizer;
            }
            getBoundsInWindow getboundsinwindow = getBoundsInWindow.RemoteActionCompatParcelizer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final getMergingEnabled analytics;
    public final String body;
    public final String ctaButtonText;
    public final String ctaButtonTextAlternative;
    public final String ctaButtonUrl;
    public final String dismissButtonText;
    public final boolean dismissable;
    public final String header;
    public final String imageUrl;
    public final PhaseVariant phaseVariant;
    public final String termsAndConditionLabel;
    public final String termsAndConditionLinkText;
    public final String termsAndConditionUrl;
    public final String title;
    public final String urgencyMessage;
    public final UrgencyVariant urgencyVariant;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.appmigration.model.Popup$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getBoundsInRoot(int i, String str, String str2, String str3, String str4, String str5, PhaseVariant phaseVariant, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, UrgencyVariant urgencyVariant, String str12, getMergingEnabled getmergingenabled) {
        boolean z2;
        if (32799 != (i & 32799)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 32799, getBoundsInWindow.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.title = str;
        this.body = str2;
        this.ctaButtonText = str3;
        this.ctaButtonTextAlternative = str4;
        this.ctaButtonUrl = str5;
        if ((i & 32) == 0) {
            this.phaseVariant = PhaseVariant.PHASE_1;
        } else {
            this.phaseVariant = phaseVariant;
        }
        if ((i & 64) == 0) {
            this.imageUrl = null;
            int i2 = read + 17;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
        } else {
            this.imageUrl = str6;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.termsAndConditionLabel = null;
        } else {
            this.termsAndConditionLabel = str7;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.termsAndConditionLinkText = null;
        } else {
            this.termsAndConditionLinkText = str8;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.termsAndConditionUrl = null;
        } else {
            this.termsAndConditionUrl = str9;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            this.dismissButtonText = null;
            int i4 = 2 % 2;
        } else {
            this.dismissButtonText = str10;
        }
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            int i5 = write + 71;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this.dismissable = z2;
        int i7 = read + 103;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i8;
        int i9 = i7 % 2;
        if ((i & androidx.compose.ui.graphics.Fields.TransformOrigin) == 0) {
            this.header = null;
        } else {
            this.header = str11;
            int i10 = i8 + 73;
            read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        }
        if ((i & 8192) == 0) {
            this.urgencyVariant = null;
        } else {
            this.urgencyVariant = urgencyVariant;
            int i13 = i8 + 103;
            read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 2 % 2;
            }
        }
        if ((i & androidx.compose.ui.graphics.Fields.Clip) == 0) {
            int i15 = i8 + 25;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                this.urgencyMessage = null;
                throw null;
            }
            this.urgencyMessage = null;
        } else {
            this.urgencyMessage = str12;
        }
        int i16 = 2 % 2;
        this.analytics = getmergingenabled;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Popup(title=", this.title, ", body=", this.body, ", ctaButtonText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.ctaButtonText, ", ctaButtonTextAlternative=", this.ctaButtonTextAlternative, ", ctaButtonUrl=");
        sbM.append(this.ctaButtonUrl);
        sbM.append(", phaseVariant=");
        sbM.append(this.phaseVariant);
        sbM.append(", imageUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.imageUrl, ", termsAndConditionLabel=", this.termsAndConditionLabel, ", termsAndConditionLinkText=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.termsAndConditionLinkText, ", termsAndConditionUrl=", this.termsAndConditionUrl, ", dismissButtonText=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.dismissButtonText, ", dismissable=", ", header=", sbM, this.dismissable);
        sbM.append(this.header);
        sbM.append(", urgencyVariant=");
        sbM.append(this.urgencyVariant);
        sbM.append(", urgencyMessage=");
        sbM.append(this.urgencyMessage);
        sbM.append(", analytics=");
        sbM.append(this.analytics);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = read + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.ctaButtonText), 31, this.ctaButtonTextAlternative), 31, this.ctaButtonUrl);
        int iHashCode5 = this.phaseVariant.hashCode();
        String str = this.imageUrl;
        int iHashCode6 = 0;
        if (str == null) {
            int i2 = read + 71;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.termsAndConditionLabel;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.termsAndConditionLinkText;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.termsAndConditionUrl;
        if (str4 == null) {
            int i4 = write + 117;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.dismissButtonText;
        if (str5 == null) {
            int i6 = write + 73;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        int iM2 = d$$ExternalSyntheticOutline0.m((((((((((((iHashCode5 + iM) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31, 31, this.dismissable);
        String str6 = this.header;
        if (str6 == null) {
            int i8 = write + 19;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str6.hashCode();
        }
        UrgencyVariant urgencyVariant = this.urgencyVariant;
        int iHashCode9 = urgencyVariant == null ? 0 : urgencyVariant.hashCode();
        String str7 = this.urgencyMessage;
        if (str7 == null) {
            int i10 = write + 119;
            int i11 = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 109;
            write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            iHashCode6 = str7.hashCode();
        }
        return this.analytics.hashCode() + ((((((iM2 + iHashCode4) * 31) + iHashCode9) * 31) + iHashCode6) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getBoundsInRoot) {
            getBoundsInRoot getboundsinroot = (getBoundsInRoot) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getboundsinroot.title}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.body, getboundsinroot.body}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ctaButtonText, getboundsinroot.ctaButtonText}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ctaButtonTextAlternative, getboundsinroot.ctaButtonTextAlternative}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ctaButtonUrl, getboundsinroot.ctaButtonUrl}, getCieXyz.write())).booleanValue()) || this.phaseVariant != getboundsinroot.phaseVariant) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageUrl, getboundsinroot.imageUrl}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.termsAndConditionLabel, getboundsinroot.termsAndConditionLabel}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.termsAndConditionLinkText, getboundsinroot.termsAndConditionLinkText}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.termsAndConditionUrl, getboundsinroot.termsAndConditionUrl}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dismissButtonText, getboundsinroot.dismissButtonText}, getCieXyz.write())).booleanValue() || this.dismissable != getboundsinroot.dismissable) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.header, getboundsinroot.header}, getCieXyz.write())).booleanValue()) {
                        if (this.urgencyVariant != getboundsinroot.urgencyVariant) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.urgencyMessage, getboundsinroot.urgencyMessage}, getCieXyz.write())).booleanValue()) {
                            int i2 = write + 113;
                            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.analytics, getboundsinroot.analytics}, getCieXyz.write())).booleanValue();
                    }
                    int i4 = write + 121;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = read + 15;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = read + 77;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 != 0;
        }
        int i9 = write + 27;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }
}
