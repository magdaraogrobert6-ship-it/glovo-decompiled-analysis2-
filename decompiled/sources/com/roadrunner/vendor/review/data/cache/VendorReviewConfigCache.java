package com.roadrunner.vendor.review.data.cache;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.SerializationException;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentCardsLastUpdatedInSecondsFromEpoch;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.resetTransientState;
import o.setGraphicModalMaxWidthDp;
import o.wipeData;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewConfigCache {
    private static int read = 0;
    private static int write = 1;
    public final performCustomExitMxy_nc0 RemoteActionCompatParcelizer;
    public final isRoot serializer = new isRoot("vendor_review_config_binary");
    public final isRoot IconCompatParcelizer = new isRoot("vendor_review_config_timestamp");

    public VendorReviewConfigCache(performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        this.RemoteActionCompatParcelizer = performcustomexitmxy_nc0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object access$decodeFromJson(VendorReviewConfigCache vendorReviewConfigCache, String str, ContinuationImpl continuationImpl) {
        wipeData wipedata;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 5;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        vendorReviewConfigCache.getClass();
        if (continuationImpl instanceof wipeData) {
            wipedata = (wipeData) continuationImpl;
            int i5 = wipedata.IconCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                wipedata.IconCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                wipedata = new wipeData(vendorReviewConfigCache, continuationImpl);
            }
        } else {
            wipedata = new wipeData(vendorReviewConfigCache, continuationImpl);
        }
        Object obj = wipedata.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = wipedata.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 != 0) {
            int i7 = read + 75;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(getContentCardsLastUpdatedInSecondsFromEpoch.Companion.serializer());
                return (getContentCardsLastUpdatedInSecondsFromEpoch) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdp);
            } catch (SerializationException unused) {
                wipedata.IconCompatParcelizer = 1;
                Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(vendorReviewConfigCache.RemoteActionCompatParcelizer, new SignInDataStore$clear$2(i, 25, shortNewsContentCardView), wipedata);
                if (objSerializer != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objSerializer = createFromParcel.INSTANCE;
                }
                if (objSerializer == obj2) {
                    return obj2;
                }
            }
        }
        int i8 = write + 7;
        read = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return null;
    }
}
