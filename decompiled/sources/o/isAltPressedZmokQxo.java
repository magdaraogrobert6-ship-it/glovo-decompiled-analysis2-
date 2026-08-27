package o;

import android.content.Context;
import android.net.Uri;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class isAltPressedZmokQxo {
    public static final AtomicInteger IconCompatParcelizer;
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static volatile KeyEventType write;
    public volatile Object MediaBrowserCompatMediaItem;
    public volatile int MediaDescriptionCompat = -1;
    public final String MediaSessionCompatQueueItem;
    public final Object RatingCompat;
    public final /* synthetic */ int read;
    public final truncslo4al4 serializer;

    static {
        new AtomicReference();
        IconCompatParcelizer = new AtomicInteger();
    }

    public /* synthetic */ isAltPressedZmokQxo(truncslo4al4 truncslo4al4Var, String str, Object obj, int i) {
        this.read = i;
        if (((Uri) truncslo4al4Var.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.serializer = truncslo4al4Var;
        this.MediaSessionCompatQueueItem = str;
        this.RatingCompat = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[PHI: r2
  0x0037: PHI (r2v1 o.DelegatableNode_androidKt) = (r2v0 o.DelegatableNode_androidKt), (r2v5 o.DelegatableNode_androidKt) binds: [B:8:0x0014, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    public final Object read() {
        String strSerializer;
        Object obj;
        String strWrite;
        int i = IconCompatParcelizer.get();
        if (this.MediaDescriptionCompat < i) {
            synchronized (this) {
                if (this.MediaDescriptionCompat < i) {
                    KeyEventType keyEventType = write;
                    DelegatableNode_androidKt delegatableNode_androidKt = visitChildrenYYKmho.read;
                    Object obj2 = null;
                    if (keyEventType != null) {
                        delegatableNode_androidKt = (DelegatableNode_androidKt) keyEventType.RemoteActionCompatParcelizer.B_();
                        if (delegatableNode_androidKt.IconCompatParcelizer()) {
                            strSerializer = ((getUnknownCS__XNY) delegatableNode_androidKt.read()).serializer((Uri) this.serializer.IconCompatParcelizer, this.MediaSessionCompatQueueItem);
                        } else {
                            strSerializer = null;
                        }
                    } else {
                        strSerializer = null;
                    }
                    TextStreamsKt.RemoteActionCompatParcelizer("Must call PhenotypeFlagInitializer.maybeInit() first", keyEventType != null);
                    truncslo4al4 truncslo4al4Var = this.serializer;
                    Uri uri = (Uri) truncslo4al4Var.IconCompatParcelizer;
                    if (uri == null) {
                        Context context = keyEventType.IconCompatParcelizer;
                        throw null;
                    }
                    getKeyUpCS__XNY getkeyupcs__xnySerializer = getKeyDownCS__XNY.read(keyEventType.IconCompatParcelizer, uri) ? getKeyUpCS__XNY.serializer(keyEventType.IconCompatParcelizer.getContentResolver(), uri, accessgetPastecp.serializer) : null;
                    if (getkeyupcs__xnySerializer != null) {
                        String str = (String) getkeyupcs__xnySerializer.serializer().get(this.MediaSessionCompatQueueItem);
                        if (str != null) {
                            obj = read(str);
                        } else {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        if (!truncslo4al4Var.read && (strWrite = ut.IconCompatParcelizer(keyEventType.IconCompatParcelizer).write(this.MediaSessionCompatQueueItem)) != null) {
                            obj2 = read(strWrite);
                        }
                        obj = obj2 == null ? this.RatingCompat : obj2;
                    }
                    if (delegatableNode_androidKt.IconCompatParcelizer()) {
                        obj = strSerializer == null ? this.RatingCompat : read(strSerializer);
                    }
                    this.MediaBrowserCompatMediaItem = obj;
                    this.MediaDescriptionCompat = i;
                }
            }
        }
        return this.MediaBrowserCompatMediaItem;
    }

    public final Object read(Object obj) {
        int i = this.read;
        String str = this.MediaSessionCompatQueueItem;
        if (i == 0) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
            if (obj instanceof String) {
                try {
                    return Long.valueOf(Long.parseLong((String) obj));
                } catch (NumberFormatException unused) {
                }
            }
            String string = obj.toString();
            SentryLogcatAdapter.serializer("PhenotypeFlag", ff$$ExternalSyntheticOutline0.m(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
            return null;
        }
        if (i == 1) {
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (accessgetKeyDowncp.IconCompatParcelizer.matcher(str2).matches()) {
                    return Boolean.TRUE;
                }
                if (accessgetKeyDowncp.read.matcher(str2).matches()) {
                    return Boolean.FALSE;
                }
            }
            String string2 = obj.toString();
            SentryLogcatAdapter.serializer("PhenotypeFlag", ff$$ExternalSyntheticOutline0.m(new StringBuilder(str.length() + 28 + string2.length()), "Invalid boolean value for ", str, ": ", string2));
            return null;
        }
        if (i != 2) {
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused2) {
            }
        }
        String string3 = obj.toString();
        SentryLogcatAdapter.serializer("PhenotypeFlag", ff$$ExternalSyntheticOutline0.m(new StringBuilder(str.length() + 27 + string3.length()), "Invalid double value for ", str, ": ", string3));
        return null;
    }
}
