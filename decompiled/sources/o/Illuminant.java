package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Illuminant {
    public static float serializer(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static float read(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static int serializer(float f, int i, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = read(((i >> 16) & 255) / 255.0f);
        float f5 = read(((i >> 8) & 255) / 255.0f);
        float f6 = read((i & 255) / 255.0f);
        float f7 = read(((i2 >> 16) & 255) / 255.0f);
        float f8 = read(((i2 >> 8) & 255) / 255.0f);
        float f9 = read((i2 & 255) / 255.0f);
        float fM = c8$$ExternalSyntheticOutline0.m(f3, f2, f, f2);
        float fM2 = c8$$ExternalSyntheticOutline0.m(f7, f4, f, f4);
        float fM3 = c8$$ExternalSyntheticOutline0.m(f8, f5, f, f5);
        float fM4 = c8$$ExternalSyntheticOutline0.m(f9, f6, f, f6);
        float fSerializer = serializer(fM2);
        float fSerializer2 = serializer(fM3);
        return Math.round(serializer(fM4) * 255.0f) | (Math.round(fSerializer * 255.0f) << 16) | (Math.round(fM * 255.0f) << 24) | (Math.round(fSerializer2 * 255.0f) << 8);
    }
}
