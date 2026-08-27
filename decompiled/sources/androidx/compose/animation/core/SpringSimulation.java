package androidx.compose.animation.core;

/* JADX INFO: loaded from: classes.dex */
public final class SpringSimulation {
    public float IconCompatParcelizer;
    public double read;
    public float serializer;

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core, reason: not valid java name */
    public final long m8updateValuesIJZedt4$animation_core(float f, float f2, long j) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f3 = f - this.serializer;
        double d = j / 1000.0d;
        float f4 = this.IconCompatParcelizer;
        double d2 = f4;
        double d3 = d2 * d2;
        double d4 = this.read;
        double d5 = ((double) (-f4)) * d4;
        if (f4 > 1.0f) {
            double dSqrt = Math.sqrt(d3 - 1.0d) * d4;
            double d6 = d5 + dSqrt;
            double d7 = d5 - dSqrt;
            double d8 = f3;
            double d9 = ((d7 * d8) - ((double) f2)) / (d7 - d6);
            double d10 = d8 - d9;
            double d11 = d7 * d;
            double d12 = d * d6;
            dSin = (Math.exp(d12) * d9) + (Math.exp(d11) * d10);
            dExp = Math.exp(d11) * d10 * d7;
            dExp2 = Math.exp(d12) * d9 * d6;
        } else {
            if (f4 == 1.0f) {
                double d13 = f3;
                double d14 = (d4 * d13) + ((double) f2);
                double d15 = (-d4) * d;
                double d16 = (d * d14) + d13;
                dSin = Math.exp(d15) * d16;
                dExp = Math.exp(d15) * d16 * (-this.read);
                dExp2 = Math.exp(d15) * d14;
            } else {
                double dSqrt2 = Math.sqrt(1.0d - d3) * d4;
                double d17 = f3;
                double d18 = (((-d5) * d17) + ((double) f2)) * (1.0d / dSqrt2);
                double d19 = dSqrt2 * d;
                double d20 = d * d5;
                dSin = ((Math.sin(d19) * d18) + (Math.cos(d19) * d17)) * Math.exp(d20);
                dCos = (((Math.cos(d19) * dSqrt2 * d18) + (Math.sin(d19) * (-dSqrt2) * d17)) * Math.exp(d20)) + (d5 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (((long) Float.floatToRawIntBits((float) (dSin + ((double) this.serializer)))) << 32);
        }
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (((long) Float.floatToRawIntBits((float) (dSin + ((double) this.serializer)))) << 32);
    }
}
