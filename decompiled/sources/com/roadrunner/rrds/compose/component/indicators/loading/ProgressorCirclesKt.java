package com.roadrunner.rrds.compose.component.indicators.loading;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.loading.ProgressorCirclesKt;
import io.sentry.SentryUUID;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.AwaitFirstLayoutModifier;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SingleThreadCachedScheduler2;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.buildMapping;
import o.ensureSubscribedToInAppMessageEventslambda0;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.performFling;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ProgressorCirclesKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m5046drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        int i = 2 % 2;
        int i2 = read + 115;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float width = stroke.getWidth() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) - (2.0f * width);
        DrawScope.m1283drawArcyD3GUKo$default(drawScope, j, f, f2, false, Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width)) & 4294967295L) | (((long) Float.floatToRawIntBits(width)) << 32)), Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), 0.0f, stroke, null, 0, 832, null);
        int i4 = read + 43;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public static final void ProgressorCircleError(String str, float f, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(357300959);
        if ((i & 6) == 0) {
            if (!getpostalcode.read(str)) {
                i4 = 2;
            } else {
                int i6 = RemoteActionCompatParcelizer + 11;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = read + 79;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.serializer(f)) {
                int i9 = RemoteActionCompatParcelizer + 59;
                read = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 == 0 ? 64 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i10 = i2 | 3456;
        if (getpostalcode.write(i10 & 1, (i10 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            m5045ProgressorCircleFshNVzU(str, f, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getOnBackPressedInput(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).addObserverForBackInvokerlambda0(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onPostResume(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onPostCreate(), companion, getpostalcode, ((i10 << 3) & 896) | (i10 & 14) | ((i10 >> 6) & 112) | ((i10 << 15) & 29360128));
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler2(str, f, modifier2, i, 2);
        }
    }

    public static final void ProgressorCircleSuccess(String str, float f, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1286314556);
        if ((i & 6) == 0) {
            i2 = i | (getpostalcode.read(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        boolean z = true;
        if ((i & 48) == 0) {
            i2 |= getpostalcode.serializer(f) ^ true ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if ((i4 & 1171) != 1170) {
            int i5 = read + 31;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            int i7 = RemoteActionCompatParcelizer + 29;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            int i9 = RemoteActionCompatParcelizer + 91;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            m5045ProgressorCircleFshNVzU(str, f, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).fullyDrawnReporter_delegatelambda00(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).fullyDrawnReporter_delegatelambda0(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onSupportNavigateUp(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).openOptionsMenu(), companion, getpostalcode, ((i4 << 15) & 29360128) | ((i4 << 3) & 896) | (i4 & 14) | ((i4 >> 6) & 112));
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler2(str, f, modifier2, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    public static final void write(String str, float f, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(717969931);
        if ((i & 6) == 0) {
            if (!getpostalcode.read(str)) {
                int i6 = RemoteActionCompatParcelizer + 73;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                int i8 = RemoteActionCompatParcelizer + 47;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    i4 = 4;
                }
                i2 = i | i4;
            }
            i4 = 2;
            i2 = i | i4;
        } else {
            int i9 = RemoteActionCompatParcelizer + 25;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = read + 121;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 42 / 0;
                if (getpostalcode.serializer(f)) {
                    int i13 = read + 63;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            } else if (getpostalcode.serializer(f)) {
                int i15 = read + 63;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i17 = i2 | 3456;
        if (getpostalcode.write(i17 & 1, (i17 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            m5045ProgressorCircleFshNVzU(str, f, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).ensureViewModelStore(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).addObserverForBackInvoker(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onPrepareSupportNavigateUpTaskStack(), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onSupportActionModeFinished(), companion, getpostalcode, ((i17 << 15) & 29360128) | ((i17 << 3) & 896) | (i17 & 14) | ((i17 >> 6) & 112));
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler2(str, f, modifier2, i, 0);
        }
    }

    public static final void serializer(final float f, final long j, final long j2, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-763030091);
        if ((i & 6) == 0) {
            if (getpostalcode.serializer(f)) {
                int i6 = read + 15;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
            int i8 = read + 53;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.serializer(j)) {
                i3 = 32;
            } else {
                int i10 = RemoteActionCompatParcelizer + 75;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i12 = RemoteActionCompatParcelizer + 5;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode.serializer(j2) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            int i14 = read + 17;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            final float fWrite = RangesKt.write(f, 0.0f, 1.0f);
            final Stroke stroke = new Stroke(((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(Dimensions.handleOnBackPressed), 0.0f, StrokeCap.Companion.m1100getRoundKaPHkGw(), 0, null, 26, null);
            final ensureSubscribedToInAppMessageEventslambda0 ensuresubscribedtoinappmessageeventslambda0 = new ensureSubscribedToInAppMessageEventslambda0(1.0f);
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier, true, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.BringIntoViewRequesterImpl
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Object invoke(Object obj) {
                    float f2 = fWrite;
                    ensureSubscribedToInAppMessageEventslambda0 ensuresubscribedtoinappmessageeventslambda1 = ensuresubscribedtoinappmessageeventslambda0;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setProgressBarRangeInfo((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, new androidx.compose.ui.semantics.ProgressBarRangeInfo(((Number) RangesKt.IconCompatParcelizer(Float.valueOf(f2), ensuresubscribedtoinappmessageeventslambda1)).floatValue(), ensuresubscribedtoinappmessageeventslambda1, 0));
                    return createFromParcel.INSTANCE;
                }
            });
            boolean zSerializer = getpostalcode.serializer(fWrite);
            if ((i2 & 896) == 256) {
                int i16 = RemoteActionCompatParcelizer + 109;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(stroke);
            boolean z3 = (i2 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | zSerializer | zIconCompatParcelizer | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ThreadFactoryWrapper1
                    private static int MediaSessionCompatQueueItem = 1;
                    private static int read;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i18 = 2 % 2;
                        int i19 = read + 81;
                        MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        drawScope.getClass();
                        float f2 = fWrite;
                        long j3 = j2;
                        androidx.compose.ui.graphics.drawscope.Stroke stroke2 = stroke;
                        ProgressorCirclesKt.m5046drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j3, stroke2);
                        ProgressorCirclesKt.m5046drawCircularIndicator42QJj7c(drawScope, 270.0f, f2 * 360.0f, j, stroke2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i21 = MediaSessionCompatQueueItem + 85;
                        read = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i21 % 2 == 0) {
                            return createfromparcel;
                        }
                        throw null;
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifierSemantics, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.newThread
                private static int MediaMetadataCompat = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = MediaMetadataCompat + 67;
                    RatingCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    ((Integer) obj2).getClass();
                    ProgressorCirclesKt.serializer(f, j, j2, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = MediaMetadataCompat + 117;
                    RatingCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0112  */
    /* JADX INFO: renamed from: ProgressorCircle-FshNVzU, reason: not valid java name */
    public static final void m5045ProgressorCircleFshNVzU(final String str, final float f, final long j, final long j2, final long j3, final long j4, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 27;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1832489989);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i8 = RemoteActionCompatParcelizer + 67;
                read = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 3;
                }
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 91;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.read((Object) null)) {
                int i12 = read + 71;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                i3 = i12 % 2 != 0 ? 26 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.serializer(f) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i13 = read + 125;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode.serializer(j) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i15 = RemoteActionCompatParcelizer + 83;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i2 |= getpostalcode.serializer(j2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= !(getpostalcode.serializer(j3) ^ true) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.serializer(j4) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i2 |= getpostalcode.read(modifier) ? 8388608 : 4194304;
        }
        int i17 = i2;
        if ((i17 & 4793491) != 4793490) {
            int i18 = RemoteActionCompatParcelizer + 67;
            read = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i17 & 1, z)) {
            int i19 = RemoteActionCompatParcelizer + 53;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            int i21 = i17 >> 6;
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, performFling.read, 2}), null, null, getpostalcode, i21 & 14, 28);
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(modifier, Dimensions.handleOnBackProgressed), Dimensions.createNavigationEventHandleractivity);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM75height3ABfNKs);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i22 = read + 95;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            float fFloatValue = ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue();
            Modifier.Companion companion3 = Modifier.Companion;
            FillElement fillElement = SizeKt.read;
            serializer(fFloatValue, j, j2, companion3.then(fillElement), getpostalcode, (i21 & 112) | 3072 | (i21 & 896));
            Modifier modifierThen = PaddingKt.write(companion3, Dimensions.setActionBarVisibilityCallback).then(fillElement);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, companion.getCenterHorizontally(), getpostalcode, 54);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i24 = RemoteActionCompatParcelizer + 85;
                read = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    getpostalcode.serializer(constructor2);
                    throw null;
                }
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            getpostalcode.serializer(1369981387);
            getpostalcode.IconCompatParcelizer(false);
            TextKt.m131TextNvy7gAk(str, null, j3, 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i17 & 14) | ((i17 >> 9) & 896), 24960, 110586);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SingleThreadFutureScheduler
                private static int MediaDescriptionCompat = 0;
                private static int MediaMetadataCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = MediaDescriptionCompat + 61;
                    MediaMetadataCompat = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    ProgressorCirclesKt.m5045ProgressorCircleFshNVzU(str, f, j, j2, j3, j4, modifier, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i28 = MediaMetadataCompat + 29;
                    MediaDescriptionCompat = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
        }
    }
}
