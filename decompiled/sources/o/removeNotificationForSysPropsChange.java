package o;

import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class removeNotificationForSysPropsChange {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final String serializer;
    public final AndroidComposeViewgetFocusedRect1 write;

    public removeNotificationForSysPropsChange(String str, String str2, String str3, AndroidComposeViewgetFocusedRect1 androidComposeViewgetFocusedRect1, ArrayList arrayList) {
        af$$ExternalSyntheticOutline0.m3978m(str2, str3, Build.MANUFACTURER);
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = androidComposeViewgetFocusedRect1;
        this.read = arrayList;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.serializer), 31, this.RemoteActionCompatParcelizer), 31, Build.MANUFACTURER);
        return this.read.hashCode() + ((this.write.hashCode() + iM) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeNotificationForSysPropsChange)) {
            return false;
        }
        removeNotificationForSysPropsChange removenotificationforsyspropschange = (removeNotificationForSysPropsChange) obj;
        if (!this.IconCompatParcelizer.equals(removenotificationforsyspropschange.IconCompatParcelizer)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, removenotificationforsyspropschange.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, removenotificationforsyspropschange.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str}, getCieXyz.write())).booleanValue() && this.write.equals(removenotificationforsyspropschange.write) && this.read.equals(removenotificationforsyspropschange.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", versionName=");
        sb.append(this.serializer);
        sb.append(", appBuildVersion=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", deviceManufacturer=");
        sb.append(Build.MANUFACTURER);
        sb.append(", currentProcessDetails=");
        sb.append(this.write);
        sb.append(", appProcessDetails=");
        return af$$ExternalSyntheticOutline1.m(sb, this.read, ')');
    }
}
