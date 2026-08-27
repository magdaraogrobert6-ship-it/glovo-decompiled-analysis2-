package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    private Paint paint;
    private Object token;

    public final Object getToken() {
        return this.token;
    }

    public final void setToken(Object obj) {
        this.token = obj;
    }

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo598setColor8_81llA(Color.Companion.m756getRed0d7_KjU());
        Paint.mo602setStylek9PVt8s(PaintingStyle.Companion.m1007getStrokeTiuSbCo());
        this.paint = AndroidPaint_androidKt.getNativePaint(Paint);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        RectList rects = DelegatableNodeKt.requireOwner(this).getRectManager().getRects();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        Paint paint = this.paint;
        long[] jArr = rects.items;
        int i = rects.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            nativeCanvas.drawRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2, paint);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.token = DelegatableNodeKt.requireOwner(this).getRectManager().registerOnChangedCallback(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.spatial.RectListDebuggerModifierNode.onAttach.1
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2836invoke();
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2836invoke() {
                DrawModifierNodeKt.invalidateDraw(RectListDebuggerModifierNode.this);
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).getRectManager().unregisterOnChangedCallback(this.token);
    }
}
