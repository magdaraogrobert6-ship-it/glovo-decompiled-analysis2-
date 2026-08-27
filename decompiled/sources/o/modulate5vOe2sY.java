package o;

import android.net.Uri;
import android.text.TextUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class modulate5vOe2sY implements eotfFunclambda0 {
    public int IconCompatParcelizer;
    public final URL MediaBrowserCompatMediaItem;
    public URL MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final obtainStrokePaint RemoteActionCompatParcelizer;
    public volatile byte[] serializer;
    public String write;

    public final String toString() {
        return read();
    }

    public modulate5vOe2sY(String str, obtainStrokePaint obtainstrokepaint) {
        this.MediaBrowserCompatMediaItem = null;
        if (TextUtils.isEmpty(str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must not be null or empty");
            throw null;
        }
        this.RatingCompat = str;
        UrlUtils.serializer(obtainstrokepaint, "Argument must not be null");
        this.RemoteActionCompatParcelizer = obtainstrokepaint;
    }

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        if (this.IconCompatParcelizer == 0) {
            int iHashCode = read().hashCode();
            this.IconCompatParcelizer = iHashCode;
            this.IconCompatParcelizer = this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31);
        }
        return this.IconCompatParcelizer;
    }

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        if (this.serializer == null) {
            this.serializer = read().getBytes(eotfFunclambda0.read);
        }
        messageDigest.update(this.serializer);
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (!(obj instanceof modulate5vOe2sY)) {
            return false;
        }
        modulate5vOe2sY modulate5voe2sy = (modulate5vOe2sY) obj;
        return read().equals(modulate5voe2sy.read()) && this.RemoteActionCompatParcelizer.equals(modulate5voe2sy.RemoteActionCompatParcelizer);
    }

    public final URL serializer() {
        if (this.MediaSessionCompatQueueItem == null) {
            if (TextUtils.isEmpty(this.write)) {
                String string = this.RatingCompat;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.MediaBrowserCompatMediaItem;
                    UrlUtils.serializer(url, "Argument must not be null");
                    string = url.toString();
                }
                this.write = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.MediaSessionCompatQueueItem = new URL(this.write);
        }
        return this.MediaSessionCompatQueueItem;
    }

    public final String read() {
        String str = this.RatingCompat;
        if (str != null) {
            return str;
        }
        URL url = this.MediaBrowserCompatMediaItem;
        UrlUtils.serializer(url, "Argument must not be null");
        return url.toString();
    }

    public modulate5vOe2sY(URL url) {
        drawArcyD3GUKo drawarcyd3guko = obtainStrokePaint.IconCompatParcelizer;
        UrlUtils.serializer(url, "Argument must not be null");
        this.MediaBrowserCompatMediaItem = url;
        this.RatingCompat = null;
        UrlUtils.serializer(drawarcyd3guko, "Argument must not be null");
        this.RemoteActionCompatParcelizer = drawarcyd3guko;
    }
}
