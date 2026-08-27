package com.mapbox.maps.plugin.indoorselector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.i$d;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.IndoorManager;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.LifecyclePlugin;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.ViewPlugin;
import com.mapbox.maps.plugin.indoorselector.generated.IndoorSelectorSettings;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import o.instance_delegatelambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IndoorSelectorPluginImpl implements ViewPlugin, LifecyclePlugin {
    public Cancelable cancelable;
    public IndoorManager indoorManager;
    public IndoorSelectorViewImpl indoorSelectorView;
    public String selectedFloorId;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM viewImplProvider = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.maps.plugin.indoorselector.IndoorSelectorPluginImpl.1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Context context = (Context) obj;
            context.getClass();
            return new IndoorSelectorViewImpl(context);
        }
    };
    public final IndoorSelectorSettings internalSettings = new IndoorSelectorSettings(true, 8388661, 8.0f, 60.0f, 8.0f, 8.0f);
    public final CopyOnWriteArraySet floorSelectedListeners = new CopyOnWriteArraySet();
    public List currentFloors = instance_delegatelambda0.write;
    public final IndoorSelectorPluginImpl$$ExternalSyntheticLambda0 onFloorSelectedListener = new IndoorSelectorPluginImpl$$ExternalSyntheticLambda0(this);
    public final i$d.a onIndoorUpdatedCallback = new i$d.a(27, this);

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStart() {
        updateIndoorVisibility();
    }

    @Override // com.mapbox.maps.plugin.LifecyclePlugin
    public final void onStop() {
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void cleanup() {
        this.floorSelectedListeners.clear();
        Cancelable cancelable = this.cancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.currentFloors = instance_delegatelambda0.write;
        this.selectedFloorId = null;
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
    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void initialize() {
        IndoorSelectorSettings indoorSelectorSettings = this.internalSettings;
        boolean z = indoorSelectorSettings.enabled;
        IndoorSelectorViewImpl indoorSelectorViewImpl = this.indoorSelectorView;
        if (indoorSelectorViewImpl == null) {
            removeNodeAtDepth.serializer("indoorSelectorView");
            throw null;
        }
        indoorSelectorViewImpl.setIndoorSelectorVisible(z);
        indoorSelectorViewImpl.setIndoorGravity(indoorSelectorSettings.position);
        int i = (int) indoorSelectorSettings.marginLeft;
        int i2 = (int) indoorSelectorSettings.marginTop;
        int i3 = (int) indoorSelectorSettings.marginRight;
        int i4 = (int) indoorSelectorSettings.marginBottom;
        ViewGroup.LayoutParams layoutParams = indoorSelectorViewImpl.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(i, i2, i3, i4);
            indoorSelectorViewImpl.setLayoutParams(layoutParams2);
        }
        if (z) {
            IndoorManager indoorManager = this.indoorManager;
            if (indoorManager == null) {
                removeNodeAtDepth.serializer("indoorManager");
                throw null;
            }
            this.cancelable = indoorManager.subscribeOnIndoorUpdated(this.onIndoorUpdatedCallback);
            IndoorSelectorPluginImpl$$ExternalSyntheticLambda0 indoorSelectorPluginImpl$$ExternalSyntheticLambda0 = this.onFloorSelectedListener;
            indoorSelectorPluginImpl$$ExternalSyntheticLambda0.getClass();
            this.floorSelectedListeners.add(indoorSelectorPluginImpl$$ExternalSyntheticLambda0);
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public final void onDelegateProvider(MapDelegateProviderImpl mapDelegateProviderImpl) {
        this.indoorManager = (IndoorManager) mapDelegateProviderImpl.indoorManager;
    }

    public final void updateIndoorVisibility() {
        boolean z = this.internalSettings.enabled && !this.currentFloors.isEmpty();
        IndoorSelectorViewImpl indoorSelectorViewImpl = this.indoorSelectorView;
        if (indoorSelectorViewImpl != null) {
            indoorSelectorViewImpl.setIndoorSelectorVisible(z);
        } else {
            removeNodeAtDepth.serializer("indoorSelectorView");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final View bind(MapView mapView, AttributeSet attributeSet, float f) {
        mapView.getClass();
        Context context = mapView.getContext();
        context.getClass();
        Object objInvoke = this.viewImplProvider.invoke(context);
        IndoorSelectorViewImpl indoorSelectorViewImpl = (IndoorSelectorViewImpl) objInvoke;
        indoorSelectorViewImpl.getClass();
        indoorSelectorViewImpl.presenter = this;
        return (View) objInvoke;
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public final void onPluginView(View view) {
        view.getClass();
        IndoorSelectorViewImpl indoorSelectorViewImpl = view instanceof IndoorSelectorViewImpl ? (IndoorSelectorViewImpl) view : null;
        if (indoorSelectorViewImpl == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The provided view needs to implement IndoorSelectorView");
        } else {
            this.indoorSelectorView = indoorSelectorViewImpl;
            updateIndoorVisibility();
        }
    }
}
