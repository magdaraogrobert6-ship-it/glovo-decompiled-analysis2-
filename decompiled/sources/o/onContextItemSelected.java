package o;

import com.roadrunner.home.bottomsheet.loading.BottomSheetShimmeringLoadingBarUiModel;
import com.roadrunner.home.bottomsheet.sheethandle.SheetHandleItemUiModel;
import com.roadrunner.home.bottomsheet.skeleton.BottomSheetHeaderSkeletonUiModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onContextItemSelected {
    public final boolean IconCompatParcelizer;
    public final BottomSheetShimmeringLoadingBarUiModel RemoteActionCompatParcelizer;
    public final BottomSheetHeaderSkeletonUiModel serializer;
    public final SheetHandleItemUiModel write;

    public onContextItemSelected(SheetHandleItemUiModel sheetHandleItemUiModel, BottomSheetHeaderSkeletonUiModel bottomSheetHeaderSkeletonUiModel, BottomSheetShimmeringLoadingBarUiModel bottomSheetShimmeringLoadingBarUiModel, BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206) {
        this.write = sheetHandleItemUiModel;
        this.serializer = bottomSheetHeaderSkeletonUiModel;
        this.RemoteActionCompatParcelizer = bottomSheetShimmeringLoadingBarUiModel;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) brazeExternalSyntheticLambda206.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        this.IconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SESSION_LOG_ENABLED);
    }
}
