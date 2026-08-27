package com.roadrunner.user.properties.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.createFromParcel;
import o.pauseWebviewIfNecessarylambda10;
import o.subscribeToChangeUserEventslambda0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearUserPropertiesUseCaseImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final UserPropertiesRepository IconCompatParcelizer;

    public ClearUserPropertiesUseCaseImpl(UserPropertiesRepository userPropertiesRepository) {
        this.IconCompatParcelizer = userPropertiesRepository;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        subscribeToChangeUserEventslambda0 subscribetochangeusereventslambda0;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        createFromParcel createfromparcel;
        Object objSerializer;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 65;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            if (!(!(continuationImpl instanceof subscribeToChangeUserEventslambda0))) {
                subscribetochangeusereventslambda0 = (subscribeToChangeUserEventslambda0) continuationImpl;
                i = subscribetochangeusereventslambda0.serializer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i6 = serializer + 1;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    subscribetochangeusereventslambda0.serializer = i - Integer.MIN_VALUE;
                }
            }
            obj = subscribetochangeusereventslambda0.RemoteActionCompatParcelizer;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = subscribetochangeusereventslambda0.serializer;
            createfromparcel = createFromParcel.INSTANCE;
            if (i2 != 0) {
                i3 = write + 67;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear user properties start", new Object[0]);
            subscribetochangeusereventslambda0.serializer = 1;
            UserPropertiesRepository userPropertiesRepository = this.IconCompatParcelizer;
            userPropertiesRepository.write.set(null);
            objSerializer = pauseWebviewIfNecessarylambda10.serializer(userPropertiesRepository.IconCompatParcelizer.RemoteActionCompatParcelizer, new SignInDataStore$clear$2(24), subscribetochangeusereventslambda0);
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer == coroutineSingletons) {
                int i8 = write + 43;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear user properties end", new Object[0]);
            int i10 = serializer + 125;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return createfromparcel;
        }
        int i12 = 58 / 0;
        if (!(!(continuationImpl instanceof subscribeToChangeUserEventslambda0))) {
            subscribetochangeusereventslambda0 = (subscribeToChangeUserEventslambda0) continuationImpl;
            i = subscribetochangeusereventslambda0.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i13 = serializer + 1;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                subscribetochangeusereventslambda0.serializer = i - Integer.MIN_VALUE;
            }
        }
        obj = subscribetochangeusereventslambda0.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = subscribetochangeusereventslambda0.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            i3 = write + 67;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear user properties start", new Object[0]);
            subscribetochangeusereventslambda0.serializer = 1;
            UserPropertiesRepository userPropertiesRepository2 = this.IconCompatParcelizer;
            userPropertiesRepository2.write.set(null);
            objSerializer = pauseWebviewIfNecessarylambda10.serializer(userPropertiesRepository2.IconCompatParcelizer.RemoteActionCompatParcelizer, new SignInDataStore$clear$2(24), subscribetochangeusereventslambda0);
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons) {
                objSerializer = createfromparcel;
            }
            if (objSerializer == coroutineSingletons) {
                int i15 = write + 43;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return coroutineSingletons;
            }
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear user properties end", new Object[0]);
        int i17 = serializer + 125;
        write = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return createfromparcel;
        subscribetochangeusereventslambda0 = new subscribeToChangeUserEventslambda0(this, continuationImpl);
        int i19 = write + 31;
        serializer = i19 % Fields.SpotShadowColor;
        int i20 = i19 % 2;
        obj = subscribetochangeusereventslambda0.RemoteActionCompatParcelizer;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = subscribetochangeusereventslambda0.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            i3 = write + 67;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear user properties start", new Object[0]);
        subscribetochangeusereventslambda0.serializer = 1;
        UserPropertiesRepository userPropertiesRepository3 = this.IconCompatParcelizer;
        userPropertiesRepository3.write.set(null);
        objSerializer = pauseWebviewIfNecessarylambda10.serializer(userPropertiesRepository3.IconCompatParcelizer.RemoteActionCompatParcelizer, new SignInDataStore$clear$2(24), subscribetochangeusereventslambda0);
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer == coroutineSingletons) {
            int i110 = write + 43;
            serializer = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
            return coroutineSingletons;
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Clear user properties end", new Object[0]);
        int i112 = serializer + 125;
        write = i112 % Fields.SpotShadowColor;
        int i113 = i112 % 2;
        return createfromparcel;
    }
}
