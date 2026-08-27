package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.navigation.ui.maps.route.callout.api.MapboxRouteCalloutAdapter;
import com.mapbox.navigation.ui.maps.route.callout.model.DefaultRouteCalloutAdapterOptions;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 extends MapboxRouteCalloutAdapter {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final RetryWithDelay$$ExternalSyntheticLambda0 IconCompatParcelizer;
    public final shouldSkipDump RatingCompat;
    public final DefaultRouteCalloutAdapterOptions RemoteActionCompatParcelizer;
    public final Context read;
    public final setTransactionSuccessful serializer;
    public final LayoutInflater write;

    public m2(Context context, DefaultRouteCalloutAdapterOptions defaultRouteCalloutAdapterOptions, shouldSkipDump shouldskipdump, setTransactionSuccessful settransactionsuccessful, RetryWithDelay$$ExternalSyntheticLambda0 retryWithDelay$$ExternalSyntheticLambda0) {
        this.read = context;
        this.RatingCompat = shouldskipdump;
        this.serializer = settransactionsuccessful;
        this.IconCompatParcelizer = retryWithDelay$$ExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = defaultRouteCalloutAdapterOptions;
        this.write = LayoutInflater.from(context);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    public final BitmapDrawable read(ViewAnnotationAnchorConfig viewAnnotationAnchorConfig, int i) {
        boolean z;
        Bitmap bitmap;
        float f;
        int i2 = 2 % 2;
        int i3 = m5.write[viewAnnotationAnchorConfig.getAnchor().ordinal()];
        boolean z2 = true;
        if (i3 == 1) {
            int i4 = MediaDescriptionCompat + 107;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else if (i3 != 2) {
            int i6 = MediaBrowserCompatMediaItem;
            int i7 = i6 + 37;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i3 != 3) {
                int i9 = i6 + 45;
                MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                z = false;
                z2 = false;
            } else {
                z = true;
                z2 = false;
            }
        } else {
            z = false;
        }
        Context context = this.read;
        Drawable drawableWrite = resizeToBitmapDimensionslambda3.write(context, com.logistics.rider.glovo.R.drawable.background_eta);
        if (drawableWrite == null) {
            bitmap = null;
        } else if (drawableWrite instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawableWrite).getBitmap();
        } else {
            Drawable.ConstantState constantState = drawableWrite.getConstantState();
            if (constantState == null) {
                bitmap = null;
            } else {
                Drawable drawableMutate = constantState.newDrawable().mutate();
                drawableMutate.getClass();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                drawableMutate.setTint(i);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                drawableMutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                float f2 = -1.0f;
                if (z2) {
                    int i11 = MediaDescriptionCompat + 95;
                    MediaBrowserCompatMediaItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                if (z) {
                    int i13 = MediaDescriptionCompat + 57;
                    MediaBrowserCompatMediaItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                } else {
                    f2 = 1.0f;
                }
                canvas.scale(f, f2, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
                drawableMutate.draw(canvas);
                bitmap = bitmapCreateBitmap;
            }
        }
        if (bitmap == null) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getClass();
        return new BitmapDrawable(resources, bitmap);
    }
}
