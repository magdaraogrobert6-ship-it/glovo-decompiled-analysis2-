package o;

import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchImpl extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.layout.PaddingValuesModifier> {
    public final RoomDatabase$$ExternalSyntheticLambda2 read;
    public final SwitchKt serializer;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        androidx.compose.foundation.layout.PaddingValuesModifier paddingValuesModifier = new androidx.compose.foundation.layout.PaddingValuesModifier();
        paddingValuesModifier.serializer = this.serializer;
        return paddingValuesModifier;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) throws Exception {
        this.read.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        ((androidx.compose.foundation.layout.PaddingValuesModifier) node).serializer = this.serializer;
    }

    public SwitchImpl(SwitchKt switchKt, RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2) {
        this.serializer = switchKt;
        this.read = roomDatabase$$ExternalSyntheticLambda2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        SwitchImpl switchImpl = obj instanceof SwitchImpl ? (SwitchImpl) obj : null;
        if (switchImpl == null) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, switchImpl.serializer}, getCieXyz.write())).booleanValue();
    }
}
