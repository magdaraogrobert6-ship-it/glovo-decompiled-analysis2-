package com.roadrunner.user.properties.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.subscribeToBannersUpdateslambda31;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class UserPropertiesRepository {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final UserPropertiesDataStore IconCompatParcelizer;
    public final AtomicReference write = new AtomicReference();

    public UserPropertiesRepository(UserPropertiesDataStore userPropertiesDataStore) {
        this.IconCompatParcelizer = userPropertiesDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object loadUserProperties(ContinuationImpl continuationImpl) {
        subscribeToBannersUpdateslambda31 subscribetobannersupdateslambda31;
        AtomicReference atomicReference;
        int i = 2 % 2;
        if (continuationImpl instanceof subscribeToBannersUpdateslambda31) {
            subscribetobannersupdateslambda31 = (subscribeToBannersUpdateslambda31) continuationImpl;
            int i2 = subscribetobannersupdateslambda31.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = RemoteActionCompatParcelizer + 99;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                subscribetobannersupdateslambda31.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                subscribetobannersupdateslambda31 = new subscribeToBannersUpdateslambda31(this, continuationImpl);
            }
        } else {
            subscribetobannersupdateslambda31 = new subscribeToBannersUpdateslambda31(this, continuationImpl);
        }
        Object objFirstOrNull = subscribetobannersupdateslambda31.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = subscribetobannersupdateslambda31.RemoteActionCompatParcelizer;
        AtomicReference atomicReference2 = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            int i6 = 0;
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Loading KIWI user properties", new Object[0]);
            if (atomicReference2.get() == null) {
                UserPropertiesDataStore userPropertiesDataStore = this.IconCompatParcelizer;
                GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = new GetMapScope$invoke$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(userPropertiesDataStore.RemoteActionCompatParcelizer.read.serializer(), new UserPropertiesDataStore$get$1(3, i6, shortNewsContentCardView)), userPropertiesDataStore, 18);
                subscribetobannersupdateslambda31.read = atomicReference2;
                subscribetobannersupdateslambda31.RemoteActionCompatParcelizer = 1;
                objFirstOrNull = FlowKt.firstOrNull(getMapScope$invoke$$inlined$map$1, subscribetobannersupdateslambda31);
                if (objFirstOrNull == coroutineSingletons) {
                    int i7 = RemoteActionCompatParcelizer + 69;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return coroutineSingletons;
                }
                atomicReference = atomicReference2;
            }
            return atomicReference2.get();
        }
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i9 = RemoteActionCompatParcelizer + 111;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            AtomicReference atomicReference3 = subscribetobannersupdateslambda31.read;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            shortNewsContentCardView.hashCode();
            throw null;
        }
        atomicReference = subscribetobannersupdateslambda31.read;
        ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        atomicReference.set(objFirstOrNull);
        return atomicReference2.get();
    }
}
