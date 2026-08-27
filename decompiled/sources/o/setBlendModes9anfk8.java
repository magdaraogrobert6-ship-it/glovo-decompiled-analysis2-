package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class setBlendModes9anfk8 implements Set, displayInAppMessagelambda11 {
    public final /* synthetic */ int serializer;
    public final setAlpha write;

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    public setBlendModes9anfk8(setAlpha setalpha, int i) {
        this.serializer = i;
        this.write = setalpha;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.write.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.serializer;
        setAlpha setalpha = this.write;
        if (i == 0) {
            return setalpha.containsKey(obj);
        }
        if (i != 1) {
            return setalpha.containsValue(obj);
        }
        if (!(obj instanceof Map.Entry) || ((obj instanceof displayInAppMessagelambda121) && !(obj instanceof displayInAppMessagelambda122))) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object[] objArr = {setalpha.get(entry.getKey()), entry.getValue()};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.serializer;
        setAlpha setalpha = this.write;
        if (i == 0) {
            Collection collection2 = collection;
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return true;
            }
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (!setalpha.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (i != 1) {
            Collection collection3 = collection;
            if ((collection3 instanceof Collection) && collection3.isEmpty()) {
                return true;
            }
            Iterator it2 = collection3.iterator();
            while (it2.hasNext()) {
                if (!setalpha.containsValue(it2.next())) {
                    return false;
                }
            }
            return true;
        }
        Collection collection4 = collection;
        if ((collection4 instanceof Collection) && collection4.isEmpty()) {
            return true;
        }
        Iterator it3 = collection4.iterator();
        while (it3.hasNext()) {
            if (!contains((Map.Entry) it3.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.write.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.serializer;
        setAlpha setalpha = this.write;
        if (i != 0) {
            return i != 1 ? new blur1fqSgwdefault(setalpha, ((acceptDragAndDropTransfer) setalpha.read().write.entrySet()).iterator(), 2) : new blur1fqSgwdefault(setalpha, ((acceptDragAndDropTransfer) setalpha.read().write.entrySet()).iterator(), 1);
        }
        return new blur1fqSgwdefault(setalpha, ((acceptDragAndDropTransfer) setalpha.read().write.entrySet()).iterator(), 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.write.size();
    }

    private final boolean read(Collection collection) {
        getSizeYbymL2gui getsizeybyml2gui;
        int i;
        getBrush getbrushWrite;
        boolean z;
        Collection<Map.Entry> collection2 = collection;
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(collection2, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        setAlpha setalpha = this.write;
        boolean z2 = false;
        do {
            synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                onObservedReadsChanged onobservedreadschanged = setalpha.IconCompatParcelizer;
                onobservedreadschanged.getClass();
                onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
                getsizeybyml2gui = onobservedreadschanged2.write;
                i = onobservedreadschanged2.read;
            }
            getsizeybyml2gui.getClass();
            onEntered onenteredIconCompatParcelizer = getsizeybyml2gui.IconCompatParcelizer();
            Iterator it = setalpha.serializer.iterator();
            while (true) {
                blur1fqSgwdefault blur1fqsgwdefault = (blur1fqSgwdefault) it;
                if (!blur1fqsgwdefault.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) blur1fqsgwdefault.next();
                if (linkedHashMap.containsKey(entry2.getKey())) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{linkedHashMap.get(entry2.getKey()), entry2.getValue()}, getCieXyz.write())).booleanValue()) {
                    }
                }
                onenteredIconCompatParcelizer.remove(entry2.getKey());
                z2 = true;
            }
            getSizeYbymL2gui getsizeybyml2guiSerializer = onenteredIconCompatParcelizer.serializer();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getsizeybyml2guiSerializer, getsizeybyml2gui}, getCieXyz.write())).booleanValue()) {
                break;
            }
            onObservedReadsChanged onobservedreadschanged3 = setalpha.IconCompatParcelizer;
            onobservedreadschanged3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                z = setAlpha.read(setalpha, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, setalpha, getbrushWrite), i, getsizeybyml2guiSerializer);
            }
            getOffsetF1C5BW0.write(getbrushWrite, setalpha);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.serializer;
        setAlpha setalpha = this.write;
        if (i == 0) {
            return setalpha.remove(obj) != null;
        }
        if (i == 1) {
            return (obj instanceof Map.Entry) && (!(obj instanceof displayInAppMessagelambda121) || (obj instanceof displayInAppMessagelambda122)) && setalpha.remove(((Map.Entry) obj).getKey()) != null;
        }
        Iterator it = setalpha.serializer.iterator();
        do {
            blur1fqSgwdefault blur1fqsgwdefault = (blur1fqSgwdefault) it;
            if (!blur1fqsgwdefault.hasNext()) {
                next = null;
                break;
            }
            next = blur1fqsgwdefault.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Map.Entry) next).getValue(), obj}, getCieXyz.write())).booleanValue());
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        setalpha.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.serializer;
        if (i == 0) {
            setOffsetk4lQ0M.read();
            throw null;
        }
        if (i != 1) {
            setOffsetk4lQ0M.read();
            throw null;
        }
        setOffsetk4lQ0M.read();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.serializer;
        if (i == 0) {
            setOffsetk4lQ0M.read();
            throw null;
        }
        if (i != 1) {
            setOffsetk4lQ0M.read();
            throw null;
        }
        setOffsetk4lQ0M.read();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        getSizeYbymL2gui getsizeybyml2gui;
        int i;
        getBrush getbrushWrite;
        boolean z;
        int i2 = this.serializer;
        boolean z2 = false;
        if (i2 == 0) {
            Iterator it = collection.iterator();
            while (true) {
                boolean z3 = false;
                while (it.hasNext()) {
                    if (this.write.remove(it.next()) != null || z3) {
                        z3 = true;
                    }
                }
                return z3;
            }
        }
        if (i2 == 1) {
            Iterator it2 = collection.iterator();
            while (true) {
                boolean z4 = false;
                while (it2.hasNext()) {
                    if (this.write.remove(((Map.Entry) it2.next()).getKey()) != null || z4) {
                        z4 = true;
                    }
                }
                return z4;
            }
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(collection);
        setAlpha setalpha = this.write;
        do {
            synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                onObservedReadsChanged onobservedreadschanged = setalpha.IconCompatParcelizer;
                onobservedreadschanged.getClass();
                onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
                getsizeybyml2gui = onobservedreadschanged2.write;
                i = onobservedreadschanged2.read;
            }
            getsizeybyml2gui.getClass();
            onEntered onenteredIconCompatParcelizer = getsizeybyml2gui.IconCompatParcelizer();
            Iterator it3 = setalpha.serializer.iterator();
            while (true) {
                blur1fqSgwdefault blur1fqsgwdefault = (blur1fqSgwdefault) it3;
                if (!blur1fqsgwdefault.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) blur1fqsgwdefault.next();
                if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(entry.getValue())) {
                    onenteredIconCompatParcelizer.remove(entry.getKey());
                    z2 = true;
                }
            }
            getSizeYbymL2gui getsizeybyml2guiSerializer = onenteredIconCompatParcelizer.serializer();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getsizeybyml2guiSerializer, getsizeybyml2gui}, getCieXyz.write())).booleanValue()) {
                break;
            }
            onObservedReadsChanged onobservedreadschanged3 = setalpha.IconCompatParcelizer;
            onobservedreadschanged3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                z = setAlpha.read(setalpha, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, setalpha, getbrushWrite), i, getsizeybyml2guiSerializer);
            }
            getOffsetF1C5BW0.write(getbrushWrite, setalpha);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        getSizeYbymL2gui getsizeybyml2gui;
        int i;
        getBrush getbrushWrite;
        boolean z;
        getSizeYbymL2gui getsizeybyml2gui2;
        int i2;
        getBrush getbrushWrite2;
        boolean z2;
        int i3 = this.serializer;
        boolean z3 = false;
        if (i3 == 0) {
            Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(collection);
            setAlpha setalpha = this.write;
            do {
                synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                    onObservedReadsChanged onobservedreadschanged = setalpha.IconCompatParcelizer;
                    onobservedreadschanged.getClass();
                    onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
                    getsizeybyml2gui = onobservedreadschanged2.write;
                    i = onobservedreadschanged2.read;
                }
                getsizeybyml2gui.getClass();
                onEntered onenteredIconCompatParcelizer = getsizeybyml2gui.IconCompatParcelizer();
                Iterator it = setalpha.serializer.iterator();
                while (true) {
                    blur1fqSgwdefault blur1fqsgwdefault = (blur1fqSgwdefault) it;
                    if (!blur1fqsgwdefault.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) blur1fqsgwdefault.next();
                    if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(entry.getKey())) {
                        onenteredIconCompatParcelizer.remove(entry.getKey());
                        z3 = true;
                    }
                }
                getSizeYbymL2gui getsizeybyml2guiSerializer = onenteredIconCompatParcelizer.serializer();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getsizeybyml2guiSerializer, getsizeybyml2gui}, getCieXyz.write())).booleanValue()) {
                    break;
                }
                onObservedReadsChanged onobservedreadschanged3 = setalpha.IconCompatParcelizer;
                onobservedreadschanged3.getClass();
                synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                    getbrushWrite = getOffsetF1C5BW0.write();
                    z = setAlpha.read(setalpha, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, setalpha, getbrushWrite), i, getsizeybyml2guiSerializer);
                }
                getOffsetF1C5BW0.write(getbrushWrite, setalpha);
            } while (!z);
            return z3;
        }
        if (i3 == 1) {
            return read(collection);
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(collection);
        setAlpha setalpha2 = this.write;
        do {
            synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                onObservedReadsChanged onobservedreadschanged4 = setalpha2.IconCompatParcelizer;
                onobservedreadschanged4.getClass();
                onObservedReadsChanged onobservedreadschanged5 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged4);
                getsizeybyml2gui2 = onobservedreadschanged5.write;
                i2 = onobservedreadschanged5.read;
            }
            getsizeybyml2gui2.getClass();
            onEntered onenteredIconCompatParcelizer2 = getsizeybyml2gui2.IconCompatParcelizer();
            Iterator it2 = setalpha2.serializer.iterator();
            while (true) {
                blur1fqSgwdefault blur1fqsgwdefault2 = (blur1fqSgwdefault) it2;
                if (!blur1fqsgwdefault2.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) blur1fqsgwdefault2.next();
                if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys2.contains(entry2.getValue())) {
                    onenteredIconCompatParcelizer2.remove(entry2.getKey());
                    z3 = true;
                }
            }
            getSizeYbymL2gui getsizeybyml2guiSerializer2 = onenteredIconCompatParcelizer2.serializer();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getsizeybyml2guiSerializer2, getsizeybyml2gui2}, getCieXyz.write())).booleanValue()) {
                break;
            }
            onObservedReadsChanged onobservedreadschanged6 = setalpha2.IconCompatParcelizer;
            onobservedreadschanged6.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite2 = getOffsetF1C5BW0.write();
                z2 = setAlpha.read(setalpha2, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged6, setalpha2, getbrushWrite2), i2, getsizeybyml2guiSerializer2);
            }
            getOffsetF1C5BW0.write(getbrushWrite2, setalpha2);
        } while (!z2);
        return z3;
    }
}
