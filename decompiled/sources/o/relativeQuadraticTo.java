package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class relativeQuadraticTo extends opN5in7k0 implements Iterable, displayInAppMessagelambda121 {
    public static final /* synthetic */ int read = 0;
    public final androidx.recyclerview.widget.ChildHelper IconCompatParcelizer;

    @Override // o.opN5in7k0
    public final int hashCode() {
        androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
        int iIconCompatParcelizer = childHelper.IconCompatParcelizer;
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) childHelper.write;
        int iWrite = accessprocessdragstart.write();
        for (int i = 0; i < iWrite; i++) {
            iIconCompatParcelizer = (((iIconCompatParcelizer * 31) + accessprocessdragstart.IconCompatParcelizer(i)) * 31) + ((opN5in7k0) accessprocessdragstart.read(i)).hashCode();
        }
        return iIconCompatParcelizer;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
        childHelper.getClass();
        return new AndroidVertexMode_androidKt(childHelper);
    }

    @Override // o.opN5in7k0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
        String str = (String) childHelper.MediaSessionCompatQueueItem;
        childHelper.getClass();
        opN5in7k0 opn5in7k0RemoteActionCompatParcelizer = (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) ? null : childHelper.RemoteActionCompatParcelizer(str, true);
        if (opn5in7k0RemoteActionCompatParcelizer == null) {
            opn5in7k0RemoteActionCompatParcelizer = childHelper.RemoteActionCompatParcelizer(childHelper.IconCompatParcelizer);
        }
        sb.append(" startDestination=");
        if (opn5in7k0RemoteActionCompatParcelizer == null) {
            String str2 = (String) childHelper.MediaSessionCompatQueueItem;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) childHelper.read;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(childHelper.IconCompatParcelizer));
                }
            }
        } else {
            sb.append("{");
            sb.append(opn5in7k0RemoteActionCompatParcelizer.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    @Override // o.opN5in7k0
    public final void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        super.RemoteActionCompatParcelizer(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, getPath.NavGraphNavigator);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) childHelper.serializer;
        if (resourceId == relativequadraticto.serializer.RemoteActionCompatParcelizer) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + relativequadraticto).toString());
        }
        if (((String) childHelper.MediaSessionCompatQueueItem) != null) {
            childHelper.IconCompatParcelizer((String) null);
        }
        childHelper.IconCompatParcelizer = resourceId;
        childHelper.read = null;
        int i = childHelper.IconCompatParcelizer;
        if (i <= 16777215) {
            strValueOf = String.valueOf(i);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i);
                strValueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
        }
        childHelper.read = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final relativeCubicTo read(String str, boolean z, opN5in7k0 opn5in7k0) {
        relativeCubicTo relativecubictoSerializer;
        str.getClass();
        androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
        childHelper.getClass();
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) childHelper.serializer;
        relativeCubicTo relativecubictoSerializer2 = relativequadraticto.serializer.serializer(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = relativequadraticto.iterator();
        while (true) {
            AndroidVertexMode_androidKt androidVertexMode_androidKt = (AndroidVertexMode_androidKt) it;
            relativecubictoSerializer = null;
            if (!androidVertexMode_androidKt.hasNext()) {
                break;
            }
            opN5in7k0 opn5in7k1 = (opN5in7k0) androidVertexMode_androidKt.next();
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{opn5in7k1, opn5in7k0}, iWrite3)).booleanValue()) {
                if (opn5in7k1 instanceof relativeQuadraticTo) {
                    relativecubictoSerializer = ((relativeQuadraticTo) opn5in7k1).read(str, false, relativequadraticto);
                } else {
                    opn5in7k1.getClass();
                    relativecubictoSerializer = opn5in7k1.serializer.serializer(str);
                }
            }
            if (relativecubictoSerializer != null) {
                arrayList.add(relativecubictoSerializer);
            }
        }
        relativeCubicTo relativecubicto = (relativeCubicTo) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) arrayList);
        relativeQuadraticTo relativequadraticto2 = relativequadraticto.MediaDescriptionCompat;
        if (relativequadraticto2 != null && z && !relativequadraticto2.equals(opn5in7k0)) {
            relativecubictoSerializer = relativequadraticto2.read(str, true, relativequadraticto);
        }
        return (relativeCubicTo) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new relativeCubicTo[]{relativecubictoSerializer2, relativecubicto, relativecubictoSerializer}));
    }

    @Override // o.opN5in7k0
    public final relativeCubicTo RemoteActionCompatParcelizer(androidx.navigation.NavArgsLazy navArgsLazy) {
        relativeCubicTo relativecubictoRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(navArgsLazy);
        androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
        childHelper.getClass();
        return childHelper.IconCompatParcelizer(relativecubictoRemoteActionCompatParcelizer, navArgsLazy, false, (opN5in7k0) childHelper.serializer);
    }

    public final relativeCubicTo read(androidx.navigation.NavArgsLazy navArgsLazy, opN5in7k0 opn5in7k0) {
        return this.IconCompatParcelizer.IconCompatParcelizer(super.RemoteActionCompatParcelizer(navArgsLazy), navArgsLazy, true, opn5in7k0);
    }

    public relativeQuadraticTo(rewind rewindVar) {
        super(rewindVar);
        this.IconCompatParcelizer = new androidx.recyclerview.widget.ChildHelper(this);
    }

    @Override // o.opN5in7k0
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof relativeQuadraticTo) || !super.equals(obj)) {
                return false;
            }
            androidx.recyclerview.widget.ChildHelper childHelper = this.IconCompatParcelizer;
            int iWrite = ((accessprocessDragStart) childHelper.write).write();
            androidx.recyclerview.widget.ChildHelper childHelper2 = ((relativeQuadraticTo) obj).IconCompatParcelizer;
            if (iWrite != ((accessprocessDragStart) childHelper2.write).write() || childHelper.IconCompatParcelizer != childHelper2.IconCompatParcelizer) {
                return false;
            }
            accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) childHelper.write;
            accessprocessdragstart.getClass();
            for (opN5in7k0 opn5in7k0 : (requestDisplayInAppMessagelambda4) resetAfterInAppMessageCloselambda2.serializer(new EmptyContentCardsAdapterNetworkUnavailableViewHolder(1, accessprocessdragstart))) {
                accessprocessDragStart accessprocessdragstart2 = (accessprocessDragStart) childHelper2.write;
                int i = opn5in7k0.serializer.RemoteActionCompatParcelizer;
                accessprocessdragstart2.getClass();
                if (!opn5in7k0.equals(isInterested.RemoteActionCompatParcelizer(accessprocessdragstart2, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
