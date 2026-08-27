package o;

import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class addNotificationForSysPropsChangelambda0010 {
    public final AndroidComposeViewdispatchKeyEvent1 read;
    public final String serializer;
    public final removeNotificationForSysPropsChange write;

    public addNotificationForSysPropsChangelambda0010(String str, AndroidComposeViewdispatchKeyEvent1 androidComposeViewdispatchKeyEvent1, removeNotificationForSysPropsChange removenotificationforsyspropschange) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        androidComposeViewdispatchKeyEvent1.getClass();
        this.serializer = str;
        this.read = androidComposeViewdispatchKeyEvent1;
        this.write = removenotificationforsyspropschange;
    }

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iM = af$$ExternalSyntheticOutline0.m((((Build.MODEL.hashCode() + (iHashCode * 31)) * 31) + 48517563) * 31, 31, Build.VERSION.RELEASE);
        return this.write.hashCode() + ((this.read.hashCode() + iM) * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addNotificationForSysPropsChangelambda0010)) {
            return false;
        }
        addNotificationForSysPropsChangelambda0010 addnotificationforsyspropschangelambda0010 = (addNotificationForSysPropsChangelambda0010) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, addnotificationforsyspropschangelambda0010.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        String str = Build.MODEL;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, str2}, getCieXyz.write())).booleanValue() && this.read == addnotificationforsyspropschangelambda0010.read && this.write.equals(addnotificationforsyspropschangelambda0010.write);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.serializer + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.4, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + this.read + ", androidAppInfo=" + this.write + ')';
    }
}
