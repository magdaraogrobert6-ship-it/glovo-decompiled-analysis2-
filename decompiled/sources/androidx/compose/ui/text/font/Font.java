package androidx.compose.ui.text.font;

import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public interface Font {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }

    @onItemDismisslambda0
    public interface ResourceLoader {
        @onItemDismisslambda0
        Object load(Font font);
    }

    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    int mo3142getStyle_LCdwA();

    FontWeight getWeight();

    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo3134getLoadingStrategyPKNRLFQ() {
        return FontLoadingStrategy.Companion.m3182getBlockingPKNRLFQ();
    }
}
