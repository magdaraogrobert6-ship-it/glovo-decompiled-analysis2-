package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.AnimationSearchTargetBasedSearch;
import o.AnimationSearch_androidKtfindRememberedDatarememberCalls11;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.displayInAppMessagelambda0;
import o.displayInAppMessagelambda1;
import o.displayInAppMessagelambda10;
import o.getMaxDuration;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class UtccTaskStateRepositoryImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final AnimationSearchTargetBasedSearch write;

    public UtccTaskStateRepositoryImpl(AnimationSearchTargetBasedSearch animationSearchTargetBasedSearch) {
        animationSearchTargetBasedSearch.getClass();
        this.write = animationSearchTargetBasedSearch;
    }

    public static isRoot write(long j) {
        int i = 2 % 2;
        isRoot isroot = new isRoot(af$$ExternalSyntheticOutline0.m(j, "utcc_task_state"));
        int i2 = read + 13;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return isroot;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r1 r4
  0x002e: PHI (r1v9 o.AnimationSearch_androidKtfindRememberedDatarememberCalls11) = 
  (r1v8 o.AnimationSearch_androidKtfindRememberedDatarememberCalls11)
  (r1v11 o.AnimationSearch_androidKtfindRememberedDatarememberCalls11)
 binds: [B:10:0x002c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x002e: PHI (r4v5 int) = (r4v4 int), (r4v7 int) binds: [B:10:0x002c, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public static final Object access$decodeFromJson(UtccTaskStateRepositoryImpl utccTaskStateRepositoryImpl, String str, ContinuationImpl continuationImpl) {
        AnimationSearch_androidKtfindRememberedDatarememberCalls11 animationSearch_androidKtfindRememberedDatarememberCalls11;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        utccTaskStateRepositoryImpl.getClass();
        if (continuationImpl instanceof AnimationSearch_androidKtfindRememberedDatarememberCalls11) {
            int i4 = IconCompatParcelizer + 17;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                animationSearch_androidKtfindRememberedDatarememberCalls11 = (AnimationSearch_androidKtfindRememberedDatarememberCalls11) continuationImpl;
                i = animationSearch_androidKtfindRememberedDatarememberCalls11.write;
                int i5 = 83 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    animationSearch_androidKtfindRememberedDatarememberCalls11.write = i - Integer.MIN_VALUE;
                } else {
                    animationSearch_androidKtfindRememberedDatarememberCalls11 = new AnimationSearch_androidKtfindRememberedDatarememberCalls11(utccTaskStateRepositoryImpl, continuationImpl);
                }
            } else {
                animationSearch_androidKtfindRememberedDatarememberCalls11 = (AnimationSearch_androidKtfindRememberedDatarememberCalls11) continuationImpl;
                i = animationSearch_androidKtfindRememberedDatarememberCalls11.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    animationSearch_androidKtfindRememberedDatarememberCalls11.write = i - Integer.MIN_VALUE;
                } else {
                    animationSearch_androidKtfindRememberedDatarememberCalls11 = new AnimationSearch_androidKtfindRememberedDatarememberCalls11(utccTaskStateRepositoryImpl, continuationImpl);
                }
            }
        } else {
            animationSearch_androidKtfindRememberedDatarememberCalls11 = new AnimationSearch_androidKtfindRememberedDatarememberCalls11(utccTaskStateRepositoryImpl, continuationImpl);
        }
        Object obj = animationSearch_androidKtfindRememberedDatarememberCalls11.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = animationSearch_androidKtfindRememberedDatarememberCalls11.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer;
                displayInAppMessagelambda10 displayinappmessagelambda10 = displayInAppMessagelambda1.IconCompatParcelizer;
                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(getMaxDuration.class);
                List list = Collections.EMPTY_LIST;
                displayinappmessagelambda10.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareinappmessagewithzippedassethtml, new displayInAppMessagelambda0(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, list, true));
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpIconCompatParcelizer;
                return (getMaxDuration) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdpIconCompatParcelizer);
            } catch (SerializationException e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("utcc_task_state: Could not decode the data, clearing data store state. Data - ", str), new Object[0]);
                animationSearch_androidKtfindRememberedDatarememberCalls11.write = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(utccTaskStateRepositoryImpl.write.read, new SignInDataStore$clear$2(i2, 9, shortNewsContentCardView), animationSearch_androidKtfindRememberedDatarememberCalls11);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                Object obj2 = createFromParcel.INSTANCE;
                if (objSerializer != coroutineSingletons2) {
                    objSerializer = obj2;
                }
                if (objSerializer == coroutineSingletons2) {
                    obj2 = objSerializer;
                }
                if (obj2 == coroutineSingletons) {
                    int i7 = IconCompatParcelizer + 45;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = read + 19;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i10 = 69 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        }
        coroutineSingletons = null;
        int i11 = IconCompatParcelizer + 31;
        read = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return coroutineSingletons;
    }
}
