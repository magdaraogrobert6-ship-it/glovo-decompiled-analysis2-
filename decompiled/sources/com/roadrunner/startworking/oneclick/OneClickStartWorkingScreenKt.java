package com.roadrunner.startworking.oneclick;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.startworking.equipment.SelectedEquipmentKt;
import com.roadrunner.startworking.oneclick.bullet.PolicyItemWithHyperLinkKt;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import io.sentry.SentryUUID;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.b8ExternalSyntheticLambda4;
import o.buildMapping;
import o.computeVerticalScrollExtent;
import o.dc;
import o.extractJsonLong;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_release;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.isApiKeyPresentandroid_sdk_base_release;
import o.logFeatureFlagImpressionlambda1;
import o.logPushNotificationActionClickedlambda11;
import o.logPushNotificationActionClickedlambda12;
import o.logPushNotificationOpenedlambda0;
import o.logPushNotificationOpenedlambda1;
import o.logPushNotificationOpenedlambda10;
import o.logPushNotificationOpenedlambda2;
import o.logPushNotificationOpenedlambda3;
import o.logPushNotificationOpenedlambda30;
import o.logPushNotificationOpenedlambda31;
import o.logPushNotificationOpenedlambda32;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.setSyncPolicyOfflineStatus;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OneClickStartWorkingScreenKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;

    public static final void RemoteActionCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 11;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(763698965);
        if ((i & 6) == 0) {
            int i8 = read + 117;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                getpostalcode2.read(str);
                throw null;
            }
            if (!getpostalcode2.read(str)) {
                i4 = 2;
            } else {
                int i9 = RemoteActionCompatParcelizer + 61;
                read = i9 % Fields.SpotShadowColor;
                i4 = i9 % 2 == 0 ? 3 : 4;
            }
            i2 = i4 | i;
        } else {
            int i10 = RemoteActionCompatParcelizer + 57;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                i3 = 32;
            } else {
                int i12 = read + 29;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        int i14 = i2;
        if (getpostalcode2.write(i14 & 1, (i14 & 19) != 18)) {
            int i15 = read + 117;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, Dimensions.getAnimatedVisibility, 7), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, i14 & 14, 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 28);
        }
    }

    public static final void write(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2083573775);
        if ((i & 6) == 0) {
            int i4 = RemoteActionCompatParcelizer + 85;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                getpostalcode2.read(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i5 = i2;
        if ((i5 & 19) != 18) {
            int i6 = RemoteActionCompatParcelizer + 81;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = RemoteActionCompatParcelizer + 63;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = false;
        }
        if (getpostalcode2.write(i5 & 1, z)) {
            int i10 = RemoteActionCompatParcelizer + 45;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, Dimensions.setPrimaryBackground, 7), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatQueueItem(), getpostalcode, i5 & 14, 0, 131064);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier, 27);
        }
    }

    public static final void OneClickStartWorkingContent(logFeatureFlagImpressionlambda1 logfeatureflagimpressionlambda1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1356211775);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(logfeatureflagimpressionlambda1)) {
                int i9 = read + 69;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i11 = RemoteActionCompatParcelizer + 101;
                read = i11 % Fields.SpotShadowColor;
                i6 = i11 % 2 == 0 ? 13 : 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i12 = RemoteActionCompatParcelizer + 27;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i14 = RemoteActionCompatParcelizer + 7;
                read = i14 % Fields.SpotShadowColor;
                i4 = i14 % 2 == 0 ? 17551 : Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            int i15 = read + 93;
            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.read(modifier)) {
                int i17 = RemoteActionCompatParcelizer + 61;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            int i19 = RemoteActionCompatParcelizer + 93;
            read = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            boolean z2 = logfeatureflagimpressionlambda1.IconCompatParcelizer;
            logPushNotificationOpenedlambda31 logpushnotificationopenedlambda31 = logfeatureflagimpressionlambda1.read;
            if (z2) {
                getpostalcode.serializer(-147273843);
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
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
                int i21 = RemoteActionCompatParcelizer + 85;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, null, ExtrasKt.write(-1774678118, new DefaultLazyKey(24, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), null, null, getpostalcode, 1572864, 447);
                ScrollState scrollState = PagerWrapperFlingBehavior.read(6, getpostalcode, 0);
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM = d$$ExternalSyntheticOutline0.m(1.0f, true, companion3);
                MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                int i23 = RemoteActionCompatParcelizer + 9;
                read = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                OneClickStartWorkingComponentsColumn(removeNodeAtDepth.RemoteActionCompatParcelizer(logpushnotificationopenedlambda31.write), r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, PagerWrapperFlingBehavior.IconCompatParcelizer(companion3, scrollState, false, 14), getpostalcode, i2 & 8176);
                BoxKt.Box(BoxScopeInstance.serializer.align(BackgroundKt.background$default(SizeKt.m75height3ABfNKs(SizeKt.write(companion3, 1.0f), Dimensions.setLogo), Brush.Companion.m677verticalGradient8A3gB4$default(Brush.Companion, SQLite.read(Color.m712boximpl(Color.Companion.m757getTransparent0d7_KjU()), Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6), companion.getBottomCenter()), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
                OneClickStartWorkingComponentsColumn(removeNodeAtDepth.RemoteActionCompatParcelizer(logpushnotificationopenedlambda31.RemoteActionCompatParcelizer), r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, companion3, getpostalcode, (i2 & 112) | 24576 | (i2 & 896) | (i2 & 7168));
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-145347999);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isApiKeyPresentandroid_sdk_base_release(logfeatureflagimpressionlambda1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i);
        }
        int i25 = read + 107;
        RemoteActionCompatParcelizer = i25 % Fields.SpotShadowColor;
        int i26 = i25 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0171  */
    public static final void read(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 45;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        oneClickStartWorkingViewModel.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-770712058);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(oneClickStartWorkingViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i7 = read + 111;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? Fields.RenderEffect : 65536;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1);
                throw null;
            }
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : Fields.BlendMode;
        }
        int i8 = i2 | 12582912;
        if ((i8 & 4793491) != 4793490) {
            int i9 = read + 119;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i8 & 1, z)) {
            modifier2 = Modifier.Companion;
            final FragmentActivity fragmentActivityRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer((Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SnackbarHostState();
                getpostalcode2.write(objComponentActivity);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity2);
            }
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity3);
            }
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity4);
            }
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity4;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(accessisrendernodecompatiblecp);
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(oneClickStartWorkingViewModel);
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer | zIconCompatParcelizer2) {
                RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(accessisrendernodecompatiblecp, oneClickStartWorkingViewModel, (ShortNewsContentCardView) null, 17);
                getpostalcode2.write(rxConvertKt$asFlow$1);
                objComponentActivity5 = rxConvertKt$asFlow$1;
            } else {
                int i11 = RemoteActionCompatParcelizer + 95;
                read = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity5 == androidContentCaptureManager) {
                    RxConvertKt$asFlow$1 rxConvertKt$asFlow$2 = new RxConvertKt$asFlow$1(accessisrendernodecompatiblecp, oneClickStartWorkingViewModel, (ShortNewsContentCardView) null, 17);
                    getpostalcode2.write(rxConvertKt$asFlow$2);
                    objComponentActivity5 = rxConvertKt$asFlow$2;
                }
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, oneClickStartWorkingViewModel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity5);
            getQueryContext getquerycontext = oneClickStartWorkingViewModel.PlaybackStateCompat;
            if ((i8 & 112) == 32) {
                z2 = true;
            } else {
                int i12 = read + 49;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z2 = false;
            }
            if ((i8 & 896) == 256) {
                int i14 = read + 121;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = (i8 & 7168) == 2048;
            if ((458752 & i8) == 131072) {
                int i16 = read + 97;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(fragmentActivityRemoteActionCompatParcelizer);
            boolean z6 = (i8 & 57344) == 16384;
            boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z7 = (i8 & 3670016) == 1048576;
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if ((!(z7 | z2 | z3 | z5 | z4 | zIconCompatParcelizer3 | z6 | zIconCompatParcelizer4)) && objComponentActivity6 != androidContentCaptureManager) {
                i3 = 0;
            } else {
                i3 = 0;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.logEcommerceEventlambda10
                    private static int ParcelableVolumeInfo = 1;
                    private static int PlaybackStateCompatCustomAction;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = ParcelableVolumeInfo + 93;
                        PlaybackStateCompatCustomAction = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        Object obj3 = null;
                        if (i19 % 2 != 0) {
                            logCustomEventlambda1 logcustomeventlambda1 = (logCustomEventlambda1) obj2;
                            logcustomeventlambda1.getClass();
                            boolean z8 = logcustomeventlambda1 instanceof logBannerClicklambda1;
                            obj3.hashCode();
                            throw null;
                        }
                        logCustomEventlambda1 logcustomeventlambda2 = (logCustomEventlambda1) obj2;
                        logcustomeventlambda2.getClass();
                        if (logcustomeventlambda2 instanceof logBannerClicklambda1) {
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                        } else if (logcustomeventlambda2 instanceof logCustomEventlambda12) {
                            int i20 = PlaybackStateCompatCustomAction + 43;
                            ParcelableVolumeInfo = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                        } else if (logcustomeventlambda2 instanceof logCustomEventlambda13) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((logCustomEventlambda13) logcustomeventlambda2).read);
                        } else {
                            boolean z9 = logcustomeventlambda2 instanceof logCustomEventlambda10;
                            androidx.fragment.app.FragmentActivity fragmentActivity = fragmentActivityRemoteActionCompatParcelizer;
                            if (z9) {
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(fragmentActivity, ((logCustomEventlambda10) logcustomeventlambda2).write);
                                int i22 = ParcelableVolumeInfo + 71;
                                PlaybackStateCompatCustomAction = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i23 = i22 % 2;
                            } else if (logcustomeventlambda2 instanceof logCustomEventlambda14) {
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(fragmentActivity, ((logCustomEventlambda14) logcustomeventlambda2).read);
                            } else if (logcustomeventlambda2 instanceof logEcommerceEventlambda11) {
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RxConvertKt$asObservable$1$job$1(populateViewStructure_androidKtpopulate7, logcustomeventlambda2, snackbarHostState, null, 3), 3);
                            } else {
                                if (!(logcustomeventlambda2 instanceof logCustomEventlambda11)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                int i24 = PlaybackStateCompatCustomAction + 37;
                                ParcelableVolumeInfo = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i24 % 2 == 0) {
                                    ((Boolean) populateViewStructure_androidKtpopulate8.getValue()).booleanValue();
                                    obj3.hashCode();
                                    throw null;
                                }
                                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = populateViewStructure_androidKtpopulate8;
                                if (!((Boolean) populateViewStructure_androidKtpopulate9.getValue()).booleanValue()) {
                                    populateViewStructure_androidKtpopulate9.setValue(Boolean.TRUE);
                                    r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(Boolean.FALSE);
                                }
                            }
                        }
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode2.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm3);
                objComponentActivity6 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode2, 8);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(oneClickStartWorkingViewModel.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, getpostalcode2, i3);
            getpostalcode = getpostalcode2;
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(((Boolean) ((logFeatureFlagImpressionlambda1) populateViewStructure_androidKtpopulate7Write.getValue()).serializer.getValue()).booleanValue(), null, null, Color.m712boximpl(((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme()), ExtrasKt.write(-1496102018, new b8ExternalSyntheticLambda4(snackbarHostState, populateViewStructure_androidKtpopulate7, oneClickStartWorkingViewModel, modifier2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, populateViewStructure_androidKtpopulate7Write, populateViewStructure_androidKtpopulate8), getpostalcode2), getpostalcode2, 24576, 6);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(oneClickStartWorkingViewModel, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, i);
        }
    }

    public static final void OneClickStartWorkingComponentsColumn(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        Modifier modifier2;
        boolean z;
        int i4;
        boolean z2;
        Modifier modifier3;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(530897547);
        if ((i & 6) == 0) {
            int i6 = RemoteActionCompatParcelizer + 51;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        int i8 = i2;
        if (getpostalcode.write(i8 & 1, (i8 & 9363) != 9362)) {
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, Dimensions.getAnimatedVisibility, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i9 = read + 59;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(92622756);
            Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            int i11 = read + 121;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            while (it.hasNext()) {
                logPushNotificationActionClickedlambda11 logpushnotificationactionclickedlambda11 = (logPushNotificationActionClickedlambda11) it.next();
                if (!(!(logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda3))) {
                    i3 = i8;
                    Modifier modifier4 = modifierM73paddingVpY3zN4$default;
                    int i13 = read + 19;
                    RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        getpostalcode.serializer(-351624035);
                        modifier2 = modifier4;
                        write(1, getpostalcode, modifier2, ((logPushNotificationOpenedlambda3) logpushnotificationactionclickedlambda11).RemoteActionCompatParcelizer);
                    } else {
                        modifier2 = modifier4;
                        getpostalcode.serializer(-351624035);
                        write(0, getpostalcode, modifier2, ((logPushNotificationOpenedlambda3) logpushnotificationactionclickedlambda11).RemoteActionCompatParcelizer);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                } else if (logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda2) {
                    int i14 = read + 37;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 != 0) {
                        getpostalcode.serializer(-351522758);
                        RemoteActionCompatParcelizer(1, getpostalcode, modifierM73paddingVpY3zN4$default, ((logPushNotificationOpenedlambda2) logpushnotificationactionclickedlambda11).IconCompatParcelizer);
                        getpostalcode.IconCompatParcelizer(true);
                        i3 = i8;
                        modifier2 = modifierM73paddingVpY3zN4$default;
                    } else {
                        getpostalcode.serializer(-351522758);
                        RemoteActionCompatParcelizer(0, getpostalcode, modifierM73paddingVpY3zN4$default, ((logPushNotificationOpenedlambda2) logpushnotificationactionclickedlambda11).IconCompatParcelizer);
                        getpostalcode.IconCompatParcelizer(false);
                        i3 = i8;
                        modifier2 = modifierM73paddingVpY3zN4$default;
                    }
                } else {
                    if (logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda0) {
                        getpostalcode.serializer(-149883458);
                        z = false;
                        i4 = i8;
                        modifier3 = modifierM73paddingVpY3zN4$default;
                        DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, modifier3);
                        getpostalcode.IconCompatParcelizer(false);
                        z2 = true;
                    } else {
                        z = false;
                        i4 = i8;
                        z2 = true;
                        modifier3 = modifierM73paddingVpY3zN4$default;
                        if (logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda10) {
                            int i15 = read + 75;
                            RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                            int i16 = i15 % 2;
                            getpostalcode.serializer(-351324358);
                            PolicyItemWithHyperLinkKt.PolicyItem((logPushNotificationOpenedlambda10) logpushnotificationactionclickedlambda11, PaddingKt.m74paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, Dimensions.setStackedBackground, 7), getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            boolean z3 = logpushnotificationactionclickedlambda11 instanceof logPushNotificationActionClickedlambda12;
                            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                            if (z3) {
                                getpostalcode.serializer(-351115139);
                                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, Dimensions.setStackedBackground, 7);
                                logPushNotificationActionClickedlambda12 logpushnotificationactionclickedlambda12 = (logPushNotificationActionClickedlambda12) logpushnotificationactionclickedlambda11;
                                boolean z4 = (i4 & 112) == 32;
                                boolean z5 = getpostalcode.read(logpushnotificationactionclickedlambda11);
                                Object objComponentActivity = getpostalcode.ComponentActivity();
                                if ((z5 | z4) || objComponentActivity == androidContentCaptureManager) {
                                    objComponentActivity = new TncContentKt$$ExternalSyntheticLambda1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 20, logpushnotificationactionclickedlambda12);
                                    getpostalcode.write(objComponentActivity);
                                }
                                PolicyItemWithHyperLinkKt.PolicyItemWithHyperLink(logpushnotificationactionclickedlambda12, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifierM74paddingqDBjuR0$default, getpostalcode, 0);
                                getpostalcode.IconCompatParcelizer(false);
                                i3 = i4;
                                modifier2 = modifier3;
                            } else if (logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda1) {
                                int i17 = RemoteActionCompatParcelizer + 9;
                                read = i17 % Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                getpostalcode.serializer(-350816237);
                                Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(modifier3, 1.0f), 0.0f, 0.0f, 0.0f, Dimensions.getAnimatedVisibility, 7);
                                logPushNotificationOpenedlambda1 logpushnotificationopenedlambda1 = (logPushNotificationOpenedlambda1) logpushnotificationactionclickedlambda11;
                                String str = logpushnotificationopenedlambda1.serializer;
                                boolean z6 = (i4 & 7168) == 2048;
                                boolean z7 = getpostalcode.read(logpushnotificationactionclickedlambda11);
                                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                                if ((z7 | z6) || objComponentActivity2 == androidContentCaptureManager) {
                                    objComponentActivity2 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 21, logpushnotificationopenedlambda1);
                                    getpostalcode.write(objComponentActivity2);
                                }
                                PrimaryKt.write(str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierM74paddingqDBjuR0$default2, false, false, null, null, null, null, null, getpostalcode, 0, 0, 2040);
                                getpostalcode.IconCompatParcelizer(false);
                                modifier2 = modifier3;
                                i3 = i4;
                            } else if (logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda30) {
                                getpostalcode.serializer(-350479112);
                                logPushNotificationOpenedlambda30 logpushnotificationopenedlambda30 = (logPushNotificationOpenedlambda30) logpushnotificationactionclickedlambda11;
                                String str2 = logpushnotificationopenedlambda30.RemoteActionCompatParcelizer;
                                boolean z8 = (i4 & 7168) == 2048;
                                boolean z9 = getpostalcode.read(logpushnotificationactionclickedlambda11);
                                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                                if ((z9 | z8) || objComponentActivity3 == androidContentCaptureManager) {
                                    objComponentActivity3 = new getPendingWebViewPauseRunnableandroid_sdk_ui_release(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 22, logpushnotificationopenedlambda30);
                                    getpostalcode.write(objComponentActivity3);
                                }
                                TertiaryKt.IconCompatParcelizer(str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, modifier3, false, 0, null, null, null, getpostalcode, 0, 248);
                                getpostalcode.IconCompatParcelizer(false);
                                modifier2 = modifier3;
                                i3 = i4;
                            } else {
                                if (!(logpushnotificationactionclickedlambda11 instanceof logPushNotificationOpenedlambda32)) {
                                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -149890069, false);
                                }
                                int i19 = read + 61;
                                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                                int i20 = i19 % 2;
                                getpostalcode.serializer(-350229903);
                                Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, Dimensions.setStackedBackground, 7);
                                logPushNotificationOpenedlambda32 logpushnotificationopenedlambda32 = (logPushNotificationOpenedlambda32) logpushnotificationactionclickedlambda11;
                                String str3 = logpushnotificationopenedlambda32.write;
                                String str4 = logpushnotificationopenedlambda32.IconCompatParcelizer;
                                String str5 = logpushnotificationopenedlambda32.read;
                                String str6 = logpushnotificationopenedlambda32.RemoteActionCompatParcelizer;
                                boolean z10 = (i4 & 896) == 256;
                                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                                if (z10 || objComponentActivity4 == androidContentCaptureManager) {
                                    objComponentActivity4 = new extractJsonLong(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                                    getpostalcode.write(objComponentActivity4);
                                }
                                i3 = i4;
                                SelectedEquipmentKt.SelectedEquipment(str3, str4, str5, str6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, modifierM74paddingqDBjuR0$default3, getpostalcode, 0);
                                getpostalcode.IconCompatParcelizer(false);
                                modifier2 = modifier3;
                            }
                        }
                    }
                    modifier2 = modifier3;
                    i3 = i4;
                }
                modifierM73paddingVpY3zN4$default = modifier2;
                i8 = i3;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setSyncPolicyOfflineStatus(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, i, 1);
        }
    }
}
