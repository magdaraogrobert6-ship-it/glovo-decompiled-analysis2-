package androidx.compose.ui.platform;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContentInViewNode;
import o.DefaultFlingBehaviorperformFling2;
import o.DragAndDropTarget;
import o.DragAndDropTransferData;
import o.getClipData;
import o.getFlags;
import o.getLocalState;
import o.onRemeasuredozmzZPI;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleRetainedValuesStore implements DragAndDropTransferData {
    public static final int $stable = 8;
    private final getFlags delegate;

    public final getFlags getDelegate() {
        return this.delegate;
    }

    public void onContentEnteredComposition() {
    }

    public void onContentExitComposition() {
    }

    public Object consumeExitedValueOrDefault(Object obj, Object obj2) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.delegate.RemoteActionCompatParcelizer;
        Object getclipdata = getLocalState.serializer;
        if (obj == null) {
            obj = getclipdata;
        }
        Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(obj);
        if (objMediaBrowserCompatMediaItem == null) {
            return obj2;
        }
        if (!(objMediaBrowserCompatMediaItem instanceof ContentInViewNode)) {
            onremeasuredozmzzpi.IconCompatParcelizer(obj);
            if (objMediaBrowserCompatMediaItem instanceof getClipData) {
                return ((getClipData) objMediaBrowserCompatMediaItem).serializer();
            }
            if (objMediaBrowserCompatMediaItem == getclipdata) {
                return null;
            }
            return objMediaBrowserCompatMediaItem;
        }
        ContentInViewNode contentInViewNode = (ContentInViewNode) objMediaBrowserCompatMediaItem;
        Object objWrite = contentInViewNode.write(contentInViewNode.IconCompatParcelizer - 1);
        if (contentInViewNode.write()) {
            onremeasuredozmzzpi.IconCompatParcelizer(obj);
        }
        if (contentInViewNode.IconCompatParcelizer == 1) {
            Object objSerializer = contentInViewNode.serializer();
            if (objSerializer instanceof ContentInViewNode) {
                getclipdata = new getClipData(objSerializer);
            } else if (objSerializer != null) {
                getclipdata = objSerializer;
            }
            onremeasuredozmzzpi.write(obj, getclipdata);
        }
        return objWrite;
    }

    public final void endLifecycleTransition() {
        getFlags getflags = this.delegate;
        if (getflags.IconCompatParcelizer) {
            return;
        }
        if (getflags.read) {
            DragAndDropTarget.serializer("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        getflags.serializer();
        getflags.read = true;
    }

    public final boolean isRetainingExitedValues() {
        getFlags getflags = this.delegate;
        return getflags.write && !getflags.read;
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
    public void saveExitingValue(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object getclipdata;
        getFlags getflags = this.delegate;
        if (!getflags.write || getflags.read) {
            return;
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi = getflags.RemoteActionCompatParcelizer;
        Object obj5 = getLocalState.serializer;
        if (obj == null) {
            obj3 = obj;
            obj3 = obj5;
        }
        obj3 = obj;
        int iWrite = onremeasuredozmzzpi.write(obj3);
        boolean z = iWrite < 0;
        Object objSerializer = null;
        Object obj6 = z ? null : onremeasuredozmzzpi.MediaMetadataCompat[iWrite];
        if (obj6 == null) {
            if (obj2 instanceof ContentInViewNode) {
                getclipdata = obj5;
                obj4 = obj2;
                getclipdata = new getClipData(obj2);
            } else if (obj2 == null) {
            }
            obj4 = getclipdata;
        } else if (obj6 instanceof ContentInViewNode) {
            ContentInViewNode contentInViewNode = (ContentInViewNode) obj6;
            contentInViewNode.read(obj2);
            obj4 = contentInViewNode;
        } else {
            if (obj6 instanceof getClipData) {
                objSerializer = ((getClipData) obj6).serializer();
            } else if (obj6 != obj5) {
                objSerializer = obj6;
            }
            Object[] objArr = DefaultFlingBehaviorperformFling2.read;
            ContentInViewNode contentInViewNode2 = new ContentInViewNode(2);
            contentInViewNode2.read(objSerializer);
            contentInViewNode2.read(obj2);
            getclipdata = contentInViewNode2;
            obj4 = getclipdata;
        }
        if (!z) {
            onremeasuredozmzzpi.MediaMetadataCompat[iWrite] = obj4;
            return;
        }
        int i = ~iWrite;
        onremeasuredozmzzpi.IconCompatParcelizer[i] = obj3;
        onremeasuredozmzzpi.MediaMetadataCompat[i] = obj4;
    }

    public final void startLifecycleTransition() {
        getFlags getflags = this.delegate;
        if (getflags.IconCompatParcelizer) {
            return;
        }
        if (!getflags.read) {
            DragAndDropTarget.serializer("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!getflags.RemoteActionCompatParcelizer.read()) {
            DragAndDropTarget.serializer("Attempted to start retaining exited values with pending exited values");
        }
        getflags.read = false;
    }

    public LifecycleRetainedValuesStore(getFlags getflags) {
        this.delegate = getflags;
        if (getflags.IconCompatParcelizer) {
            return;
        }
        if (getflags.read) {
            DragAndDropTarget.serializer("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        getflags.serializer();
        getflags.read = true;
    }

    public final void dispose() {
        getFlags getflags = this.delegate;
        getflags.IconCompatParcelizer = true;
        getflags.write = false;
        getflags.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleRetainedValuesStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LifecycleRetainedValuesStore(getFlags getflags, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new getFlags() : getflags);
    }
}
