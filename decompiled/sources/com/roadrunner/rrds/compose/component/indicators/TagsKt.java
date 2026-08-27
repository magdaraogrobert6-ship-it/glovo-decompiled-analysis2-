package com.roadrunner.rrds.compose.component.indicators;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.SingleThreadFutureScheduler2;
import o.SwitchDefaults;
import o.SwitchKt;
import o.TextFieldDefaults;
import o.buildMapping;
import o.emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.onMessageReceived;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.processQueue;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.runSyncInPlayAdIdSchedulerWithTimeout;
import o.setCurrentSemanticsNodesui;
import o.submit;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagsKt {
    private static int serializer = 1;
    private static int write;

    public static /* synthetic */ Object serializer(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7;
        Modifier modifier;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        int i14;
        int i15 = ~i4;
        int i16 = ~i2;
        int i17 = (~(i15 | i16)) | i;
        int i18 = i2 | i15;
        int i19 = (~(i2 | i)) | (~(i15 | (~i) | i16)) | (~(i | i4));
        int i20 = i + i4 + i6 + (764943627 * i5) + (189947931 * i3);
        int i21 = i20 * i20;
        int i22 = (i * 1860537600) + 224780607 + (i4 * 1860537600) + (i17 * 1034) + (i18 * (-517)) + (i19 * 517) + (1860538117 * i6) + ((-1861700041) * i5) + ((-831392377) * i3) + (i21 * 995229696);
        int i23 = 4;
        if (((i * (-973936384)) - 801505280) + ((-973936384) * i4) + (1838296578 * i17) + (1228335359 * i18) + ((-1228335359) * i19) + (2092695552 * i6) + ((-1475084288) * i5) + ((-1479278592) * i3) + ((-626393088) * i21) + (i22 * i22 * 1053163520) == 1) {
            CharSequence charSequence = (CharSequence) objArr[0];
            Modifier modifier3 = (Modifier) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            getBirthDateFull getbirthdatefull = (getBirthDateFull) objArr[4];
            int iIntValue3 = ((Number) objArr[5]).intValue();
            int iIntValue4 = ((Number) objArr[6]).intValue();
            int i24 = 2 % 2;
            int i25 = write + 47;
            serializer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            charSequence.getClass();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(103499959);
            if ((iIntValue3 & 6) == 0) {
                i7 = (getpostalcode.IconCompatParcelizer(charSequence) ? 4 : 2) | iIntValue3;
            } else {
                i7 = iIntValue3;
            }
            int i27 = iIntValue4 & 2;
            if (i27 != 0) {
                i7 |= 48;
            } else if ((iIntValue3 & 48) == 0) {
                int i28 = write + 9;
                serializer = i28 % Fields.SpotShadowColor;
                int i29 = i28 % 2;
                i7 |= getpostalcode.read(modifier3) ? 32 : 16;
            }
            int i30 = iIntValue4 & 4;
            if (i30 != 0) {
                i7 |= 384;
            } else if ((iIntValue3 & 384) == 0) {
                i7 |= getpostalcode.read(iIntValue) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            int i31 = i7 | 3072;
            if ((iIntValue4 & 16) != 0) {
                i31 = i7 | 27648;
            } else if ((iIntValue3 & 24576) == 0) {
                i31 |= getpostalcode.read((Object) null) ? Fields.Clip : 8192;
            }
            if (getpostalcode.write(i31 & 1, (i31 & 9363) != 9362)) {
                if (i27 != 0) {
                    modifier3 = Modifier.Companion;
                }
                i10 = i30 == 0 ? iIntValue : 0;
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPanelClosed = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onPanelClosed();
                long subtitle = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSubtitle();
                float f = Dimensions.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                long jEdgeToEdgeExternalSyntheticLambda0 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).EdgeToEdgeExternalSyntheticLambda0();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addMenuProvider);
                Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSubtitle());
                int i32 = i31 << 6;
                m5043TagTvwr6S8(charSequence, jOnPanelClosed, gettopleftannotationsIconCompatParcelizer, modifier3, subtitle, 1, f, jEdgeToEdgeExternalSyntheticLambda0, null, i10, colorM712boximpl, getpostalcode, (i32 & 458752) | (i31 & 14) | (i32 & 7168) | ((i31 << 12) & 234881024) | ((i31 << 21) & 1879048192), 0, 0);
                modifier = modifier3;
                i8 = i10;
                i9 = 1;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier = modifier3;
                i8 = iIntValue;
                i9 = iIntValue2;
            }
            getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat == null) {
                return null;
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier, i8, i9, iIntValue3, iIntValue4, 3);
            return null;
        }
        CharSequence charSequence2 = (CharSequence) objArr[0];
        Modifier modifier4 = (Modifier) objArr[1];
        int iIntValue5 = ((Number) objArr[2]).intValue();
        int iIntValue6 = ((Number) objArr[3]).intValue();
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) objArr[4];
        int iIntValue7 = ((Number) objArr[5]).intValue();
        int iIntValue8 = ((Number) objArr[6]).intValue();
        int i33 = 2 % 2;
        charSequence2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        getpostalcode2.MediaSessionCompatQueueItem(-1084881208);
        if ((iIntValue7 & 6) == 0) {
            int i34 = write + 39;
            serializer = i34 % Fields.SpotShadowColor;
            int i35 = i34 % 2;
            if (getpostalcode2.IconCompatParcelizer(charSequence2)) {
                int i36 = serializer + 91;
                write = i36 % Fields.SpotShadowColor;
                int i37 = i36 % 2;
            } else {
                i23 = 2;
            }
            i11 = i23 | iIntValue7;
        } else {
            i11 = iIntValue7;
        }
        int i38 = iIntValue8 & 2;
        if (i38 != 0) {
            int i39 = write + 103;
            serializer = i39 % Fields.SpotShadowColor;
            i11 = i39 % 2 == 0 ? i11 | 88 : i11 | 48;
        } else if ((iIntValue7 & 48) == 0) {
            if (getpostalcode2.read(modifier4)) {
                int i40 = serializer + 67;
                write = i40 % Fields.SpotShadowColor;
                int i41 = i40 % 2;
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i42 = iIntValue8 & 4;
        if (i42 != 0) {
            i11 |= 384;
            int i43 = write + 1;
            serializer = i43 % Fields.SpotShadowColor;
            int i44 = i43 % 2;
        } else if ((iIntValue7 & 384) == 0) {
            i11 |= getpostalcode2.read(iIntValue5) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i45 = iIntValue8 & 8;
        if (i45 != 0) {
            i11 |= 3072;
        } else if ((iIntValue7 & 3072) == 0) {
            i11 |= getpostalcode2.read(iIntValue6) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i46 = i11 | 24576;
        if (getpostalcode2.write(i46 & 1, (i46 & 9363) != 9362)) {
            if (i38 != 0) {
                modifier4 = Modifier.Companion;
            }
            Modifier modifier5 = modifier4;
            i10 = i42 == 0 ? iIntValue5 : 0;
            int i47 = i45 == 0 ? iIntValue6 : 1;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).onCreate(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
            long transitioning = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).setTransitioning();
            float f2 = Dimensions.PlaybackStateCompatCustomAction;
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer2 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda00);
            Color colorM712boximpl2 = Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).setTransitioning());
            int i48 = i46 << 6;
            m5043TagTvwr6S8(charSequence2, jM721copywmQWz5c$default, gettopleftannotationsIconCompatParcelizer2, modifier5, transitioning, i47, f2, 0L, null, i10, colorM712boximpl2, getpostalcode2, (i48 & 458752) | (i46 & 14) | (i48 & 7168) | ((i46 << 12) & 234881024) | ((i46 << 21) & 1879048192), 0, Fields.SpotShadowColor);
            modifier2 = modifier5;
            i14 = i10;
            i13 = i47;
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i13 = iIntValue6;
            modifier2 = modifier4;
            i14 = iIntValue5;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 == null) {
            return null;
        }
        gethandleruiannotationsMediaDescriptionCompat2.serializer = new submit(charSequence2, modifier2, i14, i13, iIntValue7, iIntValue8, 5);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r8
  0x0024: PHI (r8v2 o.getPostalCode) = (r8v1 o.getPostalCode), (r8v5 o.getPostalCode) binds: [B:8:0x0022, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2 = 2 % 2;
        int i3 = serializer + 27;
        write = i3 % Fields.SpotShadowColor;
        boolean z = false;
        if (i3 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(580884170);
            int i4 = 37 / 0;
            if (i != 0) {
                int i5 = write + 49;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(580884170);
            if (i != 0) {
                int i7 = write + 49;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z = true;
            }
        }
        if (getpostalcode.write(i & 1, z)) {
            int i9 = write + 101;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Object[] objArr = {getpostalcode, SizeKt.m86width3ABfNKs(Modifier.Companion, Dimensions.getActionBarHideOffset)};
            int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 6);
        }
    }

    /* JADX INFO: renamed from: TagImage-ZLcQsz0, reason: not valid java name */
    public static final void m5044TagImageZLcQsz0(int i, Color color, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        String str;
        Alignment alignment;
        ContentScale contentScale;
        float f;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = write + 75;
        serializer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1846292371);
        if ((i2 & 6) == 0) {
            int i10 = write + 99;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (getpostalcode.read(i)) {
                int i12 = write + 83;
                serializer = i12 % Fields.SpotShadowColor;
                i6 = i12 % 2 == 0 ? 3 : 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
            int i13 = serializer + 53;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(color) ^ true ? 16 : 32;
        }
        if ((i3 & 19) != 18) {
            int i15 = write + 119;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            int i17 = serializer + 1;
            write = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i, getpostalcode, i3 & 14);
            Modifier modifierM84sizeVpY3zN4 = SizeKt.m84sizeVpY3zN4(Modifier.Companion, Dp.m3673constructorimpl(25.0f), Dp.m3673constructorimpl(25.0f));
            ColorFilter colorFilterM763tintxETnrds$default = color != null ? ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, color.m732unboximpl(), 0, 2, null) : null;
            int i19 = write + 103;
            serializer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 == 0) {
                str = null;
                alignment = null;
                contentScale = null;
                f = 0.0f;
                i4 = Painter.$stable | 13966;
                i5 = 50;
            } else {
                str = null;
                alignment = null;
                contentScale = null;
                f = 0.0f;
                i4 = Painter.$stable | 432;
                i5 = 56;
            }
            ImageKt.Image(painterPainterResource, str, modifierM84sizeVpY3zN4, alignment, contentScale, f, colorFilterM763tintxETnrds$default, getpostalcode, i4, i5);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadFutureScheduler2(i, i2, 0, color);
        }
    }

    public static final void IconCompatParcelizer(CharSequence charSequence, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-677106882);
        if ((i2 & 6) == 0) {
            if (!getpostalcode.IconCompatParcelizer(charSequence)) {
                i5 = 2;
            } else {
                int i7 = write + 43;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        int i9 = i3 | 28080;
        boolean z = false;
        if ((i9 & 9363) != 9362) {
            int i10 = write + 1;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int i11 = write + 9;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jOnCreatePanelMenu = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onCreatePanelMenu();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda0);
            long tabContainer = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setTabContainer();
            float f = Dimensions.ParcelableVolumeInfo;
            long jR8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ();
            Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setTabContainer());
            int i13 = i9 << 6;
            m5043TagTvwr6S8(charSequence, jOnCreatePanelMenu, gettopleftannotationsIconCompatParcelizer, companion, tabContainer, 1, f, jR8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ, null, 0, colorM712boximpl, getpostalcode, (i13 & 7168) | (i9 & 14) | (i13 & 458752) | ((i9 << 12) & 234881024) | ((i9 << 21) & 1879048192), 0, 0);
            int i14 = serializer + 71;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            modifier2 = companion;
            i4 = 1;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            i4 = i;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new processQueue(charSequence, modifier2, i4, i2, 2);
        }
        int i16 = write + 21;
        serializer = i16 % Fields.SpotShadowColor;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static final void read(CharSequence charSequence, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        Modifier modifier2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(223820979);
        if ((i2 & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(charSequence)) {
                i5 = 4;
            } else {
                int i7 = serializer + 77;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 2;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        int i9 = i3 | 28080;
        if ((i9 & 9363) != 9362) {
            int i10 = write + 97;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 2 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jOnMenuItemSelected = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onMenuItemSelected();
            long animatedVisibility = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getAnimatedVisibility();
            float f = Dimensions.PlaybackStateCompatCustomAction;
            long jStartIntentSenderForResult = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).startIntentSenderForResult();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda00);
            Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getAnimatedVisibility());
            int i12 = i9 << 6;
            m5043TagTvwr6S8(charSequence, jOnMenuItemSelected, gettopleftannotationsIconCompatParcelizer, companion, animatedVisibility, 1, f, jStartIntentSenderForResult, null, 0, colorM712boximpl, getpostalcode, (i12 & 458752) | (i12 & 7168) | (i9 & 14) | ((i9 << 12) & 234881024) | ((i9 << 21) & 1879048192), 0, 0);
            modifier2 = companion;
            i4 = 1;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            i4 = i;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new processQueue(charSequence, modifier2, i4, i2, 0);
            int i13 = serializer + 95;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
    }

    public static final void serializer(CharSequence charSequence, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 21;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(15788279);
        if ((i2 & 6) == 0) {
            int i8 = write + 27;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(charSequence);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 = i2 | (getpostalcode2.IconCompatParcelizer(charSequence) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i9 = i3 | 28080;
        if ((i9 & 9363) != 9362) {
            int i10 = serializer + 29;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            int i12 = serializer + 25;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            int i14 = write + 27;
            serializer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            Modifier.Companion companion = Modifier.Companion;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            getpostalcode = getpostalcode2;
            m5043TagTvwr6S8(charSequence, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).onNewIntent(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addContentView), companion, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setVisibility(), 1, Dimensions.MediaSessionCompatToken, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getLifecycleRegistry1(), null, 0, Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setVisibility()), getpostalcode, (i9 & 14) | ((i9 << 6) & 7168) | ((i9 << 9) & 458752) | ((i9 << 12) & 234881024) | ((i9 << 18) & 1879048192), 0, 0);
            i4 = 1;
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i16 = serializer + 35;
            write = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            modifier2 = modifier;
            i4 = i;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new processQueue(charSequence, modifier2, i4, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void MediaBrowserCompatMediaItem(CharSequence charSequence, Modifier modifier, int i, int i2, getBirthDateFull getbirthdatefull, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        getPostalCode getpostalcode;
        int i12;
        Modifier modifier3;
        int i13;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 2 % 2;
        int i19 = write + 123;
        serializer = i19 % Fields.SpotShadowColor;
        int i20 = i19 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(681475318);
        Object obj = null;
        if ((i3 & 6) == 0) {
            int i21 = serializer + 7;
            write = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(charSequence);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(charSequence)) {
                int i22 = serializer;
                int i23 = i22 + 25;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                int i25 = i22 + 43;
                write = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i3;
        } else {
            i5 = i3;
        }
        int i27 = i4 & 2;
        if (i27 == 0) {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= getpostalcode2.read(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    i7 = i;
                    if (getpostalcode2.read(i7)) {
                        i8 = Fields.RotationX;
                    } else {
                        i8 = Fields.SpotShadowColor;
                    }
                    i5 |= i8;
                }
                i9 = i5 | 3072;
                if ((i4 & 16) != 0) {
                    i16 = serializer + 93;
                    write = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        i9 = i5 | 22535;
                    } else {
                        i9 = i5 | 27648;
                    }
                } else if ((i3 & 24576) == 0) {
                    if (getpostalcode2.read((Object) null)) {
                        i10 = Fields.Clip;
                    } else {
                        i10 = 8192;
                    }
                    i9 |= i10;
                }
                i11 = i9;
                if ((i11 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode2.write(i11 & 1, z)) {
                    if (i27 != 0) {
                        i15 = serializer + 109;
                        write = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            Modifier.Companion companion = Modifier.Companion;
                            obj.hashCode();
                            throw null;
                        }
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i6 != 0) {
                        i14 = 0;
                    } else {
                        i14 = i7;
                    }
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long jOnPictureInPictureModeChanged = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).onPictureInPictureModeChanged();
                    long nestedScrollAxes = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getNestedScrollAxes();
                    float f = Dimensions.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    long jInvoke = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).invoke();
                    getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnNewIntentListener);
                    Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getNestedScrollAxes());
                    int i28 = i11 << 6;
                    getpostalcode = getpostalcode2;
                    m5043TagTvwr6S8(charSequence, jOnPictureInPictureModeChanged, gettopleftannotationsIconCompatParcelizer, modifier4, nestedScrollAxes, 1, f, jInvoke, null, i14, colorM712boximpl, getpostalcode, (i28 & 458752) | (i11 & 14) | (i28 & 7168) | ((i11 << 12) & 234881024) | ((i11 << 21) & 1879048192), 0, 0);
                    i12 = 1;
                    modifier3 = modifier4;
                    i13 = i14;
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i12 = i2;
                    modifier3 = modifier2;
                    i13 = i7;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 1);
                }
            }
            i5 |= 384;
            i7 = i;
            i9 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i16 = serializer + 93;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    i9 = i5 | 22535;
                } else {
                    i9 = i5 | 27648;
                }
            } else if ((i3 & 24576) == 0) {
                if (getpostalcode2.read((Object) null)) {
                    i10 = Fields.Clip;
                } else {
                    i10 = 8192;
                }
                i9 |= i10;
            }
            i11 = i9;
            if ((i11 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode2.write(i11 & 1, z)) {
                if (i27 != 0) {
                    i15 = serializer + 109;
                    write = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        Modifier.Companion companion2 = Modifier.Companion;
                        obj.hashCode();
                        throw null;
                    }
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i6 != 0) {
                    i14 = 0;
                } else {
                    i14 = i7;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPictureInPictureModeChanged2 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).onPictureInPictureModeChanged();
                long nestedScrollAxes2 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).getNestedScrollAxes();
                float f2 = Dimensions.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                long jInvoke2 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).invoke();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer2 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnNewIntentListener);
                Color colorM712boximpl2 = Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui2)).getNestedScrollAxes());
                int i29 = i11 << 6;
                getpostalcode = getpostalcode2;
                m5043TagTvwr6S8(charSequence, jOnPictureInPictureModeChanged2, gettopleftannotationsIconCompatParcelizer2, modifier4, nestedScrollAxes2, 1, f2, jInvoke2, null, i14, colorM712boximpl2, getpostalcode, (i29 & 458752) | (i11 & 14) | (i29 & 7168) | ((i11 << 12) & 234881024) | ((i11 << 21) & 1879048192), 0, 0);
                i12 = 1;
                modifier3 = modifier4;
                i13 = i14;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i12 = i2;
                modifier3 = modifier2;
                i13 = i7;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 1);
            }
        }
        i5 |= 48;
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                i7 = i;
                if (getpostalcode2.read(i7)) {
                    i8 = Fields.RotationX;
                } else {
                    i8 = Fields.SpotShadowColor;
                }
                i5 |= i8;
            }
            i9 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i16 = serializer + 93;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    i9 = i5 | 22535;
                } else {
                    i9 = i5 | 27648;
                }
            } else if ((i3 & 24576) == 0) {
                if (getpostalcode2.read((Object) null)) {
                    i10 = Fields.Clip;
                } else {
                    i10 = 8192;
                }
                i9 |= i10;
            }
            i11 = i9;
            if ((i11 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode2.write(i11 & 1, z)) {
                if (i27 != 0) {
                    i15 = serializer + 109;
                    write = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        Modifier.Companion companion3 = Modifier.Companion;
                        obj.hashCode();
                        throw null;
                    }
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i6 != 0) {
                    i14 = 0;
                } else {
                    i14 = i7;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPictureInPictureModeChanged3 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui3)).onPictureInPictureModeChanged();
                long nestedScrollAxes3 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui3)).getNestedScrollAxes();
                float f3 = Dimensions.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                long jInvoke3 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui3)).invoke();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer3 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnNewIntentListener);
                Color colorM712boximpl3 = Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui3)).getNestedScrollAxes());
                int i210 = i11 << 6;
                getpostalcode = getpostalcode2;
                m5043TagTvwr6S8(charSequence, jOnPictureInPictureModeChanged3, gettopleftannotationsIconCompatParcelizer3, modifier4, nestedScrollAxes3, 1, f3, jInvoke3, null, i14, colorM712boximpl3, getpostalcode, (i210 & 458752) | (i11 & 14) | (i210 & 7168) | ((i11 << 12) & 234881024) | ((i11 << 21) & 1879048192), 0, 0);
                i12 = 1;
                modifier3 = modifier4;
                i13 = i14;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i12 = i2;
                modifier3 = modifier2;
                i13 = i7;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 1);
            }
        }
        i5 |= 384;
        i7 = i;
        i9 = i5 | 3072;
        if ((i4 & 16) != 0) {
            i16 = serializer + 93;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                i9 = i5 | 22535;
            } else {
                i9 = i5 | 27648;
            }
        } else if ((i3 & 24576) == 0) {
            if (getpostalcode2.read((Object) null)) {
                i10 = Fields.Clip;
            } else {
                i10 = 8192;
            }
            i9 |= i10;
        }
        i11 = i9;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i11 & 1, z)) {
            if (i27 != 0) {
                i15 = serializer + 109;
                write = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    Modifier.Companion companion4 = Modifier.Companion;
                    obj.hashCode();
                    throw null;
                }
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i6 != 0) {
                i14 = 0;
            } else {
                i14 = i7;
            }
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui4 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jOnPictureInPictureModeChanged4 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).onPictureInPictureModeChanged();
            long nestedScrollAxes4 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).getNestedScrollAxes();
            float f4 = Dimensions.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            long jInvoke4 = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).invoke();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer4 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnNewIntentListener);
            Color colorM712boximpl4 = Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui4)).getNestedScrollAxes());
            int i211 = i11 << 6;
            getpostalcode = getpostalcode2;
            m5043TagTvwr6S8(charSequence, jOnPictureInPictureModeChanged4, gettopleftannotationsIconCompatParcelizer4, modifier4, nestedScrollAxes4, 1, f4, jInvoke4, null, i14, colorM712boximpl4, getpostalcode, (i211 & 458752) | (i11 & 14) | (i211 & 7168) | ((i11 << 12) & 234881024) | ((i11 << 21) & 1879048192), 0, 0);
            i12 = 1;
            modifier3 = modifier4;
            i13 = i14;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i12 = i2;
            modifier3 = modifier2;
            i13 = i7;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(CharSequence charSequence, Modifier modifier, int i, int i2, getBirthDateFull getbirthdatefull, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i13;
        int i14;
        int i15;
        Modifier modifier3 = modifier;
        int i16 = 2 % 2;
        int i17 = serializer + 67;
        write = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1701661416);
        if ((i3 & 6) == 0) {
            int i19 = write + 63;
            serializer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            i5 = (getpostalcode.IconCompatParcelizer(charSequence) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        Object obj = null;
        if (i21 == 0) {
            if ((i3 & 48) == 0) {
                int i22 = serializer + 33;
                write = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    getpostalcode.read(modifier3);
                    throw null;
                }
                i5 |= getpostalcode.read(modifier3) ? 32 : 16;
            }
            i6 = i4 & 4;
            i7 = 1;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    i8 = i;
                    if (!getpostalcode.read(i8)) {
                        i9 = Fields.SpotShadowColor;
                    } else {
                        i9 = Fields.RotationX;
                    }
                    i5 |= i9;
                }
                i10 = i5 | 3072;
                if ((i4 & 16) != 0) {
                    i14 = serializer + 29;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        i10 = i5 | 27740;
                    } else {
                        i10 = i5 | 27648;
                    }
                } else if ((i3 & 24576) == 0) {
                    i11 = serializer + 89;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        getpostalcode.read((Object) null);
                        obj.hashCode();
                        throw null;
                    }
                    if (getpostalcode.read((Object) null)) {
                        i12 = Fields.Clip;
                    } else {
                        i12 = 8192;
                    }
                    i10 |= i12;
                }
                if ((i10 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode.write(i10 & 1, z)) {
                    if (i21 != 0) {
                        modifier3 = Modifier.Companion;
                    }
                    if (i6 != 0) {
                        int i23 = serializer + 17;
                        write = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        i13 = 0;
                    } else {
                        i13 = i8;
                    }
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long jOnRequestPermissionsResult = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onRequestPermissionsResult();
                    long contentHeight = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setContentHeight();
                    float f = Dimensions.ComponentActivity;
                    long jOnStop = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onStop();
                    getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnConfigurationChangedListener);
                    Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setContentHeight());
                    int i25 = i10 << 6;
                    m5043TagTvwr6S8(charSequence, jOnRequestPermissionsResult, gettopleftannotationsIconCompatParcelizer, modifier3, contentHeight, 1, f, jOnStop, null, i13, colorM712boximpl, getpostalcode, (i25 & 458752) | (i10 & 14) | (i25 & 7168) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
                    modifier2 = modifier3;
                    i8 = i13;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i7 = i2;
                    modifier2 = modifier3;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier2, i8, i7, i3, i4, 0);
                }
            }
            i15 = write + 121;
            serializer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                i5 |= 7479;
            } else {
                i5 |= 384;
            }
            i8 = i;
            i10 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i14 = serializer + 29;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    i10 = i5 | 27740;
                } else {
                    i10 = i5 | 27648;
                }
            } else if ((i3 & 24576) == 0) {
                i11 = serializer + 89;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode.read((Object) null);
                    obj.hashCode();
                    throw null;
                }
                if (getpostalcode.read((Object) null)) {
                    i12 = Fields.Clip;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            if ((i10 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i10 & 1, z)) {
                if (i21 != 0) {
                    modifier3 = Modifier.Companion;
                }
                if (i6 != 0) {
                    int i26 = serializer + 17;
                    write = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    i13 = 0;
                } else {
                    i13 = i8;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnRequestPermissionsResult2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).onRequestPermissionsResult();
                long contentHeight2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setContentHeight();
                float f2 = Dimensions.ComponentActivity;
                long jOnStop2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).onStop();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer2 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnConfigurationChangedListener);
                Color colorM712boximpl2 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setContentHeight());
                int i28 = i10 << 6;
                m5043TagTvwr6S8(charSequence, jOnRequestPermissionsResult2, gettopleftannotationsIconCompatParcelizer2, modifier3, contentHeight2, 1, f2, jOnStop2, null, i13, colorM712boximpl2, getpostalcode, (i28 & 458752) | (i10 & 14) | (i28 & 7168) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
                modifier2 = modifier3;
                i8 = i13;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i7 = i2;
                modifier2 = modifier3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier2, i8, i7, i3, i4, 0);
            }
        }
        i5 |= 48;
        int i29 = write + 115;
        serializer = i29 % Fields.SpotShadowColor;
        int i30 = i29 % 2;
        i6 = i4 & 4;
        i7 = 1;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                i8 = i;
                if (!getpostalcode.read(i8)) {
                    i9 = Fields.SpotShadowColor;
                } else {
                    i9 = Fields.RotationX;
                }
                i5 |= i9;
            }
            i10 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i14 = serializer + 29;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    i10 = i5 | 27740;
                } else {
                    i10 = i5 | 27648;
                }
            } else if ((i3 & 24576) == 0) {
                i11 = serializer + 89;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode.read((Object) null);
                    obj.hashCode();
                    throw null;
                }
                if (getpostalcode.read((Object) null)) {
                    i12 = Fields.Clip;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            if ((i10 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i10 & 1, z)) {
                if (i21 != 0) {
                    modifier3 = Modifier.Companion;
                }
                if (i6 != 0) {
                    int i210 = serializer + 17;
                    write = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    i13 = 0;
                } else {
                    i13 = i8;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnRequestPermissionsResult3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).onRequestPermissionsResult();
                long contentHeight3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).setContentHeight();
                float f3 = Dimensions.ComponentActivity;
                long jOnStop3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).onStop();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer3 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnConfigurationChangedListener);
                Color colorM712boximpl3 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).setContentHeight());
                int i212 = i10 << 6;
                m5043TagTvwr6S8(charSequence, jOnRequestPermissionsResult3, gettopleftannotationsIconCompatParcelizer3, modifier3, contentHeight3, 1, f3, jOnStop3, null, i13, colorM712boximpl3, getpostalcode, (i212 & 458752) | (i10 & 14) | (i212 & 7168) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
                modifier2 = modifier3;
                i8 = i13;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i7 = i2;
                modifier2 = modifier3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier2, i8, i7, i3, i4, 0);
            }
        }
        i15 = write + 121;
        serializer = i15 % Fields.SpotShadowColor;
        if (i15 % 2 == 0) {
            i5 |= 7479;
        } else {
            i5 |= 384;
        }
        i8 = i;
        i10 = i5 | 3072;
        if ((i4 & 16) != 0) {
            i14 = serializer + 29;
            write = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                i10 = i5 | 27740;
            } else {
                i10 = i5 | 27648;
            }
        } else if ((i3 & 24576) == 0) {
            i11 = serializer + 89;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.read((Object) null);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.read((Object) null)) {
                i12 = Fields.Clip;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            if (i21 != 0) {
                modifier3 = Modifier.Companion;
            }
            if (i6 != 0) {
                int i213 = serializer + 17;
                write = i213 % Fields.SpotShadowColor;
                int i214 = i213 % 2;
                i13 = 0;
            } else {
                i13 = i8;
            }
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui4 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jOnRequestPermissionsResult4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).onRequestPermissionsResult();
            long contentHeight4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).setContentHeight();
            float f4 = Dimensions.ComponentActivity;
            long jOnStop4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).onStop();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer4 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnConfigurationChangedListener);
            Color colorM712boximpl4 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).setContentHeight());
            int i215 = i10 << 6;
            m5043TagTvwr6S8(charSequence, jOnRequestPermissionsResult4, gettopleftannotationsIconCompatParcelizer4, modifier3, contentHeight4, 1, f4, jOnStop4, null, i13, colorM712boximpl4, getpostalcode, (i215 & 458752) | (i10 & 14) | (i215 & 7168) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
            modifier2 = modifier3;
            i8 = i13;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i7 = i2;
            modifier2 = modifier3;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier2, i8, i7, i3, i4, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0155  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void serializer(CharSequence charSequence, Modifier modifier, int i, int i2, getBirthDateFull getbirthdatefull, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        Modifier modifier3;
        int i13;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 2 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1984136989);
        if ((i3 & 6) == 0) {
            int i19 = serializer + 65;
            write = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            if (!getpostalcode.IconCompatParcelizer(charSequence)) {
                i17 = 2;
            } else {
                int i21 = write + 97;
                serializer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                i17 = 4;
            }
            i5 = i17 | i3;
        } else {
            i5 = i3;
        }
        int i23 = i4 & 2;
        if (i23 == 0) {
            if ((i3 & 48) == 0) {
                int i24 = serializer + 37;
                write = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                modifier2 = modifier;
                if (getpostalcode.read(modifier2)) {
                    int i26 = write + 125;
                    serializer = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    i6 = 32;
                } else {
                    i6 = 16;
                }
                i5 |= i6;
            }
            i7 = i4 & 4;
            if (i7 != 0) {
                if ((i3 & 384) == 0) {
                    i8 = i;
                    if (getpostalcode.read(i8)) {
                        int i28 = serializer + 61;
                        write = i28 % Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        i9 = Fields.RotationX;
                    } else {
                        i9 = Fields.SpotShadowColor;
                    }
                    i5 |= i9;
                }
                i10 = i5 | 3072;
                if ((i4 & 16) != 0) {
                    i10 = i5 | 27648;
                } else if ((i3 & 24576) == 0) {
                    if (getpostalcode.read((Object) null)) {
                        i11 = Fields.Clip;
                    } else {
                        i11 = 8192;
                    }
                    i10 |= i11;
                }
                if ((i10 & 9363) != 9362) {
                    i16 = serializer + 51;
                    write = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (getpostalcode.write(i10 & 1, z)) {
                    if (i23 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i7 != 0) {
                        i15 = write + 7;
                        serializer = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                    } else {
                        i14 = i8;
                    }
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long jOnPreparePanel = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onPreparePanel();
                    long title = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getTitle();
                    float f = Dimensions.ResultReceiver;
                    long jComponentDialog = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).ComponentDialog();
                    getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnMultiWindowModeChangedListener);
                    Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getTitle());
                    int i30 = i10 << 6;
                    m5043TagTvwr6S8(charSequence, jOnPreparePanel, gettopleftannotationsIconCompatParcelizer, modifier3, title, 1, f, jComponentDialog, null, i14, colorM712boximpl, getpostalcode, (i10 & 14) | (i30 & 7168) | (i30 & 458752) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
                    i13 = i14;
                    i12 = 1;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i12 = i2;
                    modifier3 = modifier2;
                    i13 = i8;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 4);
                }
            }
            i5 |= 384;
            i8 = i;
            i10 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i10 = i5 | 27648;
            } else if ((i3 & 24576) == 0) {
                if (getpostalcode.read((Object) null)) {
                    i11 = Fields.Clip;
                } else {
                    i11 = 8192;
                }
                i10 |= i11;
            }
            if ((i10 & 9363) != 9362) {
                i16 = serializer + 51;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (getpostalcode.write(i10 & 1, z)) {
                if (i23 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i7 != 0) {
                    i15 = write + 7;
                    serializer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i14 = i8;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPreparePanel2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).onPreparePanel();
                long title2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).getTitle();
                float f2 = Dimensions.ResultReceiver;
                long jComponentDialog2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).ComponentDialog();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer2 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnMultiWindowModeChangedListener);
                Color colorM712boximpl2 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).getTitle());
                int i31 = i10 << 6;
                m5043TagTvwr6S8(charSequence, jOnPreparePanel2, gettopleftannotationsIconCompatParcelizer2, modifier3, title2, 1, f2, jComponentDialog2, null, i14, colorM712boximpl2, getpostalcode, (i10 & 14) | (i31 & 7168) | (i31 & 458752) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
                i13 = i14;
                i12 = 1;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i12 = i2;
                modifier3 = modifier2;
                i13 = i8;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 4);
            }
        }
        int i32 = serializer + 97;
        write = i32 % Fields.SpotShadowColor;
        int i33 = i32 % 2;
        i5 |= 48;
        modifier2 = modifier;
        i7 = i4 & 4;
        if (i7 != 0) {
            if ((i3 & 384) == 0) {
                i8 = i;
                if (getpostalcode.read(i8)) {
                    int i210 = serializer + 61;
                    write = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    i9 = Fields.RotationX;
                } else {
                    i9 = Fields.SpotShadowColor;
                }
                i5 |= i9;
            }
            i10 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i10 = i5 | 27648;
            } else if ((i3 & 24576) == 0) {
                if (getpostalcode.read((Object) null)) {
                    i11 = Fields.Clip;
                } else {
                    i11 = 8192;
                }
                i10 |= i11;
            }
            if ((i10 & 9363) != 9362) {
                i16 = serializer + 51;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (getpostalcode.write(i10 & 1, z)) {
                if (i23 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i7 != 0) {
                    i15 = write + 7;
                    serializer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i14 = i8;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPreparePanel3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).onPreparePanel();
                long title3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).getTitle();
                float f3 = Dimensions.ResultReceiver;
                long jComponentDialog3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).ComponentDialog();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer3 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnMultiWindowModeChangedListener);
                Color colorM712boximpl3 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).getTitle());
                int i34 = i10 << 6;
                m5043TagTvwr6S8(charSequence, jOnPreparePanel3, gettopleftannotationsIconCompatParcelizer3, modifier3, title3, 1, f3, jComponentDialog3, null, i14, colorM712boximpl3, getpostalcode, (i10 & 14) | (i34 & 7168) | (i34 & 458752) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
                i13 = i14;
                i12 = 1;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i12 = i2;
                modifier3 = modifier2;
                i13 = i8;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 4);
            }
        }
        i5 |= 384;
        i8 = i;
        i10 = i5 | 3072;
        if ((i4 & 16) != 0) {
            i10 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            if (getpostalcode.read((Object) null)) {
                i11 = Fields.Clip;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        if ((i10 & 9363) != 9362) {
            i16 = serializer + 51;
            write = i16 % Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            if (i23 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i7 != 0) {
                i15 = write + 7;
                serializer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            } else {
                i14 = i8;
            }
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui4 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jOnPreparePanel4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).onPreparePanel();
            long title4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).getTitle();
            float f4 = Dimensions.ResultReceiver;
            long jComponentDialog4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).ComponentDialog();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer4 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnMultiWindowModeChangedListener);
            Color colorM712boximpl4 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).getTitle());
            int i35 = i10 << 6;
            m5043TagTvwr6S8(charSequence, jOnPreparePanel4, gettopleftannotationsIconCompatParcelizer4, modifier3, title4, 1, f4, jComponentDialog4, null, i14, colorM712boximpl4, getpostalcode, (i10 & 14) | (i35 & 7168) | (i35 & 458752) | ((i10 << 12) & 234881024) | ((i10 << 21) & 1879048192), 0, 0);
            i13 = i14;
            i12 = 1;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i12 = i2;
            modifier3 = modifier2;
            i13 = i8;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i13, i12, i3, i4, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void write(CharSequence charSequence, Modifier modifier, int i, int i2, getBirthDateFull getbirthdatefull, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        Modifier modifier3;
        int i15;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i16;
        int i17 = 2 % 2;
        charSequence.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1909694116);
        if ((i3 & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(charSequence)) {
                int i18 = write + 35;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i3;
        } else {
            i5 = i3;
        }
        int i20 = i4 & 2;
        if (i20 == 0) {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    i7 = i;
                    if (getpostalcode.read(i7)) {
                        int i21 = write + 67;
                        int i22 = i21 % Fields.SpotShadowColor;
                        serializer = i22;
                        int i23 = i21 % 2;
                        int i24 = i22 + 61;
                        write = i24 % Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                        i8 = Fields.RotationX;
                    } else {
                        i8 = Fields.SpotShadowColor;
                    }
                    i5 |= i8;
                }
                i9 = i5 | 3072;
                if ((i4 & 16) != 0) {
                    i9 = i5 | 27648;
                } else if ((i3 & 24576) == 0) {
                    i10 = write + 11;
                    serializer = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 != 0) {
                        getpostalcode.read((Object) null);
                        throw null;
                    }
                    if (getpostalcode.read((Object) null)) {
                        int i26 = serializer + 73;
                        write = i26 % Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        i12 = Fields.Clip;
                    } else {
                        i11 = serializer + 111;
                        write = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 != 0) {
                            int i28 = 3 % 2;
                        }
                        i12 = 8192;
                    }
                    i9 |= i12;
                }
                i13 = i9;
                i14 = 1;
                if ((i13 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode.write(i13 & 1, z)) {
                    if (i20 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        i15 = 0;
                    } else {
                        i15 = i7;
                    }
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long jOnPictureInPictureUiStateChanged = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).onPictureInPictureUiStateChanged();
                    long customView = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setCustomView();
                    float f = Dimensions.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    long jComponentDialogExternalSyntheticLambda0 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).ComponentDialogExternalSyntheticLambda0();
                    getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnContextAvailableListener);
                    Color colorM712boximpl = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setCustomView());
                    int i29 = i13 << 6;
                    m5043TagTvwr6S8(charSequence, jOnPictureInPictureUiStateChanged, gettopleftannotationsIconCompatParcelizer, modifier3, customView, 1, f, jComponentDialogExternalSyntheticLambda0, null, i15, colorM712boximpl, getpostalcode, (i29 & 458752) | (i13 & 14) | (i29 & 7168) | ((i13 << 12) & 234881024) | ((i13 << 21) & 1879048192), 0, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    i14 = i2;
                    modifier3 = modifier2;
                    i15 = i7;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i15, i14, i3, i4, 2);
                }
            }
            i5 |= 384;
            i7 = i;
            i9 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i9 = i5 | 27648;
            } else if ((i3 & 24576) == 0) {
                i10 = write + 11;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode.read((Object) null);
                    throw null;
                }
                if (getpostalcode.read((Object) null)) {
                    int i210 = serializer + 73;
                    write = i210 % Fields.SpotShadowColor;
                    int i211 = i210 % 2;
                    i12 = Fields.Clip;
                } else {
                    i11 = serializer + 111;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        int i212 = 3 % 2;
                    }
                    i12 = 8192;
                }
                i9 |= i12;
            }
            i13 = i9;
            i14 = 1;
            if ((i13 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i13 & 1, z)) {
                if (i20 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    i15 = 0;
                } else {
                    i15 = i7;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui2 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPictureInPictureUiStateChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).onPictureInPictureUiStateChanged();
                long customView2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setCustomView();
                float f2 = Dimensions.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                long jComponentDialogExternalSyntheticLambda1 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).ComponentDialogExternalSyntheticLambda0();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer2 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnContextAvailableListener);
                Color colorM712boximpl2 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui2)).setCustomView());
                int i213 = i13 << 6;
                m5043TagTvwr6S8(charSequence, jOnPictureInPictureUiStateChanged2, gettopleftannotationsIconCompatParcelizer2, modifier3, customView2, 1, f2, jComponentDialogExternalSyntheticLambda1, null, i15, colorM712boximpl2, getpostalcode, (i213 & 458752) | (i13 & 14) | (i213 & 7168) | ((i13 << 12) & 234881024) | ((i13 << 21) & 1879048192), 0, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i14 = i2;
                modifier3 = modifier2;
                i15 = i7;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i15, i14, i3, i4, 2);
            }
        }
        i5 |= 48;
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                i7 = i;
                if (getpostalcode.read(i7)) {
                    int i214 = write + 67;
                    int i215 = i214 % Fields.SpotShadowColor;
                    serializer = i215;
                    int i216 = i214 % 2;
                    int i217 = i215 + 61;
                    write = i217 % Fields.SpotShadowColor;
                    int i218 = i217 % 2;
                    i8 = Fields.RotationX;
                } else {
                    i8 = Fields.SpotShadowColor;
                }
                i5 |= i8;
            }
            i9 = i5 | 3072;
            if ((i4 & 16) != 0) {
                i9 = i5 | 27648;
            } else if ((i3 & 24576) == 0) {
                i10 = write + 11;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode.read((Object) null);
                    throw null;
                }
                if (getpostalcode.read((Object) null)) {
                    int i219 = serializer + 73;
                    write = i219 % Fields.SpotShadowColor;
                    int i2110 = i219 % 2;
                    i12 = Fields.Clip;
                } else {
                    i11 = serializer + 111;
                    write = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        int i2111 = 3 % 2;
                    }
                    i12 = 8192;
                }
                i9 |= i12;
            }
            i13 = i9;
            i14 = 1;
            if ((i13 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i13 & 1, z)) {
                if (i20 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    i15 = 0;
                } else {
                    i15 = i7;
                }
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui3 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long jOnPictureInPictureUiStateChanged3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).onPictureInPictureUiStateChanged();
                long customView3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).setCustomView();
                float f3 = Dimensions.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                long jComponentDialogExternalSyntheticLambda2 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).ComponentDialogExternalSyntheticLambda0();
                getTopLeftannotations gettopleftannotationsIconCompatParcelizer3 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnContextAvailableListener);
                Color colorM712boximpl3 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui3)).setCustomView());
                int i2112 = i13 << 6;
                m5043TagTvwr6S8(charSequence, jOnPictureInPictureUiStateChanged3, gettopleftannotationsIconCompatParcelizer3, modifier3, customView3, 1, f3, jComponentDialogExternalSyntheticLambda2, null, i15, colorM712boximpl3, getpostalcode, (i2112 & 458752) | (i13 & 14) | (i2112 & 7168) | ((i13 << 12) & 234881024) | ((i13 << 21) & 1879048192), 0, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i14 = i2;
                modifier3 = modifier2;
                i15 = i7;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i15, i14, i3, i4, 2);
            }
        }
        i5 |= 384;
        i7 = i;
        i9 = i5 | 3072;
        if ((i4 & 16) != 0) {
            i9 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            i10 = write + 11;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode.read((Object) null);
                throw null;
            }
            if (getpostalcode.read((Object) null)) {
                int i2113 = serializer + 73;
                write = i2113 % Fields.SpotShadowColor;
                int i2114 = i2113 % 2;
                i12 = Fields.Clip;
            } else {
                i11 = serializer + 111;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i2115 = 3 % 2;
                }
                i12 = 8192;
            }
            i9 |= i12;
        }
        i13 = i9;
        i14 = 1;
        if ((i13 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i13 & 1, z)) {
            if (i20 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                i15 = 0;
            } else {
                i15 = i7;
            }
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui4 = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jOnPictureInPictureUiStateChanged4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).onPictureInPictureUiStateChanged();
            long customView4 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).setCustomView();
            float f4 = Dimensions.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            long jComponentDialogExternalSyntheticLambda3 = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).ComponentDialogExternalSyntheticLambda0();
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer4 = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.addOnContextAvailableListener);
            Color colorM712boximpl4 = Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui4)).setCustomView());
            int i2116 = i13 << 6;
            m5043TagTvwr6S8(charSequence, jOnPictureInPictureUiStateChanged4, gettopleftannotationsIconCompatParcelizer4, modifier3, customView4, 1, f4, jComponentDialogExternalSyntheticLambda3, null, i15, colorM712boximpl4, getpostalcode, (i2116 & 458752) | (i13 & 14) | (i2116 & 7168) | ((i13 << 12) & 234881024) | ((i13 << 21) & 1879048192), 0, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i14 = i2;
            modifier3 = modifier2;
            i15 = i7;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new submit(charSequence, modifier3, i15, i14, i3, i4, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0166  */
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:130:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:138:0x020b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0211  */
    /* JADX WARN: Code duplicated, block: B:144:0x0289  */
    /* JADX WARN: Code duplicated, block: B:147:0x029c  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[PHI: r1
  0x0048: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:78:0x0119  */
    /* JADX WARN: Code duplicated, block: B:80:0x011d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x0129  */
    /* JADX WARN: Code duplicated, block: B:87:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0147  */
    /* JADX WARN: Code duplicated, block: B:95:0x0149  */
    /* JADX WARN: Code duplicated, block: B:98:0x0153  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1
  0x0032: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void read(final CharSequence charSequence, Modifier modifier, int i, int i2, long j, long j2, long j3, Shape shape, getBirthDateFull getbirthdatefull, final int i3, final int i4) {
        getPostalCode getpostalcode;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long jOnMultiWindowModeChanged;
        long subtitle;
        Shape shapeIconCompatParcelizer;
        boolean z;
        final Modifier modifier2;
        final int i13;
        final int i14;
        final Shape shape2;
        final long j4;
        final long j5;
        final long j6;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier3;
        long jOnMultiWindowModeChanged2;
        int i15;
        Shape shape3;
        long j7;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 2 % 2;
        int i22 = write + 11;
        serializer = i22 % Fields.SpotShadowColor;
        if (i22 % 2 == 0) {
            charSequence.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1735890637);
            if ((i3 & 91) == 0) {
                int i23 = serializer + 47;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                if (getpostalcode.IconCompatParcelizer(charSequence)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i6 = i5 | i3;
            } else {
                i6 = i3;
            }
        } else {
            charSequence.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1735890637);
            if ((i3 & 6) == 0) {
                int i25 = serializer + 47;
                write = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                if (getpostalcode.IconCompatParcelizer(charSequence)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i6 = i5 | i3;
            } else {
                i6 = i3;
            }
        }
        int i27 = i4 & 2;
        if (i27 == 0) {
            if ((i3 & 48) == 0) {
                if (!getpostalcode.read(modifier)) {
                    i7 = 16;
                } else {
                    int i28 = write + 39;
                    serializer = i28 % Fields.SpotShadowColor;
                    i7 = i28 % 2 == 0 ? 41 : 32;
                }
                i6 |= i7;
            }
            i8 = i4 & 4;
            if (i8 != 0) {
                if ((i3 & 384) == 0) {
                    i9 = i;
                    if (getpostalcode.read(i9)) {
                        int i29 = write + 75;
                        serializer = i29 % Fields.SpotShadowColor;
                        int i30 = i29 % 2;
                        i10 = Fields.RotationX;
                    } else {
                        i10 = Fields.SpotShadowColor;
                    }
                    i6 |= i10;
                }
                i11 = i6 | 3072;
                if ((i4 & 16) != 0) {
                    i11 = i6 | 27648;
                } else if ((i3 & 24576) == 0) {
                    if (getpostalcode.read((Object) null)) {
                        i12 = Fields.Clip;
                    } else {
                        i12 = 8192;
                    }
                    i11 |= i12;
                }
                if ((196608 & i3) == 0) {
                    if ((i4 & 32) == 0) {
                        jOnMultiWindowModeChanged = j;
                        if (getpostalcode.serializer(jOnMultiWindowModeChanged)) {
                            int i31 = write + 7;
                            serializer = i31 % Fields.SpotShadowColor;
                            int i32 = i31 % 2;
                            i20 = Fields.RenderEffect;
                        }
                        i11 |= i20;
                    } else {
                        jOnMultiWindowModeChanged = j;
                    }
                    i20 = 65536;
                    i11 |= i20;
                } else {
                    jOnMultiWindowModeChanged = j;
                }
                if ((1572864 & i3) == 0) {
                    subtitle = j2;
                    if ((i4 & 64) == 0 || !getpostalcode.serializer(subtitle)) {
                        i19 = Fields.BlendMode;
                    } else {
                        int i33 = serializer + 111;
                        write = i33 % Fields.SpotShadowColor;
                        int i34 = i33 % 2;
                        i19 = 1048576;
                    }
                    i11 |= i19;
                } else {
                    subtitle = j2;
                }
                if ((12582912 & i3) != 0) {
                    if ((i4 & Fields.SpotShadowColor) == 0 || !getpostalcode.serializer(j3)) {
                        i18 = 4194304;
                    } else {
                        i18 = 8388608;
                    }
                    i11 |= i18;
                }
                if ((i3 & 100663296) == 0) {
                    if ((i4 & Fields.RotationX) == 0) {
                        shapeIconCompatParcelizer = shape;
                        int i35 = getpostalcode.read(shapeIconCompatParcelizer) ? 67108864 : 33554432;
                        i11 |= i35;
                    } else {
                        shapeIconCompatParcelizer = shape;
                    }
                    i11 |= i35;
                } else {
                    shapeIconCompatParcelizer = shape;
                }
                if ((38347923 & i11) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode.write(i11 & 1, z)) {
                    getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                    if ((i3 & 1) != 0 || getpostalcode.PlaybackStateCompat()) {
                        if (i27 != 0) {
                            modifier3 = Modifier.Companion;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i8 != 0) {
                            int i36 = write + 65;
                            serializer = i36 % Fields.SpotShadowColor;
                            int i37 = i36 % 2;
                            i9 = 0;
                        }
                        if ((i4 & 32) != 0) {
                            jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                            i11 &= -458753;
                        }
                        if ((i4 & 64) != 0) {
                            subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                            i11 &= -3670017;
                        }
                        if ((i4 & Fields.SpotShadowColor) != 0) {
                            i17 = write + 115;
                            serializer = i17 % Fields.SpotShadowColor;
                            if (i17 % 2 == 0) {
                                ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                            i11 &= -29360129;
                        } else {
                            jOnMultiWindowModeChanged2 = j3;
                        }
                        if ((i4 & Fields.RotationX) != 0) {
                            shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                            i11 &= -234881025;
                        }
                        i15 = i11;
                        shape3 = shapeIconCompatParcelizer;
                        j7 = jOnMultiWindowModeChanged2;
                        i16 = 1;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        if ((i4 & 32) != 0) {
                            int i38 = serializer + 43;
                            write = i38 % Fields.SpotShadowColor;
                            if (i38 % 2 != 0) {
                                i11 &= -458753;
                                int i39 = 73 / 0;
                            } else {
                                i11 &= -458753;
                            }
                        }
                        if ((i4 & 64) != 0) {
                            i11 &= -3670017;
                        }
                        if ((i4 & Fields.SpotShadowColor) != 0) {
                            i11 &= -29360129;
                        }
                        if ((i4 & Fields.RotationX) != 0) {
                            i11 &= -234881025;
                        }
                        modifier3 = modifier;
                        i16 = i2;
                        j7 = j3;
                        i15 = i11;
                        shape3 = shapeIconCompatParcelizer;
                    }
                    long j8 = subtitle;
                    j6 = jOnMultiWindowModeChanged;
                    getpostalcode.RemoteActionCompatParcelizer();
                    int i40 = i15 << 6;
                    m5043TagTvwr6S8(charSequence, j6, shape3, modifier3, j8, i16, Dimensions.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, j7, null, i9, Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle()), getpostalcode, ((i15 >> 18) & 896) | (i15 & 14) | ((i15 >> 12) & 112) | (i40 & 7168) | ((i15 >> 6) & 57344) | (i40 & 458752) | (29360128 & i15) | (234881024 & (i15 << 12)) | ((i15 << 21) & 1879048192), 0, 0);
                    modifier2 = modifier3;
                    i13 = i16;
                    long j9 = j7;
                    shape2 = shape3;
                    i14 = i9;
                    j5 = j8;
                    j4 = j9;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier2 = modifier;
                    i13 = i2;
                    i14 = i9;
                    shape2 = shapeIconCompatParcelizer;
                    j4 = j3;
                    j5 = subtitle;
                    j6 = jOnMultiWindowModeChanged;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SingleThreadCachedScheduler3
                        private static int MediaSessionCompatResultReceiverWrapper = 0;
                        private static int PlaybackStateCompatCustomAction = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj2, Object obj3) {
                            int i41 = 2 % 2;
                            int i42 = MediaSessionCompatResultReceiverWrapper + 109;
                            PlaybackStateCompatCustomAction = i42 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i43 = i42 % 2;
                            ((Integer) obj3).getClass();
                            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                            TagsKt.read(charSequence, modifier2, i14, i13, j6, j5, j4, shape2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer, i4);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i44 = PlaybackStateCompatCustomAction + 85;
                            MediaSessionCompatResultReceiverWrapper = i44 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i44 % 2 == 0) {
                                return createfromparcel;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    };
                }
            }
            i6 |= 384;
            i9 = i;
            i11 = i6 | 3072;
            if ((i4 & 16) != 0) {
                i11 = i6 | 27648;
            } else if ((i3 & 24576) == 0) {
                if (getpostalcode.read((Object) null)) {
                    i12 = Fields.Clip;
                } else {
                    i12 = 8192;
                }
                i11 |= i12;
            }
            if ((196608 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    jOnMultiWindowModeChanged = j;
                    if (getpostalcode.serializer(jOnMultiWindowModeChanged)) {
                        int i310 = write + 7;
                        serializer = i310 % Fields.SpotShadowColor;
                        int i311 = i310 % 2;
                        i20 = Fields.RenderEffect;
                    }
                    i11 |= i20;
                } else {
                    jOnMultiWindowModeChanged = j;
                }
                i20 = 65536;
                i11 |= i20;
            } else {
                jOnMultiWindowModeChanged = j;
            }
            if ((1572864 & i3) == 0) {
                subtitle = j2;
                if ((i4 & 64) == 0) {
                    i19 = Fields.BlendMode;
                } else {
                    i19 = Fields.BlendMode;
                }
                i11 |= i19;
            } else {
                subtitle = j2;
            }
            if ((12582912 & i3) != 0) {
                if ((i4 & Fields.SpotShadowColor) == 0) {
                    i18 = 4194304;
                } else {
                    i18 = 4194304;
                }
                i11 |= i18;
            }
            if ((i3 & 100663296) == 0) {
                if ((i4 & Fields.RotationX) == 0) {
                    shapeIconCompatParcelizer = shape;
                    if (getpostalcode.read(shapeIconCompatParcelizer)) {
                    }
                    i11 |= i35;
                } else {
                    shapeIconCompatParcelizer = shape;
                }
                i11 |= i35;
            } else {
                shapeIconCompatParcelizer = shape;
            }
            if ((38347923 & i11) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i11 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i8 != 0) {
                        int i312 = write + 65;
                        serializer = i312 % Fields.SpotShadowColor;
                        int i313 = i312 % 2;
                        i9 = 0;
                    }
                    if ((i4 & 32) != 0) {
                        jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                        i11 &= -3670017;
                    }
                    if ((i4 & Fields.SpotShadowColor) != 0) {
                        i17 = write + 115;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -29360129;
                    } else {
                        jOnMultiWindowModeChanged2 = j3;
                    }
                    if ((i4 & Fields.RotationX) != 0) {
                        shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                        i11 &= -234881025;
                    }
                    i15 = i11;
                    shape3 = shapeIconCompatParcelizer;
                    j7 = jOnMultiWindowModeChanged2;
                    i16 = 1;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i8 != 0) {
                        int i314 = write + 65;
                        serializer = i314 % Fields.SpotShadowColor;
                        int i315 = i314 % 2;
                        i9 = 0;
                    }
                    if ((i4 & 32) != 0) {
                        jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                        i11 &= -3670017;
                    }
                    if ((i4 & Fields.SpotShadowColor) != 0) {
                        i17 = write + 115;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                        jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -29360129;
                    } else {
                        jOnMultiWindowModeChanged2 = j3;
                    }
                    if ((i4 & Fields.RotationX) != 0) {
                        shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                        i11 &= -234881025;
                    }
                    i15 = i11;
                    shape3 = shapeIconCompatParcelizer;
                    j7 = jOnMultiWindowModeChanged2;
                    i16 = 1;
                }
                long j10 = subtitle;
                j6 = jOnMultiWindowModeChanged;
                getpostalcode.RemoteActionCompatParcelizer();
                int i41 = i15 << 6;
                m5043TagTvwr6S8(charSequence, j6, shape3, modifier3, j10, i16, Dimensions.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, j7, null, i9, Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle()), getpostalcode, ((i15 >> 18) & 896) | (i15 & 14) | ((i15 >> 12) & 112) | (i41 & 7168) | ((i15 >> 6) & 57344) | (i41 & 458752) | (29360128 & i15) | (234881024 & (i15 << 12)) | ((i15 << 21) & 1879048192), 0, 0);
                modifier2 = modifier3;
                i13 = i16;
                long j11 = j7;
                shape2 = shape3;
                i14 = i9;
                j5 = j10;
                j4 = j11;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                i13 = i2;
                i14 = i9;
                shape2 = shapeIconCompatParcelizer;
                j4 = j3;
                j5 = subtitle;
                j6 = jOnMultiWindowModeChanged;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SingleThreadCachedScheduler3
                    private static int MediaSessionCompatResultReceiverWrapper = 0;
                    private static int PlaybackStateCompatCustomAction = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj4, Object obj5) {
                        int i42 = 2 % 2;
                        int i43 = MediaSessionCompatResultReceiverWrapper + 109;
                        PlaybackStateCompatCustomAction = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i44 = i43 % 2;
                        ((Integer) obj5).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                        TagsKt.read(charSequence, modifier2, i14, i13, j6, j5, j4, shape2, (getBirthDateFull) obj4, iRemoteActionCompatParcelizer, i4);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i45 = PlaybackStateCompatCustomAction + 85;
                        MediaSessionCompatResultReceiverWrapper = i45 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i45 % 2 == 0) {
                            return createfromparcel;
                        }
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                };
            }
        }
        int i42 = serializer + 17;
        write = i42 % Fields.SpotShadowColor;
        int i43 = i42 % 2;
        i6 |= 48;
        i8 = i4 & 4;
        if (i8 != 0) {
            if ((i3 & 384) == 0) {
                i9 = i;
                if (getpostalcode.read(i9)) {
                    int i210 = write + 75;
                    serializer = i210 % Fields.SpotShadowColor;
                    int i316 = i210 % 2;
                    i10 = Fields.RotationX;
                } else {
                    i10 = Fields.SpotShadowColor;
                }
                i6 |= i10;
            }
            i11 = i6 | 3072;
            if ((i4 & 16) != 0) {
                i11 = i6 | 27648;
            } else if ((i3 & 24576) == 0) {
                if (getpostalcode.read((Object) null)) {
                    i12 = Fields.Clip;
                } else {
                    i12 = 8192;
                }
                i11 |= i12;
            }
            if ((196608 & i3) == 0) {
                if ((i4 & 32) == 0) {
                    jOnMultiWindowModeChanged = j;
                    if (getpostalcode.serializer(jOnMultiWindowModeChanged)) {
                        int i317 = write + 7;
                        serializer = i317 % Fields.SpotShadowColor;
                        int i318 = i317 % 2;
                        i20 = Fields.RenderEffect;
                    }
                    i11 |= i20;
                } else {
                    jOnMultiWindowModeChanged = j;
                }
                i20 = 65536;
                i11 |= i20;
            } else {
                jOnMultiWindowModeChanged = j;
            }
            if ((1572864 & i3) == 0) {
                subtitle = j2;
                if ((i4 & 64) == 0) {
                    i19 = Fields.BlendMode;
                } else {
                    i19 = Fields.BlendMode;
                }
                i11 |= i19;
            } else {
                subtitle = j2;
            }
            if ((12582912 & i3) != 0) {
                if ((i4 & Fields.SpotShadowColor) == 0) {
                    i18 = 4194304;
                } else {
                    i18 = 4194304;
                }
                i11 |= i18;
            }
            if ((i3 & 100663296) == 0) {
                if ((i4 & Fields.RotationX) == 0) {
                    shapeIconCompatParcelizer = shape;
                    if (getpostalcode.read(shapeIconCompatParcelizer)) {
                    }
                    i11 |= i35;
                } else {
                    shapeIconCompatParcelizer = shape;
                }
                i11 |= i35;
            } else {
                shapeIconCompatParcelizer = shape;
            }
            if ((38347923 & i11) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i11 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i3 & 1) != 0) {
                    if (i27 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i8 != 0) {
                        int i319 = write + 65;
                        serializer = i319 % Fields.SpotShadowColor;
                        int i3110 = i319 % 2;
                        i9 = 0;
                    }
                    if ((i4 & 32) != 0) {
                        jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                        i11 &= -3670017;
                    }
                    if ((i4 & Fields.SpotShadowColor) != 0) {
                        i17 = write + 115;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                        jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -29360129;
                    } else {
                        jOnMultiWindowModeChanged2 = j3;
                    }
                    if ((i4 & Fields.RotationX) != 0) {
                        shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                        i11 &= -234881025;
                    }
                    i15 = i11;
                    shape3 = shapeIconCompatParcelizer;
                    j7 = jOnMultiWindowModeChanged2;
                    i16 = 1;
                } else {
                    if (i27 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i8 != 0) {
                        int i3111 = write + 65;
                        serializer = i3111 % Fields.SpotShadowColor;
                        int i3112 = i3111 % 2;
                        i9 = 0;
                    }
                    if ((i4 & 32) != 0) {
                        jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -458753;
                    }
                    if ((i4 & 64) != 0) {
                        subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                        i11 &= -3670017;
                    }
                    if ((i4 & Fields.SpotShadowColor) != 0) {
                        i17 = write + 115;
                        serializer = i17 % Fields.SpotShadowColor;
                        if (i17 % 2 == 0) {
                            ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                        jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        i11 &= -29360129;
                    } else {
                        jOnMultiWindowModeChanged2 = j3;
                    }
                    if ((i4 & Fields.RotationX) != 0) {
                        shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                        i11 &= -234881025;
                    }
                    i15 = i11;
                    shape3 = shapeIconCompatParcelizer;
                    j7 = jOnMultiWindowModeChanged2;
                    i16 = 1;
                }
                long j12 = subtitle;
                j6 = jOnMultiWindowModeChanged;
                getpostalcode.RemoteActionCompatParcelizer();
                int i44 = i15 << 6;
                m5043TagTvwr6S8(charSequence, j6, shape3, modifier3, j12, i16, Dimensions.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, j7, null, i9, Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle()), getpostalcode, ((i15 >> 18) & 896) | (i15 & 14) | ((i15 >> 12) & 112) | (i44 & 7168) | ((i15 >> 6) & 57344) | (i44 & 458752) | (29360128 & i15) | (234881024 & (i15 << 12)) | ((i15 << 21) & 1879048192), 0, 0);
                modifier2 = modifier3;
                i13 = i16;
                long j13 = j7;
                shape2 = shape3;
                i14 = i9;
                j5 = j12;
                j4 = j13;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                i13 = i2;
                i14 = i9;
                shape2 = shapeIconCompatParcelizer;
                j4 = j3;
                j5 = subtitle;
                j6 = jOnMultiWindowModeChanged;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SingleThreadCachedScheduler3
                    private static int MediaSessionCompatResultReceiverWrapper = 0;
                    private static int PlaybackStateCompatCustomAction = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj6, Object obj7) {
                        int i45 = 2 % 2;
                        int i46 = MediaSessionCompatResultReceiverWrapper + 109;
                        PlaybackStateCompatCustomAction = i46 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i47 = i46 % 2;
                        ((Integer) obj7).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                        TagsKt.read(charSequence, modifier2, i14, i13, j6, j5, j4, shape2, (getBirthDateFull) obj6, iRemoteActionCompatParcelizer, i4);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i48 = PlaybackStateCompatCustomAction + 85;
                        MediaSessionCompatResultReceiverWrapper = i48 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i48 % 2 == 0) {
                            return createfromparcel;
                        }
                        Object obj8 = null;
                        obj8.hashCode();
                        throw null;
                    }
                };
            }
        }
        i6 |= 384;
        i9 = i;
        i11 = i6 | 3072;
        if ((i4 & 16) != 0) {
            i11 = i6 | 27648;
        } else if ((i3 & 24576) == 0) {
            if (getpostalcode.read((Object) null)) {
                i12 = Fields.Clip;
            } else {
                i12 = 8192;
            }
            i11 |= i12;
        }
        if ((196608 & i3) == 0) {
            if ((i4 & 32) == 0) {
                jOnMultiWindowModeChanged = j;
                if (getpostalcode.serializer(jOnMultiWindowModeChanged)) {
                    int i3113 = write + 7;
                    serializer = i3113 % Fields.SpotShadowColor;
                    int i3114 = i3113 % 2;
                    i20 = Fields.RenderEffect;
                }
                i11 |= i20;
            } else {
                jOnMultiWindowModeChanged = j;
            }
            i20 = 65536;
            i11 |= i20;
        } else {
            jOnMultiWindowModeChanged = j;
        }
        if ((1572864 & i3) == 0) {
            subtitle = j2;
            if ((i4 & 64) == 0) {
                i19 = Fields.BlendMode;
            } else {
                i19 = Fields.BlendMode;
            }
            i11 |= i19;
        } else {
            subtitle = j2;
        }
        if ((12582912 & i3) != 0) {
            if ((i4 & Fields.SpotShadowColor) == 0) {
                i18 = 4194304;
            } else {
                i18 = 4194304;
            }
            i11 |= i18;
        }
        if ((i3 & 100663296) == 0) {
            if ((i4 & Fields.RotationX) == 0) {
                shapeIconCompatParcelizer = shape;
                if (getpostalcode.read(shapeIconCompatParcelizer)) {
                }
                i11 |= i35;
            } else {
                shapeIconCompatParcelizer = shape;
            }
            i11 |= i35;
        } else {
            shapeIconCompatParcelizer = shape;
        }
        if ((38347923 & i11) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i3 & 1) != 0) {
                if (i27 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                if (i8 != 0) {
                    int i3115 = write + 65;
                    serializer = i3115 % Fields.SpotShadowColor;
                    int i3116 = i3115 % 2;
                    i9 = 0;
                }
                if ((i4 & 32) != 0) {
                    jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    i11 &= -458753;
                }
                if ((i4 & 64) != 0) {
                    subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                    i11 &= -3670017;
                }
                if ((i4 & Fields.SpotShadowColor) != 0) {
                    i17 = write + 115;
                    serializer = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                    jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    i11 &= -29360129;
                } else {
                    jOnMultiWindowModeChanged2 = j3;
                }
                if ((i4 & Fields.RotationX) != 0) {
                    shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                    i11 &= -234881025;
                }
                i15 = i11;
                shape3 = shapeIconCompatParcelizer;
                j7 = jOnMultiWindowModeChanged2;
                i16 = 1;
            } else {
                if (i27 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                if (i8 != 0) {
                    int i3117 = write + 65;
                    serializer = i3117 % Fields.SpotShadowColor;
                    int i3118 = i3117 % 2;
                    i9 = 0;
                }
                if ((i4 & 32) != 0) {
                    jOnMultiWindowModeChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    i11 &= -458753;
                }
                if ((i4 & 64) != 0) {
                    subtitle = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                    i11 &= -3670017;
                }
                if ((i4 & Fields.SpotShadowColor) != 0) {
                    i17 = write + 115;
                    serializer = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 == 0) {
                        ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                        Object obj7 = null;
                        obj7.hashCode();
                        throw null;
                    }
                    jOnMultiWindowModeChanged2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    i11 &= -29360129;
                } else {
                    jOnMultiWindowModeChanged2 = j3;
                }
                if ((i4 & Fields.RotationX) != 0) {
                    shapeIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.onBackPressedDispatcher_delegatelambda010);
                    i11 &= -234881025;
                }
                i15 = i11;
                shape3 = shapeIconCompatParcelizer;
                j7 = jOnMultiWindowModeChanged2;
                i16 = 1;
            }
            long j14 = subtitle;
            j6 = jOnMultiWindowModeChanged;
            getpostalcode.RemoteActionCompatParcelizer();
            int i45 = i15 << 6;
            m5043TagTvwr6S8(charSequence, j6, shape3, modifier3, j14, i16, Dimensions.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, j7, null, i9, Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle()), getpostalcode, ((i15 >> 18) & 896) | (i15 & 14) | ((i15 >> 12) & 112) | (i45 & 7168) | ((i15 >> 6) & 57344) | (i45 & 458752) | (29360128 & i15) | (234881024 & (i15 << 12)) | ((i15 << 21) & 1879048192), 0, 0);
            modifier2 = modifier3;
            i13 = i16;
            long j15 = j7;
            shape2 = shape3;
            i14 = i9;
            j5 = j14;
            j4 = j15;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            i13 = i2;
            i14 = i9;
            shape2 = shapeIconCompatParcelizer;
            j4 = j3;
            j5 = subtitle;
            j6 = jOnMultiWindowModeChanged;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SingleThreadCachedScheduler3
                private static int MediaSessionCompatResultReceiverWrapper = 0;
                private static int PlaybackStateCompatCustomAction = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj8, Object obj9) {
                    int i46 = 2 % 2;
                    int i47 = MediaSessionCompatResultReceiverWrapper + 109;
                    PlaybackStateCompatCustomAction = i47 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i48 = i47 % 2;
                    ((Integer) obj9).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                    TagsKt.read(charSequence, modifier2, i14, i13, j6, j5, j4, shape2, (getBirthDateFull) obj8, iRemoteActionCompatParcelizer, i4);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i49 = PlaybackStateCompatCustomAction + 85;
                    MediaSessionCompatResultReceiverWrapper = i49 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i49 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj10 = null;
                    obj10.hashCode();
                    throw null;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0196  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:117:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:120:0x0203  */
    /* JADX WARN: Code duplicated, block: B:123:0x0216  */
    /* JADX WARN: Code duplicated, block: B:124:0x0232  */
    /* JADX WARN: Code duplicated, block: B:127:0x0247  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x0304  */
    /* JADX INFO: renamed from: Tag-Tvwr6S8, reason: not valid java name */
    public static final void m5043TagTvwr6S8(final CharSequence charSequence, final long j, final Shape shape, final Modifier modifier, final long j2, final int i, final float f, long j3, final SwitchKt switchKt, final int i2, final Color color, getBirthDateFull getbirthdatefull, final int i3, final int i4, final int i5) {
        int i6;
        SwitchKt switchKt2;
        int i7;
        final long jM757getTransparent0d7_KjU;
        SwitchKt switchDefaults;
        Alignment.Companion companion;
        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        int i13 = write + 71;
        serializer = i13 % Fields.SpotShadowColor;
        int i14 = i13 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(814581160);
        if ((i3 & 6) == 0) {
            int i15 = serializer + 55;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i6 = (getpostalcode.IconCompatParcelizer(charSequence) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            if (getpostalcode.serializer(j)) {
                int i17 = serializer + 77;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i11 = 32;
            } else {
                i11 = 16;
            }
            i6 |= i11;
        }
        if ((i3 & 384) == 0) {
            if (!(!getpostalcode.read(shape))) {
                int i19 = serializer + 101;
                write = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                i10 = Fields.RotationX;
            } else {
                i10 = Fields.SpotShadowColor;
            }
            i6 |= i10;
        }
        if ((i3 & 3072) == 0) {
            i6 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i3 & 24576) == 0) {
            i6 |= getpostalcode.serializer(j2) ? Fields.Clip : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 |= getpostalcode.read(i) ? Fields.RenderEffect : 65536;
        }
        if ((i3 & 1572864) == 0) {
            int i21 = serializer + 19;
            write = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                getpostalcode.serializer(f);
                throw null;
            }
            i6 |= getpostalcode.serializer(f) ? 1048576 : Fields.BlendMode;
        }
        int i22 = i5 & Fields.SpotShadowColor;
        if (i22 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            i6 |= getpostalcode.serializer(j3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            switchKt2 = switchKt;
            i6 |= getpostalcode.read(switchKt2) ? 67108864 : 33554432;
        } else {
            switchKt2 = switchKt;
        }
        if ((805306368 & i3) == 0) {
            int i23 = serializer + 113;
            write = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            if (getpostalcode.read(i2)) {
                i9 = 536870912;
            } else {
                int i25 = write + 113;
                serializer = i25 % Fields.SpotShadowColor;
                int i26 = i25 % 2;
                i9 = 268435456;
            }
            i6 |= i9;
        }
        if ((i4 & 6) == 0) {
            if (getpostalcode.read(color)) {
                int i27 = serializer + 71;
                write = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                i8 = 4;
            } else {
                i8 = 2;
            }
            i7 = i4 | i8;
        } else {
            i7 = i4;
        }
        if (getpostalcode.write(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i3 & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                if (i22 != 0) {
                    int i29 = serializer + 57;
                    write = i29 % Fields.SpotShadowColor;
                    int i30 = i29 % 2;
                    jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
                }
                getpostalcode.RemoteActionCompatParcelizer();
                if (switchKt2 == null) {
                    switchDefaults = switchKt;
                } else if (i2 == 0) {
                    switchDefaults = new SwitchDefaults(Dimensions.setSupportProgressBarVisibility, Dimensions.setSupportActionBar, Dimensions.setSupportProgressBarIndeterminateVisibility, Dimensions.setSupportProgressBarIndeterminate);
                } else {
                    switchDefaults = new SwitchDefaults(Dimensions.setSupportProgress, Dimensions.startSupportActionMode, Dimensions.supportInvalidateOptionsMenu, Dimensions.setSupportProgressBarIndeterminate);
                }
                Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(BorderKt.write(modifier, f, jM757getTransparent0d7_KjU, shape), shape), j, RectangleShapeKt.getRectangleShape()), switchDefaults);
                Arrangement$Center$1 arrangement$Center$1 = Arrangement.IconCompatParcelizer;
                companion = Alignment.Companion;
                supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, companion.getCenterVertically(), getpostalcode, 54);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    int i31 = serializer + 87;
                    write = i31 % Fields.SpotShadowColor;
                    int i32 = i31 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (i2 != 0) {
                    getpostalcode.serializer(950395024);
                    m5044TagImageZLcQsz0(i2, color, getpostalcode, ((i7 << 3) & 112) | ((i6 >> 27) & 14));
                    RemoteActionCompatParcelizer(getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(950523798);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (charSequence instanceof AnnotatedString) {
                    getpostalcode.serializer(950585333);
                    TextKt.m132TextZ58ophY((AnnotatedString) charSequence, Modifier.Companion.then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion.getCenterVertically())), j2, 0L, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, i, 0, null, null, (TextStyle) performLayout.onBackPressedInput_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 & 14) | ((i6 >> 6) & 896), ((i6 >> 3) & 57344) | 384, 241656);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(950902091);
                    charSequence.getClass();
                    TextKt.m131TextNvy7gAk((String) charSequence, Modifier.Companion.then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion.getCenterVertically())), j2, 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, i, 0, null, (TextStyle) performLayout.onBackPressedInput_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 & 14) | ((i6 >> 6) & 896), ((i6 >> 3) & 57344) | 384, 110584);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            jM757getTransparent0d7_KjU = j3;
            getpostalcode.RemoteActionCompatParcelizer();
            if (switchKt2 == null) {
                switchDefaults = switchKt;
            } else if (i2 == 0) {
                switchDefaults = new SwitchDefaults(Dimensions.setSupportProgressBarVisibility, Dimensions.setSupportActionBar, Dimensions.setSupportProgressBarIndeterminateVisibility, Dimensions.setSupportProgressBarIndeterminate);
            } else {
                switchDefaults = new SwitchDefaults(Dimensions.setSupportProgress, Dimensions.startSupportActionMode, Dimensions.supportInvalidateOptionsMenu, Dimensions.setSupportProgressBarIndeterminate);
            }
            Modifier modifierIconCompatParcelizer2 = PaddingKt.IconCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(BorderKt.write(modifier, f, jM757getTransparent0d7_KjU, shape), shape), j, RectangleShapeKt.getRectangleShape()), switchDefaults);
            Arrangement$Center$1 arrangement$Center$2 = Arrangement.IconCompatParcelizer;
            companion = Alignment.Companion;
            supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$2, companion.getCenterVertically(), getpostalcode, 54);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                int i33 = serializer + 87;
                write = i33 % Fields.SpotShadowColor;
                int i34 = i33 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (i2 != 0) {
                getpostalcode.serializer(950395024);
                m5044TagImageZLcQsz0(i2, color, getpostalcode, ((i7 << 3) & 112) | ((i6 >> 27) & 14));
                RemoteActionCompatParcelizer(getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(950523798);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (charSequence instanceof AnnotatedString) {
                getpostalcode.serializer(950585333);
                TextKt.m132TextZ58ophY((AnnotatedString) charSequence, Modifier.Companion.then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion.getCenterVertically())), j2, 0L, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, i, 0, null, null, (TextStyle) performLayout.onBackPressedInput_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 & 14) | ((i6 >> 6) & 896), ((i6 >> 3) & 57344) | 384, 241656);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(950902091);
                charSequence.getClass();
                TextKt.m131TextNvy7gAk((String) charSequence, Modifier.Companion.then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion.getCenterVertically())), j2, 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, i, 0, null, (TextStyle) performLayout.onBackPressedInput_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode, (i6 & 14) | ((i6 >> 6) & 896), ((i6 >> 3) & 57344) | 384, 110584);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            jM757getTransparent0d7_KjU = j3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.SingleThreadFutureScheduler1
                private static int PlaybackStateCompat = 0;
                private static int ResultReceiver = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i35 = 2 % 2;
                    int i36 = PlaybackStateCompat + 23;
                    ResultReceiver = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i37 = i36 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i4);
                    TagsKt.m5043TagTvwr6S8(charSequence, j, shape, modifier, j2, i, f, jM757getTransparent0d7_KjU, switchKt, i2, color, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, i5);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i38 = PlaybackStateCompat + 97;
                    ResultReceiver = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i38 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
    }

    public static final void read(CharSequence charSequence, Modifier modifier, int i, int i2, getBirthDateFull getbirthdatefull, int i3, int i4) {
        Object[] objArr = {charSequence, modifier, Integer.valueOf(i), Integer.valueOf(i2), getbirthdatefull, Integer.valueOf(i3), Integer.valueOf(i4)};
        int iIconCompatParcelizer = onMessageReceived.IconCompatParcelizer();
        int iIconCompatParcelizer2 = onMessageReceived.IconCompatParcelizer();
        serializer(2032277805, iIconCompatParcelizer, onMessageReceived.IconCompatParcelizer(), -2032277804, objArr, onMessageReceived.IconCompatParcelizer(), iIconCompatParcelizer2);
    }

    public static final void IconCompatParcelizer(CharSequence charSequence, Modifier modifier, int i, int i2, getBirthDateFull getbirthdatefull, int i3, int i4) {
        Object[] objArr = {charSequence, modifier, Integer.valueOf(i), Integer.valueOf(i2), getbirthdatefull, Integer.valueOf(i3), Integer.valueOf(i4)};
        int iIconCompatParcelizer = onMessageReceived.IconCompatParcelizer();
        int iIconCompatParcelizer2 = onMessageReceived.IconCompatParcelizer();
        serializer(-1744438842, iIconCompatParcelizer, onMessageReceived.IconCompatParcelizer(), 1744438842, objArr, onMessageReceived.IconCompatParcelizer(), iIconCompatParcelizer2);
    }
}
