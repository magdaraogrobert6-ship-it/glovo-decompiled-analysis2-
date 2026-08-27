package com.roadrunner.delivery.accept.laststop.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.accept.laststop.presentation.LastStopOptionUiModelImpl;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.canReadPlayIds;
import o.dc;
import o.drawText;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getClipBounds;
import o.getCreditCardExpirationMonth;
import o.getDrawFilter;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.get_nativeCanvasui_text;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.sendActivityPackage;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LastStopOptionKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void LastStopOption(LastStopOptionUiModelImpl lastStopOptionUiModelImpl, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 95;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        lastStopOptionUiModelImpl.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(787877107);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 69;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(lastStopOptionUiModelImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i8 = serializer + 93;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(lastStopOptionUiModelImpl.PlaybackStateCompat, getpostalcode, 0);
            getClipBounds getclipbounds = (getClipBounds) populateViewStructure_androidKtpopulate7Write.getValue();
            if (getclipbounds instanceof get_nativeCanvasui_text) {
                getpostalcode.serializer(1235662295);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(getclipbounds instanceof drawText)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1235660297, false);
                }
                getpostalcode.serializer(-349117477);
                getClipBounds getclipbounds2 = (getClipBounds) populateViewStructure_androidKtpopulate7Write.getValue();
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(lastStopOptionUiModelImpl);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new MapboxNavigation.AnonymousClass15(0, lastStopOptionUiModelImpl, LastStopOptionUiModelImpl.class, "onOptionClick", "onOptionClick()V", 0, 27);
                    getpostalcode.write(objComponentActivity);
                }
                LastStopOptionContent(getclipbounds2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(lastStopOptionUiModelImpl, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    public static final void LastStopOptionWithDescription(String str, boolean z, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        long overflowReserved;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-196597467);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i5 = serializer + 111;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 123;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.write(z) ^ true ? 16 : 32;
            int i8 = IconCompatParcelizer + 75;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 2 / 2;
            }
        }
        int i10 = i2 | 384;
        if (!(!getpostalcode.write(i10 & 1, (i10 & 147) != 146))) {
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                getpostalcode.serializer(48401582);
                overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
            } else {
                getpostalcode.serializer(48402286);
                overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved();
            }
            getpostalcode.IconCompatParcelizer(false);
            TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 0.9f), 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13), overflowReserved, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.ParcelableVolumeInfo(), getpostalcode, i10 & 14, 0, 131064);
            int i11 = IconCompatParcelizer + 31;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new sendActivityPackage(str, z, modifier2, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[PHI: r3
  0x0040: PHI (r3v14 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v16 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v16 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void LastStopOptionWithLocation(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        getPostalCode getpostalcode2;
        Modifier modifier2;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 65;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-683475890);
            if ((i & 28) == 0) {
                if (getpostalcode.read(str)) {
                    int i7 = serializer + 103;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-683475890);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    int i9 = serializer + 103;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        int i11 = i3 | 48;
        if (getpostalcode3.write(i11 & 1, (i11 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier modifierWrite = SizeKt.write(companion, 0.9f);
            float f = Dimensions.setPrimaryBackground;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f, 0.0f, 0.0f, 13);
            modifierM74paddingqDBjuR0$default.getClass();
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, getpostalcode3, 48);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                    int i12 = serializer + 123;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_map_marker_outline, getpostalcode3, 0);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, (Modifier) null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode3, Painter.$stable | 48, 4);
                TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(companion, f, 0.0f, 0.0f, 0.0f, 14), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.ParcelableVolumeInfo(), getpostalcode3, i11 & 14, 0, 131064);
                getpostalcode2 = getpostalcode3;
                i4 = 1;
                getpostalcode2.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            i4 = 1;
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LastStopOptionContent(getClipBounds getclipbounds, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        long overflowReserved;
        long overflowReserved2;
        Modifier modifier3;
        String str;
        String str2;
        int i3;
        int i4 = 2 % 2;
        getclipbounds.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1903082673);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.read(getclipbounds)) {
                int i5 = serializer + 27;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if (getpostalcode.write(i7 & 1, (i7 & 147) != 146)) {
            int i8 = serializer + 19;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            Modifier.Companion companion = Modifier.Companion;
            drawText drawtext = (drawText) getclipbounds;
            boolean z = drawtext.read;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion, 1.0f), 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13);
            boolean z2 = drawtext.read;
            boolean z3 = (i7 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b1$$ExternalSyntheticLambda0(4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifier4 = canReadPlayIds.read(modifierM74paddingqDBjuR0$default, null, z2, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 61);
            modifier4.getClass();
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = serializer + 115;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode, 54);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str3 = drawtext.serializer;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            if (z) {
                getpostalcode.serializer(275298005);
                overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            } else {
                getpostalcode.serializer(275298740);
                overflowReserved = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved();
            }
            getpostalcode.IconCompatParcelizer(false);
            TextKt.m131TextNvy7gAk(str3, null, overflowReserved, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_arrow_right, getpostalcode, 0);
            if (z) {
                getpostalcode.serializer(275304982);
                overflowReserved2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled();
            } else {
                getpostalcode.serializer(275305748);
                overflowReserved2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved();
            }
            long j = overflowReserved2;
            getpostalcode.IconCompatParcelizer(false);
            int i12 = IconCompatParcelizer + 63;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m75height3ABfNKs(companion, Dimensions.setContentHeight), j, getpostalcode, Painter.$stable | 48, 0);
            getpostalcode.IconCompatParcelizer(true);
            String str4 = drawtext.RemoteActionCompatParcelizer;
            if (str4 == null) {
                getpostalcode.serializer(-1152227485);
                getpostalcode.IconCompatParcelizer(false);
                modifier3 = null;
            } else {
                getpostalcode.serializer(-1152227484);
                modifier3 = null;
                LastStopOptionWithDescription(str4, z, null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            getDrawFilter getdrawfilter = drawtext.write;
            if (getdrawfilter != null) {
                str2 = getdrawfilter.IconCompatParcelizer;
            } else {
                str = modifier3;
            }
            if (str == 0) {
                str = str2;
                int i14 = IconCompatParcelizer + 47;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.serializer(-1152005339);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                str = str2;
                getpostalcode.serializer(-1152005338);
                LastStopOptionWithLocation(0, getpostalcode, modifier3, str);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i16 = IconCompatParcelizer + 21;
            int i17 = i16 % Fields.SpotShadowColor;
            serializer = i17;
            int i18 = i16 % 2;
            int i19 = i17 + 53;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 24, modifier2, (Object) getclipbounds, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
