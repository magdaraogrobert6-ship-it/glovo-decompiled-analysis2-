package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.repository.api.DeliveryInformation$ScreenDataType;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class requireFragmentManager extends AdaptedFunctionReference implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        int i;
        int i2 = 2 % 2;
        getCallbackId getcallbackid = (getCallbackId) obj;
        timesmpE4wyQ timesmpe4wyq = (timesmpE4wyQ) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        drawRGB drawrgb = (drawRGB) obj4;
        ((requireActivity) this.MediaSessionCompatQueueItem).getClass();
        if (getcallbackid == null) {
            return requireParentFragment.NOT_ACTIVE;
        }
        if (timesmpe4wyq.IconCompatParcelizer) {
            int i3 = RemoteActionCompatParcelizer + 37;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (drawrgb == drawRGB.ACTIVE) {
                int i5 = RemoteActionCompatParcelizer + 77;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                requireParentFragment requireparentfragment = requireParentFragment.LAST_STOP;
                int i7 = IconCompatParcelizer + 103;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return requireparentfragment;
            }
        }
        isTrackingEnabled istrackingenabled = getcallbackid.IconCompatParcelizer;
        Object obj6 = null;
        switch (requireContext.IconCompatParcelizer[istrackingenabled.ordinal()]) {
            case 1:
                if (!zBooleanValue) {
                    return requireParentFragment.NOT_ACTIVE;
                }
                int i9 = RemoteActionCompatParcelizer + 37;
                IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return requireParentFragment.HAS_WORK_NOW_OPPORTUNITY;
            case 2:
            case 3:
                return requireParentFragment.NOT_ACTIVE;
            case 4:
            case 5:
                return requireParentFragment.PAUSED;
            case 6:
            case 7:
                return requireParentFragment.PREPARING_TO_WORK;
            case 8:
            case 9:
            case 10:
                if (istrackingenabled == isTrackingEnabled.ENDING) {
                    int i11 = RemoteActionCompatParcelizer + 105;
                    IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    z = true;
                } else {
                    z = false;
                }
                DeliveryInformation$ScreenDataType deliveryInformation$ScreenDataType = timesmpe4wyq.MediaMetadataCompat;
                if (deliveryInformation$ScreenDataType == null) {
                    int i13 = RemoteActionCompatParcelizer + 77;
                    IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i13 % 2 != 0) {
                        obj6.hashCode();
                        throw null;
                    }
                    i = -1;
                } else {
                    i = requireContext.serializer[deliveryInformation$ScreenDataType.ordinal()];
                }
                switch (i) {
                    case -1:
                    case 4:
                    case 5:
                    case 6:
                        return !z ? requireParentFragment.WAITING_FOR_DELIVERIES : requireParentFragment.ENDING_WITHOUT_ORDERS;
                    case 0:
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    case 1:
                        return requireParentFragment.ACCEPTING_DELIVERIES;
                    case 2:
                        return requireParentFragment.PICK_UP_DROP_OFF;
                    case 3:
                        return requireParentFragment.ON_THE_WAY;
                }
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
        }
    }

    public requireFragmentManager(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(i, i2, cls, obj, str, str2);
    }
}
