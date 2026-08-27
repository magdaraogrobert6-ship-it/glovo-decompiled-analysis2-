package com.roadrunner.startworking.equipment;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Collections;
import java.util.Map;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.lambda320;
import o.lambda321;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SelectedEquipmentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[PHI: r0
  0x0039: PHI (r0v12 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v14 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r0
  0x002e: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v14 o.getPostalCode) binds: [B:8:0x002c, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void TextWithMiddleIcon(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        Modifier modifier2;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 79;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(242999990);
            if ((i & 11) == 0) {
                if (getpostalcode.read(str)) {
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
            getpostalcode.MediaSessionCompatQueueItem(242999990);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i7 = serializer;
                int i8 = i7 + 105;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 == 0 ? 98 : 32;
                int i9 = i7 + 31;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            int i11 = serializer + 105;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                i3 |= getpostalcode.read(R.drawable.ic_bold_small_essentials_dot) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode.read(R.drawable.ic_bold_small_essentials_dot);
                throw null;
            }
        }
        int i12 = i3 | 3072;
        if (getpostalcode.write(i12 & 1, (i12 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str + " ");
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "separatorIcon", "�");
            builder.append(" " + str2);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), ExtrasKt.write(352858982, new lambda320(0), getpostalcode));
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            Map mapSingletonMap = Collections.singletonMap("separatorIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            TextKt.m132TextZ58ophY(annotatedString, companion, presenter, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleIconCompatParcelizer, getpostalcode, (i12 >> 6) & 112, 0, 196600);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new lambda321(str, str2, modifier2, i, 0);
        }
        int i13 = RemoteActionCompatParcelizer + 3;
        serializer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            throw 0;
        }
    }

    public static final void SelectedEquipment(String str, String str2, String str3, String str4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = serializer + 85;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-853333963);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = (!(getpostalcode.read(str) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = RemoteActionCompatParcelizer + 97;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= !getpostalcode.read(str3) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            int i8 = RemoteActionCompatParcelizer + 41;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= !(getpostalcode.read(str4) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        int i10 = i2;
        if ((i10 & 74899) != 74898) {
            int i11 = serializer + 91;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i10 & 1, z)) {
            int i13 = serializer + 93;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setTitle));
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = RemoteActionCompatParcelizer + 111;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = serializer + 87;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            float f = Dimensions.setTabContainer;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion3, f, 0.0f, 2);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getTop(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, i10 & 14, 0, 131064);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion3.then(new show(1.0f, true))});
            TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode, ((i10 >> 3) & 14) | ((i10 >> 9) & 112), 248);
            getpostalcode.IconCompatParcelizer(true);
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3, f, 0.0f, f, f, 2);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
                int i18 = RemoteActionCompatParcelizer + 67;
                serializer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    int i19 = 5 % 5;
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            TextWithMiddleIcon((i10 >> 6) & 126, getpostalcode, null, str3, str4);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY((Object) str, (Object) str2, (Object) str3, (Object) str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 29);
        }
    }
}
