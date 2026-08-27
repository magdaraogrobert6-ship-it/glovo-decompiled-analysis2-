package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class getBindingAdapter {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final getBindingAdapterPosition IconCompatParcelizer;
    public final getLayoutPosition read;
    public final getOldPosition serializer;
    public final getAdapterPosition write;

    public getBindingAdapter(getBindingAdapterPosition getbindingadapterposition, getAdapterPosition getadapterposition, getOldPosition getoldposition, getLayoutPosition getlayoutposition) {
        this.IconCompatParcelizer = getbindingadapterposition;
        this.write = getadapterposition;
        this.serializer = getoldposition;
        this.read = getlayoutposition;
    }

    public final clearReturnedFromScrapFlag serializer(getAbsoluteAdapterPosition getabsoluteadapterposition) {
        int i = 2 % 2;
        if (getabsoluteadapterposition.equals(getAbsoluteAdapterPosition.read)) {
            getLayoutPosition getlayoutposition = this.read;
            int i2 = RemoteActionCompatParcelizer + 35;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return getlayoutposition;
        }
        if (getabsoluteadapterposition.equals(getAbsoluteAdapterPosition.IconCompatParcelizer)) {
            int i4 = RemoteActionCompatParcelizer + 21;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return this.write;
        }
        if (getabsoluteadapterposition.equals(getAbsoluteAdapterPosition.serializer)) {
            return this.serializer;
        }
        if (!getabsoluteadapterposition.equals(getAbsoluteAdapterPosition.write)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i6 = RatingCompat + 53;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return this.IconCompatParcelizer;
    }
}
