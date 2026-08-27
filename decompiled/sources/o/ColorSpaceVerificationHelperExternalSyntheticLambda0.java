package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.transition.Transition$1;
import androidx.transition.Transition$3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorSpaceVerificationHelperExternalSyntheticLambda0 implements Cloneable {
    public ArrayList ComponentActivity;
    public ArrayList accessensureViewModelStore;
    public long addObserverForBackInvoker;
    public composeColorSpace r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public obtainAndroidColorSpace[] r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public CompositeShaderBrush r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public static final Animator[] MediaSessionCompatQueueItem = new Animator[0];
    public static final int[] MediaBrowserCompatMediaItem = {2, 1, 3, 4};
    public static final Transition$1 RatingCompat = new Transition$1(0);
    public static final ThreadLocal MediaDescriptionCompat = new ThreadLocal();
    public final String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getClass().getName();
    public long _init_lambda4 = -1;
    public long MediaSessionCompatResultReceiverWrapper = -1;
    public TimeInterpolator ResultReceiver = null;
    public final ArrayList _init_lambda2 = new ArrayList();
    public final ArrayList _init_lambda3 = new ArrayList();
    public androidx.transition.TransitionValuesMaps _init_lambda1 = new androidx.transition.TransitionValuesMaps(0);
    public androidx.transition.TransitionValuesMaps r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new androidx.transition.TransitionValuesMaps(0);
    public getOffscreenNrFUSI r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
    public final int[] r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = MediaBrowserCompatMediaItem;
    public final ArrayList ParcelableVolumeInfo = new ArrayList();
    public Animator[] PlaybackStateCompatCustomAction = MediaSessionCompatQueueItem;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
    public ColorSpaceVerificationHelperExternalSyntheticLambda0 MediaSessionCompatToken = null;
    public ArrayList r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
    public ArrayList PlaybackStateCompat = new ArrayList();
    public Transition$1 r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = RatingCompat;

    public void IconCompatParcelizer(long j) {
        this.MediaSessionCompatResultReceiverWrapper = j;
    }

    public void IconCompatParcelizer(TimeInterpolator timeInterpolator) {
        this.ResultReceiver = timeInterpolator;
    }

    public abstract boolean IconCompatParcelizer();

    public void MediaSessionCompatToken() {
    }

    @Override // 
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ColorSpaceVerificationHelperExternalSyntheticLambda0 clone() {
        try {
            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) super.clone();
            colorSpaceVerificationHelperExternalSyntheticLambda0.PlaybackStateCompat = new ArrayList();
            colorSpaceVerificationHelperExternalSyntheticLambda0._init_lambda1 = new androidx.transition.TransitionValuesMaps(0);
            colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new androidx.transition.TransitionValuesMaps(0);
            colorSpaceVerificationHelperExternalSyntheticLambda0.accessensureViewModelStore = null;
            colorSpaceVerificationHelperExternalSyntheticLambda0.ComponentActivity = null;
            colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = null;
            colorSpaceVerificationHelperExternalSyntheticLambda0.MediaSessionCompatToken = this;
            colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
            return colorSpaceVerificationHelperExternalSyntheticLambda0;
        } catch (CloneNotSupportedException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public void RemoteActionCompatParcelizer(long j) {
        this._init_lambda4 = j;
    }

    public void RemoteActionCompatParcelizer(CompositingStrategyCompanion compositingStrategyCompanion) {
    }

    public Animator read(ViewGroup viewGroup, CompositingStrategyCompanion compositingStrategyCompanion, CompositingStrategyCompanion compositingStrategyCompanion2) {
        return null;
    }

    public abstract void serializer(CompositingStrategyCompanion compositingStrategyCompanion);

    public void serializer(composeColorSpace composecolorspace) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = composecolorspace;
    }

    public abstract void write(CompositingStrategyCompanion compositingStrategyCompanion);

    public String[] write() {
        return null;
    }

    public static ImageKt serializer() {
        ThreadLocal threadLocal = MediaDescriptionCompat;
        ImageKt imageKt = (ImageKt) threadLocal.get();
        if (imageKt != null) {
            return imageKt;
        }
        ImageKt imageKt2 = new ImageKt(0);
        threadLocal.set(imageKt2);
        return imageKt2;
    }

    public static boolean serializer(CompositingStrategyCompanion compositingStrategyCompanion, CompositingStrategyCompanion compositingStrategyCompanion2, String str) {
        Object obj = compositingStrategyCompanion.write.get(str);
        Object obj2 = compositingStrategyCompanion2.write.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void write(androidx.transition.TransitionValuesMaps transitionValuesMaps, View view, CompositingStrategyCompanion compositingStrategyCompanion) {
        ImageKt imageKt = (ImageKt) transitionValuesMaps.MediaBrowserCompatMediaItem;
        ImageKt imageKt2 = (ImageKt) transitionValuesMaps.MediaDescriptionCompat;
        SparseArray sparseArray = (SparseArray) transitionValuesMaps.MediaMetadataCompat;
        ContextMenuSpec contextMenuSpec = (ContextMenuSpec) transitionValuesMaps.RatingCompat;
        imageKt.put(view, compositingStrategyCompanion);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (imageKt2.containsKey(transitionName)) {
                imageKt2.put(transitionName, null);
            } else {
                imageKt2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (contextMenuSpec.read(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    contextMenuSpec.read(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) contextMenuSpec.write(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    contextMenuSpec.read(itemIdAtPosition, null);
                }
            }
        }
    }

    public void IconCompatParcelizer(View view) {
        this._init_lambda3.remove(view);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe A[SYNTHETIC] */
    public void IconCompatParcelizer(ViewGroup viewGroup, androidx.transition.TransitionValuesMaps transitionValuesMaps, androidx.transition.TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        CompositingStrategyCompanion compositingStrategyCompanion;
        Animator animator;
        Object obj;
        ImageKt imageKtSerializer = serializer();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z = MediaSessionCompatQueueItem().r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null;
        int i = 0;
        while (i < size) {
            CompositingStrategyCompanion compositingStrategyCompanion2 = (CompositingStrategyCompanion) arrayList.get(i);
            CompositingStrategyCompanion compositingStrategyCompanion3 = (CompositingStrategyCompanion) arrayList2.get(i);
            if (compositingStrategyCompanion2 != null && !compositingStrategyCompanion2.serializer.contains(this)) {
                compositingStrategyCompanion2 = null;
            }
            if (compositingStrategyCompanion3 != null && !compositingStrategyCompanion3.serializer.contains(this)) {
                compositingStrategyCompanion3 = null;
            }
            if ((compositingStrategyCompanion2 != null || compositingStrategyCompanion3 != null) && (compositingStrategyCompanion2 == null || compositingStrategyCompanion3 == null || write(compositingStrategyCompanion2, compositingStrategyCompanion3))) {
                Animator animator2 = read(viewGroup, compositingStrategyCompanion2, compositingStrategyCompanion3);
                if (animator2 != null) {
                    String str = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (compositingStrategyCompanion3 != null) {
                        view = compositingStrategyCompanion3.RemoteActionCompatParcelizer;
                        String[] strArrWrite = write();
                        if (strArrWrite != null && strArrWrite.length > 0) {
                            CompositingStrategyCompanion compositingStrategyCompanion4 = new CompositingStrategyCompanion(view);
                            CompositingStrategyCompanion compositingStrategyCompanion5 = (CompositingStrategyCompanion) ((ImageKt) transitionValuesMaps2.MediaBrowserCompatMediaItem).get(view);
                            size = size;
                            if (compositingStrategyCompanion5 != null) {
                                for (String str2 : strArrWrite) {
                                    compositingStrategyCompanion4.write.put(str2, compositingStrategyCompanion5.write.get(str2));
                                }
                            }
                            int i2 = imageKtSerializer.MediaMetadataCompat;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= i2) {
                                    compositingStrategyCompanion = compositingStrategyCompanion4;
                                    animator = animator2;
                                    break;
                                }
                                ColorSpaceVerificationHelperExternalSyntheticLambda2 colorSpaceVerificationHelperExternalSyntheticLambda2 = (ColorSpaceVerificationHelperExternalSyntheticLambda2) imageKtSerializer.get((Animator) imageKtSerializer.IconCompatParcelizer(i3));
                                if (colorSpaceVerificationHelperExternalSyntheticLambda2.IconCompatParcelizer != null && colorSpaceVerificationHelperExternalSyntheticLambda2.RemoteActionCompatParcelizer == view && colorSpaceVerificationHelperExternalSyntheticLambda2.read.equals(str) && colorSpaceVerificationHelperExternalSyntheticLambda2.IconCompatParcelizer.equals(compositingStrategyCompanion4)) {
                                    compositingStrategyCompanion = compositingStrategyCompanion4;
                                    animator = null;
                                    break;
                                }
                                i3++;
                            }
                        }
                        if (animator != null) {
                            WindowId windowId = viewGroup.getWindowId();
                            ColorSpaceVerificationHelperExternalSyntheticLambda2 colorSpaceVerificationHelperExternalSyntheticLambda3 = new ColorSpaceVerificationHelperExternalSyntheticLambda2();
                            colorSpaceVerificationHelperExternalSyntheticLambda3.RemoteActionCompatParcelizer = view;
                            colorSpaceVerificationHelperExternalSyntheticLambda3.read = str;
                            colorSpaceVerificationHelperExternalSyntheticLambda3.IconCompatParcelizer = compositingStrategyCompanion;
                            colorSpaceVerificationHelperExternalSyntheticLambda3.MediaMetadataCompat = windowId;
                            colorSpaceVerificationHelperExternalSyntheticLambda3.serializer = this;
                            colorSpaceVerificationHelperExternalSyntheticLambda3.write = animator;
                            if (z) {
                                obj = animator;
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(animator);
                                obj = animatorSet;
                            }
                            obj = animator;
                            imageKtSerializer.put(obj, colorSpaceVerificationHelperExternalSyntheticLambda3);
                            this.PlaybackStateCompat.add(obj);
                        }
                    } else {
                        view = compositingStrategyCompanion2.RemoteActionCompatParcelizer;
                    }
                    compositingStrategyCompanion = null;
                    animator = animator2;
                    if (animator != null) {
                        WindowId windowId2 = viewGroup.getWindowId();
                        ColorSpaceVerificationHelperExternalSyntheticLambda2 colorSpaceVerificationHelperExternalSyntheticLambda4 = new ColorSpaceVerificationHelperExternalSyntheticLambda2();
                        colorSpaceVerificationHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer = view;
                        colorSpaceVerificationHelperExternalSyntheticLambda4.read = str;
                        colorSpaceVerificationHelperExternalSyntheticLambda4.IconCompatParcelizer = compositingStrategyCompanion;
                        colorSpaceVerificationHelperExternalSyntheticLambda4.MediaMetadataCompat = windowId2;
                        colorSpaceVerificationHelperExternalSyntheticLambda4.serializer = this;
                        colorSpaceVerificationHelperExternalSyntheticLambda4.write = animator;
                        if (z) {
                            obj = animator;
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.play(animator);
                            obj = animatorSet2;
                        }
                        obj = animator;
                        imageKtSerializer.put(obj, colorSpaceVerificationHelperExternalSyntheticLambda4);
                        this.PlaybackStateCompat.add(obj);
                    }
                }
                i++;
                size = size;
            }
            size = size;
            i++;
            size = size;
        }
        if (sparseIntArray.size() != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                ColorSpaceVerificationHelperExternalSyntheticLambda2 colorSpaceVerificationHelperExternalSyntheticLambda5 = (ColorSpaceVerificationHelperExternalSyntheticLambda2) imageKtSerializer.get((Animator) this.PlaybackStateCompat.get(sparseIntArray.keyAt(i4)));
                colorSpaceVerificationHelperExternalSyntheticLambda5.write.setStartDelay(colorSpaceVerificationHelperExternalSyntheticLambda5.write.getStartDelay() + (((long) sparseIntArray.valueAt(i4)) - Long.MAX_VALUE));
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            ((ImageKt) this._init_lambda1.MediaBrowserCompatMediaItem).clear();
            ((SparseArray) this._init_lambda1.MediaMetadataCompat).clear();
            ((ContextMenuSpec) this._init_lambda1.RatingCompat).RemoteActionCompatParcelizer();
        } else {
            ((ImageKt) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaBrowserCompatMediaItem).clear();
            ((SparseArray) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaMetadataCompat).clear();
            ((ContextMenuSpec) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat).RemoteActionCompatParcelizer();
        }
    }

    public boolean MediaBrowserCompatMediaItem() {
        return !this.ParcelableVolumeInfo.isEmpty();
    }

    public String read(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.MediaSessionCompatResultReceiverWrapper != -1) {
            sb.append("dur(");
            sb.append(this.MediaSessionCompatResultReceiverWrapper);
            sb.append(") ");
        }
        if (this._init_lambda4 != -1) {
            sb.append("dly(");
            sb.append(this._init_lambda4);
            sb.append(") ");
        }
        if (this.ResultReceiver != null) {
            sb.append("interp(");
            sb.append(this.ResultReceiver);
            sb.append(") ");
        }
        ArrayList arrayList = this._init_lambda2;
        int size = arrayList.size();
        ArrayList arrayList2 = this._init_lambda3;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void read() {
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.PlaybackStateCompatCustomAction);
        this.PlaybackStateCompatCustomAction = MediaSessionCompatQueueItem;
        while (true) {
            size--;
            if (size < 0) {
                this.PlaybackStateCompatCustomAction = animatorArr;
                RemoteActionCompatParcelizer(this, getDstBrush.RemoteActionCompatParcelizer, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    public void read(View view) {
        this._init_lambda3.add(view);
    }

    public void read(Transition$1 transition$1) {
        if (transition$1 == null) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = RatingCompat;
        } else {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = transition$1;
        }
    }

    public void MediaMetadataCompat() {
        PlaybackStateCompatCustomAction();
        ImageKt imageKtSerializer = serializer();
        for (Animator animator : this.PlaybackStateCompat) {
            if (imageKtSerializer.containsKey(animator)) {
                PlaybackStateCompatCustomAction();
                if (animator != null) {
                    animator.addListener(new ColorSpaceVerificationHelperV34(this, imageKtSerializer));
                    long j = this.MediaSessionCompatResultReceiverWrapper;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this._init_lambda4;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.ResultReceiver;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Transition$3(0, this));
                    animator.start();
                }
            }
        }
        this.PlaybackStateCompat.clear();
        MediaDescriptionCompat();
    }

    public final void RemoteActionCompatParcelizer(ViewGroup viewGroup, boolean z) {
        IconCompatParcelizer(z);
        ArrayList arrayList = this._init_lambda2;
        int size = arrayList.size();
        ArrayList arrayList2 = this._init_lambda3;
        if (size <= 0 && arrayList2.size() <= 0) {
            write(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                CompositingStrategyCompanion compositingStrategyCompanion = new CompositingStrategyCompanion(viewFindViewById);
                if (z) {
                    serializer(compositingStrategyCompanion);
                } else {
                    write(compositingStrategyCompanion);
                }
                compositingStrategyCompanion.serializer.add(this);
                RemoteActionCompatParcelizer(compositingStrategyCompanion);
                if (z) {
                    write(this._init_lambda1, viewFindViewById, compositingStrategyCompanion);
                } else {
                    write(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, viewFindViewById, compositingStrategyCompanion);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            CompositingStrategyCompanion compositingStrategyCompanion2 = new CompositingStrategyCompanion(view);
            if (z) {
                serializer(compositingStrategyCompanion2);
            } else {
                write(compositingStrategyCompanion2);
            }
            compositingStrategyCompanion2.serializer.add(this);
            RemoteActionCompatParcelizer(compositingStrategyCompanion2);
            if (z) {
                write(this._init_lambda1, view, compositingStrategyCompanion2);
            } else {
                write(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, view, compositingStrategyCompanion2);
            }
        }
    }

    public final void write(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            CompositingStrategyCompanion compositingStrategyCompanion = new CompositingStrategyCompanion(view);
            if (z) {
                serializer(compositingStrategyCompanion);
            } else {
                write(compositingStrategyCompanion);
            }
            compositingStrategyCompanion.serializer.add(this);
            RemoteActionCompatParcelizer(compositingStrategyCompanion);
            if (z) {
                write(this._init_lambda1, view, compositingStrategyCompanion);
            } else {
                write(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, view, compositingStrategyCompanion);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                write(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final CompositingStrategyCompanion IconCompatParcelizer(View view, boolean z) {
        getOffscreenNrFUSI getoffscreennrfusi = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (getoffscreennrfusi != null) {
            return getoffscreennrfusi.IconCompatParcelizer(view, z);
        }
        ArrayList arrayList = z ? this.accessensureViewModelStore : this.ComponentActivity;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            CompositingStrategyCompanion compositingStrategyCompanion = (CompositingStrategyCompanion) arrayList.get(i);
            if (compositingStrategyCompanion == null) {
                return null;
            }
            if (compositingStrategyCompanion.RemoteActionCompatParcelizer == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (CompositingStrategyCompanion) (z ? this.ComponentActivity : this.accessensureViewModelStore).get(i);
        }
        return null;
    }

    public void IconCompatParcelizer(long j, long j2) {
        long j3 = this.addObserverForBackInvoker;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
            RemoteActionCompatParcelizer(this, getDstBrush.MediaDescriptionCompat, z);
        }
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.PlaybackStateCompatCustomAction);
        this.PlaybackStateCompatCustomAction = MediaSessionCompatQueueItem;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.PlaybackStateCompatCustomAction = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        }
        RemoteActionCompatParcelizer(this, getDstBrush.IconCompatParcelizer, z);
    }

    public final void MediaDescriptionCompat() {
        int i = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 - 1;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i;
        if (i == 0) {
            RemoteActionCompatParcelizer(this, getDstBrush.IconCompatParcelizer, false);
            for (int i2 = 0; i2 < ((ContextMenuSpec) this._init_lambda1.RatingCompat).IconCompatParcelizer(); i2++) {
                View view = (View) ((ContextMenuSpec) this._init_lambda1.RatingCompat).write(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((ContextMenuSpec) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat).IconCompatParcelizer(); i3++) {
                View view2 = (View) ((ContextMenuSpec) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RatingCompat).write(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
        }
    }

    public final ColorSpaceVerificationHelperExternalSyntheticLambda0 MediaSessionCompatQueueItem() {
        getOffscreenNrFUSI getoffscreennrfusi = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        return getoffscreennrfusi != null ? getoffscreennrfusi.MediaSessionCompatQueueItem() : this;
    }

    public final void PlaybackStateCompatCustomAction() {
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == 0) {
            RemoteActionCompatParcelizer(this, getDstBrush.MediaDescriptionCompat, false);
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4++;
    }

    public void RemoteActionCompatParcelizer(View view) {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            return;
        }
        ArrayList arrayList = this.ParcelableVolumeInfo;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.PlaybackStateCompatCustomAction);
        this.PlaybackStateCompatCustomAction = MediaSessionCompatQueueItem;
        while (true) {
            size--;
            if (size < 0) {
                this.PlaybackStateCompatCustomAction = animatorArr;
                RemoteActionCompatParcelizer(this, getDstBrush.serializer, false);
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0, getDstBrush getdstbrush, boolean z) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda1 = this.MediaSessionCompatToken;
        if (colorSpaceVerificationHelperExternalSyntheticLambda1 != null) {
            colorSpaceVerificationHelperExternalSyntheticLambda1.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getdstbrush, z);
        }
        ArrayList arrayList = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.size();
        obtainAndroidColorSpace[] obtainandroidcolorspaceArr = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (obtainandroidcolorspaceArr == null) {
            obtainandroidcolorspaceArr = new obtainAndroidColorSpace[size];
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        obtainAndroidColorSpace[] obtainandroidcolorspaceArr2 = (obtainAndroidColorSpace[]) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.toArray(obtainandroidcolorspaceArr);
        for (int i = 0; i < size; i++) {
            getdstbrush.serializer(obtainandroidcolorspaceArr2[i], colorSpaceVerificationHelperExternalSyntheticLambda0, z);
            obtainandroidcolorspaceArr2[i] = null;
        }
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = obtainandroidcolorspaceArr2;
    }

    public final CompositingStrategyCompanion serializer(View view, boolean z) {
        getOffscreenNrFUSI getoffscreennrfusi = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (getoffscreennrfusi != null) {
            return getoffscreennrfusi.serializer(view, z);
        }
        return (CompositingStrategyCompanion) ((ImageKt) (z ? this._init_lambda1 : this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).MediaBrowserCompatMediaItem).get(view);
    }

    public final boolean serializer(View view) {
        int id = view.getId();
        ArrayList arrayList = this._init_lambda2;
        int size = arrayList.size();
        ArrayList arrayList2 = this._init_lambda3;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void write(View view) {
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28) {
            if (!this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                ArrayList arrayList = this.ParcelableVolumeInfo;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.PlaybackStateCompatCustomAction);
                this.PlaybackStateCompatCustomAction = MediaSessionCompatQueueItem;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.PlaybackStateCompatCustomAction = animatorArr;
                RemoteActionCompatParcelizer(this, getDstBrush.read, false);
            }
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = false;
        }
    }

    public ColorSpaceVerificationHelperExternalSyntheticLambda0 write(obtainAndroidColorSpace obtainandroidcolorspace) {
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0;
        ArrayList arrayList = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (arrayList != null) {
            if (!arrayList.remove(obtainandroidcolorspace) && (colorSpaceVerificationHelperExternalSyntheticLambda0 = this.MediaSessionCompatToken) != null) {
                colorSpaceVerificationHelperExternalSyntheticLambda0.write(obtainandroidcolorspace);
            }
            if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.size() == 0) {
                this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
            }
        }
        return this;
    }

    public boolean write(CompositingStrategyCompanion compositingStrategyCompanion, CompositingStrategyCompanion compositingStrategyCompanion2) {
        if (compositingStrategyCompanion != null && compositingStrategyCompanion2 != null) {
            String[] strArrWrite = write();
            if (strArrWrite != null) {
                for (String str : strArrWrite) {
                    if (serializer(compositingStrategyCompanion, compositingStrategyCompanion2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = compositingStrategyCompanion.write.keySet().iterator();
                while (it.hasNext()) {
                    if (serializer(compositingStrategyCompanion, compositingStrategyCompanion2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void RatingCompat() {
        ImageKt imageKtSerializer = serializer();
        this.addObserverForBackInvoker = 0L;
        int i = 0;
        while (true) {
            int size = this.PlaybackStateCompat.size();
            ArrayList arrayList = this.PlaybackStateCompat;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            ColorSpaceVerificationHelperExternalSyntheticLambda2 colorSpaceVerificationHelperExternalSyntheticLambda2 = (ColorSpaceVerificationHelperExternalSyntheticLambda2) imageKtSerializer.get(animator);
            if (animator != null && colorSpaceVerificationHelperExternalSyntheticLambda2 != null) {
                Animator animator2 = colorSpaceVerificationHelperExternalSyntheticLambda2.write;
                long j = this.MediaSessionCompatResultReceiverWrapper;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this._init_lambda4;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.ResultReceiver;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.ParcelableVolumeInfo.add(animator);
                this.addObserverForBackInvoker = Math.max(this.addObserverForBackInvoker, animator.getTotalDuration());
            }
            i++;
        }
    }

    public void read(obtainAndroidColorSpace obtainandroidcolorspace) {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ArrayList();
        }
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.add(obtainandroidcolorspace);
    }

    public final String toString() {
        return read("");
    }
}
