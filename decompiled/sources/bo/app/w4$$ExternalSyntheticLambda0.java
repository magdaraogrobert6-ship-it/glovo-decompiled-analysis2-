package bo.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.ChildHelper;
import androidx.work.impl.WorkManagerImpl;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.braze.ui.banners.BannerView;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.material.datepicker.DateFormatTextWatcher;
import com.google.android.material.datepicker.SingleDateSelector;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.AbtExperimentInfo;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.zp;
import com.logistics.rider.glovo.R;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.roadrunner.web.performance.WebViewInitializer;
import com.sentiance.core.model.events.I$b;
import io.grpc.Status;
import io.sentry.HostnameCache$$ExternalSyntheticLambda1;
import io.sentry.SentryTracer$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.AndroidAccessibilityManagerCompanion;
import o.CombinedClickableNodehandleDownEvent2;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DrawableTransformation;
import o.EnumC0151autofill;
import o.ExecutorC0208textInputSession;
import o.Owner;
import o.ParentDataModifierDefaultImpls;
import o.ReflectionUtils;
import o.access500;
import o.accessaddNotificationForSysPropsChange;
import o.accessgetApparentToRealOffsetnOccac;
import o.accessgetApplyPausedcp;
import o.accessgetDeactivateOutOfFramecp;
import o.accessgetDrawBlockCanvasp;
import o.accessset_measureResult;
import o.asList;
import o.calculateMinimumTouchTargetPaddingE7KxVPU;
import o.component5kKHJgLs;
import o.createFromParcel;
import o.decrementKeepScreenOnCount;
import o.getAccessibilityManager;
import o.getClipMetadata;
import o.getColor;
import o.getDefaultShadowColor;
import o.getInternalCanvasannotations;
import o.getLastClipui;
import o.getMinimumTouchTargetSizeNHjbRc;
import o.getParent;
import o.getRectManager;
import o.getTextToolbar;
import o.getWindowInfo;
import o.isFiniteannotations;
import o.mapMKHz9U;
import o.movegyyYBs;
import o.onCheckIsTextEditor;
import o.onEndApplyChanges;
import o.onInteropViewLayoutChange;
import o.packui;
import o.r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdakcTilwmporjFCAWe8ASdQv1Ks;
import o.r8lambdazzuqe02XBR43ox0o_9r6taqg;
import o.rememberGraphicsLayer;
import o.reuseLayer;
import o.scaledRadiiRect;
import o.setLastShapeui;
import o.setPositiongyyYBs;
import o.toAndroidBlendModes9anfk8;
import o.updateDisplayList;
import o.visitNodes;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w4$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ w4$$ExternalSyntheticLambda0(toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8, View view, Rect rect) {
        this.$r8$classId = 3;
        this.f$0 = view;
        this.f$1 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2;
        Set<String> setUnmodifiableSet;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                w4.a((Bitmap) this.f$0, (ImageView) this.f$1);
                return;
            case 1:
                CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = (CombinedClickableNodehandleDownEvent2) this.f$0;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f$1;
                SurfaceRequest surfaceRequest2 = combinedClickableNodehandleDownEvent2.MediaDescriptionCompat;
                if (surfaceRequest2 == null || surfaceRequest2 != surfaceRequest) {
                    previewView$1$$ExternalSyntheticLambda2 = null;
                } else {
                    previewView$1$$ExternalSyntheticLambda2 = null;
                    combinedClickableNodehandleDownEvent2.MediaDescriptionCompat = null;
                    combinedClickableNodehandleDownEvent2.MediaSessionCompatQueueItem = null;
                }
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda3 = combinedClickableNodehandleDownEvent2.MediaMetadataCompat;
                if (previewView$1$$ExternalSyntheticLambda3 != null) {
                    previewView$1$$ExternalSyntheticLambda3.serializer();
                    combinedClickableNodehandleDownEvent2.MediaMetadataCompat = previewView$1$$ExternalSyntheticLambda2;
                    return;
                }
                return;
            case 2:
                ((isFiniteannotations) this.f$0).serializer((getInternalCanvasannotations) this.f$1);
                return;
            case 3:
                toAndroidBlendModes9anfk8.RemoteActionCompatParcelizer((View) this.f$0, (Rect) this.f$1);
                return;
            case 4:
                scaledRadiiRect scaledradiirect = (scaledRadiiRect) this.f$0;
                ViewGroup viewGroup = (ViewGroup) this.f$1;
                viewGroup.getClass();
                Iterator it = scaledradiirect.ParcelableVolumeInfo.iterator();
                while (it.hasNext()) {
                    getInternalCanvasannotations getinternalcanvasannotations = ((component5kKHJgLs) it.next()).RemoteActionCompatParcelizer;
                    View view = getinternalcanvasannotations.RemoteActionCompatParcelizer.getView();
                    if (view != null) {
                        getinternalcanvasannotations.serializer.applyState(view, viewGroup);
                    }
                }
                return;
            case 5:
                SentryTracer$$ExternalSyntheticLambda1 sentryTracer$$ExternalSyntheticLambda1 = (SentryTracer$$ExternalSyntheticLambda1) this.f$0;
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = (accessgetApparentToRealOffsetnOccac) sentryTracer$$ExternalSyntheticLambda1.serializer;
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                boolean z2 = accessgetapparenttorealoffsetnoccac.read;
                forest.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("ViewCompat.startUpWebView succeeded. shouldRunUiThreadStartUpTasks: ", z2), new Object[0]);
                WebViewInitializer webViewInitializer = (WebViewInitializer) accessgetapparenttorealoffsetnoccac.serializer;
                if (z2) {
                    webViewInitializer.RemoteActionCompatParcelizer.set(true);
                    webViewInitializer.IconCompatParcelizer.set(true);
                } else {
                    webViewInitializer.RemoteActionCompatParcelizer.set(true);
                }
                webViewInitializer.serializer.set(false);
                ((CancellableContinuationImpl) accessgetapparenttorealoffsetnoccac.write).resumeWith(createFromParcel.INSTANCE);
                return;
            case 6:
                getDefaultShadowColor getdefaultshadowcolor = (getDefaultShadowColor) this.f$0;
                mapMKHz9U mapmkhz9u = (mapMKHz9U) this.f$1;
                synchronized (getdefaultshadowcolor.MediaMetadataCompat) {
                    Iterator it2 = getdefaultshadowcolor.MediaDescriptionCompat.iterator();
                    while (it2.hasNext()) {
                        ((rememberGraphicsLayer) it2.next()).write(mapmkhz9u, false);
                    }
                    break;
                }
                return;
            case 7:
                List list = (List) this.f$0;
                getColor getcolor = (getColor) this.f$1;
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((getParent) it3.next()).write(getcolor.IconCompatParcelizer);
                }
                return;
            case 8:
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.f$0;
                String string = ((UUID) this.f$1).toString();
                string.getClass();
                LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 676120041, -676120040, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{workManagerImpl, string});
                return;
            case 9:
                ((ActivityHandler) this.f$0).lambda$trackThirdPartySharing$37((AdjustThirdPartySharing) this.f$1);
                return;
            case 10:
                ((ActivityHandler) this.f$0).lambda$new$2((AdjustConfig) this.f$1);
                return;
            case 11:
                ((BannerView) this.f$0).loadHtmlData((String) this.f$1);
                return;
            case 12:
                DefaultInAppMessageViewWrapper.ViewOnLayoutChangeListenerC00842.onLayoutChange$lambda$1((DefaultInAppMessageViewWrapper) this.f$0, (ViewGroup) this.f$1);
                return;
            case 13:
                DateFormatTextWatcher dateFormatTextWatcher = (DateFormatTextWatcher) this.f$0;
                String str = (String) this.f$1;
                TextInputLayout textInputLayout = dateFormatTextWatcher.MediaDescriptionCompat;
                SimpleDateFormat simpleDateFormat = dateFormatTextWatcher.IconCompatParcelizer;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), str.replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(accessgetDeactivateOutOfFramecp.write().getTimeInMillis())).replace(' ', (char) 160)));
                accessgetApplyPausedcp accessgetapplypausedcp = (accessgetApplyPausedcp) dateFormatTextWatcher;
                SingleDateSelector singleDateSelector = accessgetapplypausedcp.MediaSessionCompatQueueItem;
                accessgetapplypausedcp.MediaMetadataCompat.getError();
                singleDateSelector.getClass();
                accessgetapplypausedcp.MediaSessionCompatResultReceiverWrapper.read();
                return;
            case 14:
                Callable callable = (Callable) this.f$0;
                accessset_measureResult accessset_measureresult = (accessset_measureResult) ((CreateHomeScope) this.f$1).read;
                try {
                    accessset_measureresult.write(callable.call());
                    return;
                } catch (Exception e) {
                    accessset_measureresult.IconCompatParcelizer((Throwable) e);
                    return;
                }
            case 15:
                ((CrashlyticsCore) this.f$0).serializer((access500) this.f$1);
                return;
            case 16:
                I$b i$b = (I$b) this.f$0;
                getClipMetadata getclipmetadata = (getClipMetadata) this.f$1;
                ChildHelper childHelper = (ChildHelper) i$b.serializer;
                childHelper.getClass();
                getclipmetadata.getClass();
                childHelper.MediaSessionCompatQueueItem = getclipmetadata;
                childHelper.RemoteActionCompatParcelizer();
                return;
            case 17:
                I$b i$b2 = (I$b) this.f$0;
                ArrayList<getLastClipui> arrayList = (ArrayList) this.f$1;
                SparseArray sparseArray = (SparseArray) i$b2.MediaSessionCompatResultReceiverWrapper;
                i$d i_d = (i$d) i$b2.MediaMetadataCompat;
                for (getLastClipui getlastclipui : arrayList) {
                    int i = getlastclipui.RemoteActionCompatParcelizer;
                    asList aslist = getlastclipui.serializer;
                    i_d.getClass();
                    Iterator it4 = aslist.iterator();
                    while (true) {
                        zzkh zzkhVar = (zzkh) it4;
                        if (((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                            calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu = new calculateMinimumTouchTargetPaddingE7KxVPU((visitNodes) zzkhVar.next(), i);
                            i_d.serializer = ((asList) i_d.serializer).IconCompatParcelizer((Object) calculateminimumtouchtargetpaddinge7kxvpu);
                            i_d.read = ((asList) i_d.read).IconCompatParcelizer((Object) calculateminimumtouchtargetpaddinge7kxvpu);
                        } else {
                            asList aslist2 = getlastclipui.read;
                            Iterator it5 = aslist2.iterator();
                            while (true) {
                                zzkh zzkhVar2 = (zzkh) it5;
                                if (((Iterator) zzkhVar2.RemoteActionCompatParcelizer).hasNext()) {
                                    ((getMinimumTouchTargetSizeNHjbRc) i$b2.IconCompatParcelizer).write().read((visitNodes) zzkhVar2.next());
                                } else {
                                    Iterator it6 = aslist2.iterator();
                                    while (true) {
                                        zzkh zzkhVar3 = (zzkh) it6;
                                        if (((Iterator) zzkhVar3.RemoteActionCompatParcelizer).hasNext()) {
                                            calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu2 = new calculateMinimumTouchTargetPaddingE7KxVPU((visitNodes) zzkhVar3.next(), i);
                                            i_d.serializer = ((asList) i_d.serializer).read(calculateminimumtouchtargetpaddinge7kxvpu2);
                                            i_d.read = ((asList) i_d.read).read(calculateminimumtouchtargetpaddinge7kxvpu2);
                                        } else {
                                            if (!getlastclipui.write) {
                                                setLastShapeui setlastshapeui = (setLastShapeui) sparseArray.get(i);
                                                getRectManager.RemoteActionCompatParcelizer(setlastshapeui != null ? true : z, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(i));
                                                SnapshotVersion snapshotVersion = setlastshapeui.RatingCompat;
                                                setLastShapeui setlastshapeui2 = new setLastShapeui(setlastshapeui.MediaBrowserCompatMediaItem, setlastshapeui.MediaSessionCompatQueueItem, setlastshapeui.read, setlastshapeui.IconCompatParcelizer, snapshotVersion, snapshotVersion, setlastshapeui.write, setlastshapeui.serializer);
                                                sparseArray.put(i, setlastshapeui2);
                                                if (I$b.RemoteActionCompatParcelizer(setlastshapeui, setlastshapeui2, null)) {
                                                    ((SQLiteTargetCache) i$b2.MediaBrowserCompatMediaItem).write(setlastshapeui2);
                                                }
                                            }
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            case 18:
                zp zpVar = (zp) this.f$0;
                r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA r8lambdaqn1du6uas6agx4srbugfttxtpwa = (r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA) this.f$1;
                reuseLayer reuselayer = (reuseLayer) zpVar.IconCompatParcelizer;
                if (onEndApplyChanges.RemoteActionCompatParcelizer()) {
                    HashMap map = new HashMap();
                    if (r8lambdaqn1du6uas6agx4srbugfttxtpwa.RemoteActionCompatParcelizer == 0) {
                        setUnmodifiableSet = Collections.EMPTY_SET;
                    } else {
                        HashSet hashSet = new HashSet(r8lambdaqn1du6uas6agx4srbugfttxtpwa.RemoteActionCompatParcelizer);
                        for (int i2 = 0; i2 < r8lambdaqn1du6uas6agx4srbugfttxtpwa.RemoteActionCompatParcelizer; i2++) {
                            hashSet.add(new String(r8lambdaqn1du6uas6agx4srbugfttxtpwa.write(i2), 0));
                        }
                        setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                    }
                    for (String str2 : setUnmodifiableSet) {
                        if (updateDisplayList.write.contains(str2.toLowerCase(Locale.ENGLISH))) {
                            r8lambdakcTilwmporjFCAWe8ASdQv1Ks r8lambdakctilwmporjfcawe8asdqv1ks = r8lambdaQn1du6uAs6agX4sRbUGFttxTPWA.IconCompatParcelizer;
                            BitSet bitSet = r8lambdazzuqe02XBR43ox0o_9r6taqg.serializer;
                            map.put(str2, (String) r8lambdaqn1du6uas6agx4srbugfttxtpwa.read(new ReflectionUtils(str2, r8lambdakctilwmporjfcawe8asdqv1ks)));
                        }
                    }
                    if (map.isEmpty()) {
                        return;
                    }
                    onEndApplyChanges.read(reuselayer.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(reuselayer)), map);
                    return;
                }
                return;
            case 19:
                zp zpVar2 = (zp) this.f$0;
                Status status = (Status) this.f$1;
                boolean zIconCompatParcelizer = status.IconCompatParcelizer();
                reuseLayer reuselayer2 = (reuseLayer) zpVar2.IconCompatParcelizer;
                if (zIconCompatParcelizer) {
                    onEndApplyChanges.read(reuselayer2.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(reuselayer2)));
                } else {
                    onEndApplyChanges.RemoteActionCompatParcelizer(reuselayer2.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(reuselayer2)), status);
                }
                getRectManager.RemoteActionCompatParcelizer(reuselayer2.IconCompatParcelizer(), "Can't handle server close on non-started stream!", new Object[0]);
                reuselayer2.write(decrementKeepScreenOnCount.Error, status);
                return;
            case 20:
                getAccessibilityManager getaccessibilitymanager = (getAccessibilityManager) this.f$0;
                Owner owner = (Owner) this.f$1;
                zzm zzmVar = getaccessibilitymanager.read;
                if (owner.equals(Owner.REACHABLE) && ((accessgetDrawBlockCanvasp) zzmVar.IconCompatParcelizer).equals(accessgetDrawBlockCanvasp.ONLINE)) {
                    return;
                }
                if (!(owner.equals(Owner.UNREACHABLE) && ((accessgetDrawBlockCanvasp) zzmVar.IconCompatParcelizer).equals(accessgetDrawBlockCanvasp.OFFLINE)) && getaccessibilitymanager.write) {
                    onEndApplyChanges.read("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                    getaccessibilitymanager.serializer();
                    return;
                }
                return;
            case 21:
                ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.f$0;
                try {
                    ((HostnameCache$$ExternalSyntheticLambda1) this.f$1).call();
                    parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
                    return;
                } catch (Exception e2) {
                    parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e2);
                    DrawableTransformation.read((Throwable) e2);
                    return;
                }
            case 22:
                Runnable runnable = (Runnable) this.f$0;
                getWindowInfo getwindowinfo = (getWindowInfo) this.f$1;
                try {
                    runnable.run();
                    return;
                } finally {
                    ((getTextToolbar) getwindowinfo).IconCompatParcelizer.release();
                }
            case 23:
                onInteropViewLayoutChange oninteropviewlayoutchange = (onInteropViewLayoutChange) this.f$0;
                movegyyYBs movegyyybs = (movegyyYBs) this.f$1;
                oninteropviewlayoutchange.getClass();
                oninteropviewlayoutchange.write = new Date().getTime();
                movegyyybs.run();
                return;
            case 24:
                ExecutorC0208textInputSession executorC0208textInputSession = (ExecutorC0208textInputSession) this.f$0;
                ((Runnable) this.f$1).run();
                executorC0208textInputSession.IconCompatParcelizer.release();
                return;
            case 25:
                packui packuiVar = (packui) this.f$0;
                ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload = (ExperimentPayloadProto$ExperimentPayload) this.f$1;
                packuiVar.getClass();
                try {
                    experimentPayloadProto$ExperimentPayload.toString();
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
                    FirebaseABTesting firebaseABTesting = packuiVar.IconCompatParcelizer;
                    AbtExperimentInfo abtExperimentInfo = new AbtExperimentInfo(experimentPayloadProto$ExperimentPayload.getExperimentId(), experimentPayloadProto$ExperimentPayload.getVariantId(), experimentPayloadProto$ExperimentPayload.getTriggerEvent(), new Date(experimentPayloadProto$ExperimentPayload.getExperimentStartTimeMillis()), experimentPayloadProto$ExperimentPayload.getTriggerTimeoutMillis(), experimentPayloadProto$ExperimentPayload.getTimeToLiveMillis());
                    firebaseABTesting.IconCompatParcelizer();
                    AbtExperimentInfo.write(abtExperimentInfo.RemoteActionCompatParcelizer());
                    ArrayList arrayList2 = new ArrayList();
                    HashMap mapRemoteActionCompatParcelizer = abtExperimentInfo.RemoteActionCompatParcelizer();
                    mapRemoteActionCompatParcelizer.remove("triggerEvent");
                    arrayList2.add(AbtExperimentInfo.RemoteActionCompatParcelizer(mapRemoteActionCompatParcelizer));
                    firebaseABTesting.read(arrayList2);
                    return;
                } catch (AbtException e3) {
                    SentryLogcatAdapter.serializer("FIAM.Headless", "Unable to set experiment as active with ABT, missing analytics?\n" + e3.getMessage());
                    return;
                }
            case 26:
                ((FirebaseMessaging) this.f$0).lambda$deleteToken$9((ParentDataModifierDefaultImpls) this.f$1);
                return;
            case 27:
                AndroidAccessibilityManagerCompanion androidAccessibilityManagerCompanion = (AndroidAccessibilityManagerCompanion) this.f$0;
                ParentDataModifierDefaultImpls parentDataModifierDefaultImpls2 = (ParentDataModifierDefaultImpls) this.f$1;
                try {
                    parentDataModifierDefaultImpls2.IconCompatParcelizer(androidAccessibilityManagerCompanion.read());
                    return;
                } catch (Exception e4) {
                    parentDataModifierDefaultImpls2.RemoteActionCompatParcelizer(e4);
                    return;
                }
            case 28:
                ((AppStartTrace) this.f$0).r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.serializer((TraceMetric) ((onCheckIsTextEditor) this.f$1).serializer(), EnumC0151autofill.FOREGROUND_BACKGROUND);
                return;
            default:
                ((setPositiongyyYBs) this.f$0).RemoteActionCompatParcelizer((accessaddNotificationForSysPropsChange) this.f$1);
                return;
        }
    }

    public /* synthetic */ w4$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
