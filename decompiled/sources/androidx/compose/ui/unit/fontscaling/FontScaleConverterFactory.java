package androidx.compose.ui.unit.fontscaling;

import androidx.compose.ui.unit.InlineClassHelperKt;
import o.DragGestureNodestartListeningForEvents1;
import o.accessprocessDragStart;
import o.isInterested;

/* JADX INFO: loaded from: classes.dex */
public final class FontScaleConverterFactory {
    public static final int $stable;
    private static final float[] CommonFontSizes;
    public static final FontScaleConverterFactory INSTANCE;
    private static final Object[] LookupTablesWriteLock;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;
    private static volatile accessprocessDragStart sLookupTables;

    private FontScaleConverterFactory() {
    }

    private final int getKey(float f) {
        return (int) (f * ScaleKeyMultiplier);
    }

    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int i) {
        return i / ScaleKeyMultiplier;
    }

    public final accessprocessDragStart getSLookupTables() {
        return sLookupTables;
    }

    public final boolean isNonLinearFontScalingActive(float f) {
        return f >= MinScaleForNonLinear;
    }

    public final void setSLookupTables(accessprocessDragStart accessprocessdragstart) {
        sLookupTables = accessprocessdragstart;
    }

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier};
        sLookupTables = new accessprocessDragStart(0);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, ScaleKeyMultiplier}));
        }
        if (fontScaleConverterFactory.getScaleFromKey(sLookupTables.IconCompatParcelizer(0)) - 0.01f <= MinScaleForNonLinear) {
            InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        $stable = 8;
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            float f2 = CommonFontSizes[i];
            fArr2[i] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f2), fontScaleConverter2.convertSpToDp(f2), f);
        }
        return new FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final FontScaleConverter get(float f) {
        accessprocessDragStart accessprocessdragstart = sLookupTables;
        int key = getKey(f);
        accessprocessdragstart.getClass();
        return (FontScaleConverter) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, key);
    }

    private final void put(float f, FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            accessprocessDragStart accessprocessdragstartClone = sLookupTables.clone();
            INSTANCE.putInto(accessprocessdragstartClone, f, fontScaleConverter);
            sLookupTables = accessprocessdragstartClone;
        }
    }

    private final void putInto(accessprocessDragStart accessprocessdragstart, float f, FontScaleConverter fontScaleConverter) {
        accessprocessdragstart.RemoteActionCompatParcelizer(getKey(f), fontScaleConverter);
    }

    public final FontScaleConverter forScale(float f) {
        FontScaleConverter fontScaleConverterTable;
        if (!isNonLinearFontScalingActive(f)) {
            return null;
        }
        FontScaleConverter fontScaleConverter = INSTANCE.get(f);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        accessprocessDragStart accessprocessdragstart = sLookupTables;
        int key = getKey(f);
        if (accessprocessdragstart.write) {
            isInterested.read(accessprocessdragstart);
        }
        int iSerializer = DragGestureNodestartListeningForEvents1.serializer(accessprocessdragstart.IconCompatParcelizer, accessprocessdragstart.serializer, key);
        if (iSerializer >= 0) {
            return (FontScaleConverter) sLookupTables.read(iSerializer);
        }
        int i = -(iSerializer + 1);
        int i2 = i - 1;
        float scaleFromKey = 1.0f;
        if (i >= sLookupTables.write()) {
            FontScaleConverterTable fontScaleConverterTable2 = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
            put(f, fontScaleConverterTable2);
            return fontScaleConverterTable2;
        }
        if (i2 < 0) {
            float[] fArr = CommonFontSizes;
            fontScaleConverterTable = new FontScaleConverterTable(fArr, fArr);
        } else {
            scaleFromKey = getScaleFromKey(sLookupTables.IconCompatParcelizer(i2));
            fontScaleConverterTable = (FontScaleConverter) sLookupTables.read(i2);
        }
        FontScaleConverter fontScaleConverterCreateInterpolatedTableBetween = createInterpolatedTableBetween(fontScaleConverterTable, (FontScaleConverter) sLookupTables.read(i), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, scaleFromKey, getScaleFromKey(sLookupTables.IconCompatParcelizer(i)), f));
        put(f, fontScaleConverterCreateInterpolatedTableBetween);
        return fontScaleConverterCreateInterpolatedTableBetween;
    }
}
