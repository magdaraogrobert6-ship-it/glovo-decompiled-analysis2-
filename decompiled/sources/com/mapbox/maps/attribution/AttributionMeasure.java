package com.mapbox.maps.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.widget.TextView;
import androidx.sqlite.SQLite;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AttributionMeasure {
    public static final Companion Companion = new Companion(null);
    private final Bitmap logo;
    private final Bitmap logoSmall;
    private final float margin;
    private boolean shorterText;
    private final Bitmap snapshot;
    private final TextView textView;
    private final TextView textViewShort;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PointF calculateAnchor(Bitmap bitmap, TextView textView, float f) {
            return new PointF((bitmap.getWidth() - textView.getMeasuredWidth()) - f, (bitmap.getHeight() - textView.getMeasuredHeight()) - f);
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public final class Chain {
        private List<? extends Command> commands;
        final /* synthetic */ AttributionMeasure this$0;

        public final List<Command> getCommands() {
            return this.commands;
        }

        public Chain(AttributionMeasure attributionMeasure, Command... commandArr) {
            commandArr.getClass();
            this.this$0 = attributionMeasure;
            this.commands = SQLite.read(Arrays.copyOf(commandArr, commandArr.length));
        }

        public final void setCommands(List<? extends Command> list) {
            list.getClass();
            this.commands = list;
        }

        public final AttributionLayout start(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            Iterator<? extends Command> it = this.commands.iterator();
            AttributionLayout attributionLayoutExecute = null;
            while (it.hasNext() && (attributionLayoutExecute = it.next().execute(attributionMeasure)) == null) {
            }
            return attributionLayoutExecute;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class FullLogoLongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            float logoContainerWidth = attributionMeasure.getLogoContainerWidth();
            return Command.DefaultImpls.execute$default(this, attributionMeasure, attributionMeasure.getTextViewContainerWidth() + logoContainerWidth, attributionMeasure.getMaxSize(), attributionMeasure.logo, false, 16, null);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class FullLogoShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            float logoContainerWidth = attributionMeasure.getLogoContainerWidth();
            return execute(attributionMeasure, attributionMeasure.getTextViewShortContainerWidth() + logoContainerWidth, attributionMeasure.getMaxSizeShort(), attributionMeasure.logo, true);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class LongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            float textViewContainerWidth = attributionMeasure.getTextViewContainerWidth();
            return Command.DefaultImpls.execute$default(this, attributionMeasure, attributionMeasure.margin + textViewContainerWidth, attributionMeasure.getMaxSize(), null, false, 16, null);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class ShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            float textViewShortContainerWidth = attributionMeasure.getTextViewShortContainerWidth();
            return execute(attributionMeasure, attributionMeasure.margin + textViewShortContainerWidth, attributionMeasure.getMaxSizeShort(), null, true);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class SmallLogoLongTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            float logoSmallContainerWidth = attributionMeasure.getLogoSmallContainerWidth();
            return Command.DefaultImpls.execute$default(this, attributionMeasure, attributionMeasure.getTextViewContainerWidth() + logoSmallContainerWidth, attributionMeasure.getMaxSize(), attributionMeasure.logoSmall, false, 16, null);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class SmallLogoShortTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            float logoContainerWidth = attributionMeasure.getLogoContainerWidth();
            return execute(attributionMeasure, attributionMeasure.getTextViewShortContainerWidth() + logoContainerWidth, attributionMeasure.getMaxSizeShort(), attributionMeasure.logoSmall, true);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLogoContainerWidth() {
        return (this.margin * 2.0f) + this.logo.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getLogoSmallContainerWidth() {
        return (this.margin * 2.0f) + this.logoSmall.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxSize() {
        return (this.snapshot.getWidth() * 8) / 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getMaxSizeShort() {
        return this.snapshot.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTextViewContainerWidth() {
        return this.textView.getMeasuredWidth() + this.margin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTextViewShortContainerWidth() {
        return this.textViewShort.getMeasuredWidth() + this.margin;
    }

    public AttributionMeasure(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, TextView textView, TextView textView2, float f) {
        bitmap.getClass();
        bitmap2.getClass();
        bitmap3.getClass();
        textView.getClass();
        textView2.getClass();
        this.snapshot = bitmap;
        this.logo = bitmap2;
        this.logoSmall = bitmap3;
        this.textView = textView;
        this.textViewShort = textView2;
        this.margin = f;
    }

    public final TextView getTextView() {
        return this.shorterText ? this.textViewShort : this.textView;
    }

    public final AttributionLayout measure() {
        AttributionLayout attributionLayoutStart = new Chain(this, new FullLogoLongTextCommand(), new FullLogoShortTextCommand(), new SmallLogoLongTextCommand(), new SmallLogoShortTextCommand(), new LongTextCommand(), new ShortTextCommand(), new NoTextCommand()).start(this);
        if (attributionLayoutStart != null) {
            this.shorterText = attributionLayoutStart.isShortText();
        }
        return attributionLayoutStart;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class NoTextCommand implements Command {
        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure) {
            attributionMeasure.getClass();
            return new AttributionLayout(null, null, false);
        }

        @Override // com.mapbox.maps.attribution.AttributionMeasure.Command
        public AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
            return Command.DefaultImpls.execute(this, attributionMeasure, f, f2, bitmap, z);
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface Command {
        AttributionLayout execute(AttributionMeasure attributionMeasure);

        AttributionLayout execute(AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z);

        public static final class DefaultImpls {
            public static AttributionLayout execute(Command command, AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z) {
                attributionMeasure.getClass();
                if (f <= f2) {
                    return new AttributionLayout(bitmap, AttributionMeasure.Companion.calculateAnchor(attributionMeasure.snapshot, attributionMeasure.textView, attributionMeasure.margin), z);
                }
                return null;
            }

            public static /* synthetic */ AttributionLayout execute$default(Command command, AttributionMeasure attributionMeasure, float f, float f2, Bitmap bitmap, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 16) != 0) {
                        z = false;
                    }
                    return command.execute(attributionMeasure, f, f2, bitmap, z);
                }
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: execute");
                return null;
            }
        }
    }
}
