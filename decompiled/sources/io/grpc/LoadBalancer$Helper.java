package io.grpc;

import android.os.Looper;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.cardview.widget.CardView$1;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.components.DependencyCycleException;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import o.BaseCardViewsetImageViewToUrl1;
import o.DrawableTransformation;
import o.HoverableNodeonPointerEvent1;
import o.JsonUtilsExternalSyntheticLambda1;
import o.LookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetSystemNavigationDowncp;
import o.createOutlinePq9zytI;
import o.displayInAppMessagelambda1;
import o.drawWithRotationAndOffsetubNVwUQ;
import o.getCtrlLeftEK5gGoQ;
import o.getDirectionDownEK5gGoQ;
import o.getFunctionEK5gGoQ;
import o.getGEK5gGoQ;
import o.getGraveEK5gGoQ;
import o.getGuideEK5gGoQ;
import o.getHasMeasureResult;
import o.getHelpEK5gGoQ;
import o.getHenkanEK5gGoQ;
import o.getHomeEK5gGoQ;
import o.getIEK5gGoQ;
import o.getInfoEK5gGoQ;
import o.getMethodQuietlylambda1;
import o.getOffVariationName;
import o.instance_delegatelambda0;
import o.invalidateChildrenOfDefiningRulerui;
import o.isShallowPlacingui;
import o.lerpNullableFloatList;
import o.onContentCardClicked;
import o.onOtherUrlActionlambda4;
import o.onViewAttachedToWindowlambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.provideRelativeRulerValue;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.requestPushPermissionPromptlambda2;
import o.requestPushPermissionPromptlambda3;
import o.resetLayoutParamsIfAppropriate;
import o.setGraphicModalMaxWidthDp;
import o.setResourcePackageNamelambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LoadBalancer$Helper {
    public static ClassLoader read;
    public static Thread write;

    public static final setGraphicModalMaxWidthDp read(prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = (setGraphicModalMaxWidthDp[]) list.toArray(new setGraphicModalMaxWidthDp[0]);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(cls, (setGraphicModalMaxWidthDp[]) Arrays.copyOf(setgraphicmodalmaxwidthdpArr, setgraphicmodalmaxwidthdpArr.length));
        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer != null) {
            return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
        }
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(cls);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) onOtherUrlActionlambda4.IconCompatParcelizer.get(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer);
        if (setgraphicmodalmaxwidthdp != null) {
            return setgraphicmodalmaxwidthdp;
        }
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 = prepareinappmessagewithzippedassethtml.RemoteActionCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, list);
        if (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2 != null) {
            return setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer2;
        }
        if (cls.isInterface()) {
            return new resetLayoutParamsIfAppropriate(displayInAppMessagelambda1.serializer(cls));
        }
        return null;
    }

    public abstract r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc IconCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer();

    public abstract ScheduledExecutorService read();

    public abstract JsonUtilsExternalSyntheticLambda1 read(requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2);

    public abstract getMethodQuietlylambda1 write();

    public abstract void write(setResourcePackageNamelambda0 setresourcepackagenamelambda0, requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3);

    public static void IconCompatParcelizer(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui : (Set) it2.next()) {
                        for (provideRelativeRulerValue providerelativerulervalue : invalidatechildrenofdefiningrulerui.IconCompatParcelizer.read) {
                            if (providerelativerulervalue.IconCompatParcelizer == 0) {
                                Set<invalidateChildrenOfDefiningRulerui> set = (Set) map.get(new isShallowPlacingui(providerelativerulervalue.serializer, providerelativerulervalue.write == 2));
                                if (set != null) {
                                    for (invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui2 : set) {
                                        invalidatechildrenofdefiningrulerui.RemoteActionCompatParcelizer.add(invalidatechildrenofdefiningrulerui2);
                                        invalidatechildrenofdefiningrulerui2.read.add(invalidatechildrenofdefiningrulerui);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<invalidateChildrenOfDefiningRulerui> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui3 : hashSet) {
                    if (invalidatechildrenofdefiningrulerui3.read.isEmpty()) {
                        hashSet2.add(invalidatechildrenofdefiningrulerui3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui4 = (invalidateChildrenOfDefiningRulerui) hashSet2.iterator().next();
                    hashSet2.remove(invalidatechildrenofdefiningrulerui4);
                    i++;
                    for (invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui5 : invalidatechildrenofdefiningrulerui4.RemoteActionCompatParcelizer) {
                        invalidatechildrenofdefiningrulerui5.read.remove(invalidatechildrenofdefiningrulerui4);
                        if (invalidatechildrenofdefiningrulerui5.read.isEmpty()) {
                            hashSet2.add(invalidatechildrenofdefiningrulerui5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui6 : hashSet) {
                    if (!invalidatechildrenofdefiningrulerui6.read.isEmpty() && !invalidatechildrenofdefiningrulerui6.RemoteActionCompatParcelizer.isEmpty()) {
                        arrayList2.add(invalidatechildrenofdefiningrulerui6.IconCompatParcelizer);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            getHasMeasureResult gethasmeasureresult = (getHasMeasureResult) it.next();
            invalidateChildrenOfDefiningRulerui invalidatechildrenofdefiningrulerui7 = new invalidateChildrenOfDefiningRulerui(gethasmeasureresult);
            for (LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 : gethasmeasureresult.serializer) {
                boolean z = gethasmeasureresult.MediaMetadataCompat == 0;
                isShallowPlacingui isshallowplacingui = new isShallowPlacingui(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, !z);
                if (!map.containsKey(isshallowplacingui)) {
                    map.put(isshallowplacingui, new HashSet());
                }
                Set set2 = (Set) map.get(isshallowplacingui);
                if (!set2.isEmpty() && z) {
                    DrawableTransformation.IconCompatParcelizer("Multiple components provide ", lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, ".");
                    return;
                }
                set2.add(invalidatechildrenofdefiningrulerui7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b0 A[Catch: all -> 0x00e9, PHI: r1
  0x00b0: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v16 java.lang.Thread) binds: [B:7:0x000a, B:45:0x00ab] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:44:0x00a9, B:57:0x00e0, B:12:0x001f, B:48:0x00af, B:49:0x00b0, B:60:0x00e4, B:61:0x00e5, B:50:0x00b1, B:56:0x00df, B:55:0x00bb, B:13:0x0020, B:15:0x002d, B:21:0x0042, B:22:0x0049, B:24:0x0054, B:30:0x0069, B:31:0x0070, B:41:0x0083, B:42:0x00a7, B:18:0x003c), top: B:72:0x0003, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static ClassLoader serializer() {
        ClassLoader classLoader;
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (LoadBalancer$Helper.class) {
            if (read == null) {
                Thread thread2 = write;
                ClassLoader contextClassLoader = null;
                if (thread2 != null) {
                    synchronized (thread2) {
                        try {
                            contextClassLoader = write.getContextClassLoader();
                        } catch (SecurityException e2) {
                            String message = e2.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                            sb.append("Failed to get thread context classloader ");
                            sb.append(message);
                            SentryLogcatAdapter.IconCompatParcelizer("DynamiteLoaderV2CL", sb.toString());
                        }
                    }
                    read = contextClassLoader;
                } else {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        BaseCardViewsetImageViewToUrl1 baseCardViewsetImageViewToUrl1 = new BaseCardViewsetImageViewToUrl1(threadGroup, "GmsDynamite");
                                        try {
                                            baseCardViewsetImageViewToUrl1.setContextClassLoader(null);
                                            baseCardViewsetImageViewToUrl1.start();
                                            thread = baseCardViewsetImageViewToUrl1;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = baseCardViewsetImageViewToUrl1;
                                            String message2 = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            SentryLogcatAdapter.IconCompatParcelizer("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    write = thread2;
                    if (thread2 != null) {
                        synchronized (thread2) {
                            contextClassLoader = write.getContextClassLoader();
                        }
                    }
                    read = contextClassLoader;
                }
            }
            classLoader = read;
        }
        return classLoader;
    }

    public static void serializer(CardView$1 cardView$1, float f) {
        createOutlinePq9zytI createoutlinepq9zyti = (createOutlinePq9zytI) cardView$1.RemoteActionCompatParcelizer;
        drawWithRotationAndOffsetubNVwUQ drawwithrotationandoffsetubnvwuq = (drawWithRotationAndOffsetubNVwUQ) cardView$1.IconCompatParcelizer;
        boolean useCompatPadding = drawwithrotationandoffsetubnvwuq.getUseCompatPadding();
        boolean preventCornerOverlap = drawwithrotationandoffsetubnvwuq.getPreventCornerOverlap();
        if (f != createoutlinepq9zyti.RatingCompat || createoutlinepq9zyti.IconCompatParcelizer != useCompatPadding || createoutlinepq9zyti.write != preventCornerOverlap) {
            createoutlinepq9zyti.RatingCompat = f;
            createoutlinepq9zyti.IconCompatParcelizer = useCompatPadding;
            createoutlinepq9zyti.write = preventCornerOverlap;
            createoutlinepq9zyti.serializer(null);
            createoutlinepq9zyti.invalidateSelf();
        }
        if (!drawwithrotationandoffsetubnvwuq.getUseCompatPadding()) {
            cardView$1.serializer(0, 0, 0, 0);
            return;
        }
        createOutlinePq9zytI createoutlinepq9zyti2 = (createOutlinePq9zytI) cardView$1.RemoteActionCompatParcelizer;
        float f2 = createoutlinepq9zyti2.RatingCompat;
        float f3 = createoutlinepq9zyti2.MediaDescriptionCompat;
        int iCeil = (int) Math.ceil(HoverableNodeonPointerEvent1.write(f2, f3, drawwithrotationandoffsetubnvwuq.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(HoverableNodeonPointerEvent1.read(f2, f3, drawwithrotationandoffsetubnvwuq.getPreventCornerOverlap()));
        cardView$1.serializer(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static void IconCompatParcelizer(TextView textView, int i) {
        UtilsKt.read(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ShortNewsContentCardView createCoroutineUnintercepted(final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, final Object obj, final ShortNewsContentCardView shortNewsContentCardView) {
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        shortNewsContentCardView.getClass();
        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0).create(obj, shortNewsContentCardView);
        }
        final TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        return context == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write ? new RestrictedContinuationImpl(obj, shortNewsContentCardView) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
            public final /* synthetic */ Object $receiver$inlined;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(shortNewsContentCardView);
                shortNewsContentCardView.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return obj2;
                }
                this.label = 1;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = this.$this_createCoroutineUnintercepted$inlined;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
                int iWrite = BehaviorSubject.BehaviorDisposable.write();
                int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(this.$receiver$inlined, this);
            }
        } : new ContinuationImpl(shortNewsContentCardView, context, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            public final /* synthetic */ Object $receiver$inlined;
            public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 $this_createCoroutineUnintercepted$inlined;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(shortNewsContentCardView, context);
                this.$this_createCoroutineUnintercepted$inlined = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                this.$receiver$inlined = obj;
                shortNewsContentCardView.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) {
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("This coroutine had already completed");
                        return null;
                    }
                    this.label = 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return obj2;
                }
                this.label = 1;
                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = this.$this_createCoroutineUnintercepted$inlined;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
                int iWrite = BehaviorSubject.BehaviorDisposable.write();
                int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
                return r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(this.$receiver$inlined, this);
            }
        };
    }

    public static ShortNewsContentCardView intercepted(ShortNewsContentCardView shortNewsContentCardView) {
        ShortNewsContentCardView<Object> shortNewsContentCardViewIntercepted;
        shortNewsContentCardView.getClass();
        ContinuationImpl continuationImpl = shortNewsContentCardView instanceof ContinuationImpl ? (ContinuationImpl) shortNewsContentCardView : null;
        return (continuationImpl == null || (shortNewsContentCardViewIntercepted = continuationImpl.intercepted()) == null) ? shortNewsContentCardView : shortNewsContentCardViewIntercepted;
    }

    public static Object wrapWithContinuationImpl(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj, final ShortNewsContentCardView shortNewsContentCardView) {
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        final TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        Object obj2 = context == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write ? new RestrictedContinuationImpl(shortNewsContentCardView) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj3) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return obj3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(shortNewsContentCardView);
                shortNewsContentCardView.getClass();
            }
        } : new ContinuationImpl(shortNewsContentCardView, context) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj3) {
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return obj3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(shortNewsContentCardView, context);
                shortNewsContentCardView.getClass();
            }
        };
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, obj2);
    }

    public static final Class IconCompatParcelizer(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return IconCompatParcelizer(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objSerializer = onContentCardClicked.serializer(upperBounds);
            objSerializer.getClass();
            return IconCompatParcelizer((Type) objSerializer);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return IconCompatParcelizer(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        getOffVariationName.serializer(sb, " has type ", displayInAppMessagelambda1.serializer(type.getClass()));
        return null;
    }

    public static boolean MediaSessionCompatQueueItem(getFunctionEK5gGoQ getfunctionek5ggoq) {
        if (getfunctionek5ggoq instanceof getIEK5gGoQ) {
            return true;
        }
        return (!(getfunctionek5ggoq instanceof getHelpEK5gGoQ) || getfunctionek5ggoq == getHelpEK5gGoQ.read || getfunctionek5ggoq == getHelpEK5gGoQ.serializer) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[EDGE_INSN: B:45:0x008e->B:41:0x008e BREAK  A[LOOP:0: B:11:0x0014->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x006f A[SYNTHETIC] */
    public static final List serializer(accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd, int i, int i2) {
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        accessgetcompositingstrategynrfusijd.getClass();
        if (i == i2) {
            return instance_delegatelambda0.write;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i <= i2) {
                    return arrayList;
                }
                linkedHashMap = accessgetcompositingstrategynrfusijd.serializer;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        onviewattachedtowindowlambda0 = null;
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        onviewattachedtowindowlambda0 = null;
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(treeMap, treeMap.keySet());
                    }
                }
                if (onviewattachedtowindowlambda0 == null) {
                    Map map = (Map) onviewattachedtowindowlambda0.serializer;
                    it = ((Iterable) onviewattachedtowindowlambda0.write).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i2 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i2) {
                    return arrayList;
                }
                linkedHashMap = accessgetcompositingstrategynrfusijd.serializer;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        onviewattachedtowindowlambda0 = null;
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        onviewattachedtowindowlambda0 = null;
                    } else {
                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(treeMap, treeMap.keySet());
                    }
                }
                if (onviewattachedtowindowlambda0 == null) {
                    Map map2 = (Map) onviewattachedtowindowlambda0.serializer;
                    it = ((Iterable) onviewattachedtowindowlambda0.write).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                obj.getClass();
                                arrayList.add(obj);
                                z = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            obj2.getClass();
                            arrayList.add(obj2);
                            z = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    public static final boolean serializer(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final boolean write(String str) {
        str.getClass();
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (r13 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r13 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.setGraphicModalMaxWidthDp RemoteActionCompatParcelizer(o.prepareInAppMessageWithZippedAssetHtml r13, java.lang.reflect.Type r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.LoadBalancer$Helper.RemoteActionCompatParcelizer(o.prepareInAppMessageWithZippedAssetHtml, java.lang.reflect.Type, boolean):o.setGraphicModalMaxWidthDp");
    }

    public static String write(getFunctionEK5gGoQ getfunctionek5ggoq) {
        if (getfunctionek5ggoq == getHelpEK5gGoQ.read) {
            return "Undefined";
        }
        if (getfunctionek5ggoq == getHelpEK5gGoQ.serializer) {
            return "Null";
        }
        if (getfunctionek5ggoq instanceof getGuideEK5gGoQ) {
            return "Boolean";
        }
        if (getfunctionek5ggoq instanceof getGEK5gGoQ) {
            return "Number";
        }
        return getfunctionek5ggoq instanceof getInfoEK5gGoQ ? "String" : "Object";
    }

    public static /* synthetic */ String write(getFunctionEK5gGoQ getfunctionek5ggoq, String str) {
        return af$$ExternalSyntheticOutline0.m(str, getfunctionek5ggoq.read(), ".");
    }

    public static final boolean write(lerpNullableFloatList lerpnullablefloatlist, int i, int i2) {
        lerpnullablefloatlist.getClass();
        if (i > i2 && lerpnullablefloatlist.IconCompatParcelizer) {
            return false;
        }
        Set set = lerpnullablefloatlist.PlaybackStateCompatCustomAction;
        return lerpnullablefloatlist.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && (set == null || !set.contains(Integer.valueOf(i)));
    }

    public static double IconCompatParcelizer(getFunctionEK5gGoQ getfunctionek5ggoq, getFunctionEK5gGoQ getfunctionek5ggoq2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq2 != null);
        double dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getfunctionek5ggoq);
        double dRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(getfunctionek5ggoq2);
        if (Double.isNaN(dRemoteActionCompatParcelizer) || Double.isNaN(dRemoteActionCompatParcelizer2)) {
            return Double.NaN;
        }
        if ((dRemoteActionCompatParcelizer == Double.POSITIVE_INFINITY && dRemoteActionCompatParcelizer2 == Double.NEGATIVE_INFINITY) || (dRemoteActionCompatParcelizer == Double.NEGATIVE_INFINITY && dRemoteActionCompatParcelizer2 == Double.POSITIVE_INFINITY)) {
            return Double.NaN;
        }
        if (!Double.isInfinite(dRemoteActionCompatParcelizer) || Double.isInfinite(dRemoteActionCompatParcelizer2)) {
            return (Double.isInfinite(dRemoteActionCompatParcelizer) || !Double.isInfinite(dRemoteActionCompatParcelizer2)) ? dRemoteActionCompatParcelizer + dRemoteActionCompatParcelizer2 : dRemoteActionCompatParcelizer2;
        }
        return dRemoteActionCompatParcelizer;
    }

    public static String IconCompatParcelizer(getFunctionEK5gGoQ getfunctionek5ggoq) {
        String strWrite;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != null);
        getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.read;
        if (getfunctionek5ggoq == gethelpek5ggoq) {
            return "undefined";
        }
        getHelpEK5gGoQ gethelpek5ggoq2 = getHelpEK5gGoQ.serializer;
        if (getfunctionek5ggoq == gethelpek5ggoq2) {
            return "null";
        }
        if (getfunctionek5ggoq instanceof getGuideEK5gGoQ) {
            if (true != ((getGuideEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.booleanValue()) {
                return "false";
            }
            return "true";
        }
        if (getfunctionek5ggoq instanceof getGEK5gGoQ) {
            String string = Double.toString(((getGEK5gGoQ) getfunctionek5ggoq).serializer.doubleValue());
            int iIndexOf = string.indexOf("E");
            if (iIndexOf > 0) {
                int i = Integer.parseInt(string.substring(iIndexOf + 1, string.length()));
                if (i >= 0) {
                    if (i >= 21) {
                        return string.replace("E", "e+");
                    }
                    String strReplace = string.substring(0, iIndexOf).replace(".", "");
                    int length = strReplace.length();
                    boolean zStartsWith = strReplace.startsWith("-");
                    StringBuilder sb = new StringBuilder();
                    int i2 = (i + 1) - (length - (zStartsWith ? 1 : 0));
                    if (i2 < 0) {
                        int length2 = strReplace.length() + i2;
                        sb.append(strReplace.substring(0, length2));
                        sb.append(".");
                        sb.append(strReplace.substring(length2, strReplace.length()));
                    } else {
                        sb.append(strReplace);
                        while (i2 > 0) {
                            sb.append("0");
                            i2--;
                        }
                    }
                    return sb.toString();
                }
                if (i <= -7) {
                    return string.replace("E", "e");
                }
                String strReplace2 = string.substring(0, iIndexOf).replace(".", "");
                StringBuilder sb2 = new StringBuilder("0.");
                while (true) {
                    i++;
                    if (i < 0) {
                        sb2.append("0");
                    } else {
                        sb2.append(strReplace2);
                        return sb2.toString();
                    }
                }
            } else {
                if (string.endsWith(".0")) {
                    string = string.substring(0, string.length() - 2);
                    if (string.equals("-0")) {
                        return "0";
                    }
                }
                return string;
            }
        } else {
            if (getfunctionek5ggoq instanceof getGraveEK5gGoQ) {
                getDirectionDownEK5gGoQ getdirectiondownek5ggoq = ((getGraveEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer;
                if (getdirectiondownek5ggoq instanceof getCtrlLeftEK5gGoQ) {
                    return ((getCtrlLeftEK5gGoQ) getdirectiondownek5ggoq).IconCompatParcelizer;
                }
            } else {
                if (getfunctionek5ggoq instanceof getHenkanEK5gGoQ) {
                    ArrayList arrayList = new ArrayList();
                    for (getFunctionEK5gGoQ getfunctionek5ggoq2 : ((getHenkanEK5gGoQ) getfunctionek5ggoq).serializer) {
                        if (getfunctionek5ggoq2 != gethelpek5ggoq2 && getfunctionek5ggoq2 != gethelpek5ggoq) {
                            arrayList.add(IconCompatParcelizer(getfunctionek5ggoq2));
                        } else {
                            arrayList.add("");
                        }
                    }
                    return TextUtils.join(",", arrayList);
                }
                if (getfunctionek5ggoq instanceof getHomeEK5gGoQ) {
                    return "[object Object]";
                }
                if (getfunctionek5ggoq instanceof getInfoEK5gGoQ) {
                    return ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer;
                }
            }
            if (MediaSessionCompatQueueItem(getfunctionek5ggoq)) {
                strWrite = write(getfunctionek5ggoq, "Illegal type given to stringEquivalent: ");
            } else {
                strWrite = "Unknown type in stringEquivalent.";
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(strWrite);
            return null;
        }
    }

    public static double RemoteActionCompatParcelizer(getFunctionEK5gGoQ getfunctionek5ggoq) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != null);
        if (getfunctionek5ggoq == getHelpEK5gGoQ.read) {
            return Double.NaN;
        }
        if (getfunctionek5ggoq == getHelpEK5gGoQ.serializer) {
            return 0.0d;
        }
        if (getfunctionek5ggoq instanceof getGuideEK5gGoQ) {
            return ((getGuideEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.booleanValue() ? 1.0d : 0.0d;
        }
        if (getfunctionek5ggoq instanceof getGEK5gGoQ) {
            return ((getGEK5gGoQ) getfunctionek5ggoq).serializer.doubleValue();
        }
        if (getfunctionek5ggoq instanceof getHenkanEK5gGoQ) {
            getHenkanEK5gGoQ gethenkanek5ggoq = (getHenkanEK5gGoQ) getfunctionek5ggoq;
            ArrayList arrayList = gethenkanek5ggoq.serializer;
            if (arrayList.isEmpty()) {
                return 0.0d;
            }
            if (arrayList.size() == 1) {
                return RemoteActionCompatParcelizer(new getInfoEK5gGoQ(IconCompatParcelizer(gethenkanek5ggoq.read(0))));
            }
        } else if (getfunctionek5ggoq instanceof getInfoEK5gGoQ) {
            String str = ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer;
            if (str.isEmpty()) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                return Double.NaN;
            }
        }
        if (!MediaSessionCompatQueueItem(getfunctionek5ggoq)) {
            return Double.NaN;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(write(getfunctionek5ggoq, "Illegal type given to numberEquivalent: "));
        return 0.0d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8 A[ADDED_TO_REGION, RETURN] */
    public static boolean RemoteActionCompatParcelizer(getFunctionEK5gGoQ getfunctionek5ggoq, getFunctionEK5gGoQ getfunctionek5ggoq2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq2 != null);
        if (!MediaSessionCompatQueueItem(getfunctionek5ggoq)) {
            if (!MediaSessionCompatQueueItem(getfunctionek5ggoq2)) {
                String strWrite = write(getfunctionek5ggoq);
                String strWrite2 = write(getfunctionek5ggoq2);
                if (strWrite.equals(strWrite2)) {
                    switch (strWrite.hashCode()) {
                        case -1950496919:
                            if (strWrite.equals("Number")) {
                                double dDoubleValue = ((getGEK5gGoQ) getfunctionek5ggoq).serializer.doubleValue();
                                double dDoubleValue2 = ((getGEK5gGoQ) getfunctionek5ggoq2).serializer.doubleValue();
                                if (!Double.isNaN(dDoubleValue) && !Double.isNaN(dDoubleValue2) && dDoubleValue == dDoubleValue2) {
                                    return true;
                                }
                            }
                            return false;
                        case -1939501217:
                            return strWrite.equals("Object") && getfunctionek5ggoq == getfunctionek5ggoq2;
                        case -1808118735:
                            if (strWrite.equals("String")) {
                                return ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.equals(((getInfoEK5gGoQ) getfunctionek5ggoq2).RemoteActionCompatParcelizer);
                            }
                            return false;
                        case 2439591:
                            if (strWrite.equals("Null")) {
                                return true;
                            }
                            return false;
                        case 965837104:
                            if (strWrite.equals("Undefined")) {
                                return true;
                            }
                            return false;
                        case 1729365000:
                            if (strWrite.equals("Boolean")) {
                                return ((getGuideEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.equals(((getGuideEK5gGoQ) getfunctionek5ggoq2).RemoteActionCompatParcelizer);
                            }
                            return false;
                        default:
                            return false;
                    }
                }
                getHelpEK5gGoQ gethelpek5ggoq = getHelpEK5gGoQ.serializer;
                getHelpEK5gGoQ gethelpek5ggoq2 = getHelpEK5gGoQ.read;
                if ((getfunctionek5ggoq == gethelpek5ggoq2 || getfunctionek5ggoq == gethelpek5ggoq) && (getfunctionek5ggoq2 == gethelpek5ggoq2 || getfunctionek5ggoq2 == gethelpek5ggoq)) {
                    return true;
                }
                if (strWrite.equals("Number") && strWrite2.equals("String")) {
                    return RemoteActionCompatParcelizer(getfunctionek5ggoq, new getGEK5gGoQ(Double.valueOf(RemoteActionCompatParcelizer(getfunctionek5ggoq2))));
                }
                if (strWrite.equals("String") && strWrite2.equals("Number")) {
                    return RemoteActionCompatParcelizer(new getGEK5gGoQ(Double.valueOf(RemoteActionCompatParcelizer(getfunctionek5ggoq))), getfunctionek5ggoq2);
                }
                if (strWrite.equals("Boolean")) {
                    return RemoteActionCompatParcelizer(new getGEK5gGoQ(Double.valueOf(RemoteActionCompatParcelizer(getfunctionek5ggoq))), getfunctionek5ggoq2);
                }
                if (strWrite2.equals("Boolean")) {
                    return RemoteActionCompatParcelizer(getfunctionek5ggoq, new getGEK5gGoQ(Double.valueOf(RemoteActionCompatParcelizer(getfunctionek5ggoq2))));
                }
                if ((!strWrite.equals("String") && !strWrite.equals("Number")) || !strWrite2.equals("Object")) {
                    if (strWrite.equals("Object") && (strWrite2.equals("String") || strWrite2.equals("Number"))) {
                        return RemoteActionCompatParcelizer(new getInfoEK5gGoQ(IconCompatParcelizer(getfunctionek5ggoq)), getfunctionek5ggoq2);
                    }
                    return false;
                }
                return RemoteActionCompatParcelizer(getfunctionek5ggoq, new getInfoEK5gGoQ(IconCompatParcelizer(getfunctionek5ggoq2)));
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(write(getfunctionek5ggoq2, "Illegal type given to abstractEqualityCompare: "));
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(write(getfunctionek5ggoq, "Illegal type given to abstractEqualityCompare: "));
        return false;
    }

    public static boolean read(getFunctionEK5gGoQ getfunctionek5ggoq, getFunctionEK5gGoQ getfunctionek5ggoq2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != null);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq2 != null);
        if (!MediaSessionCompatQueueItem(getfunctionek5ggoq)) {
            if (!MediaSessionCompatQueueItem(getfunctionek5ggoq2)) {
                if ((getfunctionek5ggoq instanceof getHomeEK5gGoQ) || (getfunctionek5ggoq instanceof getHenkanEK5gGoQ) || (getfunctionek5ggoq instanceof getGraveEK5gGoQ)) {
                    getfunctionek5ggoq = new getInfoEK5gGoQ(IconCompatParcelizer(getfunctionek5ggoq));
                }
                if ((getfunctionek5ggoq2 instanceof getHomeEK5gGoQ) || (getfunctionek5ggoq2 instanceof getHenkanEK5gGoQ) || (getfunctionek5ggoq2 instanceof getGraveEK5gGoQ)) {
                    getfunctionek5ggoq2 = new getInfoEK5gGoQ(IconCompatParcelizer(getfunctionek5ggoq2));
                }
                if ((getfunctionek5ggoq instanceof getInfoEK5gGoQ) && (getfunctionek5ggoq2 instanceof getInfoEK5gGoQ)) {
                    return ((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.compareTo(((getInfoEK5gGoQ) getfunctionek5ggoq2).RemoteActionCompatParcelizer) < 0;
                }
                double dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getfunctionek5ggoq);
                double dRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(getfunctionek5ggoq2);
                if (Double.isNaN(dRemoteActionCompatParcelizer) || Double.isNaN(dRemoteActionCompatParcelizer2) || ((dRemoteActionCompatParcelizer == 0.0d && dRemoteActionCompatParcelizer2 == 0.0d) || ((dRemoteActionCompatParcelizer == 0.0d && dRemoteActionCompatParcelizer2 == 0.0d) || dRemoteActionCompatParcelizer == Double.POSITIVE_INFINITY))) {
                    return false;
                }
                if (dRemoteActionCompatParcelizer2 == Double.POSITIVE_INFINITY) {
                    return true;
                }
                if (dRemoteActionCompatParcelizer2 == Double.NEGATIVE_INFINITY) {
                    return false;
                }
                return dRemoteActionCompatParcelizer == Double.NEGATIVE_INFINITY || Double.compare(dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2) < 0;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(write(getfunctionek5ggoq2, "Illegal type given to abstractRelationalCompare: "));
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(write(getfunctionek5ggoq, "Illegal type given to abstractRelationalCompare: "));
        return false;
    }

    public static boolean serializer(getFunctionEK5gGoQ getfunctionek5ggoq) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq != null);
        if (getfunctionek5ggoq != getHelpEK5gGoQ.read && getfunctionek5ggoq != getHelpEK5gGoQ.serializer) {
            if (getfunctionek5ggoq instanceof getGuideEK5gGoQ) {
                return ((getGuideEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.booleanValue();
            }
            if (getfunctionek5ggoq instanceof getGEK5gGoQ) {
                Double d = ((getGEK5gGoQ) getfunctionek5ggoq).serializer;
                if (d.doubleValue() == 0.0d || d.doubleValue() == 0.0d || Double.isNaN(d.doubleValue())) {
                    return false;
                }
            } else if (getfunctionek5ggoq instanceof getInfoEK5gGoQ) {
                if (((getInfoEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.isEmpty()) {
                    return false;
                }
            } else if (MediaSessionCompatQueueItem(getfunctionek5ggoq)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(write(getfunctionek5ggoq, "Illegal type given to isTruthy: "));
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r2.equals("Undefined") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r2.equals("Null") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        return true;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean write(o.getFunctionEK5gGoQ r5, o.getFunctionEK5gGoQ r6) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.LoadBalancer$Helper.write(o.getFunctionEK5gGoQ, o.getFunctionEK5gGoQ):boolean");
    }

    public static double read(getFunctionEK5gGoQ getfunctionek5ggoq) {
        double dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getfunctionek5ggoq);
        if (Double.isNaN(dRemoteActionCompatParcelizer)) {
            return 0.0d;
        }
        if (dRemoteActionCompatParcelizer == 0.0d || dRemoteActionCompatParcelizer == 0.0d || Double.isInfinite(dRemoteActionCompatParcelizer)) {
            return dRemoteActionCompatParcelizer;
        }
        return Math.floor(Math.abs(dRemoteActionCompatParcelizer)) * Math.signum(dRemoteActionCompatParcelizer);
    }
}
