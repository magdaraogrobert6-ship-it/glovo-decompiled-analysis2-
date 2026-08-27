package o;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetAutocp implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewGroup RemoteActionCompatParcelizer;
    public ColorSpaceVerificationHelperExternalSyntheticLambda0 serializer;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0216  */
    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:149:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:152:0x030f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0316  */
    /* JADX WARN: Code duplicated, block: B:156:0x0319  */
    /* JADX WARN: Code duplicated, block: B:158:0x0329 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:161:0x01e2 A[EDGE_INSN: B:161:0x01e2->B:88:0x01e2 BREAK  A[LOOP:1: B:19:0x0088->B:87:0x01dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[LOOP:0: B:15:0x0053->B:17:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:98:0x0208  */
    /* JADX WARN: Instruction removed from duplicated block: B:147:0x02ee, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        androidx.transition.TransitionValuesMaps transitionValuesMaps;
        androidx.transition.TransitionValuesMaps transitionValuesMaps2;
        ImageKt imageKt;
        ImageKt imageKt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        ImageKt imageKtSerializer;
        ArrayList arrayList2;
        int i5;
        int i6;
        CompositeShaderBrush compositeShaderBrush;
        int i7;
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0;
        Animator animator;
        ColorSpaceVerificationHelperExternalSyntheticLambda2 colorSpaceVerificationHelperExternalSyntheticLambda2;
        CompositingStrategyCompanion compositingStrategyCompanion;
        CompositingStrategyCompanion compositingStrategyCompanion2;
        int i8;
        int i9;
        int i10;
        View view;
        CompositingStrategyCompanion compositingStrategyCompanion3;
        ImageKt imageKt3;
        int i11;
        int i12;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i13;
        View view4;
        View view5;
        ContextMenuSpec contextMenuSpec;
        int iIconCompatParcelizer;
        int i14;
        View view6;
        int i15;
        Iterator it;
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda1 = this.serializer;
        ViewGroup viewGroup = this.RemoteActionCompatParcelizer;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        int i16 = 1;
        if (!accessgetModulateAlphacp.serializer.remove(viewGroup)) {
            return true;
        }
        ImageKt imageKtIconCompatParcelizer = accessgetModulateAlphacp.IconCompatParcelizer();
        ArrayList arrayList3 = (ArrayList) imageKtIconCompatParcelizer.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(colorSpaceVerificationHelperExternalSyntheticLambda1);
            colorSpaceVerificationHelperExternalSyntheticLambda1.read(new CompositingStrategy(this, imageKtIconCompatParcelizer));
            i = 0;
            colorSpaceVerificationHelperExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewGroup, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ColorSpaceVerificationHelperExternalSyntheticLambda0) it.next()).write(viewGroup);
                }
            }
            colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore = new ArrayList();
            colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity = new ArrayList();
            transitionValuesMaps = colorSpaceVerificationHelperExternalSyntheticLambda1._init_lambda1;
            transitionValuesMaps2 = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            imageKt = new ImageKt((ImageKt) transitionValuesMaps.MediaBrowserCompatMediaItem);
            imageKt2 = new ImageKt((ImageKt) transitionValuesMaps2.MediaBrowserCompatMediaItem);
            i2 = 0;
            while (true) {
                iArr = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                if (i2 < iArr.length) {
                    break;
                }
                i8 = iArr[i2];
                if (i8 != i16) {
                    i9 = i2;
                    for (i10 = imageKt.MediaMetadataCompat - 1; i10 >= 0; i10--) {
                        view = (View) imageKt.IconCompatParcelizer(i10);
                        if (view == null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view) && (compositingStrategyCompanion3 = (CompositingStrategyCompanion) imageKt2.remove(view)) != null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(compositingStrategyCompanion3.RemoteActionCompatParcelizer)) {
                            colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add((CompositingStrategyCompanion) imageKt.RemoteActionCompatParcelizer(i10));
                            colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(compositingStrategyCompanion3);
                        }
                    }
                } else if (i8 != 2) {
                    i9 = i2;
                    imageKt3 = (ImageKt) transitionValuesMaps.MediaDescriptionCompat;
                    ImageKt imageKt4 = (ImageKt) transitionValuesMaps2.MediaDescriptionCompat;
                    i11 = imageKt3.MediaMetadataCompat;
                    for (i12 = 0; i12 < i11; i12++) {
                        view2 = (View) imageKt3.write(i12);
                        if (view2 == null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view2) && (view3 = (View) imageKt4.get((String) imageKt3.IconCompatParcelizer(i12))) != null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view3)) {
                            CompositingStrategyCompanion compositingStrategyCompanion4 = (CompositingStrategyCompanion) imageKt.get(view2);
                            CompositingStrategyCompanion compositingStrategyCompanion5 = (CompositingStrategyCompanion) imageKt2.get(view3);
                            if (compositingStrategyCompanion4 != null && compositingStrategyCompanion5 != null) {
                                colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(compositingStrategyCompanion4);
                                colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(compositingStrategyCompanion5);
                                imageKt.remove(view2);
                                imageKt2.remove(view3);
                            }
                        }
                    }
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        contextMenuSpec = (ContextMenuSpec) transitionValuesMaps.RatingCompat;
                        ContextMenuSpec contextMenuSpec2 = (ContextMenuSpec) transitionValuesMaps2.RatingCompat;
                        iIconCompatParcelizer = contextMenuSpec.IconCompatParcelizer();
                        i14 = i;
                        while (i14 < iIconCompatParcelizer) {
                            view6 = (View) contextMenuSpec.write(i14);
                            if (view6 == null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view6)) {
                                i15 = i2;
                                View view7 = (View) contextMenuSpec2.write(contextMenuSpec.IconCompatParcelizer(i14));
                                if (view7 != null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view7)) {
                                    CompositingStrategyCompanion compositingStrategyCompanion6 = (CompositingStrategyCompanion) imageKt.get(view6);
                                    CompositingStrategyCompanion compositingStrategyCompanion7 = (CompositingStrategyCompanion) imageKt2.get(view7);
                                    if (compositingStrategyCompanion6 != null && compositingStrategyCompanion7 != null) {
                                        colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(compositingStrategyCompanion6);
                                        colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(compositingStrategyCompanion7);
                                        imageKt.remove(view6);
                                        imageKt2.remove(view7);
                                    }
                                }
                            } else {
                                i15 = i2;
                            }
                            i14++;
                            i2 = i15;
                        }
                    }
                    i9 = i2;
                } else {
                    i9 = i2;
                    sparseArray = (SparseArray) transitionValuesMaps.MediaMetadataCompat;
                    SparseArray sparseArray2 = (SparseArray) transitionValuesMaps2.MediaMetadataCompat;
                    size = sparseArray.size();
                    for (i13 = 0; i13 < size; i13++) {
                        view4 = (View) sparseArray.valueAt(i13);
                        if (view4 == null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i13))) != null && colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view5)) {
                            CompositingStrategyCompanion compositingStrategyCompanion8 = (CompositingStrategyCompanion) imageKt.get(view4);
                            CompositingStrategyCompanion compositingStrategyCompanion9 = (CompositingStrategyCompanion) imageKt2.get(view5);
                            if (compositingStrategyCompanion8 != null && compositingStrategyCompanion9 != null) {
                                colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(compositingStrategyCompanion8);
                                colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(compositingStrategyCompanion9);
                                imageKt.remove(view4);
                                imageKt2.remove(view5);
                            }
                        }
                    }
                }
                i2 = i9 + 1;
                i16 = 1;
                i = 0;
            }
            for (i3 = 0; i3 < imageKt.MediaMetadataCompat; i3++) {
                compositingStrategyCompanion2 = (CompositingStrategyCompanion) imageKt.write(i3);
                if (colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(compositingStrategyCompanion2.RemoteActionCompatParcelizer)) {
                    colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(compositingStrategyCompanion2);
                    colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(null);
                }
            }
            for (i4 = 0; i4 < imageKt2.MediaMetadataCompat; i4++) {
                compositingStrategyCompanion = (CompositingStrategyCompanion) imageKt2.write(i4);
                if (colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(compositingStrategyCompanion.RemoteActionCompatParcelizer)) {
                    colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(compositingStrategyCompanion);
                    colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(null);
                }
            }
            imageKtSerializer = ColorSpaceVerificationHelperExternalSyntheticLambda0.serializer();
            int i17 = imageKtSerializer.MediaMetadataCompat;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            for (i5 = i17 - 1; i5 >= 0; i5--) {
                animator = (Animator) imageKtSerializer.IconCompatParcelizer(i5);
                if (animator == null && (colorSpaceVerificationHelperExternalSyntheticLambda2 = (ColorSpaceVerificationHelperExternalSyntheticLambda2) imageKtSerializer.get(animator)) != null) {
                    ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda3 = colorSpaceVerificationHelperExternalSyntheticLambda2.serializer;
                    View view8 = colorSpaceVerificationHelperExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                    if (view8 != null && windowId.equals(colorSpaceVerificationHelperExternalSyntheticLambda2.MediaMetadataCompat)) {
                        CompositingStrategyCompanion compositingStrategyCompanion10 = colorSpaceVerificationHelperExternalSyntheticLambda2.IconCompatParcelizer;
                        CompositingStrategyCompanion compositingStrategyCompanionSerializer = colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(view8, true);
                        CompositingStrategyCompanion compositingStrategyCompanionIconCompatParcelizer = colorSpaceVerificationHelperExternalSyntheticLambda1.IconCompatParcelizer(view8, true);
                        if (compositingStrategyCompanionSerializer == null && compositingStrategyCompanionIconCompatParcelizer == null) {
                            compositingStrategyCompanionIconCompatParcelizer = (CompositingStrategyCompanion) ((ImageKt) colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.MediaBrowserCompatMediaItem).get(view8);
                        }
                        if ((compositingStrategyCompanionSerializer != null || compositingStrategyCompanionIconCompatParcelizer != null) && colorSpaceVerificationHelperExternalSyntheticLambda3.write(compositingStrategyCompanion10, compositingStrategyCompanionIconCompatParcelizer)) {
                            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0MediaSessionCompatQueueItem = colorSpaceVerificationHelperExternalSyntheticLambda3.MediaSessionCompatQueueItem();
                            ArrayList arrayList4 = colorSpaceVerificationHelperExternalSyntheticLambda3.ParcelableVolumeInfo;
                            if (colorSpaceVerificationHelperExternalSyntheticLambda0MediaSessionCompatQueueItem.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw != null) {
                                animator.cancel();
                                arrayList4.remove(animator);
                                imageKtSerializer.RemoteActionCompatParcelizer(i5);
                                if (arrayList4.size() == 0) {
                                    arrayList2.add(colorSpaceVerificationHelperExternalSyntheticLambda3);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                imageKtSerializer.RemoteActionCompatParcelizer(i5);
                            }
                        }
                    }
                }
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) arrayList2.get(i6);
                colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getDstBrush.RemoteActionCompatParcelizer, false);
                if (!colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                    colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                    colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getDstBrush.IconCompatParcelizer, false);
                }
            }
            colorSpaceVerificationHelperExternalSyntheticLambda1.IconCompatParcelizer(viewGroup, colorSpaceVerificationHelperExternalSyntheticLambda1._init_lambda1, colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore, colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity);
            if (colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
                colorSpaceVerificationHelperExternalSyntheticLambda1.MediaMetadataCompat();
                return true;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                return true;
            }
            colorSpaceVerificationHelperExternalSyntheticLambda1.RatingCompat();
            CompositeShaderBrush compositeShaderBrush2 = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            getOffscreenNrFUSI getoffscreennrfusi = compositeShaderBrush2.MediaBrowserCompatMediaItem;
            long j = getoffscreennrfusi.addObserverForBackInvoker == 0 ? 1L : 0L;
            getoffscreennrfusi.IconCompatParcelizer(j, compositeShaderBrush2.RemoteActionCompatParcelizer);
            compositeShaderBrush2.RemoteActionCompatParcelizer = j;
            compositeShaderBrush = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
            compositeShaderBrush.serializer = true;
            i7 = compositeShaderBrush.read;
            if (i7 == 1) {
                compositeShaderBrush.read = 0;
                compositeShaderBrush.IconCompatParcelizer();
                return true;
            }
            if (i7 == 2) {
                return true;
            }
            compositeShaderBrush.read = 0;
            compositeShaderBrush.IconCompatParcelizer = compositeShaderBrush.IconCompatParcelizer;
            compositeShaderBrush.RemoteActionCompatParcelizer();
            compositeShaderBrush.MediaMetadataCompat.read(0.0f);
            return true;
        }
        arrayList3 = new ArrayList();
        imageKtIconCompatParcelizer.put(viewGroup, arrayList3);
        arrayList3.add(colorSpaceVerificationHelperExternalSyntheticLambda1);
        colorSpaceVerificationHelperExternalSyntheticLambda1.read(new CompositingStrategy(this, imageKtIconCompatParcelizer));
        i = 0;
        colorSpaceVerificationHelperExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewGroup, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) it.next()).write(viewGroup);
            }
        }
        colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore = new ArrayList();
        colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity = new ArrayList();
        transitionValuesMaps = colorSpaceVerificationHelperExternalSyntheticLambda1._init_lambda1;
        transitionValuesMaps2 = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        imageKt = new ImageKt((ImageKt) transitionValuesMaps.MediaBrowserCompatMediaItem);
        imageKt2 = new ImageKt((ImageKt) transitionValuesMaps2.MediaBrowserCompatMediaItem);
        i2 = 0;
        while (true) {
            iArr = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (i2 < iArr.length) {
                break;
                break;
            }
            i8 = iArr[i2];
            if (i8 != i16) {
                i9 = i2;
                while (i10 >= 0) {
                    view = (View) imageKt.IconCompatParcelizer(i10);
                    if (view == null) {
                    }
                }
            } else if (i8 != 2) {
                i9 = i2;
                imageKt3 = (ImageKt) transitionValuesMaps.MediaDescriptionCompat;
                ImageKt imageKt5 = (ImageKt) transitionValuesMaps2.MediaDescriptionCompat;
                i11 = imageKt3.MediaMetadataCompat;
                while (i12 < i11) {
                    view2 = (View) imageKt3.write(i12);
                    if (view2 == null) {
                    }
                }
            } else if (i8 != 3) {
                if (i8 == 4) {
                    contextMenuSpec = (ContextMenuSpec) transitionValuesMaps.RatingCompat;
                    ContextMenuSpec contextMenuSpec3 = (ContextMenuSpec) transitionValuesMaps2.RatingCompat;
                    iIconCompatParcelizer = contextMenuSpec.IconCompatParcelizer();
                    i14 = i;
                    while (i14 < iIconCompatParcelizer) {
                        view6 = (View) contextMenuSpec.write(i14);
                        if (view6 == null) {
                            i15 = i2;
                        } else {
                            i15 = i2;
                        }
                        i14++;
                        i2 = i15;
                    }
                }
                i9 = i2;
            } else {
                i9 = i2;
                sparseArray = (SparseArray) transitionValuesMaps.MediaMetadataCompat;
                SparseArray sparseArray3 = (SparseArray) transitionValuesMaps2.MediaMetadataCompat;
                size = sparseArray.size();
                while (i13 < size) {
                    view4 = (View) sparseArray.valueAt(i13);
                    if (view4 == null) {
                    }
                }
            }
            i2 = i9 + 1;
            i16 = 1;
            i = 0;
        }
        while (i3 < imageKt.MediaMetadataCompat) {
            compositingStrategyCompanion2 = (CompositingStrategyCompanion) imageKt.write(i3);
            if (colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(compositingStrategyCompanion2.RemoteActionCompatParcelizer)) {
                colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(compositingStrategyCompanion2);
                colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(null);
            }
        }
        while (i4 < imageKt2.MediaMetadataCompat) {
            compositingStrategyCompanion = (CompositingStrategyCompanion) imageKt2.write(i4);
            if (colorSpaceVerificationHelperExternalSyntheticLambda1.serializer(compositingStrategyCompanion.RemoteActionCompatParcelizer)) {
                colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity.add(compositingStrategyCompanion);
                colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore.add(null);
            }
        }
        imageKtSerializer = ColorSpaceVerificationHelperExternalSyntheticLambda0.serializer();
        int i18 = imageKtSerializer.MediaMetadataCompat;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        while (i5 >= 0) {
            animator = (Animator) imageKtSerializer.IconCompatParcelizer(i5);
            if (animator == null) {
            }
        }
        while (i6 < arrayList2.size()) {
            colorSpaceVerificationHelperExternalSyntheticLambda0 = (ColorSpaceVerificationHelperExternalSyntheticLambda0) arrayList2.get(i6);
            colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getDstBrush.RemoteActionCompatParcelizer, false);
            if (!colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
                colorSpaceVerificationHelperExternalSyntheticLambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getDstBrush.IconCompatParcelizer, false);
            }
        }
        colorSpaceVerificationHelperExternalSyntheticLambda1.IconCompatParcelizer(viewGroup, colorSpaceVerificationHelperExternalSyntheticLambda1._init_lambda1, colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, colorSpaceVerificationHelperExternalSyntheticLambda1.accessensureViewModelStore, colorSpaceVerificationHelperExternalSyntheticLambda1.ComponentActivity);
        if (colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
            colorSpaceVerificationHelperExternalSyntheticLambda1.MediaMetadataCompat();
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        colorSpaceVerificationHelperExternalSyntheticLambda1.RatingCompat();
        CompositeShaderBrush compositeShaderBrush3 = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        getOffscreenNrFUSI getoffscreennrfusi2 = compositeShaderBrush3.MediaBrowserCompatMediaItem;
        if (getoffscreennrfusi2.addObserverForBackInvoker == 0) {
        }
        getoffscreennrfusi2.IconCompatParcelizer(j, compositeShaderBrush3.RemoteActionCompatParcelizer);
        compositeShaderBrush3.RemoteActionCompatParcelizer = j;
        compositeShaderBrush = colorSpaceVerificationHelperExternalSyntheticLambda1.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        compositeShaderBrush.serializer = true;
        i7 = compositeShaderBrush.read;
        if (i7 == 1) {
            compositeShaderBrush.read = 0;
            compositeShaderBrush.IconCompatParcelizer();
            return true;
        }
        if (i7 == 2) {
            return true;
        }
        compositeShaderBrush.read = 0;
        compositeShaderBrush.IconCompatParcelizer = compositeShaderBrush.IconCompatParcelizer;
        compositeShaderBrush.RemoteActionCompatParcelizer();
        compositeShaderBrush.MediaMetadataCompat.read(0.0f);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.RemoteActionCompatParcelizer;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        accessgetModulateAlphacp.serializer.remove(viewGroup);
        ArrayList arrayList = (ArrayList) accessgetModulateAlphacp.IconCompatParcelizer().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ColorSpaceVerificationHelperExternalSyntheticLambda0) it.next()).write(viewGroup);
            }
        }
        this.serializer.IconCompatParcelizer(true);
    }
}
