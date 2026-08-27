package com.roadrunner.delivery.pickupdropoff.details.presentation;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.details.api.PickUpDropOffDetailsUiModel;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData;
import com.roadrunner.delivery.pickupdropoff.details.api.model.InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenDetailUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenItemUi;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;
import io.sentry.metrics.MetricsBatchProcessor;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AndroidUiFrameClock;
import o.BrazeCompanionExternalSyntheticLambda21;
import o.DialogWrapperWhenMappings;
import o.MathHelpersKt;
import o.PopupLayout;
import o.PopupLayout2;
import o.WrapPreview;
import o.WrapPreviewlambda1;
import o.accessgetFakeSavedStateRegistryOwnerp;
import o.accessgetInstancedelegatecp;
import o.accessgetOnDismissRequestp;
import o.accessgetPropertiesp;
import o.accesstoViewInfoFactory;
import o.convertStringJsonArrayToListlambda0;
import o.fastAny;
import o.fastCoerceAtLeast;
import o.fastFilterNotNull;
import o.fastFirst;
import o.fastFlatMap;
import o.fastFold;
import o.fastForEachReversed;
import o.fastMap;
import o.fastMapIndexed;
import o.fastMapNotNull;
import o.fastMaxOfOrDefault;
import o.fastMaxOfOrNull;
import o.fastSumBy;
import o.findDesignInfoProviders;
import o.findDesignInfoProviderslambda10;
import o.getCanCalculatePosition;
import o.getCieXyz;
import o.getClockui_toolingannotations;
import o.getConfigurationProviderSafeandroid_sdk_base_release;
import o.getDeviceId;
import o.getDisplayBounds;
import o.getExternalIEventMessengerandroid_sdk_base_release;
import o.getParamsui;
import o.getQueryContext;
import o.getRegisteredPushToken;
import o.initlambda1;
import o.initlambda2;
import o.initlambda20;
import o.initlambda2020;
import o.initui_toolingdefault;
import o.isOpenInternalroom_runtime;
import o.lambda_558638247lambda0;
import o.mergeJsonObjects;
import o.onItemDismiss;
import o.openSession;
import o.pollForLocationOnScreenChange;
import o.prepareForActivityTransitionCarryover;
import o.processViewInfos;
import o.r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k;
import o.r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s;
import o.r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw;
import o.r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0;
import o.r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI;
import o.r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k;
import o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ;
import o.r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g;
import o.r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E;
import o.removeNodeAtDepth;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;
import o.setParentLayoutCoordinates;
import o.setParentLayoutDirection;
import o.setPopupContentSizefhxjrPA;
import o.setPositionProvider;
import o.subscribeToNewInAppMessageslambda1;
import o.subscribeToPushNotificationEventslambda0;
import o.throwNoSuchElementException;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class PickUpDropOffDetailsUiModelImpl implements PickUpDropOffDetailsUiModel {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getQueryContext IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final StateFlow MediaDescriptionCompat;
    public final initui_toolingdefault MediaMetadataCompat;
    public final fastFilterNotNull MediaSessionCompatQueueItem;
    public final initlambda2 MediaSessionCompatResultReceiverWrapper;
    public final initlambda2020 MediaSessionCompatToken;
    public final processViewInfos ParcelableVolumeInfo;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU PlaybackStateCompat;
    public final initlambda20 PlaybackStateCompatCustomAction;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RatingCompat;
    public final ContextScope RemoteActionCompatParcelizer;
    public final UpdateStateUseCaseImpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 25;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i5 = i2 + 21;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return stateFlow;
    }

    public PickUpDropOffDetailsUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, processViewInfos processviewinfos, BrazeCompanionExternalSyntheticLambda21 brazeCompanionExternalSyntheticLambda21, AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, initlambda2 initlambda2Var, initlambda20 initlambda20Var, UpdateStateUseCaseImpl updateStateUseCaseImpl, isOpenInternalroom_runtime isopeninternalroom_runtime, IsFixableByRetry isFixableByRetry, initui_toolingdefault initui_toolingdefaultVar, initlambda2020 initlambda2020Var, getQueryContext getquerycontext) {
        fastfilternotnull.getClass();
        this.MediaSessionCompatQueueItem = fastfilternotnull;
        this.RemoteActionCompatParcelizer = contextScope;
        this.ParcelableVolumeInfo = processviewinfos;
        this.MediaSessionCompatResultReceiverWrapper = initlambda2Var;
        this.PlaybackStateCompatCustomAction = initlambda20Var;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = updateStateUseCaseImpl;
        this.MediaMetadataCompat = initui_toolingdefaultVar;
        this.MediaSessionCompatToken = initlambda2020Var;
        this.IconCompatParcelizer = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(SmallPersistentVector.RemoteActionCompatParcelizer);
        this.read = mutableStateFlow;
        this.MediaBrowserCompatMediaItem = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.MediaDescriptionCompat = mutableStateFlow2;
        this.write = StateFlowKt.read(Boolean.TRUE);
        RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0319  */
    /* JADX WARN: Code duplicated, block: B:103:0x031d  */
    /* JADX WARN: Code duplicated, block: B:107:0x032e  */
    /* JADX WARN: Code duplicated, block: B:110:0x033a  */
    /* JADX WARN: Code duplicated, block: B:112:0x033d  */
    /* JADX WARN: Code duplicated, block: B:115:0x034a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0358  */
    /* JADX WARN: Code duplicated, block: B:122:0x035b  */
    /* JADX WARN: Code duplicated, block: B:125:0x036d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0379  */
    /* JADX WARN: Code duplicated, block: B:130:0x037c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0389  */
    /* JADX WARN: Code duplicated, block: B:143:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:165:0x0429 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x042b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0435  */
    /* JADX WARN: Code duplicated, block: B:170:0x043c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x045a  */
    /* JADX WARN: Code duplicated, block: B:178:0x047d A[LOOP:8: B:176:0x0477->B:178:0x047d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:182:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c0 A[LOOP:9: B:183:0x04ba->B:185:0x04c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:189:0x04da  */
    /* JADX WARN: Code duplicated, block: B:191:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:192:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:197:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:203:0x0524  */
    /* JADX WARN: Code duplicated, block: B:205:0x0534  */
    /* JADX WARN: Code duplicated, block: B:207:0x0548  */
    /* JADX WARN: Code duplicated, block: B:210:0x055f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0576  */
    /* JADX WARN: Code duplicated, block: B:215:0x0599  */
    /* JADX WARN: Code duplicated, block: B:216:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:221:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:223:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:226:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:232:0x05db  */
    /* JADX WARN: Code duplicated, block: B:233:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:235:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ff A[PHI: r20 r21 r22 r30
  0x05ff: PHI (r20v2 o.fastFilterNotNull) = (r20v1 o.fastFilterNotNull), (r20v1 o.fastFilterNotNull), (r20v3 o.fastFilterNotNull) binds: [B:100:0x0317, B:96:0x030f, B:65:0x027b] A[DONT_GENERATE, DONT_INLINE]
  0x05ff: PHI (r21v2 kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector) = 
  (r21v1 kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector)
  (r21v1 kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector)
  (r21v3 kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector)
 binds: [B:100:0x0317, B:96:0x030f, B:65:0x027b] A[DONT_GENERATE, DONT_INLINE]
  0x05ff: PHI (r22v2 java.util.Iterator) = (r22v1 java.util.Iterator), (r22v1 java.util.Iterator), (r22v3 java.util.Iterator) binds: [B:100:0x0317, B:96:0x030f, B:65:0x027b] A[DONT_GENERATE, DONT_INLINE]
  0x05ff: PHI (r30v1 java.util.ArrayList) = (r30v0 java.util.ArrayList), (r30v0 java.util.ArrayList), (r30v2 java.util.ArrayList) binds: [B:100:0x0317, B:96:0x030f, B:65:0x027b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x032c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x03a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x03ac A[EDGE_INSN: B:293:0x03ac->B:142:0x03ac BREAK  A[LOOP:6: B:131:0x0383->B:296:0x0383], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x03ac A[EDGE_INSN: B:295:0x03ac->B:142:0x03ac BREAK  A[LOOP:6: B:131:0x0383->B:296:0x0383], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x057e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x05d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0308  */
    /* JADX WARN: Code duplicated, block: B:95:0x030d  */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x0435, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.CancellationException, kotlinx.coroutines.CoroutineStart, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void RemoteActionCompatParcelizer() {
        Object obj;
        int i;
        Instant instant;
        ContextScope contextScope;
        ?? r6;
        fastFilterNotNull fastfilternotnull;
        SmallPersistentVector smallPersistentVector;
        Iterator it;
        ArrayList arrayList;
        initlambda1 initlambda1Var;
        MathHelpersKt mathHelpersKt;
        fastForEachReversed fastforeachreversed;
        ArrayList<fastMaxOfOrDefault> arrayList2;
        fastFlatMap fastflatmap;
        fastMaxOfOrNull fastmaxofornull;
        WrapPreview wrapPreview;
        Instant instant2;
        accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp;
        ArrayList arrayList3;
        r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0;
        fastFirst fastfirst;
        String str;
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        WrapPreviewlambda1 wrapPreviewlambda1;
        Iterator it2;
        Object next;
        PopupLayout2 popupLayout2;
        ArrayList<setPositionProvider> arrayList4;
        ArrayList arrayList5;
        List list;
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2;
        ArrayList arrayList6;
        String str2;
        StringBuilder sb;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Iterator it3;
        Object next2;
        Iterator it4;
        Object next3;
        int i2;
        Iterator it5;
        Object next4;
        Iterator it6;
        Object next5;
        findDesignInfoProviderslambda10 accesstoviewinfofactory;
        ArrayList arrayList9;
        r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g;
        r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m;
        ArrayList arrayList10;
        findDesignInfoProviderslambda10 getclockui_toolingannotations;
        PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = this;
        int i3 = 2;
        int i4 = 2 % 2;
        fastFilterNotNull fastfilternotnull2 = pickUpDropOffDetailsUiModelImpl.MediaSessionCompatQueueItem;
        fastfilternotnull2.getClass();
        List list2 = fastfilternotnull2.components;
        SmallPersistentVector smallPersistentVector2 = SmallPersistentVector.RemoteActionCompatParcelizer;
        List list3 = list2 == null ? smallPersistentVector2 : list2;
        ArrayList arrayList11 = new ArrayList();
        Iterator it7 = list3.iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it7.hasNext();
            ContextScope contextScope2 = pickUpDropOffDetailsUiModelImpl.RemoteActionCompatParcelizer;
            if (!zHasNext) {
                r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq3 = removeNodeAtDepth.read(arrayList11);
                MutableStateFlow mutableStateFlow = this.read;
                mutableStateFlow.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq3);
                this.serializer.IconCompatParcelizer(Boolean.valueOf(!((Collection) mutableStateFlow.read()).isEmpty()));
                if (((FirebaseRemoteConfigImpl) this.MediaSessionCompatResultReceiverWrapper.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                    return;
                }
                int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 53;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    throw null;
                }
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.PlaybackStateCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                Iterator it8 = ((Iterable) mutableStateFlow.read()).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next6 = it8.next();
                    if (next6 instanceof r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) {
                        obj = next6;
                        break;
                    }
                }
                r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ r8lambdayigkjx4opgvyddqvttr8slptylq = (r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) obj;
                if (r8lambdayigkjx4opgvyddqvttr8slptylq != null) {
                    int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 69;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
                    i = 2;
                    int i7 = i6 % 2;
                    instant = r8lambdayigkjx4opgvyddqvttr8slptylq.MediaMetadataCompat;
                } else {
                    i = 2;
                    instant = null;
                }
                if (instant != null) {
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                    r6 = 0;
                    PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1 pickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1 = new PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1(this, instant, false ? 1 : 0, 0);
                    contextScope = contextScope2;
                    this.PlaybackStateCompat = BuildersKt.RemoteActionCompatParcelizer(contextScope, defaultIoScheduler, null, pickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1, i);
                } else {
                    contextScope = contextScope2;
                    r6 = 0;
                }
                Instant instantPlus = Instant.now().plus(1L, (TemporalUnit) ChronoUnit.MINUTES);
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = this.RatingCompat;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != 0) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) r6);
                }
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                this.RatingCompat = BuildersKt.RemoteActionCompatParcelizer(contextScope, DefaultIoScheduler.RemoteActionCompatParcelizer, r6, new PickUpDropOffDetailsUiModelImpl$scheduleStateRefresh$1$1(this, instantPlus, r6, 1), 2);
                int i8 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 103;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return;
            }
            fastAny fastany = (fastAny) it7.next();
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fastany, fastCoerceAtLeast.INSTANCE}, getCieXyz.write())).booleanValue();
            processViewInfos processviewinfos = pickUpDropOffDetailsUiModelImpl.ParcelableVolumeInfo;
            if (zBooleanValue) {
                int i10 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 3;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i10 % Fields.SpotShadowColor;
                int i11 = i10 % i3;
                long j = fastfilternotnull2.deliveryId;
                if (((FirebaseRemoteConfigImpl) processviewinfos.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(updateAdidI.IS_RIDER_REVIEWS_OF_VENDORS_ENABLED)) {
                    VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl = processviewinfos.MediaDescriptionCompat;
                    if (vendorReviewOptionUiModelImpl == null) {
                        openSession opensession = processviewinfos.IconCompatParcelizer;
                        subscribeToPushNotificationEventslambda0 subscribetopushnotificationeventslambda0 = subscribeToPushNotificationEventslambda0.DF_PICK_UP;
                        MetricsBatchProcessor metricsBatchProcessor = opensession.serializer;
                        vendorReviewOptionUiModelImpl = new VendorReviewOptionUiModelImpl((getDeviceId) ((mergeJsonObjects) metricsBatchProcessor.RemoteActionCompatParcelizer).write(), (getConfigurationProviderSafeandroid_sdk_base_release) ((mergeJsonObjects) metricsBatchProcessor.serializer).write(), (getRegisteredPushToken) ((mergeJsonObjects) metricsBatchProcessor.write).write(), (setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release) ((convertStringJsonArrayToListlambda0) metricsBatchProcessor.read).write(), (getExternalIEventMessengerandroid_sdk_base_release) ((convertStringJsonArrayToListlambda0) metricsBatchProcessor.MediaSessionCompatQueueItem).write(), (subscribeToNewInAppMessageslambda1) ((convertStringJsonArrayToListlambda0) metricsBatchProcessor.IconCompatParcelizer).write(), j, subscribetopushnotificationeventslambda0, contextScope2);
                        processviewinfos.MediaDescriptionCompat = vendorReviewOptionUiModelImpl;
                    }
                    getclockui_toolingannotations = new getClockui_toolingannotations(vendorReviewOptionUiModelImpl);
                } else {
                    getclockui_toolingannotations = null;
                }
                fastfilternotnull = fastfilternotnull2;
                smallPersistentVector = smallPersistentVector2;
                it = it7;
                arrayList = arrayList11;
                accesstoviewinfofactory = getclockui_toolingannotations;
            } else if (fastany instanceof fastMap) {
                fastMap fastmap = (fastMap) fastany;
                transferSessionPackageI transfersessionpackagei = processviewinfos.serializer.RemoteActionCompatParcelizer;
                List list4 = fastmap.instructions;
                ArrayList arrayList12 = new ArrayList();
                Iterator it9 = list4.iterator();
                for (boolean z2 = true; (!it9.hasNext()) != z2; z2 = true) {
                    accessgetPropertiesp accessgetpropertiesp = (accessgetPropertiesp) it9.next();
                    if (accessgetpropertiesp instanceof getDisplayBounds) {
                        getDisplayBounds getdisplaybounds = (getDisplayBounds) accessgetpropertiesp;
                        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_DETAILS_INSTRUCTIONS_V2_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                            fastfilternotnull2 = fastfilternotnull2;
                            smallPersistentVector2 = smallPersistentVector2;
                            it7 = it7;
                            it9 = it9;
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("InstructionsV2 are not enabled", new Object[0]);
                            r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m = null;
                        } else {
                            String str3 = getdisplaybounds.title;
                            String str4 = getdisplaybounds.description;
                            Integer numIconCompatParcelizer = AndroidUiFrameClock.IconCompatParcelizer(getdisplaybounds.icon);
                            int iIntValue = numIconCompatParcelizer != null ? numIconCompatParcelizer.intValue() : R.drawable.ic_bold_large_instructions_placeholder;
                            PopupLayout popupLayout = getdisplaybounds.link;
                            r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m = new r8lambdaDRPn8vo7fbNhOYXF0RJOGYS4e6M(str3, str4, iIntValue, popupLayout != null ? new r8lambdaAiQCq78tstY9Mg_YjFDvtLmfw(popupLayout.text, popupLayout.url, popupLayout.packageName, popupLayout.errorMessage) : null);
                        }
                        r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g = r8lambdadrpn8vo7fbnhoyxf0rjogys4e6m;
                        arrayList9 = arrayList11;
                    } else {
                        fastfilternotnull2 = fastfilternotnull2;
                        smallPersistentVector2 = smallPersistentVector2;
                        it7 = it7;
                        it9 = it9;
                        if (accessgetpropertiesp instanceof DialogWrapperWhenMappings) {
                            int i12 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 27;
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            DialogWrapperWhenMappings dialogWrapperWhenMappings = (DialogWrapperWhenMappings) accessgetpropertiesp;
                            if (((FirebaseRemoteConfigImpl) processviewinfos.write.IconCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SPLIT_ORDER_INSTRUCTION_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                                arrayList9 = arrayList11;
                                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Split order instructions are not enabled", new Object[0]);
                                r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g = null;
                            } else {
                                String str5 = dialogWrapperWhenMappings.title;
                                Integer numIconCompatParcelizer2 = AndroidUiFrameClock.IconCompatParcelizer(dialogWrapperWhenMappings.icon);
                                List list5 = dialogWrapperWhenMappings.otherRiders;
                                ArrayList arrayList13 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                                for (Iterator it10 = list5.iterator(); it10.hasNext(); it10 = it10) {
                                    setParentLayoutDirection setparentlayoutdirection = (setParentLayoutDirection) it10.next();
                                    arrayList13.add(new InstructionsItemUi$Instruction$SplitOrderInstruction$OtherRider(setparentlayoutdirection.title, setparentlayoutdirection.name, setparentlayoutdirection.phoneNumber, setparentlayoutdirection.trackingEvents));
                                }
                                setParentLayoutCoordinates setparentlayoutcoordinates = dialogWrapperWhenMappings.actionSheet;
                                String str6 = setparentlayoutcoordinates.title;
                                getCanCalculatePosition getcancalculateposition = setparentlayoutcoordinates.callButton;
                                InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData = new InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData(getcancalculateposition.title, getcancalculateposition.trackingEvents);
                                getCanCalculatePosition getcancalculateposition2 = setparentlayoutcoordinates.copyButton;
                                InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2 = new InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData(getcancalculateposition2.title, getcancalculateposition2.trackingEvents);
                                getCanCalculatePosition getcancalculateposition3 = setparentlayoutcoordinates.cancelButtonData;
                                arrayList9 = arrayList11;
                                r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g = new r8lambda4xemsQi_rXvuhFGMMjGIfxFd9k(str5, numIconCompatParcelizer2, arrayList13, new InstructionsItemUi$Instruction$SplitOrderInstruction$ActionSheet(str6, instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData, instructionsItemUi$Instruction$SplitOrderInstruction$ButtonData2, new InstructionsItemUi$Instruction$SplitOrderInstruction$ButtonData(getcancalculateposition3.title, getcancalculateposition3.trackingEvents), setparentlayoutcoordinates.trackingEvents));
                            }
                        } else {
                            arrayList9 = arrayList11;
                            if (accessgetpropertiesp instanceof getParamsui) {
                                getParamsui getparamsui = (getParamsui) accessgetpropertiesp;
                                r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g = new r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g(getparamsui.title, getparamsui.description, getparamsui.colorToken);
                            } else {
                                if (!(accessgetpropertiesp instanceof accessgetOnDismissRequestp) && !(accessgetpropertiesp instanceof pollForLocationOnScreenChange)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return;
                                }
                                r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g = null;
                            }
                        }
                    }
                    if (r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g != null) {
                        arrayList12.add(r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g);
                    }
                    fastfilternotnull2 = fastfilternotnull2;
                    smallPersistentVector2 = smallPersistentVector2;
                    it7 = it7;
                    it9 = it9;
                    arrayList11 = arrayList9;
                }
                fastfilternotnull = fastfilternotnull2;
                smallPersistentVector = smallPersistentVector2;
                it = it7;
                arrayList = arrayList11;
                if (arrayList12.isEmpty()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("PickUpDropOffUiModelMapper: instructions list is empty in " + fastmap, new Object[0]);
                    accesstoviewinfofactory = null;
                } else {
                    accesstoviewinfofactory = new r8lambda6ugNDFPZCmsyUQ0qlnt0YI4vxE(((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_DETAILS_INSTRUCTIONS_V2_KILLSWITCH_ENABLED.getFirebaseFlagName()) ? fastmap.title : null, removeNodeAtDepth.read(arrayList12));
                }
            } else {
                fastfilternotnull = fastfilternotnull2;
                smallPersistentVector = smallPersistentVector2;
                it = it7;
                arrayList = arrayList11;
                if (fastany instanceof fastSumBy) {
                    fastSumBy fastsumby = (fastSumBy) fastany;
                    String str7 = fastsumby.title;
                    String str8 = fastsumby.info;
                    String str9 = fastsumby.amount;
                    String str10 = fastsumby.note;
                    throwNoSuchElementException thrownosuchelementexception = fastsumby.tip;
                    accesstoviewinfofactory = new accesstoViewInfoFactory(str7, str8, str9, str10, thrownosuchelementexception != null ? new findDesignInfoProviders(thrownosuchelementexception.title, thrownosuchelementexception.amount) : null);
                } else if (!(fastany instanceof fastFlatMap) && !(fastany instanceof fastForEachReversed) && !(fastany instanceof fastMaxOfOrDefault)) {
                    int i14 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 117;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        int i15 = 30 / 0;
                        if (!(fastany instanceof fastMaxOfOrNull)) {
                            if (fastany instanceof MathHelpersKt) {
                                if (!(fastany instanceof fastFold)) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return;
                                }
                            }
                            accesstoviewinfofactory = null;
                        }
                    } else if (!(fastany instanceof fastMaxOfOrNull)) {
                        if (fastany instanceof MathHelpersKt) {
                            if (!(fastany instanceof fastFold)) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                        }
                        accesstoviewinfofactory = null;
                    }
                    if (z) {
                        accesstoviewinfofactory = null;
                    } else {
                        initlambda1Var = processviewinfos.read;
                        if (list2 != null) {
                            it6 = list2.iterator();
                            do {
                                if (!it6.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it6.next();
                            } while (!(next5 instanceof MathHelpersKt));
                            mathHelpersKt = (MathHelpersKt) next5;
                        } else {
                            mathHelpersKt = null;
                        }
                        if (list2 != null) {
                            it5 = list2.iterator();
                            do {
                                if (it5.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it5.next();
                            } while (!(next4 instanceof fastForEachReversed));
                            fastforeachreversed = (fastForEachReversed) next4;
                        } else {
                            fastforeachreversed = null;
                        }
                        if (list2 != null) {
                            arrayList2 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (obj2 instanceof fastMaxOfOrDefault) {
                                    arrayList2.add(obj2);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (list2 != null) {
                            it4 = list2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 25;
                                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
                                if (i2 % 2 != 0) {
                                    next3 = it4.next();
                                    if (next3 instanceof fastFlatMap) {
                                        break;
                                        break;
                                    }
                                } else {
                                    next3 = it4.next();
                                    int i16 = 60 / 0;
                                    if (next3 instanceof fastFlatMap) {
                                        break;
                                        break;
                                    }
                                }
                            }
                            fastflatmap = (fastFlatMap) next3;
                        } else {
                            fastflatmap = null;
                        }
                        if (list2 != null) {
                            it3 = list2.iterator();
                            do {
                                if (it3.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it3.next();
                            } while (!(next2 instanceof fastMaxOfOrNull));
                            fastmaxofornull = (fastMaxOfOrNull) next2;
                        } else {
                            fastmaxofornull = null;
                        }
                        if (((FirebaseRemoteConfigImpl) initlambda1Var.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                            if (mathHelpersKt != null) {
                            }
                            wrapPreview = wrapPreview;
                            instant2 = null;
                        } else {
                            if (mathHelpersKt != null) {
                            }
                            wrapPreview = wrapPreview;
                            instant2 = null;
                        }
                        if (wrapPreview == null) {
                            int i17 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 83;
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            if (fastforeachreversed == null) {
                                Timber.RemoteActionCompatParcelizer.read(c8$$ExternalSyntheticOutline0.m("Invalid OrderHeaderItemUiV1 data ", list2), new Object[0]);
                            }
                        }
                        if (fastforeachreversed != null) {
                            Integer numIconCompatParcelizer3 = AndroidUiFrameClock.IconCompatParcelizer(fastforeachreversed.iconToken);
                            String str11 = fastforeachreversed.title;
                            fastMapNotNull fastmapnotnull = fastforeachreversed.fullscreenItem;
                            List<fastMapIndexed> list6 = fastmapnotnull.fullscreenDetails;
                            arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                            for (fastMapIndexed fastmapindexed : list6) {
                                arrayList8.add(new FullscreenDetailUi(fastmapindexed.bags, fastmapindexed.shelves, fastmapindexed.fullscreenTitle, fastmapindexed.pickedUpTitle));
                            }
                            accessgetfakesavedstateregistryownerp = new accessgetFakeSavedStateRegistryOwnerp(numIconCompatParcelizer3, str11, new FullscreenItemUi(removeNodeAtDepth.read(arrayList8), fastmapnotnull.trackingEvents));
                        } else {
                            accessgetfakesavedstateregistryownerp = null;
                        }
                        if (arrayList2 != null) {
                            arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                            for (fastMaxOfOrDefault fastmaxofordefault : arrayList2) {
                                arrayList7.add(new r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E(fastmaxofordefault.style, fastmaxofordefault.text));
                            }
                            arrayList3 = arrayList7;
                        } else {
                            arrayList3 = null;
                        }
                        if (fastflatmap != null) {
                            String str12 = fastflatmap.bags;
                            fastfirst = fastflatmap.items;
                            if (fastfirst != null) {
                                str = fastfirst.titleShowItems;
                            } else {
                                str = null;
                            }
                            if (fastfirst != null) {
                                List list7 = fastfirst.items;
                                arrayList4 = new ArrayList();
                                for (Object obj3 : list7) {
                                    if (obj3 instanceof setPositionProvider) {
                                        arrayList4.add(obj3);
                                        int i19 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i19 % Fields.SpotShadowColor;
                                        int i20 = i19 % 2;
                                    }
                                }
                                arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
                                for (setPositionProvider setpositionprovider : arrayList4) {
                                    String str13 = setpositionprovider.title;
                                    String str14 = setpositionprovider.price;
                                    String str15 = setpositionprovider.quantity;
                                    list = setpositionprovider.extras;
                                    if (list == null) {
                                        if (((FirebaseRemoteConfigImpl) initlambda1Var.write.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                                            Timber.RemoteActionCompatParcelizer.read("Extra items are not enabled", new Object[0]);
                                        } else {
                                            List<setPopupContentSizefhxjrPA> list8 = list;
                                            arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list8, 10));
                                            for (setPopupContentSizefhxjrPA setpopupcontentsizefhxjrpa : list8) {
                                                String str16 = setpopupcontentsizefhxjrpa.price;
                                                str2 = setpopupcontentsizefhxjrpa.quantity;
                                                String str17 = setpopupcontentsizefhxjrpa.title;
                                                initlambda1 initlambda1Var2 = initlambda1Var;
                                                sb = new StringBuilder("+ ");
                                                if (str2 != null) {
                                                    sb.append(str2);
                                                    sb.append(" ");
                                                }
                                                sb.append(str17);
                                                arrayList6.add(new r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI(sb.toString(), str16));
                                                initlambda1Var = initlambda1Var2;
                                            }
                                            initlambda1Var = initlambda1Var;
                                            r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = removeNodeAtDepth.read(arrayList6);
                                        }
                                        arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str13, str14, str15, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                        initlambda1Var = initlambda1Var;
                                    }
                                    r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = null;
                                    arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str13, str14, str15, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                    initlambda1Var = initlambda1Var;
                                }
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read(arrayList5);
                                if (r8lambdaiidsddyirtymdul5lt6pmt2zysq == null) {
                                    r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                                }
                            } else {
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                            }
                            if (fastfirst != null) {
                                it2 = fastfirst.items.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!(next instanceof PopupLayout2));
                                popupLayout2 = (PopupLayout2) next;
                                if (popupLayout2 != null) {
                                    wrapPreviewlambda1 = new WrapPreviewlambda1(popupLayout2.title, popupLayout2.value);
                                } else {
                                    wrapPreviewlambda1 = null;
                                }
                            } else {
                                wrapPreviewlambda1 = null;
                            }
                            r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = new r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0(str12, str, r8lambdaiidsddyirtymdul5lt6pmt2zysq, wrapPreviewlambda1);
                        } else {
                            r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = null;
                        }
                        z = true;
                        accesstoviewinfofactory = new r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ(wrapPreview, accessgetfakesavedstateregistryownerp, arrayList3, r8lambdamtsd8x0f0xutzn3oeie_s8mt0, null, 0L, false, instant2);
                    }
                } else if (z) {
                    initlambda1Var = processviewinfos.read;
                    if (list2 != null) {
                        it6 = list2.iterator();
                        do {
                            if (!it6.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it6.next();
                        } while (!(next5 instanceof MathHelpersKt));
                        mathHelpersKt = (MathHelpersKt) next5;
                    } else {
                        mathHelpersKt = null;
                    }
                    if (list2 != null) {
                        it5 = list2.iterator();
                        do {
                            if (it5.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it5.next();
                        } while (!(next4 instanceof fastForEachReversed));
                        fastforeachreversed = (fastForEachReversed) next4;
                    } else {
                        fastforeachreversed = null;
                    }
                    if (list2 != null) {
                        arrayList2 = new ArrayList();
                        while (r4.hasNext()) {
                            if (obj2 instanceof fastMaxOfOrDefault) {
                                arrayList2.add(obj2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (list2 != null) {
                        it4 = list2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next3 = null;
                                break;
                            }
                            i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 25;
                            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                next3 = it4.next();
                                if (next3 instanceof fastFlatMap) {
                                    break;
                                }
                            } else {
                                next3 = it4.next();
                                int i110 = 60 / 0;
                                if (next3 instanceof fastFlatMap) {
                                    break;
                                }
                            }
                        }
                        fastflatmap = (fastFlatMap) next3;
                    } else {
                        fastflatmap = null;
                    }
                    if (list2 != null) {
                        it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (!(next2 instanceof fastMaxOfOrNull));
                        fastmaxofornull = (fastMaxOfOrNull) next2;
                    } else {
                        fastmaxofornull = null;
                    }
                    if (((FirebaseRemoteConfigImpl) initlambda1Var.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_STATUS_COUNTDOWN_KILLSWITCH_ENABLED.getFirebaseFlagName()) || fastmaxofornull == null) {
                        WrapPreview wrapPreview2 = mathHelpersKt != null ? new WrapPreview(mathHelpersKt.style, mathHelpersKt.text) : null;
                        wrapPreview = wrapPreview2;
                        instant2 = null;
                        if (wrapPreview == null) {
                            int i111 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 83;
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i111 % Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            if (fastforeachreversed == null && arrayList2 == null) {
                                Timber.RemoteActionCompatParcelizer.read(c8$$ExternalSyntheticOutline0.m("Invalid OrderHeaderItemUiV1 data ", list2), new Object[0]);
                            }
                        }
                        if (fastforeachreversed != null) {
                            Integer numIconCompatParcelizer4 = AndroidUiFrameClock.IconCompatParcelizer(fastforeachreversed.iconToken);
                            String str18 = fastforeachreversed.title;
                            fastMapNotNull fastmapnotnull2 = fastforeachreversed.fullscreenItem;
                            List<fastMapIndexed> list9 = fastmapnotnull2.fullscreenDetails;
                            arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(list9, 10));
                            while (r7.hasNext()) {
                                arrayList8.add(new FullscreenDetailUi(fastmapindexed.bags, fastmapindexed.shelves, fastmapindexed.fullscreenTitle, fastmapindexed.pickedUpTitle));
                            }
                            accessgetfakesavedstateregistryownerp = new accessgetFakeSavedStateRegistryOwnerp(numIconCompatParcelizer4, str18, new FullscreenItemUi(removeNodeAtDepth.read(arrayList8), fastmapnotnull2.trackingEvents));
                        } else {
                            accessgetfakesavedstateregistryownerp = null;
                        }
                        if (arrayList2 != null) {
                            arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                            while (r2.hasNext()) {
                                arrayList7.add(new r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E(fastmaxofordefault.style, fastmaxofordefault.text));
                            }
                            arrayList3 = arrayList7;
                        } else {
                            arrayList3 = null;
                        }
                        if (fastflatmap != null) {
                            String str19 = fastflatmap.bags;
                            fastfirst = fastflatmap.items;
                            if (fastfirst != null) {
                                str = fastfirst.titleShowItems;
                            } else {
                                str = null;
                            }
                            if (fastfirst != null) {
                                List list10 = fastfirst.items;
                                arrayList4 = new ArrayList();
                                while (r5.hasNext()) {
                                    if (obj3 instanceof setPositionProvider) {
                                        arrayList4.add(obj3);
                                        int i113 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i113 % Fields.SpotShadowColor;
                                        int i21 = i113 % 2;
                                    }
                                }
                                arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
                                while (r5.hasNext()) {
                                    String str110 = setpositionprovider.title;
                                    String str111 = setpositionprovider.price;
                                    String str112 = setpositionprovider.quantity;
                                    list = setpositionprovider.extras;
                                    if (list == null) {
                                        if (((FirebaseRemoteConfigImpl) initlambda1Var.write.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                                            List<setPopupContentSizefhxjrPA> list11 = list;
                                            arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list11, 10));
                                            while (r6.hasNext()) {
                                                String str113 = setpopupcontentsizefhxjrpa.price;
                                                str2 = setpopupcontentsizefhxjrpa.quantity;
                                                String str114 = setpopupcontentsizefhxjrpa.title;
                                                initlambda1 initlambda1Var3 = initlambda1Var;
                                                sb = new StringBuilder("+ ");
                                                if (str2 != null) {
                                                    sb.append(str2);
                                                    sb.append(" ");
                                                }
                                                sb.append(str114);
                                                arrayList6.add(new r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI(sb.toString(), str113));
                                                initlambda1Var = initlambda1Var3;
                                            }
                                            initlambda1Var = initlambda1Var;
                                            r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = removeNodeAtDepth.read(arrayList6);
                                        } else {
                                            Timber.RemoteActionCompatParcelizer.read("Extra items are not enabled", new Object[0]);
                                        }
                                        arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str110, str111, str112, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                        initlambda1Var = initlambda1Var;
                                    }
                                    r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = null;
                                    arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str110, str111, str112, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                    initlambda1Var = initlambda1Var;
                                }
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read(arrayList5);
                                if (r8lambdaiidsddyirtymdul5lt6pmt2zysq == null) {
                                    r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                                }
                            } else {
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                            }
                            if (fastfirst != null) {
                                it2 = fastfirst.items.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!(next instanceof PopupLayout2));
                                popupLayout2 = (PopupLayout2) next;
                                if (popupLayout2 != null) {
                                    wrapPreviewlambda1 = new WrapPreviewlambda1(popupLayout2.title, popupLayout2.value);
                                } else {
                                    wrapPreviewlambda1 = null;
                                }
                            } else {
                                wrapPreviewlambda1 = null;
                            }
                            r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = new r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0(str19, str, r8lambdaiidsddyirtymdul5lt6pmt2zysq, wrapPreviewlambda1);
                        } else {
                            r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = null;
                        }
                        z = true;
                        accesstoviewinfofactory = new r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ(wrapPreview, accessgetfakesavedstateregistryownerp, arrayList3, r8lambdamtsd8x0f0xutzn3oeie_s8mt0, null, 0L, false, instant2);
                    } else {
                        Object objIconCompatParcelizer = initlambda1Var.RemoteActionCompatParcelizer.IconCompatParcelizer(fastmaxofornull.data);
                        Throwable thSerializer = onItemDismiss.serializer(objIconCompatParcelizer);
                        if (thSerializer == null) {
                            int i22 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 115;
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i22 % Fields.SpotShadowColor;
                            if (i22 % 2 == 0) {
                                lambda_558638247lambda0 lambda_558638247lambda0Var = (lambda_558638247lambda0) objIconCompatParcelizer;
                                WrapPreview wrapPreview3 = lambda_558638247lambda0Var.serializer;
                                Instant instant3 = lambda_558638247lambda0Var.RemoteActionCompatParcelizer;
                                throw null;
                            }
                            lambda_558638247lambda0 lambda_558638247lambda0Var2 = (lambda_558638247lambda0) objIconCompatParcelizer;
                            WrapPreview wrapPreview4 = lambda_558638247lambda0Var2.serializer;
                            instant2 = lambda_558638247lambda0Var2.RemoteActionCompatParcelizer;
                            wrapPreview = wrapPreview4;
                        } else {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "OrderStatusCountDown data is invalid " + fastmaxofornull, new Object[0]);
                        }
                        if (wrapPreview == null) {
                            int i114 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 83;
                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i114 % Fields.SpotShadowColor;
                            int i115 = i114 % 2;
                            if (fastforeachreversed == null) {
                                Timber.RemoteActionCompatParcelizer.read(c8$$ExternalSyntheticOutline0.m("Invalid OrderHeaderItemUiV1 data ", list2), new Object[0]);
                            }
                        }
                        if (fastforeachreversed != null) {
                            Integer numIconCompatParcelizer5 = AndroidUiFrameClock.IconCompatParcelizer(fastforeachreversed.iconToken);
                            String str115 = fastforeachreversed.title;
                            fastMapNotNull fastmapnotnull3 = fastforeachreversed.fullscreenItem;
                            List<fastMapIndexed> list12 = fastmapnotnull3.fullscreenDetails;
                            arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(list12, 10));
                            while (r7.hasNext()) {
                                arrayList8.add(new FullscreenDetailUi(fastmapindexed.bags, fastmapindexed.shelves, fastmapindexed.fullscreenTitle, fastmapindexed.pickedUpTitle));
                            }
                            accessgetfakesavedstateregistryownerp = new accessgetFakeSavedStateRegistryOwnerp(numIconCompatParcelizer5, str115, new FullscreenItemUi(removeNodeAtDepth.read(arrayList8), fastmapnotnull3.trackingEvents));
                        } else {
                            accessgetfakesavedstateregistryownerp = null;
                        }
                        if (arrayList2 != null) {
                            arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                            while (r2.hasNext()) {
                                arrayList7.add(new r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E(fastmaxofordefault.style, fastmaxofordefault.text));
                            }
                            arrayList3 = arrayList7;
                        } else {
                            arrayList3 = null;
                        }
                        if (fastflatmap != null) {
                            String str116 = fastflatmap.bags;
                            fastfirst = fastflatmap.items;
                            if (fastfirst != null) {
                                str = fastfirst.titleShowItems;
                            } else {
                                str = null;
                            }
                            if (fastfirst != null) {
                                List list13 = fastfirst.items;
                                arrayList4 = new ArrayList();
                                while (r5.hasNext()) {
                                    if (obj3 instanceof setPositionProvider) {
                                        arrayList4.add(obj3);
                                        int i116 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i116 % Fields.SpotShadowColor;
                                        int i23 = i116 % 2;
                                    }
                                }
                                arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
                                while (r5.hasNext()) {
                                    String str117 = setpositionprovider.title;
                                    String str118 = setpositionprovider.price;
                                    String str119 = setpositionprovider.quantity;
                                    list = setpositionprovider.extras;
                                    if (list == null) {
                                        if (((FirebaseRemoteConfigImpl) initlambda1Var.write.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                                            List<setPopupContentSizefhxjrPA> list14 = list;
                                            arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list14, 10));
                                            while (r6.hasNext()) {
                                                String str1110 = setpopupcontentsizefhxjrpa.price;
                                                str2 = setpopupcontentsizefhxjrpa.quantity;
                                                String str1111 = setpopupcontentsizefhxjrpa.title;
                                                initlambda1 initlambda1Var4 = initlambda1Var;
                                                sb = new StringBuilder("+ ");
                                                if (str2 != null) {
                                                    sb.append(str2);
                                                    sb.append(" ");
                                                }
                                                sb.append(str1111);
                                                arrayList6.add(new r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI(sb.toString(), str1110));
                                                initlambda1Var = initlambda1Var4;
                                            }
                                            initlambda1Var = initlambda1Var;
                                            r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = removeNodeAtDepth.read(arrayList6);
                                        } else {
                                            Timber.RemoteActionCompatParcelizer.read("Extra items are not enabled", new Object[0]);
                                        }
                                        arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str117, str118, str119, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                        initlambda1Var = initlambda1Var;
                                    }
                                    r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = null;
                                    arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str117, str118, str119, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                    initlambda1Var = initlambda1Var;
                                }
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read(arrayList5);
                                if (r8lambdaiidsddyirtymdul5lt6pmt2zysq == null) {
                                    r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                                }
                            } else {
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                            }
                            if (fastfirst != null) {
                                it2 = fastfirst.items.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (!(next instanceof PopupLayout2));
                                popupLayout2 = (PopupLayout2) next;
                                if (popupLayout2 != null) {
                                    wrapPreviewlambda1 = new WrapPreviewlambda1(popupLayout2.title, popupLayout2.value);
                                } else {
                                    wrapPreviewlambda1 = null;
                                }
                            } else {
                                wrapPreviewlambda1 = null;
                            }
                            r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = new r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0(str116, str, r8lambdaiidsddyirtymdul5lt6pmt2zysq, wrapPreviewlambda1);
                        } else {
                            r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = null;
                        }
                        z = true;
                        accesstoviewinfofactory = new r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ(wrapPreview, accessgetfakesavedstateregistryownerp, arrayList3, r8lambdamtsd8x0f0xutzn3oeie_s8mt0, null, 0L, false, instant2);
                    }
                    wrapPreview = wrapPreview2;
                    instant2 = null;
                    if (wrapPreview == null) {
                        int i117 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 83;
                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i117 % Fields.SpotShadowColor;
                        int i118 = i117 % 2;
                        if (fastforeachreversed == null) {
                            Timber.RemoteActionCompatParcelizer.read(c8$$ExternalSyntheticOutline0.m("Invalid OrderHeaderItemUiV1 data ", list2), new Object[0]);
                        }
                    }
                    if (fastforeachreversed != null) {
                        Integer numIconCompatParcelizer6 = AndroidUiFrameClock.IconCompatParcelizer(fastforeachreversed.iconToken);
                        String str1112 = fastforeachreversed.title;
                        fastMapNotNull fastmapnotnull4 = fastforeachreversed.fullscreenItem;
                        List<fastMapIndexed> list15 = fastmapnotnull4.fullscreenDetails;
                        arrayList8 = new ArrayList(accessgetInstancedelegatecp.write(list15, 10));
                        while (r7.hasNext()) {
                            arrayList8.add(new FullscreenDetailUi(fastmapindexed.bags, fastmapindexed.shelves, fastmapindexed.fullscreenTitle, fastmapindexed.pickedUpTitle));
                        }
                        accessgetfakesavedstateregistryownerp = new accessgetFakeSavedStateRegistryOwnerp(numIconCompatParcelizer6, str1112, new FullscreenItemUi(removeNodeAtDepth.read(arrayList8), fastmapnotnull4.trackingEvents));
                    } else {
                        accessgetfakesavedstateregistryownerp = null;
                    }
                    if (arrayList2 != null) {
                        arrayList7 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
                        while (r2.hasNext()) {
                            arrayList7.add(new r8lambdaqX04yJM8BYdCf53rsoOkFgPIN2E(fastmaxofordefault.style, fastmaxofordefault.text));
                        }
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = null;
                    }
                    if (fastflatmap != null) {
                        String str1113 = fastflatmap.bags;
                        fastfirst = fastflatmap.items;
                        if (fastfirst != null) {
                            str = fastfirst.titleShowItems;
                        } else {
                            str = null;
                        }
                        if (fastfirst != null) {
                            List list16 = fastfirst.items;
                            arrayList4 = new ArrayList();
                            while (r5.hasNext()) {
                                if (obj3 instanceof setPositionProvider) {
                                    arrayList4.add(obj3);
                                    int i119 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i119 % Fields.SpotShadowColor;
                                    int i24 = i119 % 2;
                                }
                            }
                            arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(arrayList4, 10));
                            while (r5.hasNext()) {
                                String str1114 = setpositionprovider.title;
                                String str1115 = setpositionprovider.price;
                                String str1116 = setpositionprovider.quantity;
                                list = setpositionprovider.extras;
                                if (list == null) {
                                    if (((FirebaseRemoteConfigImpl) initlambda1Var.write.RemoteActionCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_ORDER_DETAILS_EXTRA_ITEMS_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
                                        List<setPopupContentSizefhxjrPA> list17 = list;
                                        arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(list17, 10));
                                        while (r6.hasNext()) {
                                            String str1117 = setpopupcontentsizefhxjrpa.price;
                                            str2 = setpopupcontentsizefhxjrpa.quantity;
                                            String str1118 = setpopupcontentsizefhxjrpa.title;
                                            initlambda1 initlambda1Var5 = initlambda1Var;
                                            sb = new StringBuilder("+ ");
                                            if (str2 != null) {
                                                sb.append(str2);
                                                sb.append(" ");
                                            }
                                            sb.append(str1118);
                                            arrayList6.add(new r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI(sb.toString(), str1117));
                                            initlambda1Var = initlambda1Var5;
                                        }
                                        initlambda1Var = initlambda1Var;
                                        r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = removeNodeAtDepth.read(arrayList6);
                                    } else {
                                        Timber.RemoteActionCompatParcelizer.read("Extra items are not enabled", new Object[0]);
                                    }
                                    arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str1114, str1115, str1116, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                    initlambda1Var = initlambda1Var;
                                }
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = null;
                                arrayList5.add(new r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k(str1114, str1115, str1116, r8lambdaiidsddyirtymdul5lt6pmt2zysq2));
                                initlambda1Var = initlambda1Var;
                            }
                            r8lambdaiidsddyirtymdul5lt6pmt2zysq = removeNodeAtDepth.read(arrayList5);
                            if (r8lambdaiidsddyirtymdul5lt6pmt2zysq == null) {
                                r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                            }
                        } else {
                            r8lambdaiidsddyirtymdul5lt6pmt2zysq = smallPersistentVector;
                        }
                        if (fastfirst != null) {
                            it2 = fastfirst.items.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (!(next instanceof PopupLayout2));
                            popupLayout2 = (PopupLayout2) next;
                            if (popupLayout2 != null) {
                                wrapPreviewlambda1 = new WrapPreviewlambda1(popupLayout2.title, popupLayout2.value);
                            } else {
                                wrapPreviewlambda1 = null;
                            }
                        } else {
                            wrapPreviewlambda1 = null;
                        }
                        r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = new r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0(str1113, str, r8lambdaiidsddyirtymdul5lt6pmt2zysq, wrapPreviewlambda1);
                    } else {
                        r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = null;
                    }
                    z = true;
                    accesstoviewinfofactory = new r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ(wrapPreview, accessgetfakesavedstateregistryownerp, arrayList3, r8lambdamtsd8x0f0xutzn3oeie_s8mt0, null, 0L, false, instant2);
                } else {
                    accesstoviewinfofactory = null;
                }
            }
            if (accesstoviewinfofactory != null) {
                arrayList10 = arrayList;
                arrayList10.add(accesstoviewinfofactory);
            } else {
                arrayList10 = arrayList;
            }
            arrayList11 = arrayList10;
            fastfilternotnull2 = fastfilternotnull;
            smallPersistentVector2 = smallPersistentVector;
            it7 = it;
            i3 = 2;
            pickUpDropOffDetailsUiModelImpl = this;
        }
    }
}
