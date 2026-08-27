package o;

import com.google.android.gms.internal.mlkit_vision_barcode.zzgz;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.FloatingImageButtonKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setHasPhysicalKeyboard implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ DragAndDropTargetModifierNode write;

    public /* synthetic */ setHasPhysicalKeyboard(DragAndDropTargetModifierNode dragAndDropTargetModifierNode, int i, int i2) {
        this.serializer = i2;
        this.write = dragAndDropTargetModifierNode;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).getClass();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.RemoteActionCompatParcelizer;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i3 != 0) {
            if (i3 != 1) {
                FloatingImageButtonKt.serializer(dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
                return createfromparcel2;
            }
            zzgz.serializer(dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        androidx.compose.material3.SheetDefaultsKt.DragHandleWithTooltip(dragAndDropTargetModifierNode, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
        int i5 = IconCompatParcelizer + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
