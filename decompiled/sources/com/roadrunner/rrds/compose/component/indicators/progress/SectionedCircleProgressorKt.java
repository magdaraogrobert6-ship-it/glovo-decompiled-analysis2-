package com.roadrunner.rrds.compose.component.indicators.progress;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.progress.SectionedCircleProgressorKt;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.AwaitFirstLayoutModifier;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.ThreadExecutor;
import o.ThreadFactoryWrapper;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.performFling;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.uncaughtException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SectionedCircleProgressorKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX INFO: renamed from: drawIndicatorArc-42QJj7c, reason: not valid java name */
    public static final void m5050drawIndicatorArc42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        int i = 2 % 2;
        int i2 = write + 75;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float width = stroke.getWidth() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - (2.0f * width);
        DrawScope.m1283drawArcyD3GUKo$default(drawScope, j, f, f2, false, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width)) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
        int i4 = write + 121;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final void read(String str, long j, long j2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1298916441);
        if ((i & 6) == 0) {
            int i5 = write + 39;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (!getpostalcode.read(str) ? 2 : 4) | i;
        } else {
            int i7 = RemoteActionCompatParcelizer + 95;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = write + 107;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.serializer(j);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.serializer(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.serializer(j2)) {
                int i10 = write + 25;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i12 = i2 | 3072;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            m5049SmallCircleWithIconeopBjH0(str, j, j2, companion, getpostalcode, i12 & 8190);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ThreadExecutor(str, j, j2, modifier2, i, 0);
        }
    }

    public static final void IconCompatParcelizer(float f, int i, long j, long j2, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1940681050);
        if ((i2 & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 113;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                getpostalcode.serializer(f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 = (getpostalcode.serializer(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.serializer(j)) {
                int i7 = RemoteActionCompatParcelizer + 45;
                write = i7 % Fields.SpotShadowColor;
                i4 = i7 % 2 != 0 ? 27362 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i2 & 3072) == 0) {
            int i8 = RemoteActionCompatParcelizer + 97;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i3 |= getpostalcode.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i10 = i3 | 24576;
        if (getpostalcode.write(i10 & 1, (i10 & 9363) != 9362)) {
            int i11 = RemoteActionCompatParcelizer + 79;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier.Companion companion = Modifier.Companion;
            read(f, i, j, j2, companion, getpostalcode, i10 & 65534);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ThreadFactoryWrapper(f, i, j, j2, modifier2, i2, 0);
            int i13 = RemoteActionCompatParcelizer + 45;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
    }

    public static final void read(float f, int i, long j, long j2, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1834512535);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode.serializer(f) ? 4 : 2) | i2;
            int i6 = RemoteActionCompatParcelizer + 27;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode.serializer(j)) {
                int i8 = write + 81;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i3 |= i4;
        }
        if ((i2 & 3072) == 0) {
            int i10 = RemoteActionCompatParcelizer + 115;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i3 |= getpostalcode.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (getpostalcode.write(i3 & 1, !((i3 & 9363) == 9362))) {
            m5048CircularIndicator3t3XoVo(((Number) TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, performFling.read, 2}), null, null, getpostalcode, i3 & 14, 28).getValue()).floatValue(), i, j, j2, Dimensions.getIndexOfFirstFeature, Dimensions.removeCloseableactivity, SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.SystemBarStyleCompanion), Dimensions.setEnabled), 0.0f, getpostalcode, i3 & 8176);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ThreadFactoryWrapper(f, i, j, j2, modifier, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:6:0x0021 A[PHI: r0
  0x0021: PHI (r0v13 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v15 o.getPostalCode) binds: [B:9:0x0033, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0024 A[PHI: r0
  0x0024: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v15 o.getPostalCode) binds: [B:9:0x0033, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(float f, int i, int i2, long j, long j2, long j3, long j4, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        getPostalCode getpostalcode;
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = write + 119;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-382535806);
            if ((i2 & 36) == 0) {
                if (getpostalcode.serializer(f)) {
                    i7 = RemoteActionCompatParcelizer + 33;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        i6 = 3;
                    } else {
                        i6 = 4;
                    }
                } else {
                    i6 = 2;
                }
                i3 = i6 | i2;
            } else {
                i3 = i2;
            }
        } else {
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-382535806);
            if ((i2 & 6) == 0) {
                if (getpostalcode.serializer(f)) {
                    i7 = RemoteActionCompatParcelizer + 33;
                    write = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        i6 = 3;
                    } else {
                        i6 = 4;
                    }
                } else {
                    i6 = 2;
                }
                i3 = i6 | i2;
            } else {
                i3 = i2;
            }
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.serializer(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= getpostalcode.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.read(str) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            if (getpostalcode.serializer(j3)) {
                int i10 = write + 43;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = Fields.RenderEffect;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (getpostalcode.serializer(j4)) {
                int i12 = RemoteActionCompatParcelizer + 91;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = 1048576;
            } else {
                i4 = Fields.BlendMode;
            }
            i3 |= i4;
        }
        int i14 = 12582912 | i3;
        boolean z = false;
        if ((4793491 & i14) != 4793490) {
            int i15 = RemoteActionCompatParcelizer + 119;
            write = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i14 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            int i16 = i14 >> 9;
            int i17 = i14 << 3;
            m5047BigProgressorCirclexBv1rpU(f, i, (i17 & 7168) | (i14 & 14) | (i16 & 112) | (i16 & 896) | (i17 & 57344) | ((i14 >> 3) & 458752) | ((i14 << 15) & 3670016) | (i14 & 29360128), j3, j, j2, j4, getpostalcode, companion, str);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new uncaughtException(f, i, j, j2, str, j3, j4, modifier2, i2);
        }
        int i18 = RemoteActionCompatParcelizer + 59;
        write = i18 % Fields.SpotShadowColor;
        int i19 = i18 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX INFO: renamed from: SmallCircleWithIcon-eopBjH0, reason: not valid java name */
    public static final void m5049SmallCircleWithIconeopBjH0(String str, long j, long j2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2012164554);
        Object obj = null;
        if ((i & 6) != 0) {
            int i6 = RemoteActionCompatParcelizer + 109;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = i;
        } else {
            int i8 = RemoteActionCompatParcelizer + 125;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
            } else {
                getpostalcode2.read(str);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 48) == 0) {
            int i9 = RemoteActionCompatParcelizer + 39;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                if (getpostalcode2.serializer(j)) {
                    i3 = write + 107;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        i4 = 20;
                    } else {
                        i4 = 32;
                    }
                } else {
                    i4 = 16;
                }
            } else {
                int i10 = 29 / 0;
                if (getpostalcode2.serializer(j)) {
                    i3 = write + 107;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        i4 = 20;
                    } else {
                        i4 = 32;
                    }
                } else {
                    i4 = 16;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.serializer(j2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i11 = i2;
        if (getpostalcode2.write(i11 & 1, (i11 & 1171) != 1170)) {
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.SystemBarStyleCompanion), Dimensions.setEnabled), RoundedCornerShapeKt.IconCompatParcelizer), j2, RectangleShapeKt.getRectangleShape());
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.removeOnNewIntentListener), Dimensions.removeOnPictureInPictureUiStateChangedListener);
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_reward_quest_star, getpostalcode2, 0);
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_reward_quest_star, getpostalcode2, 0);
                ContentScale fillBounds = ContentScale.Companion.getFillBounds();
                ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null);
                int i12 = Painter.$stable;
                getNonZeroRgk1Os.write(str, null, modifierM86width3ABfNKs, painterPainterResource, painterPainterResource2, null, null, null, fillBounds, colorFilterM763tintxETnrds$default, getpostalcode2, (i11 & 14) | 48 | (i12 << 9) | (i12 << 12), 6, 27616);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ThreadExecutor(str, j, j2, modifier, i, 1);
        }
    }

    /* JADX INFO: renamed from: CircularIndicator-3t3XoVo, reason: not valid java name */
    public static final void m5048CircularIndicator3t3XoVo(final float f, final int i, final long j, final long j2, final float f2, final float f3, final Modifier modifier, float f4, getBirthDateFull getbirthdatefull, final int i2) {
        int i3;
        final float f5;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1175925330);
        if ((i2 & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 79;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                i3 = (getpostalcode.serializer(f) ? 4 : 2) | i2;
            } else {
                getpostalcode.serializer(f);
                throw null;
            }
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.serializer(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= getpostalcode.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.serializer(f2) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            if (getpostalcode.serializer(f3)) {
                int i7 = RemoteActionCompatParcelizer + 109;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = Fields.RenderEffect;
                if (i8 != 0) {
                    int i9 = 83 / 0;
                }
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((1572864 & i2) == 0) {
            i3 |= getpostalcode.read(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i10 = i3 | 12582912;
        if (getpostalcode.write(i10 & 1, (4793491 & i10) != 4793490)) {
            final float fM3673constructorimpl = Dp.m3673constructorimpl(3.0f);
            final float fWrite = RangesKt.write(f, 0.0f, 1.0f);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            final Stroke stroke = new Stroke(density.mo48toPx0680j_4(f2), 0.0f, StrokeCap.Companion.m1100getRoundKaPHkGw(), 0, null, 26, null);
            final float fMo48toPx0680j_4 = density.mo48toPx0680j_4(Dp.m3673constructorimpl(f3 / 2.0f));
            final long jIconCompatParcelizer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
            Modifier modifierM890graphicsLayer_6ThJ44$default = GraphicsLayerModifierKt.m890graphicsLayer_6ThJ44$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524287, null);
            boolean zSerializer = getpostalcode.serializer(fWrite);
            boolean z2 = !((i10 & 7168) != 2048);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(stroke);
            if ((i10 & 112) == 32) {
                int i11 = RemoteActionCompatParcelizer + 17;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z = true;
            } else {
                z = false;
            }
            boolean z3 = (i10 & 896) == 256;
            boolean zSerializer2 = getpostalcode.serializer(fMo48toPx0680j_4);
            boolean z4 = (i10 & 29360128) == 8388608;
            boolean zSerializer3 = getpostalcode.serializer(jIconCompatParcelizer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zSerializer3 | zSerializer | z2 | zIconCompatParcelizer | z | z3 | zSerializer2 | z4) || objComponentActivity == getCreditCardExpirationMonth.write) {
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ThreadScheduler
                    private static int MediaSessionCompatQueueItem = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        float f6;
                        int i13 = 2;
                        int i14 = 2 % 2;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        drawScope.getClass();
                        float f7 = fWrite;
                        float f8 = f7 * 360.0f;
                        long j3 = j2;
                        androidx.compose.ui.graphics.drawscope.Stroke stroke2 = stroke;
                        SectionedCircleProgressorKt.m5050drawIndicatorArc42QJj7c(drawScope, 0.0f, 360.0f, j3, stroke2);
                        int i15 = i;
                        long j4 = j;
                        if (i15 > 0 && i15 > 0) {
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - ((stroke2.getWidth() / 2.0f) * 2.0f)) / 2.0f;
                            double d = 6.283185307179586d / ((double) i15);
                            int i16 = 0;
                            while (i16 < i15) {
                                int i17 = RatingCompat + 125;
                                MediaSessionCompatQueueItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i18 = i17 % i13;
                                double d2 = (((double) i16) * d) - 1.5707963267948966d;
                                double d3 = fIntBitsToFloat;
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1285drawCircleVaOC9Bg$default(drawScope, j4, fMo48toPx0680j_4, androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo1303getCenterF1C5BW0() & 4294967295L)) + ((float) (d3 * Math.sin(d2))))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo1303getCenterF1C5BW0() >> 32)) + ((float) (Math.cos(d2) * d3)))) << 32)), 0.0f, null, null, 0, 120, null);
                                i16++;
                                fIntBitsToFloat = fIntBitsToFloat;
                                i15 = i15;
                                stroke2 = stroke2;
                                j4 = j4;
                                i13 = 2;
                            }
                        }
                        long j5 = j4;
                        androidx.compose.ui.graphics.drawscope.Stroke stroke3 = stroke2;
                        if (f7 > 0.0f) {
                            int i19 = RatingCompat;
                            int i20 = i19 + 67;
                            MediaSessionCompatQueueItem = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i20 % 2 == 0 ? f7 == 1.0f : f7 == 2.0f) {
                                int i21 = i19 + 31;
                                MediaSessionCompatQueueItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i22 = i21 % 2;
                                SectionedCircleProgressorKt.m5050drawIndicatorArc42QJj7c(drawScope, 270.0f, f8, j5, stroke3);
                            } else {
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32));
                                float width = stroke3.getWidth();
                                float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(fM3673constructorimpl);
                                float f9 = fIntBitsToFloat2 - width;
                                if (f9 <= 0.0f) {
                                    int i23 = RatingCompat + 41;
                                    MediaSessionCompatQueueItem = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i24 = i23 % 2;
                                    f6 = 0.0f;
                                } else {
                                    f6 = (fMo48toPx0680j_5 * 360.0f) / (f9 * 3.1415927f);
                                }
                                SectionedCircleProgressorKt.m5050drawIndicatorArc42QJj7c(drawScope, 270.0f, f8, jIconCompatParcelizer, stroke3);
                                float f10 = f8 - f6;
                                SectionedCircleProgressorKt.m5050drawIndicatorArc42QJj7c(drawScope, (f6 / 2.0f) + 270.0f, f10 < 0.0f ? 0.0f : f10, j5, stroke3);
                            }
                        }
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                objComponentActivity = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }
            AwaitFirstLayoutModifier.serializer(modifierM890graphicsLayer_6ThJ44$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
            f5 = fM3673constructorimpl;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            f5 = f4;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TimerCycle1
                private static int MediaMetadataCompat = 0;
                private static int PlaybackStateCompatCustomAction = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = PlaybackStateCompatCustomAction + 27;
                    MediaMetadataCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1);
                    SectionedCircleProgressorKt.m5048CircularIndicator3t3XoVo(f, i, j, j2, f2, f3, modifier, f5, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i16 = PlaybackStateCompatCustomAction + 121;
                    MediaMetadataCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX INFO: renamed from: BigProgressorCircle-xBv1rpU, reason: not valid java name */
    public static final void m5047BigProgressorCirclexBv1rpU(float f, int i, int i2, long j, long j2, long j3, long j4, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i3;
        getPostalCode getpostalcode;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = RemoteActionCompatParcelizer + 77;
        write = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-806877535);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode2.serializer(f) ? 4 : 2) | i2;
            int i12 = RemoteActionCompatParcelizer + 89;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode2.read(str)) {
                int i14 = RemoteActionCompatParcelizer + 3;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.serializer(j)) {
                int i16 = write + 103;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i7 = Fields.RotationX;
            } else {
                i7 = Fields.SpotShadowColor;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            int i18 = RemoteActionCompatParcelizer + 33;
            write = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            i3 |= getpostalcode2.serializer(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            if (getpostalcode2.serializer(j3)) {
                int i20 = RemoteActionCompatParcelizer + 73;
                write = i20 % Fields.SpotShadowColor;
                i6 = i20 % 2 != 0 ? 20348 : Fields.Clip;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        Object obj = null;
        if ((196608 & i2) == 0) {
            if (getpostalcode2.serializer(j4)) {
                int i21 = RemoteActionCompatParcelizer + 93;
                write = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                i5 = Fields.RenderEffect;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((i2 & 1572864) == 0) {
            int i22 = write + 65;
            RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
            if (i22 % 2 == 0) {
                getpostalcode2.read(i);
                throw null;
            }
            i3 |= getpostalcode2.read(i) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i2) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i23 = RemoteActionCompatParcelizer + 87;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        }
        int i25 = i3;
        if (getpostalcode2.write(i25 & 1, (i25 & 4793491) != 4793490)) {
            Object[] objArr = {Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, performFling.read, 2};
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), null, null, getpostalcode2, i25 & 14, 28);
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0), Dimensions.isEnabled), RoundedCornerShapeKt.IconCompatParcelizer), j4, RectangleShapeKt.getRectangleShape());
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            float fFloatValue = ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue();
            float f2 = Dimensions.handleOnBackStarted;
            float f3 = Dimensions.remove;
            Modifier.Companion companion2 = Modifier.Companion;
            int i26 = i25 >> 3;
            m5048CircularIndicator3t3XoVo(fFloatValue, i, j2, j3, f2, f3, companion2.then(SizeKt.read), 0.0f, getpostalcode2, ((i25 >> 15) & 112) | 1572864 | (i26 & 896) | (i26 & 7168));
            Modifier modifierM86width3ABfNKs = SizeKt.m86width3ABfNKs(SizeKt.m75height3ABfNKs(companion2, Dimensions.removeOnNewIntentListener), Dimensions.removeOnPictureInPictureUiStateChangedListener);
            getpostalcode = getpostalcode2;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_essentials_flag, getpostalcode, 0);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_essentials_flag, getpostalcode, 0);
            ContentScale fillBounds = ContentScale.Companion.getFillBounds();
            ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null);
            int i27 = Painter.$stable;
            getNonZeroRgk1Os.write(str, null, modifierM86width3ABfNKs, painterPainterResource, painterPainterResource2, null, null, null, fillBounds, colorFilterM763tintxETnrds$default, getpostalcode, (i26 & 14) | 48 | (i27 << 9) | (i27 << 12), 6, 27616);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new uncaughtException(f, str, j, j2, j3, j4, i, modifier, i2);
        }
    }
}
