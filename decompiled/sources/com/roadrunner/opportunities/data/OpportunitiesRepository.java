package com.roadrunner.opportunities.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.opportunities.domain.OpportunitiesMapper;
import com.roadrunner.opportunities.domain.ProcessStartNowOpportunities;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getActionList;
import o.getMaxFlingVelocity;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.resetTransientState;
import o.sa;
import o.sb;
import o.se;
import o.setGraphicModalMaxWidthDp;
import o.t1;
import o.t2;
import o.vgExternalSyntheticLambda7;
import o.w4ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class OpportunitiesRepository {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final isAdapterPositionOnScreen IconCompatParcelizer;
    public final MutableStateFlow MediaDescriptionCompat;
    public final ProcessStartNowOpportunities MediaMetadataCompat;
    public Integer RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final resetTransientState read;
    public final OpportunitiesMapper serializer;
    public final LinkedHashMap write;

    public OpportunitiesRepository(OpportunitiesMapper opportunitiesMapper, resetTransientState resettransientstate, ProcessStartNowOpportunities processStartNowOpportunities, getActionList getactionlist) {
        opportunitiesMapper.getClass();
        resettransientstate.getClass();
        processStartNowOpportunities.getClass();
        getactionlist.getClass();
        this.serializer = opportunitiesMapper;
        this.read = resettransientstate;
        this.MediaMetadataCompat = processStartNowOpportunities;
        this.write = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = StateFlowKt.read(new se());
        this.MediaDescriptionCompat = StateFlowKt.read(null);
        this.IconCompatParcelizer = new isAdapterPositionOnScreen(new vgExternalSyntheticLambda7(getactionlist, 0));
    }

    public final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 read() {
        int i = 2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, new GetRiderStateImpl$invoke$1(3, 6, shortNewsContentCardView));
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(new se());
        this.MediaDescriptionCompat.IconCompatParcelizer(null);
        this.RatingCompat = null;
        this.write.clear();
        int i2 = MediaBrowserCompatMediaItem + 61;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
    }

    public final void read(int i) {
        sb sbVar;
        Object next;
        int i2 = 2 % 2;
        sa saVar = ((se) this.RemoteActionCompatParcelizer.read()).serializer;
        Integer numValueOf = null;
        if (saVar instanceof sb) {
            int i3 = MediaSessionCompatQueueItem + 67;
            MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                sbVar = (sb) saVar;
                int i4 = 24 / 0;
            } else {
                sbVar = (sb) saVar;
            }
        } else {
            sbVar = null;
        }
        if (sbVar != null) {
            Iterator it = sbVar.write.iterator();
            do {
                if (!it.hasNext()) {
                    int i5 = MediaBrowserCompatMediaItem + 55;
                    MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    next = null;
                    break;
                }
                int i7 = MediaSessionCompatQueueItem + 51;
                MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                next = it.next();
            } while (((t2) next).MediaDescriptionCompat != i);
            t2 t2Var = (t2) next;
            if (t2Var != null) {
                int i9 = MediaSessionCompatQueueItem + 73;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                t1 t1Var = t2Var.serializer;
                if (t1Var != null) {
                    int i11 = MediaSessionCompatQueueItem + 91;
                    MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    numValueOf = Integer.valueOf(t1Var.IconCompatParcelizer);
                }
                this.MediaDescriptionCompat.IconCompatParcelizer(numValueOf);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX INFO: renamed from: set-gIAlu-s, reason: not valid java name */
    public final Object m4994setgIAlus(getMaxFlingVelocity getmaxflingvelocity, ContinuationImpl continuationImpl) {
        OpportunitiesRepository$set$1 opportunitiesRepository$set$1;
        w4ExternalSyntheticLambda0 w4externalsyntheticlambda0;
        int i;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem;
        int i4 = i3 + 23;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        Object obj = null;
        if (continuationImpl instanceof OpportunitiesRepository$set$1) {
            int i6 = i3 + 83;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = ((OpportunitiesRepository$set$1) continuationImpl).read;
                obj.hashCode();
                throw null;
            }
            opportunitiesRepository$set$1 = (OpportunitiesRepository$set$1) continuationImpl;
            int i8 = opportunitiesRepository$set$1.read;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                opportunitiesRepository$set$1.read = i8 - Integer.MIN_VALUE;
            } else {
                opportunitiesRepository$set$1 = new OpportunitiesRepository$set$1(this, continuationImpl);
            }
        } else {
            opportunitiesRepository$set$1 = new OpportunitiesRepository$set$1(this, continuationImpl);
        }
        Object obj2 = opportunitiesRepository$set$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = opportunitiesRepository$set$1.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        try {
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                if (getmaxflingvelocity == null) {
                    IconCompatParcelizer();
                    int i10 = MediaSessionCompatQueueItem + 5;
                    MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        return createfromparcel;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i11 = MediaSessionCompatQueueItem + 119;
                MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                resetTransientState resettransientstate = this.read;
                String string = getmaxflingvelocity.jsonBody.toString();
                resettransientstate.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = w4ExternalSyntheticLambda0.Companion.serializer();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpSerializer;
                w4externalsyntheticlambda0 = (w4ExternalSyntheticLambda0) resettransientstate.serializer(string, setgraphicmodalmaxwidthdpSerializer);
                OpportunitiesMapper opportunitiesMapper = this.serializer;
                opportunitiesRepository$set$1.IconCompatParcelizer = w4externalsyntheticlambda0;
                opportunitiesRepository$set$1.serializer = 0;
                opportunitiesRepository$set$1.read = 1;
                Object objInvoke = opportunitiesMapper.invoke(w4externalsyntheticlambda0, opportunitiesRepository$set$1);
                if (objInvoke != coroutineSingletons) {
                    obj2 = objInvoke;
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i9 != 1) {
                int i13 = MediaBrowserCompatMediaItem + 55;
                MediaSessionCompatQueueItem = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (i9 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = opportunitiesRepository$set$1.serializer;
            w4externalsyntheticlambda0 = opportunitiesRepository$set$1.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            this.RemoteActionCompatParcelizer.write((se) obj2);
            if (((Boolean) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue()) {
                ProcessStartNowOpportunities processStartNowOpportunities = this.MediaMetadataCompat;
                List list = w4externalsyntheticlambda0.startNow;
                List list2 = w4externalsyntheticlambda0.zones;
                opportunitiesRepository$set$1.IconCompatParcelizer = null;
                opportunitiesRepository$set$1.serializer = i;
                opportunitiesRepository$set$1.read = 2;
                if (processStartNowOpportunities.invoke(list, list2, opportunitiesRepository$set$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel;
        } catch (Throwable th) {
            return new isItemDismissable(th);
        }
    }
}
