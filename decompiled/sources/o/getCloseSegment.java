package o;

import android.content.res.AssetManager;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.AbstractList;
import okio.Okio;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class getCloseSegment implements toSvgdefault {
    private static long IconCompatParcelizer = -2187362747804454601L;
    private static int RatingCompat = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final PathDefaultImpls read;
    public final getBlurRadiusannotations serializer;

    public /* synthetic */ getCloseSegment(PathDefaultImpls pathDefaultImpls, getBlurRadiusannotations getblurradiusannotations, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = pathDefaultImpls;
        this.serializer = getblurradiusannotations;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        accesstoViewVelocity accesstoviewvelocity = new accesstoViewVelocity();
        accesstoviewvelocity.IconCompatParcelizer = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            int i2 = accesstoviewvelocity.write;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[accesstoviewvelocity.write]), accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1166805757);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 45251), 2179 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 15, 1789121762, false, com.braze.Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i2] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 7879248456549226868L);
                Object[] objArr3 = {accesstoviewvelocity, accesstoviewvelocity};
                Object objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), 279 - AndroidCharacter.getMirror('0'), 21 - View.resolveSizeAndState(0, 0, 0), 107586304, false, "e", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        accesstoviewvelocity.write = 0;
        while (accesstoviewvelocity.write < cArr.length) {
            cArr2[accesstoviewvelocity.write] = (char) jArr[accesstoviewvelocity.write];
            Object[] objArr4 = {accesstoviewvelocity, accesstoviewvelocity};
            Object objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-692485407);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 231, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 21, 107586304, false, "e", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:154:0x04b3  */
    @Override // o.toSvgdefault
    public final Object fetch(getBuffer getbuffer) throws Throwable {
        Object obj;
        int iWrite;
        int iIntValue;
        r8lambdaPerbwHH8SDIIDemw55wq8JhY r8lambdaperbwhh8sdiidemw55wq8jhy;
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        int i6 = this.RemoteActionCompatParcelizer;
        getBlurRadiusannotations getblurradiusannotations = this.serializer;
        PathDefaultImpls pathDefaultImpls = this.read;
        String strSerializer = null;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    String strIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.serializer((List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer()), 1), "/", null, null, null, 62);
                    try {
                        Object[] objArr = {getblurradiusannotations.write.getAssets(), strIconCompatParcelizer};
                        Object objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer(-1791441156);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = setFontSizeR2X_6o.RemoteActionCompatParcelizer((char) ((Process.myTid() >> 22) + 26244), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 13 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1172891421, false, "write", new Class[]{AssetManager.class, String.class});
                        }
                        getIntersect getintersect = new getIntersect(new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer((InputStream) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr))), getblurradiusannotations.IconCompatParcelizer, new accessgetEmptyPathp(strIconCompatParcelizer));
                        if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                            String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strIconCompatParcelizer, '#'), '?');
                            String strIconCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('/', strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer), "");
                            if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer2)) {
                                java.util.Locale locale = java.util.Locale.ROOT;
                                int i7 = RatingCompat + 83;
                                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                String str = (String) String.class.getMethod("toLowerCase", java.util.Locale.class).invoke(strIconCompatParcelizer2, locale);
                                str.getClass();
                                String str2 = (String) getSquareKaPHkGw.serializer.get(str);
                                if (str2 == null) {
                                    int i9 = write + 111;
                                    RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i9 % 2 == 0) {
                                        StrokeJoin.serializer(str);
                                        throw null;
                                    }
                                    strSerializer = StrokeJoin.serializer(str);
                                } else {
                                    strSerializer = str2;
                                }
                            }
                        }
                        return new PixelMap(getintersect, strSerializer, getSegmentdefault.DISK);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (i6 != 2) {
                    String str3 = pathDefaultImpls.read;
                    if (str3 == null) {
                        str3 = "";
                    }
                    int iWrite2 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str3, '!', 0, false, 6);
                    if (iWrite2 == -1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(pathDefaultImpls, "Invalid jar:file URI: ");
                        return null;
                    }
                    String str4 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
                    RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer = Path$Companion.IconCompatParcelizer((String) String.class.getMethod("substring", Integer.TYPE, Integer.TYPE).invoke(str3, 0, Integer.valueOf(iWrite2)));
                    RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer2 = Path$Companion.IconCompatParcelizer((String) String.class.getMethod("substring", Integer.TYPE, Integer.TYPE).invoke(str3, Integer.valueOf(iWrite2 + 1), Integer.valueOf(((Integer) String.class.getMethod("length", null).invoke(str3, null)).intValue())));
                    HttpUrlFetcher httpUrlFetcher = getblurradiusannotations.IconCompatParcelizer;
                    httpUrlFetcher.getClass();
                    getXorb3I0S0c getxorb3i0s0cRemoteActionCompatParcelizer = getUnionb3I0S0c.RemoteActionCompatParcelizer(recyclableBufferedInputStreamIconCompatParcelizer2, ThrowableExtensionsKt.IconCompatParcelizer(recyclableBufferedInputStreamIconCompatParcelizer, httpUrlFetcher, new BrazeInAppMessageManagerCompanion(2)), null, null, 28);
                    String strIconCompatParcelizer3 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', recyclableBufferedInputStreamIconCompatParcelizer2.write(), "");
                    if (!hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer3)) {
                        String str5 = (String) String.class.getMethod("toLowerCase", java.util.Locale.class).invoke(strIconCompatParcelizer3, java.util.Locale.ROOT);
                        str5.getClass();
                        strSerializer = (String) getSquareKaPHkGw.serializer.get(str5);
                        if (strSerializer == null) {
                            strSerializer = StrokeJoin.serializer(str5);
                        }
                    }
                    return new PixelMap(getxorb3i0s0cRemoteActionCompatParcelizer, strSerializer, getSegmentdefault.DISK);
                }
                String str6 = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
                String str7 = (String) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), -1728327972, 1728327973, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer());
                if (str7 == null) {
                    Object[] objArr2 = new Object[1];
                    a(39502 - TextUtils.lastIndexOf("", '0', 0), new char[]{10277, 45669, 7345, 59083, 16687, 11177, 46573, 4098, 64027, 17593, 12136, 35078, 5017, 65077, 22653, 8846}, objArr2);
                    ScreenStartObserver$$ExternalSyntheticLambda0.write((String) objArr2[0]);
                    return null;
                }
                RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer3 = Path$Companion.IconCompatParcelizer(str7);
                getXorb3I0S0c getxorb3i0s0cRemoteActionCompatParcelizer2 = getUnionb3I0S0c.RemoteActionCompatParcelizer(recyclableBufferedInputStreamIconCompatParcelizer3, getblurradiusannotations.IconCompatParcelizer, null, null, 28);
                String strIconCompatParcelizer4 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', recyclableBufferedInputStreamIconCompatParcelizer3.write(), "");
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer4)) {
                    int i10 = RatingCompat + 125;
                    write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        int i11 = 22 / 0;
                    }
                } else {
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    int i12 = RatingCompat + 69;
                    write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    String str8 = (String) String.class.getMethod("toLowerCase", java.util.Locale.class).invoke(strIconCompatParcelizer4, locale2);
                    str8.getClass();
                    strSerializer = (String) getSquareKaPHkGw.serializer.get(str8);
                    if (strSerializer == null) {
                        strSerializer = StrokeJoin.serializer(str8);
                    }
                }
                return new PixelMap(getxorb3i0s0cRemoteActionCompatParcelizer2, strSerializer, getSegmentdefault.DISK);
            }
            String str9 = pathDefaultImpls.write;
            String str10 = pathDefaultImpls.write;
            int iWrite3 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str9, ";base64,", 0, false, 6);
            if (iWrite3 == -1 || (iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str10, ':', 0, false, 6)) == -1) {
                obj = null;
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(pathDefaultImpls, "invalid data uri: ");
            } else {
                int i14 = iWrite + 1;
                int i15 = RatingCompat + 67;
                write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                String str11 = (String) String.class.getMethod("substring", Integer.TYPE, Integer.TYPE).invoke(str10, Integer.valueOf(i14), Integer.valueOf(iWrite3));
                r8lambdaOQNjlWJzvCEP_0cljqxgCHXGAH0 r8lambdaoqnjlwjzvcep_0cljqxgchxgah0 = r8lambdaOGOWeRoIiFzM8TQzVJu3O_A33VU.write;
                int i17 = iWrite3 + 8;
                int i18 = RatingCompat + 47;
                write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    iIntValue = ((Integer) String.class.getMethod("length", null).invoke(str10, null)).intValue();
                    r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.getClass();
                    r8lambdaperbwhh8sdiidemw55wq8jhy = r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.serializer;
                    z = r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.IconCompatParcelizer;
                    int i19 = 58 / 0;
                } else {
                    iIntValue = ((Integer) String.class.getMethod("length", null).invoke(str10, null)).intValue();
                    r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.getClass();
                    r8lambdaperbwhh8sdiidemw55wq8jhy = r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.serializer;
                    z = r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.IconCompatParcelizer;
                }
                int iIntValue2 = ((Integer) String.class.getMethod("length", null).invoke(str10, null)).intValue();
                DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
                defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
                DefaultContentCardsViewBindingHandlerCompanionCREATOR1.write(i17, iIntValue, iIntValue2);
                Object objInvoke = String.class.getMethod("substring", Integer.TYPE, Integer.TYPE).invoke(str10, Integer.valueOf(i17), Integer.valueOf(iIntValue));
                Charset charset = ensureSubscribedToInAppMessageEvents.IconCompatParcelizer;
                int i20 = write + 103;
                RatingCompat = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i21 = i20 % 2;
                Object[] objArr3 = new Object[1];
                a(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 5148, new char[]{10276, 15421, 1, 5200, 30806, 19632, 20612, 42125}, objArr3);
                byte[] bArr = (byte[]) String.class.getMethod((String) objArr3[0], Charset.class).invoke(objInvoke, charset);
                bArr.getClass();
                int length = bArr.length;
                int length2 = bArr.length;
                defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
                DefaultContentCardsViewBindingHandlerCompanionCREATOR1.write(0, length, length2);
                int i22 = -2;
                if (length == 0) {
                    i2 = 0;
                } else if (length != 1) {
                    if (z) {
                        i = length;
                        for (int i23 = 0; i23 < length; i23++) {
                            int i24 = r8lambdaRNRxNNsYruLAKMT2gue35BXLPU.serializer[bArr[i23] & 255];
                            if (i24 < 0) {
                                if (i24 == -2) {
                                    i -= length - i23;
                                    break;
                                }
                                i--;
                            }
                        }
                    } else {
                        i = length - 1;
                        if (bArr[i] == 61) {
                            int i25 = length - 2;
                            if (bArr[i25] == 61) {
                                i = i25;
                            }
                        } else {
                            i = length;
                        }
                    }
                    i2 = (int) ((((long) i) * 6) / 8);
                } else {
                    obj = null;
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(length, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                }
                byte[] bArr2 = new byte[i2];
                int[] iArr = r8lambdaoqnjlwjzvcep_0cljqxgchxgah0.read ? r8lambdaRNRxNNsYruLAKMT2gue35BXLPU.write : r8lambdaRNRxNNsYruLAKMT2gue35BXLPU.serializer;
                int i26 = -8;
                int i27 = -8;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (true) {
                    if (i29 >= length) {
                        i3 = i22;
                        z2 = false;
                        break;
                    }
                    if (i27 == i26 && (i4 = i29 + 3) < length) {
                        int i31 = iArr[bArr[i4] & 255] | (iArr[bArr[i29 + 2] & 255] << 6) | (iArr[bArr[i29 + 1] & 255] << 12) | (iArr[bArr[i29] & 255] << 18);
                        if (i31 >= 0) {
                            bArr2[i28] = (byte) (i31 >> 16);
                            bArr2[i28 + 1] = (byte) (i31 >> 8);
                            bArr2[i28 + 2] = (byte) i31;
                            i29 += 4;
                            i28 += 3;
                        }
                        i22 = -2;
                        i26 = -8;
                    }
                    int i32 = bArr[i29] & 255;
                    int i33 = iArr[i32];
                    if (i33 >= 0) {
                        i29++;
                        int i34 = (i30 << 6) | i33;
                        int i35 = i27 + 6;
                        if (i35 >= 0) {
                            int i36 = write + 83;
                            RatingCompat = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i37 = i36 % 2;
                            bArr2[i28] = (byte) (i34 >>> i35);
                            i34 &= (1 << i35) - 1;
                            i27 -= 2;
                            i28++;
                        } else {
                            i27 = i35;
                        }
                        i30 = i34;
                    } else {
                        if (i33 == -2) {
                            if (i27 == -8) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i29, "Redundant pad character at index "));
                            } else if (i27 == -6) {
                                if (r8lambdaperbwhh8sdiidemw55wq8jhy != r8lambdaPerbwHH8SDIIDemw55wq8JhY.ABSENT) {
                                    i29++;
                                    i3 = -2;
                                    z2 = true;
                                    break;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i29, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            } else if (i27 != -4) {
                                if (i27 == -2) {
                                    i29++;
                                    i3 = -2;
                                    z2 = true;
                                    break;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Unreachable");
                            } else if (r8lambdaperbwhh8sdiidemw55wq8jhy != r8lambdaPerbwHH8SDIIDemw55wq8JhY.ABSENT) {
                                int i38 = i29 + 1;
                                if (z) {
                                    while (i38 < length) {
                                        if (r8lambdaRNRxNNsYruLAKMT2gue35BXLPU.serializer[bArr[i38] & 255] != -1) {
                                            int i39 = write + 5;
                                            RatingCompat = i39 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i40 = i39 % 2;
                                            break;
                                        }
                                        i38++;
                                    }
                                }
                                if (i38 != length && bArr[i38] == 61) {
                                    i29 = i38 + 1;
                                    i3 = -2;
                                    z2 = true;
                                    break;
                                }
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i38, "Missing one pad character at index "));
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i29, "The padding option is set to ABSENT, but the input has a pad character at index "));
                            }
                            return null;
                        }
                        if (!z) {
                            char c = (char) i32;
                            TuplesKt.RemoteActionCompatParcelizer(8);
                            String string = Integer.toString(i32, 8);
                            string.getClass();
                            Object[] objArr4 = new Object[1];
                            a(30637 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{10250, 24448, 51055, 20261, 63131, 32331, 58921, 28120, 38232, 7471, 34028, 3150, 46128, 15334, 41749, 11079}, objArr4);
                            throw new IllegalArgumentException(((String) objArr4[0]) + c + "'(" + string + ") at index " + i29);
                        }
                        i29++;
                    }
                    i22 = -2;
                    i26 = -8;
                }
                if (i27 == i3) {
                    obj = null;
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The last unit of input does not have enough bits");
                } else {
                    if (i27 != -8 && !z2 && r8lambdaperbwhh8sdiidemw55wq8jhy == r8lambdaPerbwHH8SDIIDemw55wq8JhY.PRESENT) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The padding option is set to PRESENT, but the input is not properly padded");
                        return null;
                    }
                    if (i30 == 0) {
                        if (z) {
                            while (i29 < length) {
                                int i41 = RatingCompat + 117;
                                write = i41 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i41 % 2 != 0) {
                                    if (r8lambdaRNRxNNsYruLAKMT2gue35BXLPU.serializer[bArr[i29] & 9152] != -1) {
                                        break;
                                    }
                                    i29++;
                                } else {
                                    if (r8lambdaRNRxNNsYruLAKMT2gue35BXLPU.serializer[bArr[i29] & 255] != -1) {
                                        break;
                                    }
                                    i29++;
                                }
                            }
                        }
                        if (i29 < length) {
                            obj = null;
                            int i42 = bArr[i29] & 255;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i42);
                            sb.append("'(");
                            TuplesKt.RemoteActionCompatParcelizer(8);
                            String string2 = Integer.toString(i42, 8);
                            string2.getClass();
                            sb.append(string2);
                            sb.append(") at index ");
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i29 - 1, " is prohibited after the pad character", sb));
                        } else {
                            if (i28 == i2) {
                                RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
                                registryMissingComponentException.write(bArr2, 0, i2);
                                return new PixelMap(new getIntersect(registryMissingComponentException, getblurradiusannotations.IconCompatParcelizer, null), str11, getSegmentdefault.MEMORY);
                            }
                            obj = null;
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
                        }
                    } else {
                        obj = null;
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The pad bits must be zeros");
                    }
                }
            }
            return obj;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }
}
