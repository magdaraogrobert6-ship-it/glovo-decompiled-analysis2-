package o;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzgs;

/* JADX INFO: loaded from: classes2.dex */
public final class getLookaheadDelegate extends Measurable {
    public long IconCompatParcelizer;
    public final zzgs MediaBrowserCompatMediaItem;
    public final zzgs MediaDescriptionCompat;
    public final zzgs MediaMetadataCompat;
    public final zzgs MediaSessionCompatQueueItem;
    public final zzgs MediaSessionCompatToken;
    public final zzgs PlaybackStateCompat;
    public final zzgs RatingCompat;
    public char RemoteActionCompatParcelizer;
    public String read;
    public final zzgs serializer;
    public final zzgs write;

    public final zzgs MediaMetadataCompat() {
        return this.MediaSessionCompatToken;
    }

    public final zzgs MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatQueueItem;
    }

    public final zzgs MediaSessionCompatResultReceiverWrapper() {
        return this.PlaybackStateCompat;
    }

    public final String ResultReceiver() {
        String str;
        synchronized (this) {
            if (this.read == null) {
                ((LookaheadScopeKtLookaheadScope221) ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).PlaybackStateCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
                this.read = "FA";
            }
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) this.read);
            str = this.read;
        }
        return str;
    }

    @Override // o.Measurable
    public final boolean read() {
        return false;
    }

    public final zzgs serializer() {
        return this.serializer;
    }

    public static String read(Object obj, boolean z) {
        String className;
        int iLastIndexOf;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, str, jRound, "...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof getLookaheadOffsetF1C5BW0) {
                return ((getLookaheadOffsetF1C5BW0) obj).serializer();
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = LookaheadScopeKtLookaheadScope221.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf2 = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf2);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public final void serializer(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(ResultReceiver(), i)) {
            Log.println(i, ResultReceiver(), RemoteActionCompatParcelizer(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaSessionCompatResultReceiverWrapper;
        if (lookaheadScopeKtLookaheadScope4 == null) {
            Log.println(6, ResultReceiver(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!lookaheadScopeKtLookaheadScope4.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) {
                Log.println(6, ResultReceiver(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            lookaheadScopeKtLookaheadScope4.write((Runnable) new LookaheadLayoutCoordinates(this, i, str, obj, obj2, obj3));
        }
    }

    public getLookaheadDelegate(LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221) {
        super(lookaheadScopeKtLookaheadScope221);
        this.RemoteActionCompatParcelizer = (char) 0;
        this.IconCompatParcelizer = -1L;
        this.serializer = new zzgs(this, 6, false, false);
        this.write = new zzgs(this, 6, true, false);
        this.MediaDescriptionCompat = new zzgs(this, 6, false, true);
        this.MediaSessionCompatQueueItem = new zzgs(this, 5, false, false);
        this.MediaBrowserCompatMediaItem = new zzgs(this, 5, true, false);
        this.RatingCompat = new zzgs(this, 5, false, true);
        this.MediaMetadataCompat = new zzgs(this, 4, false, false);
        this.MediaSessionCompatToken = new zzgs(this, 3, false, false);
        this.PlaybackStateCompat = new zzgs(this, 2, false, false);
    }

    public static String RemoteActionCompatParcelizer(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = read(obj, z);
        String str3 = read(obj2, z);
        String str4 = read(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str5 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str5 = ": ";
        }
        String str6 = ", ";
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str5);
            sb.append(str2);
            str5 = ", ";
        }
        if (TextUtils.isEmpty(str3)) {
            str6 = str5;
        } else {
            sb.append(str5);
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(str6);
            sb.append(str4);
        }
        return sb.toString();
    }

    public static getLookaheadOffsetF1C5BW0 RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        return new getLookaheadOffsetF1C5BW0(str);
    }
}
