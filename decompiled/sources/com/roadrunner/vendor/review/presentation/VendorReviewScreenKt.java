package com.roadrunner.vendor.review.presentation;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.UiMediaScopeImpl;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInvalidationTracker;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getPushDeliveryManagerandroid_sdk_base_release;
import o.getTopLeftannotations;
import o.getUdmandroid_sdk_base_release;
import o.handleInternalBannerRefreshandroid_sdk_base_release;
import o.handleUrlOverridelambda1;
import o.isApiKeyPresentandroid_sdk_base_release;
import o.isInvalidIndex;
import o.logBannerClick;
import o.logFeatureFlagImpression;
import o.logPurchase;
import o.logPushDeliveryandroid_sdk_base_release;
import o.logPushMaxCampaignandroid_sdk_base_release;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeSingleSubscription;
import o.setCurrentSemanticsNodesui;
import o.setSyncPolicyOfflineStatus;
import o.show;
import o.subscribeToNoMatchingTriggerForEventlambda0;
import o.subscribeToNoMatchingTriggerForEventlambda1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VendorReviewScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void write(subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0, String str, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(846237445);
        if ((i & 6) == 0) {
            i2 = i | (getpostalcode.read(subscribetonomatchingtriggerforeventlambda0.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode.read(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.read(str) ? 32 : 16;
        }
        int i6 = i2 | 384;
        if ((i6 & 147) != 146) {
            int i7 = RemoteActionCompatParcelizer + 11;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 4 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            int i9 = handleInternalBannerRefreshandroid_sdk_base_release.read[subscribetonomatchingtriggerforeventlambda0.ordinal()];
            if (i9 != 1) {
                int i10 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (i9 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                i3 = R.drawable.ic_emoji_happy_selected_large;
            } else {
                i3 = R.drawable.ic_emoji_sad_selected_large;
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i3, getpostalcode, 0), str, companion, null, null, 0.0f, null, getpostalcode, Painter.$stable | (i6 & 112) | (i6 & 896), 120);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 29, subscribetonomatchingtriggerforeventlambda0, str, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0104  */
    public static final void IconCompatParcelizer(logPurchase logpurchase, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 13;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        logpurchase.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2107168865);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(logpurchase) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
            int i10 = RemoteActionCompatParcelizer + 39;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i & 24576) == 0) {
            int i12 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        int i14 = i2 | 196608;
        if ((1572864 & i) == 0) {
            int i15 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i14 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : Fields.BlendMode;
        }
        int i17 = i14;
        int i18 = RemoteActionCompatParcelizer;
        int i19 = i18 + 73;
        IconCompatParcelizer = i19 % Fields.SpotShadowColor;
        boolean z = false;
        if (i19 % 2 == 0) {
            int i20 = 69 / 0;
            if ((i17 & 599187) != 599186) {
                i3 = i18 + 29;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    z = true;
                }
            }
        } else if ((i17 & 599187) != 599186) {
            i3 = i18 + 29;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        if (getpostalcode2.write(i17 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            getpostalcode = getpostalcode2;
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(logpurchase instanceof logPushMaxCampaignandroid_sdk_base_release, companion, null, null, ExtrasKt.write(1966704935, new getPushDeliveryManagerandroid_sdk_base_release(logpurchase, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2), getpostalcode2), getpostalcode2, ((i17 >> 12) & 112) | 24576, 12);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl((Object) logpurchase, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (isInvalidIndex) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) modifier2, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:96:0x0235  */
    public static final void VendorReviewScreenBottomSheetLayout(logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1305875638);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i6 = 4;
            if (!getpostalcode2.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release)) {
                int i7 = RemoteActionCompatParcelizer + 7;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 4;
                }
                i6 = 2;
            } else {
                int i9 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IconCompatParcelizer + 27;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 92 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i3 = Fields.Clip;
            } else {
                int i13 = RemoteActionCompatParcelizer + 3;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode2.write(i2 & 1, (74899 & i2) != 74898)) {
            SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer(null, getpostalcode2, 0, 3);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = ForEachGestureKt.RemoteActionCompatParcelizer(getpostalcode2);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i15 = IconCompatParcelizer + 29;
                RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            getInvalidationTracker getinvalidationtracker = (getInvalidationTracker) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue();
            boolean z2 = getpostalcode2.read(populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer);
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z3 = getpostalcode2.read(sheetStateRemoteActionCompatParcelizer);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if ((z2 | zIconCompatParcelizer | z3) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new SideMenuCacheImpl.AnonymousClass2(getcontentviewgroupparentlayout, populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer, sheetStateRemoteActionCompatParcelizer, populateViewStructure_androidKtpopulate7, null, 10);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, getinvalidationtracker, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = RemoteActionCompatParcelizer + 103;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z4 = getpostalcode2.ComponentActivity;
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier modifierThen = companion.then(SizeKt.read);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i18 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    getpostalcode2.serializer(constructor2);
                    z = false;
                    int i19 = 74 / 0;
                } else {
                    z = false;
                    getpostalcode2.serializer(constructor2);
                }
            } else {
                z = false;
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            int i20 = 25;
            HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, null, ExtrasKt.write(1944842362, new DefaultLazyKey(i20, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode2), null, null, getpostalcode2, 1572864, 447);
            boolean z5 = (458752 & i2) == 131072 ? true : z;
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!zIconCompatParcelizer2 && !z5) {
                int i21 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i20, logpushdeliveryandroid_sdk_base_release);
                    getpostalcode2.write(objComponentActivity4);
                }
            } else {
                objComponentActivity4 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i20, logpushdeliveryandroid_sdk_base_release);
                getpostalcode2.write(objComponentActivity4);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4;
            boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z6 = getpostalcode2.read(sheetStateRemoteActionCompatParcelizer);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer3 | z6) || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new getUdmandroid_sdk_base_release(getcontentviewgroupparentlayout, populateViewStructure_androidKtpopulate7, sheetStateRemoteActionCompatParcelizer);
                getpostalcode2.write(objComponentActivity5);
            }
            getpostalcode = getpostalcode2;
            VendorReviewContent(logpushdeliveryandroid_sdk_base_release, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, null, getpostalcode2, (i2 & 14) | ((i2 >> 9) & 112));
            getpostalcode.IconCompatParcelizer(true);
            if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                getpostalcode.serializer(1168915529);
                float f = Dimensions.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                getTopLeftannotations gettopleftannotationsM97RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m97RoundedCornerShapea9UjIt4$default(f, f, 0.0f, 0.0f, 12);
                long jIconCompatParcelizer = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
                boolean z7 = getpostalcode.read(sheetStateRemoteActionCompatParcelizer);
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer4 | z7) || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new getUdmandroid_sdk_base_release(getcontentviewgroupparentlayout, sheetStateRemoteActionCompatParcelizer, populateViewStructure_androidKtpopulate7, 1);
                    getpostalcode.write(objComponentActivity6);
                }
                ModalBottomSheetKt.m118ModalBottomSheetYbuCTN8((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6, null, sheetStateRemoteActionCompatParcelizer, 0.0f, false, gettopleftannotationsM97RoundedCornerShapea9UjIt4$default, jIconCompatParcelizer, 0L, 0.0f, 0L, null, null, null, ExtrasKt.write(872912053, new logBannerClick(logpushdeliveryandroid_sdk_base_release, getcontentviewgroupparentlayout, sheetStateRemoteActionCompatParcelizer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, populateViewStructure_androidKtpopulate7), getpostalcode), getpostalcode, 0, 3078, 7066);
                getpostalcode.IconCompatParcelizer(false);
                int i22 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
            } else {
                getpostalcode.serializer(1170552422);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isApiKeyPresentandroid_sdk_base_release(logpushdeliveryandroid_sdk_base_release, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, o.getBirthDateFull, o.getPostalCode] */
    public static final void VendorReviewContent(logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        subscribeToNoMatchingTriggerForEventlambda0 subscribetonomatchingtriggerforeventlambda0;
        boolean z2;
        ?? r15;
        String strStringResource;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        logpushdeliveryandroid_sdk_base_release.getClass();
        String str = logpushdeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer;
        logFeatureFlagImpression logfeatureflagimpression = logpushdeliveryandroid_sdk_base_release.read;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        ?? r5 = (getPostalCode) getbirthdatefull;
        r5.MediaSessionCompatQueueItem(-1661995230);
        getAddressCountry getaddresscountry = r5.read;
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                r5.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release);
                throw null;
            }
            if (r5.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release)) {
                int i8 = RemoteActionCompatParcelizer + 5;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
            int i10 = RemoteActionCompatParcelizer + 13;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = IconCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i2 |= !(r5.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (r5.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = IconCompatParcelizer + 95;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (r5.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i3 = Fields.CameraDistance;
            } else {
                int i16 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i18 = i2 | 24576;
        if ((i18 & 9363) != 9362) {
            z = true;
        } else {
            int i19 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = false;
        }
        if (r5.write(i18 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierThen = companion.then(SizeKt.read);
            float f = Dimensions.setTabContainer;
            Modifier modifierWrite = PaddingKt.write(modifierThen, f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), r5, 0);
            int iHashCode = Long.hashCode(r5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = r5.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(r5, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            r5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (r5.ComponentActivity) {
                int i21 = RemoteActionCompatParcelizer + 115;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    r5.serializer(constructor);
                    throw null;
                }
                r5.serializer(constructor);
            } else {
                r5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, (getPostalCode) r5, modalBottomSheetYbuCTN8Serializer, (getPostalCode) r5, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(r5, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, (getPostalCode) r5, Integer.valueOf(iHashCode), (getPostalCode) r5));
            Modifier modifierThen2 = PagerWrapperFlingBehavior.IconCompatParcelizer(companion, PagerWrapperFlingBehavior.read(0, r5, 1), false, 14).then(new show(1.0f, true));
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getCenterHorizontally(), r5, 48);
            int iHashCode2 = Long.hashCode(r5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = r5.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(r5, modifierThen2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            r5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (r5.ComponentActivity) {
                r5.serializer(constructor2);
            } else {
                r5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, (getPostalCode) r5, modalBottomSheetYbuCTN8Serializer2, (getPostalCode) r5, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(r5, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, (getPostalCode) r5, Integer.valueOf(iHashCode2), (getPostalCode) r5));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r5, SizeKt.m83size3ABfNKs(companion, Dimensions.setContentHeight)});
            subscribeToNoMatchingTriggerForEventlambda1 subscribetonomatchingtriggerforeventlambda1 = subscribeToNoMatchingTriggerForEventlambda0.Companion;
            int i22 = logfeatureflagimpression.write;
            subscribetonomatchingtriggerforeventlambda1.getClass();
            if (i22 == 0) {
                subscribetonomatchingtriggerforeventlambda0 = subscribeToNoMatchingTriggerForEventlambda0.NEGATIVE;
            } else {
                if (i22 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Incorrect int value passed for BinaryScore");
                    return;
                }
                subscribetonomatchingtriggerforeventlambda0 = subscribeToNoMatchingTriggerForEventlambda0.POSITIVE;
            }
            write(subscribetonomatchingtriggerforeventlambda0, logfeatureflagimpression.RemoteActionCompatParcelizer, null, r5, 0);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r5, SizeKt.m83size3ABfNKs(companion, Dimensions.setVisibility)});
            String str2 = logfeatureflagimpression.serializer;
            TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long presenter = ((buildMapping) r5.write(setcurrentsemanticsnodesui)).setPresenter();
            TextAlign.Companion companion4 = TextAlign.Companion;
            TextKt.m131TextNvy7gAk(str2, null, presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, r5, 0, 0, 130042);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r5, SizeKt.m83size3ABfNKs(companion, Dimensions.setActionBarHideOffset)});
            removeSingleSubscription.IconCompatParcelizer(logpushdeliveryandroid_sdk_base_release, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, r5, i18 & 126);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r5, SizeKt.m83size3ABfNKs(companion, Dimensions.getTitle)});
            if (str.length() > 0) {
                r5.serializer(-462933871);
                TextKt.m131TextNvy7gAk(str, null, 0L, 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3516getStarte0LSkKk()), 0L, TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.write(), r5, 0, 24960, 109566);
                r15 = 0;
                r5.IconCompatParcelizer(false);
                z2 = true;
                int i23 = RemoteActionCompatParcelizer + 1;
                IconCompatParcelizer = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
            } else {
                z2 = true;
                r15 = 0;
                r5.serializer(-462678772);
                r5.IconCompatParcelizer(false);
            }
            if (str.length() == 0) {
                r5.serializer(-462595041);
                strStringResource = StringResources_androidKt.stringResource(R.string.vendor_review_add_comment_button, r5, r15);
                r5.IconCompatParcelizer(r15);
            } else {
                r5.serializer(-462480930);
                strStringResource = StringResources_androidKt.stringResource(R.string.vendor_review_edit_comment_button, r5, r15);
                r5.IconCompatParcelizer(r15);
            }
            boolean z3 = z2;
            ?? r3 = r15;
            TertiaryKt.IconCompatParcelizer(strStringResource, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, false, 0, null, null, null, r5, (i18 >> 6) & 112, 252);
            r5.IconCompatParcelizer(z3);
            Modifier modifierSerializer = SizeKt.serializer(SizeKt.write(companion, 1.0f), (Alignment.Vertical) null, 3);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.write, companion2.getCenterHorizontally(), r5, 54);
            int iHashCode3 = Long.hashCode(r5.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = r5.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(r5, modifierSerializer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
            r5.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (r5.ComponentActivity) {
                r5.serializer(constructor3);
            } else {
                r5.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, (getPostalCode) r5, modalBottomSheetYbuCTN8Serializer3, (getPostalCode) r5, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(r5, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, (getPostalCode) r5, Integer.valueOf(iHashCode3), (getPostalCode) r5));
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.vendor_review_anonymous_feedback_caption, r5, r3 == true ? 1 : 0), null, ((buildMapping) r5.write(setcurrentsemanticsnodesui)).setOnMenuItemClickListener(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion4.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, (TextStyle) performLayout.addOnMultiWindowModeChangedListener.MediaSessionCompatResultReceiverWrapper(), r5, 0, 0, 130042);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r5, SizeKt.m83size3ABfNKs(companion, f)});
            PrimaryKt.write(StringResources_androidKt.stringResource(R.string.all_confirm, r5, r3 == true ? 1 : 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(companion, 1.0f), false, false, null, null, null, null, null, r5, ((i18 >> 3) & 112) | 384, 0, 2040);
            r5.IconCompatParcelizer(z3);
            r5.IconCompatParcelizer(z3);
            modifier2 = companion;
        } else {
            r5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r5.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setSyncPolicyOfflineStatus(logpushdeliveryandroid_sdk_base_release, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 2);
        }
    }
}
