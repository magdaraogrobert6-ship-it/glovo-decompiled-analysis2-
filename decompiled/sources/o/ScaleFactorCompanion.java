package o;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.mapbox.search.record.RecordsFileStorage;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleFactorCompanion extends copy8GGzs04default {
    public getScaleYimpl IconCompatParcelizer;
    public RecordsFileStorage serializer;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.IconCompatParcelizer.IconCompatParcelizer(canvas, getBounds(), IconCompatParcelizer());
        getScaleYimpl getscaleyimpl = this.IconCompatParcelizer;
        android.graphics.Paint paint = this.MediaSessionCompatToken;
        getscaleyimpl.IconCompatParcelizer(canvas, paint);
        int i = 0;
        while (true) {
            RecordsFileStorage recordsFileStorage = this.serializer;
            int[] iArr = (int[]) recordsFileStorage.fullFileName$delegate;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            getScaleYimpl getscaleyimpl2 = this.IconCompatParcelizer;
            float[] fArr = (float[]) recordsFileStorage.dataLoader;
            int i2 = i * 2;
            getscaleyimpl2.IconCompatParcelizer(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.IconCompatParcelizer.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.IconCompatParcelizer.getClass();
        return -1;
    }

    @Override // o.copy8GGzs04default
    public final boolean IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        boolean zIconCompatParcelizer = super.IconCompatParcelizer(z, z2, z3);
        if (!isRunning()) {
            this.serializer.write();
        }
        getSubcomposeForceReuseNjRlDlw getsubcomposeforcereusenjrldlw = this.MediaSessionCompatQueueItem;
        ContentResolver contentResolver = this.PlaybackStateCompatCustomAction.getContentResolver();
        getsubcomposeforcereusenjrldlw.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z && z3) {
            this.serializer.IconCompatParcelizer();
        }
        return zIconCompatParcelizer;
    }

    public ScaleFactorCompanion(Context context, getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations) {
        super(context, getunspecified_hlwfpcannotations);
    }
}
