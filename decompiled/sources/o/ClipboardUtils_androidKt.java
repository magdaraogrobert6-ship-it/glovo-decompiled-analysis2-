package o;

/* JADX INFO: loaded from: classes.dex */
public final class ClipboardUtils_androidKt implements MutableInteractionSourceImpl {
    public final float read;
    public final androidx.compose.animation.core.SpringSimulation write;

    @Override // o.MutableInteractionSourceImpl
    public final float IconCompatParcelizer(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // o.MutableInteractionSourceImpl
    public final long read(float f, float f2, float f3) {
        double dLog;
        long j;
        androidx.compose.animation.core.SpringSimulation springSimulation = this.write;
        double d = springSimulation.read;
        float f4 = (float) (d * d);
        float f5 = springSimulation.IconCompatParcelizer;
        float f6 = this.read;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d2 = f4;
            double d3 = f5;
            double d4 = f8;
            double d5 = f7;
            double dSqrt = Math.sqrt(d2) * d3 * 2.0d;
            double d6 = (dSqrt * dSqrt) - (d2 * 4.0d);
            double dSqrt2 = d6 < 0.0d ? 0.0d : Math.sqrt(d6);
            double dSqrt3 = d6 < 0.0d ? Math.sqrt(Math.abs(d6)) : 0.0d;
            double d7 = -dSqrt;
            double d8 = (d7 + dSqrt2) * 0.5d;
            double d9 = (d7 - dSqrt2) * 0.5d;
            if (d5 == 0.0d && d4 == 0.0d) {
                j = 0;
            } else {
                if (d5 < 0.0d) {
                    d4 = -d4;
                }
                double dAbs = Math.abs(d5);
                double d10 = 1.0d;
                double d11 = -1.0d;
                double dAbs2 = Double.MAX_VALUE;
                if (d3 > 1.0d) {
                    double d12 = d8 - d9;
                    double d13 = ((d8 * dAbs) - d4) / d12;
                    double d14 = dAbs - d13;
                    double dLog2 = Math.log(Math.abs(1.0d / d14)) / d8;
                    double dLog3 = Math.log(Math.abs(1.0d / d13)) / d9;
                    if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog2 = dLog3;
                    } else if ((Double.doubleToRawLongBits(dLog3) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog2 = Math.max(dLog2, dLog3);
                    }
                    double d15 = d14 * d8;
                    double dLog4 = Math.log(d15 / ((-d13) * d9)) / (d9 - d8);
                    if (Double.isNaN(dLog4) || dLog4 <= 0.0d) {
                        dLog = dLog2;
                        d10 = -1.0d;
                    } else {
                        if (dLog4 > 0.0d) {
                            if ((-((Math.exp(dLog4 * d9) * d13) + (Math.exp(d8 * dLog4) * d14))) < 1.0d) {
                                dLog2 = (d13 <= 0.0d || d14 >= 0.0d) ? dLog2 : 0.0d;
                                dLog = dLog2;
                                d10 = -1.0d;
                            }
                        }
                        dLog = Math.log((-((d13 * d9) * d9)) / (d15 * d8)) / d12;
                    }
                    double d16 = d13 * d9;
                    if (Math.abs((Math.exp(d9 * dLog) * d16) + (Math.exp(d8 * dLog) * d15)) >= 1.0E-4d) {
                        int i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            i++;
                            double d17 = d8 * dLog;
                            double d18 = d9 * dLog;
                            double dExp = dLog - ((((Math.exp(d18) * d13) + (Math.exp(d17) * d14)) + d10) / ((Math.exp(d18) * d16) + (Math.exp(d17) * d15)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d3 < 1.0d) {
                    double d19 = (d4 - (d8 * dAbs)) / (dSqrt3 * 0.5d);
                    dLog = Math.log(1.0d / Math.sqrt((d19 * d19) + (dAbs * dAbs))) / d8;
                } else {
                    double d20 = d8 * dAbs;
                    double d21 = d4 - d20;
                    dLog = Math.log(Math.abs(1.0d / dAbs)) / d8;
                    double dLog5 = Math.log(Math.abs(1.0d / d21));
                    double dLog6 = dLog5;
                    for (int i2 = 0; i2 < 6; i2++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d8));
                    }
                    double d22 = dLog6 / d8;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = d22;
                    } else if ((Double.doubleToRawLongBits(d22) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, d22);
                    }
                    double d23 = (-(d20 + d21)) / (d8 * d21);
                    double d24 = d8 * d23;
                    double dExp2 = Math.exp(d24);
                    double dExp3 = Math.exp(d24);
                    if (!Double.isNaN(d23) && d23 > 0.0d) {
                        if (d23 <= 0.0d || (-((dExp3 * d23 * d21) + (dExp2 * dAbs))) >= 1.0d) {
                            dLog = (-(2.0d / d8)) - (dAbs / d21);
                            d11 = 1.0d;
                        } else if (d21 < 0.0d && dAbs > 0.0d) {
                            dLog = 0.0d;
                        }
                    }
                    int i3 = 0;
                    while (dAbs2 > 0.001d && i3 < 100) {
                        i3++;
                        double d25 = d8 * dLog;
                        double dExp4 = dLog - (((Math.exp(d25) * ((d21 * dLog) + dAbs)) + d11) / (Math.exp(d25) * (((d25 + 1.0d) * d21) + d20)));
                        dAbs2 = Math.abs(dLog - dExp4);
                        dLog = dExp4;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    public ClipboardUtils_androidKt(float f, float f2, float f3) {
        this.read = f3;
        androidx.compose.animation.core.SpringSimulation springSimulation = new androidx.compose.animation.core.SpringSimulation();
        springSimulation.serializer = 1.0f;
        springSimulation.read = Math.sqrt(50.0d);
        springSimulation.IconCompatParcelizer = 1.0f;
        if (f < 0.0f) {
            Box.read("Damping ratio must be non-negative");
        }
        springSimulation.IconCompatParcelizer = f;
        double d = springSimulation.read;
        if (((float) (d * d)) <= 0.0f) {
            Box.read("Spring stiffness constant must be positive.");
        }
        springSimulation.read = Math.sqrt(f2);
        this.write = springSimulation;
    }

    @Override // o.MutableInteractionSourceImpl
    public final float getValueFromNanos(long j, float f, float f2, float f3) {
        androidx.compose.animation.core.SpringSimulation springSimulation = this.write;
        springSimulation.serializer = f2;
        return Float.intBitsToFloat((int) (springSimulation.m8updateValuesIJZedt4$animation_core(f, f3, j / 1000000) >> 32));
    }

    @Override // o.MutableInteractionSourceImpl
    public final float getVelocityFromNanos(long j, float f, float f2, float f3) {
        androidx.compose.animation.core.SpringSimulation springSimulation = this.write;
        springSimulation.serializer = f2;
        return Float.intBitsToFloat((int) (springSimulation.m8updateValuesIJZedt4$animation_core(f, f3, j / 1000000) & 4294967295L));
    }
}
