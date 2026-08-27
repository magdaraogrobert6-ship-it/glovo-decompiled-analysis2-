package androidx.compose.ui.graphics;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public interface Interpolatable {
    public static final Companion Companion = Companion.$$INSTANCE;

    Object lerp(Object obj, float f);

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0050 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0051 A[RETURN] */
        public final Object lerp(Object obj, Object obj2, float f) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, obj2}, getCieXyz.write())).booleanValue()) {
                if (f < 0.5f) {
                    return obj;
                }
                return obj2;
            }
            Object objLerp = obj instanceof Interpolatable ? ((Interpolatable) obj).lerp(obj2, f) : null;
            if (objLerp == null && (obj2 instanceof Interpolatable)) {
                objLerp = ((Interpolatable) obj2).lerp(obj, 1.0f - f);
            }
            if (objLerp != null) {
                return objLerp;
            }
            if (f < 0.5f) {
                return obj;
            }
            return obj2;
        }
    }
}
