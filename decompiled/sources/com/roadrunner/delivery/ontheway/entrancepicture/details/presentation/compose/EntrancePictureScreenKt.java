package com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt$ScrollAnimation$1$1;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.WeakHashMap;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.AsyncTaskExecutor11;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ForgottenCoroutineScopeException;
import o.IconCompatParcelizer;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.RecordingInputConnection;
import o.RunnableWrapper;
import o.SelectionMagnifierKt;
import o.ShortNewsContentCardView;
import o.SystemLifecycle;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TextFieldDefaults;
import o.ThumbNodemeasure1;
import o.TooltipKt;
import o.accessparse;
import o.addEditCommandWithBatch;
import o.buildMapping;
import o.canReadPlayIds;
import o.computeHorizontalScrollExtent;
import o.computeVerticalScrollExtent;
import o.emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12;
import o.endBatchEditInternal;
import o.ensureActive;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getFacebookAttributionId;
import o.getHandleruiannotations;
import o.getImageLoader;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getPhoneNumberNational;
import o.getPlatformLocaleDelegate;
import o.getPostalCode;
import o.getPrivateImeOptions;
import o.handleUrlOverridelambda1;
import o.isInvalidIndex;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg;
import o.setCurrentSemanticsNodesui;
import o.setRoundRectOutlineTNW_H78default;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EntrancePictureScreenKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[PHI: r12
  0x0040: PHI (r12v5 o.getPostalCode) = (r12v1 o.getPostalCode), (r12v6 o.getPostalCode) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r12
  0x0027: PHI (r12v2 o.getPostalCode) = (r12v1 o.getPostalCode), (r12v6 o.getPostalCode) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(ScrollState scrollState, boolean z, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-63865223);
            if ((i & 65) == 0) {
                if (!getpostalcode.read(scrollState)) {
                    i3 = 2;
                } else {
                    i2 = RemoteActionCompatParcelizer + 107;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-63865223);
            if ((i & 6) == 0) {
                if (!getpostalcode.read(scrollState)) {
                    i3 = 2;
                } else {
                    i2 = RemoteActionCompatParcelizer + 107;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = 3;
                    } else {
                        i3 = 4;
                    }
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z)) {
                int i8 = IconCompatParcelizer + 125;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i5 = i8 % 2 == 0 ? 115 : 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 19) != 18) {
            int i9 = IconCompatParcelizer;
            int i10 = i9 + 57;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = i9 + 81;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            int i14 = RemoteActionCompatParcelizer + 3;
            int i15 = i14 % Fields.SpotShadowColor;
            IconCompatParcelizer = i15;
            int i16 = i14 % 2;
            if ((i4 & 112) == 32) {
                int i17 = i15 + 65;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            boolean z4 = (i4 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!(!(z3 | z4)) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new GalleryScreenKt$ScrollAnimation$1$1(z, scrollState, null, 1);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new RecordingInputConnection(scrollState, z, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    public static final void IconCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-159732675);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                i2 = (getpostalcode.read(str) ? 4 : 2) | i;
            } else {
                getpostalcode.read(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = RemoteActionCompatParcelizer + 65;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            } else {
                int i7 = 58 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i3 = 32;
                } else {
                    i3 = 16;
                }
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            int i8 = RemoteActionCompatParcelizer + 85;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                int i9 = 2 / 5;
            }
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            TextStyle textStyleWrite = performLayout.write();
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
            int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            boolean z = (i2 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(16, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            TextKt.m131TextNvy7gAk(str, modifier, popupTheme, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 0, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, textStyleWrite, getpostalcode, (i2 & 14) | ((i2 >> 3) & 112), 384, 61432);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 8);
        }
    }

    public static final void Header(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1754351274);
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode2.read(modifier)) {
                int i9 = IconCompatParcelizer + 121;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    i3 = 4;
                }
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer, Alignment.Companion.getStart(), getpostalcode2, 6);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_cancel_thin, getpostalcode2, 0);
                long popupTheme = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                Modifier modifier2 = canReadPlayIds.read(Modifier.Companion, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, 63);
                float f = Dimensions.setActionBarVisibilityCallback;
                float f2 = Dimensions.getNestedScrollAxes;
                getpostalcode = getpostalcode2;
                IconKt.m116Iconww6aTOc(painterPainterResource, "close", PaddingKt.m73paddingVpY3zN4$default(PaddingKt.m74paddingqDBjuR0$default(modifier2, f, 0.0f, f2, 0.0f, 10), 0.0f, f2, 1), popupTheme, getpostalcode2, Painter.$stable | 48, 0);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 10);
        }
    }

    public static final void CustomerName(String str, Integer num, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        Integer num2;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1954973771);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode2.read(num)) {
                int i10 = RemoteActionCompatParcelizer + 23;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? 19 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        int i11 = i2;
        if (getpostalcode2.write(i11 & 1, (i11 & 19) != 18)) {
            Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), 0L, null, null, 0L, null, 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle, getpostalcode2, i11 & 14, 24960, 110586);
                num2 = num;
                if (num2 == null) {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(-1130829165);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(-1130829164);
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(num.intValue(), getpostalcode, 0), "expand details", (Modifier) null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), getpostalcode, Painter.$stable | 48, 4);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i12 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 1;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            i3 = 1;
            num2 = num;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPrivateImeOptions(str, num2, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r3
  0x0043: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r3
  0x002d: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void PageIndicator(int i, int i2, Modifier modifier, getBirthDateFull getbirthdatefull, int i3) {
        getPostalCode getpostalcode;
        int i4;
        int i5;
        Modifier modifier2;
        long onMenuItemClickListener;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(489152595);
            if ((i3 & 47) == 0) {
                int i8 = IconCompatParcelizer + 79;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (!(!getpostalcode.read(i))) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i5 = i3 | i4;
            } else {
                i5 = i3;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(489152595);
            if ((i3 & 6) == 0) {
                int i10 = IconCompatParcelizer + 79;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (!(!getpostalcode.read(i))) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
                i5 = i3 | i4;
            } else {
                i5 = i3;
            }
        }
        if ((i3 & 48) == 0) {
            i5 |= getpostalcode.read(i2) ? 32 : 16;
        }
        int i12 = i5 | 384;
        if (getpostalcode.write(i12 & 1, (i12 & 147) != 146)) {
            int i13 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier.Companion companion = Modifier.Companion;
            if (i > 1) {
                getpostalcode.serializer(-478938460);
                Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                float f = Dimensions.getNestedScrollAxes;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, 0.0f, f, 0.0f, Dimensions.setLogo, 5);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                Alignment.Companion companion2 = Alignment.Companion;
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.serializer(f, companion2.getCenterHorizontally()), companion2.getCenterVertically(), getpostalcode, 48);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                if (getpostalcode.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i15 = IconCompatParcelizer + 87;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-2000771832);
                for (int i17 = 0; i17 < i; i17++) {
                    int i18 = RemoteActionCompatParcelizer + 73;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    if (i17 == i2) {
                        getpostalcode.serializer(1190094416);
                        onMenuItemClickListener = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener();
                    } else {
                        getpostalcode.serializer(1190095275);
                        onMenuItemClickListener = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener();
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    int i20 = IconCompatParcelizer + 7;
                    RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes), RoundedCornerShapeKt.IconCompatParcelizer), ((Color) TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(onMenuItemClickListener, null, null, null, getpostalcode, 0, 14).getValue()).m732unboximpl(), RectangleShapeKt.getRectangleShape()), getpostalcode, 0);
                }
                af$$ExternalSyntheticOutline0.m(getpostalcode, false, true, false);
                modifier2 = companion;
            } else {
                getpostalcode.serializer(1924236427);
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.setWindowCallback, getpostalcode, false);
                modifier2 = companion;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessparse(i, i2, modifier2, i3, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01b4  */
    public static final void RemoteActionCompatParcelizer(int i, r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        getPostalCode getpostalcode;
        boolean z2;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1157389544);
        if ((i2 & 6) == 0) {
            i3 = (getpostalcode2.read(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i3 |= getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 32 : 16;
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        if ((i2 & 384) == 0) {
            int i8 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                i3 |= getpostalcode2.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode2.write(z);
                throw null;
            }
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i9 = IconCompatParcelizer + 55;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 25769 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i3 |= i4;
        }
        if ((i2 & 24576) == 0) {
            int i10 = IconCompatParcelizer + 33;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        if ((196608 & i2) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i11 = IconCompatParcelizer + 35;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                i3 |= getpostalcode2.read(modifier) ? 1048576 : Fields.BlendMode;
            } else {
                getpostalcode2.read(modifier);
                throw null;
            }
        }
        int i12 = i3;
        if (getpostalcode2.write(i12 & 1, (599187 & i12) != 599186)) {
            int i13 = IconCompatParcelizer;
            int i14 = i13 + 17;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0 ? (i12 & 112) != 32 : (i12 & 97) != 126) {
                z2 = false;
            } else {
                int i15 = i13 + 53;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                z2 = true;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new endBatchEditInternal(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 1);
                getpostalcode2.write(objComponentActivity);
            }
            ForgottenCoroutineScopeException forgottenCoroutineScopeException = PagerStateKt.read(i, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode2, i12 & 14);
            int i17 = 4;
            getpostalcode = getpostalcode2;
            PagerKt.m95HorizontalPager8jOkeI(forgottenCoroutineScopeException, modifier, null, null, 0.0f, null, null, false, null, null, null, null, ExtrasKt.write(673531561, new ensureActive(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 1), getpostalcode2), getpostalcode, (i12 >> 15) & 112, 24576, 16380);
            int iRemoteActionCompatParcelizer = forgottenCoroutineScopeException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer();
            boolean z3 = (i12 & 7168) == 2048;
            boolean z4 = getpostalcode.read(forgottenCoroutineScopeException);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3 | z4) {
                objComponentActivity2 = new SwitcherUiModelImpl$1.AnonymousClass1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, forgottenCoroutineScopeException, shortNewsContentCardView, i17);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i18 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 == 0) {
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new SwitcherUiModelImpl$1.AnonymousClass1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, forgottenCoroutineScopeException, shortNewsContentCardView, i17);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iRemoteActionCompatParcelizer), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new addEditCommandWithBatch(i, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, z, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0185  */
    public static final void DeliveryNotesSection(String str, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 69;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1791234113);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.write(z);
                throw null;
            }
            if (getpostalcode.write(z)) {
                int i9 = RemoteActionCompatParcelizer + 63;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 != 0 ? 43 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = RemoteActionCompatParcelizer + 89;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_file_new_note, getpostalcode, 0);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            IconKt.m116Iconww6aTOc(painterPainterResource, "Delivery Notes Icon", SizeKt.m83size3ABfNKs(companion, Dimensions.setLogo).then(new emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveNavigationEntrancePictureinvokeinlinedmap12(companion2.getTop())), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), getpostalcode, 48 | Painter.$stable, 0);
            Object[] objArr = {getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.setMenu, 0.0f, 0.0f, 0.0f, 14)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            int i12 = z ? Integer.MAX_VALUE : 2;
            TextStyle textStyleWrite = performLayout.write();
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme();
            int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
            boolean z2 = (i2 & 896) == 256;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            } else {
                int i13 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            }
            TextKt.m131TextNvy7gAk(str, null, popupTheme, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, i12, 0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, textStyleWrite, getpostalcode, i2 & 14, 384, 45050);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 3);
            int i14 = IconCompatParcelizer + 67;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
        }
    }

    public static final void read(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z) {
        int i2;
        ColorFilter colorFilter;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1898981300);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!(!getpostalcode.write(z))) {
                int i8 = IconCompatParcelizer + 5;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i6 = i8 % 2 == 0 ? 46 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = RemoteActionCompatParcelizer + 63;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 256;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            int i11 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i4 = Fields.RotationZ;
                } else {
                    int i12 = RemoteActionCompatParcelizer + 73;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i4 = Fields.CameraDistance;
                }
                i2 |= i4;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                int i14 = RemoteActionCompatParcelizer + 49;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i3 = Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Modifier modifierM73paddingVpY3zN4$default = !((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() ? PaddingKt.m73paddingVpY3zN4$default(modifier, Dimensions.setActionBarHideOffset, 0.0f, 2) : modifier;
            if (!((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                getpostalcode.serializer(-440057686);
                ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOnMenuItemClickListener(), 0, 2, null);
                getpostalcode.IconCompatParcelizer(false);
                colorFilter = colorFilterM763tintxETnrds$default;
            } else {
                getpostalcode.serializer(-756859159);
                getpostalcode.IconCompatParcelizer(false);
                colorFilter = null;
            }
            ContentScale fillWidth = ContentScale.Companion.getFillWidth();
            Alignment center = Alignment.Companion.getCenter();
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0);
            ZoomState zoomState = AsyncTaskExecutor11.read(getpostalcode);
            boolean z3 = (i2 & 896) == 256;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                z2 = true;
                objComponentActivity2 = new getImageLoader(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7, 1);
                getpostalcode.write(objComponentActivity2);
            } else {
                z2 = true;
            }
            Modifier modifierSerializer = RunnableWrapper.serializer(modifierM73paddingVpY3zN4$default, zoomState, z, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 6);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3;
            if ((i2 & 7168) != 2048) {
                z2 = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(17, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
            int i16 = Painter.$stable;
            getNonZeroRgk1Os.write(str, "entrance picture", modifierSerializer, painterPainterResource2, painterPainterResource, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, center, fillWidth, colorFilter, getpostalcode, (i2 & 14) | 817889328 | (i16 << 9) | (i16 << 12), 6, 26720);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFacebookAttributionId(str, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i);
        }
    }

    public static final void EntrancePictureScreen(final getPlatformLocaleDelegate getplatformlocaledelegate, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1906528487);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 103;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? (i & 8) != 0 : (i & 54) != 0) {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getplatformlocaledelegate);
            } else {
                int i8 = i6 + 125;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                zIconCompatParcelizer = getpostalcode2.read(getplatformlocaledelegate);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = RemoteActionCompatParcelizer + 11;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i12 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                i3 = i12 % 2 == 0 ? 15798 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i13 = RemoteActionCompatParcelizer + 67;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ^ true ? Fields.BlendMode : 1048576;
        }
        int i15 = i2 | 12582912;
        if ((4793491 & i15) != 4793490) {
            int i16 = IconCompatParcelizer + 99;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            z = true;
        } else {
            int i18 = IconCompatParcelizer + 37;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = false;
        }
        if (getpostalcode2.write(i15 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(companion.then(SizeKt.read), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), RectangleShapeKt.getRectangleShape());
            WeakHashMap weakHashMap = TooltipKt.serializer;
            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(modifierM20backgroundbw27NRU, new ThumbNodemeasure1(setRoundRectOutlineTNW_H78default.read(getpostalcode2).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, setRoundRectOutlineTNW_H78default.read(getpostalcode2).PlaybackStateCompat));
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWindowInsetsPadding);
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
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            final float f = Dimensions.setCustomView;
            Header(i15 & 112, getpostalcode2, ZIndexModifierKt.zIndex(SizeKt.m75height3ABfNKs(companion, f), 1.0f), r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            final ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode2, 1);
            IconCompatParcelizer(scrollState, getplatformlocaledelegate.write, getpostalcode2, 0);
            boolean z2 = getplatformlocaledelegate.MediaDescriptionCompat;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeWrite = ExtrasKt.write(1686416048, new r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds() { // from class: o.r8lambdaxx0hTFbntkzAQ66OQwJgwhY5944
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaDescriptionCompat;

                @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i20 = 2 % 2;
                    final boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                    ((Integer) obj4).getClass();
                    ((sendDragEventEu1f8Dk) obj).getClass();
                    final androidx.compose.foundation.ScrollState scrollState2 = scrollState;
                    final getPlatformLocaleDelegate getplatformlocaledelegate2 = getplatformlocaledelegate;
                    final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
                    final float f2 = f;
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    Iconww6aTOc.serializer(null, null, false, coil3.ExtrasKt.write(1046692122, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.getAnnotations
                        private static int MediaDescriptionCompat = 0;
                        private static int MediaSessionCompatToken = 1;

                        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            boolean z3;
                            androidx.compose.ui.Modifier modifierM75height3ABfNKs;
                            int i21 = 2 % 2;
                            int i22 = MediaSessionCompatToken + 95;
                            MediaDescriptionCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i23 = i22 % 2;
                            getPlatformLocaleDelegate getplatformlocaledelegate3 = getplatformlocaledelegate2;
                            boolean z4 = getplatformlocaledelegate3.write;
                            getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj5;
                            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj6;
                            int iIntValue = ((Integer) obj7).intValue();
                            getshouldcreatecompositiononattachedtowindow.getClass();
                            if ((iIntValue & 6) == 0) {
                                int i24 = MediaSessionCompatToken + 79;
                                MediaDescriptionCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i25 = i24 % 2;
                                iIntValue |= ((getPostalCode) getbirthdatefull3).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
                            }
                            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                            boolean zWrite = getpostalcode3.write(iIntValue & 1, (iIntValue & 19) != 18);
                            getAddressCountry getaddresscountry = getpostalcode3.read;
                            if (zWrite) {
                                boolean z5 = zBooleanValue;
                                getWindow getwindow = (getWindow) getshouldcreatecompositiononattachedtowindow;
                                float fSerializer = getwindow.serializer();
                                if (!z5) {
                                    fSerializer = androidx.compose.ui.unit.Dp.m3673constructorimpl(fSerializer * 0.65f);
                                }
                                float fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(getwindow.serializer() - fSerializer);
                                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                                androidx.compose.ui.Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion3.then(androidx.compose.foundation.layout.SizeKt.read), scrollState2, z4, 12);
                                FlingCancellationException flingCancellationException = androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat;
                                androidx.compose.ui.Alignment.Companion companion4 = androidx.compose.ui.Alignment.Companion;
                                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion4.getStart(), getpostalcode3, 0);
                                int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                                androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifierIconCompatParcelizer);
                                androidx.compose.ui.node.ComposeUiNode.Companion companion5 = androidx.compose.ui.node.ComposeUiNode.Companion;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
                                if (getaddresscountry == null) {
                                    SentryUUID.write();
                                    throw null;
                                }
                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode3.ComponentActivity) {
                                    getpostalcode3.serializer(constructor2);
                                } else {
                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                                float f3 = !(z5 ^ true) ? Dimensions.getAnimatedVisibility : Dimensions.setActionBarHideOffset;
                                int i26 = getplatformlocaledelegate3.read;
                                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = getplatformlocaledelegate3.MediaBrowserCompatMediaItem;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
                                boolean z6 = getpostalcode3.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm5);
                                boolean zWrite2 = getpostalcode3.write(z5);
                                Object objComponentActivity = getpostalcode3.ComponentActivity();
                                if ((z6 | zWrite2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                                    objComponentActivity = new SubList(1, z5, r8lambdaunavo3sxub_pc9xroryotnrlvsm5);
                                    getpostalcode3.write(objComponentActivity);
                                }
                                EntrancePictureScreenKt.RemoteActionCompatParcelizer(i26, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, z5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion3, fSerializer), 0.0f, androidx.compose.ui.unit.Dp.m3673constructorimpl(f3 + f2), 0.0f, 0.0f, 13), getpostalcode3, 0);
                                if (z5) {
                                    z3 = true;
                                    getpostalcode3.serializer(171604222);
                                    getpostalcode3.IconCompatParcelizer(false);
                                } else {
                                    int i27 = MediaDescriptionCompat + 117;
                                    MediaSessionCompatToken = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    int i28 = i27 % 2;
                                    getpostalcode3.serializer(170386635);
                                    if (z4) {
                                        int i29 = MediaSessionCompatToken + 51;
                                        MediaDescriptionCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i30 = i29 % 2;
                                        modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.serializer(companion3, 1.0f);
                                    } else {
                                        modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion3, fM3673constructorimpl);
                                    }
                                    ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion4.getCenterHorizontally(), getpostalcode3, 48);
                                    int iHashCode3 = Long.hashCode(getpostalcode3.RatingCompat);
                                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode3.serializer();
                                    androidx.compose.ui.Modifier modifierMaterializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifierM75height3ABfNKs);
                                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion5.getConstructor();
                                    getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                    if (getpostalcode3.ComponentActivity) {
                                        getpostalcode3.serializer(constructor3);
                                    } else {
                                        getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                    }
                                    c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, modalBottomSheetYbuCTN8Serializer2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                                    AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, Integer.valueOf(iHashCode3), getpostalcode3));
                                    EntrancePictureScreenKt.PageIndicator(getplatformlocaledelegate3.MediaBrowserCompatMediaItem.size(), getplatformlocaledelegate3.read, null, getpostalcode3, 0);
                                    EntrancePictureScreenKt.DetailsSection(getplatformlocaledelegate3.IconCompatParcelizer, getplatformlocaledelegate3.serializer, getplatformlocaledelegate3.RemoteActionCompatParcelizer, getplatformlocaledelegate3.MediaSessionCompatQueueItem, getplatformlocaledelegate3.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, null, getpostalcode3, 0);
                                    z3 = true;
                                    getpostalcode3.IconCompatParcelizer(true);
                                    getpostalcode3.IconCompatParcelizer(false);
                                }
                                getpostalcode3.IconCompatParcelizer(z3);
                            } else {
                                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }
                            return createFromParcel.INSTANCE;
                        }
                    }, getbirthdatefull2), getbirthdatefull2, 3072, 7);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = MediaBrowserCompatMediaItem + 37;
                    MediaDescriptionCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i21 % 2 == 0) {
                        return createfromparcel;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            }, getpostalcode2);
            getpostalcode = getpostalcode2;
            AnimatedContentKt.write(Boolean.valueOf(z2), null, null, null, null, null, dragAndDropTargetModifierNodeWrite, getpostalcode, 1572864, 62);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent((Object) getplatformlocaledelegate, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (isInvalidIndex) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifier2, i, 7);
        }
    }

    public static final void DetailsSection(String str, String str2, String str3, Integer num, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        boolean z2;
        boolean z3;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2126760010);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(num) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = 65536;
            } else {
                int i5 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 23 / 0;
                }
                i3 = 131072;
            }
            i2 |= i3;
        }
        if ((1572864 & i) == 0) {
            int i7 = IconCompatParcelizer + 101;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 1048576 : Fields.BlendMode;
        }
        int i9 = i2 | 12582912;
        if (!(!getpostalcode.write(i9 & 1, (4793491 & i9) != 4793490))) {
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(canReadPlayIds.read(SizeKt.write(companion2, 1.0f), null, num != null, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, 61), Dimensions.setActionBarVisibilityCallback, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i10 = IconCompatParcelizer + 29;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                int i12 = IconCompatParcelizer + 77;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    throw null;
                }
                getpostalcode.serializer(constructor);
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            if (str.length() > 0) {
                int i13 = IconCompatParcelizer + 87;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                getpostalcode.serializer(-133269214);
                CustomerName(str, num, getpostalcode, (i9 & 14) | ((i9 >> 6) & 112));
                companion = companion2;
                z2 = false;
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.getNestedScrollAxes, getpostalcode, false);
            } else {
                companion = companion2;
                z2 = false;
                getpostalcode.serializer(-133126986);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (str2.length() > 0) {
                getpostalcode.serializer(-133081261);
                IconCompatParcelizer(((i9 >> 3) & 14) | ((i9 >> 12) & 112), getpostalcode, z ? companion : d$$ExternalSyntheticOutline0.m(1.0f, z2, companion), str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                z3 = false;
                IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.getNestedScrollAxes, getpostalcode, false);
            } else {
                z3 = z2;
                getpostalcode.serializer(-132740106);
                getpostalcode.IconCompatParcelizer(z3);
            }
            if (str3 == null || str3.length() == 0) {
                int i15 = IconCompatParcelizer + 67;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(-132373066);
                getpostalcode.IconCompatParcelizer(z3);
            } else {
                getpostalcode.serializer(-132685391);
                DividerKt.read(0.0f, 0, 4, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), getpostalcode, PaddingKt.m73paddingVpY3zN4$default(companion, 0.0f, Dimensions.getNestedScrollAxes, 1));
                int i17 = i9 >> 9;
                DeliveryNotesSection(str3, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i9 >> 6) & 14) | (i17 & 112) | (i17 & 896));
                getpostalcode.IconCompatParcelizer(z3);
            }
            IconCompatParcelizer.IconCompatParcelizer(companion, Dimensions.setWindowCallback, getpostalcode, true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SystemLifecycle(str, str2, str3, num, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i);
        }
    }
}
