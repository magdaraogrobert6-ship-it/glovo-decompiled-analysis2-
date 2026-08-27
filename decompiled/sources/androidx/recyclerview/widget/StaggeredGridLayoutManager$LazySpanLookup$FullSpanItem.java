package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new Parcelable.Creator() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.1
        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write = parcel.readInt();
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.serializer = parcel.readInt();
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.RemoteActionCompatParcelizer = parcel.readInt() == 1;
            int i = parcel.readInt();
            if (i > 0) {
                int[] iArr = new int[i];
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.IconCompatParcelizer = iArr;
                parcel.readIntArray(iArr);
            }
            return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        }
    };
    public int[] IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public int serializer;
    public int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write);
        parcel.writeInt(this.serializer);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        int[] iArr = this.IconCompatParcelizer;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.IconCompatParcelizer);
        }
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.write + ", mGapDir=" + this.serializer + ", mHasUnwantedGapAfter=" + this.RemoteActionCompatParcelizer + ", mGapPerSpan=" + Arrays.toString(this.IconCompatParcelizer) + '}';
    }
}
