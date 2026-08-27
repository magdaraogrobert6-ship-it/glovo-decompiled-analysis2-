package com.deliveryhero.selfServiceChat.data.chat.url.datastore;

import android.app.Application;
import androidx.lifecycle.BlockRunner$cancel$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.FocusTransactionsKt;
import o.LayerSnapshotV21;
import o.ShortNewsContentCardView;
import o.SurfaceUtils;
import o.VectorGroupiterator1;
import o.ViewLayerVerificationHelper31;
import o.accessgetChildrenp;
import o.createBrazeUserChangeEventSubscriberlambda00;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getDefaultStrokeLineJoin;
import o.getIt;
import o.prepareForActivityTransitionCarryover;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;
import o.setOutlineAmbientShadowColor;
import o.setOutlineSpotShadowColor;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatUrlDataStoreHelperImpl implements VectorGroupiterator1 {
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] serializer;
    public final FocusTransactionsKt IconCompatParcelizer;
    public final Application RemoteActionCompatParcelizer;
    public final setOutlineAmbientShadowColor write;

    public ChatUrlDataStoreHelperImpl(Application application, setOutlineSpotShadowColor setoutlinespotshadowcolor, setOutlineAmbientShadowColor setoutlineambientshadowcolor, getIt getit) {
        this.RemoteActionCompatParcelizer = application;
        this.write = setoutlineambientshadowcolor;
        this.IconCompatParcelizer = ExtrasKt.write("p2p_chat_url.json", getit);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getCachedChatURLConfig(long j, ContinuationImpl continuationImpl) throws Throwable {
        getDefaultStrokeLineJoin getdefaultstrokelinejoin;
        ChatUrlDataStoreHelperImpl chatUrlDataStoreHelperImpl;
        long j2;
        if (continuationImpl instanceof getDefaultStrokeLineJoin) {
            getdefaultstrokelinejoin = (getDefaultStrokeLineJoin) continuationImpl;
            int i = getdefaultstrokelinejoin.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                getdefaultstrokelinejoin.serializer = i - Integer.MIN_VALUE;
            } else {
                getdefaultstrokelinejoin = new getDefaultStrokeLineJoin(this, continuationImpl);
            }
        } else {
            getdefaultstrokelinejoin = new getDefaultStrokeLineJoin(this, continuationImpl);
        }
        Object objWithContext = getdefaultstrokelinejoin.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getdefaultstrokelinejoin.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1(this, shortNewsContentCardView, 23);
                getdefaultstrokelinejoin.read = this;
                getdefaultstrokelinejoin.IconCompatParcelizer = j;
                getdefaultstrokelinejoin.serializer = 1;
                objWithContext = BuildersKt.withContext(defaultIoScheduler, blockRunner$cancel$1, getdefaultstrokelinejoin);
                if (objWithContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chatUrlDataStoreHelperImpl = this;
                j2 = j;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = getdefaultstrokelinejoin.IconCompatParcelizer;
                chatUrlDataStoreHelperImpl = getdefaultstrokelinejoin.read;
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
            accessgetChildrenp accessgetchildrenp = (accessgetChildrenp) objWithContext;
            String str = accessgetchildrenp != null ? accessgetchildrenp.url : null;
            if (str != null && str.length() != 0) {
                if (j2 - accessgetchildrenp.timestamp > 3600000) {
                    throw ChatURLCacheExpiredException.serializer;
                }
                LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatUrlDataStoreHelperImpl.write).write();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessgetchildrenp.verificationToken, layerSnapshotV21Write != null ? layerSnapshotV21Write.RemoteActionCompatParcelizer() : null}, getCieXyz.write())).booleanValue()) {
                    throw VerificationTokenChangedException.IconCompatParcelizer;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessgetchildrenp.locale, layerSnapshotV21Write.RatingCompat}, getCieXyz.write())).booleanValue()) {
                    throw LocaleChangedException.write;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessgetchildrenp.orderID, layerSnapshotV21Write.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue()) {
                    throw OrderIDChangedException.read;
                }
                String str2 = accessgetchildrenp.p2pChatToken;
                SurfaceUtils surfaceUtils = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, surfaceUtils != null ? surfaceUtils.dhAuthToken : null}, getCieXyz.write())).booleanValue()) {
                    throw GCCAuthTokenChangedException.RemoteActionCompatParcelizer;
                }
                String str3 = accessgetchildrenp.hostPerseusSessionId;
                String str4 = layerSnapshotV21Write.MediaMetadataCompat;
                if (str4 == null) {
                    str4 = "";
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, str4}, getCieXyz.write())).booleanValue()) {
                    return accessgetchildrenp;
                }
                throw PerseusSessionIdChangedException.RemoteActionCompatParcelizer;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    static {
        createBrazeUserChangeEventSubscriberlambda00 createbrazeuserchangeeventsubscriberlambda00 = new createBrazeUserChangeEventSubscriberlambda00(ChatUrlDataStoreHelperImpl.class, "chatUrlDataStore", "getChatUrlDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        serializer = new registerInAppMessageManagerlambda2[]{createbrazeuserchangeeventsubscriberlambda00};
    }
}
