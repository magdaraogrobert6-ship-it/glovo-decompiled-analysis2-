package com.roadrunner.rider.state.quests.data;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.ShortNewsContentCardView;
import o.buildSessionPackage;
import o.createFromParcel;
import o.getInfoParameters;
import o.getThirdPartySharingParameters;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class QuestsCache {
    private static int serializer = 0;
    private static int write = 1;
    public final isRoot RemoteActionCompatParcelizer = new isRoot("quests");
    public final buildSessionPackage read;

    public QuestsCache(buildSessionPackage buildsessionpackage) {
        this.read = buildsessionpackage;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public static final Object access$fromJson(QuestsCache questsCache, String str, ContinuationImpl continuationImpl) {
        getThirdPartySharingParameters getthirdpartysharingparameters;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 29;
        write = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 == 0) {
            boolean z = continuationImpl instanceof getThirdPartySharingParameters;
            throw null;
        }
        if (continuationImpl instanceof getThirdPartySharingParameters) {
            getthirdpartysharingparameters = (getThirdPartySharingParameters) continuationImpl;
            int i4 = getthirdpartysharingparameters.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 121;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                getthirdpartysharingparameters.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                getthirdpartysharingparameters = new getThirdPartySharingParameters(questsCache, continuationImpl);
            }
        } else {
            getthirdpartysharingparameters = new getThirdPartySharingParameters(questsCache, continuationImpl);
        }
        Object obj = getthirdpartysharingparameters.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getthirdpartysharingparameters.IconCompatParcelizer;
        if (i7 != 0) {
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        try {
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(getInfoParameters.Companion.serializer());
            return (getInfoParameters) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
        } catch (SerializationException unused) {
            getthirdpartysharingparameters.IconCompatParcelizer = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) questsCache.read.write(), new Recomposer$join$2(i, 4, shortNewsContentCardView), getthirdpartysharingparameters);
            if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objSerializer = createFromParcel.INSTANCE;
            }
            if (objSerializer == obj2) {
                return obj2;
            }
            return null;
        }
    }
}
