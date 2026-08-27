package com.roadrunner.user.properties.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.country.config.implementation.data.database.CountryListDataStoreException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setNativeShader;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class UserPropertiesDataStore$get$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public /* synthetic */ FlowCollector serializer;
    public /* synthetic */ Throwable write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserPropertiesDataStore$get$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        FlowCollector flowCollector = (FlowCollector) obj;
        Throwable th = (Throwable) obj2;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj3;
        int i4 = 3;
        if (i3 == 0) {
            UserPropertiesDataStore$get$1 userPropertiesDataStore$get$1 = new UserPropertiesDataStore$get$1(i4, 0, shortNewsContentCardView);
            userPropertiesDataStore$get$1.serializer = flowCollector;
            userPropertiesDataStore$get$1.write = th;
            return userPropertiesDataStore$get$1.invokeSuspend(createfromparcel2);
        }
        UserPropertiesDataStore$get$1 userPropertiesDataStore$get$2 = new UserPropertiesDataStore$get$1(i4, 1, shortNewsContentCardView);
        userPropertiesDataStore$get$2.serializer = flowCollector;
        userPropertiesDataStore$get$2.write = th;
        Object objInvokeSuspend = userPropertiesDataStore$get$2.invokeSuspend(createfromparcel2);
        int i5 = MediaSessionCompatQueueItem + 123;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 != 0) {
            FlowCollector flowCollector = this.serializer;
            Throwable th = this.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.write(new CountryListDataStoreException(th));
                backwardFocusSearch backwardfocussearch = setNativeShader.read();
                this.serializer = null;
                this.write = null;
                this.IconCompatParcelizer = 1;
                return flowCollector.emit(backwardfocussearch, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            int i4 = read + 121;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        FlowCollector flowCollector2 = this.serializer;
        Throwable th2 = this.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = read + 101;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Timber.RemoteActionCompatParcelizer.write(new UserPropertiesDataStoreException(th2));
        backwardFocusSearch backwardfocussearch2 = setNativeShader.read();
        this.serializer = null;
        this.write = null;
        this.IconCompatParcelizer = 1;
        if (flowCollector2.emit(backwardfocussearch2, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i7 = read + 103;
        MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return coroutineSingletons2;
    }
}
