package o;

import androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1;
import androidx.lifecycle.BlockRunner$cancel$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexModifierKt extends androidx.activity.OnBackPressedCallback {
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final AndroidAutofillType_androidKt RemoteActionCompatParcelizer;
    public final androidx.compose.animation.core.Animatable serializer;

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.RemoteActionCompatParcelizer.invoke();
    }

    public ZIndexModifierKt(boolean z, getContentViewGroupParentLayout getcontentviewgroupparentlayout, androidx.compose.animation.core.Animatable animatable, AndroidAutofillType_androidKt androidAutofillType_androidKt) {
        super(z);
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        this.serializer = animatable;
        this.RemoteActionCompatParcelizer = androidAutofillType_androidKt;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackProgressed(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(this, r8lambda54beh8zsbru0cxi2ccsp2synys, null, 1), 3);
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackStarted(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys) {
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(this, r8lambda54beh8zsbru0cxi2ccsp2synys, null, 0), 3);
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackCancelled() {
        BuildersKt.RemoteActionCompatParcelizer(this.IconCompatParcelizer, null, null, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 11), 3);
    }
}
