package o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getGraphicModalMaxHeightDpannotations {
    public static int IconCompatParcelizer(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long read(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[SYNTHETIC] */
    public static final long write(long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        ApiExceptionSessionExpiredForbidden apiExceptionSessionExpiredForbidden;
        long j7;
        long j8;
        long j9;
        long j10;
        int i;
        int i2;
        int i3;
        long j11;
        long j12;
        long j13;
        if (j <= 0 || j2 >= 0) {
            if (j >= 0 || j2 <= 0) {
                j4 = j;
                j5 = j2;
            } else {
                j6 = j + 1;
                j5 = j2 - 1000000000;
            }
            if (j4 == 0) {
                return j5 / j3;
            }
            if (j4 != 0) {
                j7 = j4 * 1000000000;
                if (j7 / 1000000000 != j4) {
                    j7 = 0;
                }
                if (j7 != 0) {
                    apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j7 / j3, j7 % j3, 2, (byte) 0);
                } else if (1000000000 == j3) {
                    apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j4, 0L, 2, (byte) 0);
                } else if (j4 == j3) {
                    apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(1000000000L, 0L, 2, (byte) 0);
                } else {
                    if (j4 >= 0) {
                        j8 = 0;
                    } else {
                        j8 = -1;
                    }
                    long j14 = j8 * 1000000000;
                    long j15 = ((j4 >> 32) & 4294967295L) * 1000000000;
                    long j16 = (j4 & 4294967295L) * 1000000000;
                    long j17 = (j15 & 4294967295L) + ((j16 >> 32) & 4294967295L);
                    long j18 = ((j17 >> 32) & 4294967295L) + (j14 & 4294967295L) + ((j15 >> 32) & 4294967295L);
                    j9 = ((j17 & 4294967295L) << 32) | (j16 & 4294967295L);
                    j10 = ((((j18 >> 32) & 4294967295L) + ((j14 >> 32) & 4294967295L)) << 32) | (j18 & 4294967295L);
                    if (((j10 >> 63) & 1) == 1) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    if (i2 == -1) {
                        j9 = (~j9) + 1;
                        j10 = ~j10;
                        if (j9 == 0) {
                            j10++;
                        }
                    }
                    i3 = 127;
                    j11 = 0;
                    j12 = 0;
                    for (i = -1; i < i3; i = -1) {
                        if (i3 < 64) {
                            j13 = j9 >> i3;
                        } else {
                            j13 = j10 >> (i3 - 64);
                        }
                        j12 = (j12 << 1) | (j13 & 1);
                        if (j12 < j3 || j12 < 0) {
                            j12 -= j3;
                            if (i3 >= 63) {
                                throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                            }
                            j11 |= 1 << i3;
                        }
                        i3--;
                    }
                    long j19 = i2;
                    apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j19 * j11, j19 * j12, 2, (byte) 0);
                }
            } else {
                apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(0L, 0L, 2, (byte) 0);
            }
            return Math.addExact(apiExceptionSessionExpiredForbidden.read, Math.addExact(j5 / j3, Math.addExact(j5 % j3, apiExceptionSessionExpiredForbidden.write) / j3));
        }
        j6 = j - 1;
        j5 = j2 + 1000000000;
        j4 = j6;
        if (j4 == 0) {
            return j5 / j3;
        }
        if (j4 != 0) {
            j7 = j4 * 1000000000;
            if (j7 / 1000000000 != j4) {
                j7 = 0;
            }
            if (j7 != 0) {
                apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j7 / j3, j7 % j3, 2, (byte) 0);
            } else if (1000000000 == j3) {
                apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j4, 0L, 2, (byte) 0);
            } else if (j4 == j3) {
                apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(1000000000L, 0L, 2, (byte) 0);
            } else {
                if (j4 >= 0) {
                    j8 = 0;
                } else {
                    j8 = -1;
                }
                long j110 = j8 * 1000000000;
                long j111 = ((j4 >> 32) & 4294967295L) * 1000000000;
                long j112 = (j4 & 4294967295L) * 1000000000;
                long j113 = (j111 & 4294967295L) + ((j112 >> 32) & 4294967295L);
                long j114 = ((j113 >> 32) & 4294967295L) + (j110 & 4294967295L) + ((j111 >> 32) & 4294967295L);
                j9 = ((j113 & 4294967295L) << 32) | (j112 & 4294967295L);
                j10 = ((((j114 >> 32) & 4294967295L) + ((j110 >> 32) & 4294967295L)) << 32) | (j114 & 4294967295L);
                if (((j10 >> 63) & 1) == 1) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                if (i2 == -1) {
                    j9 = (~j9) + 1;
                    j10 = ~j10;
                    if (j9 == 0) {
                        j10++;
                    }
                }
                i3 = 127;
                j11 = 0;
                j12 = 0;
                while (i < i3) {
                    if (i3 < 64) {
                        j13 = j9 >> i3;
                    } else {
                        j13 = j10 >> (i3 - 64);
                    }
                    j12 = (j12 << 1) | (j13 & 1);
                    if (j12 < j3) {
                        j12 -= j3;
                        if (i3 >= 63) {
                            throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                        }
                        j11 |= 1 << i3;
                    } else {
                        j12 -= j3;
                        if (i3 >= 63) {
                            throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                        }
                        j11 |= 1 << i3;
                    }
                    i3--;
                }
                long j115 = i2;
                apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(j115 * j11, j115 * j12, 2, (byte) 0);
            }
        } else {
            apiExceptionSessionExpiredForbidden = new ApiExceptionSessionExpiredForbidden(0L, 0L, 2, (byte) 0);
        }
        return Math.addExact(apiExceptionSessionExpiredForbidden.read, Math.addExact(j5 / j3, Math.addExact(j5 % j3, apiExceptionSessionExpiredForbidden.write) / j3));
    }
}
