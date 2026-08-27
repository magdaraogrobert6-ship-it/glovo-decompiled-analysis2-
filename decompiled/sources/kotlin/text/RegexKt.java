package kotlin.text;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.deliveryhero.fwf_http.ConstantKt;
import com.huawei.hms.support.api.client.PendingResultsCreator;
import io.sentry.util.MediaSessionCompatToken;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.DispatchedContinuation;
import o.DragAndDropModifierNode;
import o.OnGooglePlayInstallReferrerReadListener;
import o.ShortNewsContentCardView;
import o._get_messageWebView_lambda0;
import o.accessarcToRadjd;
import o.accessiteratorjd;
import o.accessrewindjd;
import o.addOvaldefault;
import o.displayInAppMessagelambda1;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.getModulateAlphake2Ky5w;
import o.isCurrentlyDisplayingInAppMessage;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RegexKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int read;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i4);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i4)) | (~(i7 | i9)) | (~(i9 | i4));
        int i14 = i4 + i5 + i2 + (669352129 * i6) + (266941808 * i);
        int i15 = i14 * i14;
        int i16 = (720661947 * i4) + 1572077568 + ((-1243901369) * i5) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i2) + ((-1100480512) * i6) + ((-1249902592) * i) + ((-491520000) * i15);
        int i17 = (i4 * 1617402437) + 56426783 + (i5 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i2 * 1617401855) + (i6 * 1244927807) + (i * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        if (i18 != 1) {
            return i18 != 2 ? write(objArr) : serializer(objArr);
        }
        return read(objArr);
    }

    public abstract int RemoteActionCompatParcelizer(String str, byte[] bArr, int i, int i2);

    public abstract int RemoteActionCompatParcelizer(byte[] bArr, int i, int i2);

    public abstract String serializer(byte[] bArr, int i, int i2);

    public /* synthetic */ RegexKt(int i) {
        this.read = i;
    }

    public static boolean write(byte b) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 77;
        int i4 = i3 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (b > -65) {
            int i6 = i4 + 3;
            write = i6 % Fields.SpotShadowColor;
            return i6 % 2 != 0;
        }
        int i7 = i2 + 101;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static final String IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = write + 65;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        int i4 = write + 75;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return hexString;
    }

    public boolean write(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 45;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (RemoteActionCompatParcelizer(bArr, i, i2) != 0) {
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 91;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public static final getIsCurrentlyDisplayingInAppMessage write(Matcher matcher, int i, CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 83;
        write = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            matcher.find(i);
            obj.hashCode();
            throw null;
        }
        if (matcher.find(i)) {
            return new getIsCurrentlyDisplayingInAppMessage(matcher, charSequence);
        }
        int i4 = write + 17;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objRetry = retry(3, ConstantKt.DEFAULT_REQUEST_TIMEOUT, 6000L, 2.0d, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, continuationImpl);
        int i4 = RemoteActionCompatParcelizer + 23;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objRetry;
    }

    public static final void write(DragAndDropModifierNode dragAndDropModifierNode, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 39;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            dragAndDropModifierNode.IconCompatParcelizer[(dragAndDropModifierNode.write - dragAndDropModifierNode.RemoteActionCompatParcelizer[dragAndDropModifierNode.RatingCompat >> 1].read) * i] = obj;
        } else {
            dragAndDropModifierNode.IconCompatParcelizer[(dragAndDropModifierNode.write - dragAndDropModifierNode.RemoteActionCompatParcelizer[dragAndDropModifierNode.RatingCompat - 1].read) + i] = obj;
        }
        int i4 = RemoteActionCompatParcelizer + 65;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read != 9) {
            int iHashCode = super.hashCode();
            int i4 = RemoteActionCompatParcelizer + 13;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }
        int iHashCode2 = toString().hashCode();
        int i6 = RemoteActionCompatParcelizer + 67;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return new o.accessiteratorjd(((android.graphics.drawable.BitmapDrawable) r3).getBitmap());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = new o.accessarcToRadjd(r3);
        r3 = kotlin.text.RegexKt.write + 11;
        kotlin.text.RegexKt.RemoteActionCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r3 = 63 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if ((r3 instanceof android.graphics.drawable.BitmapDrawable) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r3 instanceof android.graphics.drawable.BitmapDrawable) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.accessrewindjd serializer(android.graphics.drawable.Drawable r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.text.RegexKt.write
            int r1 = r1 + 113
            int r2 = r1 % 128
            kotlin.text.RegexKt.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L16
            boolean r1 = r3 instanceof android.graphics.drawable.BitmapDrawable
            r2 = 1
            int r2 = r2 / 0
            if (r1 == 0) goto L26
            goto L1a
        L16:
            boolean r1 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L26
        L1a:
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            o.accessiteratorjd r0 = new o.accessiteratorjd
            r0.<init>(r3)
            return r0
        L26:
            o.accessarcToRadjd r1 = new o.accessarcToRadjd
            r1.<init>(r3)
            int r3 = kotlin.text.RegexKt.write
            int r3 = r3 + 11
            int r2 = r3 % 128
            kotlin.text.RegexKt.RemoteActionCompatParcelizer = r2
            int r3 = r3 % r0
            if (r3 == 0) goto L3a
            r3 = 63
            int r3 = r3 / 0
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.RegexKt.serializer(android.graphics.drawable.Drawable):o.accessrewindjd");
    }

    public static final void serializer(DragAndDropModifierNode dragAndDropModifierNode, int i, Object obj, int i2, Object obj2) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 103;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = dragAndDropModifierNode.write - dragAndDropModifierNode.RemoteActionCompatParcelizer[dragAndDropModifierNode.RatingCompat - 1].read;
        Object[] objArr = dragAndDropModifierNode.IconCompatParcelizer;
        objArr[i + i6] = obj;
        objArr[i6 + i2] = obj2;
        int i7 = write + 59;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) throws InvalidProtocolBufferException {
        byte bByteValue = ((Byte) objArr[0]).byteValue();
        byte bByteValue2 = ((Byte) objArr[1]).byteValue();
        char[] cArr = (char[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        if (bByteValue >= -62) {
            int i2 = write + 85;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 != 0) {
                write(bByteValue2);
                obj.hashCode();
                throw null;
            }
            if (!write(bByteValue2)) {
                int i3 = RemoteActionCompatParcelizer;
                int i4 = i3 + 77;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    cArr[iIntValue] = (char) (((bByteValue & 40) + 34) | (bByteValue2 & 119));
                } else {
                    cArr[iIntValue] = (char) (((bByteValue & 31) << 6) | (bByteValue2 & 63));
                }
                int i5 = i3 + 9;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return null;
                }
                throw null;
            }
        }
        throw InvalidProtocolBufferException.read();
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = write + 15;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.read == 9) {
            String strIconCompatParcelizer = displayInAppMessagelambda1.serializer(getClass()).IconCompatParcelizer();
            strIconCompatParcelizer.getClass();
            return strIconCompatParcelizer;
        }
        String string = super.toString();
        int i4 = write + 65;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public static final Drawable RemoteActionCompatParcelizer(accessrewindjd accessrewindjdVar, Resources resources) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 47;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (accessrewindjdVar instanceof accessarcToRadjd) {
            int i5 = i2 + 91;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return ((accessarcToRadjd) accessrewindjdVar).write();
        }
        if (!(accessrewindjdVar instanceof accessiteratorjd)) {
            return new addOvaldefault(0, accessrewindjdVar);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, ((accessiteratorjd) accessrewindjdVar).serializer);
        int i7 = write + 23;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return bitmapDrawable;
        }
        throw null;
    }

    public static boolean write(Double d, boolean z) {
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (d != null) {
            boolean z2 = false;
            if (!d.isNaN() && d.doubleValue() >= 0.0d && d.doubleValue() <= 1.0d) {
                int i5 = RemoteActionCompatParcelizer;
                int i6 = i5 + 7;
                write = i6 % Fields.SpotShadowColor;
                z2 = i6 % 2 != 0;
                int i7 = i5 + 91;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            return z2;
        }
        int i9 = i3 + 109;
        write = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public static void write(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 1;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (!write(b2) && (b != -32 || b2 >= -96)) {
            if (b == -19) {
                int i5 = RemoteActionCompatParcelizer + 57;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? b2 < -96 : b2 < 85) {
                    if (!write(b3)) {
                        int i6 = RemoteActionCompatParcelizer + 117;
                        int i7 = i6 % Fields.SpotShadowColor;
                        write = i7;
                        int i8 = i6 % 2;
                        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        int i9 = i7 + 117;
                        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                        return;
                    }
                }
            } else if (!write(b3)) {
                int i11 = RemoteActionCompatParcelizer + 117;
                int i12 = i11 % Fields.SpotShadowColor;
                write = i12;
                int i13 = i11 % 2;
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                int i14 = i12 + 117;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                return;
            }
        }
        throw InvalidProtocolBufferException.read();
    }

    public static Double IconCompatParcelizer(Boolean bool, Double d, Double d2) {
        int i = 2 % 2;
        if (d != null) {
            int i2 = RemoteActionCompatParcelizer + 41;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return d;
        }
        double dIconCompatParcelizer = MediaSessionCompatToken.read().IconCompatParcelizer();
        if (d2 != null && bool != null) {
            if (bool.booleanValue()) {
                Double dValueOf = Double.valueOf(d2.doubleValue() * dIconCompatParcelizer);
                int i4 = write + 111;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return dValueOf;
            }
            return Double.valueOf(((1.0d - d2.doubleValue()) * dIconCompatParcelizer) + d2.doubleValue());
        }
        return Double.valueOf(dIconCompatParcelizer);
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = (_get_messageWebView_lambda0) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            if (((Double) _get_messagewebview_lambda0.serializer) == null) {
                return new _get_messageWebView_lambda0((Boolean) _get_messagewebview_lambda0.write, (Double) _get_messagewebview_lambda0.RemoteActionCompatParcelizer, IconCompatParcelizer((Boolean) _get_messagewebview_lambda0.write, null, (Double) _get_messagewebview_lambda0.RemoteActionCompatParcelizer), (Boolean) _get_messagewebview_lambda0.IconCompatParcelizer, (Double) _get_messagewebview_lambda0.read);
            }
            int i3 = write + 71;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 58 / 0;
            }
            return _get_messagewebview_lambda0;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        try {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
            r8lambda3kmch7yklpui_5smgazrgczhglc.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(OnGooglePlayInstallReferrerReadListener.Companion.serializer(), 0));
            List list = (List) r8lambda3kmch7yklpui_5smgazrgczhglc.serializer(str, setgraphicmodalmaxwidthdp);
            int i2 = RemoteActionCompatParcelizer + 43;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return list;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                         |Error in deserializing the JSON data in type converter\n                         |json value = " + str + "\n                        "), e));
            return null;
        }
    }

    public static void RemoteActionCompatParcelizer(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
        int i2 = 2 % 2;
        int i3 = write + 67;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (!write(b2)) {
            int i5 = write + 31;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !write(b3)) {
                int i7 = write + 63;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    write(b4);
                    throw null;
                }
                if (!write(b4)) {
                    int i8 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = (char) ((i8 >>> 10) + 55232);
                    cArr[i + 1] = (char) ((i8 & 1023) + 56320);
                    return;
                }
            }
        }
        throw InvalidProtocolBufferException.read();
    }

    public static final String write(ShortNewsContentCardView shortNewsContentCardView) {
        Object isitemdismissable;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 13;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            boolean z = shortNewsContentCardView instanceof DispatchedContinuation;
            throw null;
        }
        if (shortNewsContentCardView instanceof DispatchedContinuation) {
            int i4 = i2 + 89;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            String string = ((DispatchedContinuation) shortNewsContentCardView).toString();
            int i6 = write + 29;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return string;
        }
        try {
            isitemdismissable = shortNewsContentCardView + '@' + IconCompatParcelizer(shortNewsContentCardView);
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        if (onItemDismiss.serializer(isitemdismissable) != null) {
            isitemdismissable = shortNewsContentCardView.getClass().getName() + '@' + IconCompatParcelizer(shortNewsContentCardView);
        }
        String str = (String) isitemdismissable;
        int i8 = RemoteActionCompatParcelizer + 37;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:25|47|26|(1:34)(1:29)) */
    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:38:0x0136  */
    /* JADX WARN: Code duplicated, block: B:39:0x0142  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r17 = r11;
        r11 = r2;
        r2 = r12;
        r12 = r14;
        r14 = r10;
        r18 = r15;
        r15 = r4;
        r4 = r13;
        r13 = r17;
        r19 = r6;
        r6 = r18;
        r7 = r8;
        r9 = r19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0115 -> B:36:0x012d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object retry(int r22, long r23, long r25, double r27, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r29, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.RegexKt.retry(int, long, long, double, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static List RemoteActionCompatParcelizer(String str) {
        int iSerializer = PendingResultsCreator.InstantPendingResult.serializer();
        int iSerializer2 = PendingResultsCreator.InstantPendingResult.serializer();
        int iSerializer3 = PendingResultsCreator.InstantPendingResult.serializer();
        return (List) RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), iSerializer2, iSerializer, 218399833, new Object[]{str}, -218399832, iSerializer3);
    }

    public static _get_messageWebView_lambda0 serializer(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        int iSerializer = PendingResultsCreator.InstantPendingResult.serializer();
        int iSerializer2 = PendingResultsCreator.InstantPendingResult.serializer();
        int iSerializer3 = PendingResultsCreator.InstantPendingResult.serializer();
        return (_get_messageWebView_lambda0) RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), iSerializer2, iSerializer, 551044531, new Object[]{_get_messagewebview_lambda0}, -551044529, iSerializer3);
    }

    public static void read(byte b, byte b2, char[] cArr, int i) {
        Object[] objArr = {Byte.valueOf(b), Byte.valueOf(b2), cArr, Integer.valueOf(i)};
        int iSerializer = PendingResultsCreator.InstantPendingResult.serializer();
        RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), iSerializer, 72370599, objArr, -72370599, PendingResultsCreator.InstantPendingResult.serializer());
    }
}
