package o;

import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class Remeasurement {
    public final /* synthetic */ int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final /* synthetic */ CarouselLayoutManager write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Remeasurement(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.IconCompatParcelizer = i;
        if (i != 1) {
            this.write = carouselLayoutManager;
        } else {
            this.write = carouselLayoutManager;
            this(0);
        }
    }

    public Remeasurement(int i) {
        this.RemoteActionCompatParcelizer = i;
    }
}
