package com.roadrunner.appmigration.presentation.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.appmigration.presentation.AppMigrationBannerUiModelImpl;
import com.roadrunner.appmigration.presentation.compose.AppMigrationBannerKt;
import com.roadrunner.rrds.compose.component.feedback.communicator.MessageBarKt;
import java.util.WeakHashMap;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.SemanticsModifier;
import o.TooltipKt;
import o.accessgetIdjd;
import o.accessgetReusableRectp;
import o.animateElevation;
import o.computeDirection;
import o.findMergingSemanticsParent;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda0;
import o.setRoundRectOutlineTNW_H78default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppMigrationBannerKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:23:0x007a A[PHI: r1 r3
  0x007a: PHI (r1v15 androidx.compose.ui.Modifier$Companion) = (r1v14 androidx.compose.ui.Modifier$Companion), (r1v26 androidx.compose.ui.Modifier$Companion) binds: [B:22:0x0078, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]
  0x007a: PHI (r3v9 o.findMergingSemanticsParent) = (r3v8 o.findMergingSemanticsParent), (r3v20 o.findMergingSemanticsParent) binds: [B:22:0x0078, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[PHI: r1
  0x007f: PHI (r1v25 androidx.compose.ui.Modifier$Companion) = (r1v14 androidx.compose.ui.Modifier$Companion), (r1v26 androidx.compose.ui.Modifier$Companion) binds: [B:22:0x0078, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    public static final void AppMigrationBanner(final SemanticsModifier semanticsModifier, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        final Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        Modifier.Companion companion;
        findMergingSemanticsParent findmergingsemanticsparent;
        accessgetIdjd accessgetidjd;
        int i3;
        int i4 = 2 % 2;
        semanticsModifier.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1394001437);
        if ((i & 6) == 0) {
            if (getpostalcode.read(semanticsModifier)) {
                int i5 = read + 49;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 48;
        final int i8 = 0;
        final int i9 = 1;
        if (getpostalcode.write(i7 & 1, (i7 & 19) != 18)) {
            int i10 = serializer + 89;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                companion = Modifier.Companion;
                findmergingsemanticsparent = (findMergingSemanticsParent) ExtrasKt.write(((AppMigrationBannerUiModelImpl) semanticsModifier).MediaSessionCompatQueueItem, getpostalcode, 0).getValue();
                if (!(!(findmergingsemanticsparent instanceof accessgetIdjd))) {
                    accessgetidjd = (accessgetIdjd) findmergingsemanticsparent;
                } else {
                    accessgetidjd = null;
                }
            } else {
                companion = Modifier.Companion;
                findmergingsemanticsparent = (findMergingSemanticsParent) ExtrasKt.write(((AppMigrationBannerUiModelImpl) semanticsModifier).MediaSessionCompatQueueItem, getpostalcode, 0).getValue();
                if (findmergingsemanticsparent instanceof accessgetIdjd) {
                    accessgetidjd = (accessgetIdjd) findmergingsemanticsparent;
                } else {
                    accessgetidjd = null;
                }
            }
            modifier2 = companion;
            accessgetIdjd accessgetidjd2 = accessgetidjd;
            if (accessgetidjd2 == null) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                } else {
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SemanticsNodefakeSemanticsNodefakeNode1
                        private static int RatingCompat = 1;
                        private static int read;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = 2 % 2;
                            int i12 = read + 29;
                            RatingCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            int i14 = i8;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i15 = i;
                            androidx.compose.ui.Modifier modifier3 = modifier2;
                            SemanticsModifier semanticsModifier2 = semanticsModifier;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i14 == 0) {
                                AppMigrationBannerKt.AppMigrationBanner(semanticsModifier2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                                return createfromparcel;
                            }
                            AppMigrationBannerKt.AppMigrationBanner(semanticsModifier2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                            int i16 = RatingCompat + 77;
                            read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i17 = i16 % 2;
                            return createfromparcel;
                        }
                    };
                }
            } else {
                i8 = (i7 & 14) == 4 ? 1 : 0;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (i8 != 0) {
                    MapboxNavigation.AnonymousClass15 anonymousClass15 = new MapboxNavigation.AnonymousClass15(0, semanticsModifier, SemanticsModifier.class, "onPrimaryCtaClick", "onPrimaryCtaClick()V", 0, 4);
                    getpostalcode.write(anonymousClass15);
                    objComponentActivity = anonymousClass15;
                } else {
                    int i11 = read + 101;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        MapboxNavigation.AnonymousClass15 anonymousClass16 = new MapboxNavigation.AnonymousClass15(0, semanticsModifier, SemanticsModifier.class, "onPrimaryCtaClick", "onPrimaryCtaClick()V", 0, 4);
                        getpostalcode.write(anonymousClass16);
                        objComponentActivity = anonymousClass16;
                    }
                }
                read(accessgetidjd2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), modifier2, getpostalcode, (i7 << 3) & 896);
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SemanticsNodefakeSemanticsNodefakeNode1
                private static int RatingCompat = 1;
                private static int read;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = read + 29;
                    RatingCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    int i16 = i9;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i17 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    SemanticsModifier semanticsModifier2 = semanticsModifier;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i16 == 0) {
                        AppMigrationBannerKt.AppMigrationBanner(semanticsModifier2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i17 | 1));
                        return createfromparcel;
                    }
                    AppMigrationBannerKt.AppMigrationBanner(semanticsModifier2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i17 | 1));
                    int i18 = RatingCompat + 77;
                    read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public static final void read(accessgetIdjd accessgetidjd, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 113;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1030570009);
        if ((i & 6) == 0) {
            int i9 = read + 75;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0 ? (i & 8) != 0 : (i & 23) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessgetidjd);
            } else {
                zIconCompatParcelizer = getpostalcode.read(accessgetidjd);
                int i10 = serializer + 109;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            if (zIconCompatParcelizer) {
                int i12 = read + 17;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = 16;
            } else {
                int i14 = serializer + 59;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i16 = read + 15;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if (getpostalcode.read(modifier)) {
                int i18 = serializer + 97;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i20 = i2;
        if (getpostalcode.write(i20 & 1, (i20 & 147) != 146)) {
            int i21 = serializer + 93;
            read = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            AsyncImagePainter asyncImagePainterRemoteActionCompatParcelizer = computeDirection.RemoteActionCompatParcelizer(accessgetidjd.write, null, null, getpostalcode, 0, 30);
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            String str = accessgetidjd.MediaDescriptionCompat;
            String str2 = accessgetidjd.read;
            boolean z = accessgetidjd.MediaSessionCompatQueueItem;
            String str3 = accessgetidjd.IconCompatParcelizer;
            WeakHashMap weakHashMap = TooltipKt.serializer;
            animateElevation animateelevation = setRoundRectOutlineTNW_H78default.read(getpostalcode).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            boolean z2 = (i20 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            MessageBarKt.serializer(asyncImagePainterRemoteActionCompatParcelizer, str, modifierWrite, str2, false, true ^ z, str3, null, animateelevation, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 12, modifier, (Object) accessgetidjd, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
