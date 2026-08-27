package kotlinx.coroutines.internal;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import o.getCieXyz;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
final class ClassValueCtorCache extends CtorCache {
    static {
        new ClassValue<r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
            @Override // java.lang.ClassValue
            public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM computeValue(Class cls) {
                Object next;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1;
                cls.getClass();
                final int i = 0;
                if (ExceptionsConstructorKt.RemoteActionCompatParcelizer == ExceptionsConstructorKt.RemoteActionCompatParcelizer(cls, 0)) {
                    Constructor<?>[] constructors = cls.getConstructors();
                    ArrayList arrayList = new ArrayList(constructors.length);
                    int length = constructors.length;
                    int i2 = 0;
                    while (true) {
                        next = null;
                        if (i2 >= length) {
                            break;
                        }
                        final Constructor<?> constructor = constructors[i2];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        int length2 = parameterTypes.length;
                        final int i3 = 3;
                        int i4 = 16;
                        if (length2 != 0) {
                            final int i5 = 2;
                            final int i6 = 1;
                            if (length2 == 1) {
                                Class<?> cls2 = parameterTypes[0];
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cls2, String.class}, getCieXyz.write())).booleanValue()) {
                                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new GestureNodeKt$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                        public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                            int i7 = i6;
                                            Constructor constructor2 = constructor;
                                            Throwable th = (Throwable) obj;
                                            if (i7 == 0) {
                                                int i8 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                                objNewInstance.getClass();
                                                return (Throwable) objNewInstance;
                                            }
                                            if (i7 == 1) {
                                                int i9 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                                objNewInstance2.getClass();
                                                Throwable th2 = (Throwable) objNewInstance2;
                                                th2.initCause(th);
                                                return th2;
                                            }
                                            if (i7 == 2) {
                                                int i10 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                Object objNewInstance3 = constructor2.newInstance(th);
                                                objNewInstance3.getClass();
                                                return (Throwable) objNewInstance3;
                                            }
                                            int i11 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                            Object objNewInstance4 = constructor2.newInstance(null);
                                            objNewInstance4.getClass();
                                            Throwable th3 = (Throwable) objNewInstance4;
                                            th3.initCause(th);
                                            return th3;
                                        }
                                    }, i4), 2);
                                } else {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cls2, Throwable.class}, getCieXyz.write())).booleanValue()) {
                                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new GestureNodeKt$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                                int i7 = i5;
                                                Constructor constructor2 = constructor;
                                                Throwable th = (Throwable) obj;
                                                if (i7 == 0) {
                                                    int i8 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                    Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                                    objNewInstance.getClass();
                                                    return (Throwable) objNewInstance;
                                                }
                                                if (i7 == 1) {
                                                    int i9 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                    Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                                    objNewInstance2.getClass();
                                                    Throwable th2 = (Throwable) objNewInstance2;
                                                    th2.initCause(th);
                                                    return th2;
                                                }
                                                if (i7 == 2) {
                                                    int i10 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                    Object objNewInstance3 = constructor2.newInstance(th);
                                                    objNewInstance3.getClass();
                                                    return (Throwable) objNewInstance3;
                                                }
                                                int i11 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                Object objNewInstance4 = constructor2.newInstance(null);
                                                objNewInstance4.getClass();
                                                Throwable th3 = (Throwable) objNewInstance4;
                                                th3.initCause(th);
                                                return th3;
                                            }
                                        }, i4), 1);
                                    } else {
                                        onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(null, -1);
                                    }
                                }
                            } else if (length2 != 2) {
                                onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(null, -1);
                            } else {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{parameterTypes[0], String.class}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{parameterTypes[1], Throwable.class}, getCieXyz.write())).booleanValue()) {
                                        onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new GestureNodeKt$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                                int i7 = i;
                                                Constructor constructor2 = constructor;
                                                Throwable th = (Throwable) obj;
                                                if (i7 == 0) {
                                                    int i8 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                    Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                                    objNewInstance.getClass();
                                                    return (Throwable) objNewInstance;
                                                }
                                                if (i7 == 1) {
                                                    int i9 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                    Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                                    objNewInstance2.getClass();
                                                    Throwable th2 = (Throwable) objNewInstance2;
                                                    th2.initCause(th);
                                                    return th2;
                                                }
                                                if (i7 == 2) {
                                                    int i10 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                    Object objNewInstance3 = constructor2.newInstance(th);
                                                    objNewInstance3.getClass();
                                                    return (Throwable) objNewInstance3;
                                                }
                                                int i11 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                                Object objNewInstance4 = constructor2.newInstance(null);
                                                objNewInstance4.getClass();
                                                Throwable th3 = (Throwable) objNewInstance4;
                                                th3.initCause(th);
                                                return th3;
                                            }
                                        }, i4), 3);
                                    }
                                }
                                onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(null, -1);
                            }
                            arrayList.add(onviewattachedtowindowlambda1);
                            i2++;
                        } else {
                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new GestureNodeKt$$ExternalSyntheticLambda0(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$$ExternalSyntheticLambda0
                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                                    int i7 = i3;
                                    Constructor constructor2 = constructor;
                                    Throwable th = (Throwable) obj;
                                    if (i7 == 0) {
                                        int i8 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                        Object objNewInstance = constructor2.newInstance(th.getMessage(), th);
                                        objNewInstance.getClass();
                                        return (Throwable) objNewInstance;
                                    }
                                    if (i7 == 1) {
                                        int i9 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                        Object objNewInstance2 = constructor2.newInstance(th.getMessage());
                                        objNewInstance2.getClass();
                                        Throwable th2 = (Throwable) objNewInstance2;
                                        th2.initCause(th);
                                        return th2;
                                    }
                                    if (i7 == 2) {
                                        int i10 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                        Object objNewInstance3 = constructor2.newInstance(th);
                                        objNewInstance3.getClass();
                                        return (Throwable) objNewInstance3;
                                    }
                                    int i11 = ExceptionsConstructorKt.RemoteActionCompatParcelizer;
                                    Object objNewInstance4 = constructor2.newInstance(null);
                                    objNewInstance4.getClass();
                                    Throwable th3 = (Throwable) objNewInstance4;
                                    th3.initCause(th);
                                    return th3;
                                }
                            }, i4), 0);
                        }
                        onviewattachedtowindowlambda1 = onviewattachedtowindowlambda0;
                        arrayList.add(onviewattachedtowindowlambda1);
                        i2++;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int iIntValue = ((Number) ((onViewAttachedToWindowlambda0) next).write).intValue();
                            do {
                                Object next2 = it.next();
                                int iIntValue2 = ((Number) ((onViewAttachedToWindowlambda0) next2).write).intValue();
                                if (iIntValue < iIntValue2) {
                                    next = next2;
                                    iIntValue = iIntValue2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = (onViewAttachedToWindowlambda0) next;
                    if (onviewattachedtowindowlambda2 != null && (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) onviewattachedtowindowlambda2.serializer) != null) {
                        return r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                    }
                }
                return new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return null;
                    }
                };
            }
        };
    }
}
