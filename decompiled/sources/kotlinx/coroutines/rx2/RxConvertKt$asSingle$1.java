package kotlinx.coroutines.rx2;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startingarea.presentation.StartingAreaNavigateViewUiModelImpl;
import com.roadrunner.twofa.presentation.TwoFaViewModel;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.sentiance.okhttp3.internal.http2.e$h;
import io.grpc.CallOptions$Builder;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DeferredCoroutine;
import o.BrazeExternalSyntheticLambda29;
import o.ShortNewsContentCardView;
import o._get_deviceId_lambda0;
import o._set_registeredPushToken_lambda1;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOriginatingPackageName;
import o.getStoreInfoFromClient;
import o.lambda39;
import o.logPushDeliverylambda1;
import o.r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.subscribeToContentCardsUpdateslambda2;
import o.subscribeToFeatureFlagsUpdateslambda2;
import o.subscribeToPushNotificationEventslambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class RxConvertKt$asSingle$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asSingle$1(subscribeToPushNotificationEventslambda1 subscribetopushnotificationeventslambda1, int i, ShortNewsContentCardView shortNewsContentCardView, int i2) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = subscribetopushnotificationeventslambda1;
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a0  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r0 == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
    
        if (((kotlinx.coroutines.flow.Flow) r3).collect(r4, r17) == r2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        if (r0 == r3) goto L88;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxConvertKt$asSingle$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RxConvertKt$asSingle$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 115;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.serializer;
        int i5 = 9;
        switch (i4) {
            case 0:
                return new RxConvertKt$asSingle$1((DeferredCoroutine) obj3, shortNewsContentCardView, 0);
            case 1:
                return new RxConvertKt$asSingle$1((getOriginatingPackageName) obj3, shortNewsContentCardView, 1);
            case 2:
                return new RxConvertKt$asSingle$1((getStoreInfoFromClient) obj3, shortNewsContentCardView, i);
            case 3:
                return new RxConvertKt$asSingle$1((r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8) obj3, shortNewsContentCardView, 3);
            case 4:
                return new RxConvertKt$asSingle$1((CallOptions$Builder) obj3, shortNewsContentCardView, 4);
            case 5:
                return new RxConvertKt$asSingle$1((_get_deviceId_lambda0) obj3, shortNewsContentCardView, 5);
            case 6:
                return new RxConvertKt$asSingle$1((_set_registeredPushToken_lambda1) obj3, shortNewsContentCardView, 6);
            case 7:
                return new RxConvertKt$asSingle$1((StartingAreaNavigateViewUiModelImpl) obj3, shortNewsContentCardView, 7);
            case 8:
                return new RxConvertKt$asSingle$1((lambda39) obj3, shortNewsContentCardView, 8);
            case 9:
                return new RxConvertKt$asSingle$1((logPushDeliverylambda1) obj3, shortNewsContentCardView, i5);
            case 10:
                return new RxConvertKt$asSingle$1((e$h) obj3, shortNewsContentCardView, 10);
            case 11:
                return new RxConvertKt$asSingle$1((TwoFaViewModel) obj3, shortNewsContentCardView, 11);
            case 12:
                return new RxConvertKt$asSingle$1((subscribeToContentCardsUpdateslambda2) obj3, this.read, shortNewsContentCardView, 12);
            case 13:
                return new RxConvertKt$asSingle$1((subscribeToFeatureFlagsUpdateslambda2) obj3, this.read, shortNewsContentCardView, 13);
            case 14:
                RxConvertKt$asSingle$1 rxConvertKt$asSingle$1 = new RxConvertKt$asSingle$1((BrazeExternalSyntheticLambda29) obj3, shortNewsContentCardView, 14);
                int i6 = write + 9;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return rxConvertKt$asSingle$1;
            default:
                return new RxConvertKt$asSingle$1((RiderHiringWebViewFragment) obj3, shortNewsContentCardView, 15);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        switch (i3) {
            case 0:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 1:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 2:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 3:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 4:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 5:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 6:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 7:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 8:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 9:
                Object objInvokeSuspend = ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i4 = IconCompatParcelizer + 21;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            case 10:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 11:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            case 12:
                ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                return createfromparcel2;
            case 13:
                ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
                int i5 = IconCompatParcelizer + 41;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return createfromparcel2;
                }
                throw null;
            case 14:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            default:
                return ((RxConvertKt$asSingle$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
    }
}
