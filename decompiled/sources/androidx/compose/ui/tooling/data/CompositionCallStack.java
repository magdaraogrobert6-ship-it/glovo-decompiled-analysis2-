package androidx.compose.ui.tooling.data;

import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BrazeContentCardsManager;
import o.getOrBuildCachedDrawBlock;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
@UiToolingDataApi
final class CompositionCallStack<T, R> implements SourceContext {
    private IntRect bounds;
    private final Map<getOrBuildCachedDrawBlock, List<R>> childrenToAdd;
    private final Map<String, Object> contexts;
    private final r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds createNode;
    private int currentCallIndex;
    private final BrazeContentCardsManager stack;

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public IntRect getBounds() {
        return this.bounds;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public SourceLocation getLocation() {
        String strMediaMetadataCompat;
        SourceInformationContext sourceInformationContextContextOf;
        String strMediaMetadataCompat2;
        getOrBuildCachedDrawBlock getorbuildcacheddrawblockParentGroup = parentGroup(1);
        if (getorbuildcacheddrawblockParentGroup == null || (strMediaMetadataCompat = getorbuildcacheddrawblockParentGroup.MediaMetadataCompat()) == null || (sourceInformationContextContextOf = contextOf(strMediaMetadataCompat)) == null) {
            return null;
        }
        SourceInformationContext sourceInformationContextContextOf2 = sourceInformationContextContextOf;
        for (int i = 2; i < this.stack.RemoteActionCompatParcelizer; i++) {
            if ((sourceInformationContextContextOf2 != null ? sourceInformationContextContextOf2.getSourceFile() : null) != null) {
                break;
            }
            getOrBuildCachedDrawBlock getorbuildcacheddrawblockParentGroup2 = parentGroup(i);
            sourceInformationContextContextOf2 = (getorbuildcacheddrawblockParentGroup2 == null || (strMediaMetadataCompat2 = getorbuildcacheddrawblockParentGroup2.MediaMetadataCompat()) == null) ? null : contextOf(strMediaMetadataCompat2);
        }
        return sourceInformationContextContextOf.sourceLocation(this.currentCallIndex, sourceInformationContextContextOf2);
    }

    private final SourceInformationContext contextOf(String str) {
        Map<String, Object> map = this.contexts;
        Object objSourceInformationContextOf$default = map.get(str);
        if (objSourceInformationContextOf$default == null) {
            objSourceInformationContextOf$default = SlotTreeKt.sourceInformationContextOf$default(str, null, 2, null);
            map.put(str, objSourceInformationContextOf$default);
        }
        if (objSourceInformationContextOf$default instanceof SourceInformationContext) {
            return (SourceInformationContext) objSourceInformationContextOf$default;
        }
        return null;
    }

    private final getOrBuildCachedDrawBlock getCurrent() {
        return (getOrBuildCachedDrawBlock) this.stack.serializer();
    }

    private final getOrBuildCachedDrawBlock parentGroup(int i) {
        if (this.stack.IconCompatParcelizer() <= i) {
            return null;
        }
        BrazeContentCardsManager brazeContentCardsManager = this.stack;
        return (getOrBuildCachedDrawBlock) brazeContentCardsManager.get((brazeContentCardsManager.IconCompatParcelizer() - i) - 1);
    }

    private final getOrBuildCachedDrawBlock pop() {
        return (getOrBuildCachedDrawBlock) this.stack.removeLast();
    }

    private final void push(getOrBuildCachedDrawBlock getorbuildcacheddrawblock) {
        this.stack.addLast(getorbuildcacheddrawblock);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IntRect convert(getOrBuildCachedDrawBlock getorbuildcacheddrawblock, int i, List<T> list) {
        IntRect intRectBoundsOfLayoutNode;
        ArrayList arrayList = new ArrayList();
        IntRect emptyBox = SlotTreeKt.getEmptyBox();
        push(getorbuildcacheddrawblock);
        int i2 = 0;
        for (getOrBuildCachedDrawBlock getorbuildcacheddrawblock2 : getorbuildcacheddrawblock.write()) {
            emptyBox = SlotTreeKt.union(emptyBox, convert(getorbuildcacheddrawblock2, i2, arrayList));
            if (isCall(getorbuildcacheddrawblock2)) {
                i2++;
            }
        }
        Object obj = getorbuildcacheddrawblock.read();
        List<R> listRemove = null;
        LayoutInfo layoutInfo = obj instanceof LayoutInfo ? (LayoutInfo) obj : null;
        if (layoutInfo != null && (intRectBoundsOfLayoutNode = SlotTreeKt.boundsOfLayoutNode(layoutInfo)) != null) {
            emptyBox = intRectBoundsOfLayoutNode;
        }
        this.currentCallIndex = i;
        this.bounds = emptyBox;
        Map<getOrBuildCachedDrawBlock, List<R>> map = this.childrenToAdd;
        if (map != null) {
            if (map.isEmpty()) {
                map = null;
            }
            if (map != null) {
                listRemove = map.remove(getorbuildcacheddrawblock);
            }
        }
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = this.createNode;
        if (listRemove == null) {
            listRemove = instance_delegatelambda0.write;
        }
        Object objInvoke = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(getorbuildcacheddrawblock, this, arrayList, listRemove);
        if (objInvoke != null) {
            list.add(objInvoke);
        }
        pop();
        return emptyBox;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public int getDepth() {
        return this.stack.IconCompatParcelizer();
    }

    public CompositionCallStack(r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, Map<String, Object> map, Map<getOrBuildCachedDrawBlock, List<R>> map2) {
        this.createNode = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        this.contexts = map;
        this.childrenToAdd = map2;
        this.stack = new BrazeContentCardsManager();
        this.bounds = SlotTreeKt.getEmptyBox();
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public String getName() {
        int i;
        String strMediaMetadataCompat = getCurrent().MediaMetadataCompat();
        if (strMediaMetadataCompat == null) {
            return null;
        }
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(strMediaMetadataCompat, "CC(", false)) {
            i = 3;
        } else {
            if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(strMediaMetadataCompat, "C(", false)) {
                return null;
            }
            i = 2;
        }
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) strMediaMetadataCompat, ')', 0, false, 6);
        if (iWrite > 2) {
            return strMediaMetadataCompat.substring(i, iWrite);
        }
        return null;
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public List<ParameterInformation> getParameters() {
        SourceInformationContext sourceInformationContextContextOf;
        getOrBuildCachedDrawBlock current = getCurrent();
        String strMediaMetadataCompat = current.MediaMetadataCompat();
        if (strMediaMetadataCompat == null || (sourceInformationContextContextOf = contextOf(strMediaMetadataCompat)) == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        onContentCardDismissed.RemoteActionCompatParcelizer(current.RemoteActionCompatParcelizer(), (Collection) arrayList);
        return SlotTreeKt.extractParameterInfo(arrayList, sourceInformationContextContextOf);
    }

    @Override // androidx.compose.ui.tooling.data.SourceContext
    public boolean isInline() {
        String strMediaMetadataCompat = getCurrent().MediaMetadataCompat();
        return strMediaMetadataCompat != null && setCarryoverInAppMessage.RemoteActionCompatParcelizer(strMediaMetadataCompat, "CC", false);
    }

    private final boolean isCall(getOrBuildCachedDrawBlock getorbuildcacheddrawblock) {
        String strMediaMetadataCompat = getorbuildcacheddrawblock.MediaMetadataCompat();
        if (strMediaMetadataCompat != null) {
            return setCarryoverInAppMessage.RemoteActionCompatParcelizer(strMediaMetadataCompat, "C", false);
        }
        return false;
    }

    public /* synthetic */ CompositionCallStack(r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, map, (i & 4) != 0 ? null : map2);
    }
}
