package androidx.datastore.core;

import android.app.Activity;
import android.app.Application;
import android.util.Base64;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.material3.FloatingActionButtonElevationAnimatable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.Fields;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.coroutines.PassthroughConnection;
import androidx.work.CoroutineWorker$startWork$1;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.customerchat.service.ChatService;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.data.remote.api.model.HitsRequest;
import com.deliveryhero.perseus.hits.PerseusWorker;
import com.deliveryhero.perseus.hits.usecase.PerseusSendHitUseCase;
import com.deliveryhero.perseus.logger.DatabaseInfoLogger;
import com.foodora.courier.freshchat.DispatcherChatOrderLogger;
import com.foodora.courier.legacy.ui.main.PushTokenUpdateViewModel;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appupdate.PlayStoreBasedAppUpdate;
import com.roadrunner.auth.domain.logout.LogoutLifecycleCallbacksImpl;
import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadConfig;
import com.roadrunner.customerchat.usecase.TriggerChatAssetsDownloading;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import io.sentry.util.UrlUtils;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidComposeViewlocaleList2;
import o.BaselineShiftSaverlambda0;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.InnerShadowRendererProviderCompanion;
import o.JvmAnnotatedString_jvmAndAndroidKt;
import o.LayerSnapshot_androidKt;
import o.LinkAnnotation;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.accessisRenderNodeCompatiblecp;
import o.addInterval;
import o.applyAlpha;
import o.createFromParcel;
import o.fromColorLong;
import o.getBluntfpxItnM;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getLinkInteractionListener;
import o.getNativeEventui;
import o.getParagraphInfoListui_text;
import o.getTextAlignbuA522U;
import o.getTextAligne0LSkKk;
import o.getTouchaOaMEAU;
import o.isOpenInternalroom_runtime;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.removeScheduledCallback;
import o.swap;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor$offer$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static byte IconCompatParcelizer = -112;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(Calendar calendar, int i, Extras$Key extras$Key, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = 13;
        this.serializer = calendar;
        this.read = i;
        this.RemoteActionCompatParcelizer = extras$Key;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleActor$offer$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleActor$offer$2(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2, ShortNewsContentCardView shortNewsContentCardView, PushTokenUpdateViewModel pushTokenUpdateViewModel) {
        super(2, shortNewsContentCardView);
        this.write = 17;
        this.serializer = stateProviderImpl$special$$inlined$map$2;
        this.RemoteActionCompatParcelizer = pushTokenUpdateViewModel;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ IconCompatParcelizer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    private final Object invokeSuspend$com$roadrunner$customerchat$usecase$CustomerChatPreloadingObserverImpl$onCreate$1(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 != 0) {
            int i5 = RatingCompat + 41;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.serializer;
            toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
            CoroutineWorker$startWork$1 coroutineWorker$startWork$1 = new CoroutineWorker$startWork$1((getTextAligne0LSkKk) this.RemoteActionCompatParcelizer, shortNewsContentCardView, 15);
            this.read = 1;
            if (UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, coroutineWorker$startWork$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    private final Object invokeSuspend$com$roadrunner$customerchat$usecase$ChatAssetDownloadingObserverImpl$onCreate$1$1$1(Object obj) throws Throwable {
        Object objInvoke;
        getParagraphInfoListui_text getparagraphinfolistui_text;
        Object objInvoke2;
        getLinkInteractionListener getlinkinteractionlistener;
        Object[] objArr;
        TriggerChatAssetsDownloading triggerChatAssetsDownloading;
        String strIconCompatParcelizer;
        String strSerializer;
        String strRemoteActionCompatParcelizer;
        String strSerializer2;
        String str;
        List listRemoteActionCompatParcelizer;
        int i = 2 % 2;
        getTextAlignbuA522U gettextalignbua522u = (getTextAlignbuA522U) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            removeScheduledCallback removescheduledcallbackSerializer = gettextalignbua522u.read.serializer();
            removescheduledcallbackSerializer.getClass();
            if (removescheduledcallbackSerializer != removeScheduledCallback.WEB_ASSET_CACHE_LOADING) {
                int i3 = MediaSessionCompatQueueItem + 73;
                RatingCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (removescheduledcallbackSerializer != removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER && removescheduledcallbackSerializer != removeScheduledCallback.WEB_ASSET_CACHE_LOADING_LOCAL_WEB_SERVER_SSG) {
                    return createfromparcel;
                }
            }
            if (gettextalignbua522u.MediaDescriptionCompat.write()) {
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = gettextalignbua522u.serializer;
                this.read = 1;
                if (initializeAppStartupItemsImpl.invoke(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objInvoke = obj;
                getparagraphinfolistui_text = (getParagraphInfoListui_text) objInvoke;
                if (getparagraphinfolistui_text != null) {
                    InitializeAppStartupItemsImpl initializeAppStartupItemsImpl2 = gettextalignbua522u.MediaBrowserCompatMediaItem;
                    String strIconCompatParcelizer2 = getparagraphinfolistui_text.IconCompatParcelizer();
                    String strSerializer3 = getparagraphinfolistui_text.serializer();
                    String strRemoteActionCompatParcelizer2 = getparagraphinfolistui_text.RemoteActionCompatParcelizer();
                    String str2 = (String) gettextalignbua522u.RemoteActionCompatParcelizer.write.serializer.MediaSessionCompatResultReceiverWrapper();
                    this.serializer = getparagraphinfolistui_text;
                    this.read = 3;
                    objInvoke2 = initializeAppStartupItemsImpl2.invoke(strIconCompatParcelizer2, strSerializer3, strRemoteActionCompatParcelizer2, str2, this);
                    if (objInvoke2 == coroutineSingletons) {
                        int i5 = MediaSessionCompatQueueItem + 91;
                        RatingCompat = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    }
                    return coroutineSingletons;
                }
                int i7 = RatingCompat + 15;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return createfromparcel;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = MediaSessionCompatQueueItem + 81;
                RatingCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i10 = 44 / 0;
                return createfromparcel;
            }
            getParagraphInfoListui_text getparagraphinfolistui_text2 = (getParagraphInfoListui_text) this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getparagraphinfolistui_text = getparagraphinfolistui_text2;
            objInvoke2 = obj;
        }
        getlinkinteractionlistener = (getLinkInteractionListener) objInvoke2;
        objArr = new Object[]{getlinkinteractionlistener, JvmAnnotatedString_jvmAndAndroidKt.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (getlinkinteractionlistener instanceof LinkAnnotation) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            triggerChatAssetsDownloading = gettextalignbua522u.MediaMetadataCompat;
            strIconCompatParcelizer = getparagraphinfolistui_text.IconCompatParcelizer();
            strSerializer = getparagraphinfolistui_text.serializer();
            strRemoteActionCompatParcelizer = getparagraphinfolistui_text.RemoteActionCompatParcelizer();
            LinkAnnotation linkAnnotation = (LinkAnnotation) getlinkinteractionlistener;
            strSerializer2 = linkAnnotation.serializer();
            str = getparagraphinfolistui_text.read();
            listRemoteActionCompatParcelizer = linkAnnotation.RemoteActionCompatParcelizer();
            this.serializer = null;
            this.read = 4;
            if (triggerChatAssetsDownloading.invoke(strIconCompatParcelizer, strSerializer, strRemoteActionCompatParcelizer, strSerializer2, str, listRemoteActionCompatParcelizer, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
        GetChatAssetDownloadConfig getChatAssetDownloadConfig = gettextalignbua522u.IconCompatParcelizer;
        this.read = 2;
        objInvoke = getChatAssetDownloadConfig.invoke(this);
        if (objInvoke != coroutineSingletons) {
            getparagraphinfolistui_text = (getParagraphInfoListui_text) objInvoke;
            if (getparagraphinfolistui_text != null) {
                int i11 = RatingCompat + 15;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            } else {
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl3 = gettextalignbua522u.MediaBrowserCompatMediaItem;
                String strIconCompatParcelizer3 = getparagraphinfolistui_text.IconCompatParcelizer();
                String strSerializer4 = getparagraphinfolistui_text.serializer();
                String strRemoteActionCompatParcelizer3 = getparagraphinfolistui_text.RemoteActionCompatParcelizer();
                String str3 = (String) gettextalignbua522u.RemoteActionCompatParcelizer.write.serializer.MediaSessionCompatResultReceiverWrapper();
                this.serializer = getparagraphinfolistui_text;
                this.read = 3;
                objInvoke2 = initializeAppStartupItemsImpl3.invoke(strIconCompatParcelizer3, strSerializer4, strRemoteActionCompatParcelizer3, str3, this);
                if (objInvoke2 == coroutineSingletons) {
                    int i13 = MediaSessionCompatQueueItem + 91;
                    RatingCompat = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                } else {
                    getlinkinteractionlistener = (getLinkInteractionListener) objInvoke2;
                    objArr = new Object[]{getlinkinteractionlistener, JvmAnnotatedString_jvmAndAndroidKt.read};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        if (getlinkinteractionlistener instanceof LinkAnnotation) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        triggerChatAssetsDownloading = gettextalignbua522u.MediaMetadataCompat;
                        strIconCompatParcelizer = getparagraphinfolistui_text.IconCompatParcelizer();
                        strSerializer = getparagraphinfolistui_text.serializer();
                        strRemoteActionCompatParcelizer = getparagraphinfolistui_text.RemoteActionCompatParcelizer();
                        LinkAnnotation linkAnnotation2 = (LinkAnnotation) getlinkinteractionlistener;
                        strSerializer2 = linkAnnotation2.serializer();
                        str = getparagraphinfolistui_text.read();
                        listRemoteActionCompatParcelizer = linkAnnotation2.RemoteActionCompatParcelizer();
                        this.serializer = null;
                        this.read = 4;
                        if (triggerChatAssetsDownloading.invoke(strIconCompatParcelizer, strSerializer, strRemoteActionCompatParcelizer, strSerializer2, str, listRemoteActionCompatParcelizer, this) == coroutineSingletons) {
                        }
                    }
                }
            }
            return createfromparcel;
        }
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 121;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.write;
        Object obj3 = this.RemoteActionCompatParcelizer;
        int i5 = 0;
        switch (i4) {
            case 0:
                SimpleActor$offer$2 simpleActor$offer$2 = new SimpleActor$offer$2((ImageLoader$Builder) obj3, shortNewsContentCardView, i5);
                int i6 = RatingCompat + 41;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return simpleActor$offer$2;
                }
                obj2.hashCode();
                throw null;
            case 1:
                return new SimpleActor$offer$2((MutableInteractionSourceImpl) this.serializer, (PopulateViewStructure_androidKtpopulate7) obj3, shortNewsContentCardView, 1);
            case 2:
                return new SimpleActor$offer$2((MutableInteractionSourceImpl) this.serializer, (SnapshotStateList) obj3, shortNewsContentCardView, i);
            case 3:
                return new SimpleActor$offer$2((FloatingActionButtonElevationAnimatable) this.serializer, (getBluntfpxItnM) obj3, shortNewsContentCardView, 3);
            case 4:
                SimpleActor$offer$2 simpleActor$offer$3 = new SimpleActor$offer$2((List) obj3, shortNewsContentCardView, 4);
                simpleActor$offer$3.serializer = obj;
                return simpleActor$offer$3;
            case 5:
                return new SimpleActor$offer$2((fromColorLong) this.serializer, (SimpleActor$offer$2) obj3, shortNewsContentCardView, 5);
            case 6:
                return new SimpleActor$offer$2((TriggerBasedInvalidationTracker) this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, shortNewsContentCardView, 6);
            case 7:
                return new SimpleActor$offer$2((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.serializer, (PassthroughConnection) obj3, shortNewsContentCardView, 7);
            case 8:
                return new SimpleActor$offer$2((addInterval) this.serializer, (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj3, shortNewsContentCardView, 8);
            case 9:
                return new SimpleActor$offer$2((CustomerChatModule) this.serializer, (applyAlpha) obj3, shortNewsContentCardView, 9);
            case 10:
                return new SimpleActor$offer$2((ChatService) this.serializer, (LayerSnapshot_androidKt) obj3, shortNewsContentCardView, 10);
            case 11:
                SimpleActor$offer$2 simpleActor$offer$4 = new SimpleActor$offer$2((InnerShadowRendererProviderCompanion) obj3, shortNewsContentCardView, 11);
                simpleActor$offer$4.serializer = obj;
                return simpleActor$offer$4;
            case 12:
                SimpleActor$offer$2 simpleActor$offer$5 = new SimpleActor$offer$2((PerseusWorker) obj3, shortNewsContentCardView, 12);
                int i7 = MediaSessionCompatQueueItem + 43;
                RatingCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 54 / 0;
                }
                return simpleActor$offer$5;
            case 13:
                return new SimpleActor$offer$2((Calendar) this.serializer, this.read, (Extras$Key) obj3, shortNewsContentCardView);
            case 14:
                return new SimpleActor$offer$2((PerseusSendHitUseCase) this.serializer, (HitsRequest) obj3, shortNewsContentCardView, 14);
            case 15:
                return new SimpleActor$offer$2((DatabaseInfoLogger) obj3, shortNewsContentCardView, 15);
            case 16:
                return new SimpleActor$offer$2((accessisRenderNodeCompatiblecp) this.serializer, (DispatcherChatOrderLogger) obj3, shortNewsContentCardView, 16);
            case 17:
                return new SimpleActor$offer$2((StateProviderImpl$special$$inlined$map$2) this.serializer, shortNewsContentCardView, (PushTokenUpdateViewModel) obj3);
            case 18:
                return new SimpleActor$offer$2((getTouchaOaMEAU) this.serializer, (isOpenInternalroom_runtime) obj3, shortNewsContentCardView, 18);
            case 19:
                return new SimpleActor$offer$2((accessisRenderNodeCompatiblecp) this.serializer, (getNativeEventui) obj3, shortNewsContentCardView, 19);
            case 20:
                return new SimpleActor$offer$2((swap) this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, shortNewsContentCardView, 20);
            case 21:
                SimpleActor$offer$2 simpleActor$offer$6 = new SimpleActor$offer$2((FirebaseSessions) this.serializer, (SessionsActivityLifecycleCallbacks) obj3, shortNewsContentCardView, 21);
                int i9 = MediaSessionCompatQueueItem + 89;
                RatingCompat = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return simpleActor$offer$6;
                }
                obj2.hashCode();
                throw null;
            case 22:
                return new SimpleActor$offer$2((SharedSessionRepositoryImpl) this.serializer, (AndroidComposeViewlocaleList2) obj3, shortNewsContentCardView, 22);
            case 23:
                return new SimpleActor$offer$2((InitializeAppStartupItemsImpl) this.serializer, (Application) obj3, shortNewsContentCardView, 23);
            case 24:
                return new SimpleActor$offer$2((PlayStoreBasedAppUpdate) this.serializer, (AppCompatActivity) obj3, shortNewsContentCardView, 24);
            case 25:
                return new SimpleActor$offer$2((LogoutLifecycleCallbacksImpl) this.serializer, (Activity) obj3, shortNewsContentCardView, 25);
            case 26:
                return new SimpleActor$offer$2((getTextAlignbuA522U) obj3, shortNewsContentCardView, 26);
            case 27:
                return new SimpleActor$offer$2((accessisRenderNodeCompatiblecp) this.serializer, (getTextAlignbuA522U) obj3, shortNewsContentCardView, 27);
            case 28:
                return new SimpleActor$offer$2((accessisRenderNodeCompatiblecp) this.serializer, (getTextAligne0LSkKk) obj3, shortNewsContentCardView, 28);
            default:
                return new SimpleActor$offer$2((accessisRenderNodeCompatiblecp) this.serializer, (BaselineShiftSaverlambda0) obj3, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        switch (i3) {
            case 0:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 1:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 2:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 3:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 4:
                return ((SimpleActor$offer$2) create((SingleProcessDataStore$readAndInit$api$1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 5:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 6:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 7:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 8:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 9:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 10:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 11:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 12:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 13:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 14:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 15:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 16:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 17:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 18:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 19:
                Object objInvokeSuspend = ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
                int i4 = RatingCompat + 105;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            case 20:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 21:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 22:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 23:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 24:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 25:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 26:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 27:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            case 28:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            default:
                return ((SimpleActor$offer$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:244:0x061f A[PHI: r0
  0x061f: PHI (r0v53 java.lang.Object) = (r0v51 java.lang.Object), (r0v57 java.lang.Object) binds: [B:242:0x061c, B:236:0x05f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x0628  */
    /* JADX WARN: Code duplicated, block: B:247:0x062e A[Catch: all -> 0x05f3, TRY_ENTER, TryCatch #3 {all -> 0x05f3, blocks: (B:226:0x05d1, B:256:0x065e, B:229:0x05de, B:253:0x064e, B:232:0x05ed, B:250:0x063e, B:247:0x062e), top: B:453:0x05b6 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x063d  */
    /* JADX WARN: Code duplicated, block: B:250:0x063e A[Catch: all -> 0x05f3, PHI: r0 r2
  0x063e: PHI (r0v58 java.lang.Object) = (r0v56 java.lang.Object), (r0v64 java.lang.Object) binds: [B:248:0x063b, B:233:0x05f0] A[DONT_GENERATE, DONT_INLINE]
  0x063e: PHI (r2v61 java.util.List) = (r2v131 java.util.List), (r2v132 java.util.List) binds: [B:248:0x063b, B:233:0x05f0] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x05f3, blocks: (B:226:0x05d1, B:256:0x065e, B:229:0x05de, B:253:0x064e, B:232:0x05ed, B:250:0x063e, B:247:0x062e), top: B:453:0x05b6 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x064d  */
    /* JADX WARN: Code duplicated, block: B:253:0x064e A[Catch: all -> 0x05f3, PHI: r0 r2
  0x064e: PHI (r0v65 java.lang.Object) = (r0v60 java.lang.Object), (r0v71 java.lang.Object) binds: [B:251:0x064b, B:230:0x05e1] A[DONT_GENERATE, DONT_INLINE]
  0x064e: PHI (r2v64 java.util.List) = (r2v129 java.util.List), (r2v130 java.util.List) binds: [B:251:0x064b, B:230:0x05e1] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x05f3, blocks: (B:226:0x05d1, B:256:0x065e, B:229:0x05de, B:253:0x064e, B:232:0x05ed, B:250:0x063e, B:247:0x062e), top: B:453:0x05b6 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x065d  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0257, code lost:
    
        if (r4.updateSettings(r22) == r5) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x066e, code lost:
    
        if (r4.onError(r2, r0, r22) == r3) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x09ee, code lost:
    
        if (r6.invoke(r7, r22) == r5) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b9, code lost:
    
        if (r0.updateData(r8, r22) == r6) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r4v23, types: [com.deliveryhero.perseus.hits.PerseusWorker] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:433:0x09e3 -> B:435:0x09e6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
