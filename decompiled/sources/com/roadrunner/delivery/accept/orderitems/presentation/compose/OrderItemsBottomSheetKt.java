package com.roadrunner.delivery.accept.orderitems.presentation.compose;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.Api34SegmentFindertoAndroidSegmentFinder1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.FlingCancellationException;
import o.GraphemeClusterSegmentFinderUnderApi29;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RadioButton;
import o.SegmentFinder;
import o.TextFieldDefaults;
import o.TooltipKt;
import o.accessgetCoarsecp;
import o.accessgetStripNonMetricAffectingCharSpansp;
import o.accessgetTextCentercp;
import o.accessisDocked;
import o.accessstripNonMetricAffectingCharacterStyleSpans;
import o.buildMapping;
import o.computeVerticalScrollExtent;
import o.computeVerticalScrollRange;
import o.dc;
import o.dividedefault;
import o.extractAuthorizationHeader;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getPushAlert;
import o.getRootCause;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.nextEndBoundary;
import o.o8ExternalSyntheticLambda6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.setCurrentSemanticsNodesui;
import o.setRoundRectOutlineTNW_H78default;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;
import o.toAndroidSegmentFinderui_text;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OrderItemsBottomSheetKt {
    private static int read = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:14:0x004b A[PHI: r2
  0x004b: PHI (r2v31 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v33 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v33 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        getPushAlert getpushalert;
        boolean z;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        extractAuthorizationHeader extractauthorizationheader;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = read + 75;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1476184981);
            if ((i & 40) == 0) {
                if (getpostalcode.read(R.drawable.ic_bold_large_cancel_thin)) {
                    int i9 = read + 13;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                int i11 = read + 81;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1476184981);
            if ((i & 6) == 0) {
                if (getpostalcode.read(R.drawable.ic_bold_large_cancel_thin)) {
                    int i13 = read + 13;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                int i15 = read + 81;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = i;
            }
        }
        getPostalCode getpostalcode2 = getpostalcode;
        if ((i & 48) == 0) {
            int i17 = write + 31;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode2.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode2.write(i3 & 1, (i3 & 147) != 146)) {
            int i19 = read + 47;
            write = i19 % Fields.SpotShadowColor;
            if (i19 % 2 == 0) {
                i4 = R.drawable.ic_bold_large_cancel_thin;
                getpushalert = null;
                z = false;
                mutableInteractionSourceImpl = null;
                extractauthorizationheader = null;
                i5 = i3 & 23985;
                i6 = 28756;
            } else {
                i4 = R.drawable.ic_bold_large_cancel_thin;
                getpushalert = null;
                z = false;
                mutableInteractionSourceImpl = null;
                extractauthorizationheader = null;
                i5 = i3 & 1022;
                i6 = 248;
            }
            getRootCause.read(i4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getpushalert, z, mutableInteractionSourceImpl, extractauthorizationheader, getpostalcode2, i5, i6);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 4);
        }
    }

    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-707078267);
        if ((i & 6) == 0) {
            int i5 = read + 11;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.read(str)) {
                int i7 = read + 113;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if ((i9 & 19) != 18) {
            z = true;
        } else {
            int i10 = write + 119;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = false;
        }
        if (!getpostalcode2.write(i9 & 1, z)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            getpostalcode = getpostalcode2;
        } else {
            Modifier.Companion companion = Modifier.Companion;
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 2), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3516getStarte0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, i9 & 14, 0, 130040);
            modifier2 = companion;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 4);
        }
        int i12 = read + 67;
        write = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
    }

    public static final void OrderItemExtraProductContent(GraphemeClusterSegmentFinderUnderApi29 graphemeClusterSegmentFinderUnderApi29, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        graphemeClusterSegmentFinderUnderApi29.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1612956741);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(graphemeClusterSegmentFinderUnderApi29) : getpostalcode2.IconCompatParcelizer(graphemeClusterSegmentFinderUnderApi29)) {
                int i5 = read + 65;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 5;
                }
                i3 = 4;
            } else {
                int i7 = read + 57;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode2.write(i9 & 1, (i9 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i10 = write + 105;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = graphemeClusterSegmentFinderUnderApi29.read;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode2, 0, 0, 131066);
            String str2 = graphemeClusterSegmentFinderUnderApi29.serializer;
            TextStyle textStyleIconCompatParcelizer2 = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode();
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str2, null, supportBackgroundTintMode, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer2, getpostalcode, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(graphemeClusterSegmentFinderUnderApi29, modifier2, i, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r4
  0x003e: PHI (r4v46 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v48 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r4
  0x0032: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v48 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void OrderInstruction(int i, int i2, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        boolean z;
        getPostalCode getpostalcode2;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 23;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(444078354);
            if ((i2 & 85) == 0) {
                if (getpostalcode.read(i)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(444078354);
            if ((i2 & 6) == 0) {
                if (getpostalcode.read(i)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i2;
            } else {
                i4 = i2;
            }
        }
        getPostalCode getpostalcode3 = getpostalcode;
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode3.read(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode3.read(modifier)) {
                int i8 = write + 23;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i4 |= i5;
            int i10 = write + 79;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 3 % 5;
            }
        }
        int i12 = i4;
        if ((i12 & 147) != 146) {
            int i13 = read + 57;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode3.write(i12 & 1, z)) {
            int i15 = write + 103;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getTop(), getpostalcode3, 48);
            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode3.read != null) {
                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode3.ComponentActivity) {
                    getpostalcode3.serializer(constructor);
                } else {
                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode3, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(i, getpostalcode3, i12 & 14);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                Modifier.Companion companion2 = Modifier.Companion;
                IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, SizeKt.m83size3ABfNKs(companion2, Dp.m3673constructorimpl(24.0f)), presenter, getpostalcode3, Painter.$stable | 432, 0);
                TextKt.m131TextNvy7gAk(str, d$$ExternalSyntheticOutline0.m(1.0f, true, companion2), ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode3, (i12 >> 3) & 14, 0, 131064);
                getpostalcode2 = getpostalcode3;
                getpostalcode2.IconCompatParcelizer(true);
                int i17 = write + 95;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode2 = getpostalcode3;
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new o8ExternalSyntheticLambda6(i, str, modifier, i2);
        }
    }

    public static final void OrderItemProductContent(nextEndBoundary nextendboundary, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        nextendboundary.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-50297887);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i4 = write + 37;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                zIconCompatParcelizer = getpostalcode2.read(nextendboundary);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(nextendboundary);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (getpostalcode2.write(i6 & 1, (i6 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f, 0.0f, 0.0f, 13);
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(f);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, companion2.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i7 = write + 51;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                Object obj = null;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode2.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i8 = read + 115;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String str = nextendboundary.write;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode2, 0, 0, 131066);
            Modifier modifierWrite2 = SizeKt.write(companion, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode2.ComponentActivity)) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            TextKt.m131TextNvy7gAk(nextendboundary.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            List list = nextendboundary.read;
            if (list == null) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(1158791678);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(1158791679);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    OrderItemExtraProductContent((GraphemeClusterSegmentFinderUnderApi29) it.next(), null, getpostalcode, 0);
                }
                getpostalcode.IconCompatParcelizer(false);
            }
            int i10 = read + 69;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(nextendboundary, modifier2, i, 25);
        }
        int i12 = write + 115;
        read = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[PHI: r3 r4
  0x004a: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r4v18 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v19 o.getAddressCountry) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r3 r4
  0x0036: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0036: PHI (r4v3 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v19 o.getAddressCountry) binds: [B:8:0x0034, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void OrderItemContent(toAndroidSegmentFinderui_text toandroidsegmentfinderui_text, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        Modifier modifier2;
        Modifier modifier3;
        nextEndBoundary nextendboundary;
        int i4;
        int i5 = 2 % 2;
        int i6 = read + 33;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            toandroidsegmentfinderui_text.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(792217115);
            getaddresscountry = getpostalcode.read;
            if ((i & 23) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(toandroidsegmentfinderui_text);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(toandroidsegmentfinderui_text);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            toandroidsegmentfinderui_text.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(792217115);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(toandroidsegmentfinderui_text);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(toandroidsegmentfinderui_text);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i3 | 48;
        if ((i7 & 19) != 18) {
            int i8 = read + 113;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierWrite2 = PaddingKt.write(modifierWrite, f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i10 = read + 69;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierWrite3 = SizeKt.write(companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(f), companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite3);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
                int i11 = read + 51;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str = toandroidsegmentfinderui_text.write;
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            modifier2 = companion;
            getPostalCode getpostalcode2 = getpostalcode;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            TextKt.m131TextNvy7gAk(toandroidsegmentfinderui_text.read, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.serializer(602637420);
            Iterator it = toandroidsegmentfinderui_text.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                int i13 = read + 3;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    nextendboundary = (nextEndBoundary) it.next();
                    i4 = 127;
                    modifier3 = null;
                } else {
                    modifier3 = null;
                    nextendboundary = (nextEndBoundary) it.next();
                    i4 = 8;
                }
                OrderItemProductContent(nextendboundary, modifier3, getpostalcode, i4);
            }
            getpostalcode.IconCompatParcelizer(false);
            String str2 = toandroidsegmentfinderui_text.RemoteActionCompatParcelizer;
            if (str2 == null) {
                getpostalcode.serializer(1501997291);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1501997292);
                Modifier.Companion companion4 = Modifier.Companion;
                Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion4, Dimensions.setActionBarVisibilityCallback)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                OrderInstruction(R.drawable.ic_bold_medium_essentials_shop, 384, getpostalcode, companion4, str2);
                getpostalcode.IconCompatParcelizer(false);
            }
            String str3 = toandroidsegmentfinderui_text.serializer;
            if (str3 == null) {
                getpostalcode.serializer(1502359619);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1502359620);
                Modifier.Companion companion5 = Modifier.Companion;
                Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion5, Dimensions.setActionBarVisibilityCallback)};
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
                OrderInstruction(R.drawable.ic_bold_medium_essentials_user_circle, 384, getpostalcode, companion5, str3);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(toandroidsegmentfinderui_text, modifier2, i, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    /* JADX WARN: Code duplicated, block: B:14:0x0068 A[PHI: r2
  0x0068: PHI (r2v70 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v72 o.getPostalCode) binds: [B:8:0x004a, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0152 A[PHI: r3 r4
  0x0152: PHI (r3v29 androidx.compose.ui.Modifier$Companion) = (r3v28 androidx.compose.ui.Modifier$Companion), (r3v35 androidx.compose.ui.Modifier$Companion) binds: [B:72:0x0150, B:69:0x013f] A[DONT_GENERATE, DONT_INLINE]
  0x0152: PHI (r4v8 java.lang.Object) = (r4v7 java.lang.Object), (r4v24 java.lang.Object) binds: [B:72:0x0150, B:69:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0157 A[PHI: r3
  0x0157: PHI (r3v33 androidx.compose.ui.Modifier$Companion) = (r3v28 androidx.compose.ui.Modifier$Companion), (r3v35 androidx.compose.ui.Modifier$Companion) binds: [B:72:0x0150, B:69:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x004c A[PHI: r2
  0x004c: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v72 o.getPostalCode) binds: [B:8:0x004a, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(final SegmentFinder segmentFinder, final accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp, final accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        final Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        Modifier.Companion companion;
        Object value;
        Modifier.Companion companion2;
        Api34SegmentFindertoAndroidSegmentFinder1 api34SegmentFindertoAndroidSegmentFinder1;
        Modifier.Companion companion3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 75;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            segmentFinder.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1857309862);
            if ((i & 26) == 0) {
                if (getpostalcode.read(segmentFinder)) {
                    int i8 = read + 101;
                    int i9 = i8 % Fields.SpotShadowColor;
                    write = i9;
                    int i10 = i8 % 2;
                    int i11 = i9 + 65;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            segmentFinder.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1857309862);
            if ((i & 6) == 0) {
                if (getpostalcode.read(segmentFinder)) {
                    int i13 = read + 101;
                    int i14 = i13 % Fields.SpotShadowColor;
                    write = i14;
                    int i15 = i13 % 2;
                    int i16 = i14 + 65;
                    read = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(accessgetstripnonmetricaffectingcharspansp) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(accessstripnonmetricaffectingcharacterstylespans)) {
                int i18 = write + 107;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i5 = Fields.SpotShadowColor;
            } else {
                int i20 = read + 53;
                write = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i5 = Fields.RotationX;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true ? 8192 : Fields.Clip;
        }
        if ((196608 & i) == 0) {
            int i22 = write + 103;
            read = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i24 = read + 65;
                write = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((1572864 & i) == 0) {
            int i26 = read + 3;
            write = i26 % Fields.SpotShadowColor;
            int i27 = i26 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 1048576 : Fields.BlendMode;
        }
        int i28 = 12582912 | i3;
        if (getpostalcode2.write(i28 & 1, (4793491 & i28) != 4793490)) {
            int i29 = read + 27;
            write = i29 % Fields.SpotShadowColor;
            if (i29 % 2 == 0) {
                companion = Modifier.Companion;
                value = ExtrasKt.write(segmentFinder.MediaMetadataCompat, getpostalcode2, 0).getValue();
                if (value instanceof Api34SegmentFindertoAndroidSegmentFinder1) {
                    companion2 = companion;
                    api34SegmentFindertoAndroidSegmentFinder1 = (Api34SegmentFindertoAndroidSegmentFinder1) value;
                } else {
                    companion2 = companion;
                    api34SegmentFindertoAndroidSegmentFinder1 = null;
                }
            } else {
                companion = Modifier.Companion;
                value = ExtrasKt.write(segmentFinder.MediaMetadataCompat, getpostalcode2, 0).getValue();
                if (value instanceof Api34SegmentFindertoAndroidSegmentFinder1) {
                    companion2 = companion;
                    api34SegmentFindertoAndroidSegmentFinder1 = (Api34SegmentFindertoAndroidSegmentFinder1) value;
                } else {
                    companion2 = companion;
                    api34SegmentFindertoAndroidSegmentFinder1 = null;
                }
            }
            if (api34SegmentFindertoAndroidSegmentFinder1 == null) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i30 = 0;
                final Modifier.Companion companion4 = companion2;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBeginning
                    private static int MediaSessionCompatResultReceiverWrapper = 1;
                    private static int PlaybackStateCompat;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i31 = 2 % 2;
                        int i32 = PlaybackStateCompat + 43;
                        MediaSessionCompatResultReceiverWrapper = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i33 = i32 % 2;
                        int i34 = i30;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i35 = i;
                        if (i34 != 0) {
                            ((Integer) obj2).getClass();
                            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i35 | 1);
                            OrderItemsBottomSheetKt.IconCompatParcelizer(segmentFinder, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                            return createfromparcel;
                        }
                        ((Integer) obj2).getClass();
                        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i35 | 1);
                        OrderItemsBottomSheetKt.IconCompatParcelizer(segmentFinder, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion4, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
                        int i36 = MediaSessionCompatResultReceiverWrapper + 47;
                        PlaybackStateCompat = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i37 = i36 % 2;
                        return createfromparcel;
                    }
                };
            } else {
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(segmentFinder.write, getpostalcode2, 0);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new accessgetTextCentercp(24);
                    getpostalcode2.write(objComponentActivity);
                }
                SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 54, 0);
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    int i31 = write + 89;
                    read = i31 % Fields.SpotShadowColor;
                    if (i31 % 2 == 0) {
                        objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                        getpostalcode2.write(objComponentActivity2);
                    } else {
                        getpostalcode2.write(getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2));
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
                if (((Boolean) populateViewStructure_androidKtpopulate7Write.getValue()).booleanValue()) {
                    getpostalcode2.serializer(-944793518);
                    float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    getTopLeftannotations gettopleftannotationsM97RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12);
                    Color.Companion companion5 = Color.Companion;
                    long jM757getTransparent0d7_KjU = companion5.m757getTransparent0d7_KjU();
                    long jM757getTransparent0d7_KjU2 = companion5.m757getTransparent0d7_KjU();
                    Modifier modifierWrite = SizeKt.write(companion2, 1.0f);
                    boolean z = (i28 & 3670016) == 1048576;
                    boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
                    boolean z2 = getpostalcode2.read(sheetStateRemoteActionCompatParcelizer);
                    Modifier.Companion companion6 = companion2;
                    Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                    if ((zIconCompatParcelizer | z | z2) || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new accessisDocked(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getcontentviewgroupparentlayout, sheetStateRemoteActionCompatParcelizer);
                        getpostalcode2.write(objComponentActivity3);
                    }
                    companion3 = companion6;
                    getpostalcode3 = getpostalcode2;
                    ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifierWrite, sheetStateRemoteActionCompatParcelizer, 0.0f, false, gettopleftannotationsM97RoundedCornerShapea9UjIt4$default, jM757getTransparent0d7_KjU, 0L, 0.0f, jM757getTransparent0d7_KjU2, null, null, null, ExtrasKt.write(1985319245, new dividedefault(api34SegmentFindertoAndroidSegmentFinder1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2), getpostalcode2), getpostalcode3, 806879232, 3078, 6552);
                    getpostalcode3.IconCompatParcelizer(false);
                } else {
                    companion3 = companion2;
                    getpostalcode3 = getpostalcode2;
                    getpostalcode3.serializer(-943763140);
                    getpostalcode3.IconCompatParcelizer(false);
                }
                modifier2 = companion3;
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode3 = getpostalcode2;
        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i32 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getBeginning
                private static int MediaSessionCompatResultReceiverWrapper = 1;
                private static int PlaybackStateCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    int i33 = 2 % 2;
                    int i34 = PlaybackStateCompat + 43;
                    MediaSessionCompatResultReceiverWrapper = i34 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i35 = i34 % 2;
                    int i36 = i32;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i37 = i;
                    if (i36 != 0) {
                        ((Integer) obj3).getClass();
                        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i37 | 1);
                        OrderItemsBottomSheetKt.IconCompatParcelizer(segmentFinder, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer);
                        return createfromparcel;
                    }
                    ((Integer) obj3).getClass();
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i37 | 1);
                    OrderItemsBottomSheetKt.IconCompatParcelizer(segmentFinder, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, (getBirthDateFull) obj2, iRemoteActionCompatParcelizer2);
                    int i38 = MediaSessionCompatResultReceiverWrapper + 47;
                    PlaybackStateCompat = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i39 = i38 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public static final void OrderItemsContent(Api34SegmentFindertoAndroidSegmentFinder1 api34SegmentFindertoAndroidSegmentFinder1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, accessgetStripNonMetricAffectingCharSpansp accessgetstripnonmetricaffectingcharspansp, accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        Modifier modifier2;
        Modifier modifier3;
        int i2;
        int i3;
        int i4 = 2 % 2;
        ArrayList arrayList = api34SegmentFindertoAndroidSegmentFinder1.read;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-51643399);
        getAddressCountry getaddresscountry = getpostalcode.read;
        int i5 = (i & 6) == 0 ? ((i & 8) == 0 ? getpostalcode.read(api34SegmentFindertoAndroidSegmentFinder1) : getpostalcode.IconCompatParcelizer(api34SegmentFindertoAndroidSegmentFinder1) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(accessgetstripnonmetricaffectingcharspansp)) {
                int i6 = read + 13;
                write = i6 % Fields.SpotShadowColor;
                i3 = i6 % 2 == 0 ? 29878 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i5 |= i3;
        }
        if ((i & 3072) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(accessstripnonmetricaffectingcharacterstylespans) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i7 = read + 79;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i5 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i9 = write + 11;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i2 = Fields.RenderEffect;
            } else {
                i2 = 65536;
            }
            i5 |= i2;
        }
        if ((1572864 & i) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 1048576 : Fields.BlendMode;
        }
        int i11 = i5 | 12582912;
        if ((4793491 & i11) != 4793490) {
            int i12 = write + 35;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Configuration configuration = (Configuration) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalConfiguration());
            WeakHashMap weakHashMap = TooltipKt.serializer;
            float fIconCompatParcelizer = OffsetKt.read(setRoundRectOutlineTNW_H78default.read(getpostalcode).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode).IconCompatParcelizer();
            float fM3673constructorimpl = Dp.m3673constructorimpl(configuration.screenHeightDp);
            boolean zSerializer = getpostalcode.serializer(fIconCompatParcelizer);
            boolean zSerializer2 = getpostalcode.serializer(fM3673constructorimpl);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((zSerializer | zSerializer2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = Dp.m3671boximpl(Dp.m3673constructorimpl(Dp.m3673constructorimpl(fM3673constructorimpl - fIconCompatParcelizer) * 0.02f));
                getpostalcode.write(objComponentActivity);
            }
            float fM3687unboximpl = ((Dp) objComponentActivity).m3687unboximpl();
            boolean zSerializer3 = getpostalcode.serializer(fM3673constructorimpl);
            boolean zSerializer4 = getpostalcode.serializer(fIconCompatParcelizer);
            boolean zSerializer5 = getpostalcode.serializer(fM3687unboximpl);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((zSerializer3 | zSerializer4 | zSerializer5) || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = Dp.m3671boximpl(Dp.m3673constructorimpl(Dp.m3673constructorimpl(Dp.m3673constructorimpl(fM3673constructorimpl - fIconCompatParcelizer) + fM3687unboximpl)));
                getpostalcode.write(objComponentActivity2);
            }
            float fM3687unboximpl2 = ((Dp) objComponentActivity2).m3687unboximpl();
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new computeVerticalScrollRange(1, accessstripnonmetricaffectingcharacterstylespans), true, 590718748);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity3 = dragAndDropTargetModifierNode;
            }
            r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = (r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity3;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.m75height3ABfNKs(SizeKt.write(companion, 1.0f), fM3687unboximpl2), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            modifierM20backgroundbw27NRU.getClass();
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = write + 69;
            read = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z2 = getpostalcode.ComponentActivity;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierThen = companion.then(new RadioButton(companion2.getEnd()));
            float f = Dimensions.setActionBarVisibilityCallback;
            IconCompatParcelizer(i11 & 112, getpostalcode, PaddingKt.write(modifierThen, f), r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Modifier modifierIconCompatParcelizer = ModalBottomSheetDialogWrapper.IconCompatParcelizer(PagerWrapperFlingBehavior.IconCompatParcelizer(companion, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i15 = write + 29;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    getpostalcode.serializer(constructor2);
                    throw null;
                }
                getpostalcode.serializer(constructor2);
                modifier3 = null;
            } else {
                modifier3 = null;
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            IconCompatParcelizer(0, getpostalcode, modifier3, api34SegmentFindertoAndroidSegmentFinder1.RemoteActionCompatParcelizer);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, f)});
            accessgetCoarsecp.serializer(0.0f, 0, 7, 0L, getpostalcode, null);
            getpostalcode.serializer(-1019174238);
            int i16 = 0;
            for (Object obj2 : arrayList) {
                if (i16 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                OrderItemContent((toAndroidSegmentFinderui_text) obj2, null, getpostalcode, 8);
                if (i16 < arrayList.size() - 1) {
                    getpostalcode.serializer(1498824618);
                    accessgetCoarsecp.serializer(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.setActionBarVisibilityCallback, 0.0f, 2));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-780955049);
                    getpostalcode.IconCompatParcelizer(false);
                }
                i16++;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            int i17 = i11 >> 9;
            r8lambdahlfuu54mfvlmnthbk7uy9j3wgim.read(accessgetstripnonmetricaffectingcharspansp, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, Integer.valueOf((i17 & 7168) | ((i11 >> 6) & 14) | 24576 | (i17 & 112) | (i17 & 896)));
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(api34SegmentFindertoAndroidSegmentFinder1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, accessgetstripnonmetricaffectingcharspansp, accessstripnonmetricaffectingcharacterstylespans, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i);
        }
    }
}
