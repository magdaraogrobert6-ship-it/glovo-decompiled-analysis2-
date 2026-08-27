package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getStartD9Ej5fM extends RangesKt {
    @Override // kotlin.ranges.RangesKt
    public final void read(Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        absolutea9UjIt4default.read = absolutea9UjIt4default2;
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean read(component2D9Ej5fM component2d9ej5fm, Absolutea9UjIt4default absolutea9UjIt4default, Absolutea9UjIt4default absolutea9UjIt4default2) {
        synchronized (component2d9ej5fm) {
            if (component2d9ej5fm.MediaDescriptionCompat != absolutea9UjIt4default) {
                return false;
            }
            component2d9ej5fm.MediaDescriptionCompat = absolutea9UjIt4default2;
            return true;
        }
    }

    @Override // kotlin.ranges.RangesKt
    public final void serializer(Absolutea9UjIt4default absolutea9UjIt4default, Thread thread) {
        absolutea9UjIt4default.write = thread;
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean serializer(component2D9Ej5fM component2d9ej5fm, Object obj, Object obj2) {
        synchronized (component2d9ej5fm) {
            if (component2d9ej5fm.MediaMetadataCompat != obj) {
                return false;
            }
            component2d9ej5fm.MediaMetadataCompat = obj2;
            return true;
        }
    }

    @Override // kotlin.ranges.RangesKt
    public final boolean serializer(component2D9Ej5fM component2d9ej5fm, copylDy3nrA copyldy3nra, copylDy3nrA copyldy3nra2) {
        synchronized (component2d9ej5fm) {
            if (component2d9ej5fm.write != copyldy3nra) {
                return false;
            }
            component2d9ej5fm.write = copyldy3nra2;
            return true;
        }
    }

    @Override // kotlin.ranges.RangesKt
    public final Absolutea9UjIt4default IconCompatParcelizer(component2D9Ej5fM component2d9ej5fm) {
        Absolutea9UjIt4default absolutea9UjIt4default;
        Absolutea9UjIt4default absolutea9UjIt4default2 = Absolutea9UjIt4default.serializer;
        synchronized (component2d9ej5fm) {
            absolutea9UjIt4default = component2d9ej5fm.MediaDescriptionCompat;
            if (absolutea9UjIt4default != absolutea9UjIt4default2) {
                component2d9ej5fm.MediaDescriptionCompat = absolutea9UjIt4default2;
            }
        }
        return absolutea9UjIt4default;
    }

    @Override // kotlin.ranges.RangesKt
    public final copylDy3nrA read(component2D9Ej5fM component2d9ej5fm) {
        copylDy3nrA copyldy3nra;
        copylDy3nrA copyldy3nra2 = copylDy3nrA.RemoteActionCompatParcelizer;
        synchronized (component2d9ej5fm) {
            copyldy3nra = component2d9ej5fm.write;
            if (copyldy3nra != copyldy3nra2) {
                component2d9ej5fm.write = copyldy3nra2;
            }
        }
        return copyldy3nra;
    }
}
