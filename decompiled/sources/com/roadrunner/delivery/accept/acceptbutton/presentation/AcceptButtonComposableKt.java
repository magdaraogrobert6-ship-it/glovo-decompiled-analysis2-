package com.roadrunner.delivery.accept.acceptbutton.presentation;

import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.mapbox.navigation.core.MapboxNavigation;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.common.data.model.TrackingEventExtensionsKt;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidContentCaptureManager;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.BackspaceCommand;
import o.FontSynthesisSaverlambda1;
import o.FontWeightSaverlambda0;
import o.FontWeightSaverlambda1;
import o.HyphensSaverlambda0;
import o.HyphensSaverlambda1;
import o.LineHeightStyleAlignmentSaverlambda0;
import o.LineHeightStyleAlignmentSaverlambda1;
import o.LineHeightStyleModeSaverlambda1;
import o.LineHeightStyleTrimSaverlambda1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextAlignSaverlambda0;
import o.TypefaceResultImmutable;
import o.Util3;
import o.accessgetInstancedelegatecp;
import o.accessgetReusableRectp;
import o.configConnectionForGET;
import o.createFromParcel;
import o.extractTargetUrl;
import o.generatePOSTBodyString;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPersonNamePrefix;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getQueryContext;
import o.getStyleTiuSbCo;
import o.hideCurrentlyDisplayingInAppMessage;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AcceptButtonComposableKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162  */
    /* JADX WARN: Code duplicated, block: B:77:0x0170  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x018b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    public static final void AvailableAcceptButton(HyphensSaverlambda0 hyphensSaverlambda0, final DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean z3;
        Object objComponentActivity;
        final int i3;
        final int i4;
        Object objComponentActivity2;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1692892840);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(hyphensSaverlambda0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = IconCompatParcelizer + 25;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.read(deliveryAcceptButtonUiModelImpl) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i8 = i2;
        if (getpostalcode.write(i8 & 1, (i8 & 147) != 146)) {
            int i9 = IconCompatParcelizer;
            int i10 = i9 + 95;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            int i12 = i8 & 112;
            if (i12 == 32) {
                int i13 = i9 + 101;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
            if (z || objComponentActivity3 == androidContentCaptureManager3) {
                MapboxNavigation.AnonymousClass15 anonymousClass15 = new MapboxNavigation.AnonymousClass15(0, deliveryAcceptButtonUiModelImpl, DeliveryAcceptButtonUiModelImpl.class, "onAcceptButtonClick", "onAcceptButtonClick()V", 0, 13);
                getpostalcode.write(anonymousClass15);
                objComponentActivity3 = anonymousClass15;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
            boolean z4 = i12 == 32;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z4 || objComponentActivity4 == androidContentCaptureManager3) {
                MapboxNavigation.AnonymousClass15 anonymousClass16 = new MapboxNavigation.AnonymousClass15(0, deliveryAcceptButtonUiModelImpl, DeliveryAcceptButtonUiModelImpl.class, "onAcceptButtonClick", "onAcceptButtonClick()V", 0, 14);
                getpostalcode.write(anonymousClass16);
                objComponentActivity4 = anonymousClass16;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
            if (r7 == 32) {
                int i14 = serializer + 121;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (z2) {
                androidContentCaptureManager = r6;
            } else {
                int i15 = IconCompatParcelizer + 103;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                androidContentCaptureManager = androidContentCaptureManager3;
                if (objComponentActivity5 != androidContentCaptureManager) {
                    androidContentCaptureManager2 = androidContentCaptureManager;
                }
                read(hyphensSaverlambda0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5), modifier, getpostalcode, (i8 & 14) | (57344 & (i8 << 6)));
                if (r7 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                i3 = 1;
                if ((!z3) || objComponentActivity == androidContentCaptureManager2) {
                    i4 = 0;
                    objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                        private static int read = 1;
                        private static int write;

                        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                        /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                        /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                        /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                        /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            Object obj2;
                            String strConcat;
                            int i17 = 2 % 2;
                            Object obj3 = null;
                            if (i4 == 0) {
                                ((getPersonNamePrefix) obj).getClass();
                                DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                                boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                                if (!zBooleanValue) {
                                    long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                    if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                    } else {
                                        int i18 = read + 125;
                                        write = i18 % Fields.SpotShadowColor;
                                        int i19 = i18 % 2;
                                    }
                                }
                                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                            }
                            ((getStyleTiuSbCo) obj).getClass();
                            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                            Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                            if (obj4 instanceof HyphensSaverlambda0) {
                                ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                                Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                                while (it.hasNext()) {
                                    int i20 = write + 109;
                                    read = i20 % Fields.SpotShadowColor;
                                    if (i20 % 2 == 0) {
                                        TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                        boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                        trackingEvent.getClass();
                                        Map map = trackingEvent.parameters;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                    boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    trackingEventIconCompatParcelizer.getClass();
                                    Map map2 = trackingEventIconCompatParcelizer.parameters;
                                    if (map2 != null) {
                                        int i21 = read + 25;
                                        write = i21 % Fields.SpotShadowColor;
                                        if (i21 % 2 != 0) {
                                            if (!map2.containsKey("screenName")) {
                                                obj2 = map2.get("screenName");
                                                if (obj2 instanceof String) {
                                                    int i22 = read + 115;
                                                    int i23 = i22 % Fields.SpotShadowColor;
                                                    write = i23;
                                                    int i24 = i22 % 2;
                                                    strConcat = (String) obj2;
                                                    int i25 = i23 + 69;
                                                    read = i25 % Fields.SpotShadowColor;
                                                    int i26 = i25 % 2;
                                                } else {
                                                    strConcat = null;
                                                }
                                                if (strConcat != null) {
                                                    if (!z6) {
                                                        int i27 = write + 101;
                                                        read = i27 % Fields.SpotShadowColor;
                                                        int i28 = i27 % 2;
                                                        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                            strConcat = strConcat.concat(" Accept Overlay");
                                                        }
                                                    } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                        strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                    }
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                                                    linkedHashMap.put("screenName", strConcat);
                                                    trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap, 3);
                                                }
                                            }
                                        } else if (map2.containsKey("screenName")) {
                                            obj2 = map2.get("screenName");
                                            if (obj2 instanceof String) {
                                                int i29 = read + 115;
                                                int i210 = i29 % Fields.SpotShadowColor;
                                                write = i210;
                                                int i211 = i29 % 2;
                                                strConcat = (String) obj2;
                                                int i212 = i210 + 69;
                                                read = i212 % Fields.SpotShadowColor;
                                                int i213 = i212 % 2;
                                            } else {
                                                strConcat = null;
                                            }
                                            if (strConcat != null) {
                                                if (!z6) {
                                                    int i214 = write + 101;
                                                    read = i214 % Fields.SpotShadowColor;
                                                    int i215 = i214 % 2;
                                                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                        strConcat = strConcat.concat(" Accept Overlay");
                                                    }
                                                } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                    strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                }
                                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                                linkedHashMap2.put("screenName", strConcat);
                                                trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap2, 3);
                                            }
                                        }
                                    }
                                    arrayList.add(trackingEventIconCompatParcelizer);
                                }
                                DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    int i30 = write + 113;
                                    read = i30 % Fields.SpotShadowColor;
                                    if (i30 % 2 == 0) {
                                        deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                }
                            }
                            return new TypefaceResultImmutable(1);
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                } else {
                    i4 = 0;
                }
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                getPhoneNumberNational.serializer(createfromparcel, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
                if (i12 == 32) {
                    i4 = 1;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (i4 == 0) {
                    int i17 = IconCompatParcelizer + 51;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager2) {
                        objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                            private static int read = 1;
                            private static int write;

                            /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                            /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                            /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                            /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                            /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                            /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                            /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                            /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                            /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                Object obj2;
                                String strConcat;
                                int i19 = 2 % 2;
                                Object obj3 = null;
                                if (i3 == 0) {
                                    ((getPersonNamePrefix) obj).getClass();
                                    DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                                    boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                                    if (!zBooleanValue) {
                                        long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                        if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                        } else {
                                            int i110 = read + 125;
                                            write = i110 % Fields.SpotShadowColor;
                                            int i111 = i110 % 2;
                                        }
                                    }
                                    return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                                }
                                ((getStyleTiuSbCo) obj).getClass();
                                DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                                Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                                if (obj4 instanceof HyphensSaverlambda0) {
                                    ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                                    Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                                    while (it.hasNext()) {
                                        int i20 = write + 109;
                                        read = i20 % Fields.SpotShadowColor;
                                        if (i20 % 2 == 0) {
                                            TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                            boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                            trackingEvent.getClass();
                                            Map map = trackingEvent.parameters;
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                        boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                        trackingEventIconCompatParcelizer.getClass();
                                        Map map2 = trackingEventIconCompatParcelizer.parameters;
                                        if (map2 != null) {
                                            int i21 = read + 25;
                                            write = i21 % Fields.SpotShadowColor;
                                            if (i21 % 2 != 0) {
                                                if (!map2.containsKey("screenName")) {
                                                    obj2 = map2.get("screenName");
                                                    if (obj2 instanceof String) {
                                                        int i29 = read + 115;
                                                        int i210 = i29 % Fields.SpotShadowColor;
                                                        write = i210;
                                                        int i211 = i29 % 2;
                                                        strConcat = (String) obj2;
                                                        int i212 = i210 + 69;
                                                        read = i212 % Fields.SpotShadowColor;
                                                        int i213 = i212 % 2;
                                                    } else {
                                                        strConcat = null;
                                                    }
                                                    if (strConcat != null) {
                                                        if (!z6) {
                                                            int i214 = write + 101;
                                                            read = i214 % Fields.SpotShadowColor;
                                                            int i215 = i214 % 2;
                                                            if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                                strConcat = strConcat.concat(" Accept Overlay");
                                                            }
                                                        } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                            strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                        }
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                                                        linkedHashMap2.put("screenName", strConcat);
                                                        trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap2, 3);
                                                    }
                                                }
                                            } else if (map2.containsKey("screenName")) {
                                                obj2 = map2.get("screenName");
                                                if (obj2 instanceof String) {
                                                    int i216 = read + 115;
                                                    int i217 = i216 % Fields.SpotShadowColor;
                                                    write = i217;
                                                    int i218 = i216 % 2;
                                                    strConcat = (String) obj2;
                                                    int i219 = i217 + 69;
                                                    read = i219 % Fields.SpotShadowColor;
                                                    int i2110 = i219 % 2;
                                                } else {
                                                    strConcat = null;
                                                }
                                                if (strConcat != null) {
                                                    if (!z6) {
                                                        int i2111 = write + 101;
                                                        read = i2111 % Fields.SpotShadowColor;
                                                        int i2112 = i2111 % 2;
                                                        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                            strConcat = strConcat.concat(" Accept Overlay");
                                                        }
                                                    } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                        strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                    }
                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(map2);
                                                    linkedHashMap3.put("screenName", strConcat);
                                                    trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap3, 3);
                                                }
                                            }
                                        }
                                        arrayList.add(trackingEventIconCompatParcelizer);
                                    }
                                    DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        int i30 = write + 113;
                                        read = i30 % Fields.SpotShadowColor;
                                        if (i30 % 2 == 0) {
                                            deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                            obj3.hashCode();
                                            throw null;
                                        }
                                        deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                    }
                                }
                                return new TypefaceResultImmutable(1);
                            }
                        };
                        getpostalcode.write(objComponentActivity2);
                    }
                } else {
                    objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                        private static int read = 1;
                        private static int write;

                        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                        /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                        /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                        /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                        /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            Object obj2;
                            String strConcat;
                            int i19 = 2 % 2;
                            Object obj3 = null;
                            if (i3 == 0) {
                                ((getPersonNamePrefix) obj).getClass();
                                DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                                boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                                if (!zBooleanValue) {
                                    long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                    if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                    } else {
                                        int i110 = read + 125;
                                        write = i110 % Fields.SpotShadowColor;
                                        int i111 = i110 % 2;
                                    }
                                }
                                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                            }
                            ((getStyleTiuSbCo) obj).getClass();
                            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                            Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                            if (obj4 instanceof HyphensSaverlambda0) {
                                ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                                Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                                while (it.hasNext()) {
                                    int i20 = write + 109;
                                    read = i20 % Fields.SpotShadowColor;
                                    if (i20 % 2 == 0) {
                                        TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                        boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                        trackingEvent.getClass();
                                        Map map = trackingEvent.parameters;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                    boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    trackingEventIconCompatParcelizer.getClass();
                                    Map map2 = trackingEventIconCompatParcelizer.parameters;
                                    if (map2 != null) {
                                        int i21 = read + 25;
                                        write = i21 % Fields.SpotShadowColor;
                                        if (i21 % 2 != 0) {
                                            if (!map2.containsKey("screenName")) {
                                                obj2 = map2.get("screenName");
                                                if (obj2 instanceof String) {
                                                    int i216 = read + 115;
                                                    int i217 = i216 % Fields.SpotShadowColor;
                                                    write = i217;
                                                    int i218 = i216 % 2;
                                                    strConcat = (String) obj2;
                                                    int i219 = i217 + 69;
                                                    read = i219 % Fields.SpotShadowColor;
                                                    int i2110 = i219 % 2;
                                                } else {
                                                    strConcat = null;
                                                }
                                                if (strConcat != null) {
                                                    if (!z6) {
                                                        int i2111 = write + 101;
                                                        read = i2111 % Fields.SpotShadowColor;
                                                        int i2112 = i2111 % 2;
                                                        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                            strConcat = strConcat.concat(" Accept Overlay");
                                                        }
                                                    } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                        strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                    }
                                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(map2);
                                                    linkedHashMap3.put("screenName", strConcat);
                                                    trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap3, 3);
                                                }
                                            }
                                        } else if (map2.containsKey("screenName")) {
                                            obj2 = map2.get("screenName");
                                            if (obj2 instanceof String) {
                                                int i2113 = read + 115;
                                                int i2114 = i2113 % Fields.SpotShadowColor;
                                                write = i2114;
                                                int i2115 = i2113 % 2;
                                                strConcat = (String) obj2;
                                                int i2116 = i2114 + 69;
                                                read = i2116 % Fields.SpotShadowColor;
                                                int i2117 = i2116 % 2;
                                            } else {
                                                strConcat = null;
                                            }
                                            if (strConcat != null) {
                                                if (!z6) {
                                                    int i2118 = write + 101;
                                                    read = i2118 % Fields.SpotShadowColor;
                                                    int i2119 = i2118 % 2;
                                                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                        strConcat = strConcat.concat(" Accept Overlay");
                                                    }
                                                } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                    strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                }
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap(map2);
                                                linkedHashMap4.put("screenName", strConcat);
                                                trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap4, 3);
                                            }
                                        }
                                    }
                                    arrayList.add(trackingEventIconCompatParcelizer);
                                }
                                DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    int i30 = write + 113;
                                    read = i30 % Fields.SpotShadowColor;
                                    if (i30 % 2 == 0) {
                                        deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                }
                            }
                            return new TypefaceResultImmutable(1);
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
                RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
            }
            androidContentCaptureManager2 = androidContentCaptureManager;
            objComponentActivity5 = new MapboxNavigation.AnonymousClass15(0, deliveryAcceptButtonUiModelImpl, DeliveryAcceptButtonUiModelImpl.class, "onSwipeFailed", "onSwipeFailed()V", 0, 15);
            getpostalcode.write(objComponentActivity5);
            read(hyphensSaverlambda0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5), modifier, getpostalcode, (i8 & 14) | (57344 & (i8 << 6)));
            if (r7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            i3 = 1;
            if (!z3) {
                i4 = 0;
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                    private static int read = 1;
                    private static int write;

                    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        Object obj2;
                        String strConcat;
                        int i19 = 2 % 2;
                        Object obj3 = null;
                        if (i4 == 0) {
                            ((getPersonNamePrefix) obj).getClass();
                            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                            boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                            if (!zBooleanValue) {
                                long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                } else {
                                    int i110 = read + 125;
                                    write = i110 % Fields.SpotShadowColor;
                                    int i111 = i110 % 2;
                                }
                            }
                            return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                        }
                        ((getStyleTiuSbCo) obj).getClass();
                        DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                        Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                        if (obj4 instanceof HyphensSaverlambda0) {
                            ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                            Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                            while (it.hasNext()) {
                                int i20 = write + 109;
                                read = i20 % Fields.SpotShadowColor;
                                if (i20 % 2 == 0) {
                                    TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                    boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    trackingEvent.getClass();
                                    Map map = trackingEvent.parameters;
                                    obj3.hashCode();
                                    throw null;
                                }
                                TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                trackingEventIconCompatParcelizer.getClass();
                                Map map2 = trackingEventIconCompatParcelizer.parameters;
                                if (map2 != null) {
                                    int i21 = read + 25;
                                    write = i21 % Fields.SpotShadowColor;
                                    if (i21 % 2 != 0) {
                                        if (!map2.containsKey("screenName")) {
                                            obj2 = map2.get("screenName");
                                            if (obj2 instanceof String) {
                                                int i2113 = read + 115;
                                                int i2114 = i2113 % Fields.SpotShadowColor;
                                                write = i2114;
                                                int i2115 = i2113 % 2;
                                                strConcat = (String) obj2;
                                                int i2116 = i2114 + 69;
                                                read = i2116 % Fields.SpotShadowColor;
                                                int i2117 = i2116 % 2;
                                            } else {
                                                strConcat = null;
                                            }
                                            if (strConcat != null) {
                                                if (!z6) {
                                                    int i2118 = write + 101;
                                                    read = i2118 % Fields.SpotShadowColor;
                                                    int i2119 = i2118 % 2;
                                                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                        strConcat = strConcat.concat(" Accept Overlay");
                                                    }
                                                } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                    strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                }
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap(map2);
                                                linkedHashMap4.put("screenName", strConcat);
                                                trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap4, 3);
                                            }
                                        }
                                    } else if (map2.containsKey("screenName")) {
                                        obj2 = map2.get("screenName");
                                        if (obj2 instanceof String) {
                                            int i21110 = read + 115;
                                            int i21111 = i21110 % Fields.SpotShadowColor;
                                            write = i21111;
                                            int i21112 = i21110 % 2;
                                            strConcat = (String) obj2;
                                            int i21113 = i21111 + 69;
                                            read = i21113 % Fields.SpotShadowColor;
                                            int i21114 = i21113 % 2;
                                        } else {
                                            strConcat = null;
                                        }
                                        if (strConcat != null) {
                                            if (!z6) {
                                                int i21115 = write + 101;
                                                read = i21115 % Fields.SpotShadowColor;
                                                int i21116 = i21115 % 2;
                                                if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                    strConcat = strConcat.concat(" Accept Overlay");
                                                }
                                            } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                            }
                                            LinkedHashMap linkedHashMap5 = new LinkedHashMap(map2);
                                            linkedHashMap5.put("screenName", strConcat);
                                            trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap5, 3);
                                        }
                                    }
                                }
                                arrayList.add(trackingEventIconCompatParcelizer);
                            }
                            DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int i30 = write + 113;
                                read = i30 % Fields.SpotShadowColor;
                                if (i30 % 2 == 0) {
                                    deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                    obj3.hashCode();
                                    throw null;
                                }
                                deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                            }
                        }
                        return new TypefaceResultImmutable(1);
                    }
                };
                getpostalcode.write(objComponentActivity);
            } else {
                i4 = 0;
                objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                    private static int read = 1;
                    private static int write;

                    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        Object obj2;
                        String strConcat;
                        int i19 = 2 % 2;
                        Object obj3 = null;
                        if (i4 == 0) {
                            ((getPersonNamePrefix) obj).getClass();
                            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                            boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                            if (!zBooleanValue) {
                                long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                } else {
                                    int i110 = read + 125;
                                    write = i110 % Fields.SpotShadowColor;
                                    int i111 = i110 % 2;
                                }
                            }
                            return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                        }
                        ((getStyleTiuSbCo) obj).getClass();
                        DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                        Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                        if (obj4 instanceof HyphensSaverlambda0) {
                            ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                            Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                            while (it.hasNext()) {
                                int i20 = write + 109;
                                read = i20 % Fields.SpotShadowColor;
                                if (i20 % 2 == 0) {
                                    TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                    boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    trackingEvent.getClass();
                                    Map map = trackingEvent.parameters;
                                    obj3.hashCode();
                                    throw null;
                                }
                                TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                trackingEventIconCompatParcelizer.getClass();
                                Map map2 = trackingEventIconCompatParcelizer.parameters;
                                if (map2 != null) {
                                    int i21 = read + 25;
                                    write = i21 % Fields.SpotShadowColor;
                                    if (i21 % 2 != 0) {
                                        if (!map2.containsKey("screenName")) {
                                            obj2 = map2.get("screenName");
                                            if (obj2 instanceof String) {
                                                int i21110 = read + 115;
                                                int i21111 = i21110 % Fields.SpotShadowColor;
                                                write = i21111;
                                                int i21112 = i21110 % 2;
                                                strConcat = (String) obj2;
                                                int i21113 = i21111 + 69;
                                                read = i21113 % Fields.SpotShadowColor;
                                                int i21114 = i21113 % 2;
                                            } else {
                                                strConcat = null;
                                            }
                                            if (strConcat != null) {
                                                if (!z6) {
                                                    int i21115 = write + 101;
                                                    read = i21115 % Fields.SpotShadowColor;
                                                    int i21116 = i21115 % 2;
                                                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                        strConcat = strConcat.concat(" Accept Overlay");
                                                    }
                                                } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                    strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                }
                                                LinkedHashMap linkedHashMap5 = new LinkedHashMap(map2);
                                                linkedHashMap5.put("screenName", strConcat);
                                                trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap5, 3);
                                            }
                                        }
                                    } else if (map2.containsKey("screenName")) {
                                        obj2 = map2.get("screenName");
                                        if (obj2 instanceof String) {
                                            int i21117 = read + 115;
                                            int i21118 = i21117 % Fields.SpotShadowColor;
                                            write = i21118;
                                            int i21119 = i21117 % 2;
                                            strConcat = (String) obj2;
                                            int i211110 = i21118 + 69;
                                            read = i211110 % Fields.SpotShadowColor;
                                            int i211111 = i211110 % 2;
                                        } else {
                                            strConcat = null;
                                        }
                                        if (strConcat != null) {
                                            if (!z6) {
                                                int i211112 = write + 101;
                                                read = i211112 % Fields.SpotShadowColor;
                                                int i211113 = i211112 % 2;
                                                if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                    strConcat = strConcat.concat(" Accept Overlay");
                                                }
                                            } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                            }
                                            LinkedHashMap linkedHashMap6 = new LinkedHashMap(map2);
                                            linkedHashMap6.put("screenName", strConcat);
                                            trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap6, 3);
                                        }
                                    }
                                }
                                arrayList.add(trackingEventIconCompatParcelizer);
                            }
                            DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int i30 = write + 113;
                                read = i30 % Fields.SpotShadowColor;
                                if (i30 % 2 == 0) {
                                    deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                    obj3.hashCode();
                                    throw null;
                                }
                                deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                            }
                        }
                        return new TypefaceResultImmutable(1);
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getPhoneNumberNational.serializer(createfromparcel2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            if (i12 == 32) {
                i4 = 1;
            }
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (i4 == 0) {
                int i19 = IconCompatParcelizer + 51;
                serializer = i19 % Fields.SpotShadowColor;
                int i110 = i19 % 2;
                if (objComponentActivity2 == androidContentCaptureManager2) {
                    objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                        private static int read = 1;
                        private static int write;

                        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                        /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                        /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                        /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                        /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                        /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                        /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                        /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                        /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            Object obj2;
                            String strConcat;
                            int i111 = 2 % 2;
                            Object obj3 = null;
                            if (i3 == 0) {
                                ((getPersonNamePrefix) obj).getClass();
                                DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                                boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                                getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                                if (!zBooleanValue) {
                                    long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                    if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                    } else {
                                        int i112 = read + 125;
                                        write = i112 % Fields.SpotShadowColor;
                                        int i113 = i112 % 2;
                                    }
                                }
                                return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                            }
                            ((getStyleTiuSbCo) obj).getClass();
                            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                            Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                            if (obj4 instanceof HyphensSaverlambda0) {
                                ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                                Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                                while (it.hasNext()) {
                                    int i20 = write + 109;
                                    read = i20 % Fields.SpotShadowColor;
                                    if (i20 % 2 == 0) {
                                        TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                        boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                        trackingEvent.getClass();
                                        Map map = trackingEvent.parameters;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                    boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    trackingEventIconCompatParcelizer.getClass();
                                    Map map2 = trackingEventIconCompatParcelizer.parameters;
                                    if (map2 != null) {
                                        int i21 = read + 25;
                                        write = i21 % Fields.SpotShadowColor;
                                        if (i21 % 2 != 0) {
                                            if (!map2.containsKey("screenName")) {
                                                obj2 = map2.get("screenName");
                                                if (obj2 instanceof String) {
                                                    int i21117 = read + 115;
                                                    int i21118 = i21117 % Fields.SpotShadowColor;
                                                    write = i21118;
                                                    int i21119 = i21117 % 2;
                                                    strConcat = (String) obj2;
                                                    int i211110 = i21118 + 69;
                                                    read = i211110 % Fields.SpotShadowColor;
                                                    int i211111 = i211110 % 2;
                                                } else {
                                                    strConcat = null;
                                                }
                                                if (strConcat != null) {
                                                    if (!z6) {
                                                        int i211112 = write + 101;
                                                        read = i211112 % Fields.SpotShadowColor;
                                                        int i211113 = i211112 % 2;
                                                        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                            strConcat = strConcat.concat(" Accept Overlay");
                                                        }
                                                    } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                        strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                    }
                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(map2);
                                                    linkedHashMap6.put("screenName", strConcat);
                                                    trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap6, 3);
                                                }
                                            }
                                        } else if (map2.containsKey("screenName")) {
                                            obj2 = map2.get("screenName");
                                            if (obj2 instanceof String) {
                                                int i211114 = read + 115;
                                                int i211115 = i211114 % Fields.SpotShadowColor;
                                                write = i211115;
                                                int i211116 = i211114 % 2;
                                                strConcat = (String) obj2;
                                                int i211117 = i211115 + 69;
                                                read = i211117 % Fields.SpotShadowColor;
                                                int i211118 = i211117 % 2;
                                            } else {
                                                strConcat = null;
                                            }
                                            if (strConcat != null) {
                                                if (!z6) {
                                                    int i211119 = write + 101;
                                                    read = i211119 % Fields.SpotShadowColor;
                                                    int i2111110 = i211119 % 2;
                                                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                        strConcat = strConcat.concat(" Accept Overlay");
                                                    }
                                                } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                    strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                }
                                                LinkedHashMap linkedHashMap7 = new LinkedHashMap(map2);
                                                linkedHashMap7.put("screenName", strConcat);
                                                trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap7, 3);
                                            }
                                        }
                                    }
                                    arrayList.add(trackingEventIconCompatParcelizer);
                                }
                                DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    int i30 = write + 113;
                                    read = i30 % Fields.SpotShadowColor;
                                    if (i30 % 2 == 0) {
                                        deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                        obj3.hashCode();
                                        throw null;
                                    }
                                    deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                }
                            }
                            return new TypefaceResultImmutable(1);
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.roadrunner.delivery.accept.acceptbutton.presentation.AcceptButtonComposableKt$$ExternalSyntheticLambda4
                    private static int read = 1;
                    private static int write;

                    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
                    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
                    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
                    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
                    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
                    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
                    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
                    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
                    /* JADX WARN: Code duplicated, block: B:65:0x00c3 A[SYNTHETIC] */
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        Object obj2;
                        String strConcat;
                        int i111 = 2 % 2;
                        Object obj3 = null;
                        if (i3 == 0) {
                            ((getPersonNamePrefix) obj).getClass();
                            DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl2 = deliveryAcceptButtonUiModelImpl;
                            boolean zBooleanValue = ((Boolean) deliveryAcceptButtonUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.read.read()).booleanValue();
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout = deliveryAcceptButtonUiModelImpl2.RatingCompat;
                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new TextFieldSelectionManager$copy$1(deliveryAcceptButtonUiModelImpl2, zBooleanValue, (ShortNewsContentCardView) null, 1), 3);
                            if (!zBooleanValue) {
                                long epochMilli = Instant.now(deliveryAcceptButtonUiModelImpl2.MediaSessionCompatQueueItem).toEpochMilli();
                                if (((FirebaseRemoteConfigImpl) deliveryAcceptButtonUiModelImpl2.PlaybackStateCompatCustomAction).ParcelableVolumeInfo()) {
                                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new NafathModalUiModelImpl$1.AnonymousClass2(deliveryAcceptButtonUiModelImpl2, epochMilli, null, 5), 2);
                                } else {
                                    int i112 = read + 125;
                                    write = i112 % Fields.SpotShadowColor;
                                    int i113 = i112 % 2;
                                }
                            }
                            return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(11, deliveryAcceptButtonUiModelImpl2);
                        }
                        ((getStyleTiuSbCo) obj).getClass();
                        DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl3 = deliveryAcceptButtonUiModelImpl;
                        Object obj4 = (FontWeightSaverlambda0) deliveryAcceptButtonUiModelImpl3.RemoteActionCompatParcelizer.read();
                        if (obj4 instanceof HyphensSaverlambda0) {
                            ArrayList arrayListRemoteActionCompatParcelizer = TrackingEventExtensionsKt.RemoteActionCompatParcelizer(((HyphensSaverlambda0) obj4).read());
                            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
                            Iterator it = arrayListRemoteActionCompatParcelizer.iterator();
                            while (it.hasNext()) {
                                int i20 = write + 109;
                                read = i20 % Fields.SpotShadowColor;
                                if (i20 % 2 == 0) {
                                    TrackingEvent trackingEvent = (TrackingEvent) it.next();
                                    boolean z5 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                    trackingEvent.getClass();
                                    Map map = trackingEvent.parameters;
                                    obj3.hashCode();
                                    throw null;
                                }
                                TrackingEvent trackingEventIconCompatParcelizer = (TrackingEvent) it.next();
                                boolean z6 = deliveryAcceptButtonUiModelImpl3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                                trackingEventIconCompatParcelizer.getClass();
                                Map map2 = trackingEventIconCompatParcelizer.parameters;
                                if (map2 != null) {
                                    int i21 = read + 25;
                                    write = i21 % Fields.SpotShadowColor;
                                    if (i21 % 2 != 0) {
                                        if (!map2.containsKey("screenName")) {
                                            obj2 = map2.get("screenName");
                                            if (obj2 instanceof String) {
                                                int i211114 = read + 115;
                                                int i211115 = i211114 % Fields.SpotShadowColor;
                                                write = i211115;
                                                int i211116 = i211114 % 2;
                                                strConcat = (String) obj2;
                                                int i211117 = i211115 + 69;
                                                read = i211117 % Fields.SpotShadowColor;
                                                int i211118 = i211117 % 2;
                                            } else {
                                                strConcat = null;
                                            }
                                            if (strConcat != null) {
                                                if (!z6) {
                                                    int i211119 = write + 101;
                                                    read = i211119 % Fields.SpotShadowColor;
                                                    int i2111110 = i211119 % 2;
                                                    if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                        strConcat = strConcat.concat(" Accept Overlay");
                                                    }
                                                } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                    strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                                }
                                                LinkedHashMap linkedHashMap7 = new LinkedHashMap(map2);
                                                linkedHashMap7.put("screenName", strConcat);
                                                trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap7, 3);
                                            }
                                        }
                                    } else if (map2.containsKey("screenName")) {
                                        obj2 = map2.get("screenName");
                                        if (obj2 instanceof String) {
                                            int i2111111 = read + 115;
                                            int i2111112 = i2111111 % Fields.SpotShadowColor;
                                            write = i2111112;
                                            int i2111113 = i2111111 % 2;
                                            strConcat = (String) obj2;
                                            int i2111114 = i2111112 + 69;
                                            read = i2111114 % Fields.SpotShadowColor;
                                            int i2111115 = i2111114 % 2;
                                        } else {
                                            strConcat = null;
                                        }
                                        if (strConcat != null) {
                                            if (!z6) {
                                                int i2111116 = write + 101;
                                                read = i2111116 % Fields.SpotShadowColor;
                                                int i2111117 = i2111116 % 2;
                                                if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) strConcat, (CharSequence) " Accept Overlay", false)) {
                                                    strConcat = strConcat.concat(" Accept Overlay");
                                                }
                                            } else if (setCarryoverInAppMessage.read(strConcat, " Accept Overlay", false)) {
                                                strConcat = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(strConcat, " Accept Overlay");
                                            }
                                            LinkedHashMap linkedHashMap8 = new LinkedHashMap(map2);
                                            linkedHashMap8.put("screenName", strConcat);
                                            trackingEventIconCompatParcelizer = TrackingEvent.IconCompatParcelizer(trackingEventIconCompatParcelizer, null, linkedHashMap8, 3);
                                        }
                                    }
                                }
                                arrayList.add(trackingEventIconCompatParcelizer);
                            }
                            DeliveryAcceptanceLogger deliveryAcceptanceLogger = deliveryAcceptButtonUiModelImpl3.MediaBrowserCompatMediaItem;
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                int i30 = write + 113;
                                read = i30 % Fields.SpotShadowColor;
                                if (i30 % 2 == 0) {
                                    deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                                    obj3.hashCode();
                                    throw null;
                                }
                                deliveryAcceptanceLogger.write((TrackingEvent) it2.next());
                            }
                        }
                        return new TypefaceResultImmutable(1);
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            RangesKt.read(980236944, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{createfromparcel2, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6}, BackspaceCommand.write(), -980236935, BackspaceCommand.write());
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 16, modifier, (Object) hyphensSaverlambda0, (Object) deliveryAcceptButtonUiModelImpl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x019c  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c6  */
    public static final void read(HyphensSaverlambda0 hyphensSaverlambda0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object objComponentActivity;
        int i3;
        int i4 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1606366253);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(hyphensSaverlambda0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = serializer + 39;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i7 = IconCompatParcelizer + 33;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ^ true ? 8192 : Fields.Clip;
            int i9 = IconCompatParcelizer + 63;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 9363) != 9362)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i11 = IconCompatParcelizer + 91;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                int i12 = 1 / 0;
                if (hyphensSaverlambda0 instanceof FontWeightSaverlambda1) {
                    getpostalcode.serializer(731718370);
                    FontWeightSaverlambda1 fontWeightSaverlambda1 = (FontWeightSaverlambda1) hyphensSaverlambda0;
                    String str = fontWeightSaverlambda1.write;
                    boolean z = fontWeightSaverlambda1.RemoteActionCompatParcelizer;
                    boolean z2 = fontWeightSaverlambda1.IconCompatParcelizer;
                    Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
                    float f = Dimensions.setTabContainer;
                    Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, f, f);
                    modifierRemoteActionCompatParcelizer.getClass();
                    PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierRemoteActionCompatParcelizer, z, z2, null, null, null, null, null, getpostalcode, i2 & 112, 0, 2016);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (hyphensSaverlambda0 instanceof FontSynthesisSaverlambda1) {
                    getpostalcode.serializer(732245091);
                    FontSynthesisSaverlambda1 fontSynthesisSaverlambda1 = (FontSynthesisSaverlambda1) hyphensSaverlambda0;
                    HyphensSaverlambda1 hyphensSaverlambda1 = fontSynthesisSaverlambda1.read;
                    String str2 = fontSynthesisSaverlambda1.IconCompatParcelizer;
                    extractTargetUrl extracttargeturl = new extractTargetUrl(String.valueOf(hyphensSaverlambda1.read), 1.0f - hyphensSaverlambda1.RemoteActionCompatParcelizer);
                    boolean z3 = fontSynthesisSaverlambda1.write;
                    boolean z4 = fontSynthesisSaverlambda1.RemoteActionCompatParcelizer;
                    Modifier modifierWrite2 = SizeKt.write(modifier, 1.0f);
                    float f2 = Dimensions.setTabContainer;
                    Modifier modifierRemoteActionCompatParcelizer2 = PaddingKt.RemoteActionCompatParcelizer(modifierWrite2, f2, f2);
                    modifierRemoteActionCompatParcelizer2.getClass();
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode.write(objComponentActivity);
                    }
                    PrimaryKt.ButtonPrimaryBigWithCountDown(str2, extracttargeturl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierRemoteActionCompatParcelizer2, z4, z3, null, getpostalcode, ((i2 << 3) & 896) | 3072);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (hyphensSaverlambda0 instanceof LineHeightStyleAlignmentSaverlambda1) {
                    getpostalcode.serializer(733012930);
                    LineHeightStyleAlignmentSaverlambda1 lineHeightStyleAlignmentSaverlambda1 = (LineHeightStyleAlignmentSaverlambda1) hyphensSaverlambda0;
                    configConnectionForGET configconnectionforget = new configConnectionForGET(lineHeightStyleAlignmentSaverlambda1.IconCompatParcelizer, lineHeightStyleAlignmentSaverlambda1.write);
                    Modifier modifierWrite3 = SizeKt.write(Modifier.Companion, 1.0f);
                    float f3 = Dimensions.setTabContainer;
                    Modifier modifierRemoteActionCompatParcelizer3 = PaddingKt.RemoteActionCompatParcelizer(modifierWrite3, f3, f3);
                    modifierRemoteActionCompatParcelizer3.getClass();
                    Util3.serializer(configconnectionforget, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifierRemoteActionCompatParcelizer3, getpostalcode, (i2 >> 3) & 1008);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (hyphensSaverlambda0 instanceof LineHeightStyleModeSaverlambda1) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1824718218, false);
                    }
                    getpostalcode.serializer(1824779313);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else if (!(!(hyphensSaverlambda0 instanceof FontWeightSaverlambda1))) {
                getpostalcode.serializer(731718370);
                FontWeightSaverlambda1 fontWeightSaverlambda2 = (FontWeightSaverlambda1) hyphensSaverlambda0;
                String str3 = fontWeightSaverlambda2.write;
                boolean z5 = fontWeightSaverlambda2.RemoteActionCompatParcelizer;
                boolean z6 = fontWeightSaverlambda2.IconCompatParcelizer;
                Modifier modifierWrite4 = SizeKt.write(modifier, 1.0f);
                float f4 = Dimensions.setTabContainer;
                Modifier modifierRemoteActionCompatParcelizer4 = PaddingKt.RemoteActionCompatParcelizer(modifierWrite4, f4, f4);
                modifierRemoteActionCompatParcelizer4.getClass();
                PrimaryKt.write(str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierRemoteActionCompatParcelizer4, z5, z6, null, null, null, null, null, getpostalcode, i2 & 112, 0, 2016);
                getpostalcode.IconCompatParcelizer(false);
            } else if (hyphensSaverlambda0 instanceof FontSynthesisSaverlambda1) {
                getpostalcode.serializer(732245091);
                FontSynthesisSaverlambda1 fontSynthesisSaverlambda2 = (FontSynthesisSaverlambda1) hyphensSaverlambda0;
                HyphensSaverlambda1 hyphensSaverlambda2 = fontSynthesisSaverlambda2.read;
                String str4 = fontSynthesisSaverlambda2.IconCompatParcelizer;
                extractTargetUrl extracttargeturl2 = new extractTargetUrl(String.valueOf(hyphensSaverlambda2.read), 1.0f - hyphensSaverlambda2.RemoteActionCompatParcelizer);
                boolean z7 = fontSynthesisSaverlambda2.write;
                boolean z8 = fontSynthesisSaverlambda2.RemoteActionCompatParcelizer;
                Modifier modifierWrite5 = SizeKt.write(modifier, 1.0f);
                float f5 = Dimensions.setTabContainer;
                Modifier modifierRemoteActionCompatParcelizer5 = PaddingKt.RemoteActionCompatParcelizer(modifierWrite5, f5, f5);
                modifierRemoteActionCompatParcelizer5.getClass();
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode.write(objComponentActivity);
                }
                PrimaryKt.ButtonPrimaryBigWithCountDown(str4, extracttargeturl2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierRemoteActionCompatParcelizer5, z8, z7, null, getpostalcode, ((i2 << 3) & 896) | 3072);
                getpostalcode.IconCompatParcelizer(false);
            } else if (hyphensSaverlambda0 instanceof LineHeightStyleAlignmentSaverlambda1) {
                getpostalcode.serializer(733012930);
                LineHeightStyleAlignmentSaverlambda1 lineHeightStyleAlignmentSaverlambda2 = (LineHeightStyleAlignmentSaverlambda1) hyphensSaverlambda0;
                configConnectionForGET configconnectionforget2 = new configConnectionForGET(lineHeightStyleAlignmentSaverlambda2.IconCompatParcelizer, lineHeightStyleAlignmentSaverlambda2.write);
                Modifier modifierWrite6 = SizeKt.write(Modifier.Companion, 1.0f);
                float f6 = Dimensions.setTabContainer;
                Modifier modifierRemoteActionCompatParcelizer6 = PaddingKt.RemoteActionCompatParcelizer(modifierWrite6, f6, f6);
                modifierRemoteActionCompatParcelizer6.getClass();
                Util3.serializer(configconnectionforget2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifierRemoteActionCompatParcelizer6, getpostalcode, (i2 >> 3) & 1008);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (hyphensSaverlambda0 instanceof LineHeightStyleModeSaverlambda1) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1824718218, false);
                }
                getpostalcode.serializer(1824779313);
                getpostalcode.IconCompatParcelizer(false);
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) hyphensSaverlambda0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[PHI: r7 r8
  0x00ba: PHI (r7v21 androidx.compose.ui.Modifier$Companion) = (r7v20 androidx.compose.ui.Modifier$Companion), (r7v41 androidx.compose.ui.Modifier$Companion) binds: [B:46:0x00b8, B:43:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r8v9 o.getQueryContext) = (r8v8 o.getQueryContext), (r8v36 o.getQueryContext) binds: [B:46:0x00b8, B:43:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[PHI: r7 r8
  0x00bd: PHI (r7v39 androidx.compose.ui.Modifier$Companion) = (r7v20 androidx.compose.ui.Modifier$Companion), (r7v41 androidx.compose.ui.Modifier$Companion) binds: [B:46:0x00b8, B:43:0x00af] A[DONT_GENERATE, DONT_INLINE]
  0x00bd: PHI (r8v35 o.getQueryContext) = (r8v8 o.getQueryContext), (r8v36 o.getQueryContext) binds: [B:46:0x00b8, B:43:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r5v2, types: [o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r7v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v54 */
    public static final void write(DeliveryAcceptButtonUiModelImpl deliveryAcceptButtonUiModelImpl, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        getQueryContext getquerycontext;
        Modifier.Companion companion2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r7;
        int i3;
        int i4;
        int i5 = 2 % 2;
        deliveryAcceptButtonUiModelImpl.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        ?? r5 = (getPostalCode) getbirthdatefull;
        r5.MediaSessionCompatQueueItem(1501350341);
        if ((i & 6) == 0) {
            if (r5.read(deliveryAcceptButtonUiModelImpl)) {
                int i6 = serializer + 61;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            int i8 = IconCompatParcelizer + 65;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (r5.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i10 = IconCompatParcelizer + 29;
                serializer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 != 0 ? 89 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= r5.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= r5.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 2048 : Fields.RotationZ;
        }
        int i11 = i2 | 24576;
        if (r5.write(i11 & 1, (i11 & 9363) != 9362)) {
            int i12 = IconCompatParcelizer + 115;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                companion = Modifier.Companion;
                getquerycontext = deliveryAcceptButtonUiModelImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if ((i11 & 25736) == 23103) {
                    companion2 = companion;
                    z = true;
                } else {
                    companion2 = companion;
                    z = false;
                }
            } else {
                companion = Modifier.Companion;
                getquerycontext = deliveryAcceptButtonUiModelImpl.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                if ((i11 & 896) == 256) {
                    companion2 = companion;
                    z = true;
                } else {
                    companion2 = companion;
                    z = false;
                }
            }
            int i13 = i11 & 7168;
            boolean z4 = i13 == 2048;
            boolean z5 = (i11 & 112) == 32;
            Object objComponentActivity = r5.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z4 | z5) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new TextAlignSaverlambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                r5.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, r5, 8);
            LineHeightStyleTrimSaverlambda1 lineHeightStyleTrimSaverlambda1 = (LineHeightStyleTrimSaverlambda1) ExtrasKt.write(deliveryAcceptButtonUiModelImpl.MediaSessionCompatResultReceiverWrapper, (getBirthDateFull) r5, 0).getValue();
            if (lineHeightStyleTrimSaverlambda1 == null) {
                r5.serializer(-1060403754);
                r5.IconCompatParcelizer(false);
                androidContentCaptureManager = androidContentCaptureManager;
                r7 = 0;
                i11 = i11;
            } else {
                r5.serializer(-1060403753);
                if (!lineHeightStyleTrimSaverlambda1.write) {
                    r5.serializer(-16375992);
                    generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(lineHeightStyleTrimSaverlambda1.RemoteActionCompatParcelizer, false, lineHeightStyleTrimSaverlambda1.serializer, lineHeightStyleTrimSaverlambda1.read, null, null, 120, null);
                    Object objComponentActivity2 = r5.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new b8$$ExternalSyntheticLambda4(1);
                        r5.write(objComponentActivity2);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                    if ((i11 & 14) == 4) {
                        int i14 = serializer + 67;
                        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean zIconCompatParcelizer = r5.IconCompatParcelizer(lineHeightStyleTrimSaverlambda1);
                    Object objComponentActivity3 = r5.ComponentActivity();
                    if ((z3 | zIconCompatParcelizer) || objComponentActivity3 == androidContentCaptureManager) {
                        objComponentActivity3 = new BrazeUser$$ExternalSyntheticLambda28(deliveryAcceptButtonUiModelImpl, lineHeightStyleTrimSaverlambda1);
                        r5.write(objComponentActivity3);
                    }
                    MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, null, null, null, r5, 48, 476);
                    z2 = false;
                    r5.IconCompatParcelizer(false);
                } else {
                    z2 = false;
                    r5.serializer(-15982943);
                    r5.IconCompatParcelizer(false);
                }
                r5.IconCompatParcelizer(z2);
                r7 = z2;
            }
            ?? r12 = i13 == 2048 ? 1 : r7;
            Object objComponentActivity4 = r5.ComponentActivity();
            if ((r12 ^ 1) == 0 || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(4, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                r5.write(objComponentActivity4);
            }
            getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, r5);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(deliveryAcceptButtonUiModelImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs, (getBirthDateFull) r5, (int) r7);
            FontWeightSaverlambda0 fontWeightSaverlambda0 = (FontWeightSaverlambda0) populateViewStructure_androidKtpopulate7Write.getValue();
            if (fontWeightSaverlambda0 instanceof LineHeightStyleAlignmentSaverlambda0) {
                int i16 = IconCompatParcelizer + 57;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    r5.serializer(-311279703);
                    r5.IconCompatParcelizer(true);
                } else {
                    r5.serializer(-311279703);
                    r5.IconCompatParcelizer(r7);
                }
            } else if (fontWeightSaverlambda0 instanceof HyphensSaverlambda0) {
                r5.serializer(-1059681670);
                Object obj = (FontWeightSaverlambda0) populateViewStructure_androidKtpopulate7Write.getValue();
                obj.getClass();
                AvailableAcceptButton((HyphensSaverlambda0) obj, deliveryAcceptButtonUiModelImpl, companion2, r5, ((i11 << 3) & 112) | ((i11 >> 6) & 896));
                r5.IconCompatParcelizer(r7);
            } else {
                throw d$$ExternalSyntheticOutline0.m((getPostalCode) r5, -311281379, (boolean) r7);
            }
            modifier2 = companion2;
        } else {
            r5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r5.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) deliveryAcceptButtonUiModelImpl, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 7);
        }
    }
}
