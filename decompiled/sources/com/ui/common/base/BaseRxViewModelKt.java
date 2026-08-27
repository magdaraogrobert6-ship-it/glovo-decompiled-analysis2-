package com.ui.common.base;

import com.data.util.AndroidScheduleProvider;
import com.incognia.internal.mn$$ExternalSyntheticLambda0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.DrawWithContentElement;
import o.PainterModifierKt;
import o.calculateScaledSizeE7KxVPU;
import o.getClip;
import o.getUseIntrinsicSize;
import o.hasSpecifiedAndFiniteHeightuvyYCjk;
import o.hasSpecifiedAndFiniteWidthuvyYCjk;
import o.paintdefault;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.rotate;
import o.setAlignment;
import o.setPainter;
import o.setSizeToIntrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseRxViewModelKt {
    public static getClip read(setAlignment setalignment, int i, ArrayList arrayList, getClip getclip) {
        int i2;
        int i3 = i == 0 ? setalignment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM : setalignment.onRetainCustomNonConfigurationInstance;
        if (i3 != -1 && (getclip == null || i3 != getclip.RemoteActionCompatParcelizer)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                getClip getclip2 = (getClip) arrayList.get(i4);
                if (getclip2.RemoteActionCompatParcelizer == i3) {
                    if (getclip != null) {
                        getclip.IconCompatParcelizer(i, getclip2);
                        arrayList.remove(getclip);
                    }
                    getclip = getclip2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return getclip;
        }
        if (getclip == null) {
            if (setalignment instanceof setPainter) {
                setPainter setpainter = (setPainter) setalignment;
                int i5 = 0;
                while (true) {
                    if (i5 >= setpainter.removeOnMultiWindowModeChangedListener) {
                        i2 = -1;
                        break;
                    }
                    setAlignment setalignment2 = setpainter.removeOnContextAvailableListener[i5];
                    if ((i == 0 && (i2 = setalignment2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) != -1) || (i == 1 && (i2 = setalignment2.onRetainCustomNonConfigurationInstance) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        getClip getclip3 = (getClip) arrayList.get(i6);
                        if (getclip3.RemoteActionCompatParcelizer == i2) {
                            getclip = getclip3;
                            break;
                        }
                    }
                }
            }
            if (getclip == null) {
                getclip = new getClip();
                getclip.MediaDescriptionCompat = new ArrayList();
                getclip.serializer = null;
                getclip.read = -1;
                int i7 = getClip.IconCompatParcelizer;
                getClip.IconCompatParcelizer = i7 + 1;
                getclip.RemoteActionCompatParcelizer = i7;
                getclip.write = i;
            }
            arrayList.add(getclip);
        }
        if (getclip.write(setalignment)) {
            if (setalignment instanceof setSizeToIntrinsics) {
                setSizeToIntrinsics setsizetointrinsics = (setSizeToIntrinsics) setalignment;
                setsizetointrinsics.IconCompatParcelizer.RemoteActionCompatParcelizer(setsizetointrinsics.read == 0 ? 1 : 0, getclip, arrayList);
            }
            int i8 = getclip.RemoteActionCompatParcelizer;
            if (i == 0) {
                setalignment.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i8;
                setalignment.onBackPressedDispatcher_delegatelambda010.RemoteActionCompatParcelizer(i, getclip, arrayList);
                setalignment.invalidateMenu.RemoteActionCompatParcelizer(i, getclip, arrayList);
            } else {
                setalignment.onRetainCustomNonConfigurationInstance = i8;
                setalignment.onActivityResult.RemoteActionCompatParcelizer(i, getclip, arrayList);
                setalignment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.RemoteActionCompatParcelizer(i, getclip, arrayList);
                setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(i, getclip, arrayList);
            }
            setalignment.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer(i, getclip, arrayList);
        }
        return getclip;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x0342  */
    /* JADX WARN: Code duplicated, block: B:199:0x034e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0364  */
    public static boolean read(getUseIntrinsicSize getuseintrinsicsize, rotate rotateVar) {
        DrawWithContentElement drawWithContentElement;
        getClip getclip;
        int i;
        getClip getclip2;
        int iWrite;
        DrawWithContentElement drawWithContentElement2;
        getClip getclip3;
        getClip getclip4;
        ArrayList arrayList = getuseintrinsicsize.serializer;
        DrawWithContentElement drawWithContentElement3 = getuseintrinsicsize.ComponentActivity;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = getuseintrinsicsize.addOnNewIntentListener;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            setAlignment setalignment = (setAlignment) arrayList.get(i2);
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjkArr[0];
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasspecifiedandfiniteheightuvyycjkArr[1];
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr2 = setalignment.addOnNewIntentListener;
            if (!serializer(hasspecifiedandfiniteheightuvyycjk, hasspecifiedandfiniteheightuvyycjk2, hasspecifiedandfiniteheightuvyycjkArr2[0], hasspecifiedandfiniteheightuvyycjkArr2[1]) || (setalignment instanceof hasSpecifiedAndFiniteWidthuvyYCjk)) {
                return false;
            }
        }
        int i3 = 0;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<setPainter> arrayList4 = null;
        ArrayList<setPainter> arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        while (i3 < size) {
            setAlignment setalignment2 = (setAlignment) arrayList.get(i3);
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasspecifiedandfiniteheightuvyycjkArr[0];
            DrawWithContentElement drawWithContentElement4 = drawWithContentElement3;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4 = hasspecifiedandfiniteheightuvyycjkArr[1];
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr3 = hasspecifiedandfiniteheightuvyycjkArr;
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr4 = setalignment2.addOnNewIntentListener;
            ArrayList arrayList8 = arrayList;
            if (!serializer(hasspecifiedandfiniteheightuvyycjk3, hasspecifiedandfiniteheightuvyycjk4, hasspecifiedandfiniteheightuvyycjkArr4[0], hasspecifiedandfiniteheightuvyycjkArr4[1])) {
                getUseIntrinsicSize.read(setalignment2, rotateVar, getuseintrinsicsize.MediaMetadataCompat);
            }
            boolean z = setalignment2 instanceof setSizeToIntrinsics;
            if (z) {
                setSizeToIntrinsics setsizetointrinsics = (setSizeToIntrinsics) setalignment2;
                if (setsizetointrinsics.read == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(setsizetointrinsics);
                }
                if (setsizetointrinsics.read == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(setsizetointrinsics);
                }
            }
            if (setalignment2 instanceof setPainter) {
                if (setalignment2 instanceof PainterModifierKt) {
                    PainterModifierKt painterModifierKt = (PainterModifierKt) setalignment2;
                    if (painterModifierKt.serializer() == 0) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(painterModifierKt);
                    }
                    if (painterModifierKt.serializer() == 1) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(painterModifierKt);
                    }
                } else {
                    setPainter setpainter = (setPainter) setalignment2;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(setpainter);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(setpainter);
                }
            }
            if (setalignment2.onBackPressedDispatcher_delegatelambda010.MediaSessionCompatQueueItem == null && setalignment2.invalidateMenu.MediaSessionCompatQueueItem == null && !z && !(setalignment2 instanceof PainterModifierKt)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(setalignment2);
            }
            if (setalignment2.onActivityResult.MediaSessionCompatQueueItem == null && setalignment2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaSessionCompatQueueItem == null && setalignment2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaSessionCompatQueueItem == null && !z && !(setalignment2 instanceof PainterModifierKt)) {
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                arrayList7.add(setalignment2);
            }
            i3++;
            drawWithContentElement3 = drawWithContentElement4;
            hasspecifiedandfiniteheightuvyycjkArr = hasspecifiedandfiniteheightuvyycjkArr3;
            arrayList = arrayList8;
        }
        ArrayList arrayList9 = arrayList;
        DrawWithContentElement drawWithContentElement5 = drawWithContentElement3;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr5 = hasspecifiedandfiniteheightuvyycjkArr;
        ArrayList<getClip> arrayList10 = new ArrayList();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                read((setSizeToIntrinsics) it.next(), 0, arrayList10, null);
            }
        }
        getClip getclip5 = null;
        if (arrayList4 != null) {
            for (setPainter setpainter2 : arrayList4) {
                getClip getclip6 = read(setpainter2, 0, arrayList10, getclip5);
                setpainter2.write(0, getclip6, arrayList10);
                getclip6.read(arrayList10);
                getclip5 = null;
            }
        }
        HashSet hashSet = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.LEFT).write;
        if (hashSet != null) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                read(((paintdefault) it2.next()).RatingCompat, 0, arrayList10, null);
            }
        }
        HashSet hashSet2 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.RIGHT).write;
        if (hashSet2 != null) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                read(((paintdefault) it3.next()).RatingCompat, 0, arrayList10, null);
            }
        }
        HashSet hashSet3 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.CENTER).write;
        if (hashSet3 != null) {
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                read(((paintdefault) it4.next()).RatingCompat, 0, arrayList10, null);
            }
        }
        getClip getclip7 = null;
        if (arrayList6 != null) {
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                read((setAlignment) it5.next(), 0, arrayList10, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                read((setSizeToIntrinsics) it6.next(), 1, arrayList10, null);
            }
        }
        if (arrayList5 != null) {
            for (setPainter setpainter3 : arrayList5) {
                getClip getclip8 = read(setpainter3, 1, arrayList10, getclip7);
                setpainter3.write(1, getclip8, arrayList10);
                getclip8.read(arrayList10);
                getclip7 = null;
            }
        }
        HashSet hashSet4 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.TOP).write;
        if (hashSet4 != null) {
            Iterator it7 = hashSet4.iterator();
            while (it7.hasNext()) {
                read(((paintdefault) it7.next()).RatingCompat, 1, arrayList10, null);
            }
        }
        HashSet hashSet5 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BASELINE).write;
        if (hashSet5 != null) {
            Iterator it8 = hashSet5.iterator();
            while (it8.hasNext()) {
                read(((paintdefault) it8.next()).RatingCompat, 1, arrayList10, null);
            }
        }
        HashSet hashSet6 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.BOTTOM).write;
        if (hashSet6 != null) {
            Iterator it9 = hashSet6.iterator();
            while (it9.hasNext()) {
                read(((paintdefault) it9.next()).RatingCompat, 1, arrayList10, null);
            }
        }
        HashSet hashSet7 = getuseintrinsicsize.RemoteActionCompatParcelizer(calculateScaledSizeE7KxVPU.CENTER).write;
        if (hashSet7 != null) {
            Iterator it10 = hashSet7.iterator();
            while (it10.hasNext()) {
                read(((paintdefault) it10.next()).RatingCompat, 1, arrayList10, null);
            }
        }
        getClip getclip9 = null;
        if (arrayList7 != null) {
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                read((setAlignment) it11.next(), 1, arrayList10, null);
            }
        }
        int i4 = 0;
        while (i4 < size) {
            ArrayList arrayList11 = arrayList9;
            setAlignment setalignment3 = (setAlignment) arrayList11.get(i4);
            hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr6 = setalignment3.addOnNewIntentListener;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5 = hasspecifiedandfiniteheightuvyycjkArr6[0];
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
            if (hasspecifiedandfiniteheightuvyycjk5 == hasspecifiedandfiniteheightuvyycjk6 && hasspecifiedandfiniteheightuvyycjkArr6[1] == hasspecifiedandfiniteheightuvyycjk6) {
                int i5 = setalignment3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                int size2 = arrayList10.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        getclip3 = null;
                        break;
                    }
                    getclip3 = (getClip) arrayList10.get(i6);
                    if (i5 == getclip3.RemoteActionCompatParcelizer) {
                        break;
                    }
                    i6++;
                }
                int i7 = setalignment3.onRetainCustomNonConfigurationInstance;
                int size3 = arrayList10.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        getclip4 = null;
                        break;
                    }
                    getclip4 = (getClip) arrayList10.get(i8);
                    if (i7 == getclip4.RemoteActionCompatParcelizer) {
                        break;
                    }
                    i8++;
                }
                if (getclip3 != null && getclip4 != null) {
                    getclip3.IconCompatParcelizer(0, getclip4);
                    getclip4.write = 2;
                    arrayList10.remove(getclip3);
                }
            }
            i4++;
            arrayList9 = arrayList11;
        }
        if (arrayList10.size() > 1) {
            if (hasspecifiedandfiniteheightuvyycjkArr5[0] == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) {
                int i9 = 0;
                getclip = null;
                for (getClip getclip10 : arrayList10) {
                    if (getclip10.write == 1) {
                        drawWithContentElement2 = drawWithContentElement5;
                    } else {
                        drawWithContentElement2 = drawWithContentElement5;
                        int iWrite2 = getclip10.write(drawWithContentElement2, 0);
                        if (iWrite2 > i9) {
                            getclip = getclip10;
                            drawWithContentElement5 = drawWithContentElement2;
                            i9 = iWrite2;
                        }
                    }
                    drawWithContentElement5 = drawWithContentElement2;
                }
                drawWithContentElement = drawWithContentElement5;
                if (getclip != null) {
                    getuseintrinsicsize.write(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
                    getuseintrinsicsize.MediaSessionCompatQueueItem(i9);
                }
                if (hasspecifiedandfiniteheightuvyycjkArr5[1] == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) {
                    i = 0;
                    getclip2 = null;
                    for (getClip getclip11 : arrayList10) {
                        if (getclip11.write != 0 && (iWrite = getclip11.write(drawWithContentElement, 1)) > i) {
                            getclip2 = getclip11;
                            i = iWrite;
                        }
                    }
                    if (getclip2 != null) {
                        getuseintrinsicsize.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
                        getuseintrinsicsize.MediaMetadataCompat(i);
                        getclip9 = getclip2;
                    }
                }
                if (getclip == null || getclip9 != null) {
                    return true;
                }
            } else {
                drawWithContentElement = drawWithContentElement5;
            }
            getclip = null;
            if (hasspecifiedandfiniteheightuvyycjkArr5[1] == hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) {
                i = 0;
                getclip2 = null;
                while (r1.hasNext()) {
                    if (getclip11.write != 0) {
                        getclip2 = getclip11;
                        i = iWrite;
                    }
                }
                if (getclip2 != null) {
                    getuseintrinsicsize.RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk.FIXED);
                    getuseintrinsicsize.MediaMetadataCompat(i);
                    getclip9 = getclip2;
                }
            }
            if (getclip == null) {
            }
            return true;
        }
        return false;
    }

    public static void read(BaseRxViewModel baseRxViewModel, BehaviorSubject behaviorSubject, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        BrazeInAppMessageManagerExternalSyntheticLambda45 brazeInAppMessageManagerExternalSyntheticLambda45 = new BrazeInAppMessageManagerExternalSyntheticLambda45(18);
        baseRxViewModel.getClass();
        behaviorSubject.getClass();
        CompositeDisposable compositeDisposableParcelableVolumeInfo = baseRxViewModel.ParcelableVolumeInfo();
        ((AndroidScheduleProvider) baseRxViewModel.PlaybackStateCompat()).getClass();
        Disposable disposableSubscribe = behaviorSubject.RemoteActionCompatParcelizer(AndroidSchedulers.RemoteActionCompatParcelizer()).subscribe(new mn$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 14), new mn$$ExternalSyntheticLambda0(brazeInAppMessageManagerExternalSyntheticLambda45, 15));
        disposableSubscribe.getClass();
        compositeDisposableParcelableVolumeInfo.getClass();
        compositeDisposableParcelableVolumeInfo.read(disposableSubscribe);
    }

    public static boolean serializer(hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk4) {
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk5;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk6;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk7 = hasSpecifiedAndFiniteHeightuvyYCjk.FIXED;
        return (hasspecifiedandfiniteheightuvyycjk3 == hasspecifiedandfiniteheightuvyycjk7 || hasspecifiedandfiniteheightuvyycjk3 == (hasspecifiedandfiniteheightuvyycjk6 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) || (hasspecifiedandfiniteheightuvyycjk3 == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT && hasspecifiedandfiniteheightuvyycjk != hasspecifiedandfiniteheightuvyycjk6)) || (hasspecifiedandfiniteheightuvyycjk4 == hasspecifiedandfiniteheightuvyycjk7 || hasspecifiedandfiniteheightuvyycjk4 == (hasspecifiedandfiniteheightuvyycjk5 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT) || (hasspecifiedandfiniteheightuvyycjk4 == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT && hasspecifiedandfiniteheightuvyycjk2 != hasspecifiedandfiniteheightuvyycjk5));
    }
}
