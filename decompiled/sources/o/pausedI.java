package o;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.recentdeliveries.data.model.DeliveryLocation$Companion;
import kotlinx.serialization.Serializable;
import o.launchThirdPartySharingSettingsChangedListenerI;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@SuppressLint
public final class pausedI {
    public static final DeliveryLocation$Companion Companion = new Object() { // from class: com.roadrunner.recentdeliveries.data.model.DeliveryLocation$Companion
        private static int serializer = 1;
        private static int write;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 15;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                launchThirdPartySharingSettingsChangedListenerI launchthirdpartysharingsettingschangedlisteneri = launchThirdPartySharingSettingsChangedListenerI.read;
                throw null;
            }
            launchThirdPartySharingSettingsChangedListenerI launchthirdpartysharingsettingschangedlisteneri2 = launchThirdPartySharingSettingsChangedListenerI.read;
            int i3 = write + 67;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return launchthirdpartysharingsettingschangedlisteneri2;
            }
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public final String address;
    public final double latitude;
    public final double longitude;
    public final String name;
    public final processDeeplinkI phoneNumber;
    public final String specialInstructions;
    public final String specialInstructionsLink;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.recentdeliveries.data.model.DeliveryLocation$Companion] */
    static {
        int i = read + 103;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public /* synthetic */ pausedI(int i, String str, String str2, String str3, String str4, processDeeplinkI processdeeplinki, double d, double d2) {
        int i2;
        if (99 != (i & 99)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 99, launchThirdPartySharingSettingsChangedListenerI.read.getDescriptor());
            throw null;
        }
        this.name = str;
        this.address = str2;
        if ((i & 4) == 0) {
            this.specialInstructions = null;
            int i3 = write + 43;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
            }
            if ((i & 8) == 0) {
                this.specialInstructionsLink = null;
                i2 = write + 25;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                }
                if ((i & 16) == 0) {
                    this.phoneNumber = null;
                } else {
                    this.phoneNumber = processdeeplinki;
                    int i4 = 2 % 2;
                }
                this.latitude = d;
                this.longitude = d2;
            }
            this.specialInstructionsLink = str4;
            int i5 = 2 % 2;
            if ((i & 16) == 0) {
                this.phoneNumber = null;
            } else {
                this.phoneNumber = processdeeplinki;
                int i6 = 2 % 2;
            }
            this.latitude = d;
            this.longitude = d2;
        }
        this.specialInstructions = str3;
        int i7 = 2 % 2;
        if ((i & 8) == 0) {
            this.specialInstructionsLink = null;
            i2 = write + 25;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
            }
            if ((i & 16) == 0) {
                this.phoneNumber = null;
            } else {
                this.phoneNumber = processdeeplinki;
                int i8 = 2 % 2;
            }
            this.latitude = d;
            this.longitude = d2;
        }
        this.specialInstructionsLink = str4;
        int i9 = 2 % 2;
        if ((i & 16) == 0) {
            this.phoneNumber = null;
        } else {
            this.phoneNumber = processdeeplinki;
            int i10 = 2 % 2;
        }
        this.latitude = d;
        this.longitude = d2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DeliveryLocation(name=", this.name, ", address=", this.address, ", specialInstructions=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.specialInstructions, ", specialInstructionsLink=", this.specialInstructionsLink, ", phoneNumber=");
        sbM.append(this.phoneNumber);
        sbM.append(", latitude=");
        sbM.append(this.latitude);
        sbM.append(", longitude=");
        sbM.append(this.longitude);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 87;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.address);
        String str = this.specialInstructions;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.specialInstructionsLink;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        processDeeplinkI processdeeplinki = this.phoneNumber;
        if (processdeeplinki == null) {
            i = write + 11;
            IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            iHashCode = processdeeplinki.hashCode();
            i = IconCompatParcelizer + 123;
            write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        int i3 = i % 2;
        return Double.hashCode(this.longitude) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.latitude, (((((iM + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31, 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pausedI)) {
            return false;
        }
        pausedI pausedi = (pausedI) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, pausedi.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, pausedi.address}, getCieXyz.write())).booleanValue()) {
            int i3 = IconCompatParcelizer + 29;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 75 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.specialInstructions, pausedi.specialInstructions}, getCieXyz.write())).booleanValue()) {
            int i5 = write + 105;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.specialInstructionsLink, pausedi.specialInstructionsLink}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, pausedi.phoneNumber}, getCieXyz.write())).booleanValue()) {
            return Double.compare(this.latitude, pausedi.latitude) == 0 && Double.compare(this.longitude, pausedi.longitude) == 0;
        }
        int i6 = IconCompatParcelizer + 77;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i6 % 2 != 0;
    }
}
