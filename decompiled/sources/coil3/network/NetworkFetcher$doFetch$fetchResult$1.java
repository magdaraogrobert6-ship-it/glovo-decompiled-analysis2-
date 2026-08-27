package coil3.network;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ReusableGraphicsLayerScope;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createBlurEffect8A3gB4;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.getNone4e0Vf04;
import o.logUnregisterActivitylambda1;
import o.onBackCancelledlambda3;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class NetworkFetcher$doFetch$fetchResult$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public int RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public Object serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, NetworkFetcher networkFetcher, createInAppMessageEventSubscriber createinappmessageeventsubscriber2, ReusableGraphicsLayerScope reusableGraphicsLayerScope, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = 0;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
        this.MediaSessionCompatQueueItem = networkFetcher;
        this.serializer = createinappmessageeventsubscriber2;
        this.IconCompatParcelizer = reusableGraphicsLayerScope;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NetworkFetcher$doFetch$fetchResult$1(Object obj, Object obj2, Object obj3, Object obj4, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer = obj2;
        this.MediaSessionCompatQueueItem = obj3;
        this.IconCompatParcelizer = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$fetchResult$1(DropShadowEffect dropShadowEffect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, List list, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = 2;
        this.read = dropShadowEffect;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.IconCompatParcelizer = list;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 23;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            return ((NetworkFetcher$doFetch$fetchResult$1) create((createBlurEffect8A3gB4) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((NetworkFetcher$doFetch$fetchResult$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 2) {
            Object objInvokeSuspend = ((NetworkFetcher$doFetch$fetchResult$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
            int i4 = MediaMetadataCompat + 85;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj3.hashCode();
            throw null;
        }
        if (i3 == 3) {
            return ((NetworkFetcher$doFetch$fetchResult$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend2 = ((NetworkFetcher$doFetch$fetchResult$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        int i5 = MediaDescriptionCompat + 99;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return objInvokeSuspend2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.MediaSessionCompatQueueItem;
        if (i4 == 0) {
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1((createInAppMessageEventSubscriber) this.RemoteActionCompatParcelizer, (NetworkFetcher) obj3, (createInAppMessageEventSubscriber) this.serializer, (ReusableGraphicsLayerScope) obj2, shortNewsContentCardView);
            networkFetcher$doFetch$fetchResult$1.read = obj;
            return networkFetcher$doFetch$fetchResult$1;
        }
        if (i4 == 1) {
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$2 = new NetworkFetcher$doFetch$fetchResult$1((logUnregisterActivitylambda1) this.RemoteActionCompatParcelizer, (Animatable) this.serializer, (PopulateViewStructure_androidKtpopulate7) obj3, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 1);
            networkFetcher$doFetch$fetchResult$2.read = obj;
            return networkFetcher$doFetch$fetchResult$2;
        }
        if (i4 == 2) {
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$3 = new NetworkFetcher$doFetch$fetchResult$1((DropShadowEffect) this.read, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (List) obj2, shortNewsContentCardView);
            int i5 = MediaDescriptionCompat + 23;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 25 / 0;
            }
            return networkFetcher$doFetch$fetchResult$3;
        }
        if (i4 != 3) {
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$4 = new NetworkFetcher$doFetch$fetchResult$1((BleScanningLifecycleObserverImpl) this.RemoteActionCompatParcelizer, (String) this.serializer, (cancelPendingWebViewPause) obj3, (getNone4e0Vf04) obj2, shortNewsContentCardView, 4);
            networkFetcher$doFetch$fetchResult$4.read = obj;
            return networkFetcher$doFetch$fetchResult$4;
        }
        NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$5 = new NetworkFetcher$doFetch$fetchResult$1((cancelPendingWebViewPause) this.RemoteActionCompatParcelizer, (FlowLiveDataConversions$asFlow$1$1) this.serializer, (onBackCancelledlambda3) obj3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, shortNewsContentCardView, 3);
        networkFetcher$doFetch$fetchResult$5.read = obj;
        int i7 = MediaDescriptionCompat + 103;
        MediaMetadataCompat = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            int i8 = 28 / 0;
        }
        return networkFetcher$doFetch$fetchResult$5;
    }

    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec A[Catch: Exception -> 0x00cf, TRY_ENTER, TryCatch #0 {Exception -> 0x00cf, blocks: (B:37:0x00b7, B:50:0x00ec, B:53:0x0100, B:41:0x00c9), top: B:148:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[Catch: Exception -> 0x00cf, PHI: r0 r6 r11
  0x0100: PHI (r0v32 androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1) = 
  (r0v40 androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1)
  (r0v43 androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1)
 binds: [B:51:0x00fd, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r6v25 o.getContentViewGroupParentLayout) = (r6v34 o.getContentViewGroupParentLayout), (r6v35 o.getContentViewGroupParentLayout) binds: [B:51:0x00fd, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r11v19 java.lang.Object) = (r11v23 java.lang.Object), (r11v24 java.lang.Object) binds: [B:51:0x00fd, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x00cf, blocks: (B:37:0x00b7, B:50:0x00ec, B:53:0x0100, B:41:0x00c9), top: B:148:0x00ac }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r6v28, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Type inference failed for: r6v32, types: [o.getContentViewGroupParentLayout] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x01fc -> B:107:0x0200). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x010a -> B:46:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:163:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher$doFetch$fetchResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
