package o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes.dex */
public final class setBrush implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new androidx.compose.runtime.snapshots.SnapshotStateList[i];
    }

    public static androidx.compose.runtime.snapshots.SnapshotStateList IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = setBrush.class.getClassLoader();
        }
        int i = parcel.readInt();
        Navigator$$ExternalSyntheticLambda1 navigator$$ExternalSyntheticLambda1 = new Navigator$$ExternalSyntheticLambda1(parcel, 13, classLoader);
        if (i == 0) {
            return new androidx.compose.runtime.snapshots.SnapshotStateList();
        }
        accessgetThisDragAndDropTargetp accessgetthisdraganddroptargetpSerializer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.IconCompatParcelizer.serializer();
        for (int i2 = 0; i2 < i; i2++) {
            accessgetthisdraganddroptargetpSerializer.add(navigator$$ExternalSyntheticLambda1.invoke(Integer.valueOf(i2)));
        }
        return new androidx.compose.runtime.snapshots.SnapshotStateList(accessgetthisdraganddroptargetpSerializer.write());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return IconCompatParcelizer(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return IconCompatParcelizer(parcel, null);
    }
}
