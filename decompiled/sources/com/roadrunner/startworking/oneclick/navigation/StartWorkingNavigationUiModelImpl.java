package com.roadrunner.startworking.oneclick.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.JsonObjectSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import o.SemanticsOwner;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.deleteRegisteredGeofenceCachelambda0;
import o.deleteRegisteredGeofenceCachelambda1;
import o.deserializeContentCardlambda1;
import o.dismissBannerlambda1;
import o.enableSdk;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getFeatureFlaglambda0;
import o.getQueryContext;
import o.getRootInfoui;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.logPushStoryPageClickedlambda10;
import o.onItemDismiss;
import o.removeNodeAtDepth;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class StartWorkingNavigationUiModelImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final CallTracer IconCompatParcelizer;
    public final SharedResourcePool MediaDescriptionCompat;
    public final transferSessionPackageI MediaSessionCompatQueueItem;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final JsonObjectSerializer read;
    public final getContentViewGroupParentLayout serializer;
    public final NetworkErrorMapperImpl write;

    public StartWorkingNavigationUiModelImpl(CallTracer callTracer, SharedResourcePool sharedResourcePool, NetworkErrorMapperImpl networkErrorMapperImpl, JsonObjectSerializer jsonObjectSerializer, transferSessionPackageI transfersessionpackagei, getQueryContext getquerycontext, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        callTracer.getClass();
        sharedResourcePool.getClass();
        networkErrorMapperImpl.getClass();
        jsonObjectSerializer.getClass();
        transfersessionpackagei.getClass();
        getquerycontext.getClass();
        getcontentviewgroupparentlayout.getClass();
        this.IconCompatParcelizer = callTracer;
        this.MediaDescriptionCompat = sharedResourcePool;
        this.write = networkErrorMapperImpl;
        this.read = jsonObjectSerializer;
        this.MediaSessionCompatQueueItem = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = getquerycontext;
        this.serializer = getcontentviewgroupparentlayout;
    }

    public final void serializer(StartWorkingNavAction startWorkingNavAction) {
        int i = 2 % 2;
        BuildersKt.RemoteActionCompatParcelizer(this.serializer, null, null, new RxConvertKt$asFlow$1(this, startWorkingNavAction, (ShortNewsContentCardView) null, 19), 3);
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[PHI: r3 r12
  0x00b4: PHI (r3v3 java.lang.Boolean) = (r3v2 java.lang.Boolean), (r3v6 java.lang.Boolean) binds: [B:28:0x00b2, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00b4: PHI (r12v11 java.lang.Object) = (r12v9 java.lang.Object), (r12v12 java.lang.Object) binds: [B:28:0x00b2, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    public static enableSdk serializer(dismissBannerlambda1 dismissbannerlambda1, String str) {
        Object obj;
        Object next;
        Object next2;
        Boolean boolWrite;
        int i = 2 % 2;
        List listWrite = dismissbannerlambda1.write();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listWrite) {
            if (obj2 instanceof getFeatureFlaglambda0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next).serializer(), str}, getCieXyz.write())).booleanValue());
        getFeatureFlaglambda0 getfeatureflaglambda0 = (getFeatureFlaglambda0) next;
        if (getfeatureflaglambda0 == null) {
            return null;
        }
        int i2 = MediaMetadataCompat + 9;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        List listRemoteActionCompatParcelizer = getfeatureflaglambda0.RemoteActionCompatParcelizer();
        if (listRemoteActionCompatParcelizer == null) {
            return null;
        }
        int i4 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        Iterator it2 = listRemoteActionCompatParcelizer.iterator();
        while (it2.hasNext()) {
            int i6 = MediaBrowserCompatMediaItem + 125;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            boolean zBooleanValue = false;
            if (i6 % 2 != 0) {
                next2 = it2.next();
                boolWrite = ((enableSdk) next2).write();
                int i7 = 60 / 0;
                if (boolWrite != null) {
                    zBooleanValue = boolWrite.booleanValue();
                }
            } else {
                next2 = it2.next();
                boolWrite = ((enableSdk) next2).write();
                if (boolWrite != null) {
                    zBooleanValue = boolWrite.booleanValue();
                }
            }
            if (zBooleanValue) {
                obj = next2;
                break;
            }
        }
        return (enableSdk) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    public static final Object access$fetchAndNavigate(StartWorkingNavigationUiModelImpl startWorkingNavigationUiModelImpl, StartWorkingNavAction startWorkingNavAction, ContinuationImpl continuationImpl) throws Throwable {
        logPushStoryPageClickedlambda10 logpushstorypageclickedlambda10;
        Object objM5138invokeIoAF18A;
        StartWorkingNavAction startWorkingNavAction2;
        Object next;
        List listRemoteActionCompatParcelizer;
        int i = 2 % 2;
        getQueryContext getquerycontext = startWorkingNavigationUiModelImpl.RemoteActionCompatParcelizer;
        if (continuationImpl instanceof logPushStoryPageClickedlambda10) {
            logpushstorypageclickedlambda10 = (logPushStoryPageClickedlambda10) continuationImpl;
            int i2 = logpushstorypageclickedlambda10.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logpushstorypageclickedlambda10.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                logpushstorypageclickedlambda10 = new logPushStoryPageClickedlambda10(startWorkingNavigationUiModelImpl, continuationImpl);
            }
        } else {
            logpushstorypageclickedlambda10 = new logPushStoryPageClickedlambda10(startWorkingNavigationUiModelImpl, continuationImpl);
        }
        Object obj = logpushstorypageclickedlambda10.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = logpushstorypageclickedlambda10.IconCompatParcelizer;
        Object obj2 = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CallTracer callTracer = startWorkingNavigationUiModelImpl.IconCompatParcelizer;
            logpushstorypageclickedlambda10.write = startWorkingNavAction;
            logpushstorypageclickedlambda10.IconCompatParcelizer = 1;
            objM5138invokeIoAF18A = callTracer.m5138invokeIoAF18A(logpushstorypageclickedlambda10);
            if (objM5138invokeIoAF18A == coroutineSingletons) {
                int i4 = MediaBrowserCompatMediaItem + 121;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 48 / 0;
                }
                return coroutineSingletons;
            }
            startWorkingNavAction2 = startWorkingNavAction;
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            startWorkingNavAction2 = logpushstorypageclickedlambda10.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5138invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM5138invokeIoAF18A instanceof isItemDismissable)) {
            int i6 = MediaBrowserCompatMediaItem + 65;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            dismissBannerlambda1 dismissbannerlambda1 = (dismissBannerlambda1) objM5138invokeIoAF18A;
            enableSdk enablesdkSerializer = serializer(dismissbannerlambda1, "vehicle");
            enableSdk enablesdkSerializer2 = serializer(dismissbannerlambda1, "bag");
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) startWorkingNavigationUiModelImpl.MediaSessionCompatQueueItem;
            firebaseRemoteConfigImpl.getClass();
            if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.WEB_VIEW_TNC_CONSENT_FLOW_ENABLED)) {
                if (enablesdkSerializer != null && enablesdkSerializer2 != null) {
                    List listWrite = dismissbannerlambda1.write();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listWrite) {
                        if (obj3 instanceof getFeatureFlaglambda0) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next).serializer(), "vehicle"}, getCieXyz.write())).booleanValue());
                    getFeatureFlaglambda0 getfeatureflaglambda0 = (getFeatureFlaglambda0) next;
                    List list = instance_delegatelambda0.write;
                    if (getfeatureflaglambda0 == null || (listRemoteActionCompatParcelizer = getfeatureflaglambda0.RemoteActionCompatParcelizer()) == null) {
                        listRemoteActionCompatParcelizer = list;
                    }
                    List listWrite2 = dismissbannerlambda1.write();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : listWrite2) {
                        if (obj4 instanceof getFeatureFlaglambda0) {
                            int i8 = MediaMetadataCompat + 109;
                            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 == 0) {
                                arrayList2.add(obj4);
                                throw null;
                            }
                            arrayList2.add(obj4);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int i9 = MediaMetadataCompat + 121;
                        MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) it2.next()).serializer(), "bag"}, getCieXyz.write())).booleanValue();
                            throw null;
                        }
                        Object next2 = it2.next();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getFeatureFlaglambda0) next2).serializer(), "bag"}, getCieXyz.write())).booleanValue()) {
                            obj2 = next2;
                            break;
                        }
                    }
                    getFeatureFlaglambda0 getfeatureflaglambda1 = (getFeatureFlaglambda0) obj2;
                    if (getfeatureflaglambda1 != null) {
                        int i10 = MediaMetadataCompat + 125;
                        MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        List listRemoteActionCompatParcelizer2 = getfeatureflaglambda1.RemoteActionCompatParcelizer();
                        if (listRemoteActionCompatParcelizer2 != null) {
                            int i12 = MediaMetadataCompat + 7;
                            MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
                            if (i12 % 2 == 0) {
                                int i13 = 16 / 0;
                            }
                            list = listRemoteActionCompatParcelizer2;
                        }
                    }
                    if (listRemoteActionCompatParcelizer.size() <= 1 && list.size() <= 1) {
                        getquerycontext.serializer(new deleteRegisteredGeofenceCachelambda0(startWorkingNavAction2));
                    }
                }
                getquerycontext.serializer(new deleteRegisteredGeofenceCachelambda1(startWorkingNavAction2));
            } else if (enablesdkSerializer == null || enablesdkSerializer2 == null) {
                getquerycontext.serializer(new deleteRegisteredGeofenceCachelambda1(startWorkingNavAction2));
            } else {
                getquerycontext.serializer(new deleteRegisteredGeofenceCachelambda0(startWorkingNavAction2));
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5138invokeIoAF18A);
        if (thSerializer != null) {
            ((getRootInfoui) ((SemanticsOwner) startWorkingNavigationUiModelImpl.MediaDescriptionCompat.IconCompatParcelizer)).RemoteActionCompatParcelizer("start_working_time_to_interactive");
            getquerycontext.serializer(new deserializeContentCardlambda1(startWorkingNavigationUiModelImpl.write.read(thSerializer)));
        }
        return createFromParcel.INSTANCE;
    }
}
