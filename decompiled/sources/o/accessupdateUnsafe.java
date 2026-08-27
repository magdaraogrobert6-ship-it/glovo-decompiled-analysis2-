package o;

import android.content.Context;
import android.util.SparseArray;
import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import coil3.disk.DiskLruCache$Editor;
import com.google.firebase.firestore.core.FirestoreClient$$ExternalSyntheticLambda1;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.remote.FirestoreCallCredentials;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.ut;
import com.sentiance.core.model.events.I$b;
import com.sentiance.core.model.events.i$c;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class accessupdateUnsafe {
    public final getShouldAttachOnInsert IconCompatParcelizer;
    public setMeasureResultui MediaDescriptionCompat;
    public ancestorToLocalS_NoaFU RatingCompat;
    public final setAfter RemoteActionCompatParcelizer;
    public androidx.transition.TransitionValuesMaps read;
    public final getTextInputService serializer;
    public final com.huawei.agconnect.config.impl.m write;

    /* JADX WARN: Code duplicated, block: B:10:0x006b A[DONT_GENERATE] */
    public accessupdateUnsafe(Context context, com.huawei.agconnect.config.impl.m mVar, setAfter setafter, getShouldAttachOnInsert getshouldattachoninsert, getTextInputService gettextinputservice, createLayerdefault createlayerdefault, i$c i_c) {
        this.write = mVar;
        this.RemoteActionCompatParcelizer = setafter;
        this.IconCompatParcelizer = getshouldattachoninsert;
        this.serializer = gettextinputservice;
        RemoteSerializer.write((visitNodesaLcG6gQ) mVar.RemoteActionCompatParcelizer).write();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gettextinputservice.RemoteActionCompatParcelizer(new EdgeToEdge$$ExternalSyntheticLambda0(this, parentDataModifierDefaultImpls, context, i_c, createlayerdefault, 2));
        FirestoreClient$$ExternalSyntheticLambda1 firestoreClient$$ExternalSyntheticLambda1 = new FirestoreClient$$ExternalSyntheticLambda1(this, atomicBoolean, parentDataModifierDefaultImpls, gettextinputservice);
        synchronized (setafter) {
            setafter.IconCompatParcelizer = firestoreClient$$ExternalSyntheticLambda1;
            synchronized (setafter) {
            }
            synchronized (getshouldattachoninsert) {
            }
        }
        firestoreClient$$ExternalSyntheticLambda1.serializer();
        synchronized (getshouldattachoninsert) {
        }
    }

    public final void read(Context context, setOffset setoffset, i$c i_c, createLayerdefault createlayerdefault) {
        onEndApplyChanges.read("FirestoreClient", "Initializing. user=%s", setoffset.IconCompatParcelizer);
        getTextInputService gettextinputservice = this.serializer;
        com.huawei.agconnect.config.impl.m mVar = this.write;
        setAfter setafter = this.RemoteActionCompatParcelizer;
        getShouldAttachOnInsert getshouldattachoninsert = this.IconCompatParcelizer;
        com.huawei.wisesecurity.ucs_credential.x xVar = new com.huawei.wisesecurity.ucs_credential.x(context, gettextinputservice, mVar, setoffset, setafter, getshouldattachoninsert, createlayerdefault);
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = (com.airbnb.lottie.parser.DropShadowEffect) i_c.MediaMetadataCompat;
        visitNodesaLcG6gQ visitnodesalcg6gq = (visitNodesaLcG6gQ) mVar.RemoteActionCompatParcelizer;
        dropShadowEffect.RatingCompat = new RemoteSerializer(visitnodesalcg6gq);
        FirestoreCallCredentials firestoreCallCredentials = new FirestoreCallCredentials(setafter, getshouldattachoninsert);
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        blockRunner.serializer = gettextinputservice;
        blockRunner.RemoteActionCompatParcelizer = context;
        blockRunner.IconCompatParcelizer = firestoreCallCredentials;
        blockRunner.read = LazyKt__LazyJVMKt.write(onLayoutNodeDeactivated.serializer, new HostnameCache$$ExternalSyntheticLambda1(3, blockRunner));
        dropShadowEffect.read = blockRunner;
        androidx.lifecycle.BlockRunner blockRunner2 = (androidx.lifecycle.BlockRunner) dropShadowEffect.read;
        getRectManager.IconCompatParcelizer(blockRunner2, "grpcCallProvider not initialized yet", new Object[0]);
        dropShadowEffect.write = new calculateLocalPositionMKHz9U(gettextinputservice, setafter, getshouldattachoninsert, visitnodesalcg6gq, createlayerdefault, blockRunner2);
        RemoteSerializer remoteSerializer = (RemoteSerializer) dropShadowEffect.RatingCompat;
        getRectManager.IconCompatParcelizer(remoteSerializer, "remoteSerializer not initialized yet", new Object[0]);
        calculateLocalPositionMKHz9U calculatelocalpositionmkhz9u = (calculateLocalPositionMKHz9U) dropShadowEffect.write;
        getRectManager.IconCompatParcelizer(calculatelocalpositionmkhz9u, "firestoreChannel not initialized yet", new Object[0]);
        dropShadowEffect.serializer = new updateDisplayList(gettextinputservice, remoteSerializer, calculatelocalpositionmkhz9u);
        dropShadowEffect.MediaDescriptionCompat = new com.huawei.agconnect.config.impl.m(context);
        RemoteSerializer remoteSerializer2 = (RemoteSerializer) ((com.airbnb.lottie.parser.DropShadowEffect) i_c.MediaMetadataCompat).RatingCompat;
        getRectManager.IconCompatParcelizer(remoteSerializer2, "remoteSerializer not initialized yet", new Object[0]);
        getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui = new getForceMeasureWithLookaheadConstraintsui(remoteSerializer2);
        ((markAsAttached) i_c.write).getClass();
        com.huawei.hmf.tasks.a.j jVar = new com.huawei.hmf.tasks.a.j(25);
        Context context2 = (Context) xVar.RemoteActionCompatParcelizer;
        com.huawei.agconnect.config.impl.m mVar2 = (com.huawei.agconnect.config.impl.m) xVar.IconCompatParcelizer;
        headH91voCI headh91voci = new headH91voCI(context2, (String) mVar2.read, (visitNodesaLcG6gQ) mVar2.RemoteActionCompatParcelizer, getforcemeasurewithlookaheadconstraintsui, jVar);
        i_c.IconCompatParcelizer = headh91voci;
        headh91voci.MediaSessionCompatQueueItem();
        getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc = (getMinimumTouchTargetSizeNHjbRc) i_c.IconCompatParcelizer;
        getRectManager.IconCompatParcelizer(getminimumtouchtargetsizenhjbrc, "persistence not initialized yet", new Object[0]);
        ut utVar = new ut(8, false);
        I$b i$b = new I$b(0);
        getRectManager.RemoteActionCompatParcelizer(getminimumtouchtargetsizenhjbrc.read(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        i$b.IconCompatParcelizer = getminimumtouchtargetsizenhjbrc;
        i$b.RatingCompat = utVar;
        SQLiteTargetCache sQLiteTargetCacheIconCompatParcelizer = getminimumtouchtargetsizenhjbrc.IconCompatParcelizer();
        i$b.MediaBrowserCompatMediaItem = sQLiteTargetCacheIconCompatParcelizer;
        getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = new getUseEvaluationsCachefwf_client_release(0, sQLiteTargetCacheIconCompatParcelizer.read);
        getuseevaluationscachefwf_client_release.write += 2;
        i$b.MediaSessionCompatQueueItem = getuseevaluationscachefwf_client_release;
        i$b.RemoteActionCompatParcelizer = getminimumtouchtargetsizenhjbrc.serializer();
        i$d i_d = new i$d(27);
        i$b.MediaMetadataCompat = i_d;
        i$b.MediaSessionCompatResultReceiverWrapper = new SparseArray();
        i$b.PlaybackStateCompat = new HashMap();
        getminimumtouchtargetsizenhjbrc.write().serializer = i_d;
        i$b.IconCompatParcelizer(setoffset);
        i_c.serializer = i$b;
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = new PinnableContainerKtLocalPinnableContainer1(22, i_c);
        I$b i$bRemoteActionCompatParcelizer = i_c.RemoteActionCompatParcelizer();
        updateDisplayList updatedisplaylist = (updateDisplayList) dropShadowEffect.serializer;
        getRectManager.IconCompatParcelizer(updatedisplaylist, "datastore not initialized yet", new Object[0]);
        com.huawei.agconnect.config.impl.m mVar3 = (com.huawei.agconnect.config.impl.m) dropShadowEffect.MediaDescriptionCompat;
        getRectManager.IconCompatParcelizer(mVar3, "connectivityMonitor not initialized yet", new Object[0]);
        i_c.read = new getAccessibilityManager(visitnodesalcg6gq, pinnableContainerKtLocalPinnableContainer1, i$bRemoteActionCompatParcelizer, updatedisplaylist, gettextinputservice, mVar3);
        I$b i$bRemoteActionCompatParcelizer2 = i_c.RemoteActionCompatParcelizer();
        getAccessibilityManager getaccessibilitymanager = (getAccessibilityManager) i_c.read;
        getRectManager.IconCompatParcelizer(getaccessibilitymanager, "remoteStore not initialized yet", new Object[0]);
        i_c.RemoteActionCompatParcelizer = new ancestorToLocalS_NoaFU(i$bRemoteActionCompatParcelizer2, getaccessibilitymanager, setoffset);
        i_c.RatingCompat = new androidx.transition.TransitionValuesMaps(i_c.serializer());
        I$b i$b2 = (I$b) i_c.serializer;
        getLastLayerDrawingWasSkippedui getlastlayerdrawingwasskippeduiRemoteActionCompatParcelizer = ((getMinimumTouchTargetSizeNHjbRc) i$b2.IconCompatParcelizer).RemoteActionCompatParcelizer();
        ((headH91voCI) getlastlayerdrawingwasskippeduiRemoteActionCompatParcelizer.read).read(new RxWorker$1$$ExternalSyntheticLambda0(21, getlastlayerdrawingwasskippeduiRemoteActionCompatParcelizer), "build overlays");
        getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc2 = (getMinimumTouchTargetSizeNHjbRc) i$b2.IconCompatParcelizer;
        getminimumtouchtargetsizenhjbrc2.read(new findCommonAncestorui(i$b2, 0), "Start IndexManager");
        getminimumtouchtargetsizenhjbrc2.read(new findCommonAncestorui(i$b2, 1), "Start MutationQueue");
        ((getAccessibilityManager) i_c.read).write();
        getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc3 = (getMinimumTouchTargetSizeNHjbRc) i_c.IconCompatParcelizer;
        getRectManager.IconCompatParcelizer(getminimumtouchtargetsizenhjbrc3, "persistence not initialized yet", new Object[0]);
        i_c.MediaBrowserCompatMediaItem = new DiskLruCache$Editor((getLastLayerDrawingWasSkippedui) ((headH91voCI) getminimumtouchtargetsizenhjbrc3).RemoteActionCompatParcelizer.write, (getTextInputService) xVar.read, i_c.RemoteActionCompatParcelizer());
        getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc4 = (getMinimumTouchTargetSizeNHjbRc) i_c.IconCompatParcelizer;
        getRectManager.IconCompatParcelizer(getminimumtouchtargetsizenhjbrc4, "persistence not initialized yet", new Object[0]);
        i_c.MediaDescriptionCompat = new androidx.recyclerview.widget.ChildHelper(getminimumtouchtargetsizenhjbrc4, (getTextInputService) xVar.read, i_c.RemoteActionCompatParcelizer());
        getRectManager.IconCompatParcelizer((getMinimumTouchTargetSizeNHjbRc) i_c.IconCompatParcelizer, "persistence not initialized yet", new Object[0]);
        this.MediaDescriptionCompat = (setMeasureResultui) i_c.MediaBrowserCompatMediaItem;
        i_c.RemoteActionCompatParcelizer();
        getRectManager.IconCompatParcelizer((getAccessibilityManager) i_c.read, "remoteStore not initialized yet", new Object[0]);
        this.RatingCompat = i_c.serializer();
        androidx.transition.TransitionValuesMaps transitionValuesMaps = (androidx.transition.TransitionValuesMaps) i_c.RatingCompat;
        getRectManager.IconCompatParcelizer(transitionValuesMaps, "eventManager not initialized yet", new Object[0]);
        this.read = transitionValuesMaps;
        androidx.recyclerview.widget.ChildHelper childHelper = (androidx.recyclerview.widget.ChildHelper) i_c.MediaDescriptionCompat;
        setMeasureResultui setmeasureresultui = this.MediaDescriptionCompat;
        if (setmeasureresultui != null) {
            setmeasureresultui.v_();
        }
        if (childHelper != null) {
            ((colorResource) childHelper.serializer).v_();
        }
    }
}
