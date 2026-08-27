package com.roadrunner.remoteconfig.fwf.genii;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_client.FwFClient;
import com.deliveryhero.fwf_client.FwFClientExtensionKt;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.ContainerUtils;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.EnumColumnAdapter;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessgetOldDependencyp;
import o.createFromParcel;
import o.decode;
import o.endFirstSessionDelay;
import o.executeAsList;
import o.finishedTrackingActivity;
import o.getActivityState;
import o.getAllSemanticsNodesToMap;
import o.getAttributionWithTimeout;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.isOpenInternalroom_runtime;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.updateHandlersStatusAndSendI;
import o.updateStatusI;
import o.verifyAndTrackPlayStorePurchaseI;
import o.writeGlobalCallbackParametersI;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class Gen2FunWithFlagsConfigRepository implements verifyAndTrackPlayStorePurchaseI, updateStatusI {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public final EnumColumnAdapter IconCompatParcelizer;
    public final FwFClient MediaBrowserCompatMediaItem;
    public final decode MediaDescriptionCompat;
    public final getAllSemanticsNodesToMap MediaMetadataCompat;
    public final getContentViewGroupParentLayout MediaSessionCompatQueueItem;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final Set serializer;
    public final endFirstSessionDelay write;
    public final ConcurrentHashMap read = new ConcurrentHashMap();
    public final ConcurrentHashMap.KeySetView RatingCompat = ConcurrentHashMap.newKeySet();

    public Gen2FunWithFlagsConfigRepository(FwFClient fwFClient, Set set, accessgetOldDependencyp accessgetolddependencyp, getAllSemanticsNodesToMap getallsemanticsnodestomap, EnumColumnAdapter enumColumnAdapter, decode decodeVar, isOpenInternalroom_runtime isopeninternalroom_runtime, endFirstSessionDelay endfirstsessiondelay, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.MediaBrowserCompatMediaItem = fwFClient;
        this.serializer = set;
        this.MediaMetadataCompat = getallsemanticsnodestomap;
        this.IconCompatParcelizer = enumColumnAdapter;
        this.MediaDescriptionCompat = decodeVar;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.write = endfirstsessiondelay;
        this.MediaSessionCompatQueueItem = getcontentviewgroupparentlayout;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        int i = 2 % 2;
        while (!(!it.hasNext())) {
            int i2 = MediaSessionCompatResultReceiverWrapper + 109;
            PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            linkedHashSet.add(((updateHandlersStatusAndSendI) it.next()).RemoteActionCompatParcelizer);
        }
        int i4 = MediaSessionCompatResultReceiverWrapper + 83;
        PlaybackStateCompatCustomAction = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 20 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public static final Object access$syncAndPersist(Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository, ContinuationImpl continuationImpl) throws Throwable {
        getActivityState getactivitystate;
        Object objWithContext;
        int i = 2 % 2;
        gen2FunWithFlagsConfigRepository.getClass();
        EnumColumnAdapter enumColumnAdapter = gen2FunWithFlagsConfigRepository.IconCompatParcelizer;
        if (!(continuationImpl instanceof getActivityState)) {
            getactivitystate = new getActivityState(gen2FunWithFlagsConfigRepository, continuationImpl);
        } else {
            int i2 = PlaybackStateCompatCustomAction + 83;
            MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            getactivitystate = (getActivityState) continuationImpl;
            int i4 = getactivitystate.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getactivitystate.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                getactivitystate = new getActivityState(gen2FunWithFlagsConfigRepository, continuationImpl);
            }
        }
        Object objSync = getactivitystate.RemoteActionCompatParcelizer;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getactivitystate.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objSync);
                FwFClient fwFClient = gen2FunWithFlagsConfigRepository.MediaBrowserCompatMediaItem;
                getactivitystate.IconCompatParcelizer = 1;
                objSync = FwFClientExtensionKt.sync(fwFClient, getactivitystate);
                if (objSync == obj) {
                }
                return obj;
            }
            if (i5 != 1) {
                int i6 = PlaybackStateCompatCustomAction + 115;
                MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0 ? i5 == 2 : i5 == 5) {
                    ExtrasKt.RemoteActionCompatParcelizer(objSync);
                    int i7 = PlaybackStateCompatCustomAction + 113;
                    MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    endFirstSessionDelay endfirstsessiondelay = gen2FunWithFlagsConfigRepository.write;
                    Map mapSerializer = onMove.serializer(gen2FunWithFlagsConfigRepository.read);
                    getactivitystate.IconCompatParcelizer = 3;
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SaveShiftInfo$invoke$2(endfirstsessiondelay, mapSerializer, shortNewsContentCardView, 10), getactivitystate);
                    if (objWithContext != obj) {
                        objWithContext = obj2;
                    }
                    if (objWithContext != obj) {
                        return obj;
                    }
                } else {
                    if (i5 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(objSync);
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objSync);
            }
            return obj2;
            SyncResult syncResult = (SyncResult) objSync;
            if (!syncResult.getSuccess()) {
                executeAsList executeaslist = executeAsList.INFRA;
                String error = syncResult.getError();
                if (error == null) {
                    int i9 = PlaybackStateCompatCustomAction + 73;
                    MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        shortNewsContentCardView.hashCode();
                        throw null;
                    }
                    error = "FwF Gen II sync failed";
                }
                EnumColumnAdapter.serializer(enumColumnAdapter, "endpoint_issue_fwf", executeaslist, error);
                Timber.RemoteActionCompatParcelizer.read("FwF Gen II: sync failed: " + syncResult.getError(), new Object[0]);
            }
            getactivitystate.IconCompatParcelizer = 2;
            if (gen2FunWithFlagsConfigRepository.eagerEvaluateAll(getactivitystate) != obj) {
                endFirstSessionDelay endfirstsessiondelay2 = gen2FunWithFlagsConfigRepository.write;
                Map mapSerializer2 = onMove.serializer(gen2FunWithFlagsConfigRepository.read);
                getactivitystate.IconCompatParcelizer = 3;
                DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SaveShiftInfo$invoke$2(endfirstsessiondelay2, mapSerializer2, shortNewsContentCardView, 10), getactivitystate);
                if (objWithContext != obj) {
                    objWithContext = obj2;
                }
                if (objWithContext != obj) {
                    return obj2;
                }
            }
            return obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            executeAsList executeaslist2 = executeAsList.INFRA;
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            EnumColumnAdapter.serializer(enumColumnAdapter, "endpoint_issue_fwf", executeaslist2, message);
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "FwF Gen II: syncAndPersist threw an exception.", new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1 A[LOOP:2: B:29:0x009b->B:31:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8 A[LOOP:0: B:37:0x00e2->B:39:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final Object eagerEvaluateAll(ContinuationImpl continuationImpl) {
        finishedTrackingActivity finishedtrackingactivity;
        int i;
        finishedTrackingActivity finishedtrackingactivity2;
        int i2;
        Object variations$default;
        CoroutineSingletons coroutineSingletons;
        int i3;
        ArrayList<updateHandlersStatusAndSendI> arrayList;
        int iRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap;
        int i4 = 2 % 2;
        int i5 = PlaybackStateCompatCustomAction + 59;
        int i6 = i5 % Fields.SpotShadowColor;
        MediaSessionCompatResultReceiverWrapper = i6;
        if (i5 % 2 != 0) {
            if (continuationImpl instanceof finishedTrackingActivity) {
                int i7 = i6 + 97;
                PlaybackStateCompatCustomAction = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                finishedtrackingactivity = (finishedTrackingActivity) continuationImpl;
                i = finishedtrackingactivity.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i9 = PlaybackStateCompatCustomAction + 121;
                    MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    finishedtrackingactivity.write = i - Integer.MIN_VALUE;
                }
            }
            finishedtrackingactivity2 = finishedtrackingactivity;
            i2 = PlaybackStateCompatCustomAction + 11;
            MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i11 = 2 % 3;
            }
            variations$default = finishedtrackingactivity2.serializer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i3 = finishedtrackingactivity2.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(variations$default);
                Set set = this.serializer;
                arrayList = new ArrayList();
                for (Object obj : set) {
                    if (obj instanceof updateHandlersStatusAndSendI) {
                        arrayList.add(obj);
                    }
                }
                iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList, 10));
                if (iRemoteActionCompatParcelizer < 16) {
                    iRemoteActionCompatParcelizer = 16;
                }
                linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                int i12 = PlaybackStateCompatCustomAction + 85;
                MediaSessionCompatResultReceiverWrapper = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                for (updateHandlersStatusAndSendI updatehandlersstatusandsendi : arrayList) {
                    int i14 = MediaSessionCompatResultReceiverWrapper + 89;
                    PlaybackStateCompatCustomAction = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    linkedHashMap.put(updatehandlersstatusandsendi.RemoteActionCompatParcelizer, ((writeGlobalCallbackParametersI) updatehandlersstatusandsendi.IconCompatParcelizer).getVariantName());
                }
                finishedtrackingactivity2.write = 1;
                variations$default = FwFClientExtensionKt.getVariations$default(this.MediaBrowserCompatMediaItem, linkedHashMap, null, false, finishedtrackingactivity2, 6, null);
                if (variations$default == coroutineSingletons) {
                    int i16 = PlaybackStateCompatCustomAction + 75;
                    MediaSessionCompatResultReceiverWrapper = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(variations$default);
            }
            for (Map.Entry entry : ((Map) variations$default).entrySet()) {
                String str = (String) entry.getKey();
                EvalResult evalResult = (EvalResult) entry.getValue();
                this.read.put(str, new getAttributionWithTimeout(evalResult.getVariation().toString(), evalResult.getExplanation().getKind().name(), evalResult.getAbTest()));
            }
            return createFromParcel.INSTANCE;
        }
        int i18 = 51 / 0;
        if (continuationImpl instanceof finishedTrackingActivity) {
            int i19 = i6 + 97;
            PlaybackStateCompatCustomAction = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            finishedtrackingactivity = (finishedTrackingActivity) continuationImpl;
            i = finishedtrackingactivity.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i21 = PlaybackStateCompatCustomAction + 121;
                MediaSessionCompatResultReceiverWrapper = i21 % Fields.SpotShadowColor;
                int i110 = i21 % 2;
                finishedtrackingactivity.write = i - Integer.MIN_VALUE;
            }
        }
        finishedtrackingactivity2 = finishedtrackingactivity;
        i2 = PlaybackStateCompatCustomAction + 11;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i111 = 2 % 3;
        }
        variations$default = finishedtrackingactivity2.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = finishedtrackingactivity2.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(variations$default);
            Set set2 = this.serializer;
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                if (obj instanceof updateHandlersStatusAndSendI) {
                    arrayList.add(obj);
                }
            }
            iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            int i112 = PlaybackStateCompatCustomAction + 85;
            MediaSessionCompatResultReceiverWrapper = i112 % Fields.SpotShadowColor;
            int i113 = i112 % 2;
            while (r10.hasNext()) {
                int i114 = MediaSessionCompatResultReceiverWrapper + 89;
                PlaybackStateCompatCustomAction = i114 % Fields.SpotShadowColor;
                int i115 = i114 % 2;
                linkedHashMap.put(updatehandlersstatusandsendi.RemoteActionCompatParcelizer, ((writeGlobalCallbackParametersI) updatehandlersstatusandsendi.IconCompatParcelizer).getVariantName());
            }
            finishedtrackingactivity2.write = 1;
            variations$default = FwFClientExtensionKt.getVariations$default(this.MediaBrowserCompatMediaItem, linkedHashMap, null, false, finishedtrackingactivity2, 6, null);
            if (variations$default == coroutineSingletons) {
                int i116 = PlaybackStateCompatCustomAction + 75;
                MediaSessionCompatResultReceiverWrapper = i116 % Fields.SpotShadowColor;
                int i117 = i116 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(variations$default);
        }
        while (r10.hasNext()) {
            String str2 = (String) entry.getKey();
            EvalResult evalResult2 = (EvalResult) entry.getValue();
            this.read.put(str2, new getAttributionWithTimeout(evalResult2.getVariation().toString(), evalResult2.getExplanation().getKind().name(), evalResult2.getAbTest()));
        }
        return createFromParcel.INSTANCE;
        finishedtrackingactivity = new finishedTrackingActivity(this, continuationImpl);
        finishedtrackingactivity2 = finishedtrackingactivity;
        i2 = PlaybackStateCompatCustomAction + 11;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i118 = 2 % 3;
        }
        variations$default = finishedtrackingactivity2.serializer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = finishedtrackingactivity2.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(variations$default);
            Set set3 = this.serializer;
            arrayList = new ArrayList();
            while (r10.hasNext()) {
                if (obj instanceof updateHandlersStatusAndSendI) {
                    arrayList.add(obj);
                }
            }
            iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            int i119 = PlaybackStateCompatCustomAction + 85;
            MediaSessionCompatResultReceiverWrapper = i119 % Fields.SpotShadowColor;
            int i1110 = i119 % 2;
            while (r10.hasNext()) {
                int i1111 = MediaSessionCompatResultReceiverWrapper + 89;
                PlaybackStateCompatCustomAction = i1111 % Fields.SpotShadowColor;
                int i1112 = i1111 % 2;
                linkedHashMap.put(updatehandlersstatusandsendi.RemoteActionCompatParcelizer, ((writeGlobalCallbackParametersI) updatehandlersstatusandsendi.IconCompatParcelizer).getVariantName());
            }
            finishedtrackingactivity2.write = 1;
            variations$default = FwFClientExtensionKt.getVariations$default(this.MediaBrowserCompatMediaItem, linkedHashMap, null, false, finishedtrackingactivity2, 6, null);
            if (variations$default == coroutineSingletons) {
                int i1113 = PlaybackStateCompatCustomAction + 75;
                MediaSessionCompatResultReceiverWrapper = i1113 % Fields.SpotShadowColor;
                int i1114 = i1113 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(variations$default);
        }
        while (r10.hasNext()) {
            String str3 = (String) entry.getKey();
            EvalResult evalResult3 = (EvalResult) entry.getValue();
            this.read.put(str3, new getAttributionWithTimeout(evalResult3.getVariation().toString(), evalResult3.getExplanation().getKind().name(), evalResult3.getAbTest()));
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0104  */
    /* JADX WARN: Code duplicated, block: B:33:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x013f  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x0114, please report this as an issue */
    public final writeGlobalCallbackParametersI serializer(updateHandlersStatusAndSendI updatehandlersstatusandsendi, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk) {
        Object next;
        String authUserId;
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 67;
        PlaybackStateCompatCustomAction = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        updatehandlersstatusandsendi.getClass();
        Object obj = updatehandlersstatusandsendi.IconCompatParcelizer;
        String str = updatehandlersstatusandsendi.RemoteActionCompatParcelizer;
        getAttributionWithTimeout getattributionwithtimeout = (getAttributionWithTimeout) this.read.get(str);
        if (getattributionwithtimeout == null) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("FwF Gen II: no cached result for ", str, ", returning default."), new Object[0]);
            return (writeGlobalCallbackParametersI) obj;
        }
        boolean z = getattributionwithtimeout.abTest;
        String str2 = getattributionwithtimeout.variation;
        writeGlobalCallbackParametersI[] writeglobalcallbackparametersiArr = (writeGlobalCallbackParametersI[]) Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk).getEnumConstants();
        if (writeglobalcallbackparametersiArr != null) {
            Class cls = Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk);
            ArrayList arrayList = new ArrayList();
            int length = writeglobalcallbackparametersiArr.length;
            int i4 = 0;
            while (i4 < length) {
                writeGlobalCallbackParametersI writeglobalcallbackparametersi = writeglobalcallbackparametersiArr[i4];
                if (cls.isInstance(writeglobalcallbackparametersi)) {
                    arrayList.add(writeglobalcallbackparametersi);
                }
                i4++;
                int i5 = PlaybackStateCompatCustomAction + 47;
                MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((writeGlobalCallbackParametersI) next).getVariantName(), str2}, getCieXyz.write())).booleanValue());
            writeGlobalCallbackParametersI writeglobalcallbackparametersi2 = (writeGlobalCallbackParametersI) next;
            if (writeglobalcallbackparametersi2 != null) {
                int i7 = PlaybackStateCompatCustomAction + 119;
                MediaSessionCompatResultReceiverWrapper = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                String str3 = getattributionwithtimeout.explanationKind;
                if (!z) {
                    int i9 = PlaybackStateCompatCustomAction + 81;
                    MediaSessionCompatResultReceiverWrapper = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        int i10 = 70 / 0;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "TARGET"}, getCieXyz.write())).booleanValue()) {
                            if (!(!this.RatingCompat.add(af$$ExternalSyntheticOutline0.m(str, ":", str2)))) {
                                User user = FwFClientExtensionKt.getUser(this.MediaBrowserCompatMediaItem);
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("fwfFeature", str);
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("fwfVariation", str2);
                                authUserId = user.getAuthUserId();
                                if (authUserId == null) {
                                    authUserId = "";
                                }
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("user_id", authUserId);
                                String unAuthUserId = user.getUnAuthUserId();
                                this.MediaDescriptionCompat.logEvent("ab_test_participated", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0("device_id", unAuthUserId != null ? unAuthUserId : "")));
                                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("FwF Gen II: tracking event sent ", str, ContainerUtils.KEY_VALUE_DELIMITER, str2, " abtest:");
                                sbM.append(z);
                                sbM.append(" explanation=");
                                sbM.append(str3);
                                forest.IconCompatParcelizer(sbM.toString(), new Object[0]);
                            }
                        }
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "TARGET"}, getCieXyz.write())).booleanValue()) {
                            if (!(!this.RatingCompat.add(af$$ExternalSyntheticOutline0.m(str, ":", str2)))) {
                                User user2 = FwFClientExtensionKt.getUser(this.MediaBrowserCompatMediaItem);
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("fwfFeature", str);
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda4 = new onViewAttachedToWindowlambda0("fwfVariation", str2);
                                authUserId = user2.getAuthUserId();
                                if (authUserId == null) {
                                    authUserId = "";
                                }
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda5 = new onViewAttachedToWindowlambda0("user_id", authUserId);
                                String unAuthUserId2 = user2.getUnAuthUserId();
                                this.MediaDescriptionCompat.logEvent("ab_test_participated", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda3, onviewattachedtowindowlambda4, onviewattachedtowindowlambda5, new onViewAttachedToWindowlambda0("device_id", unAuthUserId2 != null ? unAuthUserId2 : "")));
                                Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                                StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("FwF Gen II: tracking event sent ", str, ContainerUtils.KEY_VALUE_DELIMITER, str2, " abtest:");
                                sbM2.append(z);
                                sbM2.append(" explanation=");
                                sbM2.append(str3);
                                forest2.IconCompatParcelizer(sbM2.toString(), new Object[0]);
                            }
                        }
                    }
                } else if (!(!this.RatingCompat.add(af$$ExternalSyntheticOutline0.m(str, ":", str2)))) {
                    User user3 = FwFClientExtensionKt.getUser(this.MediaBrowserCompatMediaItem);
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda6 = new onViewAttachedToWindowlambda0("fwfFeature", str);
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda7 = new onViewAttachedToWindowlambda0("fwfVariation", str2);
                    authUserId = user3.getAuthUserId();
                    if (authUserId == null) {
                        authUserId = "";
                    }
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda8 = new onViewAttachedToWindowlambda0("user_id", authUserId);
                    String unAuthUserId3 = user3.getUnAuthUserId();
                    this.MediaDescriptionCompat.logEvent("ab_test_participated", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda6, onviewattachedtowindowlambda7, onviewattachedtowindowlambda8, new onViewAttachedToWindowlambda0("device_id", unAuthUserId3 != null ? unAuthUserId3 : "")));
                    Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                    StringBuilder sbM3 = c8$$ExternalSyntheticOutline0.m("FwF Gen II: tracking event sent ", str, ContainerUtils.KEY_VALUE_DELIMITER, str2, " abtest:");
                    sbM3.append(z);
                    sbM3.append(" explanation=");
                    sbM3.append(str3);
                    forest3.IconCompatParcelizer(sbM3.toString(), new Object[0]);
                }
                return writeglobalcallbackparametersi2;
            }
        }
        writeGlobalCallbackParametersI writeglobalcallbackparametersi3 = (writeGlobalCallbackParametersI) obj;
        Timber.Forest forest4 = Timber.RemoteActionCompatParcelizer;
        StringBuilder sbM4 = c8$$ExternalSyntheticOutline0.m("FwF Gen II: variant map failed. key:", str, ", variation=", str2, " abTest:");
        sbM4.append(z);
        forest4.write(new IllegalStateException(sbM4.toString()));
        return writeglobalcallbackparametersi3;
    }
}
