package com.mapbox.maps.plugin.scalebar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertController$ButtonHandler;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.mapbox.maps.plugin.DistanceUnits;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import o.ContentCardAdapterExternalSyntheticLambda0;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ScaleBarImpl extends View {
    public final Paint barPaint;
    public SegmentsConfiguration currentSegmentsConfiguration;
    public final DecimalFormat decimalFormat;
    public float distancePerPixel;
    public boolean isScaleBarVisible;
    public float mapViewWidth;
    public float pixelRatio;
    public final AlertController$ButtonHandler refreshHandler;
    public Canvas reusableCanvas;
    public List scaleTable;
    public ScaleBarSettings settings;
    public final Paint strokePaint;
    public final Paint textPaint;
    public String unit;
    public boolean useContinuousRendering;

    public final Paint getBarPaint$plugin_scalebar_release() {
        return this.barPaint;
    }

    public float getDistancePerPixel() {
        return this.distancePerPixel;
    }

    public boolean getEnable() {
        return this.isScaleBarVisible;
    }

    public float getMapViewWidth() {
        return this.mapViewWidth;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public final List<Pair<Integer, Integer>> getScaleTable$plugin_scalebar_release() {
        return this.scaleTable;
    }

    public ScaleBarSettings getSettings() {
        return this.settings;
    }

    public final Paint getStrokePaint$plugin_scalebar_release() {
        return this.strokePaint;
    }

    public final Paint getTextPaint$plugin_scalebar_release() {
        return this.textPaint;
    }

    public final String getUnit$plugin_scalebar_release() {
        return this.unit;
    }

    public boolean getUseContinuousRendering() {
        return this.useContinuousRendering;
    }

    public void setPixelRatio(float f) {
        this.pixelRatio = f;
    }

    public void setEnable(boolean z) {
        this.isScaleBarVisible = z;
        if (getUseContinuousRendering()) {
            return;
        }
        setVisibility(z ? 0 : 8);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Paint.Align.values().length];
            try {
                iArr[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Align.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleBarImpl(Context context) {
        super(context);
        context.getClass();
        this.scaleTable = ScaleBarConstantKt.metricTable;
        Paint paint = new Paint();
        this.textPaint = paint;
        Paint paint2 = new Paint();
        this.barPaint = paint2;
        Paint paint3 = new Paint();
        this.strokePaint = paint3;
        this.unit = " m";
        this.pixelRatio = 1.0f;
        this.decimalFormat = new DecimalFormat("0.#");
        this.settings = CustomRemoteModel.ScaleBarSettings(ScaleBarPluginImpl.AnonymousClass1.INSTANCE$1);
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint2.setAntiAlias(true);
        AlertController$ButtonHandler alertController$ButtonHandler = new AlertController$ButtonHandler(Looper.getMainLooper());
        alertController$ButtonHandler.write = new WeakReference(this);
        if (getUseContinuousRendering()) {
            alertController$ButtonHandler.sendEmptyMessage(1);
        }
        this.refreshHandler = alertController$ButtonHandler;
    }

    public final void setScaleTable$plugin_scalebar_release(List<? extends Pair<Integer, Integer>> list) {
        list.getClass();
        this.scaleTable = list;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0116  */
    public void setSettings(ScaleBarSettings scaleBarSettings) {
        List list;
        String str;
        scaleBarSettings.getClass();
        int i = scaleBarSettings.textColor;
        Paint paint = this.textPaint;
        paint.setColor(i);
        float f = scaleBarSettings.textSize;
        paint.setTextSize(f);
        Paint paint2 = this.strokePaint;
        paint2.setTextSize(f);
        DistanceUnits distanceUnits = scaleBarSettings.distanceUnits;
        DistanceUnits distanceUnits2 = DistanceUnits.METRIC;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{distanceUnits, distanceUnits2}, getCieXyz.write())).booleanValue()) {
            list = ScaleBarConstantKt.metricTable;
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{distanceUnits, DistanceUnits.IMPERIAL}, getCieXyz.write())).booleanValue()) {
                list = ScaleBarConstantKt.imperialTable;
            } else {
                list = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{distanceUnits, DistanceUnits.NAUTICAL}, getCieXyz.write())).booleanValue() ? ScaleBarConstantKt.nauticalTable : ScaleBarConstantKt.metricTable;
            }
        }
        this.scaleTable = list;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{distanceUnits, distanceUnits2}, getCieXyz.write())).booleanValue()) {
            str = " m";
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{distanceUnits, DistanceUnits.IMPERIAL}, getCieXyz.write())).booleanValue()) {
                str = " ft";
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{distanceUnits, DistanceUnits.NAUTICAL}, getCieXyz.write())).booleanValue()) {
                    str = " fth";
                } else {
                    str = " m";
                }
            }
        }
        this.unit = str;
        paint2.setStrokeWidth(scaleBarSettings.showTextBorder ? scaleBarSettings.textBorderWidth : 0.0f);
        setEnable(scaleBarSettings.enabled);
        setUseContinuousRendering(scaleBarSettings.useContinuousRendering);
        if (getUseContinuousRendering()) {
            this.reusableCanvas = null;
        } else {
            AlertController$ButtonHandler alertController$ButtonHandler = this.refreshHandler;
            if (!alertController$ButtonHandler.hasMessages(0)) {
                alertController$ButtonHandler.sendEmptyMessageDelayed(0, scaleBarSettings.refreshInterval);
            }
        }
        this.settings = scaleBarSettings;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = scaleBarSettings.position;
            layoutParams2.setMargins((int) scaleBarSettings.marginLeft, (int) scaleBarSettings.marginTop, (int) scaleBarSettings.marginRight, (int) scaleBarSettings.marginBottom);
        }
        setMapViewWidth(getMapViewWidth());
    }

    public final void setUnit$plugin_scalebar_release(String str) {
        str.getClass();
        this.unit = str;
    }

    public void setUseContinuousRendering(boolean z) {
        boolean z2 = this.isScaleBarVisible;
        AlertController$ButtonHandler alertController$ButtonHandler = this.refreshHandler;
        if (z) {
            if (!z2) {
                setVisibility(0);
            }
            alertController$ButtonHandler.removeMessages(0);
            alertController$ButtonHandler.sendEmptyMessage(1);
        } else {
            if (!z2) {
                setVisibility(8);
            }
            alertController$ButtonHandler.removeMessages(1);
            this.reusableCanvas = null;
        }
        this.useContinuousRendering = z;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x026a A[EDGE_INSN: B:113:0x026a->B:89:0x026a BREAK  A[LOOP:3: B:25:0x008f->B:87:0x0252], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:71:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x0210  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    /* JADX WARN: Code duplicated, block: B:78:0x0216  */
    /* JADX WARN: Code duplicated, block: B:80:0x021c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0221  */
    /* JADX WARN: Code duplicated, block: B:84:0x022b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0252 A[LOOP:3: B:25:0x008f->B:87:0x0252, LOOP_END] */
    public final SegmentsConfiguration calculateSegmentsConfiguration$plugin_scalebar_release(float f, float f2, List list, Paint paint, float f3, String str, int i) {
        Object objPrevious;
        float f4;
        float f5;
        ArrayList arrayList;
        float f6;
        int i2;
        int i3;
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        float f7;
        Paint.Align align;
        float fMeasureText;
        float f8;
        int i4;
        float f9;
        float f10;
        float f11;
        int i5;
        float f12;
        list.getClass();
        paint.getClass();
        str.getClass();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((Number) ((Pair) objPrevious).first).intValue() > f);
        Pair pair = (Pair) objPrevious;
        int i6 = 0;
        if (pair == null) {
            pair = (Pair) list.get(0);
        }
        float fIntValue = ((Number) pair.first).intValue();
        Object obj = pair.second;
        obj.getClass();
        int iIntValue = ((Number) obj).intValue();
        float f13 = fIntValue / iIntValue;
        while (iIntValue * f13 > f && iIntValue > 0) {
            iIntValue--;
            fIntValue = iIntValue * f13;
        }
        float f14 = 10.0f;
        if (iIntValue == 0) {
            f13 = ((int) (f * 10.0f)) / 10.0f;
            fIntValue = f13;
            iIntValue = 1;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        float f15 = 0.0f;
        float f16 = 0.0f;
        int i7 = 1;
        while (i7 != 0) {
            f13 = fIntValue / iIntValue;
            f16 = ((int) ((f13 / f2) * f14)) / f14;
            arrayList3.clear();
            arrayList4.clear();
            if (iIntValue >= 0) {
                int i8 = i6;
                while (true) {
                    float f17 = i8;
                    float f18 = f13 * f17;
                    if (f18 == f15) {
                        str3 = "0";
                    } else {
                        boolean zEquals = " m".equals(str);
                        DecimalFormat decimalFormat = this.decimalFormat;
                        if (zEquals) {
                            if (f18 < 1000.0f) {
                                str4 = decimalFormat.format(Float.valueOf(f18)) + " m";
                            } else {
                                str4 = decimalFormat.format(Float.valueOf((f18 * 1.0f) / 1000.0f)) + " km";
                            }
                            str3 = str4;
                        } else {
                            if (" ft".equals(str)) {
                                arrayList2 = arrayList3;
                                if (f18 < 1056.0d) {
                                    str2 = decimalFormat.format(Float.valueOf(f18)) + " ft";
                                } else {
                                    str2 = decimalFormat.format(Float.valueOf((f18 * 1.0f) / 5280.0f)) + " mi";
                                }
                            } else {
                                arrayList2 = arrayList3;
                                if (" fth".equals(str)) {
                                    if (f18 < 1215.2240234375001d) {
                                        str2 = decimalFormat.format(Float.valueOf(f18 / 6.0f)) + " fth";
                                    } else {
                                        str2 = decimalFormat.format(Float.valueOf((f18 * 1.0f) / 6076.12f)) + " nmi";
                                    }
                                } else if (f18 < 1000.0f) {
                                    str2 = decimalFormat.format(Float.valueOf(f18)) + " m";
                                } else {
                                    str2 = decimalFormat.format(Float.valueOf((f18 * 1.0f) / 1000.0f)) + " km";
                                }
                            }
                            str3 = str2;
                            arrayList = arrayList2;
                        }
                        arrayList.add(i8, str3);
                        String str5 = (String) arrayList.get(i8);
                        f7 = f17 * f16;
                        if (i8 == 0) {
                            align = Paint.Align.LEFT;
                        } else {
                            align = Paint.Align.CENTER;
                        }
                        fMeasureText = paint.measureText(str5);
                        f8 = f3 / 2.0f;
                        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                        i4 = iArr[align.ordinal()];
                        f4 = fIntValue;
                        if (i4 != 1) {
                            f9 = fMeasureText;
                        } else if (i4 != 2) {
                            f9 = fMeasureText / 2.0f;
                        } else {
                            if (i4 == 3) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return null;
                            }
                            f9 = 0.0f;
                        }
                        f10 = f7 + f8 + f9;
                        f11 = i;
                        if (f10 > f11) {
                            f7 -= f10 - f11;
                        }
                        i5 = iArr[align.ordinal()];
                        if (i5 != 1) {
                            fMeasureText = 0.0f;
                        } else if (i5 != 2) {
                            fMeasureText /= 2.0f;
                        } else if (i5 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        f12 = (f7 - f8) - fMeasureText;
                        f6 = 0.0f;
                        if (f12 < 0.0f) {
                            f12 += f8;
                            f7 += f8;
                            f10 += f8;
                        }
                        f5 = 10.0f;
                        arrayList4.add(i8, new ContentCardAdapterExternalSyntheticLambda0(Float.valueOf(((int) (f12 * 10.0f)) / 10.0f), Float.valueOf(((int) (f10 * 10.0f)) / 10.0f), Float.valueOf(((int) (f7 * 10.0f)) / 10.0f)));
                        if (i8 != iIntValue) {
                            break;
                        }
                        i8++;
                        str = str;
                        arrayList3 = arrayList;
                        f15 = 0.0f;
                        fIntValue = f4;
                    }
                    arrayList = arrayList3;
                    arrayList.add(i8, str3);
                    String str6 = (String) arrayList.get(i8);
                    f7 = f17 * f16;
                    if (i8 == 0) {
                        align = Paint.Align.LEFT;
                    } else {
                        align = Paint.Align.CENTER;
                    }
                    fMeasureText = paint.measureText(str6);
                    f8 = f3 / 2.0f;
                    int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                    i4 = iArr2[align.ordinal()];
                    f4 = fIntValue;
                    if (i4 != 1) {
                        f9 = fMeasureText;
                    } else if (i4 != 2) {
                        f9 = fMeasureText / 2.0f;
                    } else {
                        if (i4 == 3) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        f9 = 0.0f;
                    }
                    f10 = f7 + f8 + f9;
                    f11 = i;
                    if (f10 > f11) {
                        f7 -= f10 - f11;
                    }
                    i5 = iArr2[align.ordinal()];
                    if (i5 != 1) {
                        fMeasureText = 0.0f;
                    } else if (i5 != 2) {
                        fMeasureText /= 2.0f;
                    } else if (i5 == 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    f12 = (f7 - f8) - fMeasureText;
                    f6 = 0.0f;
                    if (f12 < 0.0f) {
                        f12 += f8;
                        f7 += f8;
                        f10 += f8;
                    }
                    f5 = 10.0f;
                    arrayList4.add(i8, new ContentCardAdapterExternalSyntheticLambda0(Float.valueOf(((int) (f12 * 10.0f)) / 10.0f), Float.valueOf(((int) (f10 * 10.0f)) / 10.0f), Float.valueOf(((int) (f7 * 10.0f)) / 10.0f)));
                    if (i8 != iIntValue) {
                        break;
                        break;
                    }
                    i8++;
                    str = str;
                    arrayList3 = arrayList;
                    f15 = 0.0f;
                    fIntValue = f4;
                }
            } else {
                f4 = fIntValue;
                f5 = f14;
                arrayList = arrayList3;
                f6 = f15;
            }
            int size = arrayList4.size();
            int i9 = 0;
            while (true) {
                if (i9 < size - 1) {
                    float fFloatValue = ((Number) ((ContentCardAdapterExternalSyntheticLambda0) arrayList4.get(i9)).RemoteActionCompatParcelizer).floatValue();
                    i9++;
                    if (fFloatValue >= ((Number) ((ContentCardAdapterExternalSyntheticLambda0) arrayList4.get(i9)).serializer).floatValue()) {
                        if (iIntValue != 1) {
                            i2 = 0;
                            iIntValue--;
                            i3 = 1;
                            break;
                        }
                        i2 = 0;
                        arrayList.set(0, "");
                    }
                } else {
                    i2 = 0;
                }
                i3 = i2;
                break;
            }
            i7 = i3;
            arrayList3 = arrayList;
            f15 = f6;
            i6 = i2;
            f14 = f5;
            fIntValue = f4;
        }
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList3);
        List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(arrayList4);
        SegmentsConfiguration segmentsConfiguration = new SegmentsConfiguration();
        segmentsConfiguration.unitDistance = f13;
        segmentsConfiguration.unitBarWidth = f16;
        segmentsConfiguration.rectCount = iIntValue;
        segmentsConfiguration.labelTexts = listPlaybackStateCompat;
        segmentsConfiguration.labelMarginsAndAnchor = listPlaybackStateCompat2;
        return segmentsConfiguration;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        canvas.getClass();
        if (getUseContinuousRendering()) {
            if (!this.isScaleBarVisible) {
                canvas.drawARGB(0, 0, 0, 0);
                return;
            } else if (this.reusableCanvas != null) {
                return;
            }
        }
        if (getDistancePerPixel() <= 0.0f || getMapViewWidth() <= 0.0f || getWidth() <= 0) {
            return;
        }
        ScaleBarSettings settings = getSettings();
        float mapViewWidth = getMapViewWidth();
        float distancePerPixel = getDistancePerPixel();
        float f2 = settings.ratio;
        int i = settings.primaryColor;
        float f3 = settings.borderWidth;
        int i2 = settings.secondaryColor;
        float f4 = settings.height;
        float f5 = settings.textBarMargin;
        float f6 = settings.textSize;
        float f7 = distancePerPixel * mapViewWidth * f2;
        if (f7 <= 0.1f) {
            canvas.drawARGB(0, 0, 0, 0);
            return;
        }
        float distancePerPixel2 = getDistancePerPixel();
        List list = this.scaleTable;
        Paint paint = this.strokePaint;
        float strokeWidth = paint.getStrokeWidth();
        String str = this.unit;
        int width = getWidth();
        Paint paint2 = this.textPaint;
        SegmentsConfiguration segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release = calculateSegmentsConfiguration$plugin_scalebar_release(f7, distancePerPixel2, list, paint2, strokeWidth, str, width);
        float f8 = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.unitBarWidth;
        int i3 = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.rectCount;
        this.currentSegmentsConfiguration = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        Paint paint3 = this.barPaint;
        paint3.setStyle(style);
        paint3.setColor(i2);
        float f9 = f8 * i3;
        float f10 = f5 + f6;
        float f11 = f3 * 2.0f;
        float f12 = f4 + f10;
        float f13 = f6;
        canvas.drawRect(0.0f, f10 - f11, f11 + f9, f11 + f12, paint3);
        paint3.setColor(i);
        float f14 = settings.borderWidth;
        canvas.drawRect(f14, f10 - f14, f9 + f14, f12 + f14, paint3);
        paint3.setStyle(Paint.Style.FILL);
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                paint3.setColor(i4 % 2 == 0 ? i : i2);
                String str2 = (String) segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.labelTexts.get(i4);
                if (i4 == 0) {
                    Paint.Align align = Paint.Align.LEFT;
                    paint2 = paint2;
                    paint2.setTextAlign(align);
                    paint.setTextAlign(align);
                } else {
                    paint2 = paint2;
                    Paint.Align align2 = Paint.Align.CENTER;
                    paint2.setTextAlign(align2);
                    paint.setTextAlign(align2);
                }
                float fFloatValue = ((Number) ((ContentCardAdapterExternalSyntheticLambda0) segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release.labelMarginsAndAnchor.get(i4)).IconCompatParcelizer).floatValue();
                canvas2 = canvas;
                if (getSettings().showTextBorder) {
                    f = f13;
                    canvas2.drawText(str2, fFloatValue, f, paint);
                } else {
                    f = f13;
                }
                canvas2.drawText(str2, fFloatValue, f, paint2);
                if (i4 != i3) {
                    canvas.drawRect((i4 * f8) + f11, f10, f8 * (i4 + 1), f12, paint3);
                }
                if (i4 == i3) {
                    break;
                }
                i4++;
                segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release = segmentsConfigurationCalculateSegmentsConfiguration$plugin_scalebar_release;
                f8 = f8;
                f13 = f;
            }
        } else {
            canvas2 = canvas;
        }
        if (getUseContinuousRendering()) {
            this.reusableCanvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float mapViewWidth = getMapViewWidth();
        float f = getSettings().ratio;
        float pixelRatio = getPixelRatio();
        ScaleBarSettings settings = getSettings();
        float f2 = settings.textBarMargin;
        float f3 = settings.textSize;
        float f4 = settings.height;
        Pair pair = new Pair(Float.valueOf((pixelRatio * 10.0f) + (mapViewWidth * f)), Float.valueOf((settings.borderWidth * 2.0f) + f2 + f3 + f4));
        setMeasuredDimension((int) ((Number) pair.first).floatValue(), (int) ((Number) pair.second).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0088  */
    public void setDistancePerPixel(float f) {
        float f2;
        DistanceUnits distanceUnits = getSettings().distanceUnits;
        Object[] objArr = {distanceUnits, DistanceUnits.METRIC};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            f2 = f;
        } else {
            Object[] objArr2 = {distanceUnits, DistanceUnits.IMPERIAL};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {distanceUnits, DistanceUnits.NAUTICAL};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    f2 = f;
                }
            }
            f2 = 3.2808f * f;
        }
        if (this.distancePerPixel == f2) {
            return;
        }
        this.distancePerPixel = f2;
        if (getUseContinuousRendering()) {
            this.reusableCanvas = null;
            return;
        }
        float mapViewWidth = getMapViewWidth();
        float distancePerPixel = getDistancePerPixel();
        float f3 = getSettings().ratio;
        if (calculateSegmentsConfiguration$plugin_scalebar_release(distancePerPixel * mapViewWidth * f3, this.distancePerPixel, this.scaleTable, this.textPaint, this.strokePaint.getStrokeWidth(), this.unit, getWidth()).equals(this.currentSegmentsConfiguration)) {
            return;
        }
        AlertController$ButtonHandler alertController$ButtonHandler = this.refreshHandler;
        if (alertController$ButtonHandler.hasMessages(0)) {
            return;
        }
        alertController$ButtonHandler.sendEmptyMessageDelayed(0, getSettings().refreshInterval);
    }

    public void setMapViewWidth(float f) {
        this.mapViewWidth = f;
        post(new ZM$$ExternalSyntheticLambda2(8, this));
    }
}
