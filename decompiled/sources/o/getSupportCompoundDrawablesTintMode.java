package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getSupportCompoundDrawablesTintMode {
    public static final PorterDuff.Mode IconCompatParcelizer = PorterDuff.Mode.SRC_IN;
    public static final setCompoundDrawables read = new setCompoundDrawables(6);
    public static getSupportCompoundDrawablesTintMode serializer;
    public MetricsBatchProcessor MediaBrowserCompatMediaItem;
    public WeakHashMap MediaMetadataCompat;
    public TypedValue RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public final WeakHashMap write = new WeakHashMap(0);

    public final Drawable IconCompatParcelizer(Context context, int i, boolean z) {
        Drawable drawableWrite;
        synchronized (this) {
            if (!this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = true;
                Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, com.logistics.rider.glovo.R.drawable.abc_vector_test);
                if (drawableRemoteActionCompatParcelizer == null || (!(drawableRemoteActionCompatParcelizer instanceof getNonefv9h1I) && !"android.graphics.drawable.VectorDrawable".equals(drawableRemoteActionCompatParcelizer.getClass().getName()))) {
                    this.RemoteActionCompatParcelizer = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableWrite = write(context, i);
            if (drawableWrite == null) {
                drawableWrite = context.getDrawable(i);
            }
            if (drawableWrite != null) {
                drawableWrite = IconCompatParcelizer(context, i, z, drawableWrite);
            }
            if (drawableWrite != null) {
                getNestedScrollAxes.RemoteActionCompatParcelizer(drawableWrite);
            }
        }
        return drawableWrite;
    }

    public final ColorStateList read(Context context, int i) {
        ColorStateList colorStateList;
        accessprocessDragStart accessprocessdragstart;
        synchronized (this) {
            WeakHashMap weakHashMap = this.MediaMetadataCompat;
            ColorStateList colorStateListIconCompatParcelizer = null;
            colorStateList = (weakHashMap == null || (accessprocessdragstart = (accessprocessDragStart) weakHashMap.get(context)) == null) ? null : (ColorStateList) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
            if (colorStateList == null) {
                MetricsBatchProcessor metricsBatchProcessor = this.MediaBrowserCompatMediaItem;
                if (metricsBatchProcessor != null) {
                    colorStateListIconCompatParcelizer = metricsBatchProcessor.IconCompatParcelizer(context, i);
                }
                if (colorStateListIconCompatParcelizer != null) {
                    if (this.MediaMetadataCompat == null) {
                        this.MediaMetadataCompat = new WeakHashMap();
                    }
                    accessprocessDragStart accessprocessdragstart2 = (accessprocessDragStart) this.MediaMetadataCompat.get(context);
                    if (accessprocessdragstart2 == null) {
                        accessprocessdragstart2 = new accessprocessDragStart(0);
                        this.MediaMetadataCompat.put(context, accessprocessdragstart2);
                    }
                    accessprocessdragstart2.serializer(i, colorStateListIconCompatParcelizer);
                }
                colorStateList = colorStateListIconCompatParcelizer;
            }
        }
        return colorStateList;
    }

    public static PorterDuffColorFilter read(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (getSupportCompoundDrawablesTintMode.class) {
            setCompoundDrawables setcompounddrawables = read;
            setcompounddrawables.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) setcompounddrawables.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static getSupportCompoundDrawablesTintMode write() {
        getSupportCompoundDrawablesTintMode getsupportcompounddrawablestintmode;
        synchronized (getSupportCompoundDrawablesTintMode.class) {
            if (serializer == null) {
                serializer = new getSupportCompoundDrawablesTintMode();
            }
            getsupportcompounddrawablestintmode = serializer;
        }
        return getsupportcompounddrawablestintmode;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    public final Drawable write(Context context, int i) {
        java.lang.ref.WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableSerializer;
        if (this.RatingCompat == null) {
            this.RatingCompat = new TypedValue();
        }
        TypedValue typedValue = this.RatingCompat;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            ContextMenuSpec contextMenuSpec = (ContextMenuSpec) this.write.get(context);
            if (contextMenuSpec != null && (weakReference = (java.lang.ref.WeakReference) contextMenuSpec.write(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    contextMenuSpec.IconCompatParcelizer(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            layerDrawableSerializer = null;
        } else if (i == com.logistics.rider.glovo.R.drawable.abc_cab_background_top_material) {
            layerDrawableSerializer = new LayerDrawable(new Drawable[]{RemoteActionCompatParcelizer(context, com.logistics.rider.glovo.R.drawable.abc_cab_background_internal_bg), RemoteActionCompatParcelizer(context, 2131230802)});
        } else if (i == com.logistics.rider.glovo.R.drawable.abc_ratingbar_material) {
            layerDrawableSerializer = MetricsBatchProcessor.serializer(this, context, com.logistics.rider.glovo.R.dimen.abc_star_big);
        } else if (i == com.logistics.rider.glovo.R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableSerializer = MetricsBatchProcessor.serializer(this, context, com.logistics.rider.glovo.R.dimen.abc_star_medium);
        } else if (i == com.logistics.rider.glovo.R.drawable.abc_ratingbar_small_material) {
            layerDrawableSerializer = MetricsBatchProcessor.serializer(this, context, com.logistics.rider.glovo.R.dimen.abc_star_small);
        } else {
            layerDrawableSerializer = null;
        }
        if (layerDrawableSerializer == null) {
            return layerDrawableSerializer;
        }
        layerDrawableSerializer.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            Drawable.ConstantState constantState2 = layerDrawableSerializer.getConstantState();
            if (constantState2 == null) {
                return layerDrawableSerializer;
            }
            ContextMenuSpec contextMenuSpec2 = (ContextMenuSpec) this.write.get(context);
            if (contextMenuSpec2 == null) {
                contextMenuSpec2 = new ContextMenuSpec((Object) null);
                this.write.put(context, contextMenuSpec2);
            }
            contextMenuSpec2.read(j, new java.lang.ref.WeakReference(constantState2));
            return layerDrawableSerializer;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4 A[RETURN] */
    public final Drawable IconCompatParcelizer(Context context, int i, boolean z, Drawable drawable) {
        int i2;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateList = read(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateList != null) {
            Drawable drawableMutate2 = drawable.mutate();
            dispatchKeyEventYhN2O0wdefault.IconCompatParcelizer(drawableMutate2, colorStateList);
            if (this.MediaBrowserCompatMediaItem != null && i == com.logistics.rider.glovo.R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                dispatchKeyEventYhN2O0wdefault.IconCompatParcelizer(drawableMutate2, mode);
            }
            return drawableMutate2;
        }
        MetricsBatchProcessor metricsBatchProcessor = this.MediaBrowserCompatMediaItem;
        int i3 = com.logistics.rider.glovo.R.attr.colorControlActivated;
        if (metricsBatchProcessor != null) {
            if (i == com.logistics.rider.glovo.R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iIconCompatParcelizer = setSupportBackgroundTintList.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = ensureSubDecor.RemoteActionCompatParcelizer;
                MetricsBatchProcessor.RemoteActionCompatParcelizer(drawableFindDrawableByLayerId, iIconCompatParcelizer, mode2);
                MetricsBatchProcessor.RemoteActionCompatParcelizer(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), setSupportBackgroundTintList.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.colorControlNormal), mode2);
                MetricsBatchProcessor.RemoteActionCompatParcelizer(layerDrawable.findDrawableByLayerId(android.R.id.progress), setSupportBackgroundTintList.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == com.logistics.rider.glovo.R.drawable.abc_ratingbar_material || i == com.logistics.rider.glovo.R.drawable.abc_ratingbar_indicator_material || i == com.logistics.rider.glovo.R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iWrite = setSupportBackgroundTintList.write(context, com.logistics.rider.glovo.R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = ensureSubDecor.RemoteActionCompatParcelizer;
                MetricsBatchProcessor.RemoteActionCompatParcelizer(drawableFindDrawableByLayerId2, iWrite, mode3);
                MetricsBatchProcessor.RemoteActionCompatParcelizer(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), setSupportBackgroundTintList.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.colorControlActivated), mode3);
                MetricsBatchProcessor.RemoteActionCompatParcelizer(layerDrawable2.findDrawableByLayerId(android.R.id.progress), setSupportBackgroundTintList.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (metricsBatchProcessor != null) {
            PorterDuff.Mode mode4 = ensureSubDecor.RemoteActionCompatParcelizer;
            boolean z2 = true;
            if (MetricsBatchProcessor.serializer((int[]) metricsBatchProcessor.RemoteActionCompatParcelizer, i)) {
                i3 = com.logistics.rider.glovo.R.attr.colorControlNormal;
            } else {
                if (!MetricsBatchProcessor.serializer((int[]) metricsBatchProcessor.write, i)) {
                    boolean zSerializer = MetricsBatchProcessor.serializer((int[]) metricsBatchProcessor.read, i);
                    i3 = android.R.attr.colorBackground;
                    if (zSerializer) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230822) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else {
                        if (i != com.logistics.rider.glovo.R.drawable.abc_dialog_material_background) {
                            z2 = false;
                            i2 = 0;
                        }
                        iRound = -1;
                    }
                }
                if (z2) {
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(ensureSubDecor.RemoteActionCompatParcelizer(setSupportBackgroundTintList.IconCompatParcelizer(context, i2), mode4));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                } else if (z) {
                    return null;
                }
            }
            i2 = i3;
            iRound = -1;
            if (z2) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(ensureSubDecor.RemoteActionCompatParcelizer(setSupportBackgroundTintList.IconCompatParcelizer(context, i2), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }

    public final Drawable RemoteActionCompatParcelizer(Context context, int i) {
        Drawable drawableIconCompatParcelizer;
        synchronized (this) {
            drawableIconCompatParcelizer = IconCompatParcelizer(context, i, false);
        }
        return drawableIconCompatParcelizer;
    }
}
