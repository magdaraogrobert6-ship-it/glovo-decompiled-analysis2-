package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
                float fM2206computeFillMaxDimensioniLBOSCw = ContentScaleKt.m2206computeFillMaxDimensioniLBOSCw(j, j2);
                return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fM2206computeFillMaxDimensioniLBOSCw)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM2206computeFillMaxDimensioniLBOSCw))));
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
                float fM2207computeFillMinDimensioniLBOSCw = ContentScaleKt.m2207computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fM2207computeFillMinDimensioniLBOSCw)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM2207computeFillMinDimensioniLBOSCw))));
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L));
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                }
                float fM2207computeFillMinDimensioniLBOSCw = ContentScaleKt.m2207computeFillMinDimensioniLBOSCw(j, j2);
                return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fM2207computeFillMinDimensioniLBOSCw)) << 32) | (((long) Float.floatToRawIntBits(fM2207computeFillMinDimensioniLBOSCw)) & 4294967295L));
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA */
            public long mo2202computeScaleFactorH7hwNQA(long j, long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                return ScaleFactor.m2324constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            }
        };

        private Companion() {
        }

        public static /* synthetic */ void getCrop$annotations() {
        }

        public static /* synthetic */ void getFillBounds$annotations() {
        }

        public static /* synthetic */ void getFillHeight$annotations() {
        }

        public static /* synthetic */ void getFillWidth$annotations() {
        }

        public static /* synthetic */ void getFit$annotations() {
        }

        public static /* synthetic */ void getInside$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }
    }

    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo2202computeScaleFactorH7hwNQA(long j, long j2);
}
