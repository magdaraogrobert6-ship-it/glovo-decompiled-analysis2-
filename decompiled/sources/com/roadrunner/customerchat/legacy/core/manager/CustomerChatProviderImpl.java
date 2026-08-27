package com.roadrunner.customerchat.legacy.core.manager;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.WebView;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.room.RoomDatabase$createConnectionManager$2;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.chatui.view.root.CustomerChatActivity;
import com.deliveryhero.contract.model.PhoneCallType;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.customerchat.commons.CustomerChatNotInitializedException;
import com.deliveryhero.customerchat.fwf.FeatureFlagProvider;
import com.deliveryhero.customerchat.service.ChatService;
import com.deliveryhero.selfServiceChat.domain.exceptions.BlankOrderIDException;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.MapboxNavigation$notification$1$1;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0;
import com.qualtrics.digital.ClientSideIntercept;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import com.roadrunner.customerchat.selfservice.presentation.WebViewManager;
import com.roadrunner.customerchat.selfservice.presentation.model.ChatViewData;
import com.roadrunner.delivery.apis.ChatDeliveryRepositoryImpl;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.reactivex.disposables.Disposable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DeferredCoroutine;
import o.GraphicsViewLayerCompanion;
import o.LayerSnapshotV21;
import o.LayerSnapshotV22toBitmap2image11;
import o.LayerSnapshot_androidKt;
import o.OutlineVerificationHelper;
import o.ParagraphInfo;
import o.PreviewBlackScreenQuirk;
import o.RenderNodeVerificationHelper28;
import o.ShortNewsContentCardView;
import o.SurfaceUtils;
import o.SuspendingTransactionWrapper;
import o.TextUnitTypeCompanion;
import o.VectorPainterKt;
import o.ViewLayerVerificationHelper31;
import o.accessanalyzeComponents58bKbWc;
import o.accessgetTextCentercp;
import o.configureVectorPainterT4PVSW8;
import o.createFromParcel;
import o.findParagraphByLineIndex;
import o.fireWithUpdatedRectui;
import o.forEachNewCallbackNeverInvoked;
import o.getCieXyz;
import o.getDefaultFillType;
import o.getEmUIouoOA;
import o.getHasNonTranslationComponentsannotations;
import o.getHasStaleResolvedFonts;
import o.getInfoListui_text;
import o.getPivotOffsetF1C5BW0;
import o.getRectChangedMap;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.getScreenOffsetnOccac;
import o.getSize;
import o.getSpotShadowColor;
import o.getTextIndent;
import o.getTransaction;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isHardwareAccelerated;
import o.minIntrinsicWidth_delegatelambda0;
import o.obtainSizePxVpY3zN4;
import o.onContentCardDismissed;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.rebuildOutline;
import o.removeNodeAtDepth;
import o.resolveLockHardwareCanvasMethod;
import o.roundDownToMultipleOf8;
import o.runFor;
import o.setMinDebounceDeadline;
import o.setPositionH0pRuoY;
import o.setVerticalStyle;
import o.setViewToWindowMatrixQ8lPUPs;
import o.unregisterOnChangedCallback;
import o.updateClipBounds;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatProviderImpl implements forEachNewCallbackNeverInvoked {
    private static int ComponentActivity = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final setVerticalStyle IconCompatParcelizer;
    public final getTextIndent MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final AtomicBoolean MediaMetadataCompat = new AtomicBoolean(true);
    public final InitializeAppStartupItemsImpl MediaSessionCompatQueueItem;
    public final MapApiError MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public final ParagraphInfo ParcelableVolumeInfo;
    public final getPivotOffsetF1C5BW0 PlaybackStateCompat;
    public final getScreenOffsetnOccac PlaybackStateCompatCustomAction;
    public Disposable RatingCompat;
    public final roundDownToMultipleOf8 RemoteActionCompatParcelizer;
    public SurfaceUtils ResultReceiver;
    public final CustomerChatManagerImpl read;
    public final CustomerChatRepository serializer;
    public final setViewToWindowMatrixQ8lPUPs write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i2 | i5)) | i3;
        int i8 = (~((~i5) | i2)) | i3;
        int i9 = (~i3) | i2;
        int i10 = i3 + i2 + i + (440753341 * i6) + ((-634449194) * i4);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i3) + 1075183616 + ((-1421434046) * i2) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i) + (780402688 * i6) + ((-180879360) * i4) + (353763328 * i11);
        int i13 = (i3 * 892202253) + 1676176333 + (i2 * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i * 892200819) + (i6 * (-770690073)) + (i4 * 448958498) + (i11 * 1390542848);
        return i12 + ((i13 * i13) * (-1042677760)) != 1 ? IconCompatParcelizer(objArr) : read(objArr);
    }

    public CustomerChatProviderImpl(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, CustomerChatManagerImpl customerChatManagerImpl, roundDownToMultipleOf8 rounddowntomultipleof8, CustomerChatRepository customerChatRepository, getScreenOffsetnOccac getscreenoffsetnoccac, setVerticalStyle setverticalstyle, MapApiError mapApiError, setViewToWindowMatrixQ8lPUPs setviewtowindowmatrixq8lpups, ParagraphInfo paragraphInfo, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, getTextIndent gettextindent) {
        this.PlaybackStateCompat = getpivotoffsetf1c5bw0;
        this.read = customerChatManagerImpl;
        this.RemoteActionCompatParcelizer = rounddowntomultipleof8;
        this.serializer = customerChatRepository;
        this.PlaybackStateCompatCustomAction = getscreenoffsetnoccac;
        this.IconCompatParcelizer = setverticalstyle;
        this.MediaSessionCompatResultReceiverWrapper = mapApiError;
        this.write = setviewtowindowmatrixq8lpups;
        this.ParcelableVolumeInfo = paragraphInfo;
        this.MediaSessionCompatQueueItem = initializeAppStartupItemsImpl;
        this.MediaBrowserCompatMediaItem = gettextindent;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0237  */
    public final void IconCompatParcelizer(final Activity activity, String str) {
        Object next;
        boolean z;
        String strSerializer;
        String str2;
        String str3;
        String strIconCompatParcelizer;
        PhoneCallType phoneCallType;
        Object obj;
        str.getClass();
        int i = 0;
        if (!IconCompatParcelizer()) {
            Timber.RemoteActionCompatParcelizer.read("CustomerChat is not initialized", new Object[0]);
            this.write.read("chat_start_failed", "CustomerChat is not initialized");
            return;
        }
        Iterator it = this.serializer.read().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((fireWithUpdatedRectui) next).serializer(), str}, getCieXyz.write())).booleanValue());
        fireWithUpdatedRectui firewithupdatedrectui = (fireWithUpdatedRectui) next;
        if (firewithupdatedrectui == null) {
            String strM = ff$$ExternalSyntheticOutline0.m("No DeliveryChatInfo for chatUrl \"", str, "\"");
            Timber.RemoteActionCompatParcelizer.read(strM, new Object[0]);
            this.write.read("chat_start_failed", strM);
            return;
        }
        if (this.MediaBrowserCompatMediaItem.write()) {
            ParagraphInfo paragraphInfo = this.ParcelableVolumeInfo;
            for (Object obj2 : ((ChatDeliveryRepositoryImpl) paragraphInfo.RemoteActionCompatParcelizer).read()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TextUnitTypeCompanion) obj2).serializer(), str}, getCieXyz.write())).booleanValue()) {
                    obj = obj2;
                    break;
                }
            }
            TextUnitTypeCompanion textUnitTypeCompanion = (TextUnitTypeCompanion) obj;
            if (textUnitTypeCompanion == null) {
                Timber.RemoteActionCompatParcelizer.read(ff$$ExternalSyntheticOutline0.m("Failed to find delivery ", str, " for self-service chat"), new Object[0]);
                return;
            }
            getEmUIouoOA getemuiouooaWrite = ((ChatDeliveryRepositoryImpl) paragraphInfo.RemoteActionCompatParcelizer).write();
            if (getemuiouooaWrite == null) {
                Timber.RemoteActionCompatParcelizer.read("Missing registration data for self-service chat", new Object[0]);
                return;
            }
            ChatViewData chatViewData = new ChatViewData(((ChatDeliveryRepositoryImpl) paragraphInfo.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem(), new ChatViewData.Delivery(((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue(), textUnitTypeCompanion.MediaBrowserCompatMediaItem().getValue(), textUnitTypeCompanion.serializer(), textUnitTypeCompanion.MediaMetadataCompat(), textUnitTypeCompanion.MediaDescriptionCompat(), textUnitTypeCompanion.write(), textUnitTypeCompanion.read(), textUnitTypeCompanion.RemoteActionCompatParcelizer(), textUnitTypeCompanion.IconCompatParcelizer(), textUnitTypeCompanion.RatingCompat()), new ChatViewData.Registration(getemuiouooaWrite.RemoteActionCompatParcelizer, getemuiouooaWrite.IconCompatParcelizer));
            minIntrinsicWidth_delegatelambda0 minintrinsicwidth_delegatelambda0 = paragraphInfo.write;
            synchronized (minintrinsicwidth_delegatelambda0.read) {
                if (minintrinsicwidth_delegatelambda0.MediaDescriptionCompat != null) {
                    minintrinsicwidth_delegatelambda0.serializer();
                }
                minintrinsicwidth_delegatelambda0.MediaDescriptionCompat = Long.valueOf(minintrinsicwidth_delegatelambda0.MediaSessionCompatQueueItem.write.millis());
            }
            getInfoListui_text getinfolistui_text = paragraphInfo.read;
            if (getinfolistui_text.serializer()) {
                getinfolistui_text.read();
                getinfolistui_text.MediaBrowserCompatMediaItem.getClass();
                getTransaction gettransaction = SuspendingTransactionWrapper.read("customer_chat_transaction", "load_customer_chat");
                getinfolistui_text.IconCompatParcelizer(new RoomDatabase$createConnectionManager$2(gettransaction));
                getinfolistui_text.write = gettransaction;
            }
            getinfolistui_text.serializer("chat_e2e_tap_to_page_loaded");
            getinfolistui_text.serializer("chat_native_tap_to_web_start");
            getinfolistui_text.serializer("chat_native_before_load_url");
            getinfolistui_text.serializer("chat_native_activity_launch");
            SelfServiceCustomerChatActivity.MediaBrowserCompatMediaItem.getClass();
            activity.startActivity(findParagraphByLineIndex.IconCompatParcelizer(activity, chatViewData));
            return;
        }
        getEmUIouoOA getemuiouooaWrite2 = ((ChatDeliveryRepositoryImpl) this.serializer.serializer).write();
        String str4 = getemuiouooaWrite2 != null ? getemuiouooaWrite2.IconCompatParcelizer : null;
        getScreenOffsetnOccac getscreenoffsetnoccac = this.PlaybackStateCompatCustomAction;
        List listRemoteActionCompatParcelizer = getscreenoffsetnoccac.read.RemoteActionCompatParcelizer(((accessanalyzeComponents58bKbWc) getscreenoffsetnoccac.write).RemoteActionCompatParcelizer());
        String strRemoteActionCompatParcelizer = firewithupdatedrectui.RemoteActionCompatParcelizer();
        final String strSerializer2 = firewithupdatedrectui.serializer();
        TextUnitTypeCompanion textUnitTypeCompanion2 = (TextUnitTypeCompanion) onContentCardDismissed.MediaMetadataCompat(((ChatDeliveryRepositoryImpl) this.serializer.serializer).read());
        if (textUnitTypeCompanion2 != null) {
            if (((Long) TextUnitTypeCompanion.write(1563797762, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), new Object[]{textUnitTypeCompanion2}, VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), VoiceInstructionsFilePlayer$$ExternalSyntheticLambda0.IconCompatParcelizer(), -1563797762)).longValue() == firewithupdatedrectui.RatingCompat() && textUnitTypeCompanion2.MediaBrowserCompatMediaItem().isDropOffGroup()) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        String strMediaMetadataCompat = "";
        if (firewithupdatedrectui.MediaBrowserCompatMediaItem() > 0) {
            String strSerializer3 = firewithupdatedrectui.serializer();
            int iMediaBrowserCompatMediaItem = firewithupdatedrectui.MediaBrowserCompatMediaItem();
            strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(strSerializer3, iMediaBrowserCompatMediaItem > 0 ? new DecimalFormat("('#'0)").format(iMediaBrowserCompatMediaItem) : null);
        } else {
            strSerializer = firewithupdatedrectui.serializer();
        }
        String str5 = strSerializer;
        if (z) {
            str2 = "";
        } else {
            str2 = firewithupdatedrectui.read();
        }
        String str6 = str2;
        if (z) {
            str3 = "";
        } else {
            str3 = (String) fireWithUpdatedRectui.write(1159358201, new Object[]{firewithupdatedrectui}, TextUnitTypeCompanion.PlaybackStateCompat(), -1159358201, TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat(), TextUnitTypeCompanion.PlaybackStateCompat());
        }
        String str7 = str3;
        if (z) {
            strIconCompatParcelizer = "";
        } else {
            strIconCompatParcelizer = firewithupdatedrectui.IconCompatParcelizer();
        }
        String str8 = strIconCompatParcelizer;
        String strWrite = firewithupdatedrectui.write();
        if (!z) {
            strMediaMetadataCompat = firewithupdatedrectui.MediaMetadataCompat();
        }
        final OutlineVerificationHelper outlineVerificationHelper = new OutlineVerificationHelper(firewithupdatedrectui.RatingCompat(), str5, str6, str8, str7, strWrite, strMediaMetadataCompat);
        CustomerChatManagerImpl customerChatManagerImpl = this.read;
        roundDownToMultipleOf8 rounddowntomultipleof8 = this.RemoteActionCompatParcelizer;
        String string = rounddowntomultipleof8.RemoteActionCompatParcelizer.getString(rounddowntomultipleof8.IconCompatParcelizer, (String) onContentCardDismissed.MediaMetadataCompat(((FirebaseRemoteConfigImpl) rounddowntomultipleof8.serializer).RemoteActionCompatParcelizer()));
        if (string == null) {
            string = "";
        }
        String strIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        List listRemoteActionCompatParcelizer2 = ((FirebaseRemoteConfigImpl) this.RemoteActionCompatParcelizer.serializer).RemoteActionCompatParcelizer();
        strRemoteActionCompatParcelizer.getClass();
        LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = new LayerSnapshotV22toBitmap2image11();
        layerSnapshotV22toBitmap2image11.write = outlineVerificationHelper;
        layerSnapshotV22toBitmap2image11.RemoteActionCompatParcelizer = strRemoteActionCompatParcelizer;
        layerSnapshotV22toBitmap2image11.ResultReceiver = new RenderNodeVerificationHelper28(listRemoteActionCompatParcelizer2, string);
        layerSnapshotV22toBitmap2image11.MediaMetadataCompat = strIconCompatParcelizer2;
        layerSnapshotV22toBitmap2image11.PlaybackStateCompat = listRemoteActionCompatParcelizer;
        if (((FirebaseRemoteConfigImpl) customerChatManagerImpl.IconCompatParcelizer).MediaSessionCompatQueueItem()) {
            phoneCallType = PhoneCallType.Masked.INSTANCE;
        } else {
            phoneCallType = PhoneCallType.Normal.INSTANCE;
        }
        phoneCallType.getClass();
        layerSnapshotV22toBitmap2image11.MediaSessionCompatToken = phoneCallType;
        if (str4 != null && str4.length() != 0) {
            layerSnapshotV22toBitmap2image11.serializer = str4;
        }
        customerChatManagerImpl.read();
        CustomerChatActivity.RatingCompat.getClass();
        if (!updateClipBounds.write()) {
            customerChatManagerImpl.read().write(layerSnapshotV22toBitmap2image11);
        } else {
            Timber.RemoteActionCompatParcelizer.write(new Error("Configuration cannot be set while chat is open"));
        }
        CustomerChatManagerImpl customerChatManagerImpl2 = this.read;
        final runFor runfor = new runFor(this, i);
        strSerializer2.getClass();
        final CustomerChatModule customerChatModule = customerChatManagerImpl2.read();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.customerchat.CustomerChatModule$startChat$2
            private static int MediaBrowserCompatMediaItem = 0;
            private static int MediaSessionCompatQueueItem = 1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = MediaSessionCompatQueueItem + 111;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                String str9 = strSerializer2;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str9)) {
                    runfor.invoke(BlankOrderIDException.serializer);
                } else {
                    MapboxNavigation$notification$1$1 mapboxNavigation$notification$1$1 = new MapboxNavigation$notification$1$1(str9, 3, outlineVerificationHelper);
                    CustomerChatModule customerChatModule2 = customerChatModule;
                    customerChatModule2.serializer(mapboxNavigation$notification$1$1);
                    customerChatModule2.write();
                    ChatService chatServiceIconCompatParcelizer = customerChatModule2.IconCompatParcelizer();
                    chatServiceIconCompatParcelizer.getClass();
                    getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = chatServiceIconCompatParcelizer.read.read;
                    if (gethasnontranslationcomponentsannotations != null) {
                        int i5 = MediaSessionCompatQueueItem + 47;
                        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (gethasnontranslationcomponentsannotations.RemoteActionCompatParcelizer()) {
                            gethasnontranslationcomponentsannotations.IconCompatParcelizer();
                            gethasnontranslationcomponentsannotations.MediaDescriptionCompat.getClass();
                            getTransaction gettransaction2 = SuspendingTransactionWrapper.read("customer_chat_transaction", "load_customer_chat");
                            gethasnontranslationcomponentsannotations.IconCompatParcelizer(new RoomDatabase$createConnectionManager$2(2, gettransaction2, getTransaction.class, "setData", "setData(Ljava/lang/String;Ljava/lang/Object;)V", 0, 7));
                            gethasnontranslationcomponentsannotations.RatingCompat = gettransaction2;
                            int i7 = MediaSessionCompatQueueItem + 61;
                            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                        }
                        gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_e2e_tap_to_page_loaded");
                        gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_native_tap_to_web_start");
                        gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_native_before_load_url");
                        gethasnontranslationcomponentsannotations.IconCompatParcelizer("chat_native_activity_launch");
                    }
                    CustomerChatActivity.RatingCompat.getClass();
                    Activity activity2 = activity;
                    Intent intent = new Intent(activity2, (Class<?>) CustomerChatActivity.class);
                    intent.setFlags(268435456);
                    activity2.startActivity(intent);
                    int i9 = MediaSessionCompatQueueItem + 123;
                    MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                return createFromParcel.INSTANCE;
            }
        };
        if (customerChatModule.PlaybackStateCompat.get()) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } else {
            runfor.invoke(new CustomerChatNotInitializedException());
        }
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 15;
        ComponentActivity = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (!this.MediaDescriptionCompat) {
            return false;
        }
        int i5 = i2 + 89;
        int i6 = i5 % Fields.SpotShadowColor;
        ComponentActivity = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this.ResultReceiver == null) {
            return false;
        }
        int i7 = i6 + 31;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        int i9 = i6 + 21;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean write() {
        boolean zWrite;
        int i = 2 % 2;
        if (!IconCompatParcelizer()) {
            return false;
        }
        CustomerChatManagerImpl customerChatManagerImpl = this.read;
        if (!customerChatManagerImpl.MediaMetadataCompat.write()) {
            customerChatManagerImpl.read();
            CustomerChatActivity.RatingCompat.getClass();
            zWrite = updateClipBounds.write();
        } else {
            int i2 = ComponentActivity + 77;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            SelfServiceCustomerChatActivity.MediaBrowserCompatMediaItem.getClass();
            boolean z = findParagraphByLineIndex.read();
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 23;
            ComponentActivity = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            zWrite = z;
        }
        return zWrite;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 67;
        ComponentActivity = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (!IconCompatParcelizer()) {
            Timber.RemoteActionCompatParcelizer.read("CustomerChat is not initialized", new Object[0]);
            return;
        }
        this.RatingCompat = IconCompatParcelizer(true).subscribe(new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(new accessgetTextCentercp(3), i), new MapboxNavigation$$ExternalSyntheticLambda4(29, new accessgetTextCentercp(4)));
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 9;
        ComponentActivity = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final boolean write(Map map) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 29;
        ComponentActivity = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        CustomerChatManagerImpl customerChatManagerImpl = this.read;
        if (customerChatManagerImpl.MediaMetadataCompat.write()) {
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 79;
            ComponentActivity = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return customerChatManagerImpl.RemoteActionCompatParcelizer.read(map);
            }
            customerChatManagerImpl.RemoteActionCompatParcelizer.read(map);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CustomerChatModule customerChatModule = customerChatManagerImpl.read();
        if (((VectorPainterKt) ((configureVectorPainterT4PVSW8) customerChatModule.read.MediaSessionCompatResultReceiverWrapper())).read(map) || ((setPositionH0pRuoY) ((isHardwareAccelerated) customerChatModule.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper())).IconCompatParcelizer(map)) {
            return true;
        }
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 111;
        ComponentActivity = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            customerChatManagerImpl.read();
            return false;
        }
        customerChatManagerImpl.read();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039 A[PHI: r7
  0x0039: PHI (r7v7 o.fireWithUpdatedRectui) = (r7v6 o.fireWithUpdatedRectui), (r7v11 o.fireWithUpdatedRectui) binds: [B:10:0x0037, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        String strSerializer;
        fireWithUpdatedRectui firewithupdatedrectui;
        CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) objArr[0];
        Activity activity = (Activity) objArr[1];
        String str = (String) objArr[2];
        int i = 2 % 2;
        ArrayList arrayList = customerChatProviderImpl.serializer.read();
        if (str == null) {
            int i2 = ComponentActivity + 113;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                firewithupdatedrectui = (fireWithUpdatedRectui) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
                int i3 = 41 / 0;
                if (firewithupdatedrectui != null) {
                    int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 103;
                    ComponentActivity = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    strSerializer = firewithupdatedrectui.serializer();
                } else {
                    strSerializer = null;
                }
            } else {
                firewithupdatedrectui = (fireWithUpdatedRectui) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
                if (firewithupdatedrectui != null) {
                    int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 103;
                    ComponentActivity = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    strSerializer = firewithupdatedrectui.serializer();
                } else {
                    strSerializer = null;
                }
            }
        } else {
            strSerializer = str;
        }
        if (arrayList.size() > 1) {
            Intent intent = new Intent(activity, (Class<?>) CustomerChatsActivity.class);
            intent.putExtra("groupChannelUrl", str);
            activity.startActivity(intent);
            return null;
        }
        if (strSerializer == null) {
            Timber.RemoteActionCompatParcelizer.read("No Delivery Chats to open", new Object[0]);
            customerChatProviderImpl.write.read("chat_start_failed", "No Delivery Chats to open");
            return null;
        }
        int i8 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 99;
        ComponentActivity = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            customerChatProviderImpl.IconCompatParcelizer(activity, strSerializer);
            return null;
        }
        customerChatProviderImpl.IconCompatParcelizer(activity, strSerializer);
        int i9 = 71 / 0;
        return null;
    }

    public final void read(String str) {
        int i = 2 % 2;
        if (this.MediaBrowserCompatMediaItem.write()) {
            return;
        }
        CustomerChatManagerImpl customerChatManagerImpl = this.read;
        if (!customerChatManagerImpl.read().PlaybackStateCompat.get()) {
            int i2 = ComponentActivity + 53;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CustomerChat registerPushToken ,Chat Init called", new Object[0]);
            read();
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 81;
            ComponentActivity = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer("CustomerChat registerPushToken ".concat(str), new Object[0]);
        StateV3$$ExternalSyntheticLambda0 stateV3$$ExternalSyntheticLambda0 = new StateV3$$ExternalSyntheticLambda0(14);
        CustomerChatModule customerChatModule = customerChatManagerImpl.read();
        SingleProcessDataStore$file$2 singleProcessDataStore$file$2 = new SingleProcessDataStore$file$2(3, stateV3$$ExternalSyntheticLambda0);
        if (!(!customerChatModule.PlaybackStateCompat.get())) {
            singleProcessDataStore$file$2.invoke();
            return;
        }
        CustomerChatNotInitializedException customerChatNotInitializedException = new CustomerChatNotInitializedException();
        forest.RemoteActionCompatParcelizer(customerChatNotInitializedException, "CustomerChat registerPushToken failed", new Object[0]);
        this.write.read("chat_push_registration_failed", customerChatNotInitializedException.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r9.MediaSessionCompatToken == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.Single IconCompatParcelizer(boolean r10) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl.IconCompatParcelizer(boolean):io.reactivex.Single");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void read() {
        getSpotShadowColor getspotshadowcolor;
        int i = 2 % 2;
        CustomerChatRepository customerChatRepository = this.serializer;
        ChatDeliveryRepositoryImpl chatDeliveryRepositoryImpl = (ChatDeliveryRepositoryImpl) customerChatRepository.serializer;
        String strIconCompatParcelizer = chatDeliveryRepositoryImpl.IconCompatParcelizer();
        String strWrite = customerChatRepository.write();
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = resolveLockHardwareCanvasMethod.RIDER;
        int i2 = getRectChangedMap.RemoteActionCompatParcelizer[this.IconCompatParcelizer.write().ordinal()];
        GraphicsViewLayerCompanion graphicsViewLayerCompanion = null;
        if (i2 != 1) {
            int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 55;
            int i4 = i3 % Fields.SpotShadowColor;
            ComponentActivity = i4;
            int i5 = i3 % 2;
            if (i2 != 2) {
                int i6 = i4 + 43;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    getSpotShadowColor getspotshadowcolor2 = getSpotShadowColor.NONE;
                    graphicsViewLayerCompanion.hashCode();
                    throw null;
                }
                getspotshadowcolor = getSpotShadowColor.NONE;
            } else {
                getspotshadowcolor = getSpotShadowColor.GOOGLE;
            }
        } else {
            getspotshadowcolor = getSpotShadowColor.HUAWEI;
        }
        getSpotShadowColor getspotshadowcolor3 = getspotshadowcolor;
        rebuildOutline rebuildoutline = customerChatRepository.IconCompatParcelizer() ? rebuildOutline.STAGING : rebuildOutline.PRODUCTION;
        String strSerializer = chatDeliveryRepositoryImpl.serializer();
        String strIconCompatParcelizer2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        resolvelockhardwarecanvasmethod.getClass();
        getspotshadowcolor3.getClass();
        rebuildoutline.getClass();
        CustomerChatManagerImpl customerChatManagerImpl = this.read;
        if (!customerChatManagerImpl.MediaMetadataCompat.write()) {
            LayerSnapshot_androidKt layerSnapshot_androidKt = new LayerSnapshot_androidKt(strIconCompatParcelizer, strWrite, resolvelockhardwarecanvasmethod, getspotshadowcolor3, rebuildoutline);
            LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = new LayerSnapshotV22toBitmap2image11();
            layerSnapshotV22toBitmap2image11.read = layerSnapshot_androidKt;
            PhoneCallType phoneCallType = ((FirebaseRemoteConfigImpl) customerChatManagerImpl.IconCompatParcelizer).MediaSessionCompatQueueItem() ^ true ? PhoneCallType.Normal.INSTANCE : PhoneCallType.Masked.INSTANCE;
            phoneCallType.getClass();
            layerSnapshotV22toBitmap2image11.MediaSessionCompatToken = phoneCallType;
            layerSnapshotV22toBitmap2image11.MediaMetadataCompat = strIconCompatParcelizer2;
            if (strSerializer != null) {
                int i7 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 57;
                ComponentActivity = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    layerSnapshotV22toBitmap2image11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strSerializer;
                    int i8 = 19 / 0;
                } else {
                    layerSnapshotV22toBitmap2image11.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = strSerializer;
                }
            }
            String str = ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) customerChatManagerImpl.read.write).MediaSessionCompatQueueItem;
            switch (str.hashCode()) {
                case -1544000461:
                    if (str.equals("talabat")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.TALABAT_ORANGE;
                    }
                    break;
                case -1095301060:
                    if (str.equals("foodpanda")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.PANDA_PINK_WHITE;
                    }
                    break;
                case -1001921917:
                    if (str.equals("yemeksepeti")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.YEMEK_PINK_GRAY;
                        int i9 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 69;
                        ComponentActivity = i9 % Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    }
                    break;
                case -680469056:
                    if (str.equals("foodora")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.FOODORA_PINK;
                    }
                    break;
                case -43101407:
                    if (str.equals("hungerstation")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.HUNGERSTATION_MIXED_DARK;
                    }
                    break;
                case 98450531:
                    if (str.equals("glovo")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.GLOVO_YELLOW;
                    }
                    break;
                case 1016636758:
                    if (str.equals("pedidosya")) {
                        graphicsViewLayerCompanion = GraphicsViewLayerCompanion.PEYA_PINK;
                    }
                    break;
            }
            if (graphicsViewLayerCompanion != null) {
                layerSnapshotV22toBitmap2image11.IconCompatParcelizer = graphicsViewLayerCompanion;
            }
            customerChatManagerImpl.read().write(layerSnapshotV22toBitmap2image11);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CustomerChat is Initialized.", new Object[0]);
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = ComponentActivity + 67;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        this.ResultReceiver = null;
        this.MediaDescriptionCompat = false;
        this.serializer.read.onNext(instance_delegatelambda0.write);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(jUptimeMillis, "CustomerChat Clear - Disconnecting: Start at "), new Object[0]);
        this.read.read().PlaybackStateCompat.get();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        forest.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(jUptimeMillis2, "CustomerChat Clear - Disconnecting: End at "), new Object[0]);
        long j = jUptimeMillis2 - jUptimeMillis;
        if (j / 1000 >= 3) {
            forest.write(new Throwable(af$$ExternalSyntheticOutline0.m(j, "CustomerChat Clear Process was running too long. Time spent: ")));
        }
        CustomerChatManagerImpl customerChatManagerImpl = this.read;
        if (customerChatManagerImpl.MediaMetadataCompat.write()) {
            setMinDebounceDeadline setmindebouncedeadline = customerChatManagerImpl.RatingCompat;
            WebViewManager webViewManager = setmindebouncedeadline.serializer;
            webViewManager.read();
            getHasStaleResolvedFonts gethasstaleresolvedfonts = webViewManager.write;
            WebView webView = gethasstaleresolvedfonts.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (webView != null) {
                webView.removeJavascriptInterface("hcAndroidBridgeEntry");
                int i4 = ComponentActivity + 91;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            gethasstaleresolvedfonts.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            gethasstaleresolvedfonts.MediaSessionCompatResultReceiverWrapper = false;
            gethasstaleresolvedfonts.RemoteActionCompatParcelizer();
            WebView webView2 = webViewManager.PlaybackStateCompat;
            if (webView2 != null) {
                webView2.destroy();
            }
            webViewManager.PlaybackStateCompat = null;
            webViewManager.ParcelableVolumeInfo = null;
            webViewManager.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
            webViewManager.MediaDescriptionCompat = false;
            webViewManager.IconCompatParcelizer.RemoteActionCompatParcelizer = null;
            DeferredCoroutine deferredCoroutine = webViewManager.MediaMetadataCompat;
            if (deferredCoroutine != null) {
                deferredCoroutine.write((CancellationException) null);
            }
            webViewManager.MediaMetadataCompat = null;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = webViewManager.MediaSessionCompatResultReceiverWrapper;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            webViewManager.MediaSessionCompatResultReceiverWrapper = null;
            setmindebouncedeadline.IconCompatParcelizer.serializer = null;
            if (PreviewBlackScreenQuirk.IconCompatParcelizer(setmindebouncedeadline.read.serializer())) {
                BuildersKt.RemoteActionCompatParcelizer(setmindebouncedeadline.RemoteActionCompatParcelizer, null, null, new ClearDataUseCaseImpl$invoke$2(setmindebouncedeadline, shortNewsContentCardView, 8), 3);
                return;
            }
            return;
        }
        CustomerChatModule customerChatModule = customerChatManagerImpl.read();
        ChatService chatServiceIconCompatParcelizer = customerChatModule.IconCompatParcelizer();
        com.deliveryhero.selfServiceChat.ui.WebViewManager webViewManager2 = chatServiceIconCompatParcelizer.MediaDescriptionCompat;
        webViewManager2.write();
        obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = webViewManager2.write;
        WebView webView3 = obtainsizepxvpy3zn4.PlaybackStateCompat;
        if (webView3 != null) {
            webView3.removeJavascriptInterface("hcAndroidBridgeEntry");
        }
        obtainsizepxvpy3zn4.PlaybackStateCompat = null;
        obtainsizepxvpy3zn4.PlaybackStateCompatCustomAction = false;
        obtainsizepxvpy3zn4.serializer();
        WebView webView4 = webViewManager2.ParcelableVolumeInfo;
        if (webView4 != null) {
            webView4.destroy();
        }
        webViewManager2.ParcelableVolumeInfo = null;
        webViewManager2.MediaSessionCompatResultReceiverWrapper = null;
        webViewManager2.PlaybackStateCompatCustomAction = false;
        webViewManager2.MediaMetadataCompat = false;
        ((getSize) webViewManager2.MediaDescriptionCompat).read = null;
        DeferredCoroutine deferredCoroutine2 = webViewManager2.RatingCompat;
        if (deferredCoroutine2 != null) {
            deferredCoroutine2.write((CancellationException) null);
        }
        webViewManager2.RatingCompat = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 = webViewManager2.PlaybackStateCompat;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2 != null) {
            int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 87;
            ComponentActivity = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu2.write((CancellationException) null);
        }
        webViewManager2.PlaybackStateCompat = null;
        ((getDefaultFillType) chatServiceIconCompatParcelizer.MediaSessionCompatQueueItem).IconCompatParcelizer = null;
        LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatServiceIconCompatParcelizer.serializer).write();
        if (BuildersKt.RemoteActionCompatParcelizer(layerSnapshotV21Write != null ? layerSnapshotV21Write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys : null)) {
            BuildersKt.RemoteActionCompatParcelizer(chatServiceIconCompatParcelizer, null, null, new BlockRunner$cancel$1(chatServiceIconCompatParcelizer, shortNewsContentCardView, 20), 3);
        }
        FeatureFlagProvider featureFlagProvider = (FeatureFlagProvider) customerChatModule.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper();
        DeferredCoroutine deferredCoroutine3 = featureFlagProvider.write;
        if (deferredCoroutine3 != null) {
            int i8 = ComponentActivity + 27;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                deferredCoroutine3.write((CancellationException) null);
                throw null;
            }
            deferredCoroutine3.write((CancellationException) null);
        }
        featureFlagProvider.write = null;
        featureFlagProvider.MediaDescriptionCompat = false;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01df  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x0209  */
    /* JADX WARN: Code duplicated, block: B:82:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:0: B:73:0x0203->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r4.read(r2) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r4.read(r2) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = (java.lang.String) r2.get(com.braze.Constants.BRAZE_PUSH_EXTRAS_KEY);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r2 = o.r8lambdaTOIgAPaTrSKFODGuDRy70XAidrI.RemoteActionCompatParcelizer();
        r6 = o.getLineEnddefault.Companion.serializer();
        r7 = r6;
        r0 = (o.getLineEnddefault) r2.serializer(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (o.hideCurrentlyDisplayingInAppMessage.serializer((java.lang.CharSequence) r0.RemoteActionCompatParcelizer()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        r2 = r4.serializer;
        r6 = r0.serializer().RemoteActionCompatParcelizer();
        r2.getClass();
        r6.getClass();
        r10 = new o.transformlambda0(r0.serializer().RemoteActionCompatParcelizer(), r0.serializer().write(), r0.serializer().read(), r0.serializer().serializer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        throw new java.lang.IllegalStateException("Unsupported push notification format");
     */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl, o.getAnnotatedString] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r21) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl.read(java.lang.Object[]):java.lang.Object");
    }

    public final unregisterOnChangedCallback serializer(Map map) {
        int iRemoteActionCompatParcelizer = ClientSideIntercept.RemoteActionCompatParcelizer();
        return (unregisterOnChangedCallback) RemoteActionCompatParcelizer(ClientSideIntercept.RemoteActionCompatParcelizer(), -693785403, 693785404, new Object[]{this, map}, ClientSideIntercept.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, ClientSideIntercept.RemoteActionCompatParcelizer());
    }

    public final void serializer(Activity activity, String str) {
        int iRemoteActionCompatParcelizer = ClientSideIntercept.RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(ClientSideIntercept.RemoteActionCompatParcelizer(), 594436921, -594436921, new Object[]{this, activity, str}, ClientSideIntercept.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, ClientSideIntercept.RemoteActionCompatParcelizer());
    }
}
