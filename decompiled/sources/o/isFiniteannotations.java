package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ObjectList$toString$1;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.w4$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class isFiniteannotations {
    public boolean IconCompatParcelizer;
    public final ArrayList MediaMetadataCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public boolean read;
    public final ViewGroup serializer;
    public boolean write;

    public final void RemoteActionCompatParcelizer() {
        div7Ah8Wj8.RemoteActionCompatParcelizer(2);
        boolean zIsAttachedToWindow = this.serializer.isAttachedToWindow();
        synchronized (this.RemoteActionCompatParcelizer) {
            IconCompatParcelizer();
            write(this.RemoteActionCompatParcelizer);
            ArrayList<getInternalCanvasannotations> arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) this.MediaMetadataCompat);
            Iterator it = arrayListIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((getInternalCanvasannotations) it.next()).MediaSessionCompatQueueItem = false;
            }
            for (getInternalCanvasannotations getinternalcanvasannotations : arrayListIconCompatParcelizer) {
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    if (!zIsAttachedToWindow) {
                        Objects.toString(this.serializer);
                    }
                    Objects.toString(getinternalcanvasannotations);
                }
                getinternalcanvasannotations.write(this.serializer);
            }
            ArrayList<getInternalCanvasannotations> arrayListIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer((Collection) this.RemoteActionCompatParcelizer);
            Iterator it2 = arrayListIconCompatParcelizer2.iterator();
            while (it2.hasNext()) {
                ((getInternalCanvasannotations) it2.next()).MediaSessionCompatQueueItem = false;
            }
            for (getInternalCanvasannotations getinternalcanvasannotations2 : arrayListIconCompatParcelizer2) {
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    if (!zIsAttachedToWindow) {
                        Objects.toString(this.serializer);
                    }
                    Objects.toString(getinternalcanvasannotations2);
                }
                getinternalcanvasannotations2.write(this.serializer);
            }
        }
    }

    public static void write(ImageKt imageKt, View view) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            imageKt.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    write(imageKt, childAt);
                }
            }
        }
    }

    public final void IconCompatParcelizer() {
        for (getInternalCanvasannotations getinternalcanvasannotations : this.RemoteActionCompatParcelizer) {
            if (getinternalcanvasannotations.ParcelableVolumeInfo == drawLines.ADDING) {
                View viewRequireView = getinternalcanvasannotations.RemoteActionCompatParcelizer.requireView();
                viewRequireView.getClass();
                clipPathmtrdDE clippathmtrdde = clipRectN_I0leg.Companion;
                int visibility = viewRequireView.getVisibility();
                clippathmtrdde.getClass();
                getinternalcanvasannotations.write(clipPathmtrdDE.write(visibility), drawLines.NONE);
            }
        }
    }

    public final getInternalCanvasannotations RemoteActionCompatParcelizer(androidx.fragment.app.Fragment fragment) {
        Object next;
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            next = it.next();
            getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) next;
            Object[] objArr = {getinternalcanvasannotations.RemoteActionCompatParcelizer, fragment};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && !getinternalcanvasannotations.MediaBrowserCompatMediaItem) {
                return (getInternalCanvasannotations) next;
            }
        }
        next = null;
        return (getInternalCanvasannotations) next;
    }

    public final void RemoteActionCompatParcelizer(clipRectN_I0leg cliprectn_i0leg, drawLines drawlines, isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations) {
        synchronized (this.RemoteActionCompatParcelizer) {
            androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
            fragment.getClass();
            getInternalCanvasannotations getinternalcanvasannotationsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fragment);
            if (getinternalcanvasannotationsRemoteActionCompatParcelizer == null) {
                androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                getinternalcanvasannotationsRemoteActionCompatParcelizer = (fragment2.getDefaultViewModelCreationExtras || fragment2.onBackPressedDispatcher_delegatelambda010) ? serializer(fragment2) : null;
            }
            if (getinternalcanvasannotationsRemoteActionCompatParcelizer != null) {
                getinternalcanvasannotationsRemoteActionCompatParcelizer.write(cliprectn_i0leg, drawlines);
                return;
            }
            final getInternalCanvasannotations getinternalcanvasannotations = new getInternalCanvasannotations(cliprectn_i0leg, drawlines, isspecifieduvyycjkannotations);
            this.RemoteActionCompatParcelizer.add(getinternalcanvasannotations);
            final int i = 0;
            getinternalcanvasannotations.read.add(new Runnable(this) { // from class: o.drawPoints
                public final /* synthetic */ isFiniteannotations RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    getInternalCanvasannotations getinternalcanvasannotations2 = getinternalcanvasannotations;
                    isFiniteannotations isfiniteannotations = this.RemoteActionCompatParcelizer;
                    if (i2 != 0) {
                        isfiniteannotations.RemoteActionCompatParcelizer.remove(getinternalcanvasannotations2);
                        isfiniteannotations.MediaMetadataCompat.remove(getinternalcanvasannotations2);
                    } else if (isfiniteannotations.RemoteActionCompatParcelizer.contains(getinternalcanvasannotations2)) {
                        clipRectN_I0leg cliprectn_i0leg2 = getinternalcanvasannotations2.serializer;
                        View view = getinternalcanvasannotations2.RemoteActionCompatParcelizer.getActivityResultRegistry;
                        view.getClass();
                        cliprectn_i0leg2.applyState(view, isfiniteannotations.serializer);
                    }
                }
            });
            final int i2 = 1;
            getinternalcanvasannotations.read.add(new Runnable(this) { // from class: o.drawPoints
                public final /* synthetic */ isFiniteannotations RemoteActionCompatParcelizer;

                {
                    this.RemoteActionCompatParcelizer = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    getInternalCanvasannotations getinternalcanvasannotations2 = getinternalcanvasannotations;
                    isFiniteannotations isfiniteannotations = this.RemoteActionCompatParcelizer;
                    if (i3 != 0) {
                        isfiniteannotations.RemoteActionCompatParcelizer.remove(getinternalcanvasannotations2);
                        isfiniteannotations.MediaMetadataCompat.remove(getinternalcanvasannotations2);
                    } else if (isfiniteannotations.RemoteActionCompatParcelizer.contains(getinternalcanvasannotations2)) {
                        clipRectN_I0leg cliprectn_i0leg2 = getinternalcanvasannotations2.serializer;
                        View view = getinternalcanvasannotations2.RemoteActionCompatParcelizer.getActivityResultRegistry;
                        view.getClass();
                        cliprectn_i0leg2.applyState(view, isfiniteannotations.serializer);
                    }
                }
            });
        }
    }

    public final getInternalCanvasannotations serializer(androidx.fragment.app.Fragment fragment) {
        Object next;
        Iterator it = this.MediaMetadataCompat.iterator();
        while (it.hasNext()) {
            next = it.next();
            getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) next;
            Object[] objArr = {getinternalcanvasannotations.RemoteActionCompatParcelizer, fragment};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && !getinternalcanvasannotations.MediaBrowserCompatMediaItem) {
                return (getInternalCanvasannotations) next;
            }
        }
        next = null;
        return (getInternalCanvasannotations) next;
    }

    public final void serializer() {
        Object objPrevious;
        synchronized (this.RemoteActionCompatParcelizer) {
            IconCompatParcelizer();
            ArrayList arrayList = this.RemoteActionCompatParcelizer;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) objPrevious;
                clipPathmtrdDE clippathmtrdde = clipRectN_I0leg.Companion;
                View view = getinternalcanvasannotations.RemoteActionCompatParcelizer.getActivityResultRegistry;
                view.getClass();
                clippathmtrdde.getClass();
                clipRectN_I0leg cliprectn_i0legWrite = clipPathmtrdDE.write(view);
                clipRectN_I0leg cliprectn_i0leg = getinternalcanvasannotations.serializer;
                clipRectN_I0leg cliprectn_i0leg2 = clipRectN_I0leg.VISIBLE;
                if (cliprectn_i0leg == cliprectn_i0leg2 && cliprectn_i0legWrite != cliprectn_i0leg2) {
                    break;
                }
            }
            getInternalCanvasannotations getinternalcanvasannotations2 = (getInternalCanvasannotations) objPrevious;
            androidx.fragment.app.Fragment fragment = getinternalcanvasannotations2 != null ? getinternalcanvasannotations2.RemoteActionCompatParcelizer : null;
            this.read = fragment != null ? fragment.isPostponed() : false;
        }
    }

    public isFiniteannotations(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.serializer = viewGroup;
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.MediaMetadataCompat = new ArrayList();
    }

    public static final isFiniteannotations read(ViewGroup viewGroup, div7Ah8Wj8 div7ah8wj8) {
        viewGroup.getClass();
        div7ah8wj8.getClass();
        div7ah8wj8.MediaDescriptionCompat().getClass();
        Object tag = viewGroup.getTag(com.logistics.rider.glovo.R.id.special_effects_controller_view_tag);
        if (tag instanceof isFiniteannotations) {
            return (isFiniteannotations) tag;
        }
        isFiniteannotations isfiniteannotations = new isFiniteannotations(viewGroup);
        viewGroup.setTag(com.logistics.rider.glovo.R.id.special_effects_controller_view_tag, isfiniteannotations);
        return isfiniteannotations;
    }

    public final void serializer(getInternalCanvasannotations getinternalcanvasannotations) {
        getinternalcanvasannotations.getClass();
        if (getinternalcanvasannotations.MediaDescriptionCompat) {
            clipRectN_I0leg cliprectn_i0leg = getinternalcanvasannotations.serializer;
            View viewRequireView = getinternalcanvasannotations.RemoteActionCompatParcelizer.requireView();
            viewRequireView.getClass();
            cliprectn_i0leg.applyState(viewRequireView, this.serializer);
            getinternalcanvasannotations.MediaDescriptionCompat = false;
        }
    }

    public final void read(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((getInternalCanvasannotations) it.next()).write, (Collection) arrayList);
        }
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
        int size = listPlaybackStateCompat.size();
        for (int i = 0; i < size; i++) {
            ((drawRawPoints) listPlaybackStateCompat.get(i)).read(this.serializer);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            serializer((getInternalCanvasannotations) list.get(i2));
        }
        List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(list2);
        int size3 = listPlaybackStateCompat2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) listPlaybackStateCompat2.get(i3);
            if (getinternalcanvasannotations.write.isEmpty()) {
                getinternalcanvasannotations.RemoteActionCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0358 A[LOOP:16: B:111:0x0352->B:113:0x0358, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    public final void serializer(ArrayList arrayList, boolean z) {
        Object next;
        Object objPrevious;
        boolean z2;
        scaledRadiiRect scaledradiirect;
        ArrayList<Rect0a9Yr6o> arrayList2;
        Iterator it;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i = 2;
        div7Ah8Wj8.RemoteActionCompatParcelizer(2);
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) next;
            clipPathmtrdDE clippathmtrdde = clipRectN_I0leg.Companion;
            View view = getinternalcanvasannotations.RemoteActionCompatParcelizer.getActivityResultRegistry;
            view.getClass();
            clippathmtrdde.getClass();
            clipRectN_I0leg cliprectn_i0legWrite = clipPathmtrdDE.write(view);
            clipRectN_I0leg cliprectn_i0leg = clipRectN_I0leg.VISIBLE;
            if (cliprectn_i0legWrite == cliprectn_i0leg && getinternalcanvasannotations.serializer != cliprectn_i0leg) {
                break;
            }
        }
        getInternalCanvasannotations getinternalcanvasannotations2 = (getInternalCanvasannotations) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            getInternalCanvasannotations getinternalcanvasannotations3 = (getInternalCanvasannotations) objPrevious;
            clipPathmtrdDE clippathmtrdde2 = clipRectN_I0leg.Companion;
            View view2 = getinternalcanvasannotations3.RemoteActionCompatParcelizer.getActivityResultRegistry;
            view2.getClass();
            clippathmtrdde2.getClass();
            clipRectN_I0leg cliprectn_i0legWrite2 = clipPathmtrdDE.write(view2);
            clipRectN_I0leg cliprectn_i0leg2 = clipRectN_I0leg.VISIBLE;
            if (cliprectn_i0legWrite2 != cliprectn_i0leg2 && getinternalcanvasannotations3.serializer == cliprectn_i0leg2) {
                break;
            }
        }
        getInternalCanvasannotations getinternalcanvasannotations4 = (getInternalCanvasannotations) objPrevious;
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            Objects.toString(getinternalcanvasannotations2);
            Objects.toString(getinternalcanvasannotations4);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        androidx.fragment.app.Fragment fragment = ((getInternalCanvasannotations) onContentCardDismissed.MediaDescriptionCompat((List) arrayList)).RemoteActionCompatParcelizer;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls = ((getInternalCanvasannotations) it3.next()).RemoteActionCompatParcelizer.ComponentActivity;
            getTopLeftCornerRadiuskKHJgLs gettopleftcornerradiuskkhjgls2 = fragment.ComponentActivity;
            gettopleftcornerradiuskkhjgls.serializer = gettopleftcornerradiuskkhjgls2.serializer;
            gettopleftcornerradiuskkhjgls.MediaDescriptionCompat = gettopleftcornerradiuskkhjgls2.MediaDescriptionCompat;
            gettopleftcornerradiuskkhjgls.MediaSessionCompatResultReceiverWrapper = gettopleftcornerradiuskkhjgls2.MediaSessionCompatResultReceiverWrapper;
            gettopleftcornerradiuskkhjgls.MediaSessionCompatToken = gettopleftcornerradiuskkhjgls2.MediaSessionCompatToken;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            z2 = false;
            if (!it4.hasNext()) {
                break;
            }
            getInternalCanvasannotations getinternalcanvasannotations5 = (getInternalCanvasannotations) it4.next();
            arrayList3.add(new Rect0a9Yr6o(getinternalcanvasannotations5, z));
            if (z) {
                if (getinternalcanvasannotations5 == getinternalcanvasannotations2) {
                    z2 = true;
                }
            } else if (getinternalcanvasannotations5 == getinternalcanvasannotations4) {
                z2 = true;
            }
            arrayList4.add(new component5kKHJgLs(getinternalcanvasannotations5, z, z2));
            getinternalcanvasannotations5.read.add(new w4$$ExternalSyntheticLambda0(this, i, getinternalcanvasannotations5));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList4) {
            if (!((component5kKHJgLs) obj).serializer()) {
                arrayList5.add(obj);
            }
        }
        ArrayList<component5kKHJgLs> arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (((component5kKHJgLs) obj2).read() != null) {
                arrayList6.add(obj2);
            }
        }
        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk8 = null;
        for (component5kKHJgLs component5kkhjgls : arrayList6) {
            toAndroidBlendModes9anfk8 toandroidblendmodes9anfk9 = component5kkhjgls.read();
            if (toandroidblendmodes9anfk8 != null && toandroidblendmodes9anfk9 != toandroidblendmodes9anfk8) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(component5kkhjgls.write().RemoteActionCompatParcelizer);
                Object objRemoteActionCompatParcelizer = component5kkhjgls.RemoteActionCompatParcelizer();
                sb.append(" returned Transition ");
                sb.append(objRemoteActionCompatParcelizer);
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            toandroidblendmodes9anfk8 = toandroidblendmodes9anfk9;
        }
        if (toandroidblendmodes9anfk8 == null) {
            arrayList2 = arrayList3;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ImageKt imageKt = new ImageKt(0);
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            ImageKt imageKt2 = new ImageKt(0);
            ImageKt imageKt3 = new ImageKt(0);
            ArrayList<String> arrayList11 = arrayList9;
            ArrayList<String> arrayList12 = arrayList10;
            Object obj3 = null;
            for (component5kKHJgLs component5kkhjgls2 : arrayList6) {
                if (component5kkhjgls2.RatingCompat() && getinternalcanvasannotations2 != null) {
                    androidx.fragment.app.Fragment fragment2 = getinternalcanvasannotations2.RemoteActionCompatParcelizer;
                    if (getinternalcanvasannotations4 != null) {
                        androidx.fragment.app.Fragment fragment3 = getinternalcanvasannotations4.RemoteActionCompatParcelizer;
                        Object objIconCompatParcelizer = toandroidblendmodes9anfk8.IconCompatParcelizer(toandroidblendmodes9anfk8.write(component5kkhjgls2.IconCompatParcelizer()));
                        ArrayList<String> sharedElementSourceNames = fragment3.getSharedElementSourceNames();
                        sharedElementSourceNames.getClass();
                        ArrayList arrayList13 = arrayList3;
                        ArrayList<String> sharedElementSourceNames2 = fragment2.getSharedElementSourceNames();
                        sharedElementSourceNames2.getClass();
                        ArrayList<String> sharedElementTargetNames = fragment2.getSharedElementTargetNames();
                        sharedElementTargetNames.getClass();
                        toAndroidBlendModes9anfk8 toandroidblendmodes9anfk10 = toandroidblendmodes9anfk8;
                        int size = sharedElementTargetNames.size();
                        ArrayList arrayList14 = arrayList6;
                        int i2 = 0;
                        while (i2 < size) {
                            int i3 = size;
                            int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                            ArrayList<String> arrayList15 = sharedElementTargetNames;
                            if (iIndexOf != -1) {
                                sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                            }
                            i2++;
                            size = i3;
                            sharedElementTargetNames = arrayList15;
                        }
                        ArrayList<String> sharedElementTargetNames2 = fragment3.getSharedElementTargetNames();
                        sharedElementTargetNames2.getClass();
                        if (!z) {
                            fragment2.getExitTransitionCallback();
                            fragment3.getEnterTransitionCallback();
                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, null);
                        } else {
                            fragment2.getEnterTransitionCallback();
                            fragment3.getExitTransitionCallback();
                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, null);
                        }
                        m1$$ExternalSyntheticOutline0.m(onviewattachedtowindowlambda0.serializer);
                        m1$$ExternalSyntheticOutline0.m(onviewattachedtowindowlambda0.write);
                        int i4 = 0;
                        for (int size2 = sharedElementSourceNames.size(); i4 < size2; size2 = size2) {
                            String str = sharedElementSourceNames.get(i4);
                            str.getClass();
                            String str2 = str;
                            String str3 = sharedElementTargetNames2.get(i4);
                            str3.getClass();
                            imageKt.put(str2, str3);
                            i4++;
                        }
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                            for (String str4 : sharedElementTargetNames2) {
                            }
                            for (String str5 : sharedElementSourceNames) {
                            }
                        }
                        View view3 = fragment2.getActivityResultRegistry;
                        view3.getClass();
                        write(imageKt2, view3);
                        imageKt2.serializer(sharedElementSourceNames);
                        imageKt.serializer(imageKt2.keySet());
                        View view4 = fragment3.getActivityResultRegistry;
                        view4.getClass();
                        write(imageKt3, view4);
                        imageKt3.serializer(sharedElementTargetNames2);
                        imageKt3.serializer(imageKt.values());
                        toRectuvyYCjk.serializer(imageKt, imageKt3);
                        int i5 = 11;
                        onContentCardDismissed.serializer((Iterable) imageKt2.entrySet(), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ObjectList$toString$1(i5, imageKt.keySet()), false);
                        onContentCardDismissed.serializer((Iterable) imageKt3.entrySet(), (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ObjectList$toString$1(i5, imageKt.values()), false);
                        if (imageKt.isEmpty()) {
                            Objects.toString(objIconCompatParcelizer);
                            getinternalcanvasannotations2.toString();
                            getinternalcanvasannotations4.toString();
                            arrayList7.clear();
                            arrayList8.clear();
                            obj3 = null;
                        } else {
                            obj3 = objIconCompatParcelizer;
                        }
                        arrayList11 = sharedElementTargetNames2;
                        arrayList12 = sharedElementSourceNames;
                        z2 = false;
                        arrayList3 = arrayList13;
                        toandroidblendmodes9anfk8 = toandroidblendmodes9anfk10;
                        arrayList6 = arrayList14;
                    }
                }
                z2 = z2;
                arrayList3 = arrayList3;
                toandroidblendmodes9anfk8 = toandroidblendmodes9anfk8;
                arrayList6 = arrayList6;
            }
            toAndroidBlendModes9anfk8 toandroidblendmodes9anfk11 = toandroidblendmodes9anfk8;
            ArrayList arrayList16 = arrayList6;
            ArrayList arrayList17 = arrayList3;
            if (obj3 == null) {
                if (!arrayList16.isEmpty()) {
                    Iterator it5 = arrayList16.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            if (((component5kKHJgLs) it5.next()).RemoteActionCompatParcelizer() != null) {
                                arrayList2 = arrayList17;
                                scaledradiirect = new scaledRadiiRect(arrayList16, getinternalcanvasannotations2, getinternalcanvasannotations4, toandroidblendmodes9anfk11, obj3, arrayList7, arrayList8, imageKt, arrayList11, arrayList12, imageKt2, imageKt3, z);
                                it = arrayList16.iterator();
                                while (it.hasNext()) {
                                    ((component5kKHJgLs) it.next()).write().IconCompatParcelizer.add(scaledradiirect);
                                }
                            }
                        }
                    }
                }
                arrayList2 = arrayList17;
            } else {
                arrayList2 = arrayList17;
                scaledradiirect = new scaledRadiiRect(arrayList16, getinternalcanvasannotations2, getinternalcanvasannotations4, toandroidblendmodes9anfk11, obj3, arrayList7, arrayList8, imageKt, arrayList11, arrayList12, imageKt2, imageKt3, z);
                it = arrayList16.iterator();
                while (it.hasNext()) {
                    ((component5kKHJgLs) it.next()).write().IconCompatParcelizer.add(scaledradiirect);
                }
            }
        }
        ArrayList<Rect0a9Yr6o> arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Rect0a9Yr6o) it6.next()).write().write, (Collection) arrayList19);
        }
        boolean zIsEmpty = arrayList19.isEmpty();
        boolean z3 = false;
        for (Rect0a9Yr6o rect0a9Yr6o : arrayList2) {
            Context context = this.serializer.getContext();
            getInternalCanvasannotations getinternalcanvasannotationsWrite = rect0a9Yr6o.write();
            context.getClass();
            RoundRectsniSvfs roundRectsniSvfsIconCompatParcelizer = rect0a9Yr6o.IconCompatParcelizer(context);
            if (roundRectsniSvfsIconCompatParcelizer != null) {
                if (roundRectsniSvfsIconCompatParcelizer.read == null) {
                    arrayList18.add(rect0a9Yr6o);
                } else {
                    androidx.fragment.app.Fragment fragment4 = getinternalcanvasannotationsWrite.RemoteActionCompatParcelizer;
                    if (!getinternalcanvasannotationsWrite.write.isEmpty()) {
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                            Objects.toString(fragment4);
                        }
                    } else {
                        if (getinternalcanvasannotationsWrite.serializer == clipRectN_I0leg.GONE) {
                            getinternalcanvasannotationsWrite.MediaDescriptionCompat = false;
                        }
                        getinternalcanvasannotationsWrite.IconCompatParcelizer.add(new Recttz77jQw(rect0a9Yr6o));
                        z3 = true;
                    }
                }
            }
        }
        for (Rect0a9Yr6o rect0a9Yr6o2 : arrayList18) {
            getInternalCanvasannotations getinternalcanvasannotationsWrite2 = rect0a9Yr6o2.write();
            androidx.fragment.app.Fragment fragment5 = getinternalcanvasannotationsWrite2.RemoteActionCompatParcelizer;
            if (zIsEmpty) {
                if (z3) {
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        Objects.toString(fragment5);
                    }
                } else {
                    getinternalcanvasannotationsWrite2.IconCompatParcelizer.add(new getZeroannotations(rect0a9Yr6o2));
                }
            } else if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                Objects.toString(fragment5);
            }
        }
    }

    public final void write() {
        boolean z;
        if (this.read) {
            return;
        }
        if (!this.serializer.isAttachedToWindow()) {
            RemoteActionCompatParcelizer();
            this.write = false;
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            ArrayList<getInternalCanvasannotations> arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) this.MediaMetadataCompat);
            this.MediaMetadataCompat.clear();
            Iterator it = arrayListIconCompatParcelizer.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) it.next();
                if (this.RemoteActionCompatParcelizer.isEmpty() || !getinternalcanvasannotations.RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras) {
                    z = false;
                }
                getinternalcanvasannotations.MediaSessionCompatQueueItem = z;
            }
            for (getInternalCanvasannotations getinternalcanvasannotations2 : arrayListIconCompatParcelizer) {
                if (this.IconCompatParcelizer) {
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        Objects.toString(getinternalcanvasannotations2);
                    }
                    getinternalcanvasannotations2.RemoteActionCompatParcelizer();
                } else {
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        Objects.toString(getinternalcanvasannotations2);
                    }
                    getinternalcanvasannotations2.write(this.serializer);
                }
                this.IconCompatParcelizer = false;
                if (!getinternalcanvasannotations2.MediaMetadataCompat) {
                    this.MediaMetadataCompat.add(getinternalcanvasannotations2);
                }
            }
            if (!this.RemoteActionCompatParcelizer.isEmpty()) {
                IconCompatParcelizer();
                ArrayList arrayListIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer((Collection) this.RemoteActionCompatParcelizer);
                if (arrayListIconCompatParcelizer2.isEmpty()) {
                    return;
                }
                this.RemoteActionCompatParcelizer.clear();
                this.MediaMetadataCompat.addAll(arrayListIconCompatParcelizer2);
                div7Ah8Wj8.RemoteActionCompatParcelizer(2);
                serializer(arrayListIconCompatParcelizer2, this.write);
                boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(arrayListIconCompatParcelizer2);
                Iterator it2 = arrayListIconCompatParcelizer2.iterator();
                boolean z2 = true;
                while (it2.hasNext()) {
                    if (!((getInternalCanvasannotations) it2.next()).RemoteActionCompatParcelizer.getDefaultViewModelCreationExtras) {
                        z2 = false;
                    }
                }
                if (!z2 || zRemoteActionCompatParcelizer) {
                    z = false;
                }
                this.IconCompatParcelizer = z;
                div7Ah8Wj8.RemoteActionCompatParcelizer(2);
                if (!z2) {
                    write(arrayListIconCompatParcelizer2);
                    read(arrayListIconCompatParcelizer2);
                } else if (zRemoteActionCompatParcelizer) {
                    write(arrayListIconCompatParcelizer2);
                    int size = arrayListIconCompatParcelizer2.size();
                    for (int i = 0; i < size; i++) {
                        serializer((getInternalCanvasannotations) arrayListIconCompatParcelizer2.get(i));
                    }
                }
                this.write = false;
                div7Ah8Wj8.RemoteActionCompatParcelizer(2);
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) it.next();
                if (!getinternalcanvasannotations.write.isEmpty()) {
                    ArrayList arrayList2 = getinternalcanvasannotations.write;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((drawRawPoints) it2.next()).IconCompatParcelizer());
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((getInternalCanvasannotations) it3.next()).write, (Collection) arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void write(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            getInternalCanvasannotations getinternalcanvasannotations = (getInternalCanvasannotations) list.get(i);
            isSpecifieduvyYCjkannotations isspecifieduvyycjkannotations = getinternalcanvasannotations.RatingCompat;
            if (!getinternalcanvasannotations.PlaybackStateCompat) {
                getinternalcanvasannotations.PlaybackStateCompat = true;
                drawLines drawlines = getinternalcanvasannotations.ParcelableVolumeInfo;
                if (drawlines == drawLines.ADDING) {
                    androidx.fragment.app.Fragment fragment = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                    fragment.getClass();
                    View viewFindFocus = fragment.getActivityResultRegistry.findFocus();
                    if (viewFindFocus != null) {
                        fragment.setFocusedView(viewFindFocus);
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                            viewFindFocus.toString();
                            fragment.toString();
                        }
                    }
                    View viewRequireView = getinternalcanvasannotations.RemoteActionCompatParcelizer.requireView();
                    viewRequireView.getClass();
                    if (viewRequireView.getParent() == null) {
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                            fragment.toString();
                            viewRequireView.toString();
                        }
                        isspecifieduvyycjkannotations.serializer();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                            viewRequireView.toString();
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        fragment.getPostOnViewCreatedAlpha();
                    }
                } else if (drawlines == drawLines.REMOVING) {
                    androidx.fragment.app.Fragment fragment2 = isspecifieduvyycjkannotations.RemoteActionCompatParcelizer;
                    fragment2.getClass();
                    View viewRequireView2 = fragment2.requireView();
                    viewRequireView2.getClass();
                    if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                        Objects.toString(viewRequireView2.findFocus());
                        viewRequireView2.toString();
                        fragment2.toString();
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((getInternalCanvasannotations) it.next()).write, (Collection) arrayList);
        }
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
        int size2 = listPlaybackStateCompat.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((drawRawPoints) listPlaybackStateCompat.get(i2)).RemoteActionCompatParcelizer(this.serializer);
        }
    }
}
