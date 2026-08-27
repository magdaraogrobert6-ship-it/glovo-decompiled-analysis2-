package o;

import android.os.Build;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MeasureAndLayoutDelegateKt {
    public final boolean RemoteActionCompatParcelizer;

    public MeasureAndLayoutDelegateKt(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null osRelease");
            throw null;
        }
        if (str2 != null) {
            this.RemoteActionCompatParcelizer = z;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null osCodeName");
            throw null;
        }
    }

    public final int hashCode() {
        int iHashCode = Build.VERSION.RELEASE.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003) ^ (this.RemoteActionCompatParcelizer ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeasureAndLayoutDelegateKt)) {
            return false;
        }
        MeasureAndLayoutDelegateKt measureAndLayoutDelegateKt = (MeasureAndLayoutDelegateKt) obj;
        String str = Build.VERSION.RELEASE;
        if (!str.equals(str)) {
            return false;
        }
        String str2 = Build.VERSION.CODENAME;
        return str2.equals(str2) && this.RemoteActionCompatParcelizer == measureAndLayoutDelegateKt.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", osCodeName=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(", isRooted=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "}");
    }
}
