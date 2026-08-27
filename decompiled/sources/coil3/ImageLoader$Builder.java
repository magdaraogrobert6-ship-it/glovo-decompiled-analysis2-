package coil3;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import androidx.camera.view.PendingValue;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.lifecycle.ViewModel;
import androidx.sqlite.SQLite;
import bo.app.n5;
import coil3.memory.MemoryCacheService;
import coil3.util.ContextsKt;
import coil3.util.IntPair;
import coil3.util.UtilsKt;
import com.braze.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.Keyset;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.locationcomponent.LocationIndicatorLayerWrapper;
import com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.login.presentation.router.RouterActivity;
import io.sentry.MovePreviousSession;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import io.sentry.metrics.MetricsBatchProcessor;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import o.AndroidPaint;
import o.AndroidUiFrameClock;
import o.FocusOwnerImplWhenMappings;
import o.ImageHeaderParserImageType;
import o.ImageShaderF49vj9sdefault;
import o.LookaheadScopeKt;
import o.LookaheadScopeKtLookaheadScope221;
import o.MutableInteractionSourceImpl;
import o.OffsetCompanion;
import o.PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.ShortNewsContentCardView;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.accessandjd;
import o.accesscalculateAlignmentAndPlaceChildAsNeeded;
import o.accessgetExtendedTouchPaddingNHjbRcjd;
import o.accessgetHitDepthp;
import o.accessgetInstancedelegatecp;
import o.accessgetRgb565cp;
import o.accessgetSystemNavigationDowncp;
import o.accessisMainThread;
import o.accessorjd;
import o.accessplusjd;
import o.accesssetHitDepthp;
import o.addPathUv8p0NAdefault;
import o.area;
import o.c6;
import o.createImageBitmap;
import o.eotfFunclambda0;
import o.executedefault;
import o.generateEotflambda0;
import o.generateOetf;
import o.getAlignmentLinesMap;
import o.getColorIntegerOrNull;
import o.getCommaEK5gGoQ;
import o.getContentViewGroupParentLayout;
import o.getFilterQualityfv9h1I;
import o.getInfiniteF1C5BW0annotations;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getLookaheadDelegate;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.inCompatibilityMode;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isInBackStack;
import o.isSemanticsInvalidatedui;
import o.lastIndexOf;
import o.listIterator;
import o.logUnregisterActivity;
import o.mergeJsonObjects;
import o.minus;
import o.plusMKHz9U;
import o.premeasure0kLqBqw;
import o.processDragGesture;
import o.r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.requestOwnerFocusEtdf9zwdefault;
import o.requestRemeasureui;
import o.requestSingleLocationUpdateandroid_sdk_base_release;
import o.resolveUnregisterDisplayedMessagelambda0;
import o.saveInAppMessageForCarryoverOnUnregister;
import o.setLayoutModifierNodeui;
import o.setStrokeCapBeK7IIE;
import o.setStrokeMiterLimit;
import o.subscribeToChangeUserEventslambda30;
import o.toRegionOp7u2Bmg;
import o.transferSessionPackageI;
import o.unaryMinusF1C5BW0;
import o.widthInVpY3zN4default;
import okio.Options;
import okio.Path$Companion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ImageLoader$Builder implements widthInVpY3zN4default, r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34, LocationLayerRenderer {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;

    public void RemoteActionCompatParcelizer(r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A r8lambdaboxpaykq1hl7y9ngvej_riduf1a) {
        generateOetf generateoetf;
        synchronized (this) {
            ((HashMap) this.IconCompatParcelizer).remove(r8lambdaboxpaykq1hl7y9ngvej_riduf1a.read);
            if (r8lambdaboxpaykq1hl7y9ngvej_riduf1a.write && (generateoetf = r8lambdaboxpaykq1hl7y9ngvej_riduf1a.IconCompatParcelizer) != null) {
                ((area) this.serializer).IconCompatParcelizer(r8lambdaboxpaykq1hl7y9ngvej_riduf1a.read, new generateEotflambda0(generateoetf, true, false, r8lambdaboxpaykq1hl7y9ngvej_riduf1a.read, (area) this.serializer));
            }
        }
    }

    public void serializer(eotfFunclambda0 eotffunclambda0, generateEotflambda0 generateeotflambda0) {
        synchronized (this) {
            r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A r8lambdaboxpaykq1hl7y9ngvej_riduf1a = (r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A) ((HashMap) this.IconCompatParcelizer).put(eotffunclambda0, new r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A(eotffunclambda0, generateeotflambda0, (ReferenceQueue) this.read));
            if (r8lambdaboxpaykq1hl7y9ngvej_riduf1a != null) {
                r8lambdaboxpaykq1hl7y9ngvej_riduf1a.RemoteActionCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
    public ImageLoader$Builder(Typeface typeface, getInfiniteF1C5BW0annotations getinfinitef1c5bw0annotations) {
        int i;
        int i2;
        int i3;
        boolean z;
        OffsetCompanion offsetCompanion;
        int iRemoteActionCompatParcelizer;
        int i4;
        this.serializer = typeface;
        this.RemoteActionCompatParcelizer = getinfinitef1c5bw0annotations;
        this.read = new plusMKHz9U(Fields.RotationZ);
        int iRemoteActionCompatParcelizer2 = getinfinitef1c5bw0annotations.RemoteActionCompatParcelizer(6);
        if (iRemoteActionCompatParcelizer2 != 0) {
            int i5 = iRemoteActionCompatParcelizer2 + getinfinitef1c5bw0annotations.read;
            i = getinfinitef1c5bw0annotations.write.getInt(getinfinitef1c5bw0annotations.write.getInt(i5) + i5);
            int i6 = 2 % 2;
        } else {
            i = 0;
        }
        this.IconCompatParcelizer = new char[i * 2];
        int iRemoteActionCompatParcelizer3 = getinfinitef1c5bw0annotations.RemoteActionCompatParcelizer(6);
        if (iRemoteActionCompatParcelizer3 != 0) {
            int i7 = iRemoteActionCompatParcelizer3 + getinfinitef1c5bw0annotations.read;
            i2 = getinfinitef1c5bw0annotations.write.getInt(getinfinitef1c5bw0annotations.write.getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        int i8 = MediaSessionCompatQueueItem + 69;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 2 % 2;
        }
        for (int i10 = 0; i10 < i2; i10++) {
            unaryMinusF1C5BW0 unaryminusf1c5bw0 = new unaryMinusF1C5BW0(this, i10);
            OffsetCompanion offsetCompanion2 = unaryminusf1c5bw0.read();
            int iRemoteActionCompatParcelizer4 = offsetCompanion2.RemoteActionCompatParcelizer(4);
            if (iRemoteActionCompatParcelizer4 != 0) {
                i3 = offsetCompanion2.write.getInt(iRemoteActionCompatParcelizer4 + offsetCompanion2.read);
            } else {
                int i11 = MediaSessionCompatQueueItem + 51;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                i3 = 0;
            }
            Character.toChars(i3, (char[]) this.IconCompatParcelizer, i10 * 2);
            OffsetCompanion offsetCompanion3 = unaryminusf1c5bw0.read();
            int iRemoteActionCompatParcelizer5 = offsetCompanion3.RemoteActionCompatParcelizer(16);
            if (iRemoteActionCompatParcelizer5 != 0) {
                int i14 = MediaSessionCompatQueueItem + 47;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                int i16 = iRemoteActionCompatParcelizer5 + offsetCompanion3.read;
                if (offsetCompanion3.write.getInt(offsetCompanion3.write.getInt(i16) + i16) > 0) {
                    int i17 = MediaSessionCompatQueueItem + 69;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    z = true;
                }
                UtilsKt.IconCompatParcelizer("invalid metadata codepoint length", z);
                plusMKHz9U plusmkhz9u = (plusMKHz9U) this.read;
                offsetCompanion = unaryminusf1c5bw0.read();
                iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(16);
                if (iRemoteActionCompatParcelizer != 0) {
                    int i19 = iRemoteActionCompatParcelizer + offsetCompanion.read;
                    i4 = offsetCompanion.write.getInt(offsetCompanion.write.getInt(i19) + i19);
                } else {
                    i4 = 0;
                }
                plusmkhz9u.write(unaryminusf1c5bw0, 0, i4 - 1);
            } else {
                int i20 = 2 % 2;
            }
            int i21 = 2 % 2;
            z = false;
            UtilsKt.IconCompatParcelizer("invalid metadata codepoint length", z);
            plusMKHz9U plusmkhz9u2 = (plusMKHz9U) this.read;
            offsetCompanion = unaryminusf1c5bw0.read();
            iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(16);
            if (iRemoteActionCompatParcelizer != 0) {
                int i110 = iRemoteActionCompatParcelizer + offsetCompanion.read;
                i4 = offsetCompanion.write.getInt(offsetCompanion.write.getInt(i110) + i110);
            } else {
                i4 = 0;
            }
            plusmkhz9u2.write(unaryminusf1c5bw0, 0, i4 - 1);
        }
    }

    public void serializer(accessgetRgb565cp accessgetrgb565cp) {
        Runnable runnable;
        accessgetrgb565cp.getClass();
        synchronized (this.read) {
            runnable = (Runnable) ((LinkedHashMap) this.serializer).remove(accessgetrgb565cp);
        }
        if (runnable != null) {
            ((Handler) ((MemoryCacheService) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer).removeCallbacks(runnable);
        }
    }

    public ViewModel write(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, String str) {
        ViewModel viewModel;
        ViewModel viewModelSerializer;
        str.getClass();
        synchronized (((getIntentArrayWithConfiguredBackStacklambda4) this.serializer)) {
            getFilterQualityfv9h1I getfilterqualityfv9h1i = (getFilterQualityfv9h1I) this.RemoteActionCompatParcelizer;
            getfilterqualityfv9h1i.getClass();
            viewModel = (ViewModel) getfilterqualityfv9h1i.serializer.get(str);
            if (r8lambdaucgighn8fiyv_vccodeafjfpedk.read(viewModel)) {
                Object obj = (createImageBitmap) this.IconCompatParcelizer;
                if (obj instanceof AndroidPaint) {
                    viewModel.getClass();
                    ((AndroidPaint) obj).read(viewModel);
                }
                viewModel.getClass();
            } else {
                setStrokeMiterLimit setstrokemiterlimit = new setStrokeMiterLimit((setStrokeCapBeK7IIE) this.read);
                setstrokemiterlimit.read.put(toRegionOp7u2Bmg.IconCompatParcelizer, str);
                createImageBitmap createimagebitmap = (createImageBitmap) this.IconCompatParcelizer;
                createimagebitmap.getClass();
                try {
                    try {
                        viewModelSerializer = createimagebitmap.RemoteActionCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk, setstrokemiterlimit);
                    } catch (AbstractMethodError unused) {
                        viewModelSerializer = createimagebitmap.serializer(Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk));
                    }
                } catch (AbstractMethodError unused2) {
                    viewModelSerializer = createimagebitmap.serializer(Options.Companion.read(r8lambdaucgighn8fiyv_vccodeafjfpedk), setstrokemiterlimit);
                }
                viewModel = viewModelSerializer;
                getFilterQualityfv9h1I getfilterqualityfv9h1i2 = (getFilterQualityfv9h1I) this.RemoteActionCompatParcelizer;
                getfilterqualityfv9h1i2.getClass();
                viewModel.getClass();
                ViewModel viewModel2 = (ViewModel) getfilterqualityfv9h1i2.serializer.put(str, viewModel);
                if (viewModel2 != null) {
                    viewModel2.clear$lifecycle_viewmodel();
                }
            }
        }
        return viewModel;
    }

    public void write(accessgetRgb565cp accessgetrgb565cp) {
        accessgetrgb565cp.getClass();
        ND$$ExternalSyntheticLambda0 nD$$ExternalSyntheticLambda0 = new ND$$ExternalSyntheticLambda0(this, 5, accessgetrgb565cp);
        synchronized (this.read) {
        }
        ((Handler) ((MemoryCacheService) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer).postDelayed(nD$$ExternalSyntheticLambda0, 5400000L);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void addLayers(ProtobufEncoder protobufEncoder) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 77;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            protobufEncoder.addLayerToMap((LocationIndicatorLayerWrapper) this.read);
        } else {
            protobufEncoder.addLayerToMap((LocationIndicatorLayerWrapper) this.read);
            int i3 = 29 / 0;
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void updateStyle(Style style) {
        int i = 2 % 2;
        int i2 = write + 87;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = style;
            LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
            locationIndicatorLayerWrapper.getClass();
            locationIndicatorLayerWrapper.style = style;
            return;
        }
        this.serializer = style;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper2 = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper2.getClass();
        locationIndicatorLayerWrapper2.style = style;
        int i3 = 97 / 0;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public boolean isRendererInitialised() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 51;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.serializer;
        if (mapboxStyleManager == null) {
            return false;
        }
        boolean zStyleLayerExists = mapboxStyleManager.styleLayerExists("mapbox-location-indicator-layer");
        int i3 = write + 51;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zStyleLayerExists;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void removeLayers() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.serializer;
        if (mapboxStyleManager != null) {
            int i5 = i3 + 1;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                mapboxStyleManager.removeStyleLayer(((LocationIndicatorLayerWrapper) this.read).layerId);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            mapboxStyleManager.removeStyleLayer(((LocationIndicatorLayerWrapper) this.read).layerId);
        }
        int i6 = MediaSessionCompatQueueItem + 121;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setBearing(double d) {
        int i = 2 % 2;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty("bearing", new Value(d));
        int i2 = write + 123;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setAccuracyRadius(float f) {
        int i = 2 % 2;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty("accuracy-radius", new Value(f));
        int i2 = MediaSessionCompatQueueItem + 31;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void hide() {
        int i = 2 % 2;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty(RemoteMessageConst.Notification.VISIBILITY, new Value("none"));
        int i2 = MediaSessionCompatQueueItem + 41;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void show() {
        int i = 2 % 2;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty(RemoteMessageConst.Notification.VISIBILITY, new Value("visible"));
        int i2 = MediaSessionCompatQueueItem + 121;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void slot(String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 47;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        if (str == null) {
            int i4 = MediaSessionCompatQueueItem + 19;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str = "";
        }
        locationIndicatorLayerWrapper.updateProperty("slot", new Value(str));
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void styleScaling(Value value) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
            locationIndicatorLayerWrapper.getClass();
            locationIndicatorLayerWrapper.updateProperty("shadow-image-size", value);
            locationIndicatorLayerWrapper.updateProperty("bearing-image-size", value);
            locationIndicatorLayerWrapper.updateProperty("top-image-size", value);
            throw null;
        }
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper2 = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper2.getClass();
        locationIndicatorLayerWrapper2.updateProperty("shadow-image-size", value);
        locationIndicatorLayerWrapper2.updateProperty("bearing-image-size", value);
        locationIndicatorLayerWrapper2.updateProperty("top-image-size", value);
        int i3 = MediaSessionCompatQueueItem + 81;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r1
  0x001f: PHI (r1v6 com.mapbox.maps.MapboxStyleManager) = (r1v5 com.mapbox.maps.MapboxStyleManager), (r1v21 com.mapbox.maps.MapboxStyleManager) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void clearBitmaps() {
        MapboxStyleManager mapboxStyleManager;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 91;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            mapboxStyleManager = (MapboxStyleManager) this.serializer;
            int i3 = 60 / 0;
            if (mapboxStyleManager != null) {
                mapboxStyleManager.removeStyleImage("mapbox-location-top-icon");
                int i4 = write + 45;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            mapboxStyleManager = (MapboxStyleManager) this.serializer;
            if (mapboxStyleManager != null) {
                mapboxStyleManager.removeStyleImage("mapbox-location-top-icon");
                int i6 = write + 45;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
        }
        MapboxStyleManager mapboxStyleManager2 = (MapboxStyleManager) this.serializer;
        if (mapboxStyleManager2 != null) {
            int i8 = write + 13;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            mapboxStyleManager2.removeStyleImage("mapbox-location-bearing-icon");
        }
        MapboxStyleManager mapboxStyleManager3 = (MapboxStyleManager) this.serializer;
        if (mapboxStyleManager3 != null) {
            int i10 = write + 9;
            MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            mapboxStyleManager3.removeStyleImage("mapbox-location-shadow-icon");
            int i12 = write + 11;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        int i14 = write + 65;
        MediaSessionCompatQueueItem = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
    }

    @Override // o.size3ABfNKs
    public long RemoteActionCompatParcelizer(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer();
        int i2 = write + 29;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 4 / 3;
        }
        long jMax = 0;
        for (int i4 = 0; i4 < iIconCompatParcelizer; i4++) {
            jMax = Math.max(jMax, ((PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1) this.RemoteActionCompatParcelizer).write(i4).read(transformGestureDetectorKtdetectTransformGestures2.write(i4), transformGestureDetectorKtdetectTransformGestures3.write(i4), transformGestureDetectorKtdetectTransformGestures4.write(i4)));
        }
        int i5 = write + 39;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return jMax;
        }
        throw null;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void styleAccuracy(int i, int i2) {
        int i3 = 2 % 2;
        float[] fArrColorToRgbaArray = ContextsKt.colorToRgbaArray(i);
        float[] fArrColorToRgbaArray2 = ContextsKt.colorToRgbaArray(i2);
        ArrayList arrayListBuildRGBAExpression = ContextsKt.buildRGBAExpression(fArrColorToRgbaArray);
        ArrayList arrayListBuildRGBAExpression2 = ContextsKt.buildRGBAExpression(fArrColorToRgbaArray2);
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty("accuracy-radius-color", new Value((List<Value>) arrayListBuildRGBAExpression));
        locationIndicatorLayerWrapper.updateProperty("accuracy-radius-border-color", new Value((List<Value>) arrayListBuildRGBAExpression2));
        int i4 = write + 53;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void updatePulsingUi(int i, float f, Float f2) {
        int i2 = 2 % 2;
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        float[] fArrColorToRgbaArray = ContextsKt.colorToRgbaArray(i);
        fArrColorToRgbaArray[3] = f2.floatValue();
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty("emphasis-circle-radius", new Value(f));
        locationIndicatorLayerWrapper.updateProperty("emphasis-circle-color", new Value((List<Value>) ContextsKt.buildRGBAExpression(fArrColorToRgbaArray)));
        int i3 = MediaSessionCompatQueueItem + 23;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public void IconCompatParcelizer(Object obj, ArrayList arrayList, HashSet hashSet) {
        int i = 2 % 2;
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((processDragGesture) this.IconCompatParcelizer).get(obj);
        if (arrayList2 != null) {
            int i2 = MediaSessionCompatQueueItem + 29;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = write + 113;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                IconCompatParcelizer(arrayList2.get(i4), arrayList, hashSet);
                i4++;
                int i7 = write + 95;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void read(requestOwnerFocusEtdf9zwdefault requestownerfocusetdf9zwdefault) throws Throwable {
        int i = 2 % 2;
        Object objB_ = ((BufferedChannel) this.read).b_(requestownerfocusetdf9zwdefault);
        if (objB_ instanceof saveInAppMessageForCarryoverOnUnregister) {
            Throwable thWrite = logUnregisterActivity.write(objB_);
            if (thWrite != null) {
                throw thWrite;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (objB_ instanceof resolveUnregisterDisplayedMessagelambda0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            int i2 = write + 75;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (((AtomicInteger) this.serializer).getAndIncrement() == 0) {
            BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer, null, null, new SimpleActor$offer$2(this, shortNewsContentCardView, 0), 3);
            int i3 = write + 37;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 write(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 7;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (((TransformGestureDetectorKtdetectTransformGestures2) this.serializer) == null) {
            this.serializer = transformGestureDetectorKtdetectTransformGestures4.RemoteActionCompatParcelizer();
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = (TransformGestureDetectorKtdetectTransformGestures2) this.serializer;
        if (transformGestureDetectorKtdetectTransformGestures5 == null) {
            removeNodeAtDepth.serializer("endVelocityVector");
            throw null;
        }
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures5.IconCompatParcelizer();
        int i3 = 0;
        while (true) {
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures6 = (TransformGestureDetectorKtdetectTransformGestures2) this.serializer;
            if (i3 >= iIconCompatParcelizer) {
                if (transformGestureDetectorKtdetectTransformGestures6 == null) {
                    removeNodeAtDepth.serializer("endVelocityVector");
                    throw null;
                }
                int i4 = MediaSessionCompatQueueItem + 1;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 75 / 0;
                }
                return transformGestureDetectorKtdetectTransformGestures6;
            }
            if (transformGestureDetectorKtdetectTransformGestures6 == null) {
                removeNodeAtDepth.serializer("endVelocityVector");
                throw null;
            }
            transformGestureDetectorKtdetectTransformGestures6.write(((PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1) this.RemoteActionCompatParcelizer).write(i3).IconCompatParcelizer(transformGestureDetectorKtdetectTransformGestures2.write(i3), transformGestureDetectorKtdetectTransformGestures3.write(i3), transformGestureDetectorKtdetectTransformGestures4.write(i3)), i3);
            i3++;
            int i6 = MediaSessionCompatQueueItem + 19;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void initializeComponents(MapboxStyleManager mapboxStyleManager) {
        int i = 2 % 2;
        mapboxStyleManager.getClass();
        this.serializer = mapboxStyleManager;
        LocationPuck2D locationPuck2D = (LocationPuck2D) this.RemoteActionCompatParcelizer;
        addImageToStyle(mapboxStyleManager, "mapbox-location-top-icon", locationPuck2D.topImage);
        addImageToStyle(mapboxStyleManager, "mapbox-location-bearing-icon", locationPuck2D.bearingImage);
        addImageToStyle(mapboxStyleManager, "mapbox-location-shadow-icon", locationPuck2D.shadowImage);
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        locationIndicatorLayerWrapper.updateProperty("top-image", new Value("mapbox-location-top-icon"));
        locationIndicatorLayerWrapper.updateProperty("bearing-image", new Value("mapbox-location-bearing-icon"));
        locationIndicatorLayerWrapper.updateProperty("shadow-image", new Value("mapbox-location-shadow-icon"));
        locationIndicatorLayerWrapper.updateProperty("location-indicator-opacity", new Value(locationPuck2D.opacity));
        int i2 = MediaSessionCompatQueueItem + 17;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 read(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        if (((TransformGestureDetectorKtdetectTransformGestures2) this.read) == null) {
            int i2 = write + 21;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.read = transformGestureDetectorKtdetectTransformGestures4.RemoteActionCompatParcelizer();
                throw null;
            }
            this.read = transformGestureDetectorKtdetectTransformGestures4.RemoteActionCompatParcelizer();
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = (TransformGestureDetectorKtdetectTransformGestures2) this.read;
        if (transformGestureDetectorKtdetectTransformGestures5 == null) {
            removeNodeAtDepth.serializer("velocityVector");
            throw null;
        }
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures5.IconCompatParcelizer();
        int i3 = 0;
        while (true) {
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures6 = (TransformGestureDetectorKtdetectTransformGestures2) this.read;
            if (i3 >= iIconCompatParcelizer) {
                if (transformGestureDetectorKtdetectTransformGestures6 == null) {
                    removeNodeAtDepth.serializer("velocityVector");
                    throw null;
                }
                int i4 = write + 123;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return transformGestureDetectorKtdetectTransformGestures6;
            }
            if (transformGestureDetectorKtdetectTransformGestures6 == null) {
                removeNodeAtDepth.serializer("velocityVector");
                throw null;
            }
            transformGestureDetectorKtdetectTransformGestures6.write(((PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1) this.RemoteActionCompatParcelizer).write(i3).getVelocityFromNanos(j, transformGestureDetectorKtdetectTransformGestures2.write(i3), transformGestureDetectorKtdetectTransformGestures3.write(i3), transformGestureDetectorKtdetectTransformGestures4.write(i3)), i3);
            i3++;
        }
    }

    @Override // o.size3ABfNKs
    public TransformGestureDetectorKtdetectTransformGestures2 serializer(long j, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures3, TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures4) {
        int i = 2 % 2;
        if (((TransformGestureDetectorKtdetectTransformGestures2) this.IconCompatParcelizer) == null) {
            this.IconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.RemoteActionCompatParcelizer();
        }
        TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures5 = (TransformGestureDetectorKtdetectTransformGestures2) this.IconCompatParcelizer;
        if (transformGestureDetectorKtdetectTransformGestures5 == null) {
            removeNodeAtDepth.serializer("valueVector");
            throw null;
        }
        int i2 = MediaSessionCompatQueueItem + 113;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures5.IconCompatParcelizer();
        int i4 = 0;
        while (true) {
            TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures6 = (TransformGestureDetectorKtdetectTransformGestures2) this.IconCompatParcelizer;
            if (i4 >= iIconCompatParcelizer) {
                if (transformGestureDetectorKtdetectTransformGestures6 == null) {
                    removeNodeAtDepth.serializer("valueVector");
                    throw null;
                }
                int i5 = MediaSessionCompatQueueItem + 23;
                int i6 = i5 % Fields.SpotShadowColor;
                write = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 93;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    return transformGestureDetectorKtdetectTransformGestures6;
                }
                throw null;
            }
            int i9 = MediaSessionCompatQueueItem;
            int i10 = i9 + 21;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (transformGestureDetectorKtdetectTransformGestures6 == null) {
                removeNodeAtDepth.serializer("valueVector");
                throw null;
            }
            int i12 = i9 + 5;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            transformGestureDetectorKtdetectTransformGestures6.write(((PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1) this.RemoteActionCompatParcelizer).write(i4).getValueFromNanos(j, transformGestureDetectorKtdetectTransformGestures2.write(i4), transformGestureDetectorKtdetectTransformGestures3.write(i4), transformGestureDetectorKtdetectTransformGestures4.write(i4)), i4);
            i4++;
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationLayerRenderer
    public void setLatLng(Point point) {
        int i = 2 % 2;
        point.getClass();
        List list = SQLite.read(Double.valueOf(point.latitude()), Double.valueOf(point.longitude()), Double.valueOf(0.0d));
        LocationIndicatorLayerWrapper locationIndicatorLayerWrapper = (LocationIndicatorLayerWrapper) this.read;
        locationIndicatorLayerWrapper.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        locationIndicatorLayerWrapper.updateProperty("location", new Value((List<Value>) arrayList));
        int i2 = MediaSessionCompatQueueItem + 87;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
    }

    public RealImageLoader IconCompatParcelizer() {
        int i = 2 % 2;
        Context context = (Context) this.RemoteActionCompatParcelizer;
        ImageShaderF49vj9sdefault imageShaderF49vj9sdefault = (ImageShaderF49vj9sdefault) this.IconCompatParcelizer;
        accessorjd accessorjdVar = (accessorjd) this.serializer;
        accessorjdVar.getClass();
        ImageShaderF49vj9sdefault imageShaderF49vj9sdefaultSerializer = ImageShaderF49vj9sdefault.serializer(imageShaderF49vj9sdefault, null, null, new accessplusjd(DelayKt.write(accessorjdVar.serializer)), 8191);
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new minus(1));
        isAdapterPositionOnScreen isadapterpositiononscreen2 = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(0, this));
        isAdapterPositionOnScreen isadapterpositiononscreen3 = new isAdapterPositionOnScreen(new minus(2));
        accessandjd accessandjdVar = (accessandjd) this.read;
        if (accessandjdVar == null) {
            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
            accessandjdVar = new accessandjd(instance_delegatelambda0Var, instance_delegatelambda0Var, instance_delegatelambda0Var, instance_delegatelambda0Var, instance_delegatelambda0Var);
            int i2 = write + 115;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        return new RealImageLoader(new addPathUv8p0NAdefault(context, imageShaderF49vj9sdefaultSerializer, isadapterpositiononscreen, isadapterpositiononscreen2, isadapterpositiononscreen3, accessandjdVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r3 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r3 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r7 = coil3.ImageLoader$Builder.write + 117;
        coil3.ImageLoader$Builder.MediaSessionCompatQueueItem = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$updateSelectedPaymentOption(coil3.ImageLoader$Builder r7, o.AndroidDialog_androidKtDialog3 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r9 instanceof o.getTrimLastLineBottom
            if (r1 == 0) goto L16
            r1 = r9
            o.getTrimLastLineBottom r1 = (o.getTrimLastLineBottom) r1
            int r2 = r1.serializer
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 + r3
            r1.serializer = r2
            goto L1b
        L16:
            o.getTrimLastLineBottom r1 = new o.getTrimLastLineBottom
            r1.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r1.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.serializer
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 == r4) goto L30
            if (r3 != r0) goto L2a
            goto L30
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r5
        L30:
            o.AndroidDialog_androidKtDialog3 r7 = r1.read
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            return r7
        L36:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            if (r8 == 0) goto L47
            int r9 = coil3.ImageLoader$Builder.MediaSessionCompatQueueItem
            int r9 = r9 + 101
            int r3 = r9 % 128
            coil3.ImageLoader$Builder.write = r3
            int r9 = r9 % r0
            o.AndroidDialog_androidKtDialogLayout2 r9 = r8.paymentOptions
            goto L48
        L47:
            r9 = r5
        L48:
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            if (r9 != 0) goto L86
            int r9 = coil3.ImageLoader$Builder.write
            int r9 = r9 + 53
            int r6 = r9 % 128
            coil3.ImageLoader$Builder.MediaSessionCompatQueueItem = r6
            int r9 = r9 % r0
            if (r9 != 0) goto L6a
            java.lang.Object r7 = r7.serializer
            o.getModelzQqcRY r7 = (o.getModelzQqcRY) r7
            r1.read = r8
            r9 = 0
            r1.serializer = r9
            o.getLastDescentDiff r7 = r7.write
            java.util.concurrent.atomic.AtomicReference r7 = r7.RemoteActionCompatParcelizer
            r7.set(r5)
            if (r3 != r2) goto L7c
            goto La4
        L6a:
            java.lang.Object r7 = r7.serializer
            o.getModelzQqcRY r7 = (o.getModelzQqcRY) r7
            r1.read = r8
            r1.serializer = r4
            o.getLastDescentDiff r7 = r7.write
            java.util.concurrent.atomic.AtomicReference r7 = r7.RemoteActionCompatParcelizer
            r7.set(r5)
            if (r3 != r2) goto L7c
            goto La4
        L7c:
            int r7 = coil3.ImageLoader$Builder.write
            int r7 = r7 + 117
            int r9 = r7 % 128
            coil3.ImageLoader$Builder.MediaSessionCompatQueueItem = r9
            int r7 = r7 % r0
            return r8
        L86:
            o.AndroidDialog_androidKtDialogLayout2 r9 = r8.paymentOptions
            if (r9 == 0) goto L8e
            java.lang.String r5 = r9.RemoteActionCompatParcelizer()
        L8e:
            if (r5 == 0) goto La5
            java.lang.Object r7 = r7.IconCompatParcelizer
            com.roadrunner.delivery.accept.payatpickup.implementation.domain.StoreSelectedPaymentOption r7 = (com.roadrunner.delivery.accept.payatpickup.implementation.domain.StoreSelectedPaymentOption) r7
            o.LineHeightStyleSpan r9 = o.LineHeightStyleSpan.read
            o.copyui_textdefault r4 = new o.copyui_textdefault
            r4.<init>(r5, r9)
            r1.read = r8
            r1.serializer = r0
            r7.invoke(r4)
            if (r3 != r2) goto La5
        La4:
            return r2
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ImageLoader$Builder.access$updateSelectedPaymentOption(coil3.ImageLoader$Builder, o.AndroidDialog_androidKtDialog3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public void inject(Object obj) {
        int i = 2 % 2;
        RouterActivity routerActivity = (RouterActivity) obj;
        routerActivity.ParcelableVolumeInfo = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isInBackStack) this.IconCompatParcelizer);
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = (getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION) this.RemoteActionCompatParcelizer;
        routerActivity.RatingCompat = (c6) getstyleable_vector_drawable_group_rotation.getCurrentContentInsetEnd.write();
        routerActivity.read = new r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY((isInBackStack) this.read);
        routerActivity.MediaSessionCompatQueueItem = new AndroidUiFrameClock(new accessisMainThread());
        routerActivity.MediaSessionCompatResultReceiverWrapper = getstyleable_vector_drawable_group_rotation.addOnPictureInPictureModeChangedListener();
        routerActivity.MediaDescriptionCompat = (ShouldShowHeatmap_Factory) this.serializer;
        routerActivity.RemoteActionCompatParcelizer = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        routerActivity.write = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
        routerActivity.MediaBrowserCompatMediaItem = new ImageHeaderParserImageType(new accessisMainThread(), new Path$Companion());
        routerActivity.MediaMetadataCompat = (requestSingleLocationUpdateandroid_sdk_base_release) getstyleable_vector_drawable_group_rotation.AppCompatSpinnerSavedState1.write;
        routerActivity.serializer = new inCompatibilityMode();
        routerActivity.IconCompatParcelizer = (SemanticsOwnerKt) getstyleable_vector_drawable_group_rotation.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
        routerActivity.PlaybackStateCompatCustomAction = getColorIntegerOrNull.serializer((mergeJsonObjects) subscribeToChangeUserEventslambda30.serializer);
        routerActivity.MediaSessionCompatToken = new executedefault((SemanticsOwner) getstyleable_vector_drawable_group_rotation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write());
        int iIconCompatParcelizer = n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
        routerActivity.PlaybackStateCompat = (TraceTimeMeasurementWithPerformanceKit) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(1568881057, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -1568881038, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2);
        int i2 = write + 43;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    public void addImageToStyle(MapboxStyleManager mapboxStyleManager, String str, ImageHolder imageHolder) {
        Integer drawableId;
        Bitmap bitmap;
        int i = 2 % 2;
        if (imageHolder != null) {
            int i2 = MediaSessionCompatQueueItem + 123;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Bitmap bitmap2 = imageHolder.getBitmap();
            if (bitmap2 != null) {
                mapboxStyleManager.addImage(str, bitmap2);
                return;
            }
        }
        Context context = (Context) ((WeakReference) this.IconCompatParcelizer).get();
        if (context == null) {
            MapboxLogger.logE("LocationPuck2D", "Could not set 2D puck image as drawable for " + str + " because there is no Android Context!");
            return;
        }
        int i4 = MediaSessionCompatQueueItem + 51;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (imageHolder != null && (drawableId = imageHolder.getDrawableId()) != null) {
            Drawable drawableWrite = IntPair.write(context, drawableId.intValue());
            if (drawableWrite == null) {
                bitmap = null;
            } else if (drawableWrite instanceof BitmapDrawable) {
                int i5 = write + 45;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    bitmap = ((BitmapDrawable) drawableWrite).getBitmap();
                    int i6 = 49 / 0;
                } else {
                    bitmap = ((BitmapDrawable) drawableWrite).getBitmap();
                }
            } else {
                Drawable.ConstantState constantState = drawableWrite.getConstantState();
                if (constantState == null) {
                    bitmap = null;
                } else {
                    Drawable drawableMutate = constantState.newDrawable().mutate();
                    drawableMutate.getClass();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableMutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawableMutate.draw(canvas);
                    bitmap = bitmapCreateBitmap;
                }
            }
            if ((bitmap != null ? mapboxStyleManager.addImage(str, bitmap) : null) != null) {
                return;
            }
        }
        MapboxLogger.logE("LocationPuck2D", "No image holder data for " + str + '!');
    }

    public ImageLoader$Builder(LookaheadScopeKt lookaheadScopeKt, String str) {
        this.serializer = lookaheadScopeKt;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = new Bundle();
    }

    public ImageLoader$Builder(getFilterQualityfv9h1I getfilterqualityfv9h1i, createImageBitmap createimagebitmap, setStrokeCapBeK7IIE setstrokecapbek7iie) {
        getfilterqualityfv9h1i.getClass();
        createimagebitmap.getClass();
        setstrokecapbek7iie.getClass();
        this.RemoteActionCompatParcelizer = getfilterqualityfv9h1i;
        this.IconCompatParcelizer = createimagebitmap;
        this.read = setstrokecapbek7iie;
        this.serializer = new getIntentArrayWithConfiguredBackStacklambda4(3);
    }

    public ImageLoader$Builder(int i) {
        if (i == 8) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new getCommaEK5gGoQ(1));
            this.IconCompatParcelizer = new HashMap();
            this.read = new ReferenceQueue();
            this.RemoteActionCompatParcelizer = executorServiceNewSingleThreadExecutor;
            executorServiceNewSingleThreadExecutor.execute(new MovePreviousSession(5, this));
            return;
        }
        if (i != 15) {
            this.RemoteActionCompatParcelizer = new FocusOwnerImplWhenMappings(10);
            this.IconCompatParcelizer = new processDragGesture(0);
            this.read = new ArrayList();
            this.serializer = new HashSet();
            return;
        }
        this.RemoteActionCompatParcelizer = new HashMap();
        this.IconCompatParcelizer = new HashMap();
        this.read = new HashMap();
        this.serializer = new HashMap();
    }

    public ImageLoader$Builder(accesscalculateAlignmentAndPlaceChildAsNeeded accesscalculatealignmentandplacechildasneeded) {
        this.RemoteActionCompatParcelizer = new HashMap(accesscalculatealignmentandplacechildasneeded.write);
        this.IconCompatParcelizer = new HashMap(accesscalculatealignmentandplacechildasneeded.serializer);
        this.read = new HashMap(accesscalculatealignmentandplacechildasneeded.read);
        this.serializer = new HashMap(accesscalculatealignmentandplacechildasneeded.IconCompatParcelizer);
    }

    public /* synthetic */ ImageLoader$Builder(Object obj, Object obj2, Object obj3, Object obj4) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = obj3;
        this.serializer = obj4;
    }

    public ImageLoader$Builder(Context context) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
        this.IconCompatParcelizer = ImageShaderF49vj9sdefault.write;
        this.read = null;
        this.serializer = new accessorjd();
    }

    public ImageLoader$Builder(PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1 pagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1) {
        this.RemoteActionCompatParcelizer = pagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1;
    }

    public ImageLoader$Builder(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this(new PendingValue(14, mutableInteractionSourceImpl));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[PHI: r2
  0x0056: PHI (r2v9 java.util.concurrent.ConcurrentHashMap) = (r2v8 java.util.concurrent.ConcurrentHashMap), (r2v21 java.util.concurrent.ConcurrentHashMap) binds: [B:17:0x0054, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public void IconCompatParcelizer(Object obj, Object obj2, Keyset.Key key, boolean z) throws GeneralSecurityException {
        ConcurrentHashMap concurrentHashMap;
        Integer numValueOf;
        byte[] bArrArray;
        byte[] bArrCopyOf;
        int i = 2 % 2;
        if (((ConcurrentHashMap) this.IconCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("addPrimitive cannot be called after build");
            return;
        }
        if (obj == null && obj2 == null) {
            getAlignmentLinesMap.write("at least one of the `fullPrimitive` or `primitive` must be set");
            return;
        }
        if (key.MediaDescriptionCompat() != isSemanticsInvalidatedui.ENABLED) {
            getAlignmentLinesMap.write("only ENABLED key is allowed");
            return;
        }
        int i2 = MediaSessionCompatQueueItem + 41;
        write = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 != 0) {
            concurrentHashMap = (ConcurrentHashMap) this.IconCompatParcelizer;
            numValueOf = Integer.valueOf(key.serializer());
            int i3 = 76 / 0;
            if (key.MediaMetadataCompat() == requestRemeasureui.RAW) {
                int i4 = write + 13;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                numValueOf = null;
            }
        } else {
            concurrentHashMap = (ConcurrentHashMap) this.IconCompatParcelizer;
            numValueOf = Integer.valueOf(key.serializer());
            if (key.MediaMetadataCompat() == requestRemeasureui.RAW) {
                int i6 = write + 13;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                numValueOf = null;
            }
        }
        removeNodeAtDepth removenodeatdepthRemoteActionCompatParcelizer = setLayoutModifierNodeui.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(MetricsBatchProcessor.IconCompatParcelizer(key.RemoteActionCompatParcelizer().RatingCompat(), key.RemoteActionCompatParcelizer().MediaMetadataCompat(), key.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(), key.MediaMetadataCompat(), numValueOf));
        int i8 = accesssetHitDepthp.IconCompatParcelizer[key.MediaMetadataCompat().ordinal()];
        if (i8 == 1 || i8 == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(key.serializer()).array();
        } else if (i8 != 3) {
            int i9 = MediaSessionCompatQueueItem + 15;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0 ? i8 != 4 : i8 != 3) {
                getAlignmentLinesMap.write("unknown output prefix type");
                return;
            }
            bArrArray = accessgetHitDepthp.serializer;
        } else {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(key.serializer()).array();
        }
        listIterator listiterator = new listIterator(obj, obj2, bArrArray, key.MediaDescriptionCompat(), key.MediaMetadataCompat(), key.serializer(), key.RemoteActionCompatParcelizer().RatingCompat(), removenodeatdepthRemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        arrayList.add(listiterator);
        byte[] bArr = listiterator.serializer;
        if (bArr == null) {
            int i10 = MediaSessionCompatQueueItem + 9;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                throw null;
            }
            bArrCopyOf = null;
        } else {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        lastIndexOf lastindexof = new lastIndexOf(bArrCopyOf);
        List list = (List) concurrentHashMap.put(lastindexof, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(listiterator);
            concurrentHashMap.put(lastindexof, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            int i11 = MediaSessionCompatQueueItem + 67;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            if (((listIterator) this.read) == null) {
                this.read = listiterator;
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("you cannot set two primary primitives");
        }
        int i12 = write + 37;
        MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab A[Catch: JSONException -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd A[Catch: JSONException -> 0x0165, TRY_ENTER, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb A[Catch: JSONException -> 0x0165, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[Catch: JSONException -> 0x0165, TRY_ENTER, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[Catch: JSONException -> 0x0165, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5 A[Catch: JSONException -> 0x0165, TRY_ENTER, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110 A[Catch: JSONException -> 0x0165, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0165, blocks: (B:21:0x0092, B:29:0x00ab, B:31:0x00b7, B:36:0x00bd, B:38:0x00cb, B:42:0x00d9, B:43:0x00e4, B:45:0x00ef, B:46:0x00f2, B:49:0x00f5, B:52:0x0101, B:53:0x0110, B:25:0x009d), top: B:98:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122 A[Catch: JSONException -> 0x019e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {JSONException -> 0x019e, blocks: (B:80:0x018b, B:57:0x0122, B:59:0x0130, B:64:0x0136, B:65:0x0143, B:67:0x014b, B:68:0x015a, B:71:0x0169, B:73:0x0178, B:74:0x017c, B:76:0x0180, B:77:0x0184, B:79:0x0188, B:81:0x018f), top: B:101:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0136 A[Catch: JSONException -> 0x019e, TRY_ENTER, TryCatch #4 {JSONException -> 0x019e, blocks: (B:80:0x018b, B:57:0x0122, B:59:0x0130, B:64:0x0136, B:65:0x0143, B:67:0x014b, B:68:0x015a, B:71:0x0169, B:73:0x0178, B:74:0x017c, B:76:0x0180, B:77:0x0184, B:79:0x0188, B:81:0x018f), top: B:101:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0143 A[Catch: JSONException -> 0x019e, TryCatch #4 {JSONException -> 0x019e, blocks: (B:80:0x018b, B:57:0x0122, B:59:0x0130, B:64:0x0136, B:65:0x0143, B:67:0x014b, B:68:0x015a, B:71:0x0169, B:73:0x0178, B:74:0x017c, B:76:0x0180, B:77:0x0184, B:79:0x0188, B:81:0x018f), top: B:101:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x014b A[Catch: JSONException -> 0x019e, TryCatch #4 {JSONException -> 0x019e, blocks: (B:80:0x018b, B:57:0x0122, B:59:0x0130, B:64:0x0136, B:65:0x0143, B:67:0x014b, B:68:0x015a, B:71:0x0169, B:73:0x0178, B:74:0x017c, B:76:0x0180, B:77:0x0184, B:79:0x0188, B:81:0x018f), top: B:101:0x018b }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a A[Catch: JSONException -> 0x019e, TryCatch #4 {JSONException -> 0x019e, blocks: (B:80:0x018b, B:57:0x0122, B:59:0x0130, B:64:0x0136, B:65:0x0143, B:67:0x014b, B:68:0x015a, B:71:0x0169, B:73:0x0178, B:74:0x017c, B:76:0x0180, B:77:0x0184, B:79:0x0188, B:81:0x018f), top: B:101:0x018b }] */
    public void serializer(Bundle bundle) {
        char c;
        Iterator<String> it;
        int i;
        int i2;
        int i3;
        char c2 = 2;
        int i4 = 2 % 2;
        int i5 = write + 77;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        String str = null;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LookaheadScopeKt lookaheadScopeKt = (LookaheadScopeKt) this.serializer;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesSerializer = lookaheadScopeKt.serializer();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        SharedPreferences.Editor editorEdit = sharedPreferencesSerializer.edit();
        int size = bundle2.size();
        String str2 = (String) this.RemoteActionCompatParcelizer;
        if (size == 0) {
            editorEdit.remove(str2);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj2 = bundle2.get(next);
                if (obj2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, next);
                        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                        if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(str, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                            int i6 = write + 79;
                            it = it2;
                            int i7 = i6 % Fields.SpotShadowColor;
                            MediaSessionCompatQueueItem = i7;
                            if (i6 % 2 == 0) {
                                try {
                                    int i8 = 16 / 0;
                                    try {
                                        if (!(!(obj2 instanceof String))) {
                                            i3 = i7 + 59;
                                            write = i3 % Fields.SpotShadowColor;
                                            if (i3 % 2 != 0) {
                                                jSONObject.put("v", obj2.toString());
                                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                                                int i9 = 23 / 0;
                                            } else {
                                                jSONObject.put("v", obj2.toString());
                                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                                            }
                                        } else if (obj2 instanceof Long) {
                                            i2 = i7 + 53;
                                            write = i2 % Fields.SpotShadowColor;
                                            if (i2 % 2 == 0) {
                                                jSONObject.put("v", obj2.toString());
                                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                                                Object obj3 = null;
                                                obj3.hashCode();
                                                throw null;
                                            }
                                            jSONObject.put("v", obj2.toString());
                                            jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                                        } else if (obj2 instanceof int[]) {
                                            int i10 = i7 + 109;
                                            write = i10 % Fields.SpotShadowColor;
                                            int i11 = i10 % 2;
                                            jSONObject.put("v", Arrays.toString((int[]) obj2));
                                            jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "ia");
                                        } else {
                                            if (obj2 instanceof long[]) {
                                                i = i7 + 103;
                                                write = i % Fields.SpotShadowColor;
                                                c = 2;
                                                if (i % 2 != 0) {
                                                    jSONObject.put("v", Arrays.toString((long[]) obj2));
                                                    jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "la");
                                                    int i12 = 21 / 0;
                                                } else {
                                                    jSONObject.put("v", Arrays.toString((long[]) obj2));
                                                    jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "la");
                                                }
                                            } else {
                                                c = 2;
                                                if (!(obj2 instanceof Double)) {
                                                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                    getlookaheaddelegate.serializer.serializer(obj2.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                                } else {
                                                    jSONObject.put("v", obj2.toString());
                                                    jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                                                }
                                            }
                                            jSONArray.put(jSONObject);
                                        }
                                        jSONArray.put(jSONObject);
                                    } catch (JSONException e) {
                                        e = e;
                                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                        getlookaheaddelegate2.serializer.serializer(e, "Cannot serialize bundle value to SharedPreferences");
                                    }
                                    c = 2;
                                } catch (JSONException e2) {
                                    e = e2;
                                    c = 2;
                                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                    getlookaheaddelegate3.serializer.serializer(e, "Cannot serialize bundle value to SharedPreferences");
                                    it2 = it;
                                    c2 = c;
                                    str = null;
                                }
                            } else {
                                if (obj2 instanceof String) {
                                    i3 = i7 + 59;
                                    write = i3 % Fields.SpotShadowColor;
                                    if (i3 % 2 != 0) {
                                        jSONObject.put("v", obj2.toString());
                                        jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                                        int i13 = 23 / 0;
                                    } else {
                                        jSONObject.put("v", obj2.toString());
                                        jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                                    }
                                } else if (obj2 instanceof Long) {
                                    i2 = i7 + 53;
                                    write = i2 % Fields.SpotShadowColor;
                                    if (i2 % 2 == 0) {
                                        jSONObject.put("v", obj2.toString());
                                        jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                                        Object obj4 = null;
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    jSONObject.put("v", obj2.toString());
                                    jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                                } else if (obj2 instanceof int[]) {
                                    int i14 = i7 + 109;
                                    write = i14 % Fields.SpotShadowColor;
                                    int i15 = i14 % 2;
                                    jSONObject.put("v", Arrays.toString((int[]) obj2));
                                    jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "ia");
                                } else {
                                    if (obj2 instanceof long[]) {
                                        i = i7 + 103;
                                        write = i % Fields.SpotShadowColor;
                                        c = 2;
                                        if (i % 2 != 0) {
                                            jSONObject.put("v", Arrays.toString((long[]) obj2));
                                            jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "la");
                                            int i16 = 21 / 0;
                                        } else {
                                            jSONObject.put("v", Arrays.toString((long[]) obj2));
                                            jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "la");
                                        }
                                    } else {
                                        c = 2;
                                        if (!(obj2 instanceof Double)) {
                                            getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                            getlookaheaddelegate4.serializer.serializer(obj2.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                                        } else {
                                            jSONObject.put("v", obj2.toString());
                                            jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                                        }
                                    }
                                    jSONArray.put(jSONObject);
                                }
                                c = 2;
                                jSONArray.put(jSONObject);
                            }
                        } else {
                            it = it2;
                            c = 2;
                            jSONObject.put("v", obj2.toString());
                            if (obj2 instanceof String) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
                            } else if (obj2 instanceof Long) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, "l");
                            } else if (obj2 instanceof Double) {
                                jSONObject.put(Constants.BRAZE_PUSH_TITLE_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
                            } else {
                                getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                getlookaheaddelegate5.serializer.serializer(obj2.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        c = c2;
                        it = it2;
                    }
                    it2 = it;
                    c2 = c;
                    str = null;
                }
            }
            editorEdit.putString(str2, jSONArray.toString());
        }
        editorEdit.apply();
        this.read = bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0123 A[Catch: NumberFormatException | JSONException -> 0x0130, NumberFormatException | JSONException -> 0x0130, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0130, blocks: (B:11:0x003d, B:40:0x00bf, B:40:0x00bf, B:42:0x00cc, B:42:0x00cc, B:44:0x00de, B:44:0x00de, B:45:0x00e7, B:45:0x00e7, B:58:0x0123, B:58:0x0123, B:30:0x0081, B:30:0x0081, B:32:0x008e, B:32:0x008e, B:34:0x00a0, B:34:0x00a0, B:35:0x00a9, B:35:0x00a9, B:49:0x00f3, B:49:0x00f3, B:53:0x0103, B:53:0x0103, B:57:0x0117, B:57:0x0117), top: B:72:0x003d, outer: #0 }] */
    public Bundle serializer() {
        int i = 2 % 2;
        LookaheadScopeKt lookaheadScopeKt = (LookaheadScopeKt) this.serializer;
        if (((Bundle) this.read) == null) {
            String str = (String) this.RemoteActionCompatParcelizer;
            SharedPreferences sharedPreferencesSerializer = lookaheadScopeKt.serializer();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) lookaheadScopeKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            String string = sharedPreferencesSerializer.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    int i2 = write + 93;
                    MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i4);
                            String string2 = jSONObject.getString(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID);
                            String string3 = jSONObject.getString(Constants.BRAZE_PUSH_TITLE_KEY);
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        int i5 = MediaSessionCompatQueueItem + 45;
                                        write = i5 % Fields.SpotShadowColor;
                                        if (i5 % 2 == 0 ? iHashCode == 3352 : iHashCode == 2806) {
                                            if (string3.equals("ia")) {
                                                int i6 = write + 3;
                                                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                                                int i7 = i6 % 2;
                                                accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                                if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    int[] iArr = new int[length];
                                                    for (int i8 = 0; i8 < length; i8++) {
                                                        iArr[i8] = jSONArray2.optInt(i8);
                                                    }
                                                    bundle.putIntArray(string2, iArr);
                                                }
                                            } else {
                                                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                getlookaheaddelegate.serializer.serializer(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (iHashCode == 3445 && string3.equals("la")) {
                                            accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                                            if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.fullyDrawnReporter_delegatelambda00)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                long[] jArr = new long[length2];
                                                for (int i9 = 0; i9 < length2; i9++) {
                                                    jArr[i9] = jSONArray3.optLong(i9);
                                                }
                                                bundle.putLongArray(string2, jArr);
                                            }
                                        } else {
                                            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                            getlookaheaddelegate2.serializer.serializer(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY)) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                        getlookaheaddelegate3.serializer.serializer(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                    getlookaheaddelegate4.serializer.serializer(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                getlookaheaddelegate5.serializer.serializer(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                            getlookaheaddelegate6.serializer.RemoteActionCompatParcelizer("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.read = bundle;
                } catch (JSONException unused2) {
                    getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                    getlookaheaddelegate7.serializer.RemoteActionCompatParcelizer("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.read) == null) {
                this.read = (Bundle) this.IconCompatParcelizer;
            }
        }
        Bundle bundle2 = (Bundle) this.read;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle2);
        return new Bundle(bundle2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0298  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:129:0x0313  */
    /* JADX WARN: Code duplicated, block: B:135:0x0327 A[LOOP:4: B:100:0x0285->B:135:0x0327, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x033c  */
    /* JADX WARN: Code duplicated, block: B:140:0x033e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0343  */
    /* JADX WARN: Code duplicated, block: B:143:0x0345  */
    /* JADX WARN: Code duplicated, block: B:147:0x0359  */
    /* JADX WARN: Code duplicated, block: B:149:0x0367  */
    /* JADX WARN: Code duplicated, block: B:153:0x0390  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:166:0x040f A[LOOP:0: B:162:0x0402->B:166:0x040f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x041d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0427  */
    /* JADX WARN: Code duplicated, block: B:174:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x01b5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:38:0x010a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0138  */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162 A[DONT_INVERT, PHI: r12 r13 r14
  0x0162: PHI (r12v7 o.ComposeUiTextFlags) = (r12v5 o.ComposeUiTextFlags), (r12v17 o.ComposeUiTextFlags) binds: [B:37:0x0108, B:46:0x0143] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v8 java.lang.String) binds: [B:37:0x0108, B:46:0x0143] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r14v7 java.lang.String) = (r14v5 java.lang.String), (r14v21 java.lang.String) binds: [B:37:0x0108, B:46:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:52:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x0216  */
    /* JADX WARN: Code duplicated, block: B:93:0x0233  */
    /* JADX WARN: Code duplicated, block: B:95:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x024f A[LOOP:3: B:97:0x024d->B:98:0x024f, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015e, code lost:
    
        if (r4.clear(r5) == r6) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.ImageLoader$Builder.invoke(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public ImageLoader$Builder() {
    }
}
