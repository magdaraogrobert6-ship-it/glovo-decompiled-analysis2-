package coil3;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase;
import coil3.network.NetworkFetcher;
import com.deliveryhero.customerchat.fwf.FeatureFlagProvider;
import com.deliveryhero.perseus.hits.usecase.PerseusSaveHitUseCase;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.deliveryhero.selfServiceChat.ui.WebViewManager;
import com.foodora.courier.delivery.service.DeliveryService;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mapbox.common.location.Location;
import com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.routerefresh.QueuedRequest;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.voice.api.VoiceInstructionsTextPlayer;
import com.mapbox.navigation.voice.model.SpeechVolume;
import com.roadrunner.adjust.ui.AdjustTrueLinkBrowsableActivity;
import com.roadrunner.appreview.AppReviewLifecycleObserverImpl;
import com.roadrunner.auth.data.ExecuteTwoFaApiRequest;
import com.roadrunner.auth.domain.state.GetUserAuthStateImpl;
import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.sentiance.core.model.events.N$b;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.Bullet;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.LayerSnapshotV21;
import o.SemanticsSortKtsortByGeometryGroupings1;
import o.ShaderKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.WebViewRenderProcessClientFrameworkAdapter;
import o.accessisRenderNodeCompatiblecp;
import o.createBlurEffect8A3gB4;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.getIntersectrtfAjoo;
import o.getMax;
import o.getOffsetFromRectListForBjo55l4;
import o.getOrElse;
import o.indirectPrimaryDirectionalScrollAxis;
import o.isRoot;
import o.obtainSizePxVpY3zN4;
import o.paintRPmYEkkdefault;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setSpotShadowColor;
import o.swap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class RealImageLoader$execute$2$job$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(getOrElse getorelse, int i, List list, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 20;
        this.read = getorelse;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = list;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:270:0x0582  */
    /* JADX WARN: Code duplicated, block: B:271:0x0587  */
    /* JADX WARN: Code duplicated, block: B:274:0x05ac  */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06fa, code lost:
    
        if (r3 == r2) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x070c, code lost:
    
        if (r0 == r2) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0a18, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest((kotlinx.coroutines.flow.Flow) r2, r5, r20) == r0) goto L490;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v100, types: [o.isItemDismissable] */
    /* JADX WARN: Type inference failed for: r2v112, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v97, types: [com.roadrunner.auth.data.ExecuteTwoFaApiRequest] */
    /* JADX WARN: Type inference failed for: r2v98, types: [com.roadrunner.auth.data.ExecuteTwoFaApiRequest] */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.deliveryhero.customerchat.fwf.Custom] */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader$execute$2$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(RoomDatabase roomDatabase, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 2;
        this.read = roomDatabase;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$2$job$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealImageLoader$execute$2$job$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealImageLoader$execute$2$job$1(ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 3;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj2 = this.serializer;
        int i3 = 17;
        switch (i2) {
            case 0:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$1 = new RealImageLoader$execute$2$job$1((RealImageLoader) this.read, (ShaderKt) obj2, shortNewsContentCardView, 0);
                int i4 = write + 67;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return realImageLoader$execute$2$job$1;
            case 1:
                return new RealImageLoader$execute$2$job$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.read, (createInAppMessageEventSubscriber) obj2, shortNewsContentCardView, 1);
            case 2:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$2 = new RealImageLoader$execute$2$job$1((RoomDatabase) this.read, shortNewsContentCardView, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2);
                int i6 = write + 35;
                MediaMetadataCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return realImageLoader$execute$2$job$2;
            case 3:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$3 = new RealImageLoader$execute$2$job$1(shortNewsContentCardView, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2);
                realImageLoader$execute$2$job$3.read = obj;
                return realImageLoader$execute$2$job$3;
            case 4:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$4 = new RealImageLoader$execute$2$job$1((getMax) obj2, shortNewsContentCardView, 4);
                realImageLoader$execute$2$job$4.read = obj;
                return realImageLoader$execute$2$job$4;
            case 5:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$5 = new RealImageLoader$execute$2$job$1((NetworkFetcher) obj2, shortNewsContentCardView, 5);
                realImageLoader$execute$2$job$5.read = obj;
                return realImageLoader$execute$2$job$5;
            case 6:
                return new RealImageLoader$execute$2$job$1((FeatureFlagProvider) this.read, (LayerSnapshotV21) obj2, shortNewsContentCardView, 6);
            case 7:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$6 = new RealImageLoader$execute$2$job$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 7);
                realImageLoader$execute$2$job$6.read = obj;
                return realImageLoader$execute$2$job$6;
            case 8:
                return new RealImageLoader$execute$2$job$1((PerseusSaveHitUseCase) this.read, (LinkedHashMap) obj2, shortNewsContentCardView, 8);
            case 9:
                return new RealImageLoader$execute$2$job$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.read, (obtainSizePxVpY3zN4) obj2, shortNewsContentCardView, 9);
            case 10:
                return new RealImageLoader$execute$2$job$1((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.read, (WebChatViewmodel) obj2, shortNewsContentCardView, 10);
            case 11:
                return new RealImageLoader$execute$2$job$1((setSpotShadowColor) this.read, (WebViewManager) obj2, shortNewsContentCardView, 11);
            case 12:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$7 = new RealImageLoader$execute$2$job$1((DeliveryService) obj2, shortNewsContentCardView, 12);
                realImageLoader$execute$2$job$7.read = obj;
                return realImageLoader$execute$2$job$7;
            case 13:
                return new RealImageLoader$execute$2$job$1((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) this.read, (indirectPrimaryDirectionalScrollAxis) obj2, shortNewsContentCardView, 13);
            case 14:
                return new RealImageLoader$execute$2$job$1((swap) this.read, (isRoot) obj2, shortNewsContentCardView, 14);
            case 15:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$8 = new RealImageLoader$execute$2$job$1((RemoteSettings) obj2, shortNewsContentCardView, 15);
                realImageLoader$execute$2$job$8.read = obj;
                return realImageLoader$execute$2$job$8;
            case 16:
                return new RealImageLoader$execute$2$job$1((Flow) this.read, (LocationComponentPluginImpl) obj2, shortNewsContentCardView, 16);
            case 17:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$9 = new RealImageLoader$execute$2$job$1((DefaultLocationProvider) obj2, shortNewsContentCardView, i3);
                realImageLoader$execute$2$job$9.read = obj;
                return realImageLoader$execute$2$job$9;
            case 18:
                return new RealImageLoader$execute$2$job$1((N$b) this.read, (QueuedRequest) obj2, shortNewsContentCardView, 18);
            case 19:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$10 = new RealImageLoader$execute$2$job$1((MapboxTripSession) obj2, shortNewsContentCardView, 19);
                realImageLoader$execute$2$job$10.read = obj;
                int i8 = MediaMetadataCompat + 17;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return realImageLoader$execute$2$job$10;
            case 20:
                return new RealImageLoader$execute$2$job$1((getOrElse) this.read, this.RemoteActionCompatParcelizer, (List) obj2, shortNewsContentCardView);
            case 21:
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$11 = new RealImageLoader$execute$2$job$1((VoiceInstructionsTextPlayer) this.read, (SpeechVolume) obj2, shortNewsContentCardView, 21);
                int i10 = write + 47;
                MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return realImageLoader$execute$2$job$11;
                }
                throw null;
            case 22:
                return new RealImageLoader$execute$2$job$1((AdjustTrueLinkBrowsableActivity) this.read, (Uri) obj2, shortNewsContentCardView, 22);
            case 23:
                return new RealImageLoader$execute$2$job$1((accessisRenderNodeCompatiblecp) this.read, (AppReviewLifecycleObserverImpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new RealImageLoader$execute$2$job$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.read, (ExecuteTwoFaApiRequest) obj2, shortNewsContentCardView, 24);
            case 25:
                return new RealImageLoader$execute$2$job$1((SemanticsSortKtsortByGeometryGroupings1) this.read, (String) obj2, shortNewsContentCardView, 25);
            case 26:
                return new RealImageLoader$execute$2$job$1((CountryConfigListLocalDataSource) this.read, (List) obj2, shortNewsContentCardView, 26);
            case 27:
                return new RealImageLoader$execute$2$job$1((getOffsetFromRectListForBjo55l4) this.read, (String) obj2, shortNewsContentCardView, 27);
            case 28:
                return new RealImageLoader$execute$2$job$1((ChatUrlProviderImpl) this.read, (Bullet) obj2, shortNewsContentCardView, 28);
            default:
                return new RealImageLoader$execute$2$job$1((GetUserAuthStateImpl) this.read, (paintRPmYEkkdefault) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                Object objInvokeSuspend = ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = MediaMetadataCompat + 83;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 3:
                return ((RealImageLoader$execute$2$job$1) create((getIntersectrtfAjoo) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((RealImageLoader$execute$2$job$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((RealImageLoader$execute$2$job$1) create((createBlurEffect8A3gB4) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((RealImageLoader$execute$2$job$1) create((WebViewRenderProcessClientFrameworkAdapter) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((RealImageLoader$execute$2$job$1) create((JSONObject) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((RealImageLoader$execute$2$job$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((RealImageLoader$execute$2$job$1) create((Location) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((RealImageLoader$execute$2$job$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                Object objInvokeSuspend2 = ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i4 = MediaMetadataCompat + 23;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objInvokeSuspend2;
            case 26:
                Object objInvokeSuspend3 = ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i6 = MediaMetadataCompat + 97;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return objInvokeSuspend3;
            case 27:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((RealImageLoader$execute$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }
}
