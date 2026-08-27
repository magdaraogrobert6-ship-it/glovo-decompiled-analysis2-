package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class PainterElement extends toDpu2uoSUM {
    public HashMap getLifecycle;
    public final HashMap getNavigationEventDispatcher;
    public final HashMap getOnBackPressedDispatcher;
    public HashMap getSavedStateRegistry;
    public float getViewModelStore;
    public final HashMap invalidateMenu;
    public toDpSizekrfVVM onConfigurationChanged;

    public final float IconCompatParcelizer(String str) {
        HashMap map = this.getNavigationEventDispatcher;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final float write(String str) {
        HashMap map = this.getOnBackPressedDispatcher;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final float RemoteActionCompatParcelizer(String str) {
        HashMap map = this.getLifecycle;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.getLifecycle.get(str)).floatValue();
    }

    public final float serializer(String str) {
        HashMap map = this.getSavedStateRegistry;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.getSavedStateRegistry.get(str)).floatValue();
    }

    public PainterElement(drawBehind drawbehind, toRect torect) {
        super(drawbehind, torect);
        this.getViewModelStore = 0.5f;
        this.invalidateMenu = new HashMap();
        this.getOnBackPressedDispatcher = new HashMap();
        this.getNavigationEventDispatcher = new HashMap();
        this.onConfigurationChanged = toDpSizekrfVVM.SPREAD;
    }
}
