package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class BitmapWidget extends Widget {
    private final WidgetPosition originalPosition;
    private final BitmapWidgetRenderer renderer;

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setPosition(WidgetPosition widgetPosition) {
        widgetPosition.getClass();
        getRenderer$maps_sdk_release().setPosition(widgetPosition);
        triggerRepaint$maps_sdk_release();
    }

    public final void updateBitmap(Bitmap bitmap) {
        bitmap.getClass();
        getRenderer$maps_sdk_release().updateBitmap(bitmap);
        triggerRepaint$maps_sdk_release();
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            widgetPosition = new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP);
        }
        this(bitmap, widgetPosition, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2);
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public WidgetPosition getPosition() {
        return getRenderer$maps_sdk_release().getPosition();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public float getRotation() {
        return getRenderer$maps_sdk_release().getRotation();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setRotation(float f) {
        getRenderer$maps_sdk_release().setRotation(f);
        triggerRepaint$maps_sdk_release();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public BitmapWidgetRenderer getRenderer$maps_sdk_release() {
        return this.renderer;
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i & 2) != 0 ? WidgetPositionKt.WidgetPosition(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.renderer.widget.BitmapWidget.1
            public final void invoke(WidgetPosition.Builder builder) {
                builder.getClass();
                builder.m4773setVerticalAlignment(WidgetPosition.Vertical.TOP);
                builder.m4770setHorizontalAlignment(WidgetPosition.Horizontal.LEFT);
                builder.m4771setOffsetX(0.0f);
                builder.m4772setOffsetY(0.0f);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((WidgetPosition.Builder) obj);
                return createFromParcel.INSTANCE;
            }
        }) : widgetPosition);
    }

    public BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition) {
        bitmap.getClass();
        widgetPosition.getClass();
        this.originalPosition = widgetPosition;
        this.renderer = new BitmapWidgetRenderer(bitmap, widgetPosition);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BitmapWidget(Bitmap bitmap) {
        this(bitmap, (WidgetPosition) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        bitmap.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @onItemDismisslambda0
    public BitmapWidget(Bitmap bitmap, final WidgetPosition widgetPosition, final float f, final float f2) {
        this(bitmap, WidgetPositionKt.WidgetPosition(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.renderer.widget.BitmapWidget.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$2$WhenMappings */
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[WidgetPosition.Horizontal.values().length];
                    try {
                        iArr[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[WidgetPosition.Vertical.values().length];
                    try {
                        iArr2[WidgetPosition.Vertical.TOP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            public final void invoke(WidgetPosition.Builder builder) {
                float f3;
                float f4;
                builder.getClass();
                builder.m4770setHorizontalAlignment(widgetPosition.getHorizontalAlignment());
                builder.m4773setVerticalAlignment(widgetPosition.getVerticalAlignment());
                int i = WhenMappings.$EnumSwitchMapping$0[widgetPosition.getHorizontalAlignment().ordinal()];
                if (i == 1 || i == 2) {
                    f3 = f;
                } else {
                    if (i != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    f3 = -f;
                }
                builder.m4771setOffsetX(f3);
                int i2 = WhenMappings.$EnumSwitchMapping$1[widgetPosition.getVerticalAlignment().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    f4 = f2;
                } else {
                    if (i2 != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    f4 = -f2;
                }
                builder.m4772setOffsetY(f4);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((WidgetPosition.Builder) obj);
                return createFromParcel.INSTANCE;
            }
        }));
        bitmap.getClass();
        widgetPosition.getClass();
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            widgetPosition = new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP);
        }
        this(bitmap, widgetPosition, (i & 4) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @onItemDismisslambda0
    public BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f) {
        this(bitmap, widgetPosition, f, 0.0f);
        bitmap.getClass();
        widgetPosition.getClass();
    }
}
