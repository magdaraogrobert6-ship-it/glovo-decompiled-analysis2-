package o;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class inflate implements Choreographer.FrameCallback {
    public final /* synthetic */ androidx.navigation.NavArgsLazy RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:39:0x013e  */
    /* JADX WARN: Code duplicated, block: B:42:0x015a  */
    /* JADX WARN: Code duplicated, block: B:46:0x016e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0174  */
    /* JADX WARN: Code duplicated, block: B:50:0x0188  */
    /* JADX WARN: Code duplicated, block: B:52:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01df  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8 A[SYNTHETIC] */
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
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        long j3;
        boolean z;
        float f;
        overlaps overlapsVar;
        float f2;
        float f3;
        overlaps overlapsVar2;
        boolean z2;
        isFinite isfinite;
        long j4;
        long j5;
        ArrayList arrayList;
        ThreadLocal threadLocal;
        isFinite isfinite2;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        isFinite isfinite3;
        long j6;
        long j7;
        float f4;
        CompositeShaderBrush compositeShaderBrush;
        getOffscreenNrFUSI getoffscreennrfusi;
        getDstBrush getdstbrush;
        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0;
        Runnable runnable;
        isFinite isfinite4 = (isFinite) ((androidx.camera.view.PendingValue) this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem).serializer;
        long jUptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList3 = isfinite4.serializer;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        int i2 = 0;
        while (i2 < arrayList3.size()) {
            isInfinite isinfinite = (isInfinite) arrayList3.get(i2);
            if (isinfinite == null) {
                isfinite = isfinite4;
                j4 = jUptimeMillis;
                j5 = jUptimeMillis2;
                i2 = i2;
            } else {
                processDragGesture processdraggesture = isfinite4.write;
                Long l = (Long) processdraggesture.get(isinfinite);
                if (l == null) {
                    j2 = isinfinite.RatingCompat;
                    if (j2 == 0) {
                        isinfinite.RatingCompat = jUptimeMillis;
                        isinfinite.IconCompatParcelizer(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        isfinite = isfinite4;
                        j4 = jUptimeMillis;
                        j5 = jUptimeMillis2;
                        i2 = i2;
                    } else {
                        j3 = jUptimeMillis - j2;
                        isinfinite.RatingCompat = jUptimeMillis;
                        z = isinfinite.MediaBrowserCompatMediaItem;
                        f = isinfinite.MediaSessionCompatToken;
                        if (z) {
                            if (f != Float.MAX_VALUE) {
                                isinfinite.ComponentActivity.IconCompatParcelizer = f;
                                isinfinite.MediaSessionCompatToken = Float.MAX_VALUE;
                            }
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (float) isinfinite.ComponentActivity.IconCompatParcelizer;
                            isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0.0f;
                            isinfinite.MediaBrowserCompatMediaItem = false;
                        } else {
                            i2 = i2;
                            overlapsVar = isinfinite.ComponentActivity;
                            if (f != Float.MAX_VALUE) {
                                double d = overlapsVar.IconCompatParcelizer;
                                long j8 = j3 / 2;
                                AutofillApi27Helper autofillApi27HelperRemoteActionCompatParcelizer = overlapsVar.RemoteActionCompatParcelizer(j8, isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                                overlaps overlapsVar3 = isinfinite.ComponentActivity;
                                overlapsVar3.IconCompatParcelizer = isinfinite.MediaSessionCompatToken;
                                isinfinite.MediaSessionCompatToken = Float.MAX_VALUE;
                                AutofillApi27Helper autofillApi27HelperRemoteActionCompatParcelizer2 = overlapsVar3.RemoteActionCompatParcelizer(j8, autofillApi27HelperRemoteActionCompatParcelizer.RemoteActionCompatParcelizer, autofillApi27HelperRemoteActionCompatParcelizer.serializer);
                                isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = autofillApi27HelperRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer;
                                isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = autofillApi27HelperRemoteActionCompatParcelizer2.serializer;
                                f2 = 0.0f;
                            } else {
                                f2 = 0.0f;
                                AutofillApi27Helper autofillApi27HelperRemoteActionCompatParcelizer3 = overlapsVar.RemoteActionCompatParcelizer(j3, isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                                isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = autofillApi27HelperRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer;
                                isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = autofillApi27HelperRemoteActionCompatParcelizer3.serializer;
                            }
                            float fMax = Math.max(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.PlaybackStateCompatCustomAction);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMax;
                            float fMin = Math.min(fMax, isinfinite.MediaSessionCompatQueueItem);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMin;
                            f3 = isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            overlapsVar2 = isinfinite.ComponentActivity;
                            overlapsVar2.getClass();
                            if (Math.abs(f3) < overlapsVar2.MediaSessionCompatQueueItem) {
                            }
                            z2 = false;
                            float fMin2 = Math.min(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.MediaSessionCompatQueueItem);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMin2;
                            float fMax2 = Math.max(fMin2, isinfinite.PlaybackStateCompatCustomAction);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMax2;
                            isinfinite.IconCompatParcelizer(fMax2);
                            if (z2) {
                                arrayList = isinfinite.MediaDescriptionCompat;
                                isinfinite.MediaSessionCompatResultReceiverWrapper = false;
                                threadLocal = isFinite.read;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new isFinite());
                                }
                                isfinite2 = (isFinite) threadLocal.get();
                                isfinite2.write.remove(isinfinite);
                                arrayList2 = isfinite2.serializer;
                                iIndexOf = arrayList2.indexOf(isinfinite);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    isfinite2.IconCompatParcelizer = true;
                                }
                                isinfinite.RatingCompat = 0L;
                                isinfinite.ResultReceiver = false;
                                i = 0;
                                while (i < arrayList.size()) {
                                    if (arrayList.get(i) != null) {
                                        obtainComposeColorSpaceFromId obtaincomposecolorspacefromid = (obtainComposeColorSpaceFromId) arrayList.get(i);
                                        f4 = isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        compositeShaderBrush = obtaincomposecolorspacefromid.read;
                                        getoffscreennrfusi = compositeShaderBrush.MediaBrowserCompatMediaItem;
                                        getdstbrush = getDstBrush.IconCompatParcelizer;
                                        if (f4 < 1.0f) {
                                            j6 = jUptimeMillis;
                                            long j9 = getoffscreennrfusi.addObserverForBackInvoker;
                                            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Write = getoffscreennrfusi.write(0);
                                            colorSpaceVerificationHelperExternalSyntheticLambda0 = colorSpaceVerificationHelperExternalSyntheticLambda0Write.MediaSessionCompatToken;
                                            colorSpaceVerificationHelperExternalSyntheticLambda0Write.MediaSessionCompatToken = null;
                                            j7 = jUptimeMillis2;
                                            isfinite3 = isfinite4;
                                            getoffscreennrfusi.IconCompatParcelizer(-1L, compositeShaderBrush.RemoteActionCompatParcelizer);
                                            getoffscreennrfusi.IconCompatParcelizer(j9, -1L);
                                            compositeShaderBrush.RemoteActionCompatParcelizer = j9;
                                            runnable = compositeShaderBrush.IconCompatParcelizer;
                                            if (runnable != null) {
                                                runnable.run();
                                            }
                                            getoffscreennrfusi.PlaybackStateCompat.clear();
                                            if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
                                                colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getdstbrush, true);
                                            }
                                        } else {
                                            isfinite3 = isfinite4;
                                            j6 = jUptimeMillis;
                                            j7 = jUptimeMillis2;
                                            getoffscreennrfusi.RemoteActionCompatParcelizer(getoffscreennrfusi, getdstbrush, false);
                                        }
                                    } else {
                                        isfinite3 = isfinite4;
                                        j6 = jUptimeMillis;
                                        j7 = jUptimeMillis2;
                                    }
                                    i++;
                                    jUptimeMillis = j6;
                                    jUptimeMillis2 = j7;
                                    isfinite4 = isfinite3;
                                }
                                isfinite = isfinite4;
                                j4 = jUptimeMillis;
                                j5 = jUptimeMillis2;
                                for (size = arrayList.size() - 1; size >= 0; size--) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                isfinite = isfinite4;
                                j4 = jUptimeMillis;
                                j5 = jUptimeMillis2;
                            }
                        }
                        z2 = true;
                        float fMin3 = Math.min(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.MediaSessionCompatQueueItem);
                        isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMin3;
                        float fMax3 = Math.max(fMin3, isinfinite.PlaybackStateCompatCustomAction);
                        isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMax3;
                        isinfinite.IconCompatParcelizer(fMax3);
                        if (z2) {
                            arrayList = isinfinite.MediaDescriptionCompat;
                            isinfinite.MediaSessionCompatResultReceiverWrapper = false;
                            threadLocal = isFinite.read;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new isFinite());
                            }
                            isfinite2 = (isFinite) threadLocal.get();
                            isfinite2.write.remove(isinfinite);
                            arrayList2 = isfinite2.serializer;
                            iIndexOf = arrayList2.indexOf(isinfinite);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                isfinite2.IconCompatParcelizer = true;
                            }
                            isinfinite.RatingCompat = 0L;
                            isinfinite.ResultReceiver = false;
                            i = 0;
                            while (i < arrayList.size()) {
                                if (arrayList.get(i) != null) {
                                    obtainComposeColorSpaceFromId obtaincomposecolorspacefromid2 = (obtainComposeColorSpaceFromId) arrayList.get(i);
                                    f4 = isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    compositeShaderBrush = obtaincomposecolorspacefromid2.read;
                                    getoffscreennrfusi = compositeShaderBrush.MediaBrowserCompatMediaItem;
                                    getdstbrush = getDstBrush.IconCompatParcelizer;
                                    if (f4 < 1.0f) {
                                        j6 = jUptimeMillis;
                                        long j10 = getoffscreennrfusi.addObserverForBackInvoker;
                                        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Write2 = getoffscreennrfusi.write(0);
                                        colorSpaceVerificationHelperExternalSyntheticLambda0 = colorSpaceVerificationHelperExternalSyntheticLambda0Write2.MediaSessionCompatToken;
                                        colorSpaceVerificationHelperExternalSyntheticLambda0Write2.MediaSessionCompatToken = null;
                                        j7 = jUptimeMillis2;
                                        isfinite3 = isfinite4;
                                        getoffscreennrfusi.IconCompatParcelizer(-1L, compositeShaderBrush.RemoteActionCompatParcelizer);
                                        getoffscreennrfusi.IconCompatParcelizer(j10, -1L);
                                        compositeShaderBrush.RemoteActionCompatParcelizer = j10;
                                        runnable = compositeShaderBrush.IconCompatParcelizer;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                        getoffscreennrfusi.PlaybackStateCompat.clear();
                                        if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
                                            colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getdstbrush, true);
                                        }
                                    } else {
                                        isfinite3 = isfinite4;
                                        j6 = jUptimeMillis;
                                        j7 = jUptimeMillis2;
                                        getoffscreennrfusi.RemoteActionCompatParcelizer(getoffscreennrfusi, getdstbrush, false);
                                    }
                                } else {
                                    isfinite3 = isfinite4;
                                    j6 = jUptimeMillis;
                                    j7 = jUptimeMillis2;
                                }
                                i++;
                                jUptimeMillis = j6;
                                jUptimeMillis2 = j7;
                                isfinite4 = isfinite3;
                            }
                            isfinite = isfinite4;
                            j4 = jUptimeMillis;
                            j5 = jUptimeMillis2;
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            isfinite = isfinite4;
                            j4 = jUptimeMillis;
                            j5 = jUptimeMillis2;
                        }
                    }
                } else if (l.longValue() < jUptimeMillis2) {
                    processdraggesture.remove(isinfinite);
                    j2 = isinfinite.RatingCompat;
                    if (j2 == 0) {
                        isinfinite.RatingCompat = jUptimeMillis;
                        isinfinite.IconCompatParcelizer(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        isfinite = isfinite4;
                        j4 = jUptimeMillis;
                        j5 = jUptimeMillis2;
                        i2 = i2;
                    } else {
                        j3 = jUptimeMillis - j2;
                        isinfinite.RatingCompat = jUptimeMillis;
                        z = isinfinite.MediaBrowserCompatMediaItem;
                        f = isinfinite.MediaSessionCompatToken;
                        if (z) {
                            if (f != Float.MAX_VALUE) {
                                isinfinite.ComponentActivity.IconCompatParcelizer = f;
                                isinfinite.MediaSessionCompatToken = Float.MAX_VALUE;
                            }
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (float) isinfinite.ComponentActivity.IconCompatParcelizer;
                            isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0.0f;
                            isinfinite.MediaBrowserCompatMediaItem = false;
                        } else {
                            i2 = i2;
                            overlapsVar = isinfinite.ComponentActivity;
                            if (f != Float.MAX_VALUE) {
                                double d2 = overlapsVar.IconCompatParcelizer;
                                long j11 = j3 / 2;
                                AutofillApi27Helper autofillApi27HelperRemoteActionCompatParcelizer4 = overlapsVar.RemoteActionCompatParcelizer(j11, isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                                overlaps overlapsVar4 = isinfinite.ComponentActivity;
                                overlapsVar4.IconCompatParcelizer = isinfinite.MediaSessionCompatToken;
                                isinfinite.MediaSessionCompatToken = Float.MAX_VALUE;
                                AutofillApi27Helper autofillApi27HelperRemoteActionCompatParcelizer5 = overlapsVar4.RemoteActionCompatParcelizer(j11, autofillApi27HelperRemoteActionCompatParcelizer4.RemoteActionCompatParcelizer, autofillApi27HelperRemoteActionCompatParcelizer4.serializer);
                                isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = autofillApi27HelperRemoteActionCompatParcelizer5.RemoteActionCompatParcelizer;
                                isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = autofillApi27HelperRemoteActionCompatParcelizer5.serializer;
                                f2 = 0.0f;
                            } else {
                                f2 = 0.0f;
                                AutofillApi27Helper autofillApi27HelperRemoteActionCompatParcelizer6 = overlapsVar.RemoteActionCompatParcelizer(j3, isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                                isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = autofillApi27HelperRemoteActionCompatParcelizer6.RemoteActionCompatParcelizer;
                                isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = autofillApi27HelperRemoteActionCompatParcelizer6.serializer;
                            }
                            float fMax4 = Math.max(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.PlaybackStateCompatCustomAction);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMax4;
                            float fMin4 = Math.min(fMax4, isinfinite.MediaSessionCompatQueueItem);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMin4;
                            f3 = isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                            overlapsVar2 = isinfinite.ComponentActivity;
                            overlapsVar2.getClass();
                            if (Math.abs(f3) < overlapsVar2.MediaSessionCompatQueueItem || Math.abs(fMin4 - ((float) overlapsVar2.IconCompatParcelizer)) >= overlapsVar2.MediaBrowserCompatMediaItem) {
                                z2 = false;
                            } else {
                                isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (float) isinfinite.ComponentActivity.IconCompatParcelizer;
                                isinfinite.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = f2;
                            }
                            float fMin5 = Math.min(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.MediaSessionCompatQueueItem);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMin5;
                            float fMax5 = Math.max(fMin5, isinfinite.PlaybackStateCompatCustomAction);
                            isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMax5;
                            isinfinite.IconCompatParcelizer(fMax5);
                            if (z2) {
                                arrayList = isinfinite.MediaDescriptionCompat;
                                isinfinite.MediaSessionCompatResultReceiverWrapper = false;
                                threadLocal = isFinite.read;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new isFinite());
                                }
                                isfinite2 = (isFinite) threadLocal.get();
                                isfinite2.write.remove(isinfinite);
                                arrayList2 = isfinite2.serializer;
                                iIndexOf = arrayList2.indexOf(isinfinite);
                                if (iIndexOf >= 0) {
                                    arrayList2.set(iIndexOf, null);
                                    isfinite2.IconCompatParcelizer = true;
                                }
                                isinfinite.RatingCompat = 0L;
                                isinfinite.ResultReceiver = false;
                                i = 0;
                                while (i < arrayList.size()) {
                                    if (arrayList.get(i) != null) {
                                        obtainComposeColorSpaceFromId obtaincomposecolorspacefromid3 = (obtainComposeColorSpaceFromId) arrayList.get(i);
                                        f4 = isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                        compositeShaderBrush = obtaincomposecolorspacefromid3.read;
                                        getoffscreennrfusi = compositeShaderBrush.MediaBrowserCompatMediaItem;
                                        getdstbrush = getDstBrush.IconCompatParcelizer;
                                        if (f4 < 1.0f) {
                                            j6 = jUptimeMillis;
                                            long j12 = getoffscreennrfusi.addObserverForBackInvoker;
                                            ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Write3 = getoffscreennrfusi.write(0);
                                            colorSpaceVerificationHelperExternalSyntheticLambda0 = colorSpaceVerificationHelperExternalSyntheticLambda0Write3.MediaSessionCompatToken;
                                            colorSpaceVerificationHelperExternalSyntheticLambda0Write3.MediaSessionCompatToken = null;
                                            j7 = jUptimeMillis2;
                                            isfinite3 = isfinite4;
                                            getoffscreennrfusi.IconCompatParcelizer(-1L, compositeShaderBrush.RemoteActionCompatParcelizer);
                                            getoffscreennrfusi.IconCompatParcelizer(j12, -1L);
                                            compositeShaderBrush.RemoteActionCompatParcelizer = j12;
                                            runnable = compositeShaderBrush.IconCompatParcelizer;
                                            if (runnable != null) {
                                                runnable.run();
                                            }
                                            getoffscreennrfusi.PlaybackStateCompat.clear();
                                            if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
                                                colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getdstbrush, true);
                                            }
                                        } else {
                                            isfinite3 = isfinite4;
                                            j6 = jUptimeMillis;
                                            j7 = jUptimeMillis2;
                                            getoffscreennrfusi.RemoteActionCompatParcelizer(getoffscreennrfusi, getdstbrush, false);
                                        }
                                    } else {
                                        isfinite3 = isfinite4;
                                        j6 = jUptimeMillis;
                                        j7 = jUptimeMillis2;
                                    }
                                    i++;
                                    jUptimeMillis = j6;
                                    jUptimeMillis2 = j7;
                                    isfinite4 = isfinite3;
                                }
                                isfinite = isfinite4;
                                j4 = jUptimeMillis;
                                j5 = jUptimeMillis2;
                                while (size >= 0) {
                                    if (arrayList.get(size) == null) {
                                        arrayList.remove(size);
                                    }
                                }
                            } else {
                                isfinite = isfinite4;
                                j4 = jUptimeMillis;
                                j5 = jUptimeMillis2;
                            }
                        }
                        z2 = true;
                        float fMin6 = Math.min(isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, isinfinite.MediaSessionCompatQueueItem);
                        isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMin6;
                        float fMax6 = Math.max(fMin6, isinfinite.PlaybackStateCompatCustomAction);
                        isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = fMax6;
                        isinfinite.IconCompatParcelizer(fMax6);
                        if (z2) {
                            arrayList = isinfinite.MediaDescriptionCompat;
                            isinfinite.MediaSessionCompatResultReceiverWrapper = false;
                            threadLocal = isFinite.read;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new isFinite());
                            }
                            isfinite2 = (isFinite) threadLocal.get();
                            isfinite2.write.remove(isinfinite);
                            arrayList2 = isfinite2.serializer;
                            iIndexOf = arrayList2.indexOf(isinfinite);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                isfinite2.IconCompatParcelizer = true;
                            }
                            isinfinite.RatingCompat = 0L;
                            isinfinite.ResultReceiver = false;
                            i = 0;
                            while (i < arrayList.size()) {
                                if (arrayList.get(i) != null) {
                                    obtainComposeColorSpaceFromId obtaincomposecolorspacefromid4 = (obtainComposeColorSpaceFromId) arrayList.get(i);
                                    f4 = isinfinite.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                    compositeShaderBrush = obtaincomposecolorspacefromid4.read;
                                    getoffscreennrfusi = compositeShaderBrush.MediaBrowserCompatMediaItem;
                                    getdstbrush = getDstBrush.IconCompatParcelizer;
                                    if (f4 < 1.0f) {
                                        j6 = jUptimeMillis;
                                        long j13 = getoffscreennrfusi.addObserverForBackInvoker;
                                        ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0Write4 = getoffscreennrfusi.write(0);
                                        colorSpaceVerificationHelperExternalSyntheticLambda0 = colorSpaceVerificationHelperExternalSyntheticLambda0Write4.MediaSessionCompatToken;
                                        colorSpaceVerificationHelperExternalSyntheticLambda0Write4.MediaSessionCompatToken = null;
                                        j7 = jUptimeMillis2;
                                        isfinite3 = isfinite4;
                                        getoffscreennrfusi.IconCompatParcelizer(-1L, compositeShaderBrush.RemoteActionCompatParcelizer);
                                        getoffscreennrfusi.IconCompatParcelizer(j13, -1L);
                                        compositeShaderBrush.RemoteActionCompatParcelizer = j13;
                                        runnable = compositeShaderBrush.IconCompatParcelizer;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                        getoffscreennrfusi.PlaybackStateCompat.clear();
                                        if (colorSpaceVerificationHelperExternalSyntheticLambda0 != null) {
                                            colorSpaceVerificationHelperExternalSyntheticLambda0.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0, getdstbrush, true);
                                        }
                                    } else {
                                        isfinite3 = isfinite4;
                                        j6 = jUptimeMillis;
                                        j7 = jUptimeMillis2;
                                        getoffscreennrfusi.RemoteActionCompatParcelizer(getoffscreennrfusi, getdstbrush, false);
                                    }
                                } else {
                                    isfinite3 = isfinite4;
                                    j6 = jUptimeMillis;
                                    j7 = jUptimeMillis2;
                                }
                                i++;
                                jUptimeMillis = j6;
                                jUptimeMillis2 = j7;
                                isfinite4 = isfinite3;
                            }
                            isfinite = isfinite4;
                            j4 = jUptimeMillis;
                            j5 = jUptimeMillis2;
                            while (size >= 0) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                        } else {
                            isfinite = isfinite4;
                            j4 = jUptimeMillis;
                            j5 = jUptimeMillis2;
                        }
                    }
                } else {
                    isfinite = isfinite4;
                    j4 = jUptimeMillis;
                    j5 = jUptimeMillis2;
                    i2 = i2;
                }
            }
            i2++;
            jUptimeMillis = j4;
            jUptimeMillis2 = j5;
            isfinite4 = isfinite;
        }
        if (isfinite4.IconCompatParcelizer) {
            int size2 = arrayList3.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (arrayList3.get(size2) == null) {
                    arrayList3.remove(size2);
                }
            }
            isfinite4.IconCompatParcelizer = false;
        }
        if (arrayList3.size() > 0) {
            if (isfinite4.MediaDescriptionCompat == null) {
                isfinite4.MediaDescriptionCompat = new androidx.navigation.NavArgsLazy(isfinite4.RemoteActionCompatParcelizer);
            }
            androidx.navigation.NavArgsLazy navArgsLazy = isfinite4.MediaDescriptionCompat;
            ((Choreographer) navArgsLazy.read).postFrameCallback((inflate) navArgsLazy.RatingCompat);
        }
    }

    public inflate(androidx.navigation.NavArgsLazy navArgsLazy) {
        this.RemoteActionCompatParcelizer = navArgsLazy;
    }
}
