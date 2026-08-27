package o;

import bo.app.af$$ExternalSyntheticOutline1;
import java.time.ZoneId;
import kotlinx.datetime.InstantJvmKt;
import kotlinx.datetime.TimeZone$Companion;
import kotlinx.datetime.TimeZoneKt;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class r8lambdaZX2xA8csSBSphMPsG20ZD182Io {
    public static final r8lambdaUIhLPVVizcCVqsayrKMaGuMUUpU Companion = new r8lambdaUIhLPVVizcCVqsayrKMaGuMUUpU();
    public final float a;
    public final float b;
    public final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release c;
    public final setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release d;
    public final getGraphicModalMaxHeightDp e;
    public final Integer f;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.b, Float.hashCode(this.a) * 31, 31);
        int iHashCode = this.c.value.hashCode();
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release = this.d;
        return ((iHashCode + iM) * 31) + (setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release == null ? 0 : setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release.value.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaZX2xA8csSBSphMPsG20ZD182Io)) {
            return false;
        }
        r8lambdaZX2xA8csSBSphMPsG20ZD182Io r8lambdazx2xa8cssbsphmpsg20zd182io = (r8lambdaZX2xA8csSBSphMPsG20ZD182Io) obj;
        if (Float.compare(this.a, r8lambdazx2xa8cssbsphmpsg20zd182io.a) != 0 || Float.compare(this.b, r8lambdazx2xa8cssbsphmpsg20zd182io.b) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, r8lambdazx2xa8cssbsphmpsg20zd182io.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, r8lambdazx2xa8cssbsphmpsg20zd182io.d}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "Stationary(latitude=" + this.a + ", longitude=" + this.b + ", start=" + this.c + ", end=" + this.d + ')';
    }

    public r8lambdaZX2xA8csSBSphMPsG20ZD182Io(float f, float f2, setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2) {
        Integer numValueOf;
        this.a = f;
        this.b = f2;
        this.c = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release;
        this.d = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2;
        getGraphicModalMaxHeightDp.Companion.getClass();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        getGraphicModalMaxHeightDp getgraphicmodalmaxheightdpIconCompatParcelizer = TimeZone$Companion.IconCompatParcelizer(zoneIdSystemDefault);
        this.e = getgraphicmodalmaxheightdpIconCompatParcelizer;
        if (setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2 != null) {
            setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskippedSerializer = TimeZoneKt.serializer(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release, getgraphicmodalmaxheightdpIconCompatParcelizer);
            setShouldNextUnregisterBeSkipped setshouldnextunregisterbeskippedSerializer2 = TimeZoneKt.serializer(setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2, getgraphicmodalmaxheightdpIconCompatParcelizer);
            setCustomHtmlInAppMessageActionListener.Companion.getClass();
            numValueOf = Integer.valueOf((int) InstantJvmKt.IconCompatParcelizer(setshouldnextunregisterbeskippedSerializer, setshouldnextunregisterbeskippedSerializer2, setCustomHtmlInAppMessageActionListener.MINUTE, getgraphicmodalmaxheightdpIconCompatParcelizer));
        } else {
            numValueOf = null;
        }
        this.f = numValueOf;
    }
}
