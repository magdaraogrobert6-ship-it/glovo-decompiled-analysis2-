package o;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class onCreateVirtualViewTranslationRequests implements RandomAccess {
    public AndroidContentCaptureManagerViewTranslationHelperMethods RemoteActionCompatParcelizer;
    public int read = 0;
    public Object[] write;

    public final void RemoteActionCompatParcelizer() {
        Object[] objArr = this.write;
        int i = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.read = 0;
    }

    public final int read(Object obj) {
        Object[] objArr = this.write;
        int i = this.read;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr2 = {obj, objArr[i2]};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final void read(int i) {
        Object[] objArr = this.write;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.write = objArr2;
    }

    public final Object write(int i) {
        Object[] objArr = this.write;
        Object obj = objArr[i];
        int i2 = this.read;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.read - 1;
        this.read = i4;
        objArr[i4] = null;
        return obj;
    }

    public final Object write(int i, Object obj) {
        Object[] objArr = this.write;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void write(int i, int i2) {
        if (i2 > i) {
            int i3 = this.read;
            if (i2 < i3) {
                Object[] objArr = this.write;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.read;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.write[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.read = i5;
        }
    }

    public onCreateVirtualViewTranslationRequests(Object[] objArr) {
        this.write = objArr;
    }

    public final void read(int i, Object obj) {
        int i2 = this.read + 1;
        if (this.write.length < i2) {
            read(i2);
        }
        Object[] objArr = this.write;
        int i3 = this.read;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.read++;
    }

    public final boolean RemoteActionCompatParcelizer(Object obj) {
        int i = read(obj);
        if (i < 0) {
            return false;
        }
        write(i);
        return true;
    }

    public final List read() {
        AndroidContentCaptureManagerViewTranslationHelperMethods androidContentCaptureManagerViewTranslationHelperMethods = this.RemoteActionCompatParcelizer;
        if (androidContentCaptureManagerViewTranslationHelperMethods != null) {
            return androidContentCaptureManagerViewTranslationHelperMethods;
        }
        AndroidContentCaptureManagerViewTranslationHelperMethods androidContentCaptureManagerViewTranslationHelperMethods2 = new AndroidContentCaptureManagerViewTranslationHelperMethods(this);
        this.RemoteActionCompatParcelizer = androidContentCaptureManagerViewTranslationHelperMethods2;
        return androidContentCaptureManagerViewTranslationHelperMethods2;
    }

    public final boolean read(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.read + size;
        if (this.write.length < i3) {
            read(i3);
        }
        Object[] objArr = this.write;
        int i4 = this.read;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            if (i2 < 0) {
                androidx.sqlite.SQLite.serializer();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2++;
        }
        this.read += size;
        return true;
    }

    public final boolean write(Object obj) {
        int i = this.read - 1;
        if (i >= 0) {
            for (int i2 = 0; !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write[i2], obj}, getCieXyz.write())).booleanValue(); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i = this.read + 1;
        if (this.write.length < i) {
            read(i);
        }
        Object[] objArr = this.write;
        int i2 = this.read;
        objArr[i2] = obj;
        this.read = i2 + 1;
    }

    public final void write(int i, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests) {
        int i2 = oncreatevirtualviewtranslationrequests.read;
        if (i2 == 0) {
            return;
        }
        int i3 = this.read + i2;
        if (this.write.length < i3) {
            read(i3);
        }
        Object[] objArr = this.write;
        int i4 = this.read;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(oncreatevirtualviewtranslationrequests.write, 0, objArr, i, i2);
        this.read += i2;
    }

    public final void read(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.read + size;
        if (this.write.length < i2) {
            read(i2);
        }
        Object[] objArr = this.write;
        int i3 = this.read;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.read += size;
    }
}
