package io.sentry.android.core;

import android.app.ApplicationStartInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import androidx.core.app.FrameMetricsAggregator;
import com.squareup.moshi.JsonDataException;
import io.sentry.SentryOptions;
import io.sentry.SentryUUID;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import o.logHtmlClicklambda0;
import o.openUriWithActionViewFromPush;
import o.performDismissTeardownlambda0;
import o.r8lambda3v1_HwIrQm7t2XqroC_y0Y5JPxM;
import o.r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityLifecycleIntegration$$ExternalSyntheticLambda1 implements r8lambda3v1_HwIrQm7t2XqroC_y0Y5JPxM, io.sentry.util.MediaSessionCompatQueueItem, r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y {
    private static byte IconCompatParcelizer = -112;
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    @Override // o.r8lambdaJPvm7ZRd1Lj4xMBdTc04D7x6Y
    public void RemoteActionCompatParcelizer(logHtmlClicklambda0 loghtmlclicklambda0) {
    }

    @Override // o.r8lambda3v1_HwIrQm7t2XqroC_y0Y5JPxM
    public Object read() {
        return null;
    }

    public /* synthetic */ ActivityLifecycleIntegration$$ExternalSyntheticLambda1(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5 + obj6 + obj7);
    }

    @Override // io.sentry.util.MediaSessionCompatQueueItem
    public Object evaluate() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 10) {
            return SentryOptions.empty();
        }
        long j = 0;
        if (i == 24) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (io.sentry.clientreport.read readVar : io.sentry.clientreport.read.values()) {
                for (openUriWithActionViewFromPush openuriwithactionviewfrompush : openUriWithActionViewFromPush.values()) {
                    concurrentHashMap.put(new io.sentry.clientreport.serializer(readVar.getReason(), openuriwithactionviewfrompush.getCategory()), new AtomicLong(0L));
                }
            }
            return Collections.unmodifiableMap(concurrentHashMap);
        }
        if (i == 20) {
            try {
                return Build.MODEL.split(" ", -1)[0];
            } catch (Throwable unused) {
                r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG;
                return null;
            }
        }
        if (i == 21) {
            return new Timer(true);
        }
        switch (i) {
            case 12:
                return new performDismissTeardownlambda0();
            case 13:
                byte[] bArr = new byte[8];
                io.sentry.util.MediaSessionCompatToken.read().IconCompatParcelizer(bArr);
                byte b = (byte) (bArr[6] & 15);
                bArr[6] = b;
                bArr[6] = (byte) (b | 64);
                for (int i2 = 0; i2 < 8; i2++) {
                    j = (j << 8) | ((long) (bArr[i2] & 255));
                }
                char[] cArr = new char[16];
                io.sentry.util.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read(cArr, j);
                return new String(cArr);
            case 14:
                return new FrameMetricsAggregator();
            default:
                return SentryUUID.IconCompatParcelizer();
        }
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public static /* synthetic */ void write(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void serializer(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void read(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* bridge */ /* synthetic */ ApplicationStartInfo ck_(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void IconCompatParcelizer(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void write(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void serializer(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new JsonDataException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:12:0x0026, B:16:0x0039, B:18:0x003d, B:19:0x0042, B:20:0x004f, B:22:0x0052, B:25:0x0068), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:12:0x0026, B:16:0x0039, B:18:0x003d, B:19:0x0042, B:20:0x004f, B:22:0x0052, B:25:0x0068), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:12:0x0026, B:16:0x0039, B:18:0x003d, B:19:0x0042, B:20:0x004f, B:22:0x0052, B:25:0x0068), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x004f A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:12:0x0026, B:16:0x0039, B:18:0x003d, B:19:0x0042, B:20:0x004f, B:22:0x0052, B:25:0x0068), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:12:0x0026, B:16:0x0039, B:18:0x003d, B:19:0x0042, B:20:0x004f, B:22:0x0052, B:25:0x0068), top: B:43:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public Object serializer(Context context) {
        String string;
        int i;
        ApplicationInfo applicationInfo;
        int i2;
        int i3;
        CharSequence charSequence;
        int i4 = 2 % 2;
        int i5 = read + 21;
        write = i5 % Fields.SpotShadowColor;
        Object obj = null;
        if (i5 % 2 != 0) {
            switch (this.RemoteActionCompatParcelizer) {
                case 15:
                    return _init_lambda3.write(context);
                case 16:
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                case 17:
                    applicationInfo = context.getApplicationInfo();
                    i2 = applicationInfo.labelRes;
                    if (i2 == 0) {
                        i3 = read + 119;
                        write = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            CharSequence charSequence2 = applicationInfo.nonLocalizedLabel;
                            throw null;
                        }
                        charSequence = applicationInfo.nonLocalizedLabel;
                        if (charSequence != null) {
                            string = charSequence.toString();
                        } else {
                            string = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                        }
                    } else {
                        string = context.getString(i2);
                        if (string.startsWith("%('")) {
                            int i6 = read + 11;
                            write = i6 % Fields.SpotShadowColor;
                            int i7 = i6 % 2;
                            Object[] objArr = new Object[1];
                            a(string.substring(3), objArr);
                            string = ((String) objArr[0]).intern();
                        }
                    }
                    i = write + 47;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        return string;
                    }
                    obj.hashCode();
                    throw null;
                case 18:
                    return _init_lambda3.IconCompatParcelizer(context);
                default:
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor);
            }
        }
        int i8 = 70 / 0;
        switch (this.RemoteActionCompatParcelizer) {
            case 15:
                return _init_lambda3.write(context);
            case 16:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused) {
                    return null;
                }
            case 17:
                try {
                    applicationInfo = context.getApplicationInfo();
                    i2 = applicationInfo.labelRes;
                    if (i2 == 0) {
                        i3 = read + 119;
                        write = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            CharSequence charSequence3 = applicationInfo.nonLocalizedLabel;
                            throw null;
                        }
                        charSequence = applicationInfo.nonLocalizedLabel;
                        if (charSequence != null) {
                            string = charSequence.toString();
                        } else {
                            string = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                        }
                    } else {
                        string = context.getString(i2);
                        if (string.startsWith("%('")) {
                            int i9 = read + 11;
                            write = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            Object[] objArr2 = new Object[1];
                            a(string.substring(3), objArr2);
                            string = ((String) objArr2[0]).intern();
                        }
                    }
                } catch (Throwable unused2) {
                    string = null;
                }
                i = write + 47;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            case 18:
                return _init_lambda3.IconCompatParcelizer(context);
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor);
                } catch (Throwable unused3) {
                    return null;
                }
        }
    }
}
