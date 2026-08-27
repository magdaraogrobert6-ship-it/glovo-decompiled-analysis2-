package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.navigation.NavArgsLazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BlockDropShadowElement;
import o.alpha;
import o.createFromParcel;
import o.getBirthDateYear;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM releaseBlock;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM resetBlock;
    private BlockDropShadowElement savableRegistryEntry;
    private final String saveStateKey;
    private final alpha saveStateRegistry;
    private final T typedView;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM updateBlock;

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getReleaseBlock() {
        return this.releaseBlock;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getResetBlock() {
        return this.resetBlock;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    private final void registerSaveStateProvider() {
        alpha alphaVar = this.saveStateRegistry;
        if (alphaVar != null) {
            setSavableRegistryEntry(alphaVar.registerProvider(this.saveStateKey, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder.registerSaveStateProvider.1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    ((ViewFactoryHolder) this.this$0).typedView.saveHierarchyState(sparseArray);
                    return sparseArray;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }
            }));
        }
    }

    private final void setSavableRegistryEntry(BlockDropShadowElement blockDropShadowElement) {
        BlockDropShadowElement blockDropShadowElement2 = this.savableRegistryEntry;
        if (blockDropShadowElement2 != null) {
            ((NavArgsLazy) blockDropShadowElement2).ResultReceiver();
        }
        this.savableRegistryEntry = blockDropShadowElement;
    }

    public final void setReleaseBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.releaseBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        setRelease(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3933invoke() {
                this.this$0.getReleaseBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
                this.this$0.unregisterSaveStateProvider();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3933invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final void setResetBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.resetBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        setReset(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3934invoke() {
                this.this$0.getResetBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3934invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    public final void setUpdateBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.updateBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        setUpdate(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3935invoke() {
                this.this$0.getUpdateBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m3935invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    private ViewFactoryHolder(Context context, getBirthDateYear getbirthdateyear, T t, NestedScrollDispatcher nestedScrollDispatcher, alpha alphaVar, int i, Owner owner) {
        super(context, getbirthdateyear, i, nestedScrollDispatcher, t, owner);
        this.typedView = t;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = alphaVar;
        this.compositeKeyHash = i;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.saveStateKey = strValueOf;
        Object objConsumeRestored = alphaVar != null ? alphaVar.consumeRestored(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            t.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, getBirthDateYear getbirthdateyear, View view, NestedScrollDispatcher nestedScrollDispatcher, alpha alphaVar, int i, Owner owner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : getbirthdateyear, view, (i2 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, alphaVar, i, owner);
    }

    public /* synthetic */ ViewFactoryHolder(Context context, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateYear getbirthdateyear, alpha alphaVar, int i, Owner owner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (i2 & 4) != 0 ? null : getbirthdateyear, alphaVar, i, owner);
    }

    public ViewFactoryHolder(Context context, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateYear getbirthdateyear, alpha alphaVar, int i, Owner owner) {
        this(context, getbirthdateyear, (View) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(context), null, alphaVar, i, owner, 8, null);
    }
}
