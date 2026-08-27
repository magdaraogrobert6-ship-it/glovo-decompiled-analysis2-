package com.roadrunner.settings.ui.components;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SubList;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.populateViewStructure;
import o.r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PromotionsSectionKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;

    static {
        SQLite.read(new r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ("https://daytime-icon", "Daytime", "(08:00 - 21:00)", false, "daytime", true), new r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ("https://night-time-icon", "Night time", "(21:00 - 08:00)", true, "night-time", true), new r8lambda6lBbiU9eA4HcJTh7fZj0mBlQlbQ("https://night-time-icon", "Night time", "(21:00 - 08:00)", true, "night-time", false));
        int i = read + 41;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[PHI: r1
  0x0052: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r1
  0x0034: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void write(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = write + 23;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(220113697);
            if ((i & 19) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                }
                if (zIconCompatParcelizer) {
                    int i6 = write + 121;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(220113697);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                }
                if (zIconCompatParcelizer) {
                    int i8 = write + 121;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 109;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= !(getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true) ? 32 : 16;
        }
        int i12 = i3 | 384;
        if (getpostalcode.write(i12 & 1, !((i12 & 147) == 146))) {
            Modifier.Companion companion = Modifier.Companion;
            PreferenceItemKt.PreferenceCategory(StringResources_androidKt.stringResource(R.string.settings_promotions_title, getpostalcode, 0), companion, StringResources_androidKt.stringResource(R.string.settings_promotions_description, getpostalcode, 0), ExtrasKt.write(-1570931286, new SnackbarKt$$ExternalSyntheticLambda2(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 15, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), getpostalcode), getpostalcode, ((i12 >> 3) & 112) | 3072, 0);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 19, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x014b  */
    public static final void PromotionsSwitch(String str, String str2, final boolean z, final boolean z2, Modifier modifier, String str3, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z3;
        Modifier modifier2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        str.getClass();
        str2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1175199518);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.write(z)) {
                int i7 = write + 55;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 256;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.write(z2)) {
                int i9 = write + 71;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 10985 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        int i10 = i2 | 24576;
        if ((196608 & i) == 0) {
            i10 |= getpostalcode.read(str3) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i11 = RemoteActionCompatParcelizer + 71;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i10 |= i3;
        }
        if ((599187 & i10) != 599186) {
            int i13 = RemoteActionCompatParcelizer + 103;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i10 & 1, z3)) {
            Modifier.Companion companion = Modifier.Companion;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
            try {
                builder.append(str);
                builder.pop(iPushStyle);
                builder.append(" ");
                builder.append(str2);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if ((3670016 & i10) == 1048576) {
                    int i15 = write + 75;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z5 = (i10 & 896) == 256;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!z5 && !z4) {
                    int i17 = write + 59;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        int i18 = 59 / 0;
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = new SubList(4, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                            getpostalcode.write(objComponentActivity);
                        }
                    } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new SubList(4, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getpostalcode.write(objComponentActivity);
                    }
                } else {
                    objComponentActivity = new SubList(4, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity);
                }
                PreferenceItemKt.PreferenceItem(annotatedString, companion, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, str3, true, null, ExtrasKt.write(-2034127419, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.r8lambdab4vRrVni6imf3U9qyccLn5V74
                    private static int IconCompatParcelizer = 0;
                    private static int serializer = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z6;
                        int i19 = 2 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if ((iIntValue & 3) != 2) {
                            z6 = true;
                        } else {
                            int i20 = IconCompatParcelizer + 87;
                            serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            z6 = false;
                        }
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(iIntValue & 1, z6)) {
                            int i22 = serializer + 125;
                            IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i23 = i22 % 2;
                            shouldRetryAfterFailure.read(z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(androidx.compose.ui.Modifier.Companion, Dimensions.setVisibility), Dimensions.setCustomView), z2, getpostalcode2, 0, 0);
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, ((i10 >> 9) & 112) | 102236160 | (i10 & 458752), 148);
                modifier2 = companion;
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new populateViewStructure(str, str2, z, z2, modifier2, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
        }
    }
}
