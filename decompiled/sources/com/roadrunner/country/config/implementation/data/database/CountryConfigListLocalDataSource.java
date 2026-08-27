package com.roadrunner.country.config.implementation.data.database;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.user.properties.data.UserPropertiesDataStore$get$1;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import o.createFromParcel;
import o.getNoActiveChildannotations;
import o.isAdapterPositionOnScreen;
import o.isOpenInternalroom_runtime;
import o.isRoot;
import o.metaMarkUpdatedAndHasCallbacks;
import o.metaUnMarkUpdated;
import o.packMeta;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigListLocalDataSource {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final performCustomExitMxy_nc0 serializer;
    public final isRoot read = new isRoot("preference_key_country_config_list");
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new StateV3$$ExternalSyntheticLambda0(13));

    public CountryConfigListLocalDataSource(performCustomExitMxy_nc0 performcustomexitmxy_nc0, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.serializer = performcustomexitmxy_nc0;
    }

    public final Flow write() {
        int i = 2 % 2;
        HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1 = new HeatmapDataStore$get$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(this.serializer.serializer(), new UserPropertiesDataStore$get$1(3, 1, null)), this, 4);
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(heatmapDataStore$get$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
        int i2 = IconCompatParcelizer + 95;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 48 / 0;
        }
        return flowRemoteActionCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public static final Object access$decodeFromJson(CountryConfigListLocalDataSource countryConfigListLocalDataSource, String str, ContinuationImpl continuationImpl) {
        metaUnMarkUpdated metaunmarkupdated;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof metaUnMarkUpdated) {
            int i2 = IconCompatParcelizer + 25;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((metaUnMarkUpdated) continuationImpl).RemoteActionCompatParcelizer;
                throw null;
            }
            metaunmarkupdated = (metaUnMarkUpdated) continuationImpl;
            int i4 = metaunmarkupdated.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                metaunmarkupdated.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                metaunmarkupdated = new metaUnMarkUpdated(countryConfigListLocalDataSource, continuationImpl);
            }
        } else {
            metaunmarkupdated = new metaUnMarkUpdated(countryConfigListLocalDataSource, continuationImpl);
        }
        Object obj2 = metaunmarkupdated.serializer;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = metaunmarkupdated.RemoteActionCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            try {
                resetTransientState resettransientstate = (resetTransientState) countryConfigListLocalDataSource.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
                resettransientstate.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(new setWasCloseMessageCalled(metaMarkUpdatedAndHasCallbacks.Companion.serializer(), 0));
                return (List) resettransientstate.serializer(str, setgraphicmodalmaxwidthdp);
            } catch (SerializationException unused) {
                metaunmarkupdated.RemoteActionCompatParcelizer = 1;
                if (countryConfigListLocalDataSource.clearIfNotEmpty(metaunmarkupdated) == obj3) {
                    return obj3;
                }
                return null;
            }
        }
        int i6 = IconCompatParcelizer + 13;
        int i7 = i6 % Fields.SpotShadowColor;
        write = i7;
        int i8 = i6 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i9 = i7 + 65;
        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    public final Object clearIfNotEmpty(ContinuationImpl continuationImpl) {
        packMeta packmeta;
        int i = 2 % 2;
        int i2 = write + 77;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof packMeta;
            throw null;
        }
        if (continuationImpl instanceof packMeta) {
            packmeta = (packMeta) continuationImpl;
            int i3 = packmeta.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = IconCompatParcelizer + 27;
                write = i4 % Fields.SpotShadowColor;
                packmeta.RemoteActionCompatParcelizer = i4 % 2 == 0 ? i3 * Integer.MIN_VALUE : i3 - Integer.MIN_VALUE;
            } else {
                packmeta = new packMeta(this, continuationImpl);
            }
        } else {
            packmeta = new packMeta(this, continuationImpl);
        }
        Object objFirstOrNull = packmeta.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = packmeta.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.serializer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            Flow flowSerializer = performcustomexitmxy_nc0.serializer();
            packmeta.RemoteActionCompatParcelizer = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowSerializer, packmeta);
            if (objFirstOrNull != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            int i6 = write + 55;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i5 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                int i8 = IconCompatParcelizer + 73;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i10 = write + 125;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        getNoActiveChildannotations getnoactivechildannotations = (getNoActiveChildannotations) objFirstOrNull;
        if (getnoactivechildannotations != null && (!getnoactivechildannotations.read().isEmpty())) {
            SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(4);
            packmeta.RemoteActionCompatParcelizer = 2;
            if (pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$clear$2, packmeta) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
