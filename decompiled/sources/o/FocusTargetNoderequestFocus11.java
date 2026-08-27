package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetNoderequestFocus11 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (parcel.readParcelable(null) == null) {
            return androidx.customview.view.AbsSavedState.serializer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("superState must be null");
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new androidx.customview.view.AbsSavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return androidx.customview.view.AbsSavedState.serializer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("superState must be null");
        return null;
    }
}
