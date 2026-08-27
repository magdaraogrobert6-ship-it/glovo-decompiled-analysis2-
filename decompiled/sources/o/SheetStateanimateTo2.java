package o;

import com.qualtrics.digital.EmbeddedFeedbackUtils;

/* JADX INFO: loaded from: classes.dex */
public final class SheetStateanimateTo2 implements TooltipDefaults {
    public final TooltipDefaults read;
    public final int write;

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Ltr;
        return 0;
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Ltr;
        return 0;
    }

    @Override // o.TooltipDefaults
    public final int RemoteActionCompatParcelizer(androidx.compose.ui.unit.Density density) {
        return this.read.RemoteActionCompatParcelizer(density);
    }

    public final int hashCode() {
        return Integer.hashCode(this.write) + (this.read.hashCode() * 31);
    }

    public SheetStateanimateTo2(TooltipDefaults tooltipDefaults, int i) {
        this.read = tooltipDefaults;
        this.write = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetStateanimateTo2)) {
            return false;
        }
        SheetStateanimateTo2 sheetStateanimateTo2 = (SheetStateanimateTo2) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, sheetStateanimateTo2.read}, getCieXyz.write())).booleanValue() && this.write == sheetStateanimateTo2.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.read);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.write;
        int i2 = emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer;
        if ((i & i2) == i2) {
            emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer("Start", sb3);
        }
        int i3 = emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.read;
        if ((i & i3) == i3) {
            emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer("Left", sb3);
        }
        emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer("Top", sb3);
        int i4 = emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.write;
        if ((i & i4) == i4) {
            emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer(EmbeddedFeedbackUtils.END_QUESTIONS_TAG, sb3);
        }
        int i5 = emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.RemoteActionCompatParcelizer;
        if ((i & i5) == i5) {
            emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer("Right", sb3);
        }
        if ((i & 32) == 32) {
            emitcomroadrunnerdeliveryonthewayobserverBuildingHighlightObserverImplonCreate11invokeSuspendlambda0inlinedmap12.serializer("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }

    @Override // o.TooltipDefaults
    public final int read(androidx.compose.ui.unit.Density density) {
        if ((this.write & 32) != 0) {
            return this.read.read(density);
        }
        return 0;
    }
}
