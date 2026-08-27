package com.roadrunner.twofa.presentation.compose;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import o.AndroidContentCaptureManager;
import o.PopulateViewStructure_androidKtpopulate7;
import o.b9;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getTopEndannotations;
import o.onBackPressedDispatcher_delegatelambda010;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda0;
import o.setSdkAuthenticationSignaturelambda11;
import o.subscribeToBannersErrorslambda1;
import o.subscribeToBannersUpdateslambda1;
import o.times7Ah8Wj8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TwoFaScreenKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:123:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:151:0x026a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0312  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    public static final void TwoFaScreen(final TwoFaViewModel twoFaViewModel, final String str, final String str2, final String str3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        char c;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = write + 17;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        twoFaViewModel.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(238544436);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(twoFaViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 77;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                if (getpostalcode.read(str)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
            } else {
                int i11 = 80 / 0;
                if (getpostalcode.read(str)) {
                    i6 = 32;
                } else {
                    i6 = 16;
                }
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str2)) {
                int i12 = RemoteActionCompatParcelizer + 75;
                write = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 != 0 ? 10413 : 256;
            } else {
                int i13 = RemoteActionCompatParcelizer + 53;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(str3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            int i15 = write + 41;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(networkingCoreModule$$ExternalSyntheticLambda2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= getpostalcode.read(modifier) ? 536870912 : 268435456;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 306783379) != 306783378)) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(twoFaViewModel.ParcelableVolumeInfo, getpostalcode, 0);
            Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            times7Ah8Wj8 times7ah8wj8 = new times7Ah8Wj8(2);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(twoFaViewModel);
            int i17 = i2 & 896;
            boolean z5 = i17 == 256;
            int i18 = i2 & 112;
            boolean z6 = i18 == 32;
            int i19 = i2 & 7168;
            boolean z7 = i19 == 2048;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z7 || (z6 | zIconCompatParcelizer | z5)) || objComponentActivity == androidContentCaptureManager) {
                final int i20 = 0;
                c = 0;
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0
                    private static int MediaDescriptionCompat = 0;
                    private static int MediaSessionCompatQueueItem = 1;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
                    
                        return r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                    
                        r13 = (androidx.activity.result.ActivityResult) r13;
                        r13.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
                    
                        if (r13.write != (-1)) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
                    
                        r13 = r13.RemoteActionCompatParcelizer;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
                    
                        if (r13 == null) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
                    
                        r13 = r13.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        r1 = r1;
                        r1.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
                    
                        if (r13 == null) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
                    
                        r4 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 111;
                        com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        r4 = r4 % 2;
                        r4 = r1.RatingCompat;
                        ((o.setSdkAuthenticationSignaturelambda11) r1.RemoteActionCompatParcelizer.read()).getClass();
                        r4.getClass();
                        r4 = r4.IconCompatParcelizer;
                        r6 = r4.get(4);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
                    
                        if (r6 != null) goto L23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
                    
                        r6 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 107;
                        com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
                    
                        if ((r6 % 2) != 0) goto L22;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
                    
                        r6 = java.util.regex.Pattern.compile("\\b(\\d{4})\\b");
                        r6.getClass();
                        r4.put(4, r6);
                        r4 = 55 / 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
                    
                        r6 = java.util.regex.Pattern.compile("\\b(\\d{4})\\b");
                        r6.getClass();
                        r4.put(4, r6);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
                    
                        r13 = ((java.util.regex.Pattern) r6).matcher(r13);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
                    
                        if (r13.find() == false) goto L27;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
                    
                        r13 = r13.group(0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
                    
                        if (r13 != null) goto L28;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
                    
                        r13 = "";
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
                    
                        if (r13.length() <= 0) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
                    
                        timber.log.Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP is received and parsed", new java.lang.Object[0]);
                        r6 = o.removeNodeAtDepth.IconCompatParcelizer(r13);
                        r6.getClass();
                        o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, new com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1(r1, r6, r2, r3, r4, (o.ShortNewsContentCardView) null, 0));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
                    
                        r13 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 115;
                        com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
                    
                        if ((r13 % 2) != 0) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
                    
                        r13 = 43 / 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
                    
                        return r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    
                        if (r1 != 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
                    
                        if (r1 != 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
                    
                        r6 = (o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) r13;
                        r6.getClass();
                        r13 = r1;
                        r13.getClass();
                        o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r13, new com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1(r13, r6, r2, r3, r4, (o.ShortNewsContentCardView) null, 0));
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r13) {
                        /*
                            Method dump skipped, instruction units count: 237
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                getpostalcode.write(objComponentActivity);
            } else {
                c = 0;
            }
            getTopEndannotations.write(onBackPressedDispatcher_delegatelambda010.write(times7ah8wj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode), getpostalcode, 8);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(twoFaViewModel);
            boolean z8 = !(i18 != 32);
            boolean z9 = i17 == 256;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 | z8 | z9) {
                NafathTimerDataStore$set$2 nafathTimerDataStore$set$2 = new NafathTimerDataStore$set$2(twoFaViewModel, str, str2, null, 22);
                getpostalcode.write(nafathTimerDataStore$set$2);
                objComponentActivity2 = nafathTimerDataStore$set$2;
            } else {
                int i21 = RemoteActionCompatParcelizer + 7;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    NafathTimerDataStore$set$2 nafathTimerDataStore$set$3 = new NafathTimerDataStore$set$2(twoFaViewModel, str, str2, null, 22);
                    getpostalcode.write(nafathTimerDataStore$set$3);
                    objComponentActivity2 = nafathTimerDataStore$set$3;
                }
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
            getQueryContext getquerycontext = twoFaViewModel.MediaDescriptionCompat;
            boolean z10 = (i2 & 29360128) == c;
            boolean z11 = (i2 & 57344) == 16384;
            boolean z12 = (i2 & 3670016) == 1048576;
            boolean z13 = (i2 & 234881024) == 67108864;
            if ((i2 & 458752) == 131072) {
                int i23 = RemoteActionCompatParcelizer + 93;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(context);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z10 | z11 | z12 | z13 | z | zIconCompatParcelizer3) {
                objComponentActivity3 = new subscribeToBannersErrorslambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, networkingCoreModule$$ExternalSyntheticLambda2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, context, 0);
                getpostalcode.write(objComponentActivity3);
            } else {
                int i25 = RemoteActionCompatParcelizer + 45;
                write = i25 % Fields.SpotShadowColor;
                if (i25 % 2 != 0) {
                    throw null;
                }
                if (objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new subscribeToBannersErrorslambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, networkingCoreModule$$ExternalSyntheticLambda2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, context, 0);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
            setSdkAuthenticationSignaturelambda11 setsdkauthenticationsignaturelambda11 = (setSdkAuthenticationSignaturelambda11) populateViewStructure_androidKtpopulate7Write.getValue();
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(twoFaViewModel);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                i3 = Fields.CameraDistance;
                z2 = true;
                subscribeToBannersUpdateslambda1 subscribetobannersupdateslambda1 = new subscribeToBannersUpdateslambda1(0, twoFaViewModel, TwoFaViewModel.class, "triggerFaCode", "triggerFaCode()V", 0, 0);
                getpostalcode.write(subscribetobannersupdateslambda1);
                objComponentActivity4 = subscribetobannersupdateslambda1;
            } else {
                z2 = true;
                i3 = Fields.CameraDistance;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity4;
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(twoFaViewModel);
            if (i17 == 256) {
                z3 = z2;
                i4 = 32;
            } else {
                i4 = 32;
                z3 = false;
            }
            boolean z14 = i18 == i4 ? z2 : false;
            if (i19 == i3) {
                int i26 = RemoteActionCompatParcelizer + 105;
                write = i26 % Fields.SpotShadowColor;
                if (i26 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                z4 = z2;
            } else {
                z4 = false;
            }
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!(zIconCompatParcelizer5 | z3 | z14 | z4)) {
                int i27 = RemoteActionCompatParcelizer + 1;
                write = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                if (objComponentActivity5 == androidContentCaptureManager) {
                    final int i29 = 1;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0
                        private static int MediaDescriptionCompat = 0;
                        private static int MediaSessionCompatQueueItem = 1;

                        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
                        
                            return r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                        
                            r13 = (androidx.activity.result.ActivityResult) r13;
                            r13.getClass();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
                        
                            if (r13.write != (-1)) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
                        
                            r13 = r13.RemoteActionCompatParcelizer;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
                        
                            if (r13 == null) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
                        
                            r13 = r13.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                            r1 = r1;
                            r1.getClass();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
                        
                            if (r13 == null) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
                        
                            r4 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 111;
                            com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            r4 = r4 % 2;
                            r4 = r1.RatingCompat;
                            ((o.setSdkAuthenticationSignaturelambda11) r1.RemoteActionCompatParcelizer.read()).getClass();
                            r4.getClass();
                            r4 = r4.IconCompatParcelizer;
                            r6 = r4.get(4);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
                        
                            if (r6 != null) goto L23;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
                        
                            r6 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 107;
                            com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
                        
                            if ((r6 % 2) != 0) goto L22;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
                        
                            r6 = java.util.regex.Pattern.compile("\\b(\\d{4})\\b");
                            r6.getClass();
                            r4.put(4, r6);
                            r4 = 55 / 0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
                        
                            r6 = java.util.regex.Pattern.compile("\\b(\\d{4})\\b");
                            r6.getClass();
                            r4.put(4, r6);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
                        
                            r13 = ((java.util.regex.Pattern) r6).matcher(r13);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
                        
                            if (r13.find() == false) goto L27;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
                        
                            r13 = r13.group(0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
                        
                            if (r13 != null) goto L28;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
                        
                            r13 = "";
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
                        
                            if (r13.length() <= 0) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
                        
                            timber.log.Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP is received and parsed", new java.lang.Object[0]);
                            r6 = o.removeNodeAtDepth.IconCompatParcelizer(r13);
                            r6.getClass();
                            o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, new com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1(r1, r6, r2, r3, r4, (o.ShortNewsContentCardView) null, 0));
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
                        
                            r13 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 115;
                            com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
                        
                            if ((r13 % 2) != 0) goto L34;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
                        
                            r13 = 43 / 0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
                        
                            return r3;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
                        
                            if (r1 != 0) goto L9;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
                        
                            r6 = (o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) r13;
                            r6.getClass();
                            r13 = r1;
                            r13.getClass();
                            o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r13, new com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1(r13, r6, r2, r3, r4, (o.ShortNewsContentCardView) null, 0));
                         */
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r13) {
                            /*
                                Method dump skipped, instruction units count: 237
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.invoke(java.lang.Object):java.lang.Object");
                        }
                    };
                    getpostalcode.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm4);
                    objComponentActivity5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                }
            } else {
                final int i210 = 1;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0
                    private static int MediaDescriptionCompat = 0;
                    private static int MediaSessionCompatQueueItem = 1;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
                    
                        return r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                    
                        r13 = (androidx.activity.result.ActivityResult) r13;
                        r13.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
                    
                        if (r13.write != (-1)) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
                    
                        r13 = r13.RemoteActionCompatParcelizer;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
                    
                        if (r13 == null) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
                    
                        r13 = r13.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        r1 = r1;
                        r1.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
                    
                        if (r13 == null) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
                    
                        r4 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 111;
                        com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        r4 = r4 % 2;
                        r4 = r1.RatingCompat;
                        ((o.setSdkAuthenticationSignaturelambda11) r1.RemoteActionCompatParcelizer.read()).getClass();
                        r4.getClass();
                        r4 = r4.IconCompatParcelizer;
                        r6 = r4.get(4);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
                    
                        if (r6 != null) goto L23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
                    
                        r6 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 107;
                        com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
                    
                        if ((r6 % 2) != 0) goto L22;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
                    
                        r6 = java.util.regex.Pattern.compile("\\b(\\d{4})\\b");
                        r6.getClass();
                        r4.put(4, r6);
                        r4 = 55 / 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
                    
                        r6 = java.util.regex.Pattern.compile("\\b(\\d{4})\\b");
                        r6.getClass();
                        r4.put(4, r6);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
                    
                        r13 = ((java.util.regex.Pattern) r6).matcher(r13);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
                    
                        if (r13.find() == false) goto L27;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
                    
                        r13 = r13.group(0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
                    
                        if (r13 != null) goto L28;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
                    
                        r13 = "";
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
                    
                        if (r13.length() <= 0) goto L31;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
                    
                        timber.log.Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("OTP is received and parsed", new java.lang.Object[0]);
                        r6 = o.removeNodeAtDepth.IconCompatParcelizer(r13);
                        r6.getClass();
                        o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r1, new com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1(r1, r6, r2, r3, r4, (o.ShortNewsContentCardView) null, 0));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
                    
                        r13 = com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaDescriptionCompat + 115;
                        com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.MediaSessionCompatQueueItem = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
                    
                        if ((r13 % 2) != 0) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
                    
                        r13 = 43 / 0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
                    
                        return r3;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    
                        if (r1 != 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
                    
                        if (r1 != 0) goto L9;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
                    
                        r6 = (o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) r13;
                        r6.getClass();
                        r13 = r1;
                        r13.getClass();
                        o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(r13, new com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1(r13, r6, r2, r3, r4, (o.ShortNewsContentCardView) null, 0));
                     */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r13) {
                        /*
                            Method dump skipped, instruction units count: 237
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.twofa.presentation.compose.TwoFaScreenKt$$ExternalSyntheticLambda0.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                getpostalcode.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm5);
                objComponentActivity5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
            }
            TwoFaContentKt.TwoFaContent(setsdkauthenticationsignaturelambda11, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, modifier, networkingCoreModule$$ExternalSyntheticLambda2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, getpostalcode, ((i2 >> 21) & 896) | ((i2 >> 15) & 7168));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new b9(twoFaViewModel, str, str2, str3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, networkingCoreModule$$ExternalSyntheticLambda2, modifier, i);
        }
    }
}
