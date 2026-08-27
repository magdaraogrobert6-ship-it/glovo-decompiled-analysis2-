package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.I$b;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class SubcomposeSlotReusePolicy extends Drawable implements createPausedPrecomposition {
    public static final android.graphics.Paint getFullyDrawnReporter;
    public final BitSet getActivityResultRegistry;
    public final getMessage[] getDefaultViewModelCreationExtras;
    public accessgetReusedSlotIdp getLifecycle;
    public final android.graphics.Paint getNavigationEventDispatcher;
    public final RectF getOnBackPressedDispatcher;
    public final android.graphics.Matrix getSavedStateRegistry;
    public final getMessage[] getViewModelStore;
    public final android.graphics.Path initializeViewTreeOwners;
    public final android.graphics.Path invalidateMenu;
    public final RectF onActivityResult;
    public boolean onBackPressed;
    public final BrazeImageUtils onConfigurationChanged;
    public final PinnableContainerKtLocalPinnableContainer1 onCreate;
    public final Region onCreatePanelMenu;
    public boolean onMenuItemSelected;
    public final takeOrElseoyDd2qo onMultiWindowModeChanged;
    public final RectF onNewIntent;
    public final android.graphics.Paint onPanelClosed;
    public final Region onPictureInPictureModeChanged;
    public PorterDuffColorFilter onPictureInPictureUiStateChanged;
    public PorterDuffColorFilter onPreparePanel;
    public SubcomposeLayoutPausableCompositionException onRequestPermissionsResult;

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.getLifecycle;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.onBackPressed = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect rect) {
        this.onBackPressed = true;
        super.onBoundsChange(rect);
    }

    public final void ComponentActivity() {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        float f = accessgetreusedslotidp.serializer + 0.0f;
        accessgetreusedslotidp.MediaSessionCompatToken = (int) Math.ceil(0.75f * f);
        this.getLifecycle.MediaBrowserCompatMediaItem = (int) Math.ceil(f * 0.25f);
        ParcelableVolumeInfo();
        super.invalidateSelf();
    }

    public void IconCompatParcelizer(android.graphics.Canvas canvas) {
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.onRequestPermissionsResult;
        RectF rectFRatingCompat = RatingCompat();
        RectF rectF = this.getOnBackPressedDispatcher;
        rectF.set(rectFRatingCompat);
        boolean zMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        android.graphics.Paint paint = this.onPanelClosed;
        float strokeWidth = zMediaSessionCompatResultReceiverWrapper ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        read(canvas, paint, this.invalidateMenu, subcomposeLayoutPausableCompositionException, rectF);
    }

    public final boolean IconCompatParcelizer(int[] iArr) {
        boolean z;
        android.graphics.Paint paint;
        int color;
        int colorForState;
        android.graphics.Paint paint2;
        int color2;
        int colorForState2;
        if (this.getLifecycle.RemoteActionCompatParcelizer == null || color2 == (colorForState2 = this.getLifecycle.RemoteActionCompatParcelizer.getColorForState(iArr, (color2 = (paint2 = this.getNavigationEventDispatcher).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.getLifecycle.PlaybackStateCompatCustomAction == null || color == (colorForState = this.getLifecycle.PlaybackStateCompatCustomAction.getColorForState(iArr, (color = (paint = this.onPanelClosed).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final float MediaBrowserCompatMediaItem() {
        return this.getLifecycle.PlaybackStateCompat.MediaDescriptionCompat.write(RatingCompat());
    }

    public final void MediaBrowserCompatMediaItem(float f) {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        if (accessgetreusedslotidp.serializer != f) {
            accessgetreusedslotidp.serializer = f;
            ComponentActivity();
        }
    }

    public final void MediaBrowserCompatMediaItem(ColorStateList colorStateList) {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        if (accessgetreusedslotidp.RemoteActionCompatParcelizer != colorStateList) {
            accessgetreusedslotidp.RemoteActionCompatParcelizer = colorStateList;
            onStateChange(getState());
        }
    }

    public final float MediaSessionCompatQueueItem() {
        return this.getLifecycle.IconCompatParcelizer;
    }

    public final void MediaSessionCompatQueueItem(float f) {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        if (accessgetreusedslotidp.IconCompatParcelizer != f) {
            accessgetreusedslotidp.IconCompatParcelizer = f;
            this.onBackPressed = true;
            invalidateSelf();
        }
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        android.graphics.Paint.Style style = this.getLifecycle.RatingCompat;
        return (style == android.graphics.Paint.Style.FILL_AND_STROKE || style == android.graphics.Paint.Style.STROKE) && this.onPanelClosed.getStrokeWidth() > 0.0f;
    }

    public final boolean MediaSessionCompatToken() {
        return this.getLifecycle.PlaybackStateCompat.read(RatingCompat());
    }

    public final boolean ParcelableVolumeInfo() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.onPictureInPictureUiStateChanged;
        PorterDuffColorFilter porterDuffColorFilter3 = this.onPreparePanel;
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        ColorStateList colorStateList = accessgetreusedslotidp.MediaSessionCompatResultReceiverWrapper;
        PorterDuff.Mode mode = accessgetreusedslotidp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (colorStateList == null || mode == null) {
            int color = this.getNavigationEventDispatcher.getColor();
            int i = read(color);
            porterDuffColorFilter = i != color ? new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(read(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.onPictureInPictureUiStateChanged = porterDuffColorFilter;
        this.getLifecycle.getClass();
        this.onPreparePanel = null;
        this.getLifecycle.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.onPictureInPictureUiStateChanged) && Objects.equals(porterDuffColorFilter3, this.onPreparePanel)) ? false : true;
    }

    public final float PlaybackStateCompat() {
        return this.getLifecycle.PlaybackStateCompat.PlaybackStateCompat.write(RatingCompat());
    }

    public final void RemoteActionCompatParcelizer(android.graphics.Canvas canvas) {
        if (this.getActivityResultRegistry.cardinality() > 0) {
            SentryLogcatAdapter.IconCompatParcelizer("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.getLifecycle.MediaBrowserCompatMediaItem;
        android.graphics.Path path = this.initializeViewTreeOwners;
        takeOrElseoyDd2qo takeorelseoydd2qo = this.onMultiWindowModeChanged;
        if (i != 0) {
            canvas.drawPath(path, takeorelseoydd2qo.MediaBrowserCompatMediaItem);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            getMessage getmessage = this.getDefaultViewModelCreationExtras[i2];
            int i3 = this.getLifecycle.MediaSessionCompatToken;
            android.graphics.Matrix matrix = getMessage.IconCompatParcelizer;
            getmessage.RemoteActionCompatParcelizer(matrix, takeorelseoydd2qo, i3, canvas);
            this.getViewModelStore[i2].RemoteActionCompatParcelizer(matrix, takeorelseoydd2qo, this.getLifecycle.MediaSessionCompatToken, canvas);
        }
        if (this.onMenuItemSelected) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.getLifecycle.MediaBrowserCompatMediaItem));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.getLifecycle.MediaBrowserCompatMediaItem));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, getFullyDrawnReporter);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.getLifecycle.read;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        this.getLifecycle.getClass();
        if (MediaSessionCompatToken()) {
            outline.setRoundRect(getBounds(), MediaBrowserCompatMediaItem() * this.getLifecycle.IconCompatParcelizer);
        } else {
            RectF rectFRatingCompat = RatingCompat();
            android.graphics.Path path = this.initializeViewTreeOwners;
            write(rectFRatingCompat, path);
            FocusRequesterCompanionFocusRequesterFactory.read(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.getLifecycle.MediaDescriptionCompat;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.getLifecycle = new accessgetReusedSlotIdp(this.getLifecycle);
        return this;
    }

    public final int read(int i) {
        int i2;
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        float f = accessgetreusedslotidp.serializer + 0.0f + accessgetreusedslotidp.MediaSessionCompatQueueItem;
        accessgetPausePausedcp accessgetpausepausedcp = accessgetreusedslotidp.write;
        if (accessgetpausepausedcp == null || !accessgetpausepausedcp.MediaBrowserCompatMediaItem || setPrevious.write(i, 255) != accessgetpausepausedcp.read) {
            return i;
        }
        float f2 = accessgetpausepausedcp.write;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = android.graphics.Color.alpha(i);
        int iWrite = mergeRulerValues.write(fMin, setPrevious.write(i, 255), accessgetpausepausedcp.serializer);
        if (fMin > 0.0f && (i2 = accessgetpausepausedcp.IconCompatParcelizer) != 0) {
            iWrite = setPrevious.RemoteActionCompatParcelizer(setPrevious.write(i2, accessgetPausePausedcp.RemoteActionCompatParcelizer), iWrite);
        }
        return setPrevious.write(iWrite, iAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        if (accessgetreusedslotidp.read != i) {
            accessgetreusedslotidp.read = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.getLifecycle.getClass();
        super.invalidateSelf();
    }

    @Override // o.createPausedPrecomposition
    public final void setShapeAppearanceModel(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.getLifecycle.PlaybackStateCompat = subcomposeLayoutPausableCompositionException;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.getLifecycle.MediaSessionCompatResultReceiverWrapper = colorStateList;
        ParcelableVolumeInfo();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        if (accessgetreusedslotidp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != mode) {
            accessgetreusedslotidp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mode;
            ParcelableVolumeInfo();
            super.invalidateSelf();
        }
    }

    public final void write(RectF rectF, android.graphics.Path path) {
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        this.onConfigurationChanged.IconCompatParcelizer(accessgetreusedslotidp.PlaybackStateCompat, accessgetreusedslotidp.IconCompatParcelizer, rectF, this.onCreate, path);
        if (this.getLifecycle.MediaMetadataCompat != 1.0f) {
            android.graphics.Matrix matrix = this.getSavedStateRegistry;
            matrix.reset();
            float f = this.getLifecycle.MediaMetadataCompat;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.onActivityResult, true);
    }

    static {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        getFullyDrawnReporter = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public final void PlaybackStateCompatCustomAction() {
        this.onMultiWindowModeChanged.serializer(-12303292);
        this.getLifecycle.getClass();
        super.invalidateSelf();
    }

    public SubcomposeSlotReusePolicy(accessgetReusedSlotIdp accessgetreusedslotidp) {
        this.getDefaultViewModelCreationExtras = new getMessage[4];
        this.getViewModelStore = new getMessage[4];
        this.getActivityResultRegistry = new BitSet(8);
        this.getSavedStateRegistry = new android.graphics.Matrix();
        this.initializeViewTreeOwners = new android.graphics.Path();
        this.invalidateMenu = new android.graphics.Path();
        this.onNewIntent = new RectF();
        this.getOnBackPressedDispatcher = new RectF();
        this.onPictureInPictureModeChanged = new Region();
        this.onCreatePanelMenu = new Region();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.getNavigationEventDispatcher = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.onPanelClosed = paint2;
        this.onMultiWindowModeChanged = new takeOrElseoyDd2qo();
        this.onConfigurationChanged = Looper.getMainLooper().getThread() == Thread.currentThread() ? SubcomposeLayoutKtSubcomposeLayout41.RemoteActionCompatParcelizer : new BrazeImageUtils();
        this.onActivityResult = new RectF();
        this.onMenuItemSelected = true;
        this.getLifecycle = accessgetreusedslotidp;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        ParcelableVolumeInfo();
        IconCompatParcelizer(getState());
        this.onCreate = new PinnableContainerKtLocalPinnableContainer1(18, this);
    }

    public final RectF RatingCompat() {
        android.graphics.Rect bounds = getBounds();
        RectF rectF = this.onNewIntent;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.onPictureInPictureUiStateChanged;
        android.graphics.Paint paint = this.getNavigationEventDispatcher;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.getLifecycle.read;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.onPreparePanel;
        android.graphics.Paint paint2 = this.onPanelClosed;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.getLifecycle.ParcelableVolumeInfo);
        int alpha2 = paint2.getAlpha();
        int i2 = this.getLifecycle.read;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.onBackPressed;
        android.graphics.Path path = this.initializeViewTreeOwners;
        if (z) {
            float f = -(MediaSessionCompatResultReceiverWrapper() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.getLifecycle.PlaybackStateCompat;
            I$b i$bWrite = subcomposeLayoutPausableCompositionException.write();
            SimplePlacementScope subcomposeLayout = subcomposeLayoutPausableCompositionException.MediaDescriptionCompat;
            if (!(subcomposeLayout instanceof SubcomposeLayoutKtReusedSlotId1)) {
                subcomposeLayout = new SubcomposeLayout(f, subcomposeLayout);
            }
            i$bWrite.RemoteActionCompatParcelizer = subcomposeLayout;
            SimplePlacementScope subcomposeLayout2 = subcomposeLayoutPausableCompositionException.PlaybackStateCompat;
            if (!(subcomposeLayout2 instanceof SubcomposeLayoutKtReusedSlotId1)) {
                subcomposeLayout2 = new SubcomposeLayout(f, subcomposeLayout2);
            }
            i$bWrite.MediaDescriptionCompat = subcomposeLayout2;
            SimplePlacementScope subcomposeLayout3 = subcomposeLayoutPausableCompositionException.write;
            if (!(subcomposeLayout3 instanceof SubcomposeLayoutKtReusedSlotId1)) {
                subcomposeLayout3 = new SubcomposeLayout(f, subcomposeLayout3);
            }
            i$bWrite.MediaMetadataCompat = subcomposeLayout3;
            SimplePlacementScope subcomposeLayout4 = subcomposeLayoutPausableCompositionException.read;
            if (!(subcomposeLayout4 instanceof SubcomposeLayoutKtReusedSlotId1)) {
                subcomposeLayout4 = new SubcomposeLayout(f, subcomposeLayout4);
            }
            i$bWrite.RatingCompat = subcomposeLayout4;
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer = i$bWrite.IconCompatParcelizer();
            this.onRequestPermissionsResult = subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer;
            float f2 = this.getLifecycle.IconCompatParcelizer;
            RectF rectFRatingCompat = RatingCompat();
            RectF rectF = this.getOnBackPressedDispatcher;
            rectF.set(rectFRatingCompat);
            float strokeWidth = MediaSessionCompatResultReceiverWrapper() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.onConfigurationChanged.IconCompatParcelizer(subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer, f2, rectF, null, this.invalidateMenu);
            write(RatingCompat(), path);
            this.onBackPressed = false;
        }
        accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
        accessgetreusedslotidp.getClass();
        if (accessgetreusedslotidp.MediaSessionCompatToken > 0 && !MediaSessionCompatToken() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.getLifecycle.MediaBrowserCompatMediaItem)), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.getLifecycle.MediaBrowserCompatMediaItem)));
            if (!this.onMenuItemSelected) {
                RemoteActionCompatParcelizer(canvas);
                canvas.restore();
            } else {
                RectF rectF2 = this.onActivityResult;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth >= 0 && iHeight >= 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.getLifecycle.MediaSessionCompatToken * 2) + ((int) rectF2.width()) + iWidth, (this.getLifecycle.MediaSessionCompatToken * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.getLifecycle.MediaSessionCompatToken) - iWidth;
                    float f4 = (getBounds().top - this.getLifecycle.MediaSessionCompatToken) - iHeight;
                    canvas2.translate(-f3, -f4);
                    RemoteActionCompatParcelizer(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (android.graphics.Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
            }
        }
        accessgetReusedSlotIdp accessgetreusedslotidp2 = this.getLifecycle;
        android.graphics.Paint.Style style = accessgetreusedslotidp2.RatingCompat;
        if (style == android.graphics.Paint.Style.FILL_AND_STROKE || style == android.graphics.Paint.Style.FILL) {
            read(canvas, paint, path, accessgetreusedslotidp2.PlaybackStateCompat, RatingCompat());
        }
        if (MediaSessionCompatResultReceiverWrapper()) {
            IconCompatParcelizer(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        android.graphics.Rect bounds = getBounds();
        Region region = this.onPictureInPictureModeChanged;
        region.set(bounds);
        RectF rectFRatingCompat = RatingCompat();
        android.graphics.Path path = this.initializeViewTreeOwners;
        write(rectFRatingCompat, path);
        Region region2 = this.onCreatePanelMenu;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = IconCompatParcelizer(iArr) || ParcelableVolumeInfo();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void write(Context context) {
        this.getLifecycle.write = new accessgetPausePausedcp(context);
        ComponentActivity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.getLifecycle.MediaSessionCompatResultReceiverWrapper;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.getLifecycle.getClass();
        ColorStateList colorStateList2 = this.getLifecycle.PlaybackStateCompatCustomAction;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.getLifecycle.RemoteActionCompatParcelizer;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void read(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.Path path, SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException, RectF rectF) {
        if (!subcomposeLayoutPausableCompositionException.read(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fWrite = subcomposeLayoutPausableCompositionException.PlaybackStateCompat.write(rectF) * this.getLifecycle.IconCompatParcelizer;
            canvas.drawRoundRect(rectF, fWrite, fWrite, paint);
        }
    }

    public SubcomposeSlotReusePolicy(Context context, AttributeSet attributeSet, int i, int i2) {
        this(SubcomposeLayoutPausableCompositionException.serializer(context, attributeSet, i, i2).IconCompatParcelizer());
    }

    public SubcomposeSlotReusePolicy(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this(new accessgetReusedSlotIdp(subcomposeLayoutPausableCompositionException));
    }

    public SubcomposeSlotReusePolicy() {
        this(new SubcomposeLayoutPausableCompositionException());
    }
}
