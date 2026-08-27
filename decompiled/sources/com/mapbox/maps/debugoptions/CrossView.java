package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.maps.UtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class CrossView extends View {
    private final Paint greenPaint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint(0);
        paint.setColor(PaddingDebugViewKt.GREEN_DARK);
        paint.setStrokeWidth(UtilsKt.toDP(Float.valueOf(1.0f), context).floatValue());
        this.greenPaint = paint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        float height = canvas.getHeight() / 2.0f;
        float width = canvas.getWidth() / 2.0f;
        canvas.drawLine(0.0f, height, canvas.getWidth(), height, this.greenPaint);
        canvas.drawLine(width, 0.0f, width, canvas.getHeight(), this.greenPaint);
    }

    public /* synthetic */ CrossView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
