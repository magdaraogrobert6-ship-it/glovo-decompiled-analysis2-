package com.roadrunner.rrds.compose.component.indicators.shimmer;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import com.roadrunner.rrds.compose.component.indicators.shimmer.ShimmeringHorizontalBarKt;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.ArrangementCenter1;
import o.AwaitFirstLayoutModifier;
import o.BoxMeasurePolicy;
import o.SnapFlingBehaviorKt;
import o.aspectRatiodefault;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.getSpacingD9Ej5fM;
import o.nSign;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShimmeringHorizontalBarKt {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ShimmeringHorizontalBar-Cgnh0Qk, reason: not valid java name */
    public static final void m5052ShimmeringHorizontalBarCgnh0Qk(final long j, Modifier modifier, float f, float f2, float f3, int i, int i2, getBirthDateFull getbirthdatefull, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        final float f4;
        final float f5;
        final int i11;
        final int i12;
        final Modifier modifier3;
        final float f6;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        int i13;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer;
        boolean z4;
        boolean z5;
        Object objComponentActivity2;
        boolean z6;
        float f7;
        int i14;
        int i15;
        int i16;
        int i17 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1421994718);
        if ((i3 & 6) == 0) {
            if (getpostalcode.serializer(j)) {
                int i18 = IconCompatParcelizer + 37;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i3 | i16;
        } else {
            i5 = i3;
        }
        int i20 = i4 & 2;
        if (i20 == 0) {
            if ((i3 & 48) == 0) {
                int i21 = read + 49;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                modifier2 = modifier;
                i5 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            i6 = i5 | 28032;
            i7 = i4 & 32;
            if (i7 != 0) {
                if ((i3 & 196608) == 0) {
                    i8 = i;
                    if (getpostalcode.read(i8)) {
                        int i23 = read + 21;
                        IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i6 |= i9;
                }
                i10 = i6 | 1572864;
                if ((599187 & i10) != 599186) {
                    i15 = IconCompatParcelizer + 101;
                    read = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (getpostalcode.write(i10 & 1, z)) {
                    if (i20 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    float fM3673constructorimpl = Dp.m3673constructorimpl(2.0f);
                    float fM3673constructorimpl2 = Dp.m3673constructorimpl(24.0f);
                    if (i7 != 0) {
                        i14 = read + 49;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 != 0) {
                            i8 = 32162;
                        } else {
                            i8 = 3000;
                        }
                    }
                    i13 = i8;
                    if ((458752 & i10) == 131072) {
                        int i25 = read + 17;
                        IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((3670016 & i10) == 1048576) {
                        int i27 = IconCompatParcelizer + 65;
                        read = i27 % Fields.SpotShadowColor;
                        int i28 = i27 % 2;
                        z3 = true;
                    } else {
                        int i29 = read + 43;
                        IconCompatParcelizer = i29 % Fields.SpotShadowColor;
                        int i30 = i29 % 2;
                        z3 = false;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!(z2 | z3) || objComponentActivity == androidContentCaptureManager) {
                        getSpacingD9Ej5fM getspacingd9ej5fm = new getSpacingD9Ej5fM(0);
                        getspacingd9ej5fm.write = i13;
                        getspacingd9ej5fm.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                        Float fValueOf = Float.valueOf(1.0f);
                        getspacingd9ej5fm.read(1000, fValueOf).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                        getspacingd9ej5fm.read(i13, fValueOf);
                        objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm);
                        getpostalcode.write(objComponentActivity);
                    }
                    Modifier modifier5 = modifier4;
                    placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("shimmering_horizontal_bar_transition", getpostalcode, 0), 0.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer((aspectRatiodefault) objComponentActivity, (BoxMeasurePolicy) null, 6), "shimmering_horizontal_bar_progress", getpostalcode, 29112, 0);
                    Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(modifier5, 1.0f), fM3673constructorimpl2, 0.0f, 2), fM3673constructorimpl);
                    boolean z7 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                    if ((i10 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i10 & 14) == 4) {
                        int i31 = read + 85;
                        IconCompatParcelizer = i31 % Fields.SpotShadowColor;
                        int i32 = i31 % 2;
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    z6 = z7 | z4 | z5;
                    f7 = 0.4f;
                    if (!z6 || objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                        getpostalcode.write(objComponentActivity2);
                    }
                    AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
                    f4 = fM3673constructorimpl;
                    f6 = 0.4f;
                    modifier3 = modifier5;
                    f5 = fM3673constructorimpl2;
                    i11 = 1000;
                    i12 = i13;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    f4 = f;
                    f5 = f3;
                    i11 = i2;
                    i12 = i8;
                    modifier3 = modifier2;
                    f6 = f2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.start
                        private static int MediaSessionCompatToken = 1;
                        private static int RatingCompat;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i33 = 2 % 2;
                            int i34 = MediaSessionCompatToken + 95;
                            RatingCompat = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i35 = i34 % 2;
                            ((Integer) obj2).getClass();
                            ShimmeringHorizontalBarKt.m5052ShimmeringHorizontalBarCgnh0Qk(j, modifier3, f4, f6, f5, i12, i11, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), i4);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i36 = RatingCompat + 27;
                            MediaSessionCompatToken = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i36 % 2 == 0) {
                                int i37 = 71 / 0;
                            }
                            return createfromparcel;
                        }
                    };
                }
            }
            i6 = 224640 | i5;
            i8 = i;
            i10 = i6 | 1572864;
            if ((599187 & i10) != 599186) {
                i15 = IconCompatParcelizer + 101;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (getpostalcode.write(i10 & 1, z)) {
                if (i20 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                float fM3673constructorimpl3 = Dp.m3673constructorimpl(2.0f);
                float fM3673constructorimpl4 = Dp.m3673constructorimpl(24.0f);
                if (i7 != 0) {
                    i14 = read + 49;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        i8 = 32162;
                    } else {
                        i8 = 3000;
                    }
                }
                i13 = i8;
                if ((458752 & i10) == 131072) {
                    int i210 = read + 17;
                    IconCompatParcelizer = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((3670016 & i10) == 1048576) {
                    int i212 = IconCompatParcelizer + 65;
                    read = i212 % Fields.SpotShadowColor;
                    int i213 = i212 % 2;
                    z3 = true;
                } else {
                    int i214 = read + 43;
                    IconCompatParcelizer = i214 % Fields.SpotShadowColor;
                    int i33 = i214 % 2;
                    z3 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                if (!(z2 | z3)) {
                    getSpacingD9Ej5fM getspacingd9ej5fm2 = new getSpacingD9Ej5fM(0);
                    getspacingd9ej5fm2.write = i13;
                    getspacingd9ej5fm2.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                    Float fValueOf2 = Float.valueOf(1.0f);
                    getspacingd9ej5fm2.read(1000, fValueOf2).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                    getspacingd9ej5fm2.read(i13, fValueOf2);
                    objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm2);
                    getpostalcode.write(objComponentActivity);
                } else {
                    getSpacingD9Ej5fM getspacingd9ej5fm3 = new getSpacingD9Ej5fM(0);
                    getspacingd9ej5fm3.write = i13;
                    getspacingd9ej5fm3.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                    Float fValueOf3 = Float.valueOf(1.0f);
                    getspacingd9ej5fm3.read(1000, fValueOf3).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                    getspacingd9ej5fm3.read(i13, fValueOf3);
                    objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm3);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifier6 = modifier4;
                placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("shimmering_horizontal_bar_transition", getpostalcode, 0), 0.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer((aspectRatiodefault) objComponentActivity, (BoxMeasurePolicy) null, 6), "shimmering_horizontal_bar_progress", getpostalcode, 29112, 0);
                Modifier modifierM75height3ABfNKs2 = SizeKt.m75height3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(modifier6, 1.0f), fM3673constructorimpl4, 0.0f, 2), fM3673constructorimpl3);
                boolean z8 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                if ((i10 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i10 & 14) == 4) {
                    int i34 = read + 85;
                    IconCompatParcelizer = i34 % Fields.SpotShadowColor;
                    int i35 = i34 % 2;
                    z5 = true;
                } else {
                    z5 = false;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                z6 = z8 | z4 | z5;
                f7 = 0.4f;
                if (!z6) {
                    objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                    getpostalcode.write(objComponentActivity2);
                }
                AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
                f4 = fM3673constructorimpl3;
                f6 = 0.4f;
                modifier3 = modifier6;
                f5 = fM3673constructorimpl4;
                i11 = 1000;
                i12 = i13;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                f4 = f;
                f5 = f3;
                i11 = i2;
                i12 = i8;
                modifier3 = modifier2;
                f6 = f2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.start
                    private static int MediaSessionCompatToken = 1;
                    private static int RatingCompat;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i36 = 2 % 2;
                        int i37 = MediaSessionCompatToken + 95;
                        RatingCompat = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i38 = i37 % 2;
                        ((Integer) obj2).getClass();
                        ShimmeringHorizontalBarKt.m5052ShimmeringHorizontalBarCgnh0Qk(j, modifier3, f4, f6, f5, i12, i11, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), i4);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i39 = RatingCompat + 27;
                        MediaSessionCompatToken = i39 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i39 % 2 == 0) {
                            int i310 = 71 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
        }
        int i36 = read + 125;
        IconCompatParcelizer = i36 % Fields.SpotShadowColor;
        i5 = i36 % 2 != 0 ? i5 | 63 : i5 | 48;
        modifier2 = modifier;
        i6 = i5 | 28032;
        i7 = i4 & 32;
        if (i7 != 0) {
            if ((i3 & 196608) == 0) {
                i8 = i;
                if (getpostalcode.read(i8)) {
                    int i215 = read + 21;
                    IconCompatParcelizer = i215 % Fields.SpotShadowColor;
                    int i216 = i215 % 2;
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i6 |= i9;
            }
            i10 = i6 | 1572864;
            if ((599187 & i10) != 599186) {
                i15 = IconCompatParcelizer + 101;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (getpostalcode.write(i10 & 1, z)) {
                if (i20 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                float fM3673constructorimpl5 = Dp.m3673constructorimpl(2.0f);
                float fM3673constructorimpl6 = Dp.m3673constructorimpl(24.0f);
                if (i7 != 0) {
                    i14 = read + 49;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        i8 = 32162;
                    } else {
                        i8 = 3000;
                    }
                }
                i13 = i8;
                if ((458752 & i10) == 131072) {
                    int i217 = read + 17;
                    IconCompatParcelizer = i217 % Fields.SpotShadowColor;
                    int i218 = i217 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((3670016 & i10) == 1048576) {
                    int i219 = IconCompatParcelizer + 65;
                    read = i219 % Fields.SpotShadowColor;
                    int i2110 = i219 % 2;
                    z3 = true;
                } else {
                    int i2111 = read + 43;
                    IconCompatParcelizer = i2111 % Fields.SpotShadowColor;
                    int i37 = i2111 % 2;
                    z3 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
                if (!(z2 | z3)) {
                    getSpacingD9Ej5fM getspacingd9ej5fm4 = new getSpacingD9Ej5fM(0);
                    getspacingd9ej5fm4.write = i13;
                    getspacingd9ej5fm4.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                    Float fValueOf4 = Float.valueOf(1.0f);
                    getspacingd9ej5fm4.read(1000, fValueOf4).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                    getspacingd9ej5fm4.read(i13, fValueOf4);
                    objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm4);
                    getpostalcode.write(objComponentActivity);
                } else {
                    getSpacingD9Ej5fM getspacingd9ej5fm5 = new getSpacingD9Ej5fM(0);
                    getspacingd9ej5fm5.write = i13;
                    getspacingd9ej5fm5.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                    Float fValueOf5 = Float.valueOf(1.0f);
                    getspacingd9ej5fm5.read(1000, fValueOf5).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                    getspacingd9ej5fm5.read(i13, fValueOf5);
                    objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm5);
                    getpostalcode.write(objComponentActivity);
                }
                Modifier modifier7 = modifier4;
                placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("shimmering_horizontal_bar_transition", getpostalcode, 0), 0.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer((aspectRatiodefault) objComponentActivity, (BoxMeasurePolicy) null, 6), "shimmering_horizontal_bar_progress", getpostalcode, 29112, 0);
                Modifier modifierM75height3ABfNKs3 = SizeKt.m75height3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(modifier7, 1.0f), fM3673constructorimpl6, 0.0f, 2), fM3673constructorimpl5);
                boolean z9 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                if ((i10 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i10 & 14) == 4) {
                    int i38 = read + 85;
                    IconCompatParcelizer = i38 % Fields.SpotShadowColor;
                    int i39 = i38 % 2;
                    z5 = true;
                } else {
                    z5 = false;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                z6 = z9 | z4 | z5;
                f7 = 0.4f;
                if (!z6) {
                    objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                    getpostalcode.write(objComponentActivity2);
                }
                AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
                f4 = fM3673constructorimpl5;
                f6 = 0.4f;
                modifier3 = modifier7;
                f5 = fM3673constructorimpl6;
                i11 = 1000;
                i12 = i13;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                f4 = f;
                f5 = f3;
                i11 = i2;
                i12 = i8;
                modifier3 = modifier2;
                f6 = f2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.start
                    private static int MediaSessionCompatToken = 1;
                    private static int RatingCompat;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i310 = 2 % 2;
                        int i311 = MediaSessionCompatToken + 95;
                        RatingCompat = i311 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i312 = i311 % 2;
                        ((Integer) obj2).getClass();
                        ShimmeringHorizontalBarKt.m5052ShimmeringHorizontalBarCgnh0Qk(j, modifier3, f4, f6, f5, i12, i11, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), i4);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i313 = RatingCompat + 27;
                        MediaSessionCompatToken = i313 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i313 % 2 == 0) {
                            int i314 = 71 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
        }
        i6 = 224640 | i5;
        i8 = i;
        i10 = i6 | 1572864;
        if ((599187 & i10) != 599186) {
            i15 = IconCompatParcelizer + 101;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            if (i20 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            float fM3673constructorimpl7 = Dp.m3673constructorimpl(2.0f);
            float fM3673constructorimpl8 = Dp.m3673constructorimpl(24.0f);
            if (i7 != 0) {
                i14 = read + 49;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    i8 = 32162;
                } else {
                    i8 = 3000;
                }
            }
            i13 = i8;
            if ((458752 & i10) == 131072) {
                int i2112 = read + 17;
                IconCompatParcelizer = i2112 % Fields.SpotShadowColor;
                int i2113 = i2112 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if ((3670016 & i10) == 1048576) {
                int i2114 = IconCompatParcelizer + 65;
                read = i2114 % Fields.SpotShadowColor;
                int i2115 = i2114 % 2;
                z3 = true;
            } else {
                int i2116 = read + 43;
                IconCompatParcelizer = i2116 % Fields.SpotShadowColor;
                int i310 = i2116 % 2;
                z3 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager4 = getCreditCardExpirationMonth.write;
            if (!(z2 | z3)) {
                getSpacingD9Ej5fM getspacingd9ej5fm6 = new getSpacingD9Ej5fM(0);
                getspacingd9ej5fm6.write = i13;
                getspacingd9ej5fm6.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                Float fValueOf6 = Float.valueOf(1.0f);
                getspacingd9ej5fm6.read(1000, fValueOf6).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                getspacingd9ej5fm6.read(i13, fValueOf6);
                objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm6);
                getpostalcode.write(objComponentActivity);
            } else {
                getSpacingD9Ej5fM getspacingd9ej5fm7 = new getSpacingD9Ej5fM(0);
                getspacingd9ej5fm7.write = i13;
                getspacingd9ej5fm7.read(0, Float.valueOf(0.0f)).write = SnapFlingBehaviorKt.serializer;
                Float fValueOf7 = Float.valueOf(1.0f);
                getspacingd9ej5fm7.read(1000, fValueOf7).write = SnapFlingBehaviorKt.IconCompatParcelizer;
                getspacingd9ej5fm7.read(i13, fValueOf7);
                objComponentActivity = new aspectRatiodefault(getspacingd9ej5fm7);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifier8 = modifier4;
            placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read("shimmering_horizontal_bar_transition", getpostalcode, 0), 0.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer((aspectRatiodefault) objComponentActivity, (BoxMeasurePolicy) null, 6), "shimmering_horizontal_bar_progress", getpostalcode, 29112, 0);
            Modifier modifierM75height3ABfNKs4 = SizeKt.m75height3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(modifier8, 1.0f), fM3673constructorimpl8, 0.0f, 2), fM3673constructorimpl7);
            boolean z10 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
            if ((i10 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i10 & 14) == 4) {
                int i311 = read + 85;
                IconCompatParcelizer = i311 % Fields.SpotShadowColor;
                int i312 = i311 % 2;
                z5 = true;
            } else {
                z5 = false;
            }
            objComponentActivity2 = getpostalcode.ComponentActivity();
            z6 = z10 | z4 | z5;
            f7 = 0.4f;
            if (!z6) {
                objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new nSign(f7, j, placespacebetweenfoundation_layoutIconCompatParcelizer);
                getpostalcode.write(objComponentActivity2);
            }
            AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
            f4 = fM3673constructorimpl7;
            f6 = 0.4f;
            modifier3 = modifier8;
            f5 = fM3673constructorimpl8;
            i11 = 1000;
            i12 = i13;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            f4 = f;
            f5 = f3;
            i11 = i2;
            i12 = i8;
            modifier3 = modifier2;
            f6 = f2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.start
                private static int MediaSessionCompatToken = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i313 = 2 % 2;
                    int i314 = MediaSessionCompatToken + 95;
                    RatingCompat = i314 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i315 = i314 % 2;
                    ((Integer) obj2).getClass();
                    ShimmeringHorizontalBarKt.m5052ShimmeringHorizontalBarCgnh0Qk(j, modifier3, f4, f6, f5, i12, i11, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1), i4);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i316 = RatingCompat + 27;
                    MediaSessionCompatToken = i316 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i316 % 2 == 0) {
                        int i317 = 71 / 0;
                    }
                    return createfromparcel;
                }
            };
        }
    }
}
