package androidx.compose.ui.text.font;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;
    public static final Companion Companion = new Companion(null);
    private static final SystemFontFamily Default = new DefaultFontFamily();
    private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    @onItemDismisslambda0
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        private Companion() {
        }
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    public /* synthetic */ FontFamily(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public interface Resolver {
        Object preload(FontFamily fontFamily, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView);

        /* JADX INFO: renamed from: resolve-DPcqOEQ, reason: not valid java name */
        onViewAttachedToWindow mo3162resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2);

        /* JADX INFO: renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ onViewAttachedToWindow m3161resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    fontFamily = null;
                }
                if ((i3 & 2) != 0) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                if ((i3 & 4) != 0) {
                    i = FontStyle.Companion.m3197getNormal_LCdwA();
                }
                if ((i3 & 8) != 0) {
                    i2 = FontSynthesis.Companion.m3207getAllGVVA2EU();
                }
                return resolver.mo3162resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            return null;
        }
    }
}
