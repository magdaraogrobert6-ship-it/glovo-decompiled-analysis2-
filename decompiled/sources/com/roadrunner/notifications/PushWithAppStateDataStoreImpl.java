package com.roadrunner.notifications;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.gdprForgetMeI;
import o.instance_delegatelambda0;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.rdExternalSyntheticLambda0;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes3.dex */
public final class PushWithAppStateDataStoreImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final isOpenInternalroom_runtime read;
    public final performCustomExitMxy_nc0 serializer;
    public final isRoot write;

    public PushWithAppStateDataStoreImpl(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        performcustomexitmxy_nc0.getClass();
        this.serializer = performcustomexitmxy_nc0;
        this.read = isopeninternalroom_runtime;
        this.write = new isRoot("pref_key_push_items");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object access$decodeFromJson(PushWithAppStateDataStoreImpl pushWithAppStateDataStoreImpl, String str, ContinuationImpl continuationImpl) {
        rdExternalSyntheticLambda0 rdexternalsyntheticlambda0;
        int i = 2 % 2;
        if (continuationImpl instanceof rdExternalSyntheticLambda0) {
            rdexternalsyntheticlambda0 = (rdExternalSyntheticLambda0) continuationImpl;
            int i2 = rdexternalsyntheticlambda0.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                rdexternalsyntheticlambda0.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                rdexternalsyntheticlambda0 = new rdExternalSyntheticLambda0(pushWithAppStateDataStoreImpl, continuationImpl);
            }
        } else {
            rdexternalsyntheticlambda0 = new rdExternalSyntheticLambda0(pushWithAppStateDataStoreImpl, continuationImpl);
        }
        Object obj = rdexternalsyntheticlambda0.RemoteActionCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = rdexternalsyntheticlambda0.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                return (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(gdprForgetMeI.Companion.serializer(), 0));
            } catch (SerializationException unused) {
                rdexternalsyntheticlambda0.IconCompatParcelizer = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(pushWithAppStateDataStoreImpl.serializer, new PhotoIdUiModelImpl$1$1(pushWithAppStateDataStoreImpl, shortNewsContentCardView, 6), rdexternalsyntheticlambda0);
                if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objSerializer = createFromParcel.INSTANCE;
                }
                if (objSerializer != obj2) {
                }
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i7 = 28 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        }
        obj2 = instance_delegatelambda0.write;
        int i8 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return obj2;
    }
}
