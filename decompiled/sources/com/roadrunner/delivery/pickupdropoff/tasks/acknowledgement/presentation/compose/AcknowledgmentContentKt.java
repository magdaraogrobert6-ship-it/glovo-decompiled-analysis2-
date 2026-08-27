package com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.compose.AcknowledgmentContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.model.AcknowledgmentTaskUiItem$Companion;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.CheckboxKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentCaptureManagerTranslateStatus;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.InfiniteTransitionSearchInfo;
import o.InspectableKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.TransitionBasedSearchInfo;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.runSyncInPlayAdIdSchedulerWithTimeout;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AcknowledgmentContentKt {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static final void serializer(getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(538145415);
        if (i != 0) {
            int i3 = read + 115;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (true ^ getpostalcode.write(i & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i4 = read + 5;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.setMenu;
            float f2 = Dimensions.getNestedScrollAxes;
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(SizeKt.m84sizeVpY3zN4(PaddingKt.m74paddingqDBjuR0$default(companion, f2, f, 0.0f, 0.0f, 12), f2, f2), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), RoundedCornerShapeKt.IconCompatParcelizer), getpostalcode, 0);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    public static final void RemoteActionCompatParcelizer(final AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 29;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        acknowledgementTaskUiModelImpl.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(265585395);
        if ((i & 6) == 0) {
            if (getpostalcode.read(acknowledgementTaskUiModelImpl)) {
                i3 = 4;
            } else {
                int i7 = serializer + 57;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = serializer + 107;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 16 : 32;
        }
        int i11 = i2 | 384;
        if ((i11 & 147) != 146) {
            int i12 = serializer + 57;
            read = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            modifier2 = Modifier.Companion;
            InspectableKt inspectableKt = (InspectableKt) ExtrasKt.write(acknowledgementTaskUiModelImpl.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            if (inspectableKt instanceof r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw) {
                getpostalcode.serializer(1824503877);
                InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = ((r8lambdaA60ffMCsn5_AuDHFqPPY0dFLRw) inspectableKt).write;
                boolean z2 = (i11 & 112) == 32;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z2) {
                    objComponentActivity = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1);
                    getpostalcode.write(objComponentActivity);
                } else {
                    int i14 = read + 39;
                    serializer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        throw null;
                    }
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new AndroidContentCaptureManagerTranslateStatus(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 1);
                        getpostalcode.write(objComponentActivity);
                    }
                }
                AcknowledgmentTaskUiItem$Companion acknowledgmentTaskUiItem$Companion = InfiniteTransitionSearchInfo.Companion;
                AcknowledgmentContent(infiniteTransitionSearchInfo, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, modifier2, getpostalcode, (i11 & 896) | 8);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(725234441);
                getpostalcode.IconCompatParcelizer(false);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i15 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.PreviewActivity
                    private static int MediaDescriptionCompat = 0;
                    private static int MediaMetadataCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i16 = 2 % 2;
                        int i17 = MediaDescriptionCompat + 43;
                        MediaMetadataCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        int i19 = i15;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i20 = i;
                        androidx.compose.ui.Modifier modifier3 = modifier2;
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl2 = acknowledgementTaskUiModelImpl;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        ((Integer) obj2).getClass();
                        if (i19 != 0) {
                            AcknowledgmentContentKt.RemoteActionCompatParcelizer(acknowledgementTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                            return createfromparcel;
                        }
                        AcknowledgmentContentKt.RemoteActionCompatParcelizer(acknowledgementTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                        int i21 = MediaMetadataCompat + 115;
                        MediaDescriptionCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        return createfromparcel;
                    }
                };
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        modifier2 = modifier;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i16 = 1;
            final Modifier modifier3 = modifier2;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.PreviewActivity
                private static int MediaDescriptionCompat = 0;
                private static int MediaMetadataCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = 2 % 2;
                    int i18 = MediaDescriptionCompat + 43;
                    MediaMetadataCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    int i110 = i16;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i20 = i;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl2 = acknowledgementTaskUiModelImpl;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i110 != 0) {
                        AcknowledgmentContentKt.RemoteActionCompatParcelizer(acknowledgementTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier4, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                        return createfromparcel;
                    }
                    AcknowledgmentContentKt.RemoteActionCompatParcelizer(acknowledgementTaskUiModelImpl2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier4, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                    int i21 = MediaMetadataCompat + 115;
                    MediaDescriptionCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }

    public static final void Check(TransitionBasedSearchInfo transitionBasedSearchInfo, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 125;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2044002565);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode2.read(transitionBasedSearchInfo) : getpostalcode2.IconCompatParcelizer(transitionBasedSearchInfo)) {
                int i7 = serializer + 111;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i9 = read + 57;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            int i11 = read + 3;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            int i13 = read + 73;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.setMenu, 0.0f, 0.0f, 13);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(playbackStateCompatCustomAction, companion2.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            serializer(getpostalcode2, 0);
            Modifier modifierThen = PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 0.0f, 14).then(new show(1.0f, true));
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i15 = serializer + 91;
                read = i15 % Fields.SpotShadowColor;
                if (i15 % 2 != 0) {
                    getpostalcode2.serializer(constructor2);
                    int i16 = 39 / 0;
                } else {
                    getpostalcode2.serializer(constructor2);
                }
                int i17 = serializer + 41;
                read = i17 % Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    int i18 = 2 / 4;
                }
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            String str = transitionBasedSearchInfo.text;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode2, 0, 0, 131066);
            String str2 = transitionBasedSearchInfo.subtext;
            if (str2 == null || str2.length() == 0) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(259736119);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(259474293);
                TextStyle textStyle = (TextStyle) performLayout.onNewIntent.MediaSessionCompatResultReceiverWrapper();
                long windowCallback = ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setWindowCallback();
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(str2, PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 0.0f, 13), windowCallback, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131064);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(transitionBasedSearchInfo, i, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r2 r7
  0x0048: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r7v33 o.getAddressCountry) = (r7v1 o.getAddressCountry), (r7v34 o.getAddressCountry) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0253  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2 r7
  0x0034: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r7v2 o.getAddressCountry) = (r7v1 o.getAddressCountry), (r7v34 o.getAddressCountry) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void AcknowledgmentContent(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = serializer + 105;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1124314029);
            getaddresscountry = getpostalcode.read;
            if ((i & 122) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(infiniteTransitionSearchInfo);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(infiniteTransitionSearchInfo);
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
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1124314029);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(infiniteTransitionSearchInfo);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(infiniteTransitionSearchInfo);
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
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i3;
        if (getpostalcode.write(i6 & 1, (i6 & 147) != 146)) {
            int i7 = serializer + 5;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            modifierWrite.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                String str = infiniteTransitionSearchInfo.title;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long overlayMode = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setOverlayMode();
                Modifier.Companion companion2 = Modifier.Companion;
                companion2.getClass();
                TextKt.m131TextNvy7gAk(str, companion2, overlayMode, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 48, 0, 131064);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getActionBarHideOffset)});
                TextKt.m131TextNvy7gAk(infiniteTransitionSearchInfo.description, companion2, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getActionBarHideOffset(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 131064);
                getpostalcode.serializer(951439352);
                Iterator it = infiniteTransitionSearchInfo.checks.iterator();
                while (it.hasNext()) {
                    int i9 = read + 93;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    Check((TransitionBasedSearchInfo) it.next(), getpostalcode, 0);
                }
                boolean z2 = false;
                getpostalcode.IconCompatParcelizer(false);
                Modifier.Companion companion3 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setMenu)});
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                boolean z3 = infiniteTransitionSearchInfo.isChecked;
                String str2 = infiniteTransitionSearchInfo.confirmationText;
                if ((i6 & 112) == 32) {
                    int i11 = read + 17;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if ((i6 & 14) != 4) {
                    int i13 = read + 9;
                    int i14 = i13 % Fields.SpotShadowColor;
                    serializer = i14;
                    if (i13 % 2 != 0 ? (i6 & 8) != 0 : (i6 & 115) != 0) {
                        int i15 = i14 + 107;
                        read = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        if (getpostalcode.IconCompatParcelizer(infiniteTransitionSearchInfo)) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = true;
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if ((z | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new SessionDao_Impl$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 24, infiniteTransitionSearchInfo);
                    getpostalcode.write(objComponentActivity);
                }
                CheckboxKt.m5038CheckboxBigPIknLig(str2, z3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, companion3, false, getpostalcode, 3072);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 18, infiniteTransitionSearchInfo, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier);
        }
    }
}
