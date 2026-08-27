package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.SentryBaseEvent;
import java.util.ArrayList;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusOrderModifierKt {
    public static float[] RemoteActionCompatParcelizer(float[] fArr, int i) {
        if (i < 0) {
            DrawableTransformation.write();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static android.graphics.Path write(String str) {
        android.graphics.Path path = new android.graphics.Path();
        try {
            FocusOrderModifierDefaultImpls.IconCompatParcelizer(serializer(str), path);
            return path;
        } catch (RuntimeException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Error in parsing ".concat(str), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c A[PHI: r12
  0x008c: PHI (r12v3 int) = (r12v1 int), (r12v1 int), (r12v5 int) binds: [B:28:0x0074, B:31:0x007a, B:37:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[Catch: NumberFormatException -> 0x00b3, TryCatch #0 {NumberFormatException -> 0x00b3, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:43:0x0092, B:45:0x0098, B:48:0x00a7, B:50:0x00ac), top: B:66:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7 A[Catch: NumberFormatException -> 0x00b3, TryCatch #0 {NumberFormatException -> 0x00b3, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:43:0x0092, B:45:0x0098, B:48:0x00a7, B:50:0x00ac), top: B:66:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf A[SYNTHETIC] */
    public static FocusOrderModifierDefaultImpls[] serializer(String str) {
        int i;
        String strTrim;
        float[] fArrRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if (((cCharAt - 'Z') * (cCharAt - 'A') > 0 && (cCharAt - 'z') * (cCharAt - 'a') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i3, i4).trim();
                    if (strTrim.isEmpty()) {
                        if (strTrim.charAt(i2) == 'z' && strTrim.charAt(i2) != 'Z') {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i6;
                                    while (i11 < strTrim.length()) {
                                        char cCharAt2 = strTrim.charAt(i11);
                                        if (cCharAt2 == ' ') {
                                            i9 = 0;
                                            i10 = 1;
                                        } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                            switch (cCharAt2) {
                                                case ',':
                                                    i9 = 0;
                                                    i10 = 1;
                                                    break;
                                                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                    if (i11 != i6 && i9 == 0) {
                                                        i7 = 1;
                                                        i9 = 0;
                                                        i10 = 1;
                                                    } else {
                                                        i9 = 0;
                                                    }
                                                    break;
                                                case '.':
                                                    if (i8 == 0) {
                                                        i8 = 1;
                                                        i9 = 0;
                                                    }
                                                    i7 = 1;
                                                    i9 = 0;
                                                    i10 = 1;
                                                    break;
                                                default:
                                                    i9 = 0;
                                                    break;
                                            }
                                        } else {
                                            i9 = 1;
                                        }
                                        if (i10 != 0) {
                                            if (i6 < i11) {
                                                fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                i5++;
                                            }
                                            if (i7 != 0) {
                                                i11++;
                                            }
                                            i6 = i11;
                                            i2 = 0;
                                        } else {
                                            i11++;
                                        }
                                    }
                                    if (i6 < i11) {
                                        fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                        i5++;
                                    }
                                    if (i7 != 0) {
                                        i11++;
                                    }
                                    i6 = i11;
                                    i2 = 0;
                                }
                                fArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fArr, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(ff$$ExternalSyntheticOutline0.m("error in parsing \"", strTrim, "\""), e);
                                return null;
                            }
                        } else {
                            fArrRemoteActionCompatParcelizer = new float[i2];
                        }
                        arrayList.add(new FocusOrderModifierDefaultImpls(strTrim.charAt(i2), fArrRemoteActionCompatParcelizer));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) == 'z') {
                    fArrRemoteActionCompatParcelizer = new float[i2];
                } else {
                    fArrRemoteActionCompatParcelizer = new float[i2];
                }
                arrayList.add(new FocusOrderModifierDefaultImpls(strTrim.charAt(i2), fArrRemoteActionCompatParcelizer));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new FocusOrderModifierDefaultImpls(str.charAt(i3), new float[0]));
        }
        return (FocusOrderModifierDefaultImpls[]) arrayList.toArray(new FocusOrderModifierDefaultImpls[i]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    public static boolean read(SentryBaseEvent sentryBaseEvent, String str, getSecondArg getsecondarg, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        int i = 7;
        boolean z = false;
        int i2 = 1;
        switch (str) {
            case "debug_meta":
                sentryBaseEvent.write = (io.sentry.protocol.RemoteActionCompatParcelizer) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(i));
                return true;
            case "server_name":
                sentryBaseEvent.MediaSessionCompatResultReceiverWrapper = getsecondarg.ComponentActivity();
                return true;
            case "contexts":
                sentryBaseEvent.read.IconCompatParcelizer(io.sentry.protocol.serializer.read(getsecondarg, brazeActionParserExternalSyntheticLambda0));
                return true;
            case "environment":
                sentryBaseEvent.serializer = getsecondarg.ComponentActivity();
                return true;
            case "breadcrumbs":
                sentryBaseEvent.IconCompatParcelizer = getsecondarg.write(brazeActionParserExternalSyntheticLambda0, new r8lambdaHjemXHYfodJLOYfrMFHK4Ijjvo(i2));
                return true;
            case "sdk":
                sentryBaseEvent.PlaybackStateCompat = (io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(19));
                return true;
            case "dist":
                sentryBaseEvent.RemoteActionCompatParcelizer = getsecondarg.ComponentActivity();
                return true;
            case "tags":
                sentryBaseEvent.PlaybackStateCompatCustomAction = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                return true;
            case "user":
                sentryBaseEvent.ParcelableVolumeInfo = (io.sentry.protocol.addObserverForBackInvoker) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(29));
                return true;
            case "extra":
                sentryBaseEvent.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer((Map) getsecondarg.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY());
                return true;
            case "event_id":
                sentryBaseEvent.MediaMetadataCompat = (io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(z));
                return true;
            case "release":
                sentryBaseEvent.RatingCompat = getsecondarg.ComponentActivity();
                return true;
            case "request":
                sentryBaseEvent.MediaBrowserCompatMediaItem = (io.sentry.protocol.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) getsecondarg.serializer(brazeActionParserExternalSyntheticLambda0, new io.sentry.protocol.serializer(17));
                return true;
            case "platform":
                sentryBaseEvent.MediaSessionCompatQueueItem = getsecondarg.ComponentActivity();
                return true;
            default:
                return false;
        }
    }
}
