package com.roadrunner.database.dao;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.fragment.app.FragmentActivity;
import coil3.compose.AsyncImagePainter$State$Success;
import coil3.network.NetworkFetcher;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.firebase.Timestamp;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firestore.v1.Value;
import com.huawei.agconnect.config.impl.m;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.legacy.core.usecases.PhoneNumberUseCase;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.presentation.PickUpDropOffDetailsUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.presentation.CardCashPaymentTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.sentiance.core.model.events.N$b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import o.AnchoredDraggableKtrestartable2;
import o.AndroidLayoutApi34;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AnimateXAsStateComposeAnimation;
import o.BrazeExternalSyntheticLambda45;
import o.ComposeViewAdapter;
import o.DragAndDropTargetModifierNode;
import o.EditingBufferCompanion;
import o.InfiniteTransitionSearchInfo;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorCompaniononCommitAffectingLayer1;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SpannableExtensions_androidKt;
import o.TextInputServiceAndroid_androidKt;
import o.TextInputServiceAndroidbaseInputConnection2;
import o.TextInputServiceAndroidstopInput1;
import o.TextUnitTypeCompanion;
import o.accesscontainsDescendant;
import o.accesscreatePlatformTextStyleInternal;
import o.accessgetBottomcp;
import o.addFeatureKeys;
import o.autoInvalidateRemovedNode;
import o.backwardFocusSearch;
import o.calculateNodeKindSetFrom;
import o.calculateOcclusions;
import o.childHitTestqzLsGqo;
import o.commitCompositionui_text;
import o.createFromParcel;
import o.createFromText;
import o.dashPathEffectdefault;
import o.executeAsList;
import o.filterTree;
import o.findGroupsThatMatchPredicatedefault;
import o.forName;
import o.getBringIntoViewOLwlOKw;
import o.getCieXyz;
import o.getCompositionLocalConsumerOLwlOKw;
import o.getDrawOLwlOKwannotations;
import o.getEnterjXw82LU;
import o.getGlobalPositionAwareOLwlOKwannotations;
import o.getLambda558638247ui_tooling;
import o.getMBufferStateui_text;
import o.getMaximumBitmapWidth;
import o.getPersonNamePrefix;
import o.getPlatformAndroidManager;
import o.getPositionannotations;
import o.getQueryContext;
import o.getRangeForRectlambda0;
import o.getRangeForRectui_text;
import o.getRootInfoui;
import o.getTopLeftnOccac;
import o.initlambda2020;
import o.initui_toolingdefault;
import o.isRtlCharAt;
import o.isUpdatingui;
import o.lambda_2086912010lambda0;
import o.metaWithLastChildOffset;
import o.onContentCardDismissed;
import o.onHideTranslationui;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindow;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.q4ExternalSyntheticLambda9;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.refreshFeatureFlagslambda10;
import o.registerOnRectChanged;
import o.removeNodeAtDepth;
import o.restoreToCount;
import o.safeSetClipToOutline;
import o.scheduleDebounceCallback;
import o.setCarryoverInAppMessage;
import o.setEnableExtraAssertions;
import o.setScreenOffsetgyyYBs;
import o.setSupportCompoundDrawablesTintList;
import o.shouldHitTestChildren;
import o.tailH91voCIui;
import o.tintxETnrds;
import o.toStringForLog;
import o.unwrapIfInline;
import o.updateTextLayoutResult;
import o.withRect;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SessionDao_Impl$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ SessionDao_Impl$$ExternalSyntheticLambda1(scheduleDebounceCallback scheduledebouncecallback, ProtobufEncoder protobufEncoder, Activity activity) {
        this.RemoteActionCompatParcelizer = 9;
        this.write = scheduledebouncecallback;
        this.IconCompatParcelizer = activity;
    }

    public /* synthetic */ SessionDao_Impl$$ExternalSyntheticLambda1(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
        this.IconCompatParcelizer = obj2;
    }

    public /* synthetic */ SessionDao_Impl$$ExternalSyntheticLambda1(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, CreateHomeScope createHomeScope, Context context) {
        this.RemoteActionCompatParcelizer = 21;
        this.write = createHomeScope;
        this.IconCompatParcelizer = context;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:119:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:121:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:132:0x046c  */
    /* JADX WARN: Code duplicated, block: B:134:0x049b  */
    /* JADX WARN: Code duplicated, block: B:136:0x04a3  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        getDrawOLwlOKwannotations getdrawolwlokwannotations;
        isUpdatingui isupdatingui;
        getDrawOLwlOKwannotations getdrawolwlokwannotations2;
        String str;
        String message;
        TextUnitTypeCompanion textUnitTypeCompanion;
        registerOnRectChanged registeronrectchanged;
        TextUnitTypeCompanion textUnitTypeCompanion2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu;
        Object obj2;
        String str2;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.write;
        int i4 = 3;
        int i5 = 1;
        Object stringExtra = null;
        String str3 = "";
        switch (i3) {
            case 0:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                return Long.valueOf(((accessgetBottomcp) obj4).serializer.write(tintxetnrds, obj3));
            case 1:
                PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = (PinnableContainerKtLocalPinnableContainer1) obj3;
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
                nodeCoordinatorCompanionPointerInputSource1.getClass();
                childHitTestqzLsGqo childhittestqzlsgqo = ((autoInvalidateRemovedNode) obj4).RemoteActionCompatParcelizer;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{childhittestqzlsgqo, childHitTestqzLsGqo.write}, getCieXyz.write())).booleanValue()) {
                    throw null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{childhittestqzlsgqo, childHitTestqzLsGqo.serializer}, getCieXyz.write())).booleanValue()) {
                    throw null;
                }
                int i6 = serializer + 55;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{childhittestqzlsgqo, childHitTestqzLsGqo.read}, getCieXyz.write())).booleanValue();
                    throw null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{childhittestqzlsgqo, childHitTestqzLsGqo.read}, getCieXyz.write())).booleanValue()) {
                    Timestamp timestamp = nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.read;
                    com.google.protobuf.Timestamp timestamp2 = NodeCoordinatorCompaniononCommitAffectingLayer1.read(timestamp.RemoteActionCompatParcelizer, timestamp.IconCompatParcelizer);
                    accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
                    accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
                    ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setTimestampValue(timestamp2);
                    return new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder.serializer());
                }
                Value valueWrite = nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo);
                if (valueWrite != null) {
                    if (shouldHitTestChildren.read(valueWrite)) {
                        setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = ((tailH91voCIui) pinnableContainerKtLocalPinnableContainer1.serializer).read;
                        if (setsupportcompounddrawablestintlist == null || (isupdatingui = (isUpdatingui) setsupportcompounddrawablestintlist.IconCompatParcelizer) == null) {
                            isupdatingui = isUpdatingui.NONE;
                        }
                        int i7 = calculateNodeKindSetFrom.RemoteActionCompatParcelizer[isupdatingui.ordinal()];
                        if (i7 != 1) {
                            int i8 = read + 33;
                            serializer = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 != 0 ? i7 == 2 : i7 == 2) {
                                getDrawOLwlOKwannotations getdrawolwlokwannotations3 = getBringIntoViewOLwlOKw.read;
                                com.google.protobuf.Timestamp timestampIconCompatParcelizer = shouldHitTestChildren.IconCompatParcelizer(valueWrite);
                                timestampIconCompatParcelizer.getClass();
                                NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
                                accesscontainsDescendant accesscontainsdescendantNewBuilder2 = Value.newBuilder();
                                accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer();
                                ((Value) accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer).setTimestampValue(timestampIconCompatParcelizer);
                                getdrawolwlokwannotations2 = new getDrawOLwlOKwannotations((Value) accesscontainsdescendantNewBuilder2.serializer());
                            } else {
                                if (i7 != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return null;
                                }
                                Value valueRemoteActionCompatParcelizer = shouldHitTestChildren.RemoteActionCompatParcelizer(valueWrite);
                                if (valueRemoteActionCompatParcelizer == null) {
                                    getdrawolwlokwannotations = getBringIntoViewOLwlOKw.IconCompatParcelizer;
                                } else {
                                    getdrawolwlokwannotations2 = new getDrawOLwlOKwannotations(valueRemoteActionCompatParcelizer);
                                }
                            }
                            getdrawolwlokwannotations = getdrawolwlokwannotations2;
                        } else {
                            getdrawolwlokwannotations = getBringIntoViewOLwlOKw.IconCompatParcelizer;
                        }
                    } else {
                        getdrawolwlokwannotations = new getDrawOLwlOKwannotations(valueWrite);
                    }
                    getDrawOLwlOKwannotations getdrawolwlokwannotations4 = getdrawolwlokwannotations;
                    if (getdrawolwlokwannotations4 != null) {
                        return getdrawolwlokwannotations4;
                    }
                }
                return getCompositionLocalConsumerOLwlOKw.RemoteActionCompatParcelizer;
            case 2:
                String str4 = (String) obj3;
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
                backwardfocussearch.write(setEnableExtraAssertions.write, str4);
                ((setEnableExtraAssertions) obj4).serializer(backwardfocussearch, str4);
                return null;
            case 3:
                String str5 = (String) obj;
                str5.getClass();
                ((BrazeExternalSyntheticLambda45) ((CreateHomeScope) obj4).read).RemoteActionCompatParcelizer(Uri.parse(str5), (FragmentActivity) obj3);
                return createfromparcel;
            case 4:
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                Object obj5 = ((m) obj4).RemoteActionCompatParcelizer;
                int i9 = activityResult.write;
                if (i9 == -1) {
                    Intent intent = activityResult.RemoteActionCompatParcelizer;
                    if (intent != null) {
                        stringExtra = intent.getStringExtra("biometrics_result_password_key");
                        int i10 = read + 69;
                        serializer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                    }
                    if (stringExtra == null) {
                        int i12 = serializer + 35;
                        read = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Failed to retrieve decrypted password", new Object[0]);
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(stringExtra);
                    }
                } else if (i9 == 0) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Decryption canceled", new Object[0]);
                }
                return createfromparcel;
            case 5:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                return Long.valueOf(((metaWithLastChildOffset) obj4).write.write(tintxetnrds2, obj3));
            case 6:
                List list = (List) obj;
                list.getClass();
                ((N$b) obj3).getClass();
                ((calculateOcclusions) obj4).invoke(N$b.write(list));
                return createfromparcel;
            case 7:
                List list2 = (List) obj4;
                AnchoredDraggableKtrestartable2 anchoredDraggableKtrestartable2 = (AnchoredDraggableKtrestartable2) obj;
                anchoredDraggableKtrestartable2.getClass();
                anchoredDraggableKtrestartable2.serializer(list2.size(), new createFromText(new ScrollState$$ExternalSyntheticLambda3(25), i, list2), new getGlobalPositionAwareOLwlOKwannotations(list2, i4), new DragAndDropTargetModifierNode(new forName(i5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, list2), true, 2039820996));
                return createfromparcel;
            case 8:
                scheduleDebounceCallback scheduledebouncecallback = (scheduleDebounceCallback) obj4;
                String str6 = (String) obj;
                str6.getClass();
                scheduledebouncecallback.MediaMetadataCompat();
                Throwable thSerializer = onItemDismiss.serializer(((SpannableExtensions_androidKt) ((ProtobufEncoder) obj3).RemoteActionCompatParcelizer).read(str6));
                if (thSerializer != null) {
                    String message2 = thSerializer.getMessage();
                    if (message2 != null) {
                        str = str3;
                        str = message2;
                    }
                    str = str3;
                    scheduledebouncecallback.read(str);
                }
                return createfromparcel;
            case 9:
                scheduleDebounceCallback scheduledebouncecallback2 = (scheduleDebounceCallback) obj4;
                Activity activity = (Activity) obj3;
                Throwable th = (Throwable) obj;
                th.getClass();
                scheduledebouncecallback2.MediaMetadataCompat();
                if (pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
                    message = activity.getString(R.string.no_internet_connection_message);
                } else {
                    message = th.getMessage();
                    if (message == null) {
                        message = activity.getString(R.string.all_error_message);
                        message.getClass();
                    }
                }
                scheduledebouncecallback2.IconCompatParcelizer(message);
                return createfromparcel;
            case 10:
                CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) obj4;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                customerChatProviderImpl.MediaDescriptionCompat = false;
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(customerChatProviderImpl.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(th2), "CustomerChat registerUser fail.", new Object[0]);
                ((NetworkFetcher.AnonymousClass2) obj3).invoke(Boolean.valueOf(customerChatProviderImpl.MediaDescriptionCompat));
                customerChatProviderImpl.MediaMetadataCompat.set(false);
                return createfromparcel;
            case 11:
                String str7 = (String) obj4;
                Long l = (Long) obj3;
                List list3 = (List) obj;
                list3.getClass();
                long jLongValue = 0;
                if ((str7 == null || str7.length() == 0) && l == null) {
                    TextUnitTypeCompanion textUnitTypeCompanion3 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(list3);
                    if (textUnitTypeCompanion3 != null) {
                        int i14 = serializer + 103;
                        read = i14 % Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        jLongValue = ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion3}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue();
                    }
                    return new setScreenOffsetgyyYBs(jLongValue);
                }
                if (str7 == null || str7.length() == 0) {
                    if (l == null) {
                        TextUnitTypeCompanion textUnitTypeCompanion4 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(list3);
                        return new setScreenOffsetgyyYBs(textUnitTypeCompanion4 != null ? ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion4}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() : 0L);
                    }
                    long jLongValue2 = l.longValue();
                    for (Object obj6 : list3) {
                        if (((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{(TextUnitTypeCompanion) obj6}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() == jLongValue2) {
                            stringExtra = obj6;
                            textUnitTypeCompanion = (TextUnitTypeCompanion) stringExtra;
                            if (textUnitTypeCompanion != null) {
                                TextUnitTypeCompanion textUnitTypeCompanion5 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(list3);
                                return new setScreenOffsetgyyYBs(textUnitTypeCompanion5 != null ? ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion5}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() : 0L);
                            }
                            registeronrectchanged = new registerOnRectChanged(((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue(), textUnitTypeCompanion.serializer());
                        }
                    }
                    textUnitTypeCompanion = (TextUnitTypeCompanion) stringExtra;
                    if (textUnitTypeCompanion != null) {
                        TextUnitTypeCompanion textUnitTypeCompanion6 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(list3);
                        if (textUnitTypeCompanion6 != null) {
                        }
                        return new setScreenOffsetgyyYBs(textUnitTypeCompanion6 != null ? ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion6}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() : 0L);
                    }
                    registeronrectchanged = new registerOnRectChanged(((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue(), textUnitTypeCompanion.serializer());
                } else {
                    for (Object obj7 : list3) {
                        if (setCarryoverInAppMessage.serializer(((TextUnitTypeCompanion) obj7).serializer(), str7, true)) {
                            stringExtra = obj7;
                            textUnitTypeCompanion2 = (TextUnitTypeCompanion) stringExtra;
                            if (textUnitTypeCompanion2 != null) {
                                TextUnitTypeCompanion textUnitTypeCompanion7 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(list3);
                                return new setScreenOffsetgyyYBs(textUnitTypeCompanion7 != null ? ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion7}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() : 0L);
                            }
                            registeronrectchanged = new registerOnRectChanged(((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion2}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue(), textUnitTypeCompanion2.serializer());
                        }
                    }
                    textUnitTypeCompanion2 = (TextUnitTypeCompanion) stringExtra;
                    if (textUnitTypeCompanion2 != null) {
                        TextUnitTypeCompanion textUnitTypeCompanion8 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(list3);
                        if (textUnitTypeCompanion8 != null) {
                        }
                        return new setScreenOffsetgyyYBs(textUnitTypeCompanion8 != null ? ((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion8}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() : 0L);
                    }
                    registeronrectchanged = new registerOnRectChanged(((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion2}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue(), textUnitTypeCompanion2.serializer());
                }
                return registeronrectchanged;
            case 12:
                Throwable th3 = (Throwable) obj;
                withRect withrect = ((PhoneNumberUseCase) obj4).RemoteActionCompatParcelizer;
                th3.getClass();
                withrect.RemoteActionCompatParcelizer(th3);
                ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3).invoke(th3);
                return createfromparcel;
            case 13:
                return SelfServiceCustomerChatActivity.write((SelfServiceCustomerChatActivity) obj4, (onViewAttachedToWindow) obj3, (FrameLayout) obj);
            case 14:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.setTranslationY(((onHideTranslationui) ((getPlatformAndroidManager) obj4)).serializer() - ((onHideTranslationui) ((getPlatformAndroidManager) obj3)).serializer());
                return createfromparcel;
            case 15:
                accesscreatePlatformTextStyleInternal accesscreateplatformtextstyleinternal = (accesscreatePlatformTextStyleInternal) obj4;
                Context context = (Context) obj3;
                getRangeForRectui_text getrangeforrectui_text = (getRangeForRectui_text) obj;
                getrangeforrectui_text.getClass();
                if (getrangeforrectui_text.equals(AndroidLayoutApi34.RemoteActionCompatParcelizer)) {
                    accesscreateplatformtextstyleinternal.getClass();
                    context.getClass();
                    q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(accesscreateplatformtextstyleinternal.serializer, context, null, (Uri) accesscreateplatformtextstyleinternal.read.MediaSessionCompatResultReceiverWrapper(), 16);
                    return createfromparcel;
                }
                if (!getrangeforrectui_text.equals(getRangeForRectlambda0.serializer)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                accesscreateplatformtextstyleinternal.getClass();
                context.getClass();
                q4ExternalSyntheticLambda9.RemoteActionCompatParcelizer(accesscreateplatformtextstyleinternal.serializer, context, null, (Uri) accesscreateplatformtextstyleinternal.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), 16);
                return createfromparcel;
            case 16:
                isRtlCharAt isrtlcharat = (isRtlCharAt) obj4;
                FragmentActivity fragmentActivity = (FragmentActivity) obj3;
                getMaximumBitmapWidth getmaximumbitmapwidth = (getMaximumBitmapWidth) obj;
                getmaximumbitmapwidth.getClass();
                if (getmaximumbitmapwidth.equals(restoreToCount.write)) {
                    ((getRootInfoui) isrtlcharat.write.RemoteActionCompatParcelizer).serializer("nest_time_to_interactive");
                    n0.RemoteActionCompatParcelizer(true).RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.home.nest.NestFragment");
                }
                return createfromparcel;
            case 17:
                updateTextLayoutResult updatetextlayoutresult = (updateTextLayoutResult) obj;
                updatetextlayoutresult.getClass();
                ((PopulateViewStructure_androidKtpopulate7) obj4).setValue(updatetextlayoutresult);
                onHideTranslationui onhidetranslationui = (onHideTranslationui) ((getPlatformAndroidManager) obj3);
                onhidetranslationui.serializer(onhidetranslationui.serializer() + 1);
                return createfromparcel;
            case 18:
                EditingBufferCompanion editingBufferCompanion = (EditingBufferCompanion) obj4;
                String str8 = (String) obj;
                str8.getClass();
                String str9 = ((getTopLeftnOccac) obj3).read();
                editingBufferCompanion.getClass();
                str9.getClass();
                getMBufferStateui_text getmbufferstateui_text = (getMBufferStateui_text) ((Map) editingBufferCompanion.MediaSessionCompatResultReceiverWrapper.read()).get(str9);
                if (getmbufferstateui_text != null && (getmbufferstateui_text instanceof commitCompositionui_text) && ((r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = editingBufferCompanion.MediaSessionCompatToken) == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_())) {
                    editingBufferCompanion.IconCompatParcelizer.RemoteActionCompatParcelizer(((commitCompositionui_text) getmbufferstateui_text).IconCompatParcelizer, "chat_notification_quick_reply");
                    editingBufferCompanion.MediaSessionCompatToken = BuildersKt.RemoteActionCompatParcelizer(editingBufferCompanion.MediaSessionCompatQueueItem, null, null, new PerseusLogger$w$1(editingBufferCompanion, str8, getmbufferstateui_text, null, 22), 3);
                }
                return createfromparcel;
            case 19:
                Throwable th4 = (Throwable) obj;
                Timber.RemoteActionCompatParcelizer.read("Failed sending a quick reply to a customer: " + th4, new Object[0]);
                toStringForLog tostringforlog = ((EditingBufferCompanion) obj4).IconCompatParcelizer;
                long j = ((commitCompositionui_text) ((getMBufferStateui_text) obj3)).IconCompatParcelizer;
                safeSetClipToOutline safesetcliptooutlineWrite = tostringforlog.serializer.write();
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("delivery_id", String.valueOf(j));
                stringExtra = th4 != null ? th4.getMessage() : null;
                if (stringExtra == null) {
                    int i16 = read + 125;
                    serializer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    obj2 = str3;
                } else {
                    obj2 = stringExtra;
                }
                tostringforlog.IconCompatParcelizer.logEvent("chat_notification_quick_reply_failed", onMove.RemoteActionCompatParcelizer(safesetcliptooutlineWrite, onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("reason", obj2))));
                return createfromparcel;
            case 20:
                String str10 = (String) obj4;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj3;
                dashPathEffectdefault dashpatheffectdefault = (dashPathEffectdefault) obj;
                dashpatheffectdefault.getClass();
                if (dashpatheffectdefault instanceof AsyncImagePainter$State$Success) {
                    populateViewStructure_androidKtpopulate7.setValue("captured-image-" + str10);
                }
                return createfromparcel;
            case 21:
                CreateHomeScope createHomeScope = (CreateHomeScope) obj4;
                Context context2 = (Context) obj3;
                TextInputServiceAndroidbaseInputConnection2 textInputServiceAndroidbaseInputConnection2 = (TextInputServiceAndroidbaseInputConnection2) obj;
                textInputServiceAndroidbaseInputConnection2.getClass();
                if (!(!(textInputServiceAndroidbaseInputConnection2 instanceof TextInputServiceAndroidstopInput1))) {
                    TextInputServiceAndroidstopInput1 textInputServiceAndroidstopInput1 = (TextInputServiceAndroidstopInput1) textInputServiceAndroidbaseInputConnection2;
                    createHomeScope.serializer(context2, textInputServiceAndroidstopInput1.IconCompatParcelizer, textInputServiceAndroidstopInput1.serializer, "special_instructions");
                } else if (textInputServiceAndroidbaseInputConnection2 instanceof TextInputServiceAndroid_androidKt) {
                    Intent intent2 = ((TextInputServiceAndroid_androidKt) textInputServiceAndroidbaseInputConnection2).write;
                    context2.getClass();
                    context2.startActivity(intent2);
                }
                return createfromparcel;
            case 22:
                ((PickUpDropOffDetailsUiModelImpl) ((PickUpDropOffDetailsUiModel) obj4)).getClass();
                AndroidUiDispatcherCompanioncurrentThread1.RemoteActionCompatParcelizer((FragmentActivity) obj3, (FullscreenItemUi) obj);
                return createfromparcel;
            case 23:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw r8lambdaaiqcq78tsty9mg_yjfdvtlmfw = ((ComposeViewAdapter) ((lambda_2086912010lambda0) obj3)).write;
                String str11 = r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.write;
                String str12 = r8lambdaaiqcq78tsty9mg_yjfdvtlmfw.RemoteActionCompatParcelizer;
                PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = (PickUpDropOffDetailsUiModelImpl) ((PickUpDropOffDetailsUiModel) obj4);
                pickUpDropOffDetailsUiModelImpl.getClass();
                str11.getClass();
                str12.getClass();
                initui_toolingdefault initui_toolingdefaultVar = pickUpDropOffDetailsUiModelImpl.MediaMetadataCompat;
                initui_toolingdefaultVar.read.logEvent("button_click", initui_toolingdefaultVar.write.write());
                pickUpDropOffDetailsUiModelImpl.IconCompatParcelizer.serializer(new getLambda558638247ui_tooling(str12));
                initlambda2020 initlambda2020Var = pickUpDropOffDetailsUiModelImpl.MediaSessionCompatToken;
                Map mapSingletonMap = Collections.singletonMap("root_error_class", "PickUpDropOffDetailsUiModelImpl");
                mapSingletonMap.getClass();
                ((SentryCriticalIssueLogger) initlambda2020Var.RemoteActionCompatParcelizer).write("delivery_flow_component_error", executeAsList.PUDO, str12, mapSingletonMap);
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th5, "The provided deeplink is invalid - ".concat(str11), new Object[0]);
                return createfromparcel;
            case 24:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4).invoke(((InfiniteTransitionSearchInfo) obj3).taskId, bool);
                return createfromparcel;
            case 25:
                FragmentActivity fragmentActivity2 = (FragmentActivity) obj4;
                addFeatureKeys addfeaturekeys = (addFeatureKeys) obj3;
                ((getPersonNamePrefix) obj).getClass();
                fragmentActivity2.getLifecycle().IconCompatParcelizer(addfeaturekeys);
                return new refreshFeatureFlagslambda10(fragmentActivity2, 12, addfeaturekeys);
            case 26:
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl = (CardCashPaymentTaskUiModelImpl) obj4;
                String str13 = (String) obj3;
                getEnterjXw82LU getenterjxw82lu = (getEnterjXw82LU) obj;
                getenterjxw82lu.getClass();
                CashPaymentTaskUiItem cashPaymentTaskUiItem = getenterjxw82lu.cashItem;
                if (cashPaymentTaskUiItem != null) {
                    return getEnterjXw82LU.write(getenterjxw82lu, null, cardCashPaymentTaskUiModelImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.serializer(cashPaymentTaskUiItem, str13), null, null, 8063);
                }
                return null;
            case 27:
                CardCashPaymentTaskUiModelImpl cardCashPaymentTaskUiModelImpl2 = (CardCashPaymentTaskUiModelImpl) obj4;
                getEnterjXw82LU getenterjxw82lu2 = (getEnterjXw82LU) obj3;
                AnimateXAsStateComposeAnimation animateXAsStateComposeAnimation = (AnimateXAsStateComposeAnimation) obj;
                String str14 = cardCashPaymentTaskUiModelImpl2.PlaybackStateCompat;
                DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl = cardCashPaymentTaskUiModelImpl2.MediaMetadataCompat;
                deliveryConfirmationLoggerImpl.read(cardCashPaymentTaskUiModelImpl2.read, str14);
                getQueryContext getquerycontext = cardCashPaymentTaskUiModelImpl2.serializer;
                String str15 = cardCashPaymentTaskUiModelImpl2.PlaybackStateCompat;
                Uri uri = animateXAsStateComposeAnimation.write;
                findGroupsThatMatchPredicatedefault findgroupsthatmatchpredicatedefault = animateXAsStateComposeAnimation.IconCompatParcelizer;
                String str16 = findgroupsthatmatchpredicatedefault != null ? findgroupsthatmatchpredicatedefault.acceptanceEndpoint : null;
                if (findgroupsthatmatchpredicatedefault != null) {
                    int i18 = read + 79;
                    serializer = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 == 0) {
                        String str17 = findgroupsthatmatchpredicatedefault.orderId;
                        throw null;
                    }
                    str2 = findgroupsthatmatchpredicatedefault.orderId;
                } else {
                    str2 = null;
                }
                getquerycontext.serializer(new unwrapIfInline(getenterjxw82lu2, str15, uri, str16, str2, findgroupsthatmatchpredicatedefault != null ? findgroupsthatmatchpredicatedefault.transactionId : null));
                if (getenterjxw82lu2.isSuccess) {
                    deliveryConfirmationLoggerImpl.serializer(cardCashPaymentTaskUiModelImpl2.read, str14, getenterjxw82lu2.isRequired);
                }
                filterTree filtertree = cardCashPaymentTaskUiModelImpl2.MediaSessionCompatResultReceiverWrapper;
                getPositionannotations getpositionannotations = cardCashPaymentTaskUiModelImpl2.read;
                String str18 = filtertree.write;
                if (str18 != null) {
                    int i19 = read + 93;
                    serializer = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 == 0) {
                        filtertree.serializer(str18, "openSoftPosApplication", filterTree.serializer(getpositionannotations));
                        stringExtra.hashCode();
                        throw null;
                    }
                    filtertree.serializer(str18, "openSoftPosApplication", filterTree.serializer(getpositionannotations));
                }
                return createfromparcel;
            case 28:
                String str19 = (String) obj;
                str19.getClass();
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4).invoke(((CashPaymentTaskUiItem) obj3).taskId, str19);
                return createfromparcel;
            default:
                String str20 = (String) obj;
                str20.getClass();
                ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4).invoke(str20, Double.valueOf(((r8lambdacMvJsTJhw3hZOG60vfqxBRs6hS8) obj3).amountPayable));
                return createfromparcel;
        }
    }
}
