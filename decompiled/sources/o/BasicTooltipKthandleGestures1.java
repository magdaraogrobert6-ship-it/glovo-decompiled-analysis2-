package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasicTooltipKthandleGestures1 {
    public final long MediaSessionCompatResultReceiverWrapper;
    public final animateToWithDecay ParcelableVolumeInfo;
    public final BaselineButtonTokens PlaybackStateCompat;
    public final BasicTooltipKtanchorSemantics111 PlaybackStateCompatCustomAction;

    public BasicTooltipKthandleGestures1(long j, boolean z, BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111, BaselineButtonTokens baselineButtonTokens) {
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        this.ParcelableVolumeInfo = new animateToWithDecay();
        this.PlaybackStateCompatCustomAction = basicTooltipKtanchorSemantics111;
        this.PlaybackStateCompat = baselineButtonTokens;
        this.MediaSessionCompatResultReceiverWrapper = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, z ? androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), 5, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final androidx.compose.foundation.lazy.LazyListMeasuredItem write(int i, long j) {
        BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111 = this.PlaybackStateCompatCustomAction;
        Object objWrite = basicTooltipKtanchorSemantics111.write(i);
        Object objSerializer = basicTooltipKtanchorSemantics111.serializer(i);
        animateToWithDecay animatetowithdecay = this.ParcelableVolumeInfo;
        List list = (List) animatetowithdecay.serializer(i);
        if (list == null) {
            List listWrite = this.PlaybackStateCompat.write(i);
            int size = listWrite.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((androidx.compose.ui.layout.Measurable) listWrite.get(i2)).mo2209measureBRTryo0(j));
            }
            animatetowithdecay.IconCompatParcelizer(i, arrayList);
            list = arrayList;
        }
        BasicTooltipBox basicTooltipBox = (BasicTooltipBox) this;
        return new androidx.compose.foundation.lazy.LazyListMeasuredItem(i, list, basicTooltipBox.IconCompatParcelizer, basicTooltipBox.read, basicTooltipBox.MediaDescriptionCompat, basicTooltipBox.RatingCompat.RemoteActionCompatParcelizer.getLayoutDirection(), basicTooltipBox.write, basicTooltipBox.RemoteActionCompatParcelizer, i != basicTooltipBox.serializer + (-1) ? basicTooltipBox.MediaSessionCompatQueueItem : 0, basicTooltipBox.MediaBrowserCompatMediaItem, objWrite, objSerializer, basicTooltipBox.MediaMetadataCompat.MediaSessionCompatToken, j);
    }
}
