package o;

import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.realtime.RealtimeStatusUpdateManagerImpl;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RectManagerKt implements SemanticsInfo {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final /* synthetic */ int write = 0;

    public RectManagerKt(Lazy lazy, Lazy lazy2, transferSessionPackageI transfersessionpackagei, lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24, SharedResourcePool sharedResourcePool) {
        lazy.getClass();
        lazy2.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = lazy;
        this.read = lazy2;
        this.IconCompatParcelizer = transfersessionpackagei;
        this.serializer = lambdaremoveglobalcallbackparameter24;
    }

    public RectManagerKt(CustomerChatManagerImpl customerChatManagerImpl, ProtobufEncoder protobufEncoder, isIdentityannotations isidentityannotations, getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations) {
        customerChatManagerImpl.getClass();
        this.RemoteActionCompatParcelizer = customerChatManagerImpl;
        this.read = protobufEncoder;
        this.IconCompatParcelizer = isidentityannotations;
        this.serializer = gethasnontranslationcomponentsannotations;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj = this.serializer;
        Object obj2 = this.read;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.IconCompatParcelizer;
        if (i3 == 0) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("ChatInitializer called", new Object[0]);
            CustomerChatManagerImpl customerChatManagerImpl = (CustomerChatManagerImpl) obj3;
            ProtobufEncoder protobufEncoder = (ProtobufEncoder) obj2;
            isIdentityannotations isidentityannotations = (isIdentityannotations) obj4;
            getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = (getHasNonTranslationComponentsannotations) obj;
            customerChatManagerImpl.getClass();
            if (!customerChatManagerImpl.MediaMetadataCompat.write()) {
                com.deliveryhero.customerchat.CustomerChatModule customerChatModule = customerChatManagerImpl.read();
                LayerSnapshotV22toBitmap2image11 layerSnapshotV22toBitmap2image11 = new LayerSnapshotV22toBitmap2image11();
                layerSnapshotV22toBitmap2image11.PlaybackStateCompatCustomAction = protobufEncoder;
                layerSnapshotV22toBitmap2image11.RatingCompat = isidentityannotations;
                layerSnapshotV22toBitmap2image11.MediaSessionCompatResultReceiverWrapper = gethasnontranslationcomponentsannotations;
                customerChatModule.write(layerSnapshotV22toBitmap2image11);
            }
            return createfromparcel2;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) obj4);
        firebaseRemoteConfigImpl.getClass();
        if (!(!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.REALTIME_CONNECTION_ENABLED))) {
            int i4 = MediaDescriptionCompat + 9;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            ((launchEventResponseTasksI) ((Lazy) obj3).write()).RemoteActionCompatParcelizer();
            ((RealtimeStatusUpdateManagerImpl) ((Lazy) obj2).write()).read();
        } else {
            lambdaremoveGlobalCallbackParameter24 lambdaremoveglobalcallbackparameter24 = (lambdaremoveGlobalCallbackParameter24) obj;
            if (lambdaremoveglobalcallbackparameter24.RemoteActionCompatParcelizer()) {
                lambdaremoveglobalcallbackparameter24.serializer.logEvent("rtc_state_disabled", null);
            } else {
                int i6 = MediaBrowserCompatMediaItem + 65;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        return createfromparcel2;
    }
}
