package com.roadrunner.user.properties.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.createFromParcel;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.pauseWebviewIfNecessarylambda10;
import o.pickChildForBackwardSearch;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.subscribeToBannersUpdateslambda0;
import o.subscribeToBannersUpdateslambda30;

/* JADX INFO: loaded from: classes3.dex */
public final class UserPropertiesDataStore {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final pickChildForBackwardSearch RemoteActionCompatParcelizer;
    public final isRoot read = new isRoot("preference_key_user_properties");

    public UserPropertiesDataStore(pickChildForBackwardSearch pickchildforbackwardsearch) {
        this.RemoteActionCompatParcelizer = pickchildforbackwardsearch;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static final Object access$decodeFromJson(UserPropertiesDataStore userPropertiesDataStore, String str, ContinuationImpl continuationImpl) {
        subscribeToBannersUpdateslambda0 subscribetobannersupdateslambda0;
        int i = 2 % 2;
        if (continuationImpl instanceof subscribeToBannersUpdateslambda0) {
            subscribetobannersupdateslambda0 = (subscribeToBannersUpdateslambda0) continuationImpl;
            int i2 = subscribetobannersupdateslambda0.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 81;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                subscribetobannersupdateslambda0.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
                int i5 = IconCompatParcelizer + 33;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                subscribetobannersupdateslambda0 = new subscribeToBannersUpdateslambda0(userPropertiesDataStore, continuationImpl);
            }
        } else {
            subscribetobannersupdateslambda0 = new subscribeToBannersUpdateslambda0(userPropertiesDataStore, continuationImpl);
        }
        Object obj = subscribetobannersupdateslambda0.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = subscribetobannersupdateslambda0.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(subscribeToBannersUpdateslambda30.Companion.serializer());
                return (subscribeToBannersUpdateslambda30) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
            } catch (SerializationException unused) {
                subscribetobannersupdateslambda0.IconCompatParcelizer = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(userPropertiesDataStore.RemoteActionCompatParcelizer, new SignInDataStore$clear$2(24), subscribetobannersupdateslambda0);
                if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objSerializer = createFromParcel.INSTANCE;
                }
                if (objSerializer == obj2) {
                    int i8 = IconCompatParcelizer + 1;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return obj2;
                }
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = write + 37;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return null;
    }
}
