package com.roadrunner.rrds.compose.component.layouts;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AwaitFirstLayoutModifier;
import o.accessgetBluntcp;
import o.accessgetCoarsecp;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getFinefpxItnM;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.nSign;
import o.performMeasureDjhGOtQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DividerKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void serializer(float f, int i, long j, getBirthDateFull getbirthdatefull, Modifier modifier) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1458792753);
        if ((i & 6) == 0) {
            if (!getpostalcode.read(modifier)) {
                i3 = 2;
            } else {
                int i5 = read + 77;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            int i7 = IconCompatParcelizer + 67;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                j = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSavedStateRegistryControllerannotations();
                f = Dimensions.onRequestPermissionsResult;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i9 = read + 91;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            accessgetCoarsecp.RemoteActionCompatParcelizer(f, i2 & 14, j, getpostalcode, modifier);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        float f2 = f;
        long j2 = j;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetBluntcp(modifier, j2, f2, i);
        }
    }

    public static final void serializer(float f, int i, int i2, long j, getBirthDateFull getbirthdatefull, Modifier modifier) {
        int i3;
        float f2;
        long jMenuHostHelperlambda0;
        float f3;
        int i4;
        Modifier modifier2 = modifier;
        int i5 = 2 % 2;
        int i6 = read + 35;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(73273779);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i9 = read + 95;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.read(modifier2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 = (getpostalcode.read(modifier2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i10 = IconCompatParcelizer + 121;
            read = i10 % Fields.SpotShadowColor;
            i3 = i10 % 2 != 0 ? i3 | 70 : i3 | 16;
        }
        if ((i & 384) == 0) {
            int i11 = IconCompatParcelizer + 7;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 |= Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i3 & 1, !((i3 & 147) == 146))) {
            int i13 = read + 33;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                if (i8 != 0) {
                    modifier2 = Modifier.Companion;
                }
                jMenuHostHelperlambda0 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).menuHostHelperlambda0();
                f3 = Dimensions.onPictureInPictureModeChanged;
                i4 = i3 & (-1009);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                jMenuHostHelperlambda0 = j;
                i4 = i3 & (-1009);
                f3 = f;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            accessgetCoarsecp.RemoteActionCompatParcelizer(f3, i4 & 14, jMenuHostHelperlambda0, getpostalcode, modifier2);
            f2 = f3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            f2 = f;
            jMenuHostHelperlambda0 = j;
        }
        Modifier modifier3 = modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFinefpxItnM(modifier3, jMenuHostHelperlambda0, f2, i, i2, 1);
        }
        int i15 = read + 61;
        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
    }

    public static final void RemoteActionCompatParcelizer(float f, int i, int i2, long j, getBirthDateFull getbirthdatefull, Modifier modifier) {
        int i3;
        long savedStateRegistryControllerannotations;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 77;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2012447158);
        boolean z = true;
        if ((i & 6) == 0) {
            if (!(!getpostalcode.serializer(f))) {
                int i9 = read + 109;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                int i11 = IconCompatParcelizer + 63;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            int i13 = read + 105;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i3 = i;
        }
        int i15 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                savedStateRegistryControllerannotations = j;
                if (getpostalcode.serializer(savedStateRegistryControllerannotations)) {
                    int i16 = IconCompatParcelizer + 17;
                    read = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i4 = Fields.RotationX;
                }
                i15 |= i4;
            } else {
                savedStateRegistryControllerannotations = j;
            }
            i4 = Fields.SpotShadowColor;
            i15 |= i4;
        } else {
            savedStateRegistryControllerannotations = j;
        }
        if ((i15 & 147) != 146) {
            int i18 = read + 93;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i15 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                Modifier.Companion companion = Modifier.Companion;
                if ((i2 & 4) != 0) {
                    int i20 = read + 25;
                    IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 == 0) {
                        savedStateRegistryControllerannotations = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSavedStateRegistryControllerannotations();
                        i15 &= 8960;
                    } else {
                        savedStateRegistryControllerannotations = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSavedStateRegistryControllerannotations();
                        i15 &= -897;
                    }
                }
                modifier3 = companion;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                if ((i2 & 4) != 0) {
                    int i21 = read + 95;
                    IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    i15 &= -897;
                }
                modifier3 = modifier;
            }
            long j2 = savedStateRegistryControllerannotations;
            int i23 = i15;
            getpostalcode.RemoteActionCompatParcelizer();
            accessgetCoarsecp.serializer(f, ((i23 >> 3) & 14) | ((i23 << 3) & 112) | (i23 & 896), 0, j2, getpostalcode, modifier3);
            savedStateRegistryControllerannotations = j2;
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFinefpxItnM(f, modifier2, savedStateRegistryControllerannotations, i, i2, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd  */
    public static final void read(float f, int i, int i2, long j, getBirthDateFull getbirthdatefull, Modifier modifier) {
        Modifier modifier2;
        int i3;
        long savedStateRegistryControllerannotations;
        float f2;
        Modifier modifier3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1932187553);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            int i7 = read + 63;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            modifier2 = modifier;
            i3 = (getpostalcode.read(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            int i9 = IconCompatParcelizer + 111;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                savedStateRegistryControllerannotations = j;
                int i11 = getpostalcode.serializer(savedStateRegistryControllerannotations) ? 32 : 16;
                i3 |= i11;
            } else {
                savedStateRegistryControllerannotations = j;
            }
            i3 |= i11;
        } else {
            savedStateRegistryControllerannotations = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                if (getpostalcode.serializer(f2)) {
                    i4 = Fields.RotationX;
                }
                i3 |= i4;
            } else {
                f2 = f;
            }
            i4 = Fields.SpotShadowColor;
            i3 |= i4;
        } else {
            f2 = f;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            int i12 = IconCompatParcelizer + 119;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        if ((i2 & 2) != 0) {
                            int i13 = IconCompatParcelizer + 63;
                            read = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                }
                getpostalcode.RemoteActionCompatParcelizer();
                accessgetCoarsecp.serializer(f2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, savedStateRegistryControllerannotations, getpostalcode, modifier3);
            } else {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        if ((i2 & 2) != 0) {
                            int i15 = IconCompatParcelizer + 63;
                            read = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                }
                getpostalcode.RemoteActionCompatParcelizer();
                accessgetCoarsecp.serializer(f2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, savedStateRegistryControllerannotations, getpostalcode, modifier3);
            }
            modifier3 = i6 != 0 ? Modifier.Companion : modifier2;
            if ((i2 & 2) != 0) {
                int i17 = read + 123;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    savedStateRegistryControllerannotations = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSavedStateRegistryControllerannotations();
                    i3 &= 40;
                } else {
                    savedStateRegistryControllerannotations = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSavedStateRegistryControllerannotations();
                    i3 &= -113;
                }
            }
            if ((i2 & 4) != 0) {
                i3 &= -897;
                f2 = Dimensions.onMultiWindowModeChanged;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            accessgetCoarsecp.serializer(f2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 0, savedStateRegistryControllerannotations, getpostalcode, modifier3);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        long j2 = savedStateRegistryControllerannotations;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFinefpxItnM(modifier3, j2, f2, i, i2, 3);
        }
        int i18 = IconCompatParcelizer + 43;
        read = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX INFO: renamed from: DividerVerticalDashed-Dt02yhY, reason: not valid java name */
    public static final void m5057DividerVerticalDashedDt02yhY(float f, int i, int i2, long j, getBirthDateFull getbirthdatefull, Modifier modifier) {
        int i3;
        long presenter;
        boolean z;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1793270285);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.serializer(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i7 = IconCompatParcelizer + 71;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 32;
            } else {
                int i9 = IconCompatParcelizer + 113;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            presenter = j;
            if ((i2 & 4) == 0 && getpostalcode.serializer(presenter)) {
                int i11 = IconCompatParcelizer + 53;
                read = i11 % Fields.SpotShadowColor;
                i4 = i11 % 2 != 0 ? 10985 : 256;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        } else {
            presenter = j;
        }
        if ((i3 & 147) != 146) {
            int i12 = read + 63;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 4 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                int i14 = IconCompatParcelizer + 105;
                read = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (!getpostalcode.PlaybackStateCompat()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                } else if ((i2 & 4) != 0) {
                    int i16 = read + 31;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                int i18 = read + 31;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                i3 &= -897;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            float f2 = 3.0f * f;
            float fMo48toPx0680j_4 = density.mo48toPx0680j_4(Dp.m3673constructorimpl(f2));
            PathEffect pathEffectDashPathEffect = PathEffect.Companion.dashPathEffect(new float[]{fMo48toPx0680j_4, density.mo48toPx0680j_4(Dp.m3673constructorimpl(f2))}, fMo48toPx0680j_4 / 2.0f);
            boolean z2 = (((i3 & 896) ^ 384) > 256 && getpostalcode.serializer(presenter)) || (i3 & 384) == 256;
            boolean z3 = (i3 & 14) == 4;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(pathEffectDashPathEffect);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new nSign(presenter, f, pathEffectDashPathEffect);
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, (i3 >> 3) & 14);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        int i20 = read + 17;
        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
        if (i20 % 2 == 0) {
            getpostalcode.MediaDescriptionCompat();
            throw null;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFinefpxItnM(f, modifier, presenter, i, i2, 2);
        }
    }
}
