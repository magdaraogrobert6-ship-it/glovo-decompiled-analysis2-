package o;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class getMinValueslo4al4 extends toRawBitsimpl {
    public final Pattern IconCompatParcelizer;

    @Override // o.toRawBitsimpl
    public final boolean write() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public getMinValueslo4al4() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.IconCompatParcelizer = Pattern.compile("\\A\\d+");
    }

    @Override // o.toRawBitsimpl
    public final boolean RemoteActionCompatParcelizer() {
        boolean zRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer();
        if (!zRemoteActionCompatParcelizer || Build.VERSION.SDK_INT >= 29) {
            return zRemoteActionCompatParcelizer;
        }
        int i = toShortimpl.IconCompatParcelizer;
        PackageInfo packageInfo = io.sentry.rrweb.read.read();
        if (packageInfo == null) {
            return false;
        }
        Matcher matcher = this.IconCompatParcelizer.matcher(packageInfo.versionName);
        return matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
