package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class getSuperCaller implements Iterable {
    public getSupportImageTintMode IconCompatParcelizer;
    public getSupportImageTintMode serializer;
    public final WeakHashMap write = new WeakHashMap();
    public int read = 0;

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        setCheckMarkDrawable setcheckmarkdrawable = new setCheckMarkDrawable(this.IconCompatParcelizer, this.serializer);
        this.write.put(setcheckmarkdrawable, Boolean.FALSE);
        return setcheckmarkdrawable;
    }

    public getSupportImageTintMode RemoteActionCompatParcelizer(Object obj) {
        getSupportImageTintMode getsupportimagetintmode = this.IconCompatParcelizer;
        while (getsupportimagetintmode != null && !getsupportimagetintmode.write.equals(obj)) {
            getsupportimagetintmode = getsupportimagetintmode.RemoteActionCompatParcelizer;
        }
        return getsupportimagetintmode;
    }

    public final boolean equals(Object obj) {
        setImageBitmap setimagebitmap;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getSuperCaller)) {
            return false;
        }
        getSuperCaller getsupercaller = (getSuperCaller) obj;
        if (this.read != getsupercaller.read) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = getsupercaller.iterator();
        while (true) {
            setimagebitmap = (setImageBitmap) it;
            if (!setimagebitmap.hasNext()) {
                break;
            }
            setImageBitmap setimagebitmap2 = (setImageBitmap) it2;
            if (!setimagebitmap2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) setimagebitmap.next();
            Object next = setimagebitmap2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (setimagebitmap.hasNext() || ((setImageBitmap) it2).hasNext()) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            setImageBitmap setimagebitmap = (setImageBitmap) it;
            if (setimagebitmap.hasNext()) {
                sb.append(((Map.Entry) setimagebitmap.next()).toString());
                if (setimagebitmap.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            setImageBitmap setimagebitmap = (setImageBitmap) it;
            if (!setimagebitmap.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) setimagebitmap.next()).hashCode();
        }
    }

    public Object read(Object obj) {
        getSupportImageTintMode getsupportimagetintmodeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        if (getsupportimagetintmodeRemoteActionCompatParcelizer == null) {
            return null;
        }
        this.read--;
        WeakHashMap weakHashMap = this.write;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((getTextClassifier) it.next()).a_(getsupportimagetintmodeRemoteActionCompatParcelizer);
            }
        }
        getSupportImageTintMode getsupportimagetintmode = getsupportimagetintmodeRemoteActionCompatParcelizer.read;
        getSupportImageTintMode getsupportimagetintmode2 = getsupportimagetintmodeRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (getsupportimagetintmode != null) {
            getsupportimagetintmode.RemoteActionCompatParcelizer = getsupportimagetintmode2;
        } else {
            this.IconCompatParcelizer = getsupportimagetintmode2;
        }
        getSupportImageTintMode getsupportimagetintmode3 = getsupportimagetintmodeRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (getsupportimagetintmode3 != null) {
            getsupportimagetintmode3.read = getsupportimagetintmode;
        } else {
            this.serializer = getsupportimagetintmode;
        }
        getsupportimagetintmodeRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = null;
        getsupportimagetintmodeRemoteActionCompatParcelizer.read = null;
        return getsupportimagetintmodeRemoteActionCompatParcelizer.serializer;
    }
}
