package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.api.mapper.ButtonTypeTokenMapperKt;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.compose.QrCodeScanKt;
import com.roadrunner.delivery.state.pudo.ButtonTypeToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ComposeAnimationState;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.IntOffsetCompanion;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PreviewContainer;
import o.buildMapping;
import o.copyiSbpLlY;
import o.getBirthDateFull;
import o.getFontScaleannotations;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getPostalCode;
import o.getZeroMYxV2XQ;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class QrCodeScanKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:50:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void serializer(final IntOffsetCompanion intOffsetCompanion, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        int i3;
        int i4 = 2 % 2;
        intOffsetCompanion.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-50736889);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = (getpostalcode.read(intOffsetCompanion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i7 = i2 | 3072;
        if ((i7 & 1171) != 1170) {
            int i8 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            final Modifier.Companion companion = Modifier.Companion;
            getFontScaleannotations getfontscaleannotations = (getFontScaleannotations) ExtrasKt.write(intOffsetCompanion.write, getpostalcode, 0).getValue();
            if (!(getfontscaleannotations instanceof copyiSbpLlY)) {
                if (!(getfontscaleannotations instanceof getZeroMYxV2XQ)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1513502312, false);
                }
                getpostalcode.serializer(326411477);
                getpostalcode.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i10 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.unaryMinusnOccac
                        private static int MediaMetadataCompat = 1;
                        private static int MediaSessionCompatQueueItem;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = 2 % 2;
                            int i12 = MediaMetadataCompat + 5;
                            MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            int i14 = i10;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i15 = i;
                            if (i14 == 0) {
                                ((Integer) obj2).getClass();
                                QrCodeScanKt.serializer(intOffsetCompanion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                                return createfromparcel;
                            }
                            ((Integer) obj2).getClass();
                            QrCodeScanKt.serializer(intOffsetCompanion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i15 | 1));
                            int i16 = MediaSessionCompatQueueItem + 43;
                            MediaMetadataCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i16 % 2 != 0) {
                                return createfromparcel;
                            }
                            throw null;
                        }
                    };
                    int i11 = RemoteActionCompatParcelizer + 113;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    return;
                }
                i3 = RemoteActionCompatParcelizer + 71;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i13 = 79 / 0;
                }
            }
            int i14 = RemoteActionCompatParcelizer + 49;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode.serializer(-1513499711);
            QrCodeScanComposable(((copyiSbpLlY) getfontscaleannotations).RemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion, getpostalcode, (i7 & 112) | 8 | (i7 & 896) | (i7 & 7168));
            getpostalcode.IconCompatParcelizer(false);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i16 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.unaryMinusnOccac
                private static int MediaMetadataCompat = 1;
                private static int MediaSessionCompatQueueItem;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = 2 % 2;
                    int i18 = MediaMetadataCompat + 5;
                    MediaSessionCompatQueueItem = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    int i110 = i16;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i111 = i;
                    if (i110 == 0) {
                        ((Integer) obj2).getClass();
                        QrCodeScanKt.serializer(intOffsetCompanion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i111 | 1));
                        return createfromparcel;
                    }
                    ((Integer) obj2).getClass();
                    QrCodeScanKt.serializer(intOffsetCompanion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i111 | 1));
                    int i112 = MediaSessionCompatQueueItem + 43;
                    MediaMetadataCompat = i112 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i112 % 2 != 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            return;
        }
        i3 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i17 = 79 / 0;
        }
    }

    public static final void QrCodeScanComposable(PreviewContainer previewContainer, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1988463684);
        if ((i & 6) == 0) {
            int i8 = IconCompatParcelizer + 7;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if ((i8 % 2 != 0 ? (i & 8) != 0 : (i & 60) != 0) ? getpostalcode.IconCompatParcelizer(previewContainer) : getpostalcode.read(previewContainer)) {
                int i9 = IconCompatParcelizer + 59;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i13 = RemoteActionCompatParcelizer + 51;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i15 = IconCompatParcelizer + 43;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            i2 |= !(getpostalcode.read(modifier) ^ true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            int i16 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            modifierWrite.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i20 = IconCompatParcelizer + 123;
                RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = previewContainer.title;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
            Modifier.Companion companion2 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getActionBarHideOffset)});
            String str2 = previewContainer.description;
            if (str2 == null) {
                getpostalcode.serializer(-1190075728);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1190075727);
                TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (previewContainer.isSuccess) {
                getpostalcode.serializer(-1188877484);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1189855782);
                float f = Dimensions.setMenu;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f)});
                getpostalcode.serializer(654357023);
                ComposeAnimationState composeAnimationState = previewContainer.scanQrCodeButton;
                ButtonTypeToken buttonTypeToken = composeAnimationState.type;
                String str3 = composeAnimationState.actionTitle;
                Integer num = composeAnimationState.actionIcon;
                Modifier modifierWrite2 = SizeKt.write(companion2, 1.0f);
                modifierWrite2.getClass();
                ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierWrite2, false, false, num, getpostalcode, ((i2 << 3) & 896) | 3072, 176);
                getpostalcode.IconCompatParcelizer(false);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, f)});
                ComposeAnimationState composeAnimationState2 = previewContainer.enterPinButton;
                ButtonTypeToken buttonTypeToken2 = composeAnimationState2.type;
                String str4 = composeAnimationState2.actionTitle;
                Integer num2 = composeAnimationState2.actionIcon;
                Modifier modifierWrite3 = SizeKt.write(companion2, 1.0f);
                modifierWrite3.getClass();
                ButtonTypeTokenMapperKt.IconCompatParcelizer(buttonTypeToken2, str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierWrite3, false, false, num2, getpostalcode, (i2 & 896) | 3072, 176);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) previewContainer, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 28);
        }
    }
}
