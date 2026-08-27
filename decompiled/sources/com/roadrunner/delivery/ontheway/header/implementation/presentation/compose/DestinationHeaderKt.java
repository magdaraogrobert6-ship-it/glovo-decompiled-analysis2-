package com.roadrunner.delivery.ontheway.header.implementation.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.ontheway.header.api.DestinationHeaderUiModel;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.DestinationHeaderUiModelImpl;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderButtonsKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.ActualParagraph4FmOz70;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidStringDelegate;
import o.AndroidTextPaint;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.Nonelambda0;
import o.TextAlignSaverlambda0;
import o.TextFieldDefaults;
import o.UiMediaScopeImpl;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getPreviouseUduSuoannotations;
import o.getQueryContext;
import o.getShadowui_text;
import o.getStore;
import o.getWaitingTime;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaMcHG3qYj2V0v5xX04YffgaUC3R8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DestinationHeaderKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public static final void serializer(long j, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 43;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1902105393);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.serializer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i6 = serializer + 27;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes), j, RoundedCornerShapeKt.IconCompatParcelizer), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getWaitingTime(j, i);
        }
        int i7 = serializer + 93;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void serializer(AndroidStringDelegate androidStringDelegate, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2084148269);
        if ((i & 6) == 0) {
            int i5 = serializer + 77;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? (i & 8) == 0 : (i & 58) == 0) {
                zIconCompatParcelizer = getpostalcode.read(androidStringDelegate);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(androidStringDelegate);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
            int i6 = serializer + 63;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i8 = serializer + 109;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = Fields.SpotShadowColor;
            } else {
                int i10 = IconCompatParcelizer + 103;
                serializer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 27107 : Fields.RotationX;
            }
            i2 |= i3;
            int i11 = IconCompatParcelizer + 59;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i2 & 147) != 146) {
            int i13 = serializer + 63;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            SurfaceKt.m126SurfaceT9BRK9s(PaddingKt.read(modifierWrite, f, Dimensions.getNestedScrollAxes, f, f), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-620634344, new GapComposerKt$$ExternalSyntheticLambda0(androidStringDelegate, 27, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), getpostalcode, 12582912, 122);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 9, modifier, (Object) androidStringDelegate, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static final void DestinationArrivalContainer(AndroidStringDelegate androidStringDelegate, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        getPostalCode getpostalcode;
        Modifier modifier2;
        getPostalCode getpostalcode2;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 19;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(875194772);
        if ((i & 6) == 0) {
            int i8 = IconCompatParcelizer + 125;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? (i & 8) == 0 : (i & 103) == 0) {
                zIconCompatParcelizer = getpostalcode3.read(androidStringDelegate);
            } else {
                zIconCompatParcelizer = getpostalcode3.IconCompatParcelizer(androidStringDelegate);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode3.write(i9 & 1, (i9 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), centerVertically, getpostalcode3, 48);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                String str = androidStringDelegate.MediaMetadataCompat;
                TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setMenuPrepared(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode3, 0, 0, 131066);
                if (androidStringDelegate.MediaBrowserCompatMediaItem) {
                    getpostalcode2 = getpostalcode3;
                    getpostalcode2.serializer(-55485865);
                    i4 = 0;
                    serializer(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setMenuPrepared(), getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2 = getpostalcode3;
                    i4 = 0;
                    getpostalcode2.serializer(-55406102);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(androidStringDelegate.IconCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setMenuPrepared(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[i4], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 24960, 110586);
                getpostalcode.IconCompatParcelizer(true);
                int i10 = IconCompatParcelizer + 105;
                serializer = i10 % Fields.SpotShadowColor;
                i3 = 2;
                int i11 = i10 % 2;
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            i3 = 2;
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getShadowui_text(androidStringDelegate, modifier2, i, i3);
            int i12 = serializer + 7;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % i3;
        }
    }

    public static final void DestinationOrderSummaryContainer(AndroidStringDelegate androidStringDelegate, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        Modifier modifier2;
        int i4;
        getPostalCode getpostalcode2;
        int i5;
        int i6 = 2 % 2;
        String str = androidStringDelegate.RemoteActionCompatParcelizer;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-892282571);
        if ((i & 6) == 0) {
            if (!((i & 8) == 0 ? getpostalcode3.read(androidStringDelegate) : getpostalcode3.IconCompatParcelizer(androidStringDelegate))) {
                i5 = 2;
            } else {
                int i7 = IconCompatParcelizer + 85;
                serializer = i7 % Fields.SpotShadowColor;
                i5 = i7 % 2 == 0 ? 3 : 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        Object obj = null;
        if (getpostalcode3.write(i8 & 1, (i8 & 19) != 18)) {
            int i9 = serializer + 11;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), centerVertically, getpostalcode3, 48);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                getpostalcode3.serializer(constructor);
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode3, 0, 0, 131066);
            if (str.length() > 0) {
                getpostalcode2 = getpostalcode3;
                getpostalcode2.serializer(-327516615);
                serializer(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), getpostalcode2, 0);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2 = getpostalcode3;
                getpostalcode2.serializer(-327462799);
                getpostalcode2.IconCompatParcelizer(false);
            }
            getPostalCode getpostalcode4 = getpostalcode2;
            TextKt.m131TextNvy7gAk(androidStringDelegate.MediaDescriptionCompat, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.IconCompatParcelizer(), getpostalcode4, 0, 24960, 110586);
            getpostalcode = getpostalcode4;
            i3 = 1;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode3;
            i3 = 1;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getShadowui_text(androidStringDelegate, modifier2, i, i3);
            int i11 = serializer + 49;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            i4 = 2;
            int i12 = i11 % 2;
        } else {
            i4 = 2;
        }
        int i13 = serializer + 93;
        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
        if (i13 % i4 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    public static final void DestinationTextContainer(AndroidStringDelegate androidStringDelegate, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        ?? r4;
        Modifier modifier2;
        getPostalCode getpostalcode;
        boolean z;
        getPostalCode getpostalcode2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-912770464);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode3.read(androidStringDelegate) : getpostalcode3.IconCompatParcelizer(androidStringDelegate)) {
                int i5 = serializer + 95;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (!(!getpostalcode3.write(i6 & 1, (i6 & 19) != 18))) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getStart(), getpostalcode3, 6);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode3.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i7 = IconCompatParcelizer + 27;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode3.ComponentActivity) {
                int i9 = serializer + 65;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode3.serializer(constructor);
                int i11 = serializer + 53;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 5 % 2;
                }
            } else {
                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
            String str = androidStringDelegate.write;
            TextOverflow.Companion companion3 = TextOverflow.Companion;
            int iM3569getEllipsisgIe3tQ8 = companion3.m3569getEllipsisgIe3tQ8();
            TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setMenu(), 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 2, 0, null, textStyleMediaSessionCompatToken, getpostalcode3, 0, 24960, 110586);
            int i13 = (i6 & 14) | 8;
            DestinationArrivalContainer(androidStringDelegate, null, getpostalcode3, i13);
            if (androidStringDelegate.RatingCompat) {
                int i14 = IconCompatParcelizer + 47;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode3.serializer(366477617);
                TextKt.m131TextNvy7gAk(androidStringDelegate.read, null, ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, companion3.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.IconCompatParcelizer(), getpostalcode3, 0, 24960, 110586);
                getPostalCode getpostalcode4 = getpostalcode3;
                z = false;
                getpostalcode4.IconCompatParcelizer(false);
                getpostalcode2 = getpostalcode4;
            } else {
                getPostalCode getpostalcode5 = getpostalcode3;
                z = false;
                getpostalcode5.serializer(366709528);
                getpostalcode5.IconCompatParcelizer(false);
                int i16 = serializer + 119;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2 = getpostalcode5;
            }
            if (androidStringDelegate.MediaSessionCompatQueueItem) {
                getpostalcode2.serializer(366757485);
                DestinationOrderSummaryContainer(androidStringDelegate, null, getpostalcode2, i13);
                getpostalcode2.IconCompatParcelizer(z);
            } else {
                getpostalcode2.serializer(366829560);
                getpostalcode2.IconCompatParcelizer(z);
            }
            int i18 = serializer + 73;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            getpostalcode2.IconCompatParcelizer(true);
            modifier2 = companion;
            getpostalcode = getpostalcode2;
            r4 = z;
        } else {
            r4 = 0;
            getPostalCode getpostalcode6 = getpostalcode3;
            getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode = getpostalcode6;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getShadowui_text(androidStringDelegate, modifier2, i, r4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c5  */
    public static final void DestinationHeader(DestinationHeaderUiModel destinationHeaderUiModel, final getPreviouseUduSuoannotations getpreviouseudusuoannotations, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Nonelambda0 nonelambda0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        DestinationHeaderUiModelImpl destinationHeaderUiModelImpl;
        getQueryContext getquerycontext;
        Modifier.Companion companion2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        destinationHeaderUiModel.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-752287553);
        if ((i & 6) == 0) {
            int i6 = serializer + 95;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                i2 = (getpostalcode.read(destinationHeaderUiModel) ? 4 : 2) | i;
            } else {
                getpostalcode.read(destinationHeaderUiModel);
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(getpreviouseudusuoannotations)) {
                int i7 = IconCompatParcelizer + 67;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 16;
            } else {
                int i9 = serializer + 31;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 != 0 ? 99 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i10 = serializer + 37;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i12 = IconCompatParcelizer + 59;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 2048;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ^ true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(nonelambda0) ? Fields.RenderEffect : 65536;
        }
        int i14 = 1572864 | i2;
        if (!getpostalcode.write(i14 & 1, (599187 & i14) != 599186)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i15 = serializer + 105;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                companion = Modifier.Companion;
                destinationHeaderUiModelImpl = (DestinationHeaderUiModelImpl) destinationHeaderUiModel;
                getquerycontext = destinationHeaderUiModelImpl.RemoteActionCompatParcelizer;
                if ((57344 & i14) == 30353) {
                    companion2 = companion;
                    z = true;
                } else {
                    companion2 = companion;
                    z = false;
                }
            } else {
                companion = Modifier.Companion;
                DestinationHeaderUiModelImpl destinationHeaderUiModelImpl2 = (DestinationHeaderUiModelImpl) destinationHeaderUiModel;
                getQueryContext getquerycontext2 = destinationHeaderUiModelImpl2.RemoteActionCompatParcelizer;
                if ((57344 & i14) == 16384) {
                    destinationHeaderUiModelImpl = destinationHeaderUiModelImpl2;
                    getquerycontext = getquerycontext2;
                    companion2 = companion;
                    z = true;
                } else {
                    destinationHeaderUiModelImpl = destinationHeaderUiModelImpl2;
                    getquerycontext = getquerycontext2;
                    companion2 = companion;
                    z = false;
                }
            }
            boolean z3 = (i14 & 896) == 256;
            boolean z4 = (i14 & 7168) == 2048;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            Modifier.Companion companion3 = companion2;
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z3 | z4) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new TextAlignSaverlambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            ActualParagraph4FmOz70 actualParagraph4FmOz70 = (ActualParagraph4FmOz70) ExtrasKt.write(destinationHeaderUiModelImpl.RatingCompat, getpostalcode, 0).getValue();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{actualParagraph4FmOz70, r8lambdaMcHG3qYj2V0v5xX04YffgaUC3R8.serializer}, getCieXyz.write())).booleanValue()) {
                int i16 = serializer + 95;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    getpostalcode.serializer(-258250015);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(-258250015);
                    getpostalcode.IconCompatParcelizer(false);
                }
                companion3 = companion3;
            } else {
                if (actualParagraph4FmOz70 instanceof AndroidStringDelegate) {
                    getpostalcode.serializer(-258186527);
                    AndroidStringDelegate androidStringDelegate = (AndroidStringDelegate) actualParagraph4FmOz70;
                    boolean z5 = (i14 & 14) == 4;
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (!z5) {
                        int i17 = serializer;
                        int i18 = i17 + 87;
                        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        if (objComponentActivity2 != androidContentCaptureManager) {
                            int i20 = i17 + 45;
                            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            z2 = false;
                        } else {
                            z2 = false;
                            ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$2 = new ReportPictureUseCase$invoke$2(1, destinationHeaderUiModel, DestinationHeaderUiModel.class, "onCallClicked", "onCallClicked(Lcom/roadrunner/delivery/ontheway/phonecall/api/PhoneNumber;)V", 0, 20);
                            getpostalcode.write(reportPictureUseCase$invoke$2);
                            objComponentActivity2 = reportPictureUseCase$invoke$2;
                        }
                    } else {
                        z2 = false;
                        ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$3 = new ReportPictureUseCase$invoke$2(1, destinationHeaderUiModel, DestinationHeaderUiModel.class, "onCallClicked", "onCallClicked(Lcom/roadrunner/delivery/ontheway/phonecall/api/PhoneNumber;)V", 0, 20);
                        getpostalcode.write(reportPictureUseCase$invoke$3);
                        objComponentActivity2 = reportPictureUseCase$invoke$3;
                    }
                    serializer(androidStringDelegate, companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), getpostalcode, (i14 >> 15) & 112);
                    getpostalcode.IconCompatParcelizer(z2);
                } else {
                    companion3 = companion3;
                    if (actualParagraph4FmOz70 instanceof AndroidTextPaint) {
                        int i22 = serializer + 21;
                        IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        getpostalcode.serializer(-257953221);
                        final CustomerChatFloatingButtonUiModel customerChatFloatingButtonUiModel = destinationHeaderUiModelImpl.write;
                        final boolean zBooleanValue = ((Boolean) ExtrasKt.write(customerChatFloatingButtonUiModel.MediaSessionCompatQueueItem, getpostalcode, 0).getValue()).booleanValue();
                        AndroidTextPaint androidTextPaint = (AndroidTextPaint) actualParagraph4FmOz70;
                        boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(nonelambda0);
                        boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(actualParagraph4FmOz70);
                        Object objComponentActivity3 = getpostalcode.ComponentActivity();
                        if ((zIconCompatParcelizer2 | zIconCompatParcelizer) || objComponentActivity3 == androidContentCaptureManager) {
                            objComponentActivity3 = new ViewUtils$$ExternalSyntheticLambda6(nonelambda0, 25, androidTextPaint);
                            getpostalcode.write(objComponentActivity3);
                        }
                        DestinationHeaderWithAddressKt.serializer(androidTextPaint, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, companion3, ExtrasKt.write(774307103, new GapComposerKt$$ExternalSyntheticLambda0(androidTextPaint, 26, destinationHeaderUiModel), getpostalcode), ExtrasKt.write(1534441342, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getShadowui_textannotations
                            private static int RatingCompat = 1;
                            private static int read;

                            /* JADX WARN: Code duplicated, block: B:18:0x004a  */
                            /* JADX WARN: Code duplicated, block: B:19:0x006a  */
                            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z6;
                                int i24 = 2 % 2;
                                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if ((iIntValue & 3) != 2) {
                                    int i25 = read + 111;
                                    RatingCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i26 = i25 % 2;
                                    z6 = true;
                                } else {
                                    int i27 = RatingCompat + 95;
                                    read = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i27 % 2 != 0) {
                                        int i28 = 3 / 2;
                                    }
                                    z6 = false;
                                }
                                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                                if (getpostalcode2.write(iIntValue & 1, z6)) {
                                    int i29 = RatingCompat + 79;
                                    read = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i29 % 2 != 0) {
                                        int i30 = 53 / 0;
                                        if (zBooleanValue) {
                                            getpostalcode2.serializer(1205151002);
                                            DestinationHeaderButtonsKt.write(coil3.ExtrasKt.write(-753468617, new GapComposerKt$$ExternalSyntheticLambda0(getpreviouseudusuoannotations, customerChatFloatingButtonUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry), getpostalcode2), getpostalcode2, 6);
                                            getpostalcode2.IconCompatParcelizer(false);
                                        } else {
                                            getpostalcode2.serializer(1205437380);
                                            getpostalcode2.IconCompatParcelizer(false);
                                        }
                                    } else if (zBooleanValue) {
                                        getpostalcode2.serializer(1205151002);
                                        DestinationHeaderButtonsKt.write(coil3.ExtrasKt.write(-753468617, new GapComposerKt$$ExternalSyntheticLambda0(getpreviouseudusuoannotations, customerChatFloatingButtonUiModel, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry), getpostalcode2), getpostalcode2, 6);
                                        getpostalcode2.IconCompatParcelizer(false);
                                    } else {
                                        getpostalcode2.serializer(1205437380);
                                        getpostalcode2.IconCompatParcelizer(false);
                                    }
                                } else {
                                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    int i31 = RatingCompat + 91;
                                    read = i31 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i31 % 2 != 0) {
                                        int i32 = 4 % 2;
                                    }
                                }
                                return createFromParcel.INSTANCE;
                            }
                        }, getpostalcode), getpostalcode, ((i14 >> 12) & 896) | 27648);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1393806260, false);
                    }
                }
            }
            modifier2 = companion3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(destinationHeaderUiModel, getpreviouseudusuoannotations, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, nonelambda0, modifier2, i, 6);
        }
    }
}
