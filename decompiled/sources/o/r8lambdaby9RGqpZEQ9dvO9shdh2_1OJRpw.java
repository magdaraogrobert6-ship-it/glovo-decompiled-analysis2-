package o;

import com.roadrunner.settings.ui.components.PreferenceItemKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaby9RGqpZEQ9dvO9shdh2_1OJRpw {
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        androidx.sqlite.SQLite.read(new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.CHAT_LANGUAGE, com.logistics.rider.glovo.R.drawable.ic_bold_large_chat_chat_support, "Chat language", "English", null), new r8lambda6juoqTAVmeOwP9B2d0JUPPbC0hI(r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.NAVIGATION, com.logistics.rider.glovo.R.drawable.ic_bold_large_map_navigate, "Navigation", null, null), new r8lambda5fC_TU5O34QRhL9Q2KJHThbLQz4(r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4.DEVICE_SETTINGS, "Device settings", "Manage storage, notification and data usage"), new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.BIOMETRIC_AUTHENTICATION, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_human_recognition), "Biometric sign in", "Use your face scan or fingerprint for fast and secure sign-in", true), new r8lambda8J_i46kCLc2AJjgbjpbbsXU3A_c(r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.SAFETY, Integer.valueOf(com.logistics.rider.glovo.R.drawable.ic_bold_large_safety_good), "Safety tracking", "Turn it on to get insights on your driving behaviour to improve your road safety", true));
        int i = serializer + 77;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void read(String str, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        int i5;
        boolean zIconCompatParcelizer;
        int i6;
        int i7 = 2 % 2;
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1769374065);
        if ((i & 6) == 0) {
            int i8 = read + 25;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.read(str);
                throw null;
            }
            if (getpostalcode.read(str)) {
                int i9 = read + 43;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i11 = read + 17;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i12 = read + 103;
                write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i12 % 2 == 0 ? 17924 : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            int i13 = read + 15;
            write = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i15 = write + 89;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i4 = androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i17 = write + 75;
            read = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i19 = read + 95;
                write = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i20 = i19 % 2;
                i3 = androidx.compose.ui.graphics.Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
        }
        int i21 = i2 | 1572864;
        if ((599187 & i21) != 599186) {
            int i22 = read + 123;
            write = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i23 = i22 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i21 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            PreferenceItemKt.PreferenceCategory(str, companion, null, coil3.ExtrasKt.write(-1900933176, new r8lambda_v3K3qRoEuaXipwu4kB6dWEc1D8(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, 1), getpostalcode), getpostalcode, (i21 & 14) | 3072 | ((i21 >> 15) & 112), 4);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl((Object) str, (Object) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (isInvalidIndex) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm3, (Object) modifier2, i, 21);
        }
    }
}
