package o;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class getScaleXannotations extends copy8GGzs04default {
    public static final div44nBxM0 write = new div44nBxM0();
    public final isInfinite IconCompatParcelizer;
    public final overlaps MediaMetadataCompat;
    public boolean RemoteActionCompatParcelizer;
    public final getScaleYimpl read;
    public float serializer;

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            android.graphics.Rect bounds = getBounds();
            float fIconCompatParcelizer = IconCompatParcelizer();
            getScaleYimpl getscaleyimpl = this.read;
            getscaleyimpl.IconCompatParcelizer(canvas, bounds, fIconCompatParcelizer);
            android.graphics.Paint paint = this.MediaSessionCompatToken;
            getscaleyimpl.IconCompatParcelizer(canvas, paint);
            int i = mergeRulerValues.read(this.MediaDescriptionCompat.IconCompatParcelizer[0], this.ResultReceiver);
            this.read.IconCompatParcelizer(canvas, paint, 0.0f, this.serializer, i);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.read.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.read.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        this.serializer = getLevel() / 10000.0f;
        invalidateSelf();
    }

    public getScaleXannotations(Context context, getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations, getScaleYimpl getscaleyimpl) {
        super(context, getunspecified_hlwfpcannotations);
        this.RemoteActionCompatParcelizer = false;
        this.read = getscaleyimpl;
        getscaleyimpl.serializer = this;
        overlaps overlapsVar = new overlaps();
        this.MediaMetadataCompat = overlapsVar;
        overlapsVar.read = 1.0d;
        overlapsVar.RatingCompat = false;
        overlapsVar.read(50.0f);
        isInfinite isinfinite = new isInfinite(this);
        isinfinite.MediaSessionCompatToken = Float.MAX_VALUE;
        isinfinite.MediaBrowserCompatMediaItem = false;
        this.IconCompatParcelizer = isinfinite;
        isinfinite.ComponentActivity = overlapsVar;
        if (this.PlaybackStateCompat != 1.0f) {
            this.PlaybackStateCompat = 1.0f;
            invalidateSelf();
        }
    }

    @Override // o.copy8GGzs04default
    public final boolean IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        boolean zIconCompatParcelizer = super.IconCompatParcelizer(z, z2, z3);
        getSubcomposeForceReuseNjRlDlw getsubcomposeforcereusenjrldlw = this.MediaSessionCompatQueueItem;
        ContentResolver contentResolver = this.PlaybackStateCompatCustomAction.getContentResolver();
        getsubcomposeforcereusenjrldlw.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.RemoteActionCompatParcelizer = true;
            return zIconCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer = false;
        this.MediaMetadataCompat.read(50.0f / f);
        return zIconCompatParcelizer;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.RemoteActionCompatParcelizer;
        isInfinite isinfinite = this.IconCompatParcelizer;
        if (z) {
            isinfinite.RemoteActionCompatParcelizer();
            this.serializer = i / 10000.0f;
            invalidateSelf();
        } else {
            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.serializer * 10000.0f;
            isinfinite.ResultReceiver = true;
            isinfinite.read(i);
        }
        return true;
    }
}
