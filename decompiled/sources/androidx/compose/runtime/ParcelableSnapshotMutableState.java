package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.AndroidContentCaptureManager;
import o.getCieXyz;
import o.onShowTranslationui;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
final class ParcelableSnapshotMutableState<T> extends onShowTranslationui implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }

        public static ParcelableSnapshotMutableState read(Parcel parcel, ClassLoader classLoader) {
            AndroidContentCaptureManager androidContentCaptureManager;
            if (classLoader == null) {
                classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                androidContentCaptureManager = AndroidContentCaptureManager.RemoteActionCompatParcelizer;
            } else if (i == 1) {
                androidContentCaptureManager = AndroidContentCaptureManager.write;
            } else if (i == 2) {
                androidContentCaptureManager = AndroidContentCaptureManager.read;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            return new ParcelableSnapshotMutableState(value, androidContentCaptureManager);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return read(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return read(parcel, null);
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        AndroidContentCaptureManager androidContentCaptureManager = AndroidContentCaptureManager.RemoteActionCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager2 = this.IconCompatParcelizer;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{androidContentCaptureManager2, androidContentCaptureManager}, iWrite3)).booleanValue()) {
            i2 = 0;
        } else {
            Object[] objArr = {androidContentCaptureManager2, AndroidContentCaptureManager.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                i2 = 1;
            } else {
                Object[] objArr2 = {androidContentCaptureManager2, AndroidContentCaptureManager.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Only known types of MutableState's SnapshotMutationPolicy are supported");
                    return;
                }
                i2 = 2;
            }
        }
        parcel.writeInt(i2);
    }

    public ParcelableSnapshotMutableState(Object obj, AndroidContentCaptureManager androidContentCaptureManager) {
        super(obj, androidContentCaptureManager);
    }
}
