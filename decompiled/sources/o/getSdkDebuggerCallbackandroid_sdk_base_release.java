package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class getSdkDebuggerCallbackandroid_sdk_base_release {
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final boolean serializer;
    public final LocalDate write;

    public final int hashCode() {
        return Boolean.hashCode(false) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.read), 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
    }

    public getSdkDebuggerCallbackandroid_sdk_base_release(LocalDate localDate, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.write = localDate;
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSdkDebuggerCallbackandroid_sdk_base_release)) {
            return false;
        }
        getSdkDebuggerCallbackandroid_sdk_base_release getsdkdebuggercallbackandroid_sdk_base_release = (getSdkDebuggerCallbackandroid_sdk_base_release) obj;
        if (!this.write.equals(getsdkdebuggercallbackandroid_sdk_base_release.write)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getsdkdebuggercallbackandroid_sdk_base_release.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.read.equals(getsdkdebuggercallbackandroid_sdk_base_release.read) && this.RemoteActionCompatParcelizer == getsdkdebuggercallbackandroid_sdk_base_release.RemoteActionCompatParcelizer && this.serializer == getsdkdebuggercallbackandroid_sdk_base_release.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateViewEntity(date=");
        sb.append(this.write);
        sb.append(", dayOfWeek=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", dayOfMonth=");
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(this.read, ", isActive=", ", isSelected=", sb, this.RemoteActionCompatParcelizer);
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ", showBadge=false)");
    }
}
