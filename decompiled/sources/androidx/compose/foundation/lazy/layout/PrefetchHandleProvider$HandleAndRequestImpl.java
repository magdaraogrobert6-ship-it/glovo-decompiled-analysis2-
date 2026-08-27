package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.AndroidTrace_androidKt;
import androidx.navigation.NavArgsLazy;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.disk.DiskLruCache$Editor;
import java.util.ArrayList;
import java.util.List;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.LinearProgressIndicatorTokens;
import o.OutlinedTextFieldTokens;
import o.RadioButtonTokens;
import o.ShapeTokens;
import o.TriStateCheckbox;
import o.animateElevationrAjV9yQ;
import o.animateToHidden;
import o.createInAppMessageEventSubscriber;
import o.getBundleFromUrl;
import o.instance_delegatelambda0;
import o.move;
import o.onClear;
import o.onRelease;
import o.onRemeasuredozmzZPI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.relativeQuadraticBezierTo;

/* JADX INFO: loaded from: classes.dex */
public final class PrefetchHandleProvider$HandleAndRequestImpl implements LinearProgressIndicatorTokens, onClear, OutlinedTextFieldTokens {
    public long ComponentActivity = BrazeInAppMessageManagerWhenMappings.write();
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public move MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatResultReceiverWrapper;
    public SubcomposeLayoutState.PrecomposedSlotHandle MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public SubcomposeLayoutState.PausedPrecomposition PlaybackStateCompat;
    public final NavArgsLazy PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public Constraints ResultReceiver;
    public final /* synthetic */ DiskLruCache$Editor r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int read;
    public long serializer;
    public long write;

    @Override // o.LinearProgressIndicatorTokens
    public final void RemoteActionCompatParcelizer() {
        this.MediaSessionCompatQueueItem = true;
    }

    public final boolean write(long j, long j2) {
        if (this.MediaSessionCompatQueueItem) {
            j2 = 0;
        }
        return j > j2;
    }

    public final boolean execute(getBundleFromUrl getbundlefromurl) {
        boolean zExecuteRequest;
        if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read) {
            return false;
        }
        if (this.MediaSessionCompatQueueItem) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zExecuteRequest = executeRequest(getbundlefromurl);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            zExecuteRequest = executeRequest(getbundlefromurl);
        }
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", -1L);
        return zExecuteRequest;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01e1  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final boolean executeRequest(getBundleFromUrl getbundlefromurl) {
        ?? r12;
        List list;
        int i = this.read;
        long j = i;
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", j);
        onRelease onrelease = (onRelease) ((animateToHidden) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write).write.invoke();
        if (!this.MediaDescriptionCompat) {
            int iSerializer = onrelease.serializer();
            if (i >= 0 && i < iSerializer) {
                Object objWrite = onrelease.write(i);
                Object obj = this.RatingCompat;
                if (obj != null && !objWrite.equals(obj)) {
                    IconCompatParcelizer();
                    return false;
                }
                Object objSerializer = onrelease.serializer(i);
                NavArgsLazy navArgsLazy = this.PlaybackStateCompatCustomAction;
                animateElevationrAjV9yQ animateelevationrajv9yq = (animateElevationrAjV9yQ) navArgsLazy.RatingCompat;
                if (navArgsLazy.read != objSerializer || animateelevationrajv9yq == null) {
                    onRemeasuredozmzZPI onremeasuredozmzzpi = (onRemeasuredozmzZPI) navArgsLazy.MediaSessionCompatQueueItem;
                    Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(objSerializer);
                    Object obj2 = objMediaBrowserCompatMediaItem;
                    if (objMediaBrowserCompatMediaItem == null) {
                        animateElevationrAjV9yQ animateelevationrajv9yq2 = new animateElevationrAjV9yQ();
                        animateelevationrajv9yq2.IconCompatParcelizer = -1;
                        onremeasuredozmzzpi.write(objSerializer, animateelevationrajv9yq2);
                        obj2 = animateelevationrajv9yq2;
                    }
                    animateelevationrajv9yq = (animateElevationrAjV9yQ) obj2;
                    navArgsLazy.read = objSerializer;
                    navArgsLazy.RatingCompat = animateelevationrajv9yq;
                }
                serializer();
                long jRemoteActionCompatParcelizer = getbundlefromurl.RemoteActionCompatParcelizer();
                this.write = jRemoteActionCompatParcelizer;
                this.ComponentActivity = BrazeInAppMessageManagerWhenMappings.write();
                this.serializer = 0L;
                AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", jRemoteActionCompatParcelizer);
                if (!serializer()) {
                    if (write(this.write, animateelevationrajv9yq.serializer + animateelevationrajv9yq.RemoteActionCompatParcelizer)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            write(objWrite, objSerializer, animateelevationrajv9yq);
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                    if (!serializer()) {
                        return true;
                    }
                }
                if (this.PlaybackStateCompat != null) {
                    if (!write(this.write, animateelevationrajv9yq.write)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.PlaybackStateCompat;
                        if (pausedPrecomposition == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.MediaSessionCompatToken = pausedPrecomposition.apply();
                        this.PlaybackStateCompat = null;
                        this.RemoteActionCompatParcelizer = true;
                        Trace.endSection();
                        write();
                        animateelevationrajv9yq.write = animateElevationrAjV9yQ.read(this.serializer, animateelevationrajv9yq.write);
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (!this.IconCompatParcelizer) {
                    if (this.write <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.MediaSessionCompatToken;
                        if (precomposedSlotHandle == null) {
                            throw af$$ExternalSyntheticOutline1.m("Should precompose before resolving nested prefetch states");
                        }
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                        precomposedSlotHandle.traverseDescendants("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new relativeQuadraticBezierTo(createinappmessageeventsubscriber, 1));
                        List list2 = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
                        this.MediaMetadataCompat = list2 != null ? new move(this, list2) : null;
                        this.IconCompatParcelizer = true;
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                move moveVar = this.MediaMetadataCompat;
                if (moveVar != null) {
                    int i2 = animateelevationrajv9yq.IconCompatParcelizer;
                    boolean z = this.MediaSessionCompatQueueItem;
                    List[] listArr = moveVar.write;
                    int i3 = moveVar.serializer;
                    List list3 = moveVar.IconCompatParcelizer;
                    if (i3 < list3.size()) {
                        if (moveVar.MediaMetadataCompat.MediaDescriptionCompat) {
                            TriStateCheckbox.RemoteActionCompatParcelizer("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                ((RadioButtonTokens) list3.get(i4)).RatingCompat = i2;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (moveVar.serializer < list3.size()) {
                                try {
                                    if (listArr[moveVar.serializer] == null) {
                                        if (getbundlefromurl.RemoteActionCompatParcelizer() <= 0) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i5 = moveVar.serializer;
                                        RadioButtonTokens radioButtonTokens = (RadioButtonTokens) list3.get(i5);
                                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = radioButtonTokens.serializer;
                                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
                                            list = instance_delegatelambda0.write;
                                        } else {
                                            ShapeTokens shapeTokens = new ShapeTokens(radioButtonTokens, radioButtonTokens.RatingCompat);
                                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(shapeTokens);
                                            ArrayList arrayList = shapeTokens.write;
                                            radioButtonTokens.read = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i5] = list;
                                    }
                                    List list4 = listArr[moveVar.serializer];
                                    list4.getClass();
                                    while (moveVar.read < list4.size()) {
                                        onClear onclear = (onClear) list4.get(moveVar.read);
                                        if (z) {
                                            PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = onclear instanceof PrefetchHandleProvider$HandleAndRequestImpl ? (PrefetchHandleProvider$HandleAndRequestImpl) onclear : null;
                                            if (prefetchHandleProvider$HandleAndRequestImpl != null) {
                                                r12 = 1;
                                                prefetchHandleProvider$HandleAndRequestImpl.MediaSessionCompatQueueItem = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        moveVar.RemoteActionCompatParcelizer = r12;
                                        if (((PrefetchHandleProvider$HandleAndRequestImpl) onclear).execute(getbundlefromurl)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        moveVar.read += r12;
                                    }
                                    moveVar.read = 0;
                                    moveVar.serializer++;
                                } catch (Throwable th4) {
                                    Trace.endSection();
                                    throw th4;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                    }
                }
                move moveVar2 = this.MediaMetadataCompat;
                if (moveVar2 != null && moveVar2.RemoteActionCompatParcelizer) {
                    write();
                    AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:execute:item", j);
                    move moveVar3 = this.MediaMetadataCompat;
                    if (moveVar3 != null) {
                        moveVar3.RemoteActionCompatParcelizer = false;
                    }
                }
                Constraints constraints = this.ResultReceiver;
                if (!this.MediaBrowserCompatMediaItem && constraints != null) {
                    if (!write(this.write, animateelevationrajv9yq.read)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long jM3632unboximpl = constraints.m3632unboximpl();
                        if (this.MediaDescriptionCompat) {
                            TriStateCheckbox.read("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.MediaBrowserCompatMediaItem) {
                            TriStateCheckbox.read("Request was already measured!");
                        }
                        this.MediaBrowserCompatMediaItem = true;
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle2 = this.MediaSessionCompatToken;
                        if (precomposedSlotHandle2 == null) {
                            throw af$$ExternalSyntheticOutline1.m("performComposition() must be called before performMeasure()");
                        }
                        int placeablesCount = precomposedSlotHandle2.getPlaceablesCount();
                        for (int i6 = 0; i6 < placeablesCount; i6++) {
                            precomposedSlotHandle2.mo2238premeasure0kLqBqw(i6, jM3632unboximpl);
                        }
                        Trace.endSection();
                        write();
                        animateelevationrajv9yq.read = animateElevationrAjV9yQ.read(this.serializer, animateelevationrajv9yq.read);
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.MediaSessionCompatResultReceiverWrapper;
                        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(this);
                        }
                    } catch (Throwable th6) {
                        Trace.endSection();
                        throw th6;
                    }
                }
                move moveVar4 = this.MediaMetadataCompat;
                if (this.MediaBrowserCompatMediaItem && this.IconCompatParcelizer && moveVar4 != null) {
                    List list5 = moveVar4.IconCompatParcelizer;
                    List list6 = list5;
                    int size2 = list6.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i7 = 0; i7 < size2; i7++) {
                        iMin = Math.min(iMin, ((RadioButtonTokens) list5.get(i7)).write);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i8 = animateelevationrajv9yq.IconCompatParcelizer;
                    animateelevationrajv9yq.IconCompatParcelizer = i8 == -1 ? iMin : ((i8 * 3) + iMin) / 4;
                    int size3 = list6.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i9 = 0; i9 < size3; i9++) {
                        iMin2 = Math.min(iMin2, ((RadioButtonTokens) list5.get(i9)).read);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        animateelevationrajv9yq.read = 0L;
                    }
                }
                return false;
            }
        }
        IconCompatParcelizer();
        return false;
    }

    public PrefetchHandleProvider$HandleAndRequestImpl(DiskLruCache$Editor diskLruCache$Editor, int i, NavArgsLazy navArgsLazy, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = diskLruCache$Editor;
        this.read = i;
        this.PlaybackStateCompatCustomAction = navArgsLazy;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void IconCompatParcelizer() {
        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition = this.PlaybackStateCompat;
        if (pausedPrecomposition != null) {
            pausedPrecomposition.cancel();
        }
        this.PlaybackStateCompat = null;
        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.MediaSessionCompatToken;
        if (precomposedSlotHandle != null) {
            precomposedSlotHandle.dispose();
        }
        this.MediaSessionCompatToken = null;
        this.MediaMetadataCompat = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.read);
        sb.append(", constraints = ");
        sb.append(this.ResultReceiver);
        sb.append(", isComposed = ");
        sb.append(serializer());
        sb.append(", isMeasured = ");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", isCanceled = ");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, " }");
    }

    public final void write() {
        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
        long jRemoteActionCompatParcelizer = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(DefaultInAppMessageViewWrapper.RemoteActionCompatParcelizer(jWrite, this.ComponentActivity));
        this.serializer = jRemoteActionCompatParcelizer;
        long j = this.write - jRemoteActionCompatParcelizer;
        this.write = j;
        this.ComponentActivity = jWrite;
        AndroidTrace_androidKt.traceValue("compose:lazy:prefetch:available_time_nanos", j);
    }

    public final void write(Object obj, Object obj2, animateElevationrAjV9yQ animateelevationrajv9yq) {
        SubcomposeLayoutState.PausedPrecomposition pausedPrecompositionCreatePausedPrecomposition = this.PlaybackStateCompat;
        if (pausedPrecompositionCreatePausedPrecomposition == null) {
            DiskLruCache$Editor diskLruCache$Editor = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            pausedPrecompositionCreatePausedPrecomposition = ((SubcomposeLayoutState) diskLruCache$Editor.RemoteActionCompatParcelizer).createPausedPrecomposition(obj, ((animateToHidden) diskLruCache$Editor.write).IconCompatParcelizer(obj, this.read, obj2));
            this.PlaybackStateCompat = pausedPrecompositionCreatePausedPrecomposition;
            this.RatingCompat = obj;
        }
        this.ParcelableVolumeInfo = false;
        while (!pausedPrecompositionCreatePausedPrecomposition.isComplete() && !this.ParcelableVolumeInfo) {
            pausedPrecompositionCreatePausedPrecomposition.resume(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 10, animateelevationrajv9yq));
        }
        write();
        boolean z = this.ParcelableVolumeInfo;
        long j = this.serializer;
        if (z) {
            animateelevationrajv9yq.RemoteActionCompatParcelizer = animateElevationrAjV9yQ.read(j, animateelevationrajv9yq.RemoteActionCompatParcelizer);
        } else {
            animateelevationrajv9yq.serializer = animateElevationrAjV9yQ.read(j, animateelevationrajv9yq.serializer);
        }
    }

    @Override // o.LinearProgressIndicatorTokens
    public final void read() {
        if (this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = true;
        IconCompatParcelizer();
    }

    public final boolean serializer() {
        SubcomposeLayoutState.PausedPrecomposition pausedPrecomposition;
        return this.RemoteActionCompatParcelizer || ((pausedPrecomposition = this.PlaybackStateCompat) != null && pausedPrecomposition.isComplete());
    }
}
