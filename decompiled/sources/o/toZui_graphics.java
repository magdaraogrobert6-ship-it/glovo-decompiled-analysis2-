package o;

import android.util.Log;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class toZui_graphics {
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public String read;
    public String serializer;

    public toZui_graphics(String str, String str2) {
        accessgetSystemNavigationDowncp.serializer(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.serializer = str;
        this.read = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public void RemoteActionCompatParcelizer(String str, String str2, Exception exc) {
        if (Log.isLoggable(this.serializer, 6)) {
            SentryLogcatAdapter.read(str, read(str2), exc);
        }
    }

    public boolean equals(Object obj) {
        FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        if (this.IconCompatParcelizer != 0) {
            return super.equals(obj);
        }
        return (obj instanceof FocusOwnerImplmoveFocusfocusSearchSuccess1) && ((obj2 = (focusOwnerImplmoveFocusfocusSearchSuccess1 = (FocusOwnerImplmoveFocusfocusSearchSuccess1) obj).IconCompatParcelizer) == (str = this.serializer) || obj2.equals(str)) && ((obj3 = focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer) == (str2 = this.read) || (obj3 != null && obj3.equals(str2)));
    }

    public int hashCode() {
        if (this.IconCompatParcelizer != 0) {
            return super.hashCode();
        }
        String str = this.serializer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String read(String str) {
        String str2 = this.read;
        return str2 == null ? str : str2.concat(str);
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        return "Pair{" + ((Object) this.serializer) + " " + ((Object) this.read) + "}";
    }

    public /* synthetic */ toZui_graphics() {
    }
}
