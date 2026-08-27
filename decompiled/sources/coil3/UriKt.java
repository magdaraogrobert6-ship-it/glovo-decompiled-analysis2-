package coil3;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.SentryOptions;
import io.sentry.util.PlaybackStateCompatCustomAction;
import io.sentry.util.UrlUtils;
import java.lang.annotation.Annotation;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.RegexKt;
import kotlinx.serialization.SerializationException;
import o.BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2;
import o.BackgroundInAppMessagePreparerprepareInAppMessageForDisplay1;
import o.BrazeInAppMessageManagerExternalSyntheticLambda0;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerregisterInAppMessageManager52;
import o.DefaultInAppMessageModalViewFactory;
import o.DrawableTransformation;
import o.InAppMessageButtonViewUtils;
import o.PathDefaultImpls;
import o.RecyclableBufferedInputStream;
import o.accessgetInstancedelegatecp;
import o.accessunpack;
import o.createInAppMessageViewlambda0;
import o.getArgandroid_sdk_ui_release;
import o.getCieXyz;
import o.getTransparent0d7_KjU;
import o.getUnregisteredInAppMessageannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isAppSetIdReadingEnabled;
import o.isInExpandedBoundsimpl;
import o.isLongPressDragEnabled;
import o.onContentCardDismissed;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdackcXFTNWxBI_DLvE6Ma7QELqEI;
import o.r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setTestingInstanceandroid_sdk_ui_release;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;
import o.verifyOrientationStatus;

/* JADX INFO: loaded from: classes.dex */
public abstract class UriKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~i2;
        int i10 = (~(i7 | i8 | i9)) | (~(i4 | i3));
        int i11 = ~(i2 | i3);
        int i12 = i10 | i11;
        int i13 = ~(i7 | i3);
        int i14 = i11 | i7 | (~(i8 | i9));
        int i15 = i4 + i3 + i6 + (1349231875 * i) + (1735201104 * i5);
        int i16 = i15 * i15;
        int i17 = ((-413510627) * i4) + 1558183936 + (237349861 * i3) + (i12 * 325430244) + (325430244 * i13) + ((-325430244) * i14) + ((-88080384) * i6) + ((-1337982976) * i) + (469762048 * i5) + (1272971264 * i16);
        int i18 = ((i4 * 236314795) - 374860141) + (i3 * 236313123) + (i12 * (-836)) + (i13 * (-836)) + (i14 * 836) + (i6 * 236313959) + (i * (-66979019)) + (i5 * (-1872492752)) + (i16 * (-417333248));
        int i19 = i17 + (i18 * i18 * 639631360);
        if (i19 == 1) {
            return serializer(objArr);
        }
        if (i19 == 2) {
            return write(objArr);
        }
        if (i19 != 3) {
            return i19 != 4 ? IconCompatParcelizer(objArr) : read(objArr);
        }
        return RemoteActionCompatParcelizer(objArr);
    }

    public abstract TransformationMethod IconCompatParcelizer(TransformationMethod transformationMethod);

    public abstract void RemoteActionCompatParcelizer(boolean z);

    public abstract boolean read();

    public abstract void serializer(boolean z);

    public abstract InputFilter[] write(InputFilter[] inputFilterArr);

    public static final long read(long j) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
            int i3 = BrazeInAppMessageManagerExternalSyntheticLambda0.write;
            return j;
        }
        unregisterInAppMessageManager unregisterinappmessagemanager2 = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        int i4 = BrazeInAppMessageManagerExternalSyntheticLambda0.write;
        return j << 1;
    }

    public static final r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU IconCompatParcelizer(Bundle bundle, getTransparent0d7_KjU gettransparent0d7_kju, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int i = 2 % 2;
        gettransparent0d7_kju.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU r8lambdak8d1av0pafigtplh22x5wdyzfju = new r8lambdak8D1aV0PAfigTPLH22X5wDyzFJU(bundle, gettransparent0d7_kju, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        int i2 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return r8lambdak8d1av0pafigtplh22x5wdyzfju;
    }

    public static final long RemoteActionCompatParcelizer(long j) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            BrazeInAppMessageManagerExternalSyntheticLambda2.write.getClass();
            int i3 = BrazeInAppMessageManagerExternalSyntheticLambda0.write;
            return j << 1;
        }
        BrazeInAppMessageManagerExternalSyntheticLambda2.write.getClass();
        int i4 = BrazeInAppMessageManagerExternalSyntheticLambda0.write;
        return (j << 1) + 1;
    }

    public static final boolean IconCompatParcelizer(long j) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if ((j & 68719476736L) == 0) {
            return false;
        }
        int i5 = i2 + 41;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r0 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Mutex owner should not be null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r1 = coil3.UriKt.IconCompatParcelizer + 117;
        coil3.UriKt.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String RemoteActionCompatParcelizer(o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = coil3.UriKt.IconCompatParcelizer
            int r1 = r1 + 37
            int r2 = r1 % 128
            coil3.UriKt.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.String r2 = "mutex_owner"
            if (r1 == 0) goto L1f
            r3.getClass()
            o.resetMessageMarginslambda00 r3 = r3.headers
            java.lang.String r3 = r3.write(r2)
            r1 = 1
            int r1 = r1 / 0
            if (r3 == 0) goto L3a
            goto L2a
        L1f:
            r3.getClass()
            o.resetMessageMarginslambda00 r3 = r3.headers
            java.lang.String r3 = r3.write(r2)
            if (r3 == 0) goto L3a
        L2a:
            int r1 = coil3.UriKt.IconCompatParcelizer
            int r1 = r1 + 117
            int r2 = r1 % 128
            coil3.UriKt.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L39
            r0 = 95
            int r0 = r0 / 0
        L39:
            return r3
        L3a:
            java.lang.String r3 = "Mutex owner should not be null"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.UriKt.RemoteActionCompatParcelizer(o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60):java.lang.String");
    }

    public static final boolean read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        Object[] objArr = {regexKtRemoteActionCompatParcelizer, DefaultInAppMessageModalViewFactory.RatingCompat};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && (regexKtRemoteActionCompatParcelizer instanceof DefaultInAppMessageModalViewFactory)) {
            return true;
        }
        int i4 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return false;
    }

    public static final BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 write(long j) {
        int i = 2 % 2;
        long j2 = j & 25769803776L;
        BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2 = BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT;
        if (j2 != backgroundInAppMessagePreparerdisplayPreparedInAppMessage2.getSignature$kotlinx_serialization_protobuf()) {
            BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage3 = BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.SIGNED;
            if (j2 != backgroundInAppMessagePreparerdisplayPreparedInAppMessage3.getSignature$kotlinx_serialization_protobuf()) {
                return BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED;
            }
            int i2 = RemoteActionCompatParcelizer + 103;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 109;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return backgroundInAppMessagePreparerdisplayPreparedInAppMessage3;
        }
        int i7 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return backgroundInAppMessagePreparerdisplayPreparedInAppMessage2;
    }

    public static PathDefaultImpls IconCompatParcelizer(String str) {
        int i = 2 % 2;
        String str2 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            int i2 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            sb.append(str);
        }
        PathDefaultImpls pathDefaultImpls = new PathDefaultImpls(sb.toString(), str2, "file", null, str);
        int i4 = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return pathDefaultImpls;
    }

    private static /* synthetic */ Object serializer(Object[] objArr) {
        PathDefaultImpls pathDefaultImpls = (PathDefaultImpls) objArr[0];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iSerializer = accessunpack.serializer();
        int iSerializer2 = accessunpack.serializer();
        List list = (List) RemoteActionCompatParcelizer(accessunpack.serializer(), iSerializer, 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), iSerializer2);
        String str = pathDefaultImpls.RemoteActionCompatParcelizer;
        if (list.isEmpty()) {
            int i4 = IconCompatParcelizer + 63;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        String str2 = pathDefaultImpls.read;
        str2.getClass();
        if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str2, str, false)) {
            str = "";
        }
        return onContentCardDismissed.IconCompatParcelizer(list, pathDefaultImpls.RemoteActionCompatParcelizer, str, null, null, 60);
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (-4611686018426L <= jLongValue && jLongValue < 4611686018427L) {
            int i4 = i2 + 45;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return Long.valueOf(read(jLongValue * 1000000));
        }
        return Long.valueOf(RemoteActionCompatParcelizer(RangesKt.IconCompatParcelizer(jLongValue, -4611686018427387903L, 4611686018427387903L)));
    }

    public static final void write(int i, int i2, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 97;
        int i5 = i4 % Fields.SpotShadowColor;
        IconCompatParcelizer = i5;
        int i6 = i4 % 2;
        if (i > 0) {
            int i7 = i5 + 27;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return;
        }
        throw new SerializationException(i + " is not allowed in ProtoNumber for property '" + r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(i2) + "' of '" + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + "', because protobuf supports field numbers in range 1..2147483647");
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        String str = ((PathDefaultImpls) objArr[0]).read;
        if (str == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (i2 < str.length()) {
            int i3 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 1;
            int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, '/', i5, false, 4);
            if (iWrite == -1) {
                iWrite = str.length();
            }
            String strSubstring = str.substring(i5, iWrite);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
                int i6 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 2;
                }
            }
            i2 = iWrite;
        }
        return arrayList;
    }

    public static final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(i);
            throw null;
        }
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        List listSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(i);
        if (!z) {
            i++;
        }
        int size = listSerializer.size();
        int i4 = 0;
        while (i4 < size) {
            Annotation annotation = (Annotation) listSerializer.get(i4);
            if (annotation instanceof BackgroundInAppMessagePreparerprepareInAppMessageForDisplay1) {
                int i5 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                return i5 % 2 == 0 ? 99 : -2;
            }
            if (annotation instanceof r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) {
                i = ((r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) annotation).IconCompatParcelizer();
                if (!z) {
                    int i6 = IconCompatParcelizer + 119;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    write(i, i4, r8lambda92m0p9sit5uf70mvjf4rwmruda);
                }
            }
            i4++;
            int i8 = IconCompatParcelizer + 93;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        int i10 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return i;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 33;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0 ? i == 1 : i == 0) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        int i5 = i3 + 39;
        int i6 = i5 % Fields.SpotShadowColor;
        IconCompatParcelizer = i6;
        int i7 = i5 % 2;
        if (i == 16) {
            int i8 = i6 + 69;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                return 4;
            }
            throw null;
        }
        if (i == 32) {
            return 5;
        }
        int i9 = i3 + 119;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            if (i == 103) {
                return 6;
            }
        } else if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        int i10 = i3 + 17;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final long serializer(long j, long j2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 111;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (j != 4611686018427387903L) {
            int i5 = i2 + 17;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (j != -4611686018427387903L) {
                return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : RangesKt.IconCompatParcelizer(j + j2, -4611686018427387903L, 4611686018427387903L);
            }
        }
        if (-4611686018427387903L < j2) {
            int i6 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (j2 < 4611686018427387903L) {
                return j;
            }
        }
        if ((j2 ^ j) >= 0) {
            return j;
        }
        return 9223372036854759646L;
    }

    public static final String serializer(String str, byte[] bArr) {
        int i = 2 % 2;
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iMax) {
                int i4 = RemoteActionCompatParcelizer;
                int i5 = i4 + 31;
                int i6 = i5 % Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                if (i5 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i2 == i3) {
                    int i7 = i4 + 107;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    int i9 = i4 + 115;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return str;
                }
                if (i2 >= length) {
                    int i11 = i6 + 27;
                    RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return setCarryoverInAppMessage.serializer(bArr, 0, i3, 5);
                }
            } else if (str.charAt(i2) == '%') {
                int i13 = RemoteActionCompatParcelizer + 55;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                int i15 = i2 + 3;
                try {
                    String strSubstring = str.substring(i2 + 1, i15);
                    TuplesKt.RemoteActionCompatParcelizer(16);
                    bArr[i3] = (byte) Integer.parseInt(strSubstring, 16);
                    i3++;
                    i2 = i15;
                } catch (NumberFormatException unused) {
                    bArr[i3] = (byte) str.charAt(i2);
                    i3++;
                    i2++;
                }
            }
            bArr[i3] = (byte) str.charAt(i2);
            i3++;
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028 A[PHI: r2 r3
  0x0028: PHI (r2v5 int) = (r2v3 int), (r2v8 int) binds: [B:10:0x0025, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v3 int) = (r3v2 int), (r3v6 int) binds: [B:10:0x0025, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x008f A[FALL_THROUGH, PHI: r2
  0x008f: PHI (r2v4 int) = (r2v3 int), (r2v5 int), (r2v5 int), (r2v5 int), (r2v5 int), (r2v5 int), (r2v5 int), (r2v8 int) binds: [B:10:0x0025, B:13:0x0035, B:30:0x008d, B:27:0x0089, B:25:0x007d, B:23:0x007a, B:20:0x006c, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r1 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r7 < 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int RemoteActionCompatParcelizer(int r7, int r8) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            r1.getClass()
            if (r8 == 0) goto La1
            int r2 = coil3.UriKt.RemoteActionCompatParcelizer
            int r2 = r2 + 23
            int r3 = r2 % 128
            coil3.UriKt.IconCompatParcelizer = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1f
            int r2 = r7 - r8
            int r3 = r8 >> r2
            int r3 = r7 >> r3
            if (r3 != 0) goto L28
            goto L8f
        L1f:
            int r2 = r7 / r8
            int r3 = r8 * r2
            int r3 = r7 - r3
            if (r3 != 0) goto L28
            goto L8f
        L28:
            r7 = r7 ^ r8
            int r7 = r7 >> 31
            r7 = r7 | 1
            int[] r4 = o.isInExpandedBoundsimpl.RemoteActionCompatParcelizer
            int r1 = r1.ordinal()
            r1 = r4[r1]
            switch(r1) {
                case 1: goto L8d;
                case 2: goto L8f;
                case 3: goto L89;
                case 4: goto L8b;
                case 5: goto L7d;
                case 6: goto L55;
                case 7: goto L55;
                case 8: goto L55;
                default: goto L38;
            }
        L38:
            r7 = 0
            java.lang.Object[] r2 = new java.lang.Object[r7]
            int r6 = o.isAppSetIdReadingEnabled.serializer()
            int r0 = o.isAppSetIdReadingEnabled.serializer()
            int r1 = o.isAppSetIdReadingEnabled.serializer()
            int r4 = o.isAppSetIdReadingEnabled.serializer()
            r5 = -873218597(0xffffffffcbf3bddb, float:-3.1947702E7)
            r3 = 873218597(0x340c4225, float:1.3062579E-7)
            o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L55:
            int r1 = java.lang.Math.abs(r3)
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 - r1
            int r1 = r1 - r8
            if (r1 != 0) goto L7a
            int r7 = coil3.UriKt.RemoteActionCompatParcelizer
            int r7 = r7 + 31
            int r8 = r7 % 128
            coil3.UriKt.IconCompatParcelizer = r8
            int r7 = r7 % r0
            if (r7 == 0) goto L71
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_EVEN
            goto L8f
        L71:
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_EVEN
            r7 = 0
            r7.hashCode()
            throw r7
        L7a:
            if (r1 <= 0) goto L8f
            goto L8b
        L7d:
            if (r7 <= 0) goto L8f
            int r8 = coil3.UriKt.RemoteActionCompatParcelizer
            int r8 = r8 + 9
            int r1 = r8 % 128
            coil3.UriKt.IconCompatParcelizer = r1
            int r8 = r8 % r0
            goto L8b
        L89:
            if (r7 >= 0) goto L8f
        L8b:
            int r2 = r2 + r7
            return r2
        L8d:
            if (r3 != 0) goto L99
        L8f:
            int r7 = coil3.UriKt.IconCompatParcelizer
            int r7 = r7 + 125
            int r8 = r7 % 128
            coil3.UriKt.RemoteActionCompatParcelizer = r8
            int r7 = r7 % r0
            return r2
        L99:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "mode was UNNECESSARY, but rounding was necessary"
            r7.<init>(r8)
            throw r7
        La1:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "/ by zero"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.UriKt.RemoteActionCompatParcelizer(int, int):int");
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        boolean z;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i = 2 % 2;
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (iIntValue <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(d$$ExternalSyntheticOutline0.m(iIntValue, "x (", ") must be > 0"));
            int i2 = RemoteActionCompatParcelizer + 51;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }
        int i4 = IconCompatParcelizer + 97;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        switch (isInExpandedBoundsimpl.RemoteActionCompatParcelizer[roundingMode.ordinal()]) {
            case 1:
                if (iIntValue > 0) {
                    int i6 = RemoteActionCompatParcelizer + 3;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    int i8 = RemoteActionCompatParcelizer + 1;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    z = false;
                }
                if (!((((iIntValue + (-1)) & iIntValue) == 0) & z)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(iIntValue - 1);
                int i10 = RemoteActionCompatParcelizer + 53;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return Integer.valueOf(iNumberOfLeadingZeros);
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(iIntValue);
                return Integer.valueOf((31 - iNumberOfLeadingZeros2) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros2) - iIntValue))) >>> 31));
            default:
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, isAppSetIdReadingEnabled.serializer());
                int i11 = RemoteActionCompatParcelizer + 97;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return 0;
        }
        return Integer.valueOf(31 - Integer.numberOfLeadingZeros(iIntValue));
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        String str;
        SentryOptions sentryOptions = (SentryOptions) objArr[0];
        SentryOptions sentryOptions2 = (SentryOptions) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean z = PlaybackStateCompatCustomAction.serializer;
        if (!z && (sentryOptions2.getVersionDetector() instanceof getArgandroid_sdk_ui_release)) {
            sentryOptions2.setVersionDetector(new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(15, sentryOptions2));
        }
        if (sentryOptions2.getVersionDetector().IconCompatParcelizer()) {
            sentryOptions2.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
            if (z) {
                str = "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions";
            } else {
                int i4 = IconCompatParcelizer + 29;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                str = "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions";
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", str, " for more details."));
            return false;
        }
        if (!zBooleanValue) {
            int i6 = RemoteActionCompatParcelizer + 115;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else if (sentryOptions != null && !sentryOptions2.isForceInit() && sentryOptions.getInitPriority().ordinal() > sentryOptions2.getInitPriority().ordinal()) {
            return false;
        }
        return true;
    }

    public static final long RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        long j;
        int i2 = 2 % 2;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        List listSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(i);
        int i3 = i + 1;
        BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2RemoteActionCompatParcelizer = BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT;
        int size = listSerializer.size();
        int i4 = IconCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 4 / 2;
        }
        int iIconCompatParcelizer = i3;
        boolean z = false;
        boolean z2 = false;
        for (int i6 = 0; i6 < size; i6++) {
            Annotation annotation = (Annotation) listSerializer.get(i6);
            if (annotation instanceof r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) {
                iIconCompatParcelizer = ((r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) annotation).IconCompatParcelizer();
                write(iIconCompatParcelizer, i6, r8lambda92m0p9sit5uf70mvjf4rwmruda);
            } else if (annotation instanceof InAppMessageButtonViewUtils) {
                backgroundInAppMessagePreparerdisplayPreparedInAppMessage2RemoteActionCompatParcelizer = ((InAppMessageButtonViewUtils) annotation).RemoteActionCompatParcelizer();
                int i7 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else if (annotation instanceof r8lambdackcXFTNWxBI_DLvE6Ma7QELqEI) {
                z2 = true;
            } else if (annotation instanceof BackgroundInAppMessagePreparerprepareInAppMessageForDisplay1) {
                z = true;
            }
        }
        if (!z) {
            i3 = iIconCompatParcelizer;
        }
        if (z2) {
            int i9 = IconCompatParcelizer + 21;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                throw null;
            }
            j = 4294967296L;
        } else {
            j = 0;
        }
        long signature$kotlinx_serialization_protobuf = ((long) i3) | (z ? 68719476736L : 0L) | j | backgroundInAppMessagePreparerdisplayPreparedInAppMessage2RemoteActionCompatParcelizer.getSignature$kotlinx_serialization_protobuf();
        int i10 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return signature$kotlinx_serialization_protobuf;
    }

    public static final long IconCompatParcelizer(long j, setUnregisteredInAppMessage setunregisteredinappmessage) {
        int i = 2 % 2;
        setunregisteredinappmessage.getClass();
        setUnregisteredInAppMessage setunregisteredinappmessage2 = setUnregisteredInAppMessage.NANOSECONDS;
        setunregisteredinappmessage2.getClass();
        long jConvert = setunregisteredinappmessage.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, setunregisteredinappmessage2.getTimeUnit$kotlin_stdlib());
        if ((-jConvert) <= j && j <= jConvert) {
            int i2 = RemoteActionCompatParcelizer + 125;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return read(setunregisteredinappmessage2.getTimeUnit$kotlin_stdlib().convert(j, setunregisteredinappmessage.getTimeUnit$kotlin_stdlib()));
            }
            long j2 = read(setunregisteredinappmessage2.getTimeUnit$kotlin_stdlib().convert(j, setunregisteredinappmessage.getTimeUnit$kotlin_stdlib()));
            int i3 = 87 / 0;
            return j2;
        }
        setUnregisteredInAppMessage setunregisteredinappmessage3 = setUnregisteredInAppMessage.MILLISECONDS;
        if (setunregisteredinappmessage.compareTo(setunregisteredinappmessage3) < 0) {
            setunregisteredinappmessage3.getClass();
            return RemoteActionCompatParcelizer(RangesKt.IconCompatParcelizer(setunregisteredinappmessage3.getTimeUnit$kotlin_stdlib().convert(j, setunregisteredinappmessage.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
        }
        int i4 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            int i6 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            j = -9223372036854775807L;
        }
        return RemoteActionCompatParcelizer(UrlUtils.write(Math.abs(j), setunregisteredinappmessage) * jSignum);
    }

    public static final long RemoteActionCompatParcelizer(int i, setUnregisteredInAppMessage setunregisteredinappmessage) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setunregisteredinappmessage.getClass();
        if (setunregisteredinappmessage.compareTo(setUnregisteredInAppMessage.SECONDS) <= 0) {
            long j = i;
            setUnregisteredInAppMessage setunregisteredinappmessage2 = setUnregisteredInAppMessage.NANOSECONDS;
            setunregisteredinappmessage2.getClass();
            return read(setunregisteredinappmessage2.getTimeUnit$kotlin_stdlib().convert(j, setunregisteredinappmessage.getTimeUnit$kotlin_stdlib()));
        }
        long jIconCompatParcelizer = IconCompatParcelizer(i, setunregisteredinappmessage);
        int i5 = IconCompatParcelizer + 13;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return jIconCompatParcelizer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r2 < 4611686018427000000L) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        r2 = read(r2);
        r0 = coil3.UriKt.RemoteActionCompatParcelizer + 59;
        coil3.UriKt.IconCompatParcelizer = r0 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if ((r0 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r0 = 35 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        if (r2 < 4611686018427000000L) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long serializer(double r18, o.setUnregisteredInAppMessage r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.UriKt.serializer(double, o.setUnregisteredInAppMessage):long");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121 A[SYNTHETIC] */
    public static final List serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml) {
        Collection collectionPlaybackStateCompat;
        Iterator it;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 53;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Collection collectionValues = null;
        if (i3 % 2 == 0) {
            r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
            prepareinappmessagewithzippedassethtml.getClass();
            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), createInAppMessageViewlambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
            throw null;
        }
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        prepareinappmessagewithzippedassethtml.getClass();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, createInAppMessageViewlambda0.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = UtilsKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            collectionPlaybackStateCompat = instance_delegatelambda0.write;
            if (getunregisteredinappmessageannotations == null) {
                int i4 = RemoteActionCompatParcelizer + 31;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } else {
                Map map = (Map) prepareinappmessagewithzippedassethtml.MediaDescriptionCompat.get(getunregisteredinappmessageannotations);
                if (map != null) {
                    int i5 = RemoteActionCompatParcelizer + 115;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    collectionValues = map.values();
                }
                if (collectionValues != null) {
                    collectionPlaybackStateCompat = collectionValues;
                }
                Collection collection = collectionPlaybackStateCompat;
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(collection, 10));
                Iterator it2 = collection.iterator();
                while (!(!it2.hasNext())) {
                    arrayList.add(((setGraphicModalMaxWidthDp) it2.next()).getDescriptor());
                }
                collectionPlaybackStateCompat = arrayList;
            }
        } else {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, createInAppMessageViewlambda0.write}, getCieXyz.write())).booleanValue()) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Class ", r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(), " should be abstract or sealed or interface to be used as @ProtoOneOf property.");
                return null;
            }
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(1);
            r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.getClass();
            collectionPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(new isLongPressDragEnabled(i, r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer));
        }
        Collection collection2 = collectionPlaybackStateCompat;
        Iterator it3 = collection2.iterator();
        int i7 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        while (!(!it3.hasNext())) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) it3.next();
            List listSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda2.serializer(0);
            if (listSerializer instanceof Collection) {
                int i9 = IconCompatParcelizer + 43;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (!listSerializer.isEmpty()) {
                    it = listSerializer.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!(((Annotation) it.next()) instanceof r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw));
                }
            } else {
                it = listSerializer.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!(((Annotation) it.next()) instanceof r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw));
            }
            throw new IllegalArgumentException(r8lambda92m0p9sit5uf70mvjf4rwmruda2.serializer() + " implementing oneOf type " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + " should have @ProtoNumber annotation in its single property.");
        }
        return (List) collection2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
    public static PathDefaultImpls write(String str) {
        String strWrite;
        int i;
        String strSubstring;
        String strSubstring2;
        int length;
        int length2;
        String strSerializer;
        int i2;
        int i3 = 2 % 2;
        String str2 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "/"}, getCieXyz.write())).booleanValue()) {
            strWrite = str;
        } else {
            int i4 = IconCompatParcelizer + 7;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                strWrite = setCarryoverInAppMessage.write(str, str2, "/");
                int i5 = 32 / 0;
            } else {
                strWrite = setCarryoverInAppMessage.write(str, str2, "/");
            }
        }
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        boolean z = true;
        while (i6 < strWrite.length()) {
            char cCharAt = strWrite.charAt(i6);
            if (cCharAt != '#') {
                if (cCharAt == '/') {
                    if (i9 == -1) {
                        int i12 = IconCompatParcelizer + 21;
                        int i13 = i12 % Fields.SpotShadowColor;
                        RemoteActionCompatParcelizer = i13;
                        int i14 = i12 % 2;
                        if (i8 == -1) {
                            int i15 = i13 + 41;
                            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                            if (i15 % 2 == 0) {
                                int i16 = 2 / 0;
                                if (i7 == -1) {
                                    if (i10 == -1) {
                                        i9 = 0;
                                    } else {
                                        i9 = i6;
                                    }
                                    i2 = 1;
                                    z = false;
                                }
                            } else if (i7 == -1) {
                                if (i10 == -1) {
                                    i9 = 0;
                                } else {
                                    i9 = i6;
                                }
                                i2 = 1;
                                z = false;
                            }
                        }
                    }
                    i6 += i2;
                } else if (cCharAt != ':') {
                    if (cCharAt == '?' && i8 == -1 && i7 == -1) {
                        int i17 = IconCompatParcelizer + 21;
                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        i8 = i6 + 1;
                    }
                } else if (z && i8 == -1 && i7 == -1) {
                    int i19 = i6 + 2;
                    if (i19 < str.length()) {
                        int i20 = IconCompatParcelizer + 9;
                        RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                        if (i20 % 2 == 0 ? str.charAt(i6 + 1) != '/' : str.charAt(i6) != '1') {
                            if (strWrite.equals(str)) {
                                i9 = i6 + 1;
                                i11 = i6;
                                i6 = i9;
                                i10 = i6;
                            }
                        } else if (str.charAt(i19) == '/') {
                            i10 = i6 + 3;
                            i11 = i6;
                            z = false;
                            i6 = i19;
                        } else if (strWrite.equals(str)) {
                            i9 = i6 + 1;
                            i11 = i6;
                            i6 = i9;
                            i10 = i6;
                        }
                    } else if (strWrite.equals(str)) {
                        i9 = i6 + 1;
                        i11 = i6;
                        i6 = i9;
                        i10 = i6;
                    }
                }
            } else if (i7 == -1) {
                int i21 = IconCompatParcelizer + 79;
                RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                i7 = i6 + 1;
            }
            i2 = 1;
            i6 += i2;
        }
        int iMin = Math.min(i7 == -1 ? Integer.MAX_VALUE : i7 - 1, strWrite.length());
        Object obj = null;
        if (i8 == -1) {
            int i23 = RemoteActionCompatParcelizer + 87;
            IconCompatParcelizer = i23 % Fields.SpotShadowColor;
            if (i23 % 2 == 0) {
                throw null;
            }
            i = Integer.MAX_VALUE;
        } else {
            i = i8 - 1;
        }
        int iMin2 = Math.min(i, iMin);
        if (i10 != -1) {
            strSubstring2 = strWrite.substring(0, i11);
            strSubstring = strWrite.substring(i10, Math.min(i9 != -1 ? i9 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i9 != -1 ? strWrite.substring(i9, iMin2) : null;
        String strSubstring4 = i8 != -1 ? strWrite.substring(i8, iMin) : null;
        String strSubstring5 = i7 != -1 ? strWrite.substring(i7, strWrite.length()) : null;
        if (strSubstring2 != null) {
            int i24 = IconCompatParcelizer + 17;
            RemoteActionCompatParcelizer = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            length = strSubstring2.length();
        } else {
            length = 0;
        }
        int length3 = strSubstring != null ? strSubstring.length() : 0;
        int length4 = strSubstring3 != null ? strSubstring3.length() : 0;
        int length5 = strSubstring4 != null ? strSubstring4.length() : 0;
        if (strSubstring5 != null) {
            int i26 = RemoteActionCompatParcelizer + 51;
            IconCompatParcelizer = i26 % Fields.SpotShadowColor;
            int i27 = i26 % 2;
            length2 = strSubstring5.length();
        } else {
            length2 = 0;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(length, Math.max(length3, Math.max(length4, Math.max(length5, length2)))) - 2)];
        String strSerializer2 = strSubstring2 != null ? serializer(strSubstring2, bArr) : null;
        if (strSubstring != null) {
            int i28 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
            if (i28 % 2 != 0) {
                serializer(strSubstring, bArr);
                obj.hashCode();
                throw null;
            }
            strSerializer = serializer(strSubstring, bArr);
        } else {
            strSerializer = null;
        }
        String strSerializer3 = strSubstring3 != null ? serializer(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            serializer(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            serializer(strSubstring5, bArr);
        }
        return new PathDefaultImpls(strWrite, str2, strSerializer2, strSerializer, strSerializer3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01de A[LOOP:5: B:123:0x01d8->B:125:0x01de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0217 A[LOOP:7: B:133:0x0211->B:135:0x0217, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x0225  */
    /* JADX WARN: Code duplicated, block: B:143:0x023e  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x02be  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:189:0x02fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:190:0x0300  */
    /* JADX WARN: Code duplicated, block: B:192:0x0315  */
    /* JADX WARN: Code duplicated, block: B:219:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x029e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0174 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01d7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0210 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0149 A[DONT_INVERT, PHI: r6
  0x0149: PHI (r6v23 char) = (r6v22 char), (r6v24 char) binds: [B:81:0x0147, B:78:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[LOOP:3: B:73:0x0126->B:83:0x014b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0154  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0162  */
    public static long RemoteActionCompatParcelizer(String str) {
        int i;
        int i2;
        char cCharAt;
        setTestingInstanceandroid_sdk_ui_release settestinginstanceandroid_sdk_ui_release;
        int i3;
        int i4;
        long j;
        int i5;
        long j2;
        int i6;
        int i7;
        char cCharAt2;
        setUnregisteredInAppMessage setunregisteredinappmessage;
        char c;
        int i8;
        long j3;
        long jSerializer;
        int i9;
        int iMin;
        int i10;
        int i11;
        int i12;
        int iMin2;
        int i13;
        int i14;
        double d;
        long j4;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i15;
        int i16;
        char cCharAt7;
        int i17;
        char cCharAt8;
        int i18;
        int i19 = 2;
        int i20 = 2 % 2;
        long j5 = 0;
        if (str.length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The string is empty");
            return 0L;
        }
        int i21 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
        int i22 = i21 % 2;
        char cCharAt9 = str.charAt(0);
        char c2 = '-';
        char c3 = '+';
        if (cCharAt9 != '+') {
            i2 = cCharAt9 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
            return 0L;
        }
        int i23 = i2 + 1;
        if (i23 == str.length()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
            return 0L;
        }
        boolean z = false;
        long j6 = 0;
        long jWrite = 0;
        setUnregisteredInAppMessage setunregisteredinappmessage2 = null;
        while (i23 < str.length()) {
            int i24 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i24 % Fields.SpotShadowColor;
            if (i24 % i19 == 0) {
                cCharAt = str.charAt(i23);
                if (cCharAt == 28) {
                    if (!z) {
                        i18 = IconCompatParcelizer + 115;
                        RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                        if (i18 % i19 != 0) {
                            i23 += 74;
                            if (i23 == str.length()) {
                            }
                            z = true;
                        } else {
                            i23++;
                            if (i23 == str.length()) {
                            }
                            z = true;
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                    return j5;
                }
                setTestingInstanceandroid_sdk_ui_release settestinginstanceandroid_sdk_ui_release2 = setTestingInstanceandroid_sdk_ui_release.read;
                BrazeInAppMessageManagerregisterInAppMessageManager52.read();
                settestinginstanceandroid_sdk_ui_release = setTestingInstanceandroid_sdk_ui_release.read;
                if (settestinginstanceandroid_sdk_ui_release.write) {
                    cCharAt8 = str.charAt(i23);
                    if (cCharAt8 != c3) {
                        i3 = i23 + 1;
                        i4 = 1;
                    } else if (cCharAt8 != c2) {
                        i3 = i23;
                        i4 = 1;
                    } else {
                        i3 = i23 + 1;
                        i4 = -1;
                    }
                } else {
                    i3 = i23;
                    i4 = 1;
                }
                while (i3 < str.length()) {
                    i17 = IconCompatParcelizer + 33;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    if (i17 % i19 != 0) {
                        if (str.charAt(i3) != 'm') {
                            j = 0;
                            while (true) {
                                i5 = i;
                                if (i3 < str.length()) {
                                    cCharAt6 = str.charAt(i3);
                                    j2 = j6;
                                    if ('0' > cCharAt6 && cCharAt6 < ':') {
                                        int i25 = IconCompatParcelizer + 125;
                                        RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
                                        int i26 = i25 % 2;
                                        i15 = cCharAt6 - '0';
                                        if (j > settestinginstanceandroid_sdk_ui_release.RemoteActionCompatParcelizer || (j == settestinginstanceandroid_sdk_ui_release.RemoteActionCompatParcelizer && i15 > settestinginstanceandroid_sdk_ui_release.serializer)) {
                                            while (i3 < str.length()) {
                                                int i27 = RemoteActionCompatParcelizer + 73;
                                                IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                                                if (i27 % 2 == 0) {
                                                    cCharAt7 = str.charAt(i3);
                                                    if ('-' <= cCharAt7) {
                                                        if (cCharAt7 < ':') {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    cCharAt7 = str.charAt(i3);
                                                    if ('0' <= cCharAt7) {
                                                        if (cCharAt7 < ':') {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                                if (i3 == str.length()) {
                                                    if (cCharAt != '+' || cCharAt == '-') {
                                                        i16 = 1;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    if (i3 != i23 + i16) {
                                                        setTestingInstanceandroid_sdk_ui_release settestinginstanceandroid_sdk_ui_release3 = setTestingInstanceandroid_sdk_ui_release.read;
                                                        j = 4611686018427387903L;
                                                    }
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            if (i3 == str.length()) {
                                                if (cCharAt != '+') {
                                                    i16 = 1;
                                                } else {
                                                    i16 = 1;
                                                }
                                                if (i3 != i23 + i16) {
                                                    setTestingInstanceandroid_sdk_ui_release settestinginstanceandroid_sdk_ui_release4 = setTestingInstanceandroid_sdk_ui_release.read;
                                                    j = 4611686018427387903L;
                                                }
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j = (j << 3) + (j << 1) + ((long) i15);
                                        i3++;
                                        i = i5;
                                        j6 = j2;
                                    }
                                    if (str.charAt(i3) == '.') {
                                        i9 = i3 + 1;
                                        iMin = Math.min(i3 + 7, str.length());
                                        i11 = 0;
                                        for (i10 = i9; i10 < iMin; i10++) {
                                            int i28 = RemoteActionCompatParcelizer + 15;
                                            IconCompatParcelizer = i28 % Fields.SpotShadowColor;
                                            int i29 = i28 % 2;
                                            cCharAt5 = str.charAt(i10);
                                            if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                                for (i12 = 0; i12 < 6 - (i10 - i9); i12++) {
                                                    i11 = (i11 << 3) + (i11 << 1);
                                                }
                                                iMin2 = Math.min(i10 + 9, str.length());
                                                i3 = i10;
                                                i13 = 0;
                                                while (i3 < iMin2) {
                                                    cCharAt4 = str.charAt(i3);
                                                    int i30 = iMin2;
                                                    if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                                        for (i14 = 0; i14 < 9 - (i3 - i10); i14++) {
                                                            i13 = (i13 << 3) + (i13 << 1);
                                                        }
                                                        while (i3 < str.length() && '0' <= (cCharAt3 = str.charAt(i3)) && cCharAt3 < ':') {
                                                            int i31 = RemoteActionCompatParcelizer + 59;
                                                            IconCompatParcelizer = i31 % Fields.SpotShadowColor;
                                                            int i32 = i31 % 2;
                                                            i3++;
                                                        }
                                                        if (i3 != i9 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                            return 0L;
                                                        }
                                                        long j7 = i4;
                                                        setUnregisteredInAppMessage setunregisteredinappmessage3 = setUnregisteredInAppMessage.SECONDS;
                                                        double d2 = (((long) i11) * 1000000000) + ((long) i13);
                                                        switch (verifyOrientationStatus.IconCompatParcelizer[setunregisteredinappmessage3.ordinal()]) {
                                                            case 1:
                                                                d = 1.0E-12d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            case 2:
                                                                d = 1.0E-15d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            case 3:
                                                                d = 1.0E-9d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            case 4:
                                                                d = 1.0E-6d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            case 5:
                                                                d = 6.0E-5d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            case 6:
                                                                d = 0.0036d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            case 7:
                                                                d = 0.0864d;
                                                                j4 = MathKt.read(d2 * d);
                                                                break;
                                                            default:
                                                                DrawableTransformation.read(setunregisteredinappmessage3, "Unknown unit: ");
                                                                j4 = 0;
                                                                break;
                                                        }
                                                        j6 = j4 * j7;
                                                    } else {
                                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                        i3++;
                                                        iMin2 = i30;
                                                    }
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i33 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i33 % Fields.SpotShadowColor;
                                                    int i34 = i33 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            i11 = (cCharAt5 - '0') + (i11 << 3) + (i11 << 1);
                                        }
                                        while (i12 < 6 - (i10 - i9)) {
                                            i11 = (i11 << 3) + (i11 << 1);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i3 = i10;
                                        i13 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt4 = str.charAt(i3);
                                            int i35 = iMin2;
                                            if ('0' <= cCharAt4) {
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i36 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i36 % Fields.SpotShadowColor;
                                                int i37 = i36 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i38 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i38 % Fields.SpotShadowColor;
                                            int i39 = i38 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    j6 = j2;
                                    cCharAt2 = str.charAt(i3);
                                    if (cCharAt2 == 'D') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                    } else if (cCharAt2 == 'H') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    } else if (cCharAt2 == 'M') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                    } else if (cCharAt2 != 'S') {
                                        setunregisteredinappmessage = null;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                    }
                                    if (setunregisteredinappmessage == null) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                    }
                                    if (setunregisteredinappmessage2 != null) {
                                        c = '+';
                                        int i40 = RemoteActionCompatParcelizer + 43;
                                        IconCompatParcelizer = i40 % Fields.SpotShadowColor;
                                        i8 = 2;
                                        int i41 = i40 % 2;
                                        if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                            return 0L;
                                        }
                                    } else {
                                        c = '+';
                                        i8 = 2;
                                    }
                                    if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                        if (z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                    } else {
                                        if (!z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                        if (jSerializer == 9223372036854759646L) {
                                            j3 = jWrite;
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j3 = jWrite;
                                        jWrite = jSerializer;
                                    }
                                    i23 = i3 + 1;
                                    setunregisteredinappmessage2 = setunregisteredinappmessage;
                                    c3 = c;
                                    i19 = i8;
                                    i = i5;
                                    j5 = 0;
                                    c2 = '-';
                                } else {
                                    j2 = j6;
                                }
                                if (i3 != str.length()) {
                                    i6 = RemoteActionCompatParcelizer + 103;
                                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                                    if (i6 % 2 == 0 ? cCharAt != '+' : cCharAt != 'i') {
                                        i7 = cCharAt != '-' ? 0 : 1;
                                        if (i3 == i23 + i7) {
                                        }
                                        if (str.charAt(i3) == '.') {
                                            i9 = i3 + 1;
                                            iMin = Math.min(i3 + 7, str.length());
                                            i11 = 0;
                                            while (i10 < iMin) {
                                                int i210 = RemoteActionCompatParcelizer + 15;
                                                IconCompatParcelizer = i210 % Fields.SpotShadowColor;
                                                int i211 = i210 % 2;
                                                cCharAt5 = str.charAt(i10);
                                                if ('0' <= cCharAt5) {
                                                }
                                                while (i12 < 6 - (i10 - i9)) {
                                                    i11 = (i11 << 3) + (i11 << 1);
                                                }
                                                iMin2 = Math.min(i10 + 9, str.length());
                                                i3 = i10;
                                                i13 = 0;
                                                while (i3 < iMin2) {
                                                    cCharAt4 = str.charAt(i3);
                                                    int i310 = iMin2;
                                                    if ('0' <= cCharAt4) {
                                                    }
                                                    while (i14 < 9 - (i3 - i10)) {
                                                        i13 = (i13 << 3) + (i13 << 1);
                                                    }
                                                    while (i3 < str.length()) {
                                                        int i311 = RemoteActionCompatParcelizer + 59;
                                                        IconCompatParcelizer = i311 % Fields.SpotShadowColor;
                                                        int i312 = i311 % 2;
                                                        i3++;
                                                    }
                                                    if (i3 != i9) {
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                    return 0L;
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i313 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i313 % Fields.SpotShadowColor;
                                                    int i314 = i313 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i315 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i316 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i316 % Fields.SpotShadowColor;
                                                    int i317 = i316 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i318 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i318 % Fields.SpotShadowColor;
                                                int i319 = i318 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j6 = j2;
                                        cCharAt2 = str.charAt(i3);
                                        if (cCharAt2 == 'D') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                        } else if (cCharAt2 == 'H') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                        } else if (cCharAt2 == 'M') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                        } else if (cCharAt2 != 'S') {
                                            setunregisteredinappmessage = null;
                                        } else {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                        }
                                        if (setunregisteredinappmessage == null) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                        }
                                        if (setunregisteredinappmessage2 != null) {
                                            c = '+';
                                            int i42 = RemoteActionCompatParcelizer + 43;
                                            IconCompatParcelizer = i42 % Fields.SpotShadowColor;
                                            i8 = 2;
                                            int i43 = i42 % 2;
                                            if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                                return 0L;
                                            }
                                        } else {
                                            c = '+';
                                            i8 = 2;
                                        }
                                        if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                            if (z) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                        } else {
                                            if (!z) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                            if (jSerializer == 9223372036854759646L) {
                                                j3 = jWrite;
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            j3 = jWrite;
                                            jWrite = jSerializer;
                                        }
                                        i23 = i3 + 1;
                                        setunregisteredinappmessage2 = setunregisteredinappmessage;
                                        c3 = c;
                                        i19 = i8;
                                        i = i5;
                                        j5 = 0;
                                        c2 = '-';
                                    }
                                    if (i3 == i23 + i7) {
                                    }
                                    if (str.charAt(i3) == '.') {
                                        i9 = i3 + 1;
                                        iMin = Math.min(i3 + 7, str.length());
                                        i11 = 0;
                                        while (i10 < iMin) {
                                            int i212 = RemoteActionCompatParcelizer + 15;
                                            IconCompatParcelizer = i212 % Fields.SpotShadowColor;
                                            int i213 = i212 % 2;
                                            cCharAt5 = str.charAt(i10);
                                            if ('0' <= cCharAt5) {
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i3110 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i3111 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i3111 % Fields.SpotShadowColor;
                                                    int i3112 = i3111 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i3113 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i3113 % Fields.SpotShadowColor;
                                                int i3114 = i3113 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i12 < 6 - (i10 - i9)) {
                                            i11 = (i11 << 3) + (i11 << 1);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i3 = i10;
                                        i13 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt4 = str.charAt(i3);
                                            int i3115 = iMin2;
                                            if ('0' <= cCharAt4) {
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i3116 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i3116 % Fields.SpotShadowColor;
                                                int i3117 = i3116 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i3118 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i3118 % Fields.SpotShadowColor;
                                            int i3119 = i3118 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    j6 = j2;
                                    cCharAt2 = str.charAt(i3);
                                    if (cCharAt2 == 'D') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                    } else if (cCharAt2 == 'H') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    } else if (cCharAt2 == 'M') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                    } else if (cCharAt2 != 'S') {
                                        setunregisteredinappmessage = null;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                    }
                                    if (setunregisteredinappmessage == null) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                    }
                                    if (setunregisteredinappmessage2 != null) {
                                        c = '+';
                                        int i44 = RemoteActionCompatParcelizer + 43;
                                        IconCompatParcelizer = i44 % Fields.SpotShadowColor;
                                        i8 = 2;
                                        int i45 = i44 % 2;
                                        if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                            return 0L;
                                        }
                                    } else {
                                        c = '+';
                                        i8 = 2;
                                    }
                                    if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                        if (z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                    } else {
                                        if (!z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                        if (jSerializer == 9223372036854759646L) {
                                            j3 = jWrite;
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j3 = jWrite;
                                        jWrite = jSerializer;
                                    }
                                    i23 = i3 + 1;
                                    setunregisteredinappmessage2 = setunregisteredinappmessage;
                                    c3 = c;
                                    i19 = i8;
                                    i = i5;
                                    j5 = 0;
                                    c2 = '-';
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                return 0L;
                            }
                        }
                        i3++;
                    } else if (str.charAt(i3) == '0') {
                        i3++;
                    } else {
                        j = 0;
                        while (true) {
                            i5 = i;
                            if (i3 < str.length()) {
                                cCharAt6 = str.charAt(i3);
                                j2 = j6;
                                if ('0' > cCharAt6) {
                                }
                            } else {
                                j2 = j6;
                            }
                            if (i3 != str.length()) {
                                i6 = RemoteActionCompatParcelizer + 103;
                                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 == 0) {
                                    if (i3 == i23 + i7) {
                                    }
                                    if (str.charAt(i3) == '.') {
                                        i9 = i3 + 1;
                                        iMin = Math.min(i3 + 7, str.length());
                                        i11 = 0;
                                        while (i10 < iMin) {
                                            int i214 = RemoteActionCompatParcelizer + 15;
                                            IconCompatParcelizer = i214 % Fields.SpotShadowColor;
                                            int i215 = i214 % 2;
                                            cCharAt5 = str.charAt(i10);
                                            if ('0' <= cCharAt5) {
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i31110 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i31111 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i31111 % Fields.SpotShadowColor;
                                                    int i31112 = i31111 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i31113 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i31113 % Fields.SpotShadowColor;
                                                int i31114 = i31113 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i12 < 6 - (i10 - i9)) {
                                            i11 = (i11 << 3) + (i11 << 1);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i3 = i10;
                                        i13 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt4 = str.charAt(i3);
                                            int i31115 = iMin2;
                                            if ('0' <= cCharAt4) {
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i31116 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i31116 % Fields.SpotShadowColor;
                                                int i31117 = i31116 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i31118 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i31118 % Fields.SpotShadowColor;
                                            int i31119 = i31118 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    j6 = j2;
                                    cCharAt2 = str.charAt(i3);
                                    if (cCharAt2 == 'D') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                    } else if (cCharAt2 == 'H') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    } else if (cCharAt2 == 'M') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                    } else if (cCharAt2 != 'S') {
                                        setunregisteredinappmessage = null;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                    }
                                    if (setunregisteredinappmessage == null) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                    }
                                    if (setunregisteredinappmessage2 != null) {
                                        c = '+';
                                        int i46 = RemoteActionCompatParcelizer + 43;
                                        IconCompatParcelizer = i46 % Fields.SpotShadowColor;
                                        i8 = 2;
                                        int i47 = i46 % 2;
                                        if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                            return 0L;
                                        }
                                    } else {
                                        c = '+';
                                        i8 = 2;
                                    }
                                    if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                        if (z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                    } else {
                                        if (!z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                        if (jSerializer == 9223372036854759646L) {
                                            j3 = jWrite;
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j3 = jWrite;
                                        jWrite = jSerializer;
                                    }
                                    i23 = i3 + 1;
                                    setunregisteredinappmessage2 = setunregisteredinappmessage;
                                    c3 = c;
                                    i19 = i8;
                                    i = i5;
                                    j5 = 0;
                                    c2 = '-';
                                } else {
                                    if (i3 == i23 + i7) {
                                    }
                                    if (str.charAt(i3) == '.') {
                                        i9 = i3 + 1;
                                        iMin = Math.min(i3 + 7, str.length());
                                        i11 = 0;
                                        while (i10 < iMin) {
                                            int i216 = RemoteActionCompatParcelizer + 15;
                                            IconCompatParcelizer = i216 % Fields.SpotShadowColor;
                                            int i217 = i216 % 2;
                                            cCharAt5 = str.charAt(i10);
                                            if ('0' <= cCharAt5) {
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i311110 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i311111 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i311111 % Fields.SpotShadowColor;
                                                    int i311112 = i311111 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i311113 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i311113 % Fields.SpotShadowColor;
                                                int i311114 = i311113 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i12 < 6 - (i10 - i9)) {
                                            i11 = (i11 << 3) + (i11 << 1);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i3 = i10;
                                        i13 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt4 = str.charAt(i3);
                                            int i311115 = iMin2;
                                            if ('0' <= cCharAt4) {
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i311116 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i311116 % Fields.SpotShadowColor;
                                                int i311117 = i311116 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i311118 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i311118 % Fields.SpotShadowColor;
                                            int i311119 = i311118 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    j6 = j2;
                                    cCharAt2 = str.charAt(i3);
                                    if (cCharAt2 == 'D') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                    } else if (cCharAt2 == 'H') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    } else if (cCharAt2 == 'M') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                    } else if (cCharAt2 != 'S') {
                                        setunregisteredinappmessage = null;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                    }
                                    if (setunregisteredinappmessage == null) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                    }
                                    if (setunregisteredinappmessage2 != null) {
                                        c = '+';
                                        int i48 = RemoteActionCompatParcelizer + 43;
                                        IconCompatParcelizer = i48 % Fields.SpotShadowColor;
                                        i8 = 2;
                                        int i49 = i48 % 2;
                                        if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                            return 0L;
                                        }
                                    } else {
                                        c = '+';
                                        i8 = 2;
                                    }
                                    if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                        if (z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                    } else {
                                        if (!z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                        if (jSerializer == 9223372036854759646L) {
                                            j3 = jWrite;
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j3 = jWrite;
                                        jWrite = jSerializer;
                                    }
                                    i23 = i3 + 1;
                                    setunregisteredinappmessage2 = setunregisteredinappmessage;
                                    c3 = c;
                                    i19 = i8;
                                    i = i5;
                                    j5 = 0;
                                    c2 = '-';
                                }
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                            return 0L;
                            j = (j << 3) + (j << 1) + ((long) i15);
                            i3++;
                            i = i5;
                            j6 = j2;
                        }
                    }
                }
                j = 0;
                while (true) {
                    i5 = i;
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        j2 = j6;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        j2 = j6;
                    }
                    if (i3 != str.length()) {
                        i6 = RemoteActionCompatParcelizer + 103;
                        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            if (i3 == i23 + i7) {
                            }
                            if (str.charAt(i3) == '.') {
                                i9 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    int i218 = RemoteActionCompatParcelizer + 15;
                                    IconCompatParcelizer = i218 % Fields.SpotShadowColor;
                                    int i219 = i218 % 2;
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 3) + (i11 << 1);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i3 = i10;
                                    i13 = 0;
                                    while (i3 < iMin2) {
                                        cCharAt4 = str.charAt(i3);
                                        int i3111110 = iMin2;
                                        if ('0' <= cCharAt4) {
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i3111111 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i3111111 % Fields.SpotShadowColor;
                                            int i3111112 = i3111111 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i3111113 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i3111113 % Fields.SpotShadowColor;
                                        int i3111114 = i3111113 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 3) + (i11 << 1);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i3 = i10;
                                i13 = 0;
                                while (i3 < iMin2) {
                                    cCharAt4 = str.charAt(i3);
                                    int i3111115 = iMin2;
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i3111116 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i3111116 % Fields.SpotShadowColor;
                                        int i3111117 = i3111116 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i3 - i10)) {
                                    i13 = (i13 << 3) + (i13 << 1);
                                }
                                while (i3 < str.length()) {
                                    int i3111118 = RemoteActionCompatParcelizer + 59;
                                    IconCompatParcelizer = i3111118 % Fields.SpotShadowColor;
                                    int i3111119 = i3111118 % 2;
                                    i3++;
                                }
                                if (i3 != i9) {
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                return 0L;
                            }
                            j6 = j2;
                            cCharAt2 = str.charAt(i3);
                            if (cCharAt2 == 'D') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                            } else if (cCharAt2 == 'H') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                            } else if (cCharAt2 == 'M') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                setunregisteredinappmessage = null;
                            } else {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                            }
                            if (setunregisteredinappmessage == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (setunregisteredinappmessage2 != null) {
                                c = '+';
                                int i410 = RemoteActionCompatParcelizer + 43;
                                IconCompatParcelizer = i410 % Fields.SpotShadowColor;
                                i8 = 2;
                                int i411 = i410 % 2;
                                if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                    return 0L;
                                }
                            } else {
                                c = '+';
                                i8 = 2;
                            }
                            if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                if (z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                            } else {
                                if (!z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                if (jSerializer == 9223372036854759646L) {
                                    j3 = jWrite;
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                j3 = jWrite;
                                jWrite = jSerializer;
                            }
                            i23 = i3 + 1;
                            setunregisteredinappmessage2 = setunregisteredinappmessage;
                            c3 = c;
                            i19 = i8;
                            i = i5;
                            j5 = 0;
                            c2 = '-';
                        } else {
                            if (i3 == i23 + i7) {
                            }
                            if (str.charAt(i3) == '.') {
                                i9 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    int i2110 = RemoteActionCompatParcelizer + 15;
                                    IconCompatParcelizer = i2110 % Fields.SpotShadowColor;
                                    int i2111 = i2110 % 2;
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 3) + (i11 << 1);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i3 = i10;
                                    i13 = 0;
                                    while (i3 < iMin2) {
                                        cCharAt4 = str.charAt(i3);
                                        int i31111110 = iMin2;
                                        if ('0' <= cCharAt4) {
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i31111111 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i31111111 % Fields.SpotShadowColor;
                                            int i31111112 = i31111111 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i31111113 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i31111113 % Fields.SpotShadowColor;
                                        int i31111114 = i31111113 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 3) + (i11 << 1);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i3 = i10;
                                i13 = 0;
                                while (i3 < iMin2) {
                                    cCharAt4 = str.charAt(i3);
                                    int i31111115 = iMin2;
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i31111116 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i31111116 % Fields.SpotShadowColor;
                                        int i31111117 = i31111116 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i3 - i10)) {
                                    i13 = (i13 << 3) + (i13 << 1);
                                }
                                while (i3 < str.length()) {
                                    int i31111118 = RemoteActionCompatParcelizer + 59;
                                    IconCompatParcelizer = i31111118 % Fields.SpotShadowColor;
                                    int i31111119 = i31111118 % 2;
                                    i3++;
                                }
                                if (i3 != i9) {
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                return 0L;
                            }
                            j6 = j2;
                            cCharAt2 = str.charAt(i3);
                            if (cCharAt2 == 'D') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                            } else if (cCharAt2 == 'H') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                            } else if (cCharAt2 == 'M') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                setunregisteredinappmessage = null;
                            } else {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                            }
                            if (setunregisteredinappmessage == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (setunregisteredinappmessage2 != null) {
                                c = '+';
                                int i412 = RemoteActionCompatParcelizer + 43;
                                IconCompatParcelizer = i412 % Fields.SpotShadowColor;
                                i8 = 2;
                                int i413 = i412 % 2;
                                if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                    return 0L;
                                }
                            } else {
                                c = '+';
                                i8 = 2;
                            }
                            if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                if (z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                            } else {
                                if (!z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                if (jSerializer == 9223372036854759646L) {
                                    j3 = jWrite;
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                j3 = jWrite;
                                jWrite = jSerializer;
                            }
                            i23 = i3 + 1;
                            setunregisteredinappmessage2 = setunregisteredinappmessage;
                            c3 = c;
                            i19 = i8;
                            i = i5;
                            j5 = 0;
                            c2 = '-';
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                    return 0L;
                    j = (j << 3) + (j << 1) + ((long) i15);
                    i3++;
                    i = i5;
                    j6 = j2;
                }
            } else {
                cCharAt = str.charAt(i23);
                if (cCharAt == 'T') {
                    if (!z) {
                        i18 = IconCompatParcelizer + 115;
                        RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                        if (i18 % i19 != 0) {
                            i23 += 74;
                            if (i23 == str.length()) {
                            }
                            z = true;
                        } else {
                            i23++;
                            if (i23 == str.length()) {
                            }
                            z = true;
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                    return j5;
                }
                setTestingInstanceandroid_sdk_ui_release settestinginstanceandroid_sdk_ui_release5 = setTestingInstanceandroid_sdk_ui_release.read;
                BrazeInAppMessageManagerregisterInAppMessageManager52.read();
                settestinginstanceandroid_sdk_ui_release = setTestingInstanceandroid_sdk_ui_release.read;
                if (settestinginstanceandroid_sdk_ui_release.write) {
                    i3 = i23;
                    i4 = 1;
                } else {
                    cCharAt8 = str.charAt(i23);
                    if (cCharAt8 != c3) {
                        i3 = i23 + 1;
                        i4 = 1;
                    } else if (cCharAt8 != c2) {
                        i3 = i23;
                        i4 = 1;
                    } else {
                        i3 = i23 + 1;
                        i4 = -1;
                    }
                }
                while (i3 < str.length()) {
                    i17 = IconCompatParcelizer + 33;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    if (i17 % i19 != 0) {
                        if (str.charAt(i3) != 'm') {
                            i3++;
                        } else {
                            j = 0;
                            while (true) {
                                i5 = i;
                                if (i3 < str.length()) {
                                    cCharAt6 = str.charAt(i3);
                                    j2 = j6;
                                    if ('0' > cCharAt6) {
                                    }
                                } else {
                                    j2 = j6;
                                }
                                if (i3 != str.length()) {
                                    i6 = RemoteActionCompatParcelizer + 103;
                                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                                    if (i6 % 2 == 0) {
                                        if (i3 == i23 + i7) {
                                        }
                                        if (str.charAt(i3) == '.') {
                                            i9 = i3 + 1;
                                            iMin = Math.min(i3 + 7, str.length());
                                            i11 = 0;
                                            while (i10 < iMin) {
                                                int i2112 = RemoteActionCompatParcelizer + 15;
                                                IconCompatParcelizer = i2112 % Fields.SpotShadowColor;
                                                int i2113 = i2112 % 2;
                                                cCharAt5 = str.charAt(i10);
                                                if ('0' <= cCharAt5) {
                                                }
                                                while (i12 < 6 - (i10 - i9)) {
                                                    i11 = (i11 << 3) + (i11 << 1);
                                                }
                                                iMin2 = Math.min(i10 + 9, str.length());
                                                i3 = i10;
                                                i13 = 0;
                                                while (i3 < iMin2) {
                                                    cCharAt4 = str.charAt(i3);
                                                    int i311111110 = iMin2;
                                                    if ('0' <= cCharAt4) {
                                                    }
                                                    while (i14 < 9 - (i3 - i10)) {
                                                        i13 = (i13 << 3) + (i13 << 1);
                                                    }
                                                    while (i3 < str.length()) {
                                                        int i311111111 = RemoteActionCompatParcelizer + 59;
                                                        IconCompatParcelizer = i311111111 % Fields.SpotShadowColor;
                                                        int i311111112 = i311111111 % 2;
                                                        i3++;
                                                    }
                                                    if (i3 != i9) {
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                    return 0L;
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i311111113 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i311111113 % Fields.SpotShadowColor;
                                                    int i311111114 = i311111113 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i311111115 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i311111116 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i311111116 % Fields.SpotShadowColor;
                                                    int i311111117 = i311111116 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i311111118 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i311111118 % Fields.SpotShadowColor;
                                                int i311111119 = i311111118 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j6 = j2;
                                        cCharAt2 = str.charAt(i3);
                                        if (cCharAt2 == 'D') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                        } else if (cCharAt2 == 'H') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                        } else if (cCharAt2 == 'M') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                        } else if (cCharAt2 != 'S') {
                                            setunregisteredinappmessage = null;
                                        } else {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                        }
                                        if (setunregisteredinappmessage == null) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                        }
                                        if (setunregisteredinappmessage2 != null) {
                                            c = '+';
                                            int i414 = RemoteActionCompatParcelizer + 43;
                                            IconCompatParcelizer = i414 % Fields.SpotShadowColor;
                                            i8 = 2;
                                            int i415 = i414 % 2;
                                            if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                                return 0L;
                                            }
                                        } else {
                                            c = '+';
                                            i8 = 2;
                                        }
                                        if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                            if (z) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                        } else {
                                            if (!z) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                            if (jSerializer == 9223372036854759646L) {
                                                j3 = jWrite;
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            j3 = jWrite;
                                            jWrite = jSerializer;
                                        }
                                        i23 = i3 + 1;
                                        setunregisteredinappmessage2 = setunregisteredinappmessage;
                                        c3 = c;
                                        i19 = i8;
                                        i = i5;
                                        j5 = 0;
                                        c2 = '-';
                                    } else {
                                        if (i3 == i23 + i7) {
                                        }
                                        if (str.charAt(i3) == '.') {
                                            i9 = i3 + 1;
                                            iMin = Math.min(i3 + 7, str.length());
                                            i11 = 0;
                                            while (i10 < iMin) {
                                                int i2114 = RemoteActionCompatParcelizer + 15;
                                                IconCompatParcelizer = i2114 % Fields.SpotShadowColor;
                                                int i2115 = i2114 % 2;
                                                cCharAt5 = str.charAt(i10);
                                                if ('0' <= cCharAt5) {
                                                }
                                                while (i12 < 6 - (i10 - i9)) {
                                                    i11 = (i11 << 3) + (i11 << 1);
                                                }
                                                iMin2 = Math.min(i10 + 9, str.length());
                                                i3 = i10;
                                                i13 = 0;
                                                while (i3 < iMin2) {
                                                    cCharAt4 = str.charAt(i3);
                                                    int i3111111110 = iMin2;
                                                    if ('0' <= cCharAt4) {
                                                    }
                                                    while (i14 < 9 - (i3 - i10)) {
                                                        i13 = (i13 << 3) + (i13 << 1);
                                                    }
                                                    while (i3 < str.length()) {
                                                        int i3111111111 = RemoteActionCompatParcelizer + 59;
                                                        IconCompatParcelizer = i3111111111 % Fields.SpotShadowColor;
                                                        int i3111111112 = i3111111111 % 2;
                                                        i3++;
                                                    }
                                                    if (i3 != i9) {
                                                    }
                                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                    return 0L;
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i3111111113 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i3111111113 % Fields.SpotShadowColor;
                                                    int i3111111114 = i3111111113 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i3111111115 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i3111111116 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i3111111116 % Fields.SpotShadowColor;
                                                    int i3111111117 = i3111111116 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i3111111118 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i3111111118 % Fields.SpotShadowColor;
                                                int i3111111119 = i3111111118 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j6 = j2;
                                        cCharAt2 = str.charAt(i3);
                                        if (cCharAt2 == 'D') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                        } else if (cCharAt2 == 'H') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                        } else if (cCharAt2 == 'M') {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                        } else if (cCharAt2 != 'S') {
                                            setunregisteredinappmessage = null;
                                        } else {
                                            setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                        }
                                        if (setunregisteredinappmessage == null) {
                                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                        }
                                        if (setunregisteredinappmessage2 != null) {
                                            c = '+';
                                            int i416 = RemoteActionCompatParcelizer + 43;
                                            IconCompatParcelizer = i416 % Fields.SpotShadowColor;
                                            i8 = 2;
                                            int i417 = i416 % 2;
                                            if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                                return 0L;
                                            }
                                        } else {
                                            c = '+';
                                            i8 = 2;
                                        }
                                        if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                            if (z) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                        } else {
                                            if (!z) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                            if (jSerializer == 9223372036854759646L) {
                                                j3 = jWrite;
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            j3 = jWrite;
                                            jWrite = jSerializer;
                                        }
                                        i23 = i3 + 1;
                                        setunregisteredinappmessage2 = setunregisteredinappmessage;
                                        c3 = c;
                                        i19 = i8;
                                        i = i5;
                                        j5 = 0;
                                        c2 = '-';
                                    }
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                return 0L;
                                j = (j << 3) + (j << 1) + ((long) i15);
                                i3++;
                                i = i5;
                                j6 = j2;
                            }
                        }
                    } else if (str.charAt(i3) == '0') {
                        i3++;
                    } else {
                        j = 0;
                        while (true) {
                            i5 = i;
                            if (i3 < str.length()) {
                                cCharAt6 = str.charAt(i3);
                                j2 = j6;
                                if ('0' > cCharAt6) {
                                }
                            } else {
                                j2 = j6;
                            }
                            if (i3 != str.length()) {
                                i6 = RemoteActionCompatParcelizer + 103;
                                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 == 0) {
                                    if (i3 == i23 + i7) {
                                    }
                                    if (str.charAt(i3) == '.') {
                                        i9 = i3 + 1;
                                        iMin = Math.min(i3 + 7, str.length());
                                        i11 = 0;
                                        while (i10 < iMin) {
                                            int i2116 = RemoteActionCompatParcelizer + 15;
                                            IconCompatParcelizer = i2116 % Fields.SpotShadowColor;
                                            int i2117 = i2116 % 2;
                                            cCharAt5 = str.charAt(i10);
                                            if ('0' <= cCharAt5) {
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i31111111110 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i31111111111 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i31111111111 % Fields.SpotShadowColor;
                                                    int i31111111112 = i31111111111 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i31111111113 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i31111111113 % Fields.SpotShadowColor;
                                                int i31111111114 = i31111111113 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i12 < 6 - (i10 - i9)) {
                                            i11 = (i11 << 3) + (i11 << 1);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i3 = i10;
                                        i13 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt4 = str.charAt(i3);
                                            int i31111111115 = iMin2;
                                            if ('0' <= cCharAt4) {
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i31111111116 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i31111111116 % Fields.SpotShadowColor;
                                                int i31111111117 = i31111111116 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i31111111118 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i31111111118 % Fields.SpotShadowColor;
                                            int i31111111119 = i31111111118 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    j6 = j2;
                                    cCharAt2 = str.charAt(i3);
                                    if (cCharAt2 == 'D') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                    } else if (cCharAt2 == 'H') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    } else if (cCharAt2 == 'M') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                    } else if (cCharAt2 != 'S') {
                                        setunregisteredinappmessage = null;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                    }
                                    if (setunregisteredinappmessage == null) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                    }
                                    if (setunregisteredinappmessage2 != null) {
                                        c = '+';
                                        int i418 = RemoteActionCompatParcelizer + 43;
                                        IconCompatParcelizer = i418 % Fields.SpotShadowColor;
                                        i8 = 2;
                                        int i419 = i418 % 2;
                                        if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                            return 0L;
                                        }
                                    } else {
                                        c = '+';
                                        i8 = 2;
                                    }
                                    if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                        if (z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                    } else {
                                        if (!z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                        if (jSerializer == 9223372036854759646L) {
                                            j3 = jWrite;
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j3 = jWrite;
                                        jWrite = jSerializer;
                                    }
                                    i23 = i3 + 1;
                                    setunregisteredinappmessage2 = setunregisteredinappmessage;
                                    c3 = c;
                                    i19 = i8;
                                    i = i5;
                                    j5 = 0;
                                    c2 = '-';
                                } else {
                                    if (i3 == i23 + i7) {
                                    }
                                    if (str.charAt(i3) == '.') {
                                        i9 = i3 + 1;
                                        iMin = Math.min(i3 + 7, str.length());
                                        i11 = 0;
                                        while (i10 < iMin) {
                                            int i2118 = RemoteActionCompatParcelizer + 15;
                                            IconCompatParcelizer = i2118 % Fields.SpotShadowColor;
                                            int i2119 = i2118 % 2;
                                            cCharAt5 = str.charAt(i10);
                                            if ('0' <= cCharAt5) {
                                            }
                                            while (i12 < 6 - (i10 - i9)) {
                                                i11 = (i11 << 3) + (i11 << 1);
                                            }
                                            iMin2 = Math.min(i10 + 9, str.length());
                                            i3 = i10;
                                            i13 = 0;
                                            while (i3 < iMin2) {
                                                cCharAt4 = str.charAt(i3);
                                                int i311111111110 = iMin2;
                                                if ('0' <= cCharAt4) {
                                                }
                                                while (i14 < 9 - (i3 - i10)) {
                                                    i13 = (i13 << 3) + (i13 << 1);
                                                }
                                                while (i3 < str.length()) {
                                                    int i311111111111 = RemoteActionCompatParcelizer + 59;
                                                    IconCompatParcelizer = i311111111111 % Fields.SpotShadowColor;
                                                    int i311111111112 = i311111111111 % 2;
                                                    i3++;
                                                }
                                                if (i3 != i9) {
                                                }
                                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                                return 0L;
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i311111111113 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i311111111113 % Fields.SpotShadowColor;
                                                int i311111111114 = i311111111113 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i12 < 6 - (i10 - i9)) {
                                            i11 = (i11 << 3) + (i11 << 1);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i3 = i10;
                                        i13 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt4 = str.charAt(i3);
                                            int i311111111115 = iMin2;
                                            if ('0' <= cCharAt4) {
                                            }
                                            while (i14 < 9 - (i3 - i10)) {
                                                i13 = (i13 << 3) + (i13 << 1);
                                            }
                                            while (i3 < str.length()) {
                                                int i311111111116 = RemoteActionCompatParcelizer + 59;
                                                IconCompatParcelizer = i311111111116 % Fields.SpotShadowColor;
                                                int i311111111117 = i311111111116 % 2;
                                                i3++;
                                            }
                                            if (i3 != i9) {
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i311111111118 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i311111111118 % Fields.SpotShadowColor;
                                            int i311111111119 = i311111111118 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    j6 = j2;
                                    cCharAt2 = str.charAt(i3);
                                    if (cCharAt2 == 'D') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                                    } else if (cCharAt2 == 'H') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                                    } else if (cCharAt2 == 'M') {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                                    } else if (cCharAt2 != 'S') {
                                        setunregisteredinappmessage = null;
                                    } else {
                                        setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                                    }
                                    if (setunregisteredinappmessage == null) {
                                        throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                                    }
                                    if (setunregisteredinappmessage2 != null) {
                                        c = '+';
                                        int i4110 = RemoteActionCompatParcelizer + 43;
                                        IconCompatParcelizer = i4110 % Fields.SpotShadowColor;
                                        i8 = 2;
                                        int i4111 = i4110 % 2;
                                        if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                            return 0L;
                                        }
                                    } else {
                                        c = '+';
                                        i8 = 2;
                                    }
                                    if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                        if (z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                                    } else {
                                        if (!z) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                        if (jSerializer == 9223372036854759646L) {
                                            j3 = jWrite;
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                            return 0L;
                                        }
                                        j3 = jWrite;
                                        jWrite = jSerializer;
                                    }
                                    i23 = i3 + 1;
                                    setunregisteredinappmessage2 = setunregisteredinappmessage;
                                    c3 = c;
                                    i19 = i8;
                                    i = i5;
                                    j5 = 0;
                                    c2 = '-';
                                }
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                            return 0L;
                            j = (j << 3) + (j << 1) + ((long) i15);
                            i3++;
                            i = i5;
                            j6 = j2;
                        }
                    }
                }
                j = 0;
                while (true) {
                    i5 = i;
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        j2 = j6;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        j2 = j6;
                    }
                    if (i3 != str.length()) {
                        i6 = RemoteActionCompatParcelizer + 103;
                        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            if (i3 == i23 + i7) {
                            }
                            if (str.charAt(i3) == '.') {
                                i9 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    int i21110 = RemoteActionCompatParcelizer + 15;
                                    IconCompatParcelizer = i21110 % Fields.SpotShadowColor;
                                    int i21111 = i21110 % 2;
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 3) + (i11 << 1);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i3 = i10;
                                    i13 = 0;
                                    while (i3 < iMin2) {
                                        cCharAt4 = str.charAt(i3);
                                        int i3111111111110 = iMin2;
                                        if ('0' <= cCharAt4) {
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i3111111111111 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i3111111111111 % Fields.SpotShadowColor;
                                            int i3111111111112 = i3111111111111 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i3111111111113 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i3111111111113 % Fields.SpotShadowColor;
                                        int i3111111111114 = i3111111111113 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 3) + (i11 << 1);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i3 = i10;
                                i13 = 0;
                                while (i3 < iMin2) {
                                    cCharAt4 = str.charAt(i3);
                                    int i3111111111115 = iMin2;
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i3111111111116 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i3111111111116 % Fields.SpotShadowColor;
                                        int i3111111111117 = i3111111111116 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i3 - i10)) {
                                    i13 = (i13 << 3) + (i13 << 1);
                                }
                                while (i3 < str.length()) {
                                    int i3111111111118 = RemoteActionCompatParcelizer + 59;
                                    IconCompatParcelizer = i3111111111118 % Fields.SpotShadowColor;
                                    int i3111111111119 = i3111111111118 % 2;
                                    i3++;
                                }
                                if (i3 != i9) {
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                return 0L;
                            }
                            j6 = j2;
                            cCharAt2 = str.charAt(i3);
                            if (cCharAt2 == 'D') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                            } else if (cCharAt2 == 'H') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                            } else if (cCharAt2 == 'M') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                setunregisteredinappmessage = null;
                            } else {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                            }
                            if (setunregisteredinappmessage == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (setunregisteredinappmessage2 != null) {
                                c = '+';
                                int i4112 = RemoteActionCompatParcelizer + 43;
                                IconCompatParcelizer = i4112 % Fields.SpotShadowColor;
                                i8 = 2;
                                int i4113 = i4112 % 2;
                                if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                    return 0L;
                                }
                            } else {
                                c = '+';
                                i8 = 2;
                            }
                            if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                if (z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                            } else {
                                if (!z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                if (jSerializer == 9223372036854759646L) {
                                    j3 = jWrite;
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                j3 = jWrite;
                                jWrite = jSerializer;
                            }
                            i23 = i3 + 1;
                            setunregisteredinappmessage2 = setunregisteredinappmessage;
                            c3 = c;
                            i19 = i8;
                            i = i5;
                            j5 = 0;
                            c2 = '-';
                        } else {
                            if (i3 == i23 + i7) {
                            }
                            if (str.charAt(i3) == '.') {
                                i9 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    int i21112 = RemoteActionCompatParcelizer + 15;
                                    IconCompatParcelizer = i21112 % Fields.SpotShadowColor;
                                    int i21113 = i21112 % 2;
                                    cCharAt5 = str.charAt(i10);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 3) + (i11 << 1);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i3 = i10;
                                    i13 = 0;
                                    while (i3 < iMin2) {
                                        cCharAt4 = str.charAt(i3);
                                        int i31111111111110 = iMin2;
                                        if ('0' <= cCharAt4) {
                                        }
                                        while (i14 < 9 - (i3 - i10)) {
                                            i13 = (i13 << 3) + (i13 << 1);
                                        }
                                        while (i3 < str.length()) {
                                            int i31111111111111 = RemoteActionCompatParcelizer + 59;
                                            IconCompatParcelizer = i31111111111111 % Fields.SpotShadowColor;
                                            int i31111111111112 = i31111111111111 % 2;
                                            i3++;
                                        }
                                        if (i3 != i9) {
                                        }
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                        return 0L;
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i31111111111113 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i31111111111113 % Fields.SpotShadowColor;
                                        int i31111111111114 = i31111111111113 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 3) + (i11 << 1);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i3 = i10;
                                i13 = 0;
                                while (i3 < iMin2) {
                                    cCharAt4 = str.charAt(i3);
                                    int i31111111111115 = iMin2;
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i14 < 9 - (i3 - i10)) {
                                        i13 = (i13 << 3) + (i13 << 1);
                                    }
                                    while (i3 < str.length()) {
                                        int i31111111111116 = RemoteActionCompatParcelizer + 59;
                                        IconCompatParcelizer = i31111111111116 % Fields.SpotShadowColor;
                                        int i31111111111117 = i31111111111116 % 2;
                                        i3++;
                                    }
                                    if (i3 != i9) {
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i3 - i10)) {
                                    i13 = (i13 << 3) + (i13 << 1);
                                }
                                while (i3 < str.length()) {
                                    int i31111111111118 = RemoteActionCompatParcelizer + 59;
                                    IconCompatParcelizer = i31111111111118 % Fields.SpotShadowColor;
                                    int i31111111111119 = i31111111111118 % 2;
                                    i3++;
                                }
                                if (i3 != i9) {
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                return 0L;
                            }
                            j6 = j2;
                            cCharAt2 = str.charAt(i3);
                            if (cCharAt2 == 'D') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.DAYS;
                            } else if (cCharAt2 == 'H') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.HOURS;
                            } else if (cCharAt2 == 'M') {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                setunregisteredinappmessage = null;
                            } else {
                                setunregisteredinappmessage = setUnregisteredInAppMessage.SECONDS;
                            }
                            if (setunregisteredinappmessage == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (setunregisteredinappmessage2 != null) {
                                c = '+';
                                int i4114 = RemoteActionCompatParcelizer + 43;
                                IconCompatParcelizer = i4114 % Fields.SpotShadowColor;
                                i8 = 2;
                                int i4115 = i4114 % 2;
                                if (setunregisteredinappmessage2.compareTo(setunregisteredinappmessage) <= 0) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected order of duration components");
                                    return 0L;
                                }
                            } else {
                                c = '+';
                                i8 = 2;
                            }
                            if (setunregisteredinappmessage == setUnregisteredInAppMessage.DAYS) {
                                if (z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jWrite = UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4);
                            } else {
                                if (!z) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                jSerializer = serializer(j3, UrlUtils.write(j, setunregisteredinappmessage) * ((long) i4));
                                if (jSerializer == 9223372036854759646L) {
                                    j3 = jWrite;
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                                    return 0L;
                                }
                                j3 = jWrite;
                                jWrite = jSerializer;
                            }
                            i23 = i3 + 1;
                            setunregisteredinappmessage2 = setunregisteredinappmessage;
                            c3 = c;
                            i19 = i8;
                            i = i5;
                            j5 = 0;
                            c2 = '-';
                        }
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("");
                    return 0L;
                    j = (j << 3) + (j << 1) + ((long) i15);
                    i3++;
                    i = i5;
                    j6 = j2;
                }
            }
        }
        int i50 = i;
        long j8 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(IconCompatParcelizer(jWrite, setUnregisteredInAppMessage.MILLISECONDS), IconCompatParcelizer(j6, setUnregisteredInAppMessage.NANOSECONDS));
        return (i50 == 0 || BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(j8, BrazeInAppMessageManagerExternalSyntheticLambda2.read)) ? j8 : BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(j8);
    }

    public static boolean IconCompatParcelizer(SentryOptions sentryOptions, SentryOptions sentryOptions2, boolean z) {
        Object[] objArr = {sentryOptions, sentryOptions2, Boolean.valueOf(z)};
        return ((Boolean) RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), -2085012584, 2085012584, objArr, accessunpack.serializer(), accessunpack.serializer())).booleanValue();
    }

    public static int serializer(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        return ((Integer) RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 971707443, -971707439, objArr, accessunpack.serializer(), accessunpack.serializer())).intValue();
    }

    public static final List serializer(PathDefaultImpls pathDefaultImpls) {
        int iSerializer = accessunpack.serializer();
        int iSerializer2 = accessunpack.serializer();
        return (List) RemoteActionCompatParcelizer(accessunpack.serializer(), iSerializer, 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), iSerializer2);
    }

    public static final String IconCompatParcelizer(PathDefaultImpls pathDefaultImpls) {
        int iSerializer = accessunpack.serializer();
        int iSerializer2 = accessunpack.serializer();
        return (String) RemoteActionCompatParcelizer(accessunpack.serializer(), iSerializer, -1728327972, 1728327973, new Object[]{pathDefaultImpls}, accessunpack.serializer(), iSerializer2);
    }

    public static final long serializer(long j) {
        Object[] objArr = {Long.valueOf(j)};
        return ((Long) RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), -1740381907, 1740381910, objArr, accessunpack.serializer(), accessunpack.serializer())).longValue();
    }
}
