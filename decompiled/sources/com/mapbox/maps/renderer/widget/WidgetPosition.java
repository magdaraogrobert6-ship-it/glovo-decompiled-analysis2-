package com.mapbox.maps.renderer.widget;

import com.mapbox.maps.MapboxExperimental;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public final class WidgetPosition {
    private final Horizontal horizontal;
    private final Horizontal horizontalAlignment;
    private final float offsetX;
    private final float offsetY;
    private final Vertical vertical;
    private final Vertical verticalAlignment;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private float offsetX;
        private float offsetY;
        private Horizontal horizontalAlignment = Horizontal.LEFT;
        private Vertical verticalAlignment = Vertical.TOP;

        public final Horizontal getHorizontalAlignment() {
            return this.horizontalAlignment;
        }

        public final float getOffsetX() {
            return this.offsetX;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        public final Vertical getVerticalAlignment() {
            return this.verticalAlignment;
        }

        /* JADX INFO: renamed from: setOffsetX, reason: collision with other method in class */
        public final /* synthetic */ void m4771setOffsetX(float f) {
            this.offsetX = f;
        }

        /* JADX INFO: renamed from: setOffsetY, reason: collision with other method in class */
        public final /* synthetic */ void m4772setOffsetY(float f) {
            this.offsetY = f;
        }

        public final WidgetPosition build() {
            return new WidgetPosition(this.horizontalAlignment, this.verticalAlignment, this.offsetX, this.offsetY, null);
        }

        /* JADX INFO: renamed from: setHorizontalAlignment, reason: collision with other method in class */
        public final /* synthetic */ void m4770setHorizontalAlignment(Horizontal horizontal) {
            horizontal.getClass();
            this.horizontalAlignment = horizontal;
        }

        public final Builder setOffsetX(float f) {
            this.offsetX = f;
            return this;
        }

        public final Builder setOffsetY(float f) {
            this.offsetY = f;
            return this;
        }

        /* JADX INFO: renamed from: setVerticalAlignment, reason: collision with other method in class */
        public final /* synthetic */ void m4773setVerticalAlignment(Vertical vertical) {
            vertical.getClass();
            this.verticalAlignment = vertical;
        }

        public final Builder setHorizontalAlignment(Horizontal horizontal) {
            horizontal.getClass();
            this.horizontalAlignment = horizontal;
            return this;
        }

        public final Builder setVerticalAlignment(Vertical vertical) {
            vertical.getClass();
            this.verticalAlignment = vertical;
            return this;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public enum Horizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* JADX INFO: loaded from: classes5.dex */
    public enum Vertical {
        TOP,
        CENTER,
        BOTTOM
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getHorizontal$annotations() {
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getVertical$annotations() {
    }

    public final Horizontal getHorizontal() {
        return this.horizontal;
    }

    public final Horizontal getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Vertical getVertical() {
        return this.vertical;
    }

    public final Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        return Objects.hash(this.horizontalAlignment, this.verticalAlignment, Float.valueOf(this.offsetX), Float.valueOf(this.offsetY));
    }

    public final Builder toBuilder() {
        return new Builder().setHorizontalAlignment(this.horizontalAlignment).setVerticalAlignment(this.verticalAlignment).setOffsetX(this.offsetX).setOffsetY(this.offsetY);
    }

    private WidgetPosition(Horizontal horizontal, Vertical vertical, float f, float f2) {
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.offsetX = f;
        this.offsetY = f2;
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WidgetPosition)) {
            return false;
        }
        WidgetPosition widgetPosition = (WidgetPosition) obj;
        return this.horizontalAlignment == widgetPosition.horizontalAlignment && this.verticalAlignment == widgetPosition.verticalAlignment && Float.compare(this.offsetX, widgetPosition.offsetX) == 0 && Float.compare(this.offsetY, widgetPosition.offsetY) == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WidgetPosition(horizontalAlignment=");
        sb.append(this.horizontalAlignment);
        sb.append(",verticalAlignment=");
        sb.append(this.verticalAlignment);
        sb.append(",offsetX=");
        sb.append(this.offsetX);
        sb.append(",offsetY=");
        return MediaSessionCompatQueueItem.serializer(sb, this.offsetY, ')');
    }

    public /* synthetic */ WidgetPosition(Horizontal horizontal, Vertical vertical, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(horizontal, vertical, f, f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @onItemDismisslambda0
    public WidgetPosition(Horizontal horizontal, Vertical vertical) {
        this(horizontal, vertical, 0.0f, 0.0f);
        horizontal.getClass();
        vertical.getClass();
    }
}
