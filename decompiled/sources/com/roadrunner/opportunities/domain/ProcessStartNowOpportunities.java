package com.roadrunner.opportunities.domain;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.nafath.NafathModalUiModelImpl$1;
import com.roadrunner.opportunities.data.OpportunitiesRepository$set$1;
import com.roadrunner.rider.state.provider.domain.SaveShiftInfo$invoke$2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.FirstSessionDelayManager;
import o.GooglePlayServicesClientGooglePlayServicesInfo;
import o.IActivityHandler;
import o.OnLastDeeplinkReadListener;
import o.accessgetInstancedelegatecp;
import o.beforeInAppMessageViewClosed;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onMove;
import o.onServiceConnected;
import o.prepareForActivityTransitionCarryover;
import o.resetTransientState;
import o.setCarryoverInAppMessage;
import o.setWasCloseMessageCalled;
import o.vf;
import o.w8ExternalSyntheticLambda1;
import o.w8ExternalSyntheticLambda6;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ProcessStartNowOpportunities {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final SaveHeatmapUrlImpl serializer;
    public final resetTransientState write;

    public ProcessStartNowOpportunities(SaveHeatmapUrlImpl saveHeatmapUrlImpl, resetTransientState resettransientstate) {
        saveHeatmapUrlImpl.getClass();
        resettransientstate.getClass();
        this.serializer = saveHeatmapUrlImpl;
        this.write = resettransientstate;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[PHI: r6 r9
  0x003e: PHI (r6v22 java.util.List) = (r6v5 java.util.List), (r6v24 java.util.List) binds: [B:10:0x003b, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r9v5 int) = (r9v1 int), (r9v8 int) binds: [B:10:0x003b, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(List list, List list2, OpportunitiesRepository$set$1 opportunitiesRepository$set$1) throws Throwable {
        List list3;
        int iRemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer;
        String str;
        vf vfVar;
        vf vfVar2;
        String strRemoteActionCompatParcelizer2;
        ProcessStartNowOpportunities processStartNowOpportunities = this;
        int i = 2;
        int i2 = 2 % 2;
        SaveHeatmapUrlImpl saveHeatmapUrlImpl = processStartNowOpportunities.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (list != null) {
            int i3 = read + 49;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = 16;
            if (i3 % 2 == 0) {
                list3 = list2;
                iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list3, 68));
                if (iRemoteActionCompatParcelizer >= 122) {
                    i4 = iRemoteActionCompatParcelizer;
                }
            } else {
                list3 = list2;
                iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list3, 10));
                if (iRemoteActionCompatParcelizer >= 16) {
                    i4 = iRemoteActionCompatParcelizer;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
            for (Object obj : list3) {
                linkedHashMap.put(new Integer(((w8ExternalSyntheticLambda6) obj).id), obj);
            }
            List<w8ExternalSyntheticLambda1> list4 = list;
            ArrayList<FirstSessionDelayManager> arrayList = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            for (w8ExternalSyntheticLambda1 w8externalsyntheticlambda1 : list4) {
                Integer numPlaybackStateCompat = setCarryoverInAppMessage.PlaybackStateCompat(w8externalsyntheticlambda1.id);
                if (numPlaybackStateCompat == null) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Zone ID is not a valid integer: ", w8externalsyntheticlambda1.id, ", skipping zone data"), new Object[0]);
                }
                w8ExternalSyntheticLambda6 w8externalsyntheticlambda6 = (w8ExternalSyntheticLambda6) linkedHashMap.get(numPlaybackStateCompat);
                String str2 = w8externalsyntheticlambda1.id;
                String str3 = w8externalsyntheticlambda1.type;
                String str4 = w8externalsyntheticlambda1.description;
                String str5 = w8externalsyntheticlambda1.startTime;
                String str6 = w8externalsyntheticlambda6 != null ? w8externalsyntheticlambda6.name : null;
                resetTransientState resettransientstate = processStartNowOpportunities.write;
                if (w8externalsyntheticlambda6 == null || (vfVar2 = w8externalsyntheticlambda6.geoJson) == null) {
                    str = null;
                } else {
                    int i5 = IconCompatParcelizer + 49;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        strRemoteActionCompatParcelizer2 = resettransientstate.RemoteActionCompatParcelizer(vf.Companion.serializer(), vfVar2);
                        int i6 = 48 / 0;
                    } else {
                        strRemoteActionCompatParcelizer2 = resettransientstate.RemoteActionCompatParcelizer(vf.Companion.serializer(), vfVar2);
                    }
                    str = strRemoteActionCompatParcelizer2;
                }
                arrayList.add(new FirstSessionDelayManager(str2, str3, str4, str5, str6, str, (w8externalsyntheticlambda6 == null || (vfVar = w8externalsyntheticlambda6.centerGeoJson) == null) ? null : resettransientstate.RemoteActionCompatParcelizer(vf.Companion.serializer(), vfVar), w8externalsyntheticlambda6 != null ? w8externalsyntheticlambda6.bonusTypes : null, w8externalsyntheticlambda6 != null ? w8externalsyntheticlambda6.bonusMultiplier : null, w8externalsyntheticlambda6 != null ? w8externalsyntheticlambda6.calendarEnabled : null));
                processStartNowOpportunities = this;
            }
            IActivityHandler iActivityHandler = (IActivityHandler) saveHeatmapUrlImpl.serializer;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            for (FirstSessionDelayManager firstSessionDelayManager : arrayList) {
                int i7 = IconCompatParcelizer + 77;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % i;
                String str7 = firstSessionDelayManager.RemoteActionCompatParcelizer;
                GooglePlayServicesClientGooglePlayServicesInfo googlePlayServicesClientGooglePlayServicesInfo = onServiceConnected.Companion;
                String str8 = firstSessionDelayManager.MediaMetadataCompat;
                googlePlayServicesClientGooglePlayServicesInfo.getClass();
                onServiceConnected onserviceconnectedRemoteActionCompatParcelizer = GooglePlayServicesClientGooglePlayServicesInfo.RemoteActionCompatParcelizer(str8);
                String str9 = firstSessionDelayManager.write;
                String str10 = firstSessionDelayManager.MediaSessionCompatQueueItem;
                String str11 = firstSessionDelayManager.MediaBrowserCompatMediaItem;
                String str12 = firstSessionDelayManager.RatingCompat;
                List list5 = firstSessionDelayManager.serializer;
                if (list5 != null) {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), list5);
                } else {
                    strRemoteActionCompatParcelizer = null;
                }
                arrayList2.add(new OnLastDeeplinkReadListener(str7, onserviceconnectedRemoteActionCompatParcelizer, str9, str10, str11, str12, strRemoteActionCompatParcelizer, firstSessionDelayManager.read, firstSessionDelayManager.IconCompatParcelizer, instance_delegatelambda0.write, firstSessionDelayManager.MediaDescriptionCompat));
                int i9 = read + 107;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i = 2;
            }
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new SaveShiftInfo$invoke$2(iActivityHandler, arrayList2, null, 17), opportunitiesRepository$set$1);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objWithContext != coroutineSingletons) {
                objWithContext = createfromparcel;
            }
            if (objWithContext != coroutineSingletons) {
                objWithContext = createfromparcel;
            }
            if (objWithContext == coroutineSingletons) {
                return objWithContext;
            }
        } else {
            IActivityHandler iActivityHandler2 = (IActivityHandler) saveHeatmapUrlImpl.serializer;
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new NafathModalUiModelImpl$1(iActivityHandler2, null, 25), opportunitiesRepository$set$1);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objWithContext2 != coroutineSingletons2) {
                objWithContext2 = createfromparcel;
            }
            if (objWithContext2 != coroutineSingletons2) {
                objWithContext2 = createfromparcel;
            }
            if (objWithContext2 == coroutineSingletons2) {
                return objWithContext2;
            }
        }
        return createfromparcel;
    }
}
