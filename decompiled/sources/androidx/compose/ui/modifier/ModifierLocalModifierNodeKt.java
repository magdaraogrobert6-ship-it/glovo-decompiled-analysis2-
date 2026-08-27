package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.applyDisplayCutoutMarginsToContentArealambda0;
import o.onContentCardClicked;
import o.onItemDismisslambda0;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    @onItemDismisslambda0
    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new SingleLocalMap((ModifierLocal) onContentCardClicked.serializer(modifierLocalArr));
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(onContentCardClicked.serializer(modifierLocalArr), null);
        List list = onContentCardClicked.read(1, modifierLocalArr);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new onViewAttachedToWindowlambda0((ModifierLocal) list.get(i), null));
        }
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = (onViewAttachedToWindowlambda0[]) arrayList.toArray(new onViewAttachedToWindowlambda0[0]);
        return new MultiLocalMap(onviewattachedtowindowlambda0, (onViewAttachedToWindowlambda0[]) Arrays.copyOf(onviewattachedtowindowlambda0Arr, onviewattachedtowindowlambda0Arr.length));
    }

    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ModifierLocalMap modifierLocalMapOf(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0) {
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) onviewattachedtowindowlambda0.serializer);
        singleLocalMap.mo2368set$ui((ModifierLocal) onviewattachedtowindowlambda0.serializer, onviewattachedtowindowlambda0.write);
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0, onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1, onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(2);
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(onviewattachedtowindowlambda1);
        applydisplaycutoutmarginstocontentarealambda0.serializer(onviewattachedtowindowlambda0Arr);
        ArrayList arrayList = applydisplaycutoutmarginstocontentarealambda0.write;
        return new MultiLocalMap(onviewattachedtowindowlambda0, (onViewAttachedToWindowlambda0[]) arrayList.toArray(new onViewAttachedToWindowlambda0[arrayList.size()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> modifierLocal, ModifierLocal<?> modifierLocal2, ModifierLocal<?>... modifierLocalArr) {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(modifierLocal, null);
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0(2);
        applydisplaycutoutmarginstocontentarealambda0.IconCompatParcelizer(new onViewAttachedToWindowlambda0(modifierLocal2, null));
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(new onViewAttachedToWindowlambda0(modifierLocal3, null));
        }
        applydisplaycutoutmarginstocontentarealambda0.serializer(arrayList.toArray(new onViewAttachedToWindowlambda0[0]));
        ArrayList arrayList2 = applydisplaycutoutmarginstocontentarealambda0.write;
        return new MultiLocalMap(onviewattachedtowindowlambda0, (onViewAttachedToWindowlambda0[]) arrayList2.toArray(new onViewAttachedToWindowlambda0[arrayList2.size()]));
    }

    @onItemDismisslambda0
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        int length = onviewattachedtowindowlambda0Arr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) onContentCardClicked.serializer(onviewattachedtowindowlambda0Arr);
            onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr2 = (onViewAttachedToWindowlambda0[]) onContentCardClicked.read(1, onviewattachedtowindowlambda0Arr).toArray(new onViewAttachedToWindowlambda0[0]);
            return new MultiLocalMap(onviewattachedtowindowlambda0, (onViewAttachedToWindowlambda0[]) Arrays.copyOf(onviewattachedtowindowlambda0Arr2, onviewattachedtowindowlambda0Arr2.length));
        }
        return new MultiLocalMap((onViewAttachedToWindowlambda0) onContentCardClicked.serializer(onviewattachedtowindowlambda0Arr), new onViewAttachedToWindowlambda0[0]);
    }
}
