package o;

import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class isEndBoundary {
    public int IconCompatParcelizer;
    public long read;
    public Object write;

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this) {
            if (this.IconCompatParcelizer != 0) {
                ((AccessibilityIteratorsLineTextSegmentIterator) this.write).serializer.getClass();
                if (System.currentTimeMillis() > this.read) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
        }
        return z;
    }

    public isEndBoundary(int i, URL url, long j) {
        this.IconCompatParcelizer = i;
        this.write = url;
        this.read = j;
    }

    public void serializer(int i) {
        long jMin;
        synchronized (this) {
            if ((i >= 200 && i < 300) || i == 401 || i == 404) {
                synchronized (this) {
                    this.IconCompatParcelizer = 0;
                }
                return;
            }
            this.IconCompatParcelizer++;
            synchronized (this) {
                if (i == 429 || (i >= 500 && i < 600)) {
                    double dPow = Math.pow(2.0d, this.IconCompatParcelizer);
                    ((AccessibilityIteratorsLineTextSegmentIterator) this.write).getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
                } else {
                    jMin = CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL;
                }
                ((AccessibilityIteratorsLineTextSegmentIterator) this.write).serializer.getClass();
                this.read = System.currentTimeMillis() + jMin;
            }
            return;
            throw th;
        }
    }

    public isEndBoundary() {
    }
}
