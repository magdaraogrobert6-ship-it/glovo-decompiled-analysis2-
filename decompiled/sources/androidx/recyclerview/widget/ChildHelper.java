package androidx.recyclerview.widget;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.NavArgsLazy;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.wisesecurity.ucs_credential.x;
import com.sentiance.core.model.events.I$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AndroidVertexMode_androidKt;
import o.ClipboardExtensions_androidKt;
import o.DrawableTransformation;
import o.EmptyContentCardsAdapterNetworkUnavailableViewHolder;
import o.InterfaceC0185m;
import o.NodeCoordinatorKt;
import o.NodeCoordinatorupdateLayerParameters1;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.accessgetDisposedp;
import o.accessprocessDragStart;
import o.accesssetAddedToLifecyclep;
import o.accesssetLastContentp;
import o.colorResource;
import o.distanceInMinimumTouchTargettz77jQw;
import o.getCieXyz;
import o.getClipMetadata;
import o.getForceMeasureWithLookaheadConstraintsui;
import o.getMinimumTouchTargetSizeNHjbRc;
import o.getRectManager;
import o.getRetainedValuesStore;
import o.getTextInputService;
import o.headH91voCI;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAppSetIdReadingEnabled;
import o.isDisposed;
import o.isInterested;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.opN5in7k0;
import o.r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.relativeCubicTo;
import o.relativeQuadraticTo;
import o.removeNodeAtDepth;
import o.requestDisplayInAppMessagelambda4;
import o.resetAfterInAppMessageCloselambda2;
import o.resizeGraphicFrameIfAppropriatelambda0;
import o.setCarryoverInAppMessage;
import o.setOffset;
import o.updateLayerParameters;
import o.visitNodes;

/* JADX INFO: loaded from: classes.dex */
public final class ChildHelper {
    public int IconCompatParcelizer;
    public Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public Object read;
    public final Object serializer;
    public final Object write;

    public ChildHelper(getMinimumTouchTargetSizeNHjbRc getminimumtouchtargetsizenhjbrc, getTextInputService gettextinputservice, I$b i$b) {
        this.RemoteActionCompatParcelizer = 2;
        distanceInMinimumTouchTargettz77jQw distanceinminimumtouchtargettz77jqw = new distanceInMinimumTouchTargettz77jQw(i$b, 0);
        distanceInMinimumTouchTargettz77jQw distanceinminimumtouchtargettz77jqw2 = new distanceInMinimumTouchTargettz77jQw(i$b, 1);
        this.IconCompatParcelizer = 50;
        this.write = getminimumtouchtargetsizenhjbrc;
        this.serializer = new colorResource(this, 29, gettextinputservice);
        this.read = distanceinminimumtouchtargettz77jqw;
        this.MediaSessionCompatQueueItem = distanceinminimumtouchtargettz77jqw2;
    }

    public int IconCompatParcelizer() {
        return RecyclerView.this.getChildCount() - ((ArrayList) this.read).size();
    }

    public relativeCubicTo IconCompatParcelizer(relativeCubicTo relativecubicto, NavArgsLazy navArgsLazy, boolean z, opN5in7k0 opn5in7k0) {
        relativeCubicTo relativecubictoRemoteActionCompatParcelizer;
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) this.serializer;
        ArrayList arrayList = new ArrayList();
        Iterator it = relativequadraticto.iterator();
        while (true) {
            AndroidVertexMode_androidKt androidVertexMode_androidKt = (AndroidVertexMode_androidKt) it;
            relativecubictoRemoteActionCompatParcelizer = null;
            if (!androidVertexMode_androidKt.hasNext()) {
                break;
            }
            opN5in7k0 opn5in7k1 = (opN5in7k0) androidVertexMode_androidKt.next();
            relativecubictoRemoteActionCompatParcelizer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{opn5in7k1, opn5in7k0}, getCieXyz.write())).booleanValue() ? null : opn5in7k1.RemoteActionCompatParcelizer(navArgsLazy);
            if (relativecubictoRemoteActionCompatParcelizer != null) {
                arrayList.add(relativecubictoRemoteActionCompatParcelizer);
            }
        }
        relativeCubicTo relativecubicto2 = (relativeCubicTo) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) arrayList);
        relativeQuadraticTo relativequadraticto2 = relativequadraticto.MediaDescriptionCompat;
        if (relativequadraticto2 != null && z && !relativequadraticto2.equals(opn5in7k0)) {
            relativecubictoRemoteActionCompatParcelizer = relativequadraticto2.read(navArgsLazy, relativequadraticto);
        }
        return (relativeCubicTo) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new relativeCubicTo[]{relativecubicto, relativecubicto2, relativecubictoRemoteActionCompatParcelizer}));
    }

    public void IconCompatParcelizer(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : read(i);
        ((resizeGraphicFrameIfAppropriatelambda0) this.write).RemoteActionCompatParcelizer(childCount, z);
        if (z) {
            serializer(view);
        }
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                DrawableTransformation.read(sb, (Object) recyclerView.exceptionLabel());
                return;
            } else {
                if (RecyclerView.MediaDescriptionCompat) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
        } else if (RecyclerView.MediaSessionCompatQueueItem) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strExceptionLabel = recyclerView.exceptionLabel();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strExceptionLabel);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void IconCompatParcelizer(String str) {
        int iHashCode;
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) this.serializer;
        if (str == null) {
            iHashCode = 0;
        } else if (str.equals((String) relativequadraticto.serializer.read)) {
            DrawableTransformation.serializer("Start destination ", str, " cannot use the same route as the graph ", relativequadraticto);
            return;
        } else if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot have an empty start destination route");
            return;
        } else {
            int i = opN5in7k0.write;
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.IconCompatParcelizer = iHashCode;
        this.MediaSessionCompatQueueItem = str;
    }

    public void MediaSessionCompatQueueItem(int i) {
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.serializer;
        int i2 = this.IconCompatParcelizer;
        if (i2 == 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int i3 = read(i);
            View childAt = RecyclerView.this.getChildAt(i3);
            if (childAt == null) {
                return;
            }
            this.IconCompatParcelizer = 1;
            this.MediaSessionCompatQueueItem = childAt;
            if (((resizeGraphicFrameIfAppropriatelambda0) this.write).write(i3)) {
                write(childAt);
            }
            anonymousClass7.read(i3);
        } finally {
            this.IconCompatParcelizer = 0;
            this.MediaSessionCompatQueueItem = null;
        }
    }

    public NodeCoordinatorupdateLayerParameters1 RemoteActionCompatParcelizer(int i, byte[] bArr) {
        getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui = (getForceMeasureWithLookaheadConstraintsui) this.write;
        try {
            if (bArr.length < 1000000) {
                return getforcemeasurewithlookaheadconstraintsui.read(WriteBatch.parseFrom(bArr));
            }
            ArrayList arrayList = new ArrayList();
            ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
            arrayList.add(getClipMetadata.read(bArr, 0, bArr.length));
            boolean z = true;
            while (z) {
                int size = arrayList.size();
                x xVar = ((headH91voCI) this.serializer).read("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                xVar.IconCompatParcelizer(Integer.valueOf((size * 1000000) + 1), 1000000, (String) this.read, Integer.valueOf(i));
                Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
                try {
                    if (cursorIconCompatParcelizer.moveToFirst()) {
                        byte[] blob = cursorIconCompatParcelizer.getBlob(0);
                        ClipboardExtensions_androidKt clipboardExtensions_androidKt2 = getClipMetadata.serializer;
                        arrayList.add(getClipMetadata.read(blob, 0, blob.length));
                        if (blob.length < 1000000) {
                            z = false;
                        }
                    }
                    cursorIconCompatParcelizer.close();
                } catch (Throwable th) {
                    if (cursorIconCompatParcelizer != null) {
                        try {
                            cursorIconCompatParcelizer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            int size2 = arrayList.size();
            return getforcemeasurewithlookaheadconstraintsui.read(WriteBatch.parseFrom(size2 == 0 ? getClipMetadata.serializer : getClipMetadata.RemoteActionCompatParcelizer(arrayList.iterator(), size2)));
        } catch (InvalidProtocolBufferException e) {
            getRectManager.write("MutationBatch failed to parse: %s", e);
            throw null;
        }
    }

    public void RemoteActionCompatParcelizer() {
        ((headH91voCI) this.serializer).IconCompatParcelizer("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", (String) this.read, -1, ((getClipMetadata) this.MediaSessionCompatQueueItem).MediaDescriptionCompat());
    }

    public void addView(View view, int i, boolean z) {
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i < 0 ? recyclerView.getChildCount() : read(i);
        ((resizeGraphicFrameIfAppropriatelambda0) this.write).RemoteActionCompatParcelizer(childCount, z);
        if (z) {
            serializer(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView.Adapter adapter = recyclerView.MediaSessionCompatResultReceiverWrapper;
        if (adapter != null && childViewHolderInt != null) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        ArrayList arrayList = recyclerView.addMenuProvider;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC0185m) recyclerView.addMenuProvider.get(size)).RemoteActionCompatParcelizer(view);
            }
        }
    }

    public int read(int i) {
        resizeGraphicFrameIfAppropriatelambda0 resizegraphicframeifappropriatelambda0 = (resizeGraphicFrameIfAppropriatelambda0) this.write;
        if (i < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int i3 = i - (i2 - resizegraphicframeifappropriatelambda0.read(i2));
            if (i3 == 0) {
                while (resizegraphicframeifappropriatelambda0.IconCompatParcelizer(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += i3;
        }
        return -1;
    }

    public accesssetLastContentp read(WrappedCompositionsetContent12 wrappedCompositionsetContent12) throws WrappedCompositionsetContent1ExternalSyntheticLambda0 {
        int i = this.IconCompatParcelizer;
        if (i >= ((List) this.read).size()) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
        accessgetDisposedp accessgetdisposedp = (accessgetDisposedp) this.serializer;
        List list = (List) this.read;
        accesssetLastContentp accesssetlastcontentp = ((accesssetAddedToLifecyclep) list.get(i)).read(new ChildHelper(accessgetdisposedp, wrappedCompositionsetContent12, list, i + 1, (i$d.a) this.write));
        if (accesssetlastcontentp != null) {
            return accesssetlastcontentp;
        }
        throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isDisposed.write(10307));
    }

    public void read() {
        headH91voCI headh91voci = (headH91voCI) this.serializer;
        x xVar = headh91voci.read("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = (String) this.read;
        xVar.IconCompatParcelizer(str);
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        try {
            boolean zMoveToFirst = cursorIconCompatParcelizer.moveToFirst();
            cursorIconCompatParcelizer.close();
            if (zMoveToFirst) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            x xVar2 = headh91voci.read("SELECT path FROM document_mutations WHERE uid = ?");
            xVar2.IconCompatParcelizer(str);
            Cursor cursorIconCompatParcelizer2 = xVar2.IconCompatParcelizer();
            while (cursorIconCompatParcelizer2.moveToNext()) {
                try {
                    arrayList.add(updateLayerParameters.RemoteActionCompatParcelizer(cursorIconCompatParcelizer2.getString(0)));
                } catch (Throwable th) {
                    if (cursorIconCompatParcelizer2 != null) {
                        try {
                            cursorIconCompatParcelizer2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            cursorIconCompatParcelizer2.close();
            getRectManager.RemoteActionCompatParcelizer(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        } catch (Throwable th3) {
            if (cursorIconCompatParcelizer != null) {
                try {
                    cursorIconCompatParcelizer.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public List serializer() {
        ArrayList arrayList = new ArrayList();
        x xVar = ((headH91voCI) this.serializer).read("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        xVar.IconCompatParcelizer(1000000, (String) this.read);
        Cursor cursorIconCompatParcelizer = xVar.IconCompatParcelizer();
        while (cursorIconCompatParcelizer.moveToNext()) {
            try {
                arrayList.add(RemoteActionCompatParcelizer(cursorIconCompatParcelizer.getInt(0), cursorIconCompatParcelizer.getBlob(1)));
            } catch (Throwable th) {
                if (cursorIconCompatParcelizer != null) {
                    try {
                        cursorIconCompatParcelizer.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorIconCompatParcelizer.close();
        return arrayList;
    }

    public opN5in7k0 serializer(int i, opN5in7k0 opn5in7k0, opN5in7k0 opn5in7k1, boolean z) {
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) this.serializer;
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) this.write;
        accessprocessdragstart.getClass();
        opN5in7k0 opn5in7k0Serializer = (opN5in7k0) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
        if (opn5in7k1 != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{opn5in7k0Serializer, opn5in7k1}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{opn5in7k0Serializer.MediaDescriptionCompat, opn5in7k1.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                    return opn5in7k0Serializer;
                }
            }
            opn5in7k0Serializer = null;
        } else if (opn5in7k0Serializer != null) {
            return opn5in7k0Serializer;
        }
        if (z) {
            Iterator it = ((requestDisplayInAppMessagelambda4) resetAfterInAppMessageCloselambda2.serializer(new EmptyContentCardsAdapterNetworkUnavailableViewHolder(1, accessprocessdragstart))).iterator();
            do {
                if (!it.hasNext()) {
                    opn5in7k0Serializer = null;
                    break;
                }
                opN5in7k0 opn5in7k2 = (opN5in7k0) it.next();
                opn5in7k0Serializer = (!(opn5in7k2 instanceof relativeQuadraticTo) || opn5in7k2.equals(opn5in7k0)) ? null : ((relativeQuadraticTo) opn5in7k2).IconCompatParcelizer.serializer(i, relativequadraticto, opn5in7k1, true);
            } while (opn5in7k0Serializer == null);
        }
        if (opn5in7k0Serializer != null) {
            return opn5in7k0Serializer;
        }
        relativeQuadraticTo relativequadraticto2 = relativequadraticto.MediaDescriptionCompat;
        if (relativequadraticto2 == null || relativequadraticto2.equals(opn5in7k0)) {
            return null;
        }
        relativeQuadraticTo relativequadraticto3 = relativequadraticto.MediaDescriptionCompat;
        relativequadraticto3.getClass();
        return relativequadraticto3.IconCompatParcelizer.serializer(i, relativequadraticto, opn5in7k1, z);
    }

    public void serializer(View view) {
        ((ArrayList) this.read).add(view);
        RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.serializer;
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
        }
    }

    public void serializer(opN5in7k0 opn5in7k0) {
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) this.write;
        relativeQuadraticTo relativequadraticto = (relativeQuadraticTo) this.serializer;
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg = relativequadraticto.serializer;
        opn5in7k0.getClass();
        r8lambdaNgV6ovj1QyxF4ZnNHCv_B6N5Tkg r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2 = opn5in7k0.serializer;
        int i = r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.RemoteActionCompatParcelizer;
        String str = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.read;
        if (i == 0 && str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = (String) r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.read;
        if (str2 != null) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str, str2}, iWrite3)).booleanValue()) {
                DrawableTransformation.serializer("Destination ", opn5in7k0, " cannot have the same route as graph ", relativequadraticto);
                return;
            }
        }
        if (i == r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg.RemoteActionCompatParcelizer) {
            DrawableTransformation.serializer("Destination ", opn5in7k0, " cannot have the same id as graph ", relativequadraticto);
            return;
        }
        accessprocessdragstart.getClass();
        opN5in7k0 opn5in7k1 = (opN5in7k0) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
        if (opn5in7k1 == opn5in7k0) {
            return;
        }
        if (opn5in7k0.MediaDescriptionCompat != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (opn5in7k1 != null) {
            opn5in7k1.MediaDescriptionCompat = null;
        }
        opn5in7k0.MediaDescriptionCompat = relativequadraticto;
        accessprocessdragstart.RemoteActionCompatParcelizer(r8lambdangv6ovj1qyxf4znnhcv_b6n5tkg2.RemoteActionCompatParcelizer, opn5in7k0);
    }

    public int write() {
        return RecyclerView.this.getChildCount();
    }

    public View write(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public void write(View view) {
        if (((ArrayList) this.read).remove(view)) {
            RecyclerView.AnonymousClass7 anonymousClass7 = (RecyclerView.AnonymousClass7) this.serializer;
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }
    }

    public void write(NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1) {
        headH91voCI headh91voci = (headH91voCI) this.serializer;
        SQLiteStatement sQLiteStatementCompileStatement = headh91voci.serializer.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementCompileStatement2 = headh91voci.serializer.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i = nodeCoordinatorupdateLayerParameters1.RemoteActionCompatParcelizer;
        String str = (String) this.read;
        Object[] objArr = {str, Integer.valueOf(i)};
        sQLiteStatementCompileStatement.clearBindings();
        headH91voCI.write(sQLiteStatementCompileStatement, objArr);
        getRectManager.RemoteActionCompatParcelizer(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(nodeCoordinatorupdateLayerParameters1.RemoteActionCompatParcelizer));
        Iterator it = nodeCoordinatorupdateLayerParameters1.serializer.iterator();
        while (it.hasNext()) {
            visitNodes visitnodes = ((NodeCoordinatorKt) it.next()).read;
            Object[] objArr2 = {str, updateLayerParameters.write(visitnodes.RemoteActionCompatParcelizer), Integer.valueOf(i)};
            sQLiteStatementCompileStatement2.clearBindings();
            headH91voCI.write(sQLiteStatementCompileStatement2, objArr2);
            sQLiteStatementCompileStatement2.executeUpdateDelete();
            headh91voci.RemoteActionCompatParcelizer.serializer(visitnodes);
        }
    }

    public opN5in7k0 RemoteActionCompatParcelizer(String str, boolean z) {
        Object next;
        relativeQuadraticTo relativequadraticto;
        opN5in7k0 opn5in7k0;
        str.getClass();
        accessprocessDragStart accessprocessdragstart = (accessprocessDragStart) this.write;
        accessprocessdragstart.getClass();
        Iterator it = ((requestDisplayInAppMessagelambda4) resetAfterInAppMessageCloselambda2.serializer(new EmptyContentCardsAdapterNetworkUnavailableViewHolder(1, accessprocessdragstart))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            opn5in7k0 = (opN5in7k0) next;
            if (setCarryoverInAppMessage.serializer((String) opn5in7k0.serializer.read, str, false)) {
                break;
            }
        } while (opn5in7k0.serializer.serializer(str) == null);
        opN5in7k0 opn5in7k1 = (opN5in7k0) next;
        if (opn5in7k1 != null) {
            return opn5in7k1;
        }
        if (!z || (relativequadraticto = ((relativeQuadraticTo) this.serializer).MediaDescriptionCompat) == null) {
            return null;
        }
        ChildHelper childHelper = relativequadraticto.IconCompatParcelizer;
        childHelper.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return null;
        }
        return childHelper.RemoteActionCompatParcelizer(str, true);
    }

    public void IconCompatParcelizer(int i) {
        int i2 = read(i);
        ((resizeGraphicFrameIfAppropriatelambda0) this.write).write(i2);
        RecyclerView recyclerView = RecyclerView.this;
        View childAt = recyclerView.getChildAt(i2);
        if (childAt != null) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    DrawableTransformation.read(sb, (Object) recyclerView.exceptionLabel());
                    return;
                } else {
                    if (RecyclerView.MediaDescriptionCompat) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.addFlags(Fields.RotationX);
                }
            }
        } else if (RecyclerView.MediaSessionCompatQueueItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(i2, "No view at offset ", recyclerView.exceptionLabel());
            return;
        }
        recyclerView.detachViewFromParent(i2);
    }

    public View serializer(int i) {
        return RecyclerView.this.getChildAt(read(i));
    }

    public String toString() {
        if (this.RemoteActionCompatParcelizer != 0) {
            return super.toString();
        }
        return ((resizeGraphicFrameIfAppropriatelambda0) this.write).toString() + ", hidden list:" + ((ArrayList) this.read).size();
    }

    public ChildHelper(relativeQuadraticTo relativequadraticto) {
        this.RemoteActionCompatParcelizer = 1;
        this.serializer = relativequadraticto;
        this.write = new accessprocessDragStart(0);
    }

    public ChildHelper(accessgetDisposedp accessgetdisposedp, WrappedCompositionsetContent12 wrappedCompositionsetContent12, List list, int i, i$d.a aVar) {
        this.RemoteActionCompatParcelizer = 4;
        this.serializer = accessgetdisposedp;
        this.MediaSessionCompatQueueItem = wrappedCompositionsetContent12;
        this.read = list;
        this.IconCompatParcelizer = i;
        this.write = aVar;
    }

    public ChildHelper(RecyclerView.AnonymousClass7 anonymousClass7) {
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = 0;
        this.serializer = anonymousClass7;
        this.write = new resizeGraphicFrameIfAppropriatelambda0(2);
        this.read = new ArrayList();
    }

    public ChildHelper(headH91voCI headh91voci, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui, setOffset setoffset) {
        this.RemoteActionCompatParcelizer = 3;
        this.serializer = headh91voci;
        this.write = getforcemeasurewithlookaheadconstraintsui;
        String str = setoffset.IconCompatParcelizer;
        this.read = str == null ? "" : str;
        this.MediaSessionCompatQueueItem = getRetainedValuesStore.PlaybackStateCompatCustomAction;
    }

    public opN5in7k0 RemoteActionCompatParcelizer(int i) {
        return serializer(i, (relativeQuadraticTo) this.serializer, null, false);
    }
}
