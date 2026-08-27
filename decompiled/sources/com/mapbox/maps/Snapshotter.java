package com.mapbox.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.MapboxOptions;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.geojson.Point;
import com.mapbox.maps.attribution.AttributionLayout;
import com.mapbox.maps.attribution.AttributionMeasure;
import com.mapbox.maps.attribution.AttributionParser;
import com.mapbox.maps.module.MapTelemetry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.createFromParcel;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setLeft;

/* JADX INFO: loaded from: classes2.dex */
public class Snapshotter {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "Snapshotter";
    private List<Cancelable> cancelableEvents;
    private final WeakReference<Context> context;
    private MapSnapshotter coreSnapshotter;
    private Cancelable loadingErrorCancelable;
    private final MapSnapshotOptions mapSnapshotOptions;
    private final float pixelRatio;
    private final SnapshotOverlayOptions snapshotOverlayOptions;
    private SnapshotStyleListener snapshotStyleCallback;
    private Cancelable styleLoadedCancelable;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Logo {
        private final Bitmap large;
        private final float scale;
        private final Bitmap small;

        public final Bitmap component1() {
            return this.large;
        }

        public final Bitmap component2() {
            return this.small;
        }

        public final float component3() {
            return this.scale;
        }

        public final Bitmap getLarge() {
            return this.large;
        }

        public final float getScale() {
            return this.scale;
        }

        public final Bitmap getSmall() {
            return this.small;
        }

        public int hashCode() {
            int iHashCode = this.large.hashCode();
            return Float.hashCode(this.scale) + ((this.small.hashCode() + (iHashCode * 31)) * 31);
        }

        public Logo(Bitmap bitmap, Bitmap bitmap2, float f) {
            bitmap.getClass();
            bitmap2.getClass();
            this.large = bitmap;
            this.small = bitmap2;
            this.scale = f;
        }

        public final Logo copy(Bitmap bitmap, Bitmap bitmap2, float f) {
            bitmap.getClass();
            bitmap2.getClass();
            return new Logo(bitmap, bitmap2, f);
        }

        public static /* synthetic */ Logo copy$default(Logo logo, Bitmap bitmap, Bitmap bitmap2, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                bitmap = logo.large;
            }
            if ((i & 2) != 0) {
                bitmap2 = logo.small;
            }
            if ((i & 4) != 0) {
                f = logo.scale;
            }
            return logo.copy(bitmap, bitmap2, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.large, logo.large}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.small, logo.small}, getCieXyz.write())).booleanValue() && Float.compare(this.scale, logo.scale) == 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Logo(large=");
            sb.append(this.large);
            sb.append(", small=");
            sb.append(this.small);
            sb.append(", scale=");
            return MediaSessionCompatQueueItem.serializer(sb, this.scale, ')');
        }
    }

    public final /* synthetic */ SnapshotStyleListener getSnapshotStyleCallback$maps_sdk_release() {
        return this.snapshotStyleCallback;
    }

    public final /* synthetic */ void setSnapshotStyleCallback$maps_sdk_release(SnapshotStyleListener snapshotStyleListener) {
        this.snapshotStyleCallback = snapshotStyleListener;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
            asyncOperationResultCallback.getClass();
            MapsResourceOptions.clearData(asyncOperationResultCallback);
        }

        public final /* synthetic */ Snapshotter invoke$maps_sdk_release(WeakReference weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter) {
            weakReference.getClass();
            mapSnapshotOptions.getClass();
            snapshotOverlayOptions.getClass();
            mapSnapshotter.getClass();
            return new Snapshotter(weakReference, mapSnapshotOptions, snapshotOverlayOptions, mapSnapshotter, (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    private final void addOverlay(Bitmap bitmap, SnapshotOverlay snapshotOverlay) {
        Context context = this.context.get();
        if (context != null) {
            drawOverlay(bitmap, snapshotOverlay, ((int) context.getResources().getDisplayMetrics().density) * 4);
        }
    }

    public static final void clearData(AsyncOperationResultCallback asyncOperationResultCallback) {
        Companion.clearData(asyncOperationResultCallback);
    }

    private final String createAttributionString(SnapshotOverlay snapshotOverlay, boolean z) {
        Context context = this.context.get();
        if (context == null) {
            return "";
        }
        AttributionParser.Options options = new AttributionParser.Options(context);
        Object[] array = snapshotOverlay.getAttributions().toArray(new String[0]);
        array.getClass();
        String[] strArr = (String[]) array;
        return options.withAttributionData((String[]) Arrays.copyOf(strArr, strArr.length)).withCopyrightSign(false).withImproveMap(false).withMapboxPrivacyPolicy(false).withTelemetryAttribution(false).withMapboxGeofencingConsent(false).build().createAttributionString(z);
    }

    private final void dispatchTelemetryTurnstileEvent(final Context context) {
        ((MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.MapTelemetry, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.Snapshotter.dispatchTelemetryTurnstileEvent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
                mapboxModuleType.getClass();
                return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, context.getApplicationContext())};
            }
        })).onAppUserTurnstileEvent();
    }

    private final void drawOverlay(Bitmap bitmap, SnapshotOverlay snapshotOverlay, int i) {
        AttributionMeasure attributionMeasure;
        AttributionLayout attributionLayoutMeasure;
        Context context = this.context.get();
        if (context == null || (attributionLayoutMeasure = (attributionMeasure = getAttributionMeasure(context, snapshotOverlay, bitmap, i)).measure()) == null) {
            return;
        }
        if (this.snapshotOverlayOptions.getShowLogo()) {
            drawLogo(bitmap, snapshotOverlay.getCanvas(), i, attributionLayoutMeasure);
        }
        if (this.snapshotOverlayOptions.getShowAttributes()) {
            drawAttribution(snapshotOverlay, attributionMeasure, attributionLayoutMeasure);
        }
    }

    public Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions) {
        context.getClass();
        mapSnapshotOptions.getClass();
        snapshotOverlayOptions.getClass();
        this.cancelableEvents = new ArrayList();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) MapboxOptions.getAccessToken())) {
            throw new MapboxConfigurationException();
        }
        this.context = new WeakReference<>(context);
        this.mapSnapshotOptions = mapSnapshotOptions;
        this.snapshotOverlayOptions = snapshotOverlayOptions;
        this.pixelRatio = context.getResources().getDisplayMetrics().density;
        this.coreSnapshotter = new MapSnapshotter(mapSnapshotOptions);
        dispatchTelemetryTurnstileEvent(context);
        final WeakReference weakReference = new WeakReference(this);
        this.loadingErrorCancelable = subscribeMapLoadingError(new MapLoadingErrorCallback() { // from class: com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda3
            @Override // com.mapbox.maps.MapLoadingErrorCallback
            public final void run(MapLoadingError mapLoadingError) {
                Snapshotter._init_$lambda$1(weakReference, mapLoadingError);
            }
        });
        this.cancelableEvents.add(subscribeStyleDataLoaded(new Snapshotter$$ExternalSyntheticLambda4(weakReference)));
        this.styleLoadedCancelable = subscribeStyleLoaded(new Snapshotter$$ExternalSyntheticLambda4(weakReference));
        this.cancelableEvents.add(subscribeStyleImageMissing(new Snapshotter$$ExternalSyntheticLambda4(weakReference)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(WeakReference weakReference, MapLoadingError mapLoadingError) {
        weakReference.getClass();
        mapLoadingError.getClass();
        Snapshotter snapshotter = (Snapshotter) weakReference.get();
        if (snapshotter != null) {
            Cancelable cancelable = snapshotter.loadingErrorCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
            SnapshotStyleListener snapshotStyleListener = snapshotter.snapshotStyleCallback;
            if (snapshotStyleListener != null) {
                String message = mapLoadingError.getMessage();
                message.getClass();
                snapshotStyleListener.onDidFailLoadingStyle(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(WeakReference weakReference, StyleImageMissing styleImageMissing) {
        SnapshotStyleListener snapshotStyleListener;
        weakReference.getClass();
        styleImageMissing.getClass();
        Snapshotter snapshotter = (Snapshotter) weakReference.get();
        if (snapshotter == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        String imageId = styleImageMissing.getImageId();
        imageId.getClass();
        snapshotStyleListener.onStyleImageMissing(imageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(WeakReference weakReference, StyleDataLoaded styleDataLoaded) {
        Snapshotter snapshotter;
        MapSnapshotter mapSnapshotter;
        SnapshotStyleListener snapshotStyleListener;
        weakReference.getClass();
        styleDataLoaded.getClass();
        if (styleDataLoaded.getType() != StyleDataLoadedType.STYLE || (snapshotter = (Snapshotter) weakReference.get()) == null || (mapSnapshotter = snapshotter.coreSnapshotter) == null || (snapshotStyleListener = snapshotter.snapshotStyleCallback) == null) {
            return;
        }
        snapshotStyleListener.onDidFinishLoadingStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new Snapshotter$$ExternalSyntheticLambda0(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(WeakReference weakReference, StyleLoaded styleLoaded) {
        SnapshotStyleListener snapshotStyleListener;
        weakReference.getClass();
        styleLoaded.getClass();
        Snapshotter snapshotter = (Snapshotter) weakReference.get();
        if (snapshotter != null) {
            MapSnapshotter mapSnapshotter = snapshotter.coreSnapshotter;
            if (mapSnapshotter != null && (snapshotStyleListener = snapshotter.snapshotStyleCallback) != null) {
                snapshotStyleListener.onDidFullyLoadStyle(new Style(mapSnapshotter, snapshotter.pixelRatio, new Snapshotter$$ExternalSyntheticLambda0(10)));
            }
            Cancelable cancelable = snapshotter.styleLoadedCancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$17(Snapshotter snapshotter, SnapshotResultCallback snapshotResultCallback, SnapshotOverlayCallback snapshotOverlayCallback, Expected expected) {
        createFromParcel createfromparcel;
        snapshotter.getClass();
        snapshotResultCallback.getClass();
        expected.getClass();
        if (!expected.isValue()) {
            String str = (String) expected.getError();
            if (str == null) {
                str = "Undefined error happened.";
            }
            snapshotResultCallback.onSnapshotResult(null, str);
            return;
        }
        final MapSnapshot mapSnapshot = (MapSnapshot) expected.getValue();
        if (mapSnapshot != null) {
            Image imageMoveImage = mapSnapshot.moveImage();
            if (imageMoveImage != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(imageMoveImage.getWidth(), imageMoveImage.getHeight(), Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(imageMoveImage.getData().getBuffer());
                final Canvas canvas = new Canvas(bitmapCreateBitmap);
                SnapshotOverlay snapshotOverlay = new SnapshotOverlay(canvas, mapSnapshot) { // from class: com.mapbox.maps.Snapshotter$start$1$1$snapshotOverlay$1
                    final /* synthetic */ MapSnapshot $coreMapSnapshot;
                    private final List<String> attributions;
                    private final Canvas canvas;

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public List<String> getAttributions() {
                        return this.attributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Canvas getCanvas() {
                        return this.canvas;
                    }

                    {
                        this.$coreMapSnapshot = mapSnapshot;
                        this.canvas = canvas;
                        List<String> listAttributions = mapSnapshot.attributions();
                        listAttributions.getClass();
                        this.attributions = listAttributions;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public Point coordinate(ScreenCoordinate screenCoordinate) {
                        screenCoordinate.getClass();
                        Point pointCoordinate = this.$coreMapSnapshot.coordinate(screenCoordinate);
                        pointCoordinate.getClass();
                        return pointCoordinate;
                    }

                    @Override // com.mapbox.maps.SnapshotOverlay
                    public ScreenCoordinate screenCoordinate(Point point) {
                        point.getClass();
                        ScreenCoordinate screenCoordinate = this.$coreMapSnapshot.screenCoordinate(point);
                        screenCoordinate.getClass();
                        return screenCoordinate;
                    }
                };
                if (snapshotOverlayCallback != null) {
                    snapshotOverlayCallback.onSnapshotOverlay(snapshotOverlay);
                }
                snapshotter.addOverlay(bitmapCreateBitmap, snapshotOverlay);
                snapshotResultCallback.onSnapshotResult(bitmapCreateBitmap, null);
            } else {
                snapshotResultCallback.onSnapshotResult(null, "Moving image data failed!");
            }
            createfromparcel = createFromParcel.INSTANCE;
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            snapshotResultCallback.onSnapshotResult(null, "Snapshot was empty.");
        }
    }

    public final CameraOptions cameraForCoordinates(List<Point> list, EdgeInsets edgeInsets, Double d, Double d2) {
        list.getClass();
        MapSnapshotter mapSnapshotterRequireCoreSnapshotter = requireCoreSnapshotter();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.bearing(d);
        builder.pitch(d2);
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        CameraOptions valueOrElse = mapSnapshotterRequireCoreSnapshotter.cameraForCoordinates(list, cameraOptionsBuild, edgeInsets, null, null).getValueOrElse(new Snapshotter$$ExternalSyntheticLambda0(11));
        valueOrElse.getClass();
        return valueOrElse;
    }

    public final CoordinateBounds coordinateBoundsForCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = requireCoreSnapshotter().coordinateBoundsForCamera(cameraOptions);
        coordinateBoundsCoordinateBoundsForCamera.getClass();
        return coordinateBoundsCoordinateBoundsForCamera;
    }

    public final void destroy() {
        cancel();
        Iterator<T> it = this.cancelableEvents.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.cancelableEvents.clear();
        Cancelable cancelable = this.loadingErrorCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        Cancelable cancelable2 = this.styleLoadedCancelable;
        if (cancelable2 != null) {
            cancelable2.cancel();
        }
        this.snapshotStyleCallback = null;
        this.coreSnapshotter = null;
    }

    public final void setCamera(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        requireCoreSnapshotter().setCamera(cameraOptions);
    }

    public final void setSize(Size size) {
        size.getClass();
        requireCoreSnapshotter().setSize(size);
    }

    public final void setStyleJson(String str) {
        str.getClass();
        requireCoreSnapshotter().setStyleJSON(str);
    }

    public final void setStyleListener(SnapshotStyleListener snapshotStyleListener) {
        snapshotStyleListener.getClass();
        this.snapshotStyleCallback = snapshotStyleListener;
    }

    public final void setStyleUri(String str) {
        str.getClass();
        requireCoreSnapshotter().setStyleURI(str);
    }

    public final void start(SnapshotOverlayCallback snapshotOverlayCallback, SnapshotResultCallback snapshotResultCallback) {
        snapshotResultCallback.getClass();
        if (getStyleJson().length() == 0 && getStyleUri().length() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("It's required to call setUri or setJson to provide a style definition before calling start.");
        } else {
            requireCoreSnapshotter().start(new PreviewView$1$$ExternalSyntheticLambda2(this, snapshotResultCallback, snapshotOverlayCallback, 20));
        }
    }

    @MapboxExperimental
    public final List<CanonicalTileID> tileCover(TileCoverOptions tileCoverOptions, CameraOptions cameraOptions) {
        tileCoverOptions.getClass();
        List<CanonicalTileID> listTileCover = requireCoreSnapshotter().tileCover(tileCoverOptions, cameraOptions);
        listTileCover.getClass();
        return listTileCover;
    }

    private final float calculateLogoScale(Context context, Bitmap bitmap, Bitmap bitmap2) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        float fMin = Math.min((bitmap2.getWidth() / (displayMetrics.widthPixels / bitmap.getWidth())) / bitmap2.getWidth(), (bitmap2.getHeight() / (displayMetrics.heightPixels / bitmap.getHeight())) / bitmap2.getHeight()) * 2.0f;
        if (fMin > 1.0f) {
            return 1.0f;
        }
        if (fMin < 0.6f) {
            return 0.6f;
        }
        return fMin;
    }

    private final Logo createScaledLogo(Context context, Bitmap bitmap) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.mapbox_logo_icon, null);
        bitmapDecodeResource.getClass();
        float fCalculateLogoScale = calculateLogoScale(context, bitmap, bitmapDecodeResource);
        Matrix matrix = new Matrix();
        matrix.postScale(fCalculateLogoScale, fCalculateLogoScale);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.mapbox_logo_helmet, null);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, true);
        bitmapCreateBitmap.getClass();
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeResource2, 0, 0, bitmapDecodeResource2.getWidth(), bitmapDecodeResource2.getHeight(), matrix, true);
        bitmapCreateBitmap2.getClass();
        return new Logo(bitmapCreateBitmap, bitmapCreateBitmap2, fCalculateLogoScale);
    }

    private final TextView createTextView(Context context, SnapshotOverlay snapshotOverlay, boolean z, float f) {
        Resources resources = context.getResources();
        int i = R.color.mapbox_gray_dark;
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = setLeft.read;
        int color = resources.getColor(i, theme);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        String strCreateAttributionString = createAttributionString(snapshotOverlay, z);
        if (strCreateAttributionString.length() > 0) {
            textView.setSingleLine(true);
            textView.setTextSize(f * 10.0f);
            textView.setTextColor(color);
            textView.setBackgroundResource(R.drawable.mapbox_rounded_corner);
            textView.setText(Html.fromHtml(strCreateAttributionString));
            textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        }
        return textView;
    }

    private final Cancelable subscribeMapLoadingError(MapLoadingErrorCallback mapLoadingErrorCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(mapLoadingErrorCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleDataLoaded(StyleDataLoadedCallback styleDataLoadedCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleDataLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleImageMissing(StyleImageMissingCallback styleImageMissingCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleImageMissingCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    private final Cancelable subscribeStyleLoaded(StyleLoadedCallback styleLoadedCallback) {
        Cancelable cancelableSubscribe = requireCoreSnapshotter().subscribe(styleLoadedCallback);
        cancelableSubscribe.getClass();
        return cancelableSubscribe;
    }

    public final void cancel() {
        requireCoreSnapshotter().cancel();
    }

    public final CameraState getCameraState() {
        CameraState cameraState = requireCoreSnapshotter().getCameraState();
        cameraState.getClass();
        return cameraState;
    }

    public final Size getSize() {
        Size size = requireCoreSnapshotter().getSize();
        size.getClass();
        return size;
    }

    public final String getStyleJson() {
        String styleJSON = requireCoreSnapshotter().getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    public final String getStyleUri() {
        String styleURI = requireCoreSnapshotter().getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    private final void drawAttribution(SnapshotOverlay snapshotOverlay, AttributionMeasure attributionMeasure, AttributionLayout attributionLayout) {
        PointF anchorPoint = attributionLayout.getAnchorPoint();
        if (anchorPoint != null) {
            drawAttribution(snapshotOverlay.getCanvas(), attributionMeasure, anchorPoint);
            return;
        }
        MapboxLogger.logW(TAG, "Could not generate attribution for snapshot size: " + snapshotOverlay.getCanvas().getWidth() + 'x' + snapshotOverlay.getCanvas().getHeight() + ". You are required to provide your own attribution for the used sources: " + snapshotOverlay.getAttributions());
    }

    private final AttributionMeasure getAttributionMeasure(Context context, SnapshotOverlay snapshotOverlay, Bitmap bitmap, int i) {
        Logo logoCreateScaledLogo = createScaledLogo(context, bitmap);
        return new AttributionMeasure(bitmap, logoCreateScaledLogo.getLarge(), logoCreateScaledLogo.getSmall(), createTextView(context, snapshotOverlay, false, logoCreateScaledLogo.getScale()), createTextView(context, snapshotOverlay, true, logoCreateScaledLogo.getScale()), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraOptions cameraForCoordinates$lambda$20(String str) {
        str.getClass();
        MapboxLogger.logW(TAG, "Error occurred in synchronous cameraForCoordinates: " + str + ", empty cameraState will be returned");
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().build();
        cameraOptionsBuild.getClass();
        return cameraOptionsBuild;
    }

    private final void drawLogo(Bitmap bitmap, Canvas canvas, int i, AttributionLayout attributionLayout) {
        Bitmap logo = attributionLayout.getLogo();
        if (logo != null) {
            canvas.drawBitmap(logo, i, (bitmap.getHeight() - logo.getHeight()) - i, (Paint) null);
        }
    }

    private final MapSnapshotter requireCoreSnapshotter() {
        MapSnapshotter mapSnapshotter = this.coreSnapshotter;
        if (mapSnapshotter != null) {
            return mapSnapshotter;
        }
        throw new SnapshotterDestroyedException();
    }

    public static /* synthetic */ void start$default(Snapshotter snapshotter, SnapshotOverlayCallback snapshotOverlayCallback, SnapshotResultCallback snapshotResultCallback, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                snapshotOverlayCallback = null;
            }
            snapshotter.start(snapshotOverlayCallback, snapshotResultCallback);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: start");
    }

    private final void drawAttribution(Canvas canvas, AttributionMeasure attributionMeasure, PointF pointF) {
        canvas.save();
        canvas.translate(pointF.x, pointF.y);
        attributionMeasure.getTextView().draw(canvas);
        canvas.restore();
    }

    public /* synthetic */ Snapshotter(WeakReference weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, mapSnapshotOptions, snapshotOverlayOptions, mapSnapshotter);
    }

    public /* synthetic */ Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            boolean z = false;
            snapshotOverlayOptions = new SnapshotOverlayOptions(z, z, 3, null);
        }
        this(context, mapSnapshotOptions, snapshotOverlayOptions);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Snapshotter(Context context, MapSnapshotOptions mapSnapshotOptions) {
        this(context, mapSnapshotOptions, (SnapshotOverlayOptions) null, 4, (DefaultConstructorMarker) null);
        context.getClass();
        mapSnapshotOptions.getClass();
    }

    private Snapshotter(WeakReference<Context> weakReference, MapSnapshotOptions mapSnapshotOptions, SnapshotOverlayOptions snapshotOverlayOptions, MapSnapshotter mapSnapshotter) {
        this.cancelableEvents = new ArrayList();
        this.context = weakReference;
        this.mapSnapshotOptions = mapSnapshotOptions;
        this.snapshotOverlayOptions = snapshotOverlayOptions;
        this.coreSnapshotter = mapSnapshotter;
        this.pixelRatio = 1.0f;
    }
}
