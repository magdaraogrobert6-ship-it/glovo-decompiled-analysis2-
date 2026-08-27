package com.deliveryhero.customerchat;

import android.content.Context;
import android.os.Build;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.room.Room;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.deliveryhero.chatui.view.root.CustomerChatActivity;
import com.deliveryhero.contract.model.PhoneCallType;
import com.deliveryhero.customerchat.commons.CustomerChatNotInitializedException;
import com.deliveryhero.customerchat.commons.UserChangedDuringChatOpenException;
import com.deliveryhero.customerchat.service.ChatService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.repository.ChatRepositoryImpl;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import io.sentry.JsonObjectSerializer;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.util.ComponentActivity;
import io.sentry.util.UrlUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidShadowContext;
import o.FocusTransactionsKtWhenMappings;
import o.GraphicsViewLayerCompanion;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22toBitmap2image11;
import o.LayerSnapshotV28GraphicsLayerPicture;
import o.LayerSnapshot_androidKt;
import o.OutlineVerificationHelper;
import o.ShortNewsContentCardView;
import o.accessgetLayerOutlineProvidercp;
import o.accessgetVcp;
import o.applyAlpha;
import o.applyLayoutDirection;
import o.dispatchDraw;
import o.forceLayout;
import o.getAmbientShadowColor;
import o.getCacheImplementationfwf_client_release;
import o.getConfigfwf_client_release;
import o.getHasNonTranslationComponentsannotations;
import o.getProvidedCachefwf_client_release;
import o.getSerializerfwf_client_release;
import o.getTrackingServicefwf_client_release;
import o.isAdapterPositionOnScreen;
import o.isIdentityannotations;
import o.lockHardwareCanvas;
import o.onBackInvokedlambda0;
import o.onImageAvailable;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requestLayout;
import o.resolveLockHardwareCanvasMethod;
import o.setOutlineSpotShadowColor;
import o.setSpotShadowColor;
import o.updateClipBounds;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerChatModule {
    public static volatile CustomerChatModule RemoteActionCompatParcelizer;
    public final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public final onViewDetachedFromWindowlambda1 MediaBrowserCompatMediaItem;
    public final onViewDetachedFromWindowlambda1 MediaDescriptionCompat;
    public final onViewDetachedFromWindowlambda1 MediaMetadataCompat;
    public final isAdapterPositionOnScreen MediaSessionCompatQueueItem;
    public final ContextScope MediaSessionCompatResultReceiverWrapper;
    public final onViewDetachedFromWindowlambda1 MediaSessionCompatToken;
    public final onViewDetachedFromWindowlambda1 ParcelableVolumeInfo;
    public final AtomicBoolean PlaybackStateCompat;
    public final onViewDetachedFromWindowlambda1 PlaybackStateCompatCustomAction;
    public final ContextScope RatingCompat;
    public final onViewDetachedFromWindowlambda1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final onViewDetachedFromWindowlambda1 read;
    public static final accessgetVcp write = new accessgetVcp(7);
    public static final String serializer = CustomerChatActivity.class.getName();

    public final ChatService IconCompatParcelizer() {
        return (ChatService) this.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
    }

    public final applyLayoutDirection RemoteActionCompatParcelizer() {
        return (applyLayoutDirection) this.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
    }

    public final LayerSnapshotV21 read() {
        return (LayerSnapshotV21) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    public CustomerChatModule(Context context) {
        List list = requestLayout.RemoteActionCompatParcelizer;
        list.getClass();
        int i = 1;
        FocusTransactionsKtWhenMappings focusTransactionsKtWhenMappings = new FocusTransactionsKtWhenMappings(context, i, list);
        getCacheImplementationfwf_client_release getcacheimplementationfwf_client_release = new getCacheImplementationfwf_client_release();
        focusTransactionsKtWhenMappings.invoke(getcacheimplementationfwf_client_release);
        getConfigfwf_client_release getconfigfwf_client_release = getcacheimplementationfwf_client_release.read;
        JsonObjectSerializer jsonObjectSerializer = getconfigfwf_client_release.read;
        jsonObjectSerializer.getClass();
        jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, "Create eager instances ...");
        long jNanoTime = System.nanoTime();
        ComponentActivity componentActivity = getconfigfwf_client_release.RemoteActionCompatParcelizer;
        HashMap map = (HashMap) componentActivity.read;
        Collection collectionValues = map.values();
        collectionValues.getClass();
        if (!collectionValues.isEmpty()) {
            getConfigfwf_client_release getconfigfwf_client_release2 = (getConfigfwf_client_release) componentActivity.serializer;
            ComponentActivity componentActivity2 = new ComponentActivity(getconfigfwf_client_release2.read, getconfigfwf_client_release2.IconCompatParcelizer.serializer, (getTrackingServicefwf_client_release) null);
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                ((getSerializerfwf_client_release) it.next()).serializer(componentActivity2);
            }
        }
        map.clear();
        jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, "Koin created eager instances in " + Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d).doubleValue() + " ms");
        Options.Companion.ParcelableVolumeInfo = getcacheimplementationfwf_client_release;
        this.PlaybackStateCompat = new AtomicBoolean(false);
        getConfigfwf_client_release getconfigfwf_client_release3 = (getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866);
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.SYNCHRONIZED;
        this.ParcelableVolumeInfo = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(getconfigfwf_client_release3.IconCompatParcelizer.serializer, 0));
        this.MediaSessionCompatQueueItem = new isAdapterPositionOnScreen(lockHardwareCanvas.serializer);
        this.MediaSessionCompatToken = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 2));
        this.read = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 3));
        this.IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 4));
        this.MediaBrowserCompatMediaItem = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 5));
        this.PlaybackStateCompatCustomAction = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 6));
        this.MediaDescriptionCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 7));
        this.MediaMetadataCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 8));
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, 9));
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new dispatchDraw(((getConfigfwf_client_release) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 2078535869, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[0], SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -2078535866)).IconCompatParcelizer.serializer, i));
        onBackInvokedlambda0 onbackinvokedlambda0Serializer = UrlUtils.serializer();
        ((setOutlineSpotShadowColor) onviewdetachedfromwindowlambda1Serializer.MediaSessionCompatResultReceiverWrapper()).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer, MainDispatcherLoader.read).plus(new forceLayout(this, 0)));
        onBackInvokedlambda0 onbackinvokedlambda0Serializer2 = UrlUtils.serializer();
        ((setOutlineSpotShadowColor) onviewdetachedfromwindowlambda1Serializer.MediaSessionCompatResultReceiverWrapper()).getClass();
        this.RatingCompat = YieldKt.RemoteActionCompatParcelizer(Room.read(onbackinvokedlambda0Serializer2, DefaultIoScheduler.RemoteActionCompatParcelizer).plus(new forceLayout(this, 1)));
    }

    public final void write() {
        LayerSnapshotV21 layerSnapshotV21 = read();
        if (layerSnapshotV21.write != null) {
            resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = layerSnapshotV21.write().userType;
            ((AndroidShadowContext) RemoteActionCompatParcelizer()).getClass();
            Build.MODEL.getClass();
            ((AndroidShadowContext) RemoteActionCompatParcelizer()).getClass();
            Build.MANUFACTURER.getClass();
            ((AndroidShadowContext) RemoteActionCompatParcelizer()).getClass();
            Build.VERSION.RELEASE.getClass();
            RemoteActionCompatParcelizer().getClass();
            String packageName = ((AndroidShadowContext) RemoteActionCompatParcelizer()).read.getPackageName();
            packageName.getClass();
            BuildersKt.RemoteActionCompatParcelizer(this.RatingCompat, null, null, new SimpleActor$offer$2(this, new applyAlpha(resolvelockhardwarecanvasmethod, packageName, ((AndroidShadowContext) RemoteActionCompatParcelizer()).write(), 546), (ShortNewsContentCardView) null, 9), 3);
        }
    }

    public final void write(LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11) {
        LayerSnapshotV21 layerSnapshotV21 = read();
        layerSnapshotV21.getClass();
        LayerSnapshotV28GraphicsLayerPicture layerSnapshotV28GraphicsLayerPicture = layerSnapshotV22toBitmap2image11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        layerSnapshotV21.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = layerSnapshotV28GraphicsLayerPicture != null ? layerSnapshotV28GraphicsLayerPicture.read() : layerSnapshotV21.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        OutlineVerificationHelper outlineVerificationHelper = layerSnapshotV22toBitmap2image11.write;
        if (outlineVerificationHelper == null) {
            outlineVerificationHelper = layerSnapshotV21.RemoteActionCompatParcelizer;
        }
        layerSnapshotV21.RemoteActionCompatParcelizer = outlineVerificationHelper;
        String str = layerSnapshotV22toBitmap2image11.RemoteActionCompatParcelizer;
        if (str == null) {
            str = layerSnapshotV21.read;
        }
        layerSnapshotV21.read = str;
        LayerSnapshot_androidKt layerSnapshot_androidKt = layerSnapshotV22toBitmap2image11.read;
        if (layerSnapshot_androidKt == null) {
            layerSnapshot_androidKt = layerSnapshotV21.write;
        }
        layerSnapshotV21.write = layerSnapshot_androidKt;
        layerSnapshotV21.MediaBrowserCompatMediaItem = layerSnapshotV21.MediaBrowserCompatMediaItem;
        List list = layerSnapshotV22toBitmap2image11.PlaybackStateCompat;
        if (list == null) {
            list = layerSnapshotV21.PlaybackStateCompatCustomAction;
        }
        layerSnapshotV21.PlaybackStateCompatCustomAction = list;
        PhoneCallType phoneCallType = layerSnapshotV22toBitmap2image11.MediaSessionCompatToken;
        if (phoneCallType == null) {
            phoneCallType = layerSnapshotV21.PlaybackStateCompat;
        }
        layerSnapshotV21.PlaybackStateCompat = phoneCallType;
        getAmbientShadowColor getambientshadowcolor = layerSnapshotV22toBitmap2image11.ResultReceiver;
        if (getambientshadowcolor == null) {
            getambientshadowcolor = layerSnapshotV21.MediaSessionCompatToken;
        }
        layerSnapshotV21.MediaSessionCompatToken = getambientshadowcolor;
        layerSnapshotV21.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = layerSnapshotV21.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        GraphicsViewLayerCompanion graphicsViewLayerCompanion = layerSnapshotV22toBitmap2image11.IconCompatParcelizer;
        if (graphicsViewLayerCompanion == null) {
            graphicsViewLayerCompanion = layerSnapshotV21.ResultReceiver;
        }
        layerSnapshotV21.ResultReceiver = graphicsViewLayerCompanion;
        MutableStateFlow mutableStateFlow = layerSnapshotV21.ComponentActivity;
        String strRemoteActionCompatParcelizer = layerSnapshotV22toBitmap2image11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (strRemoteActionCompatParcelizer == null) {
            strRemoteActionCompatParcelizer = layerSnapshotV21.RemoteActionCompatParcelizer();
        }
        mutableStateFlow.IconCompatParcelizer(strRemoteActionCompatParcelizer);
        String str2 = layerSnapshotV22toBitmap2image11.ParcelableVolumeInfo;
        if (str2 == null) {
            str2 = layerSnapshotV21.ParcelableVolumeInfo;
        }
        layerSnapshotV21.ParcelableVolumeInfo = str2;
        String str3 = layerSnapshotV22toBitmap2image11.MediaMetadataCompat;
        if (str3 == null) {
            str3 = layerSnapshotV21.RatingCompat;
        }
        layerSnapshotV21.RatingCompat = str3;
        String str4 = layerSnapshotV22toBitmap2image11.serializer;
        if (str4 == null) {
            str4 = layerSnapshotV21.IconCompatParcelizer;
        }
        layerSnapshotV21.IconCompatParcelizer = str4;
        Boolean bool = layerSnapshotV22toBitmap2image11.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        layerSnapshotV21.MediaSessionCompatResultReceiverWrapper = bool != null ? bool.booleanValue() : layerSnapshotV21.MediaSessionCompatResultReceiverWrapper;
        setSpotShadowColor setspotshadowcolor = layerSnapshotV22toBitmap2image11.ComponentActivity;
        if (setspotshadowcolor == null) {
            setspotshadowcolor = layerSnapshotV21.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        }
        layerSnapshotV21.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = setspotshadowcolor;
        Boolean bool2 = layerSnapshotV22toBitmap2image11.MediaSessionCompatQueueItem;
        layerSnapshotV21.MediaSessionCompatQueueItem = bool2 != null ? bool2.booleanValue() : layerSnapshotV21.MediaSessionCompatQueueItem;
        String str5 = layerSnapshotV22toBitmap2image11.MediaBrowserCompatMediaItem;
        if (str5 == null) {
            str5 = layerSnapshotV21.MediaMetadataCompat;
        }
        layerSnapshotV21.MediaMetadataCompat = str5;
        Boolean bool3 = layerSnapshotV22toBitmap2image11.MediaDescriptionCompat;
        layerSnapshotV21.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = bool3 != null ? bool3.booleanValue() : layerSnapshotV21.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        onImageAvailable onimageavailable = (onImageAvailable) this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
        onimageavailable.getClass();
        isIdentityannotations isidentityannotations = layerSnapshotV22toBitmap2image11.RatingCompat;
        if (isidentityannotations == null) {
            isidentityannotations = onimageavailable.serializer;
        }
        onimageavailable.serializer = isidentityannotations;
        ProtobufEncoder protobufEncoder = layerSnapshotV22toBitmap2image11.PlaybackStateCompatCustomAction;
        if (protobufEncoder == null) {
            protobufEncoder = onimageavailable.RemoteActionCompatParcelizer;
        }
        onimageavailable.RemoteActionCompatParcelizer = protobufEncoder;
        getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = layerSnapshotV22toBitmap2image11.MediaSessionCompatResultReceiverWrapper;
        if (gethasnontranslationcomponentsannotations == null) {
            gethasnontranslationcomponentsannotations = onimageavailable.read;
        }
        onimageavailable.read = gethasnontranslationcomponentsannotations;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(this.RatingCompat, null, null, new CustomerChatModule$fetchUserFeatures$1(this, shortNewsContentCardView, 1), 3);
        LayerSnapshot_androidKt layerSnapshot_androidKt2 = layerSnapshotV22toBitmap2image11.read;
        AtomicBoolean atomicBoolean = this.PlaybackStateCompat;
        if (layerSnapshot_androidKt2 != null || (read().write != null && !atomicBoolean.get())) {
            atomicBoolean.getAndSet(true);
        }
        LayerSnapshotV28GraphicsLayerPicture layerSnapshotV28GraphicsLayerPicture2 = layerSnapshotV22toBitmap2image11.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (layerSnapshotV28GraphicsLayerPicture2 != null) {
            CustomerChatActivity.RatingCompat.getClass();
            if (updateClipBounds.write()) {
                ((SessionDao_Impl$$ExternalSyntheticLambda1) layerSnapshotV28GraphicsLayerPicture2.serializer()).invoke(new UserChangedDuringChatOpenException());
            } else {
                ((n$$ExternalSyntheticLambda3) layerSnapshotV28GraphicsLayerPicture2.RemoteActionCompatParcelizer()).invoke();
            }
        }
        ChatService chatServiceIconCompatParcelizer = IconCompatParcelizer();
        LayerSnapshot_androidKt layerSnapshot_androidKt3 = read().write;
        chatServiceIconCompatParcelizer.getClass();
        BuildersKt.RemoteActionCompatParcelizer(chatServiceIconCompatParcelizer, null, null, new SimpleActor$offer$2(chatServiceIconCompatParcelizer, layerSnapshot_androidKt3, shortNewsContentCardView, 10), 3);
        write();
        BuildersKt.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, null, null, new CustomerChatModule$fetchUserFeatures$1(this, shortNewsContentCardView, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: sendMessage-_XzSiO8, reason: not valid java name */
    public final Object m4465sendMessage_XzSiO8(String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        accessgetLayerOutlineProvidercp accessgetlayeroutlineprovidercp;
        if (continuationImpl instanceof accessgetLayerOutlineProvidercp) {
            accessgetlayeroutlineprovidercp = (accessgetLayerOutlineProvidercp) continuationImpl;
            int i = accessgetlayeroutlineprovidercp.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessgetlayeroutlineprovidercp.write = i - Integer.MIN_VALUE;
            } else {
                accessgetlayeroutlineprovidercp = new accessgetLayerOutlineProvidercp(this, continuationImpl);
            }
        } else {
            accessgetlayeroutlineprovidercp = new accessgetLayerOutlineProvidercp(this, continuationImpl);
        }
        Object objSendMessage = accessgetlayeroutlineprovidercp.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessgetlayeroutlineprovidercp.write;
        boolean zBooleanValue = false;
        Object[] objArr = 0;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objSendMessage);
                if (!this.PlaybackStateCompat.get()) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new CustomerChatNotInitializedException());
                    return Boolean.FALSE;
                }
                serializer(new CustomerChatModule$sendMessage$2(str2, objArr == true ? 1 : 0));
                ChatService chatServiceIconCompatParcelizer = IconCompatParcelizer();
                accessgetlayeroutlineprovidercp.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                accessgetlayeroutlineprovidercp.write = 1;
                objSendMessage = ((ChatRepositoryImpl) chatServiceIconCompatParcelizer.write).sendMessage(str, accessgetlayeroutlineprovidercp);
                if (objSendMessage == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r8lambdaunavo3sxub_pc9xroryotnrlvsm = accessgetlayeroutlineprovidercp.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objSendMessage);
            }
            zBooleanValue = ((Boolean) objSendMessage).booleanValue();
        } catch (Throwable th) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(th);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = new LayerSnapshotV22toBitmap2image11();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(layerSnapshotV22toBitmap2image11);
        write(layerSnapshotV22toBitmap2image11);
    }
}
