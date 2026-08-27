package com.roadrunner.rrds.compose.component.indicators.skeleton;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.skeleton.SkeletonViewKt;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import o.ArrangementCenter1;
import o.BoxMeasurePolicy;
import o.NativeLibHelper;
import o.TimerOnce;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.onShowTranslationui;
import o.performFling;
import o.performMeasureDjhGOtQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SkeletonViewKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void RemoteActionCompatParcelizer(Modifier modifier, float f, float f2, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        Modifier modifier2;
        float f3;
        float f4;
        Modifier modifier3;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1615886634);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            int i4 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            i3 = i4 % 2 != 0 ? i | 25 : i | 22;
        }
        if ((i & 384) == 0) {
            int i5 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i3 |= Fields.SpotShadowColor;
        }
        int i7 = i3 | 3072;
        if ((i7 & 1171) != 1170) {
            int i8 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            int i10 = IconCompatParcelizer + 57;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            } else {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        int i11 = IconCompatParcelizer + 115;
                        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        modifier3 = modifier;
                        f3 = f;
                        f4 = f2;
                    }
                }
                getpostalcode.RemoteActionCompatParcelizer();
                m5056SkeletonViewOicGDw4(f3, f4, Dimensions.getOnBackPressedInput, modifier3, getpostalcode, (i7 & 7168) | (((i7 & (-1009)) << 12) & 57344));
                modifier2 = modifier3;
            }
            modifier3 = Modifier.Companion;
            f3 = Dimensions.invoke;
            f4 = Dimensions.onStop;
            getpostalcode.RemoteActionCompatParcelizer();
            m5056SkeletonViewOicGDw4(f3, f4, Dimensions.getOnBackPressedInput, modifier3, getpostalcode, (i7 & 7168) | (((i7 & (-1009)) << 12) & 57344));
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            f3 = f;
            f4 = f2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new NativeLibHelper(modifier2, f3, f4, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    public static final void serializer(Modifier modifier, float f, float f2, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1533204029);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            int i4 = RemoteActionCompatParcelizer + 107;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            i3 = i4 % 2 == 0 ? i | 55 : i | 22;
        }
        if ((i & 384) == 0) {
            i3 |= Fields.SpotShadowColor;
        }
        int i5 = i3 | 3072;
        if ((i5 & 1171) != 1170) {
            int i6 = IconCompatParcelizer + 31;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i5 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                int i7 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 1 / 0;
                    if (getpostalcode.PlaybackStateCompat()) {
                        modifier = Modifier.Companion;
                        f = Dimensions.getLifecycleRegistry1;
                        f2 = Dimensions.ComponentDialog;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                } else if (getpostalcode.PlaybackStateCompat()) {
                    modifier = Modifier.Companion;
                    f = Dimensions.getLifecycleRegistry1;
                    f2 = Dimensions.ComponentDialog;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
            } else {
                modifier = Modifier.Companion;
                f = Dimensions.getLifecycleRegistry1;
                f2 = Dimensions.ComponentDialog;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            m5056SkeletonViewOicGDw4(f, f2, Dimensions.ensureViewModelStore, modifier, getpostalcode, (i5 & 7168) | (((i5 & (-1009)) << 12) & 57344));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i9 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 3 / 3;
            }
        }
        Modifier modifier2 = modifier;
        float f3 = f;
        float f4 = f2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new NativeLibHelper(modifier2, f3, f4, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[PHI: r1
  0x0029: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:9:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d A[PHI: r1
  0x001d: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:9:0x0027, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: SkeletonRowBig-djqs-MU, reason: not valid java name */
    public static final void m5054SkeletonRowBigdjqsMU(Modifier modifier, float f, float f2, getBirthDateFull getbirthdatefull, int i, int i2) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        float f3;
        float f4;
        int i6;
        float f5;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = IconCompatParcelizer + 69;
        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1465901852);
            if ((i & 42) == 0) {
                int i11 = RemoteActionCompatParcelizer + 37;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (getpostalcode.read(modifier)) {
                    i5 = IconCompatParcelizer + 47;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i3 = 5;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1465901852);
            if ((i & 6) == 0) {
                int i13 = RemoteActionCompatParcelizer + 37;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (getpostalcode.read(modifier)) {
                    i5 = IconCompatParcelizer + 47;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i3 = 5;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            i4 |= 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f3 = f2;
                if (getpostalcode.serializer(f2)) {
                    int i15 = IconCompatParcelizer + 3;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i8 = Fields.RotationX;
                }
                i4 |= i8;
            } else {
                f3 = f2;
            }
            i8 = Fields.SpotShadowColor;
            i4 |= i8;
        } else {
            f3 = f2;
        }
        int i17 = i4 | 3072;
        if (getpostalcode.write(i17 & 1, (i17 & 1171) != 1170)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                float f6 = Dimensions.getOnBackPressedDispatcherannotations;
                if ((i2 & 4) != 0) {
                    int i18 = IconCompatParcelizer + 59;
                    RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        f3 = Dimensions.startActivityForResult;
                        i6 = i17 & 25911;
                    } else {
                        f3 = Dimensions.startActivityForResult;
                        i6 = i17 & (-1009);
                    }
                } else {
                    i6 = i17 & (-113);
                }
                int i19 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                f5 = f6;
                i7 = i6;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i7 = i17 & (-113);
                if ((i2 & 4) != 0) {
                    int i21 = RemoteActionCompatParcelizer + 55;
                    IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                    i7 = i21 % 2 == 0 ? i17 & 2614 : i17 & (-1009);
                }
                f5 = f;
            }
            float f7 = f3;
            getpostalcode.RemoteActionCompatParcelizer();
            m5056SkeletonViewOicGDw4(f5, f7, Dimensions.addObserverForBackInvoker, modifier, getpostalcode, ((i7 >> 3) & 126) | (i7 & 7168) | ((i7 << 12) & 57344));
            f3 = f7;
            f4 = f5;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            f4 = f;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TimerOnce(modifier, f4, f3, i, i2, 0);
        }
    }

    /* JADX INFO: renamed from: SkeletonSquareBig-djqs-MU, reason: not valid java name */
    public static final void m5055SkeletonSquareBigdjqsMU(Modifier modifier, float f, float f2, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(358752189);
        if ((i & 6) == 0) {
            if (getpostalcode.read(modifier)) {
                i5 = 4;
            } else {
                int i7 = IconCompatParcelizer + 61;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 3;
                }
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && getpostalcode.serializer(f2)) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i9 = i3 | 3072;
        if (getpostalcode.write(i9 & 1, (i9 & 1171) != 1170)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                f = Dimensions.ComponentDialogExternalSyntheticLambda0;
                if ((i2 & 4) != 0) {
                    f2 = Dimensions.onStart;
                    i4 = i9 & (-1009);
                } else {
                    i4 = i9 & (-113);
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i4 = i9 & (-113);
                if ((i2 & 4) != 0) {
                    i4 = i9 & (-1009);
                }
            }
            getpostalcode.RemoteActionCompatParcelizer();
            m5056SkeletonViewOicGDw4(f, f2, Dimensions.fullyDrawnReporter_delegatelambda0, modifier, getpostalcode, ((i4 >> 3) & 126) | (i4 & 7168) | ((i4 << 12) & 57344));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i10 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        float f3 = f;
        float f4 = f2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TimerOnce(modifier, f3, f4, i, i2, 1);
        }
    }

    public static final void IconCompatParcelizer(Modifier modifier, float f, float f2, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        float f3;
        float f4;
        boolean z;
        float f5;
        Modifier modifier2;
        float f6;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(856751857);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i7 = IconCompatParcelizer + 53;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if ((i2 & 2) == 0) {
                f3 = f;
                int i9 = getpostalcode.serializer(f) ? 32 : 16;
                i3 |= i9;
            } else {
                f3 = f;
            }
            i3 |= i9;
        } else {
            f3 = f;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f4 = f2;
                if (getpostalcode.serializer(f2)) {
                    int i10 = IconCompatParcelizer + 51;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i4 = Fields.RotationX;
                }
                i3 |= i4;
            } else {
                f4 = f2;
            }
            i4 = Fields.SpotShadowColor;
            i3 |= i4;
        } else {
            f4 = f2;
        }
        int i12 = i3 | 3072;
        if ((i12 & 1171) != 1170) {
            int i13 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i12 & 1, z)) {
            int i15 = IconCompatParcelizer + 11;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                if (i6 != 0) {
                    int i17 = IconCompatParcelizer + 43;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    modifier2 = Modifier.Companion;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    f5 = Dimensions.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ;
                    i12 &= -113;
                } else {
                    f5 = f3;
                }
                if ((i2 & 4) != 0) {
                    f6 = Dimensions.startIntentSenderForResult;
                    i12 &= -897;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                m5056SkeletonViewOicGDw4(f5, f6, Dimensions.createFullyDrawnExecutor, modifier2, getpostalcode, ((i12 >> 3) & 126) | (i12 & 7168) | ((i12 << 12) & 57344));
                f4 = f6;
                modifier = modifier2;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                if ((i2 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i12 &= -897;
                }
                modifier2 = modifier;
                f5 = f3;
            }
            f6 = f4;
            getpostalcode.RemoteActionCompatParcelizer();
            m5056SkeletonViewOicGDw4(f5, f6, Dimensions.createFullyDrawnExecutor, modifier2, getpostalcode, ((i12 >> 3) & 126) | (i12 & 7168) | ((i12 << 12) & 57344));
            f4 = f6;
            modifier = modifier2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            f5 = f3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TimerOnce(modifier, f5, f4, i, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r3
  0x003e: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r3
  0x0032: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: SkeletonView-OicGDw4, reason: not valid java name */
    public static final void m5056SkeletonViewOicGDw4(final float f, final float f2, final float f3, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1175677795);
            if ((i & 65) == 0) {
                if (!getpostalcode.serializer(f)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1175677795);
            if ((i & 6) == 0) {
                if (!getpostalcode.serializer(f)) {
                    i2 = 2;
                } else {
                    i2 = 4;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i7 = RemoteActionCompatParcelizer + 17;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 |= !getpostalcode.serializer(f2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.serializer(f3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.write(false)) {
                int i9 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i3 |= i4;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
            int i11 = RemoteActionCompatParcelizer + 25;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            int i13 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, f), f2);
            getpostalcode.serializer(1677295781);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            List list = SQLite.read(Color.m712boximpl(Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowIcon(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m712boximpl(Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowIcon(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m712boximpl(Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverflowIcon(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null)));
            getpostalcode.IconCompatParcelizer(false);
            BoxKt.Box(BackgroundKt.background$default(modifierM75height3ABfNKs, Brush.Companion.m671linearGradientmHitzGk$default(Brush.Companion, list, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(10.0f)) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L)), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((Number) ((onShowTranslationui) ArrangementCenter1.IconCompatParcelizer(ArrangementCenter1.read(null, getpostalcode, 1), 0.0f, 1000.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{900, 0, performFling.write, 2}), BoxMeasurePolicy.Restart, 4), null, getpostalcode, 4536, 8).MediaSessionCompatQueueItem).getValue()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(10.0f)) & 4294967295L)), 0, 8, (Object) null), RoundedCornerShapeKt.IconCompatParcelizer(f3), 0.0f, 4), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TimerOnce1
                private static int MediaDescriptionCompat = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = 2 % 2;
                    int i16 = MediaDescriptionCompat + 115;
                    RatingCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    ((Integer) obj2).getClass();
                    SkeletonViewKt.m5056SkeletonViewOicGDw4(f, f2, f3, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i18 = MediaDescriptionCompat + 101;
                    RatingCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
