package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class setAlpha implements blur1fqSgw, Map, displayInAppMessagelambda120 {
    public onObservedReadsChanged IconCompatParcelizer;
    public final setBlendModes9anfk8 read;
    public final setBlendModes9anfk8 serializer;
    public final setBlendModes9anfk8 write;

    @Override // o.blur1fqSgw
    public final BlurKt IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.serializer;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.read;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.write;
    }

    public static final boolean read(setAlpha setalpha, onObservedReadsChanged onobservedreadschanged, int i, getSizeYbymL2gui getsizeybyml2gui) {
        boolean z;
        synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
            int i2 = onobservedreadschanged.read;
            if (i2 == i) {
                onobservedreadschanged.write = getsizeybyml2gui;
                z = true;
                onobservedreadschanged.read = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final void clear() {
        getBrush getbrushWrite;
        onObservedReadsChanged onobservedreadschanged = this.IconCompatParcelizer;
        onobservedreadschanged.getClass();
        onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
        getSizeYbymL2gui getsizeybyml2gui = getSizeYbymL2gui.read;
        if (getsizeybyml2gui != onobservedreadschanged2.write) {
            onObservedReadsChanged onobservedreadschanged3 = this.IconCompatParcelizer;
            onobservedreadschanged3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                onObservedReadsChanged onobservedreadschanged4 = (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, this, getbrushWrite);
                synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                    onobservedreadschanged4.write = getsizeybyml2gui;
                    onobservedreadschanged4.read++;
                }
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        getSizeYbymL2gui getsizeybyml2gui;
        int i;
        Object objPut;
        getBrush getbrushWrite;
        boolean z;
        do {
            synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                onObservedReadsChanged onobservedreadschanged = this.IconCompatParcelizer;
                onobservedreadschanged.getClass();
                onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
                getsizeybyml2gui = onobservedreadschanged2.write;
                i = onobservedreadschanged2.read;
            }
            getsizeybyml2gui.getClass();
            onEntered onenteredIconCompatParcelizer = getsizeybyml2gui.IconCompatParcelizer();
            objPut = onenteredIconCompatParcelizer.put(obj, obj2);
            getSizeYbymL2gui getsizeybyml2guiSerializer = onenteredIconCompatParcelizer.serializer();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{getsizeybyml2guiSerializer, getsizeybyml2gui}, iWrite3)).booleanValue()) {
                break;
            }
            onObservedReadsChanged onobservedreadschanged3 = this.IconCompatParcelizer;
            onobservedreadschanged3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                z = read(this, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, this, getbrushWrite), i, getsizeybyml2guiSerializer);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!z);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        getSizeYbymL2gui getsizeybyml2gui;
        int i;
        getBrush getbrushWrite;
        boolean z;
        do {
            synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                onObservedReadsChanged onobservedreadschanged = this.IconCompatParcelizer;
                onobservedreadschanged.getClass();
                onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
                getsizeybyml2gui = onobservedreadschanged2.write;
                i = onobservedreadschanged2.read;
            }
            getsizeybyml2gui.getClass();
            onEntered onenteredIconCompatParcelizer = getsizeybyml2gui.IconCompatParcelizer();
            onenteredIconCompatParcelizer.putAll(map);
            getSizeYbymL2gui getsizeybyml2guiSerializer = onenteredIconCompatParcelizer.serializer();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{getsizeybyml2guiSerializer, getsizeybyml2gui}, iWrite3)).booleanValue()) {
                return;
            }
            onObservedReadsChanged onobservedreadschanged3 = this.IconCompatParcelizer;
            onobservedreadschanged3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                z = read(this, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, this, getbrushWrite), i, getsizeybyml2guiSerializer);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!z);
    }

    public final onObservedReadsChanged read() {
        onObservedReadsChanged onobservedreadschanged = this.IconCompatParcelizer;
        onobservedreadschanged.getClass();
        return (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged, this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        getSizeYbymL2gui getsizeybyml2gui;
        int i;
        V vRemove;
        getBrush getbrushWrite;
        boolean z;
        do {
            synchronized (setOffsetk4lQ0M.RemoteActionCompatParcelizer) {
                onObservedReadsChanged onobservedreadschanged = this.IconCompatParcelizer;
                onobservedreadschanged.getClass();
                onObservedReadsChanged onobservedreadschanged2 = (onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged);
                getsizeybyml2gui = onobservedreadschanged2.write;
                i = onobservedreadschanged2.read;
            }
            getsizeybyml2gui.getClass();
            onEntered onenteredIconCompatParcelizer = getsizeybyml2gui.IconCompatParcelizer();
            vRemove = onenteredIconCompatParcelizer.remove(obj);
            getSizeYbymL2gui getsizeybyml2guiSerializer = onenteredIconCompatParcelizer.serializer();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{getsizeybyml2guiSerializer, getsizeybyml2gui}, iWrite3)).booleanValue()) {
                break;
            }
            onObservedReadsChanged onobservedreadschanged3 = this.IconCompatParcelizer;
            onobservedreadschanged3.getClass();
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                getbrushWrite = getOffsetF1C5BW0.write();
                z = read(this, (onObservedReadsChanged) getOffsetF1C5BW0.RemoteActionCompatParcelizer(onobservedreadschanged3, this, getbrushWrite), i, getsizeybyml2guiSerializer);
            }
            getOffsetF1C5BW0.write(getbrushWrite, this);
        } while (!z);
        return vRemove;
    }

    public final String toString() {
        onObservedReadsChanged onobservedreadschanged = this.IconCompatParcelizer;
        onobservedreadschanged.getClass();
        return "SnapshotStateMap(value=" + ((onObservedReadsChanged) getOffsetF1C5BW0.IconCompatParcelizer(onobservedreadschanged)).write + ")@" + hashCode();
    }

    public setAlpha() {
        getSizeYbymL2gui getsizeybyml2gui = getSizeYbymL2gui.read;
        getBrush getbrushWrite = getOffsetF1C5BW0.write();
        onObservedReadsChanged onobservedreadschanged = new onObservedReadsChanged(getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getsizeybyml2gui);
        if (!(getbrushWrite instanceof setShape)) {
            onobservedreadschanged.MediaSessionCompatQueueItem = new onObservedReadsChanged(1L, getsizeybyml2gui);
        }
        this.IconCompatParcelizer = onobservedreadschanged;
        this.serializer = new setBlendModes9anfk8(this, 1);
        this.read = new setBlendModes9anfk8(this, 0);
        this.write = new setBlendModes9anfk8(this, 2);
    }

    @Override // o.blur1fqSgw
    public final void serializer(BlurKt blurKt) {
        blurKt.getClass();
        this.IconCompatParcelizer = (onObservedReadsChanged) blurKt;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return read().write.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return read().write.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return read().write.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return read().write.isEmpty();
    }

    @Override // java.util.Map
    public final int size() {
        return read().write.size();
    }
}
