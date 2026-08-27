package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zzw;
import com.mapbox.search.IndexableDataProvidersRegistryImpl$register$3$onComplete$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class scaledRadiiRect extends drawRawPoints {
    public final ArrayList IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final getInternalCanvasannotations MediaDescriptionCompat;
    public final ArrayList MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final Object MediaSessionCompatResultReceiverWrapper;
    public final toAndroidBlendModes9anfk8 MediaSessionCompatToken;
    public final ArrayList ParcelableVolumeInfo;
    public final ImageKt PlaybackStateCompat;
    public final ArrayList PlaybackStateCompatCustomAction;
    public final ImageKt RatingCompat;
    public final getInternalCanvasannotations RemoteActionCompatParcelizer;
    public final zzw ResultReceiver = new zzw();
    public Object read;
    public final ArrayList serializer;
    public final ImageKt write;

    public final void read(ArrayList arrayList, ViewGroup viewGroup, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        toRectuvyYCjk.RemoteActionCompatParcelizer(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.PlaybackStateCompatCustomAction;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean zRemoteActionCompatParcelizer = div7Ah8Wj8.RemoteActionCompatParcelizer(2);
        ArrayList arrayList4 = this.MediaMetadataCompat;
        if (zRemoteActionCompatParcelizer) {
            for (Object obj : arrayList4) {
                obj.getClass();
                View view2 = (View) obj;
                view2.toString();
                WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
                view2.getTransitionName();
            }
            for (Object obj2 : arrayList3) {
                obj2.getClass();
                View view3 = (View) obj2;
                view3.toString();
                WeakHashMap weakHashMap3 = FocusPropertiesNode.RatingCompat;
                view3.getTransitionName();
            }
        }
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view4 = (View) arrayList4.get(i2);
            WeakHashMap weakHashMap4 = FocusPropertiesNode.RatingCompat;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.PlaybackStateCompat.get(transitionName);
                for (int i3 = 0; i3 < size2; i3++) {
                    if (str.equals(arrayList2.get(i3))) {
                        ((View) arrayList3.get(i3)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        accesstoUsingEnterExitScope.read(viewGroup, new AndroidCanvas(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        toRectuvyYCjk.RemoteActionCompatParcelizer(0, arrayList);
        this.MediaSessionCompatToken.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper, arrayList4, arrayList3);
    }

    @Override // o.drawRawPoints
    public final boolean IconCompatParcelizer() {
        Object obj;
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8 = this.MediaSessionCompatToken;
        if (!toandroidblendmodes9anfk8.IconCompatParcelizer()) {
            return false;
        }
        ArrayList<component5kKHJgLs> arrayList = this.ParcelableVolumeInfo;
        if (!arrayList.isEmpty()) {
            for (component5kKHJgLs component5kkhjgls : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = component5kkhjgls.read) == null || !toandroidblendmodes9anfk8.RemoteActionCompatParcelizer(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.MediaSessionCompatResultReceiverWrapper;
        return obj2 == null || toandroidblendmodes9anfk8.RemoteActionCompatParcelizer(obj2);
    }

    public final boolean RemoteActionCompatParcelizer() {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((component5kKHJgLs) it.next()).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras) {
                return false;
            }
        }
        return true;
    }

    public scaledRadiiRect(ArrayList arrayList, getInternalCanvasannotations getinternalcanvasannotations, getInternalCanvasannotations getinternalcanvasannotations2, toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8, Object obj, ArrayList arrayList2, ArrayList arrayList3, ImageKt imageKt, ArrayList arrayList4, ArrayList arrayList5, ImageKt imageKt2, ImageKt imageKt3, boolean z) {
        this.ParcelableVolumeInfo = arrayList;
        this.RemoteActionCompatParcelizer = getinternalcanvasannotations;
        this.MediaDescriptionCompat = getinternalcanvasannotations2;
        this.MediaSessionCompatToken = toandroidblendmodes9anfk8;
        this.MediaSessionCompatResultReceiverWrapper = obj;
        this.MediaMetadataCompat = arrayList2;
        this.PlaybackStateCompatCustomAction = arrayList3;
        this.PlaybackStateCompat = imageKt;
        this.IconCompatParcelizer = arrayList4;
        this.serializer = arrayList5;
        this.write = imageKt2;
        this.RatingCompat = imageKt3;
        this.MediaSessionCompatQueueItem = z;
    }

    @Override // o.drawRawPoints
    public final void IconCompatParcelizer(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.ResultReceiver.read();
    }

    @Override // o.drawRawPoints
    public final void read(ViewGroup viewGroup) {
        viewGroup.getClass();
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<component5kKHJgLs> arrayList = this.ParcelableVolumeInfo;
        if (!zIsLaidOut || this.MediaBrowserCompatMediaItem) {
            for (component5kKHJgLs component5kkhjgls : arrayList) {
                getInternalCanvasannotations getinternalcanvasannotations = component5kkhjgls.RemoteActionCompatParcelizer;
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    if (this.MediaBrowserCompatMediaItem) {
                        Objects.toString(getinternalcanvasannotations);
                    } else {
                        viewGroup.toString();
                        Objects.toString(getinternalcanvasannotations);
                    }
                }
                component5kkhjgls.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
            }
            this.MediaBrowserCompatMediaItem = false;
            return;
        }
        Object obj = this.read;
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8 = this.MediaSessionCompatToken;
        getInternalCanvasannotations getinternalcanvasannotations2 = this.MediaDescriptionCompat;
        getInternalCanvasannotations getinternalcanvasannotations3 = this.RemoteActionCompatParcelizer;
        if (obj != null) {
            toandroidblendmodes9anfk8.serializer(obj);
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                Objects.toString(getinternalcanvasannotations3);
                Objects.toString(getinternalcanvasannotations2);
                return;
            }
            return;
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0Serializer = serializer(viewGroup, getinternalcanvasannotations2, getinternalcanvasannotations3);
        ArrayList arrayList2 = (ArrayList) onviewattachedtowindowlambda0Serializer.serializer;
        Object obj2 = onviewattachedtowindowlambda0Serializer.write;
        ArrayList<getInternalCanvasannotations> arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((component5kKHJgLs) it.next()).RemoteActionCompatParcelizer);
        }
        for (getInternalCanvasannotations getinternalcanvasannotations4 : arrayList3) {
            toandroidblendmodes9anfk8.write(getinternalcanvasannotations4.RemoteActionCompatParcelizer, obj2, this.ResultReceiver, new RoundRect(getinternalcanvasannotations4, this, 1));
        }
        read(arrayList2, viewGroup, new copyMDFrstsdefault(this, viewGroup, obj2));
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(getinternalcanvasannotations3);
            Objects.toString(getinternalcanvasannotations2);
        }
    }

    @Override // o.drawRawPoints
    public final void read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys, ViewGroup viewGroup) {
        viewGroup.getClass();
        Object obj = this.read;
        if (obj != null) {
            this.MediaSessionCompatToken.read(r8lambda54beh8zsbru0cxi2ccsp2synys.RemoteActionCompatParcelizer, obj);
        }
    }

    @Override // o.drawRawPoints
    public final void write(ViewGroup viewGroup) {
        Object obj;
        viewGroup.getClass();
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.ParcelableVolumeInfo;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                getInternalCanvasannotations getinternalcanvasannotations = ((component5kKHJgLs) it.next()).RemoteActionCompatParcelizer;
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    viewGroup.toString();
                    Objects.toString(getinternalcanvasannotations);
                }
            }
            return;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        getInternalCanvasannotations getinternalcanvasannotations2 = this.MediaDescriptionCompat;
        getInternalCanvasannotations getinternalcanvasannotations3 = this.RemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer && (obj = this.MediaSessionCompatResultReceiverWrapper) != null && !IconCompatParcelizer()) {
            Objects.toString(obj);
            Objects.toString(getinternalcanvasannotations3);
            Objects.toString(getinternalcanvasannotations2);
        }
        if (IconCompatParcelizer() && RemoteActionCompatParcelizer()) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0Serializer = serializer(viewGroup, getinternalcanvasannotations2, getinternalcanvasannotations3);
            ArrayList arrayList2 = (ArrayList) onviewattachedtowindowlambda0Serializer.serializer;
            Object obj2 = onviewattachedtowindowlambda0Serializer.write;
            ArrayList<getInternalCanvasannotations> arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((component5kKHJgLs) it2.next()).RemoteActionCompatParcelizer);
            }
            for (getInternalCanvasannotations getinternalcanvasannotations4 : arrayList3) {
                RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = new RxWorker$1$$ExternalSyntheticLambda0(5, createinappmessageeventsubscriber);
                androidx.fragment.app.Fragment fragment = getinternalcanvasannotations4.RemoteActionCompatParcelizer;
                this.MediaSessionCompatToken.RemoteActionCompatParcelizer(obj2, this.ResultReceiver, rxWorker$1$$ExternalSyntheticLambda0, new RoundRect(getinternalcanvasannotations4, this, 0));
            }
            read(arrayList2, viewGroup, new IndexableDataProvidersRegistryImpl$register$3$onComplete$1.AnonymousClass1(this, viewGroup, obj2, createinappmessageeventsubscriber, 1));
        }
    }

    public static void read(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = requestFocus3ESFkO8.IconCompatParcelizer;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                read(childAt, arrayList);
            }
        }
    }

    public final onViewAttachedToWindowlambda0 serializer(ViewGroup viewGroup, getInternalCanvasannotations getinternalcanvasannotations, getInternalCanvasannotations getinternalcanvasannotations2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8;
        getinternalcanvasannotations = getinternalcanvasannotations;
        View view = new View(viewGroup.getContext());
        android.graphics.Rect rect = new android.graphics.Rect();
        ArrayList arrayList3 = this.ParcelableVolumeInfo;
        Iterator it = arrayList3.iterator();
        boolean z = false;
        View view2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.PlaybackStateCompatCustomAction;
            arrayList2 = this.MediaMetadataCompat;
            obj = this.MediaSessionCompatResultReceiverWrapper;
            toandroidblendmodes9anfk8 = this.MediaSessionCompatToken;
            if (!zHasNext) {
                break;
            }
            if (((component5kKHJgLs) it.next()).RatingCompat() && getinternalcanvasannotations2 != null && getinternalcanvasannotations != null && !this.PlaybackStateCompat.isEmpty() && obj != null) {
                androidx.fragment.app.Fragment fragment = getinternalcanvasannotations.RemoteActionCompatParcelizer;
                androidx.fragment.app.Fragment fragment2 = getinternalcanvasannotations2.RemoteActionCompatParcelizer;
                AndroidBlendMode_androidKt androidBlendMode_androidKt = toRectuvyYCjk.serializer;
                fragment.getClass();
                fragment2.getClass();
                if (this.MediaSessionCompatQueueItem) {
                    fragment2.getEnterTransitionCallback();
                } else {
                    fragment.getEnterTransitionCallback();
                }
                accesstoUsingEnterExitScope.read(viewGroup, new WorkerKt$$ExternalSyntheticLambda2(getinternalcanvasannotations, getinternalcanvasannotations2, this, 21));
                ImageKt imageKt = this.write;
                arrayList2.addAll(imageKt.values());
                ArrayList arrayList4 = this.serializer;
                if (!arrayList4.isEmpty()) {
                    Object obj2 = arrayList4.get(0);
                    obj2.getClass();
                    View view3 = (View) imageKt.get((String) obj2);
                    toandroidblendmodes9anfk8.read(view3, obj);
                    view2 = view3;
                }
                ImageKt imageKt2 = this.RatingCompat;
                arrayList.addAll(imageKt2.values());
                ArrayList arrayList5 = this.IconCompatParcelizer;
                if (!arrayList5.isEmpty()) {
                    Object obj3 = arrayList5.get(0);
                    obj3.getClass();
                    View view4 = (View) imageKt2.get((String) obj3);
                    if (view4 != null) {
                        accesstoUsingEnterExitScope.read(viewGroup, new w4$$ExternalSyntheticLambda0(toandroidblendmodes9anfk8, view4, rect));
                        z = true;
                    }
                }
                toandroidblendmodes9anfk8.write(obj, view, arrayList2);
                Object obj4 = this.MediaSessionCompatResultReceiverWrapper;
                toandroidblendmodes9anfk8.serializer(obj4, null, null, obj4, arrayList);
            }
            it = it;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        Object objIconCompatParcelizer = null;
        Object objIconCompatParcelizer2 = null;
        while (it2.hasNext()) {
            component5kKHJgLs component5kkhjgls = (component5kKHJgLs) it2.next();
            it2 = it2;
            getInternalCanvasannotations getinternalcanvasannotations3 = component5kkhjgls.RemoteActionCompatParcelizer;
            Object obj5 = objIconCompatParcelizer2;
            Object objWrite = toandroidblendmodes9anfk8.write(component5kkhjgls.read);
            if (objWrite != null) {
                Object obj6 = objIconCompatParcelizer;
                ArrayList arrayList7 = new ArrayList();
                androidx.fragment.app.Fragment fragment3 = getinternalcanvasannotations3.RemoteActionCompatParcelizer;
                View view5 = view2;
                View view6 = fragment3.getActivityResultRegistry;
                view6.getClass();
                read(view6, arrayList7);
                if (obj != null && (getinternalcanvasannotations3 == getinternalcanvasannotations2 || getinternalcanvasannotations3 == getinternalcanvasannotations)) {
                    if (getinternalcanvasannotations3 == getinternalcanvasannotations2) {
                        arrayList7.removeAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2));
                    } else {
                        arrayList7.removeAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
                    }
                }
                if (arrayList7.isEmpty()) {
                    toandroidblendmodes9anfk8.write(view, objWrite);
                } else {
                    toandroidblendmodes9anfk8.write(arrayList7, objWrite);
                    toandroidblendmodes9anfk8.serializer(objWrite, objWrite, arrayList7, null, null);
                    if (getinternalcanvasannotations3.serializer == clipRectN_I0leg.GONE) {
                        getinternalcanvasannotations3.MediaDescriptionCompat = false;
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        arrayList8.remove(fragment3.getActivityResultRegistry);
                        toandroidblendmodes9anfk8.RemoteActionCompatParcelizer(objWrite, fragment3.getActivityResultRegistry, arrayList8);
                        accesstoUsingEnterExitScope.read(viewGroup, new RxWorker$1$$ExternalSyntheticLambda0(6, arrayList7));
                    }
                }
                if (getinternalcanvasannotations3.serializer == clipRectN_I0leg.VISIBLE) {
                    arrayList6.addAll(arrayList7);
                    if (z) {
                        toandroidblendmodes9anfk8.write(objWrite, rect);
                    }
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        objWrite.toString();
                        for (Object obj7 : arrayList7) {
                            obj7.getClass();
                            ((View) obj7).toString();
                        }
                    }
                    view2 = view5;
                } else {
                    view2 = view5;
                    toandroidblendmodes9anfk8.read(view2, objWrite);
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        objWrite.toString();
                        for (Object obj8 : arrayList7) {
                            obj8.getClass();
                            ((View) obj8).toString();
                        }
                    }
                }
                if (component5kkhjgls.IconCompatParcelizer) {
                    objIconCompatParcelizer = toandroidblendmodes9anfk8.IconCompatParcelizer(obj6, objWrite);
                    objIconCompatParcelizer2 = obj5;
                } else {
                    objIconCompatParcelizer = obj6;
                    objIconCompatParcelizer2 = toandroidblendmodes9anfk8.IconCompatParcelizer(obj5, objWrite);
                }
            } else {
                objIconCompatParcelizer2 = obj5;
            }
        }
        Object objWrite2 = toandroidblendmodes9anfk8.write(objIconCompatParcelizer, objIconCompatParcelizer2, obj);
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(objWrite2);
            viewGroup.toString();
        }
        return new onViewAttachedToWindowlambda0(arrayList6, objWrite2);
    }
}
