package androidx.compose.ui.tooling;

import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.PreviewWrapperProvider;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.DrawableTransformation;
import o.accessgetInstancedelegatecp;
import o.getQueryParameterslambda2;
import o.onContentCardDismissed;
import o.r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc;
import o.r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewUtils_androidKt {
    public static final Group firstOrNull(Group group, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return (Group) onContentCardDismissed.MediaMetadataCompat((List) findGroupsThatMatchPredicate(group, r8lambdaunavo3sxub_pc9xroryotnrlvsm, true));
    }

    private static final List<Group> findGroupsThatMatchPredicate(Group group, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        ArrayList arrayList = new ArrayList();
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        ArrayList arrayList2 = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new Group[]{group}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
        while (!arrayList2.isEmpty()) {
            Group group2 = (Group) onContentCardDismissed.MediaSessionCompatQueueItem((List) arrayList2);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(group2)).booleanValue()) {
                if (z) {
                    int iSerializer3 = getQueryParameterslambda2.serializer();
                    int iSerializer4 = getQueryParameterslambda2.serializer();
                    return (List) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer4, 516583654, new Object[]{group2}, getQueryParameterslambda2.serializer(), -516583649, iSerializer3);
                }
                arrayList.add(group2);
            }
            arrayList2.addAll(group2.getChildren());
        }
        return arrayList;
    }

    private static final Object unwrapIfInline(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof r8lambdaRUId_CKikrZ7lQPjOxFph5_OwBc) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    DrawableTransformation.write("Array contains no element matching the predicate.");
                    return null;
                }
            }
        }
        return obj;
    }

    public static final List<Group> findAll(Group group, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return findGroupsThatMatchPredicate$default(group, r8lambdaunavo3sxub_pc9xroryotnrlvsm, false, 4, null);
    }

    public static final PreviewWrapperProvider instantiatePreviewWrapperProvider(Class<? extends PreviewWrapperProvider> cls) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor<?>[] constructors;
        if (cls != null && (constructors = cls.getConstructors()) != null) {
            int length = constructors.length;
            int i = 0;
            Constructor<?> constructor = null;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Constructor<?> constructor2 = constructors[i];
                if (constructor2.getParameterTypes().length == 0) {
                    if (!z) {
                        z = true;
                        constructor = constructor2;
                    }
                }
                i++;
                constructor = null;
                break;
            }
            if (constructor != null) {
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                objNewInstance.getClass();
                return (PreviewWrapperProvider) objNewInstance;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("PreviewWrapperProvider constructor can not have parameters");
        return null;
    }

    public static final Object[] getPreviewProviderParameters(Class<? extends PreviewParameterProvider<?>> cls, int i) {
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i2 = 0;
                boolean z = false;
                Constructor<?> constructor = null;
                while (true) {
                    if (i2 >= length) {
                        if (!z) {
                            break;
                        }
                        break;
                    }
                    Constructor<?> constructor2 = constructors[i2];
                    if (constructor2.getParameterTypes().length == 0) {
                        if (!z) {
                            z = true;
                            constructor = constructor2;
                        }
                    }
                    i2++;
                    constructor = null;
                    break;
                }
                if (constructor != null) {
                    constructor.setAccessible(true);
                    Object objNewInstance = constructor.newInstance(null);
                    objNewInstance.getClass();
                    PreviewParameterProvider previewParameterProvider = (PreviewParameterProvider) objNewInstance;
                    if (i < 0) {
                        return toArray(previewParameterProvider.getValues(), previewParameterProvider.getCount());
                    }
                    resumeWebviewIfNecessarylambda0 values = previewParameterProvider.getValues();
                    values.getClass();
                    if (i >= 0) {
                        int i3 = 0;
                        for (Object obj : values) {
                            if (i == i3) {
                                int iSerializer = getQueryParameterslambda2.serializer();
                                List list = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{obj}, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
                                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(unwrapIfInline(it.next()));
                                }
                                return arrayList.toArray(new Object[0]);
                            }
                            i3++;
                        }
                        throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + '.');
                    }
                    throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + i + '.');
                }
                throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
            } catch (r8lambdaRW1_n_nU4xArBI_btXJxixXwtrI unused) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                return null;
            }
        }
        return new Object[0];
    }

    private static final Object[] toArray(resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0, int i) {
        Iterator it = resumewebviewifnecessarylambda0.iterator();
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = it.next();
        }
        return objArr;
    }

    public static /* synthetic */ List findGroupsThatMatchPredicate$default(Group group, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return findGroupsThatMatchPredicate(group, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z);
    }

    public static final Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            PreviewLogger.Companion.logError$ui_tooling("Unable to find PreviewProvider '" + str + '\'', e);
            return null;
        }
    }

    public static final Class<? extends PreviewWrapperProvider> asPreviewWrapperProviderClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            PreviewLogger.Companion.logError$ui_tooling("Unable to find PreviewWrapperProvider '" + str + '\'', e);
            return null;
        }
    }
}
