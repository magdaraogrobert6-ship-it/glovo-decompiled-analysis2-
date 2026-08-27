package o;

import com.mapbox.search.SearchEngineImpl$search$3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class GestureCancellationException extends Lambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList IconCompatParcelizer;
    public final /* synthetic */ positionChangeInternalwfG_k4k RemoteActionCompatParcelizer;
    public final /* synthetic */ DragAndDropTargetModifierNode read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GestureCancellationException(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, Object obj, positionChangeInternalwfG_k4k positionchangeinternalwfg_k4k, DragAndDropTargetModifierNode dragAndDropTargetModifierNode) {
        super(3);
        this.IconCompatParcelizer = snapshotStateList;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = positionchangeinternalwfg_k4k;
        this.read = dragAndDropTargetModifierNode;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope = (androidx.compose.animation.AnimatedVisibilityScope) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? ((getPostalCode) getbirthdatefull).read(animatedVisibilityScope) : ((getPostalCode) getbirthdatefull).IconCompatParcelizer(animatedVisibilityScope) ? 4 : 2;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.IconCompatParcelizer;
            boolean z = getpostalcode.read(snapshotStateList);
            Object obj4 = this.serializer;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(obj4);
            positionChangeInternalwfG_k4k positionchangeinternalwfg_k4k = this.RemoteActionCompatParcelizer;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(positionchangeinternalwfg_k4k);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SearchEngineImpl$search$3(snapshotStateList, obj4, positionchangeinternalwfg_k4k, 1);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.serializer(animatedVisibilityScope, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            onRemeasuredozmzZPI onremeasuredozmzzpi = positionchangeinternalwfg_k4k.serializer;
            animatedVisibilityScope.getClass();
            onremeasuredozmzzpi.write(obj4, ((ScrollExtensionsKt) animatedVisibilityScope).IconCompatParcelizer);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new sendDragEventEu1f8Dk(animatedVisibilityScope);
                getpostalcode.write(objComponentActivity2);
            }
            this.read.invoke((sendDragEventEu1f8Dk) objComponentActivity2, obj4, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
