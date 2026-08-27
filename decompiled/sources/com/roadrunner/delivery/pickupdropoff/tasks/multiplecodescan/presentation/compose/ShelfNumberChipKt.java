package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextMeasurerHelperKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.compose.ShelfNumberChipKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShelfNumberChipKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:113:0x0322  */
    /* JADX WARN: Code duplicated, block: B:114:0x0325  */
    /* JADX WARN: Code duplicated, block: B:117:0x032e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0333  */
    /* JADX WARN: Code duplicated, block: B:121:0x033b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0347  */
    /* JADX WARN: Code duplicated, block: B:124:0x0350  */
    /* JADX WARN: Code duplicated, block: B:126:0x035b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0388  */
    /* JADX WARN: Code duplicated, block: B:130:0x03be  */
    /* JADX WARN: Code duplicated, block: B:132:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x03df  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0217  */
    /* JADX WARN: Code duplicated, block: B:95:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0261  */
    /* JADX INFO: renamed from: ShelfNumberChip-hGBTI10, reason: not valid java name */
    public static final void m4946ShelfNumberChiphGBTI10(final String str, final boolean z, Modifier modifier, float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        float fM3693getUnspecifiedD9Ej5fM;
        int i4;
        int i5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        int i6;
        int i7;
        boolean z2;
        Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier.Companion companion;
        Density density;
        float fMo45toDpu2uoSUM;
        float fM3673constructorimpl;
        TextMeasurer textMeasurerRememberTextMeasurer;
        TextStyle textStyle;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zSerializer;
        boolean z6;
        Object objComponentActivity;
        int iMo42roundToPx0680j_4;
        float f2;
        boolean z7;
        boolean zBooleanValue;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        boolean z8;
        long jSerializer;
        Modifier.Companion companion2;
        Modifier modifierM87widthInVpY3zN4$default;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui;
        int i9;
        TextOverflow.Companion companion4;
        int iM3568getClipgIe3tQ8;
        Modifier.Companion companion5;
        Modifier modifier3;
        int i10;
        Modifier modifierM;
        int i11;
        int i12;
        int i13 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1692672335);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i14 = read + 77;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i16 = RemoteActionCompatParcelizer + 33;
            read = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if (getpostalcode.write(z)) {
                int i18 = read + 59;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                i11 = i18 % 2 != 0 ? 110 : 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        int i19 = i3 | 384;
        int i20 = i2 & 8;
        if (i20 == 0) {
            if ((i & 3072) == 0) {
                fM3693getUnspecifiedD9Ej5fM = f;
                if (getpostalcode.serializer(fM3693getUnspecifiedD9Ej5fM)) {
                    int i21 = RemoteActionCompatParcelizer + 13;
                    read = i21 % Fields.SpotShadowColor;
                    i4 = i21 % 2 == 0 ? 23263 : Fields.CameraDistance;
                } else {
                    i4 = Fields.RotationZ;
                }
                i19 |= i4;
            }
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                    if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                        i7 = read + 93;
                        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            i6 = 13763;
                        } else {
                            i6 = Fields.Clip;
                        }
                    } else {
                        i6 = 8192;
                    }
                    i19 |= i6;
                }
                if ((i19 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i19 & 1, z2)) {
                    companion = Modifier.Companion;
                    if (i20 != 0) {
                        fM3693getUnspecifiedD9Ej5fM = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
                    }
                    if (i5 != 0) {
                        int i22 = RemoteActionCompatParcelizer + 9;
                        read = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
                    }
                    density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                    getpostalcode.serializer(1134498965);
                    fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM((int) (((WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo())).mo2753getContainerSizeYbymL2g() >> 32));
                    getpostalcode.IconCompatParcelizer(false);
                    if (Dp.m3678equalsimpl0(fM3693getUnspecifiedD9Ej5fM, Dp.Companion.m3693getUnspecifiedD9Ej5fM())) {
                        fM3673constructorimpl = Dp.m3673constructorimpl(fMo45toDpu2uoSUM * 0.75f);
                    } else {
                        fM3673constructorimpl = fM3693getUnspecifiedD9Ej5fM;
                    }
                    textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, getpostalcode, 0, 1);
                    textStyle = (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    i8 = i19 & 14;
                    if (i8 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i19 & 112) == 32) {
                        int i24 = RemoteActionCompatParcelizer + 119;
                        read = i24 % Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = getpostalcode.read(density);
                    zSerializer = getpostalcode.serializer(fM3673constructorimpl);
                    z6 = getpostalcode.read(textStyle);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if ((!(z3 | z4 | z5 | zSerializer) && !z6) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        if (!(!z)) {
                            iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                        } else {
                            iMo42roundToPx0680j_4 = 0;
                        }
                        f2 = fM3673constructorimpl;
                        if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        objComponentActivity = Boolean.valueOf(z7);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        f2 = fM3673constructorimpl;
                    }
                    zBooleanValue = ((Boolean) objComponentActivity).booleanValue();
                    if (zBooleanValue || z) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                    } else {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                        z8 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2 != null;
                        if (z) {
                            int i26 = RemoteActionCompatParcelizer + 9;
                            read = i26 % Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            getpostalcode.serializer(1134542173);
                            jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                        } else {
                            getpostalcode.serializer(1134542976);
                            jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer();
                        }
                        getpostalcode.IconCompatParcelizer(false);
                        PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                        snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        if (zBooleanValue) {
                            companion2 = companion;
                            modifierM87widthInVpY3zN4$default = SizeKt.m87widthInVpY3zN4$default(companion2, 0.0f, f2, 1);
                        } else {
                            companion2 = r39;
                            modifierM87widthInVpY3zN4$default = companion2;
                        }
                        Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(companion2.then(modifierM87widthInVpY3zN4$default), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), jSerializer, RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu);
                        supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, centerVertically, getpostalcode, 48);
                        iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                        dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
                        companion3 = ComposeUiNode.Companion;
                        constructor = companion3.getConstructor();
                        if (getpostalcode.read != null) {
                            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode.ComponentActivity) {
                                getpostalcode.serializer(constructor);
                            } else {
                                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                            if (z) {
                                int i28 = read + 17;
                                RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                                int i29 = i28 % 2;
                                getpostalcode.serializer(-1170633840);
                                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_check_circle_filled, getpostalcode, 0), (String) null, SizeKt.m83size3ABfNKs(companion2, Dimensions.setLogo), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), getpostalcode, Painter.$stable | 48, 0);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                getpostalcode.serializer(-1170380787);
                                getpostalcode.IconCompatParcelizer(false);
                            }
                            setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                            long supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                            if (zBooleanValue) {
                                i9 = 1;
                            } else {
                                i9 = Integer.MAX_VALUE;
                            }
                            companion4 = TextOverflow.Companion;
                            if (zBooleanValue) {
                                iM3568getClipgIe3tQ8 = companion4.m3569getEllipsisgIe3tQ8();
                            } else {
                                iM3568getClipgIe3tQ8 = companion4.m3568getClipgIe3tQ8();
                            }
                            int i30 = iM3568getClipgIe3tQ8;
                            if (zBooleanValue) {
                                i10 = RemoteActionCompatParcelizer + 107;
                                read = i10 % Fields.SpotShadowColor;
                                if (i10 % 2 == 0) {
                                    companion5 = companion2;
                                    modifierM = d$$ExternalSyntheticOutline0.m(0.0f, true, companion5);
                                } else {
                                    companion5 = companion2;
                                    modifierM = d$$ExternalSyntheticOutline0.m(1.0f, false, companion5);
                                }
                                modifier3 = modifierM;
                            } else {
                                companion5 = companion2;
                                modifier3 = companion5;
                            }
                            TextKt.m131TextNvy7gAk(str, modifier3, supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, i30, false, i9, 0, null, textStyle, getpostalcode, i8, 0, 110584);
                            if (z8) {
                                getpostalcode.serializer(-1169970006);
                                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_arrow_fullscreen, getpostalcode, 0), (String) null, ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion5, Dimensions.setLogo), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), getpostalcode, Painter.$stable | 48, 0);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                getpostalcode.serializer(-1169649683);
                                getpostalcode.IconCompatParcelizer(false);
                            }
                            getpostalcode.IconCompatParcelizer(true);
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                            modifier2 = companion5;
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    }
                    if (z) {
                        int i210 = RemoteActionCompatParcelizer + 9;
                        read = i210 % Fields.SpotShadowColor;
                        int i211 = i210 % 2;
                        getpostalcode.serializer(1134542173);
                        jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                    } else {
                        getpostalcode.serializer(1134542976);
                        jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer();
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = Arrangement.MediaBrowserCompatMediaItem;
                    snapElevation snapelevationIconCompatParcelizer2 = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
                    Alignment.Vertical centerVertically2 = Alignment.Companion.getCenterVertically();
                    if (zBooleanValue) {
                        companion2 = companion;
                        modifierM87widthInVpY3zN4$default = SizeKt.m87widthInVpY3zN4$default(companion2, 0.0f, f2, 1);
                    } else {
                        companion2 = r39;
                        modifierM87widthInVpY3zN4$default = companion2;
                    }
                    Modifier modifierRemoteActionCompatParcelizer2 = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(companion2.then(modifierM87widthInVpY3zN4$default), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), jSerializer, RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu);
                    supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer2, centerVertically2, getpostalcode, 48);
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer2);
                    companion3 = ComposeUiNode.Companion;
                    constructor = companion3.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        if (z) {
                            int i212 = read + 17;
                            RemoteActionCompatParcelizer = i212 % Fields.SpotShadowColor;
                            int i213 = i212 % 2;
                            getpostalcode.serializer(-1170633840);
                            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_check_circle_filled, getpostalcode, 0), (String) null, SizeKt.m83size3ABfNKs(companion2, Dimensions.setLogo), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), getpostalcode, Painter.$stable | 48, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(-1170380787);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                        long supportBackgroundTintMode2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                        if (zBooleanValue) {
                            i9 = 1;
                        } else {
                            i9 = Integer.MAX_VALUE;
                        }
                        companion4 = TextOverflow.Companion;
                        if (zBooleanValue) {
                            iM3568getClipgIe3tQ8 = companion4.m3569getEllipsisgIe3tQ8();
                        } else {
                            iM3568getClipgIe3tQ8 = companion4.m3568getClipgIe3tQ8();
                        }
                        int i31 = iM3568getClipgIe3tQ8;
                        if (zBooleanValue) {
                            i10 = RemoteActionCompatParcelizer + 107;
                            read = i10 % Fields.SpotShadowColor;
                            if (i10 % 2 == 0) {
                                companion5 = companion2;
                                modifierM = d$$ExternalSyntheticOutline0.m(0.0f, true, companion5);
                            } else {
                                companion5 = companion2;
                                modifierM = d$$ExternalSyntheticOutline0.m(1.0f, false, companion5);
                            }
                            modifier3 = modifierM;
                        } else {
                            companion5 = companion2;
                            modifier3 = companion5;
                        }
                        TextKt.m131TextNvy7gAk(str, modifier3, supportBackgroundTintMode2, 0L, null, null, 0L, null, 0L, i31, false, i9, 0, null, textStyle, getpostalcode, i8, 0, 110584);
                        if (z8) {
                            getpostalcode.serializer(-1169970006);
                            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_arrow_fullscreen, getpostalcode, 0), (String) null, ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion5, Dimensions.setLogo), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), getpostalcode, Painter.$stable | 48, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            getpostalcode.serializer(-1169649683);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        getpostalcode.IconCompatParcelizer(true);
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                        modifier2 = companion5;
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier2 = modifier;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final Modifier modifier4 = modifier2;
                    final float f3 = fM3693getUnspecifiedD9Ej5fM;
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getHairlineD9Ej5fMannotations
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i32 = 2 % 2;
                            int i33 = MediaBrowserCompatMediaItem + 115;
                            RatingCompat = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i34 = i33 % 2;
                            ((Integer) obj2).getClass();
                            ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str, z, modifier4, f3, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i35 = MediaBrowserCompatMediaItem + 3;
                            RatingCompat = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i35 % 2 == 0) {
                                int i36 = 39 / 0;
                            }
                            return createfromparcel;
                        }
                    };
                }
            }
            i19 |= 24576;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            if ((i19 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i19 & 1, z2)) {
                companion = Modifier.Companion;
                if (i20 != 0) {
                    fM3693getUnspecifiedD9Ej5fM = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
                }
                if (i5 != 0) {
                    int i214 = RemoteActionCompatParcelizer + 9;
                    read = i214 % Fields.SpotShadowColor;
                    int i215 = i214 % 2;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
                }
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                getpostalcode.serializer(1134498965);
                fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM((int) (((WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo())).mo2753getContainerSizeYbymL2g() >> 32));
                getpostalcode.IconCompatParcelizer(false);
                if (Dp.m3678equalsimpl0(fM3693getUnspecifiedD9Ej5fM, Dp.Companion.m3693getUnspecifiedD9Ej5fM())) {
                    fM3673constructorimpl = Dp.m3673constructorimpl(fMo45toDpu2uoSUM * 0.75f);
                } else {
                    fM3673constructorimpl = fM3693getUnspecifiedD9Ej5fM;
                }
                textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, getpostalcode, 0, 1);
                textStyle = (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer());
                i8 = i19 & 14;
                if (i8 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i19 & 112) == 32) {
                    int i216 = RemoteActionCompatParcelizer + 119;
                    read = i216 % Fields.SpotShadowColor;
                    int i217 = i216 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = getpostalcode.read(density);
                zSerializer = getpostalcode.serializer(fM3673constructorimpl);
                z6 = getpostalcode.read(textStyle);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z3 | z4 | z5 | zSerializer | z6)) {
                    if (!(!z)) {
                        iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                    } else {
                        iMo42roundToPx0680j_4 = 0;
                    }
                    f2 = fM3673constructorimpl;
                    if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objComponentActivity = Boolean.valueOf(z7);
                    getpostalcode.write(objComponentActivity);
                } else {
                    if (!(!z)) {
                        iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                    } else {
                        iMo42roundToPx0680j_4 = 0;
                    }
                    f2 = fM3673constructorimpl;
                    if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objComponentActivity = Boolean.valueOf(z7);
                    getpostalcode.write(objComponentActivity);
                }
                zBooleanValue = ((Boolean) objComponentActivity).booleanValue();
                if (zBooleanValue) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                } else {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                }
                if (z) {
                    int i218 = RemoteActionCompatParcelizer + 9;
                    read = i218 % Fields.SpotShadowColor;
                    int i219 = i218 % 2;
                    getpostalcode.serializer(1134542173);
                    jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                } else {
                    getpostalcode.serializer(1134542976);
                    jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer();
                }
                getpostalcode.IconCompatParcelizer(false);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction3 = Arrangement.MediaBrowserCompatMediaItem;
                snapElevation snapelevationIconCompatParcelizer3 = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
                Alignment.Vertical centerVertically3 = Alignment.Companion.getCenterVertically();
                if (zBooleanValue) {
                    companion2 = companion;
                    modifierM87widthInVpY3zN4$default = SizeKt.m87widthInVpY3zN4$default(companion2, 0.0f, f2, 1);
                } else {
                    companion2 = r39;
                    modifierM87widthInVpY3zN4$default = companion2;
                }
                Modifier modifierRemoteActionCompatParcelizer3 = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(companion2.then(modifierM87widthInVpY3zN4$default), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), jSerializer, RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu);
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer3, centerVertically3, getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer3);
                companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (z) {
                        int i2110 = read + 17;
                        RemoteActionCompatParcelizer = i2110 % Fields.SpotShadowColor;
                        int i2111 = i2110 % 2;
                        getpostalcode.serializer(-1170633840);
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_check_circle_filled, getpostalcode, 0), (String) null, SizeKt.m83size3ABfNKs(companion2, Dimensions.setLogo), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), getpostalcode, Painter.$stable | 48, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1170380787);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long supportBackgroundTintMode3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                    if (zBooleanValue) {
                        i9 = 1;
                    } else {
                        i9 = Integer.MAX_VALUE;
                    }
                    companion4 = TextOverflow.Companion;
                    if (zBooleanValue) {
                        iM3568getClipgIe3tQ8 = companion4.m3569getEllipsisgIe3tQ8();
                    } else {
                        iM3568getClipgIe3tQ8 = companion4.m3568getClipgIe3tQ8();
                    }
                    int i32 = iM3568getClipgIe3tQ8;
                    if (zBooleanValue) {
                        i10 = RemoteActionCompatParcelizer + 107;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            companion5 = companion2;
                            modifierM = d$$ExternalSyntheticOutline0.m(0.0f, true, companion5);
                        } else {
                            companion5 = companion2;
                            modifierM = d$$ExternalSyntheticOutline0.m(1.0f, false, companion5);
                        }
                        modifier3 = modifierM;
                    } else {
                        companion5 = companion2;
                        modifier3 = companion5;
                    }
                    TextKt.m131TextNvy7gAk(str, modifier3, supportBackgroundTintMode3, 0L, null, null, 0L, null, 0L, i32, false, i9, 0, null, textStyle, getpostalcode, i8, 0, 110584);
                    if (z8) {
                        getpostalcode.serializer(-1169970006);
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_arrow_fullscreen, getpostalcode, 0), (String) null, ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion5, Dimensions.setLogo), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), getpostalcode, Painter.$stable | 48, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1169649683);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    modifier2 = companion5;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Modifier modifier5 = modifier2;
                final float f4 = fM3693getUnspecifiedD9Ej5fM;
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getHairlineD9Ej5fMannotations
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i33 = 2 % 2;
                        int i34 = MediaBrowserCompatMediaItem + 115;
                        RatingCompat = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i35 = i34 % 2;
                        ((Integer) obj2).getClass();
                        ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str, z, modifier5, f4, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i36 = MediaBrowserCompatMediaItem + 3;
                        RatingCompat = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i36 % 2 == 0) {
                            int i37 = 39 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
        }
        i19 = i3 | 3456;
        fM3693getUnspecifiedD9Ej5fM = f;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i7 = read + 93;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        i6 = 13763;
                    } else {
                        i6 = Fields.Clip;
                    }
                } else {
                    i6 = 8192;
                }
                i19 |= i6;
            }
            if ((i19 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i19 & 1, z2)) {
                companion = Modifier.Companion;
                if (i20 != 0) {
                    fM3693getUnspecifiedD9Ej5fM = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
                }
                if (i5 != 0) {
                    int i2112 = RemoteActionCompatParcelizer + 9;
                    read = i2112 % Fields.SpotShadowColor;
                    int i2113 = i2112 % 2;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
                }
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                getpostalcode.serializer(1134498965);
                fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM((int) (((WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo())).mo2753getContainerSizeYbymL2g() >> 32));
                getpostalcode.IconCompatParcelizer(false);
                if (Dp.m3678equalsimpl0(fM3693getUnspecifiedD9Ej5fM, Dp.Companion.m3693getUnspecifiedD9Ej5fM())) {
                    fM3673constructorimpl = Dp.m3673constructorimpl(fMo45toDpu2uoSUM * 0.75f);
                } else {
                    fM3673constructorimpl = fM3693getUnspecifiedD9Ej5fM;
                }
                textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, getpostalcode, 0, 1);
                textStyle = (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer());
                i8 = i19 & 14;
                if (i8 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i19 & 112) == 32) {
                    int i2114 = RemoteActionCompatParcelizer + 119;
                    read = i2114 % Fields.SpotShadowColor;
                    int i2115 = i2114 % 2;
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = getpostalcode.read(density);
                zSerializer = getpostalcode.serializer(fM3673constructorimpl);
                z6 = getpostalcode.read(textStyle);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z3 | z4 | z5 | zSerializer | z6)) {
                    if (!(!z)) {
                        iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                    } else {
                        iMo42roundToPx0680j_4 = 0;
                    }
                    f2 = fM3673constructorimpl;
                    if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objComponentActivity = Boolean.valueOf(z7);
                    getpostalcode.write(objComponentActivity);
                } else {
                    if (!(!z)) {
                        iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                    } else {
                        iMo42roundToPx0680j_4 = 0;
                    }
                    f2 = fM3673constructorimpl;
                    if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objComponentActivity = Boolean.valueOf(z7);
                    getpostalcode.write(objComponentActivity);
                }
                zBooleanValue = ((Boolean) objComponentActivity).booleanValue();
                if (zBooleanValue) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                } else {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                }
                if (z) {
                    int i2116 = RemoteActionCompatParcelizer + 9;
                    read = i2116 % Fields.SpotShadowColor;
                    int i2117 = i2116 % 2;
                    getpostalcode.serializer(1134542173);
                    jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                } else {
                    getpostalcode.serializer(1134542976);
                    jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer();
                }
                getpostalcode.IconCompatParcelizer(false);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction4 = Arrangement.MediaBrowserCompatMediaItem;
                snapElevation snapelevationIconCompatParcelizer4 = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
                Alignment.Vertical centerVertically4 = Alignment.Companion.getCenterVertically();
                if (zBooleanValue) {
                    companion2 = companion;
                    modifierM87widthInVpY3zN4$default = SizeKt.m87widthInVpY3zN4$default(companion2, 0.0f, f2, 1);
                } else {
                    companion2 = r39;
                    modifierM87widthInVpY3zN4$default = companion2;
                }
                Modifier modifierRemoteActionCompatParcelizer4 = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(companion2.then(modifierM87widthInVpY3zN4$default), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), jSerializer, RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu);
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer4, centerVertically4, getpostalcode, 48);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer4);
                companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (z) {
                        int i2118 = read + 17;
                        RemoteActionCompatParcelizer = i2118 % Fields.SpotShadowColor;
                        int i2119 = i2118 % 2;
                        getpostalcode.serializer(-1170633840);
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_check_circle_filled, getpostalcode, 0), (String) null, SizeKt.m83size3ABfNKs(companion2, Dimensions.setLogo), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), getpostalcode, Painter.$stable | 48, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1170380787);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long supportBackgroundTintMode4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                    if (zBooleanValue) {
                        i9 = 1;
                    } else {
                        i9 = Integer.MAX_VALUE;
                    }
                    companion4 = TextOverflow.Companion;
                    if (zBooleanValue) {
                        iM3568getClipgIe3tQ8 = companion4.m3569getEllipsisgIe3tQ8();
                    } else {
                        iM3568getClipgIe3tQ8 = companion4.m3568getClipgIe3tQ8();
                    }
                    int i33 = iM3568getClipgIe3tQ8;
                    if (zBooleanValue) {
                        i10 = RemoteActionCompatParcelizer + 107;
                        read = i10 % Fields.SpotShadowColor;
                        if (i10 % 2 == 0) {
                            companion5 = companion2;
                            modifierM = d$$ExternalSyntheticOutline0.m(0.0f, true, companion5);
                        } else {
                            companion5 = companion2;
                            modifierM = d$$ExternalSyntheticOutline0.m(1.0f, false, companion5);
                        }
                        modifier3 = modifierM;
                    } else {
                        companion5 = companion2;
                        modifier3 = companion5;
                    }
                    TextKt.m131TextNvy7gAk(str, modifier3, supportBackgroundTintMode4, 0L, null, null, 0L, null, 0L, i33, false, i9, 0, null, textStyle, getpostalcode, i8, 0, 110584);
                    if (z8) {
                        getpostalcode.serializer(-1169970006);
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_arrow_fullscreen, getpostalcode, 0), (String) null, ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion5, Dimensions.setLogo), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), getpostalcode, Painter.$stable | 48, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1169649683);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(true);
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    modifier2 = companion5;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Modifier modifier6 = modifier2;
                final float f5 = fM3693getUnspecifiedD9Ej5fM;
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getHairlineD9Ej5fMannotations
                    private static int MediaBrowserCompatMediaItem = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i34 = 2 % 2;
                        int i35 = MediaBrowserCompatMediaItem + 115;
                        RatingCompat = i35 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i36 = i35 % 2;
                        ((Integer) obj2).getClass();
                        ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str, z, modifier6, f5, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i37 = MediaBrowserCompatMediaItem + 3;
                        RatingCompat = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i37 % 2 == 0) {
                            int i38 = 39 / 0;
                        }
                        return createfromparcel;
                    }
                };
            }
        }
        i19 |= 24576;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        if ((i19 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i19 & 1, z2)) {
            companion = Modifier.Companion;
            if (i20 != 0) {
                fM3693getUnspecifiedD9Ej5fM = Dp.Companion.m3693getUnspecifiedD9Ej5fM();
            }
            if (i5 != 0) {
                int i21110 = RemoteActionCompatParcelizer + 9;
                read = i21110 % Fields.SpotShadowColor;
                int i21111 = i21110 % 2;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
            }
            density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            getpostalcode.serializer(1134498965);
            fMo45toDpu2uoSUM = density.mo45toDpu2uoSUM((int) (((WindowInfo) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalWindowInfo())).mo2753getContainerSizeYbymL2g() >> 32));
            getpostalcode.IconCompatParcelizer(false);
            if (Dp.m3678equalsimpl0(fM3693getUnspecifiedD9Ej5fM, Dp.Companion.m3693getUnspecifiedD9Ej5fM())) {
                fM3673constructorimpl = Dp.m3673constructorimpl(fMo45toDpu2uoSUM * 0.75f);
            } else {
                fM3673constructorimpl = fM3693getUnspecifiedD9Ej5fM;
            }
            textMeasurerRememberTextMeasurer = TextMeasurerHelperKt.rememberTextMeasurer(0, getpostalcode, 0, 1);
            textStyle = (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer());
            i8 = i19 & 14;
            if (i8 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i19 & 112) == 32) {
                int i21112 = RemoteActionCompatParcelizer + 119;
                read = i21112 % Fields.SpotShadowColor;
                int i21113 = i21112 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = getpostalcode.read(density);
            zSerializer = getpostalcode.serializer(fM3673constructorimpl);
            z6 = getpostalcode.read(textStyle);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z3 | z4 | z5 | zSerializer | z6)) {
                if (!(!z)) {
                    iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                } else {
                    iMo42roundToPx0680j_4 = 0;
                }
                f2 = fM3673constructorimpl;
                if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objComponentActivity = Boolean.valueOf(z7);
                getpostalcode.write(objComponentActivity);
            } else {
                if (!(!z)) {
                    iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getActionBarHideOffset) + density.mo42roundToPx0680j_4(Dimensions.setLogo);
                } else {
                    iMo42roundToPx0680j_4 = 0;
                }
                f2 = fM3673constructorimpl;
                if (((int) (textMeasurerRememberTextMeasurer.m3051measurewNUYSr0(str, (968 & 2) != 0 ? TextStyle.Companion.getDefault() : textStyle, (968 & 4) != 0 ? TextOverflow.Companion.m3568getClipgIe3tQ8() : TextOverflow.Companion.m3568getClipgIe3tQ8(), (968 & 8) != 0, (968 & 16) != 0 ? Integer.MAX_VALUE : 1, (968 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), (968 & 64) != 0 ? textMeasurerRememberTextMeasurer.defaultLayoutDirection : null, (968 & Fields.SpotShadowColor) != 0 ? textMeasurerRememberTextMeasurer.defaultDensity : null, (968 & Fields.RotationX) != 0 ? textMeasurerRememberTextMeasurer.defaultFontFamilyResolver : null, (968 & Fields.RotationY) != 0 ? false : false).m3047getSizeYbymL2g() >> 32)) + iMo42roundToPx0680j_4 > density.mo42roundToPx0680j_4(Dp.m3673constructorimpl(f2 - Dp.m3673constructorimpl(Dimensions.setActionBarVisibilityCallback * 2.0f)))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objComponentActivity = Boolean.valueOf(z7);
                getpostalcode.write(objComponentActivity);
            }
            zBooleanValue = ((Boolean) objComponentActivity).booleanValue();
            if (zBooleanValue) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            }
            if (z) {
                int i21114 = RemoteActionCompatParcelizer + 9;
                read = i21114 % Fields.SpotShadowColor;
                int i21115 = i21114 % 2;
                getpostalcode.serializer(1134542173);
                jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
            } else {
                getpostalcode.serializer(1134542976);
                jSerializer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer();
            }
            getpostalcode.IconCompatParcelizer(false);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction5 = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer5 = Arrangement.IconCompatParcelizer(Dimensions.getActionBarHideOffset);
            Alignment.Vertical centerVertically5 = Alignment.Companion.getCenterVertically();
            if (zBooleanValue) {
                companion2 = companion;
                modifierM87widthInVpY3zN4$default = SizeKt.m87widthInVpY3zN4$default(companion2, 0.0f, f2, 1);
            } else {
                companion2 = r39;
                modifierM87widthInVpY3zN4$default = companion2;
            }
            Modifier modifierRemoteActionCompatParcelizer5 = PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(companion2.then(modifierM87widthInVpY3zN4$default), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding)), jSerializer, RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu);
            supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer5, centerVertically5, getpostalcode, 48);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer5);
            companion3 = ComposeUiNode.Companion;
            constructor = companion3.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (z) {
                    int i21116 = read + 17;
                    RemoteActionCompatParcelizer = i21116 % Fields.SpotShadowColor;
                    int i21117 = i21116 % 2;
                    getpostalcode.serializer(-1170633840);
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_check_circle_filled, getpostalcode, 0), (String) null, SizeKt.m83size3ABfNKs(companion2, Dimensions.setLogo), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList(), getpostalcode, Painter.$stable | 48, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1170380787);
                    getpostalcode.IconCompatParcelizer(false);
                }
                setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long supportBackgroundTintMode5 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
                if (zBooleanValue) {
                    i9 = 1;
                } else {
                    i9 = Integer.MAX_VALUE;
                }
                companion4 = TextOverflow.Companion;
                if (zBooleanValue) {
                    iM3568getClipgIe3tQ8 = companion4.m3569getEllipsisgIe3tQ8();
                } else {
                    iM3568getClipgIe3tQ8 = companion4.m3568getClipgIe3tQ8();
                }
                int i34 = iM3568getClipgIe3tQ8;
                if (zBooleanValue) {
                    i10 = RemoteActionCompatParcelizer + 107;
                    read = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        companion5 = companion2;
                        modifierM = d$$ExternalSyntheticOutline0.m(0.0f, true, companion5);
                    } else {
                        companion5 = companion2;
                        modifierM = d$$ExternalSyntheticOutline0.m(1.0f, false, companion5);
                    }
                    modifier3 = modifierM;
                } else {
                    companion5 = companion2;
                    modifier3 = companion5;
                }
                TextKt.m131TextNvy7gAk(str, modifier3, supportBackgroundTintMode5, 0L, null, null, 0L, null, 0L, i34, false, i9, 0, null, textStyle, getpostalcode, i8, 0, 110584);
                if (z8) {
                    getpostalcode.serializer(-1169970006);
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_arrow_fullscreen, getpostalcode, 0), (String) null, ClickableKt.RemoteActionCompatParcelizer(SizeKt.m83size3ABfNKs(companion5, Dimensions.setLogo), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 15), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), getpostalcode, Painter.$stable | 48, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-1169649683);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                modifier2 = companion5;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Modifier modifier7 = modifier2;
            final float f6 = fM3693getUnspecifiedD9Ej5fM;
            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getHairlineD9Ej5fMannotations
                private static int MediaBrowserCompatMediaItem = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i35 = 2 % 2;
                    int i36 = MediaBrowserCompatMediaItem + 115;
                    RatingCompat = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i37 = i36 % 2;
                    ((Integer) obj2).getClass();
                    ShelfNumberChipKt.m4946ShelfNumberChiphGBTI10(str, z, modifier7, f6, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i38 = MediaBrowserCompatMediaItem + 3;
                    RatingCompat = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i38 % 2 == 0) {
                        int i39 = 39 / 0;
                    }
                    return createfromparcel;
                }
            };
        }
    }
}
