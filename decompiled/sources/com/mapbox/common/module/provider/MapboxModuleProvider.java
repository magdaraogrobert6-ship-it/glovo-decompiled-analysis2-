package com.mapbox.common.module.provider;

import com.mapbox.annotation.module.MapboxModuleType;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxModuleProvider {
    public static final MapboxModuleProvider INSTANCE = new MapboxModuleProvider();
    private static final String TAG = "MapboxModuleProvider";
    private static final MapboxModuleProvider$defaultMapboxModuleCreator$1 defaultMapboxModuleCreator;
    private static final ModuleInstanceProvider[] instanceCreators;
    private static final MapboxModuleProvider$kotlinObjectReferenceProvider$1 kotlinObjectReferenceProvider;
    private static final MapboxModuleProvider$noArgConstructorCreator$1 noArgConstructorCreator;
    private static final MapboxModuleProvider$singletonReferenceProvider$1 singletonReferenceProvider;

    public interface ModuleInstanceProvider {
        Object getInstance(Class<?> cls, MapboxModuleType mapboxModuleType, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    private MapboxModuleProvider() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1] */
    static {
        ?? r0 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> cls, MapboxModuleType mapboxModuleType, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws NoSuchMethodException {
                cls.getClass();
                mapboxModuleType.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                Constructor<?> constructor = cls.getConstructor(null);
                constructor.getClass();
                return constructor.newInstance(null);
            }
        };
        noArgConstructorCreator = r0;
        ?? r1 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> cls, MapboxModuleType mapboxModuleType, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                cls.getClass();
                mapboxModuleType.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                return cls.getField("INSTANCE").get(null);
            }
        };
        kotlinObjectReferenceProvider = r1;
        ?? r2 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> cls, MapboxModuleType mapboxModuleType, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                cls.getClass();
                mapboxModuleType.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                return cls.getMethod("getInstance", null).invoke(null, null);
            }
        };
        singletonReferenceProvider = r2;
        ?? r3 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> cls, MapboxModuleType mapboxModuleType, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws NoSuchMethodException {
                cls.getClass();
                mapboxModuleType.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                ModuleProviderArgument[] moduleProviderArgumentArr = (ModuleProviderArgument[]) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(mapboxModuleType);
                ArrayList arrayList = new ArrayList(moduleProviderArgumentArr.length);
                for (ModuleProviderArgument moduleProviderArgument : moduleProviderArgumentArr) {
                    arrayList.add(moduleProviderArgument.getExpectedArgumentClass());
                }
                Object[] array = arrayList.toArray(new Class[0]);
                array.getClass();
                Class[] clsArr = (Class[]) array;
                Constructor<?> constructor = cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                constructor.getClass();
                ArrayList arrayList2 = new ArrayList(moduleProviderArgumentArr.length);
                for (ModuleProviderArgument moduleProviderArgument2 : moduleProviderArgumentArr) {
                    arrayList2.add(moduleProviderArgument2.getArgumentInstance());
                }
                Object[] array2 = arrayList2.toArray(new Object[0]);
                array2.getClass();
                return constructor.newInstance(Arrays.copyOf(array2, array2.length));
            }
        };
        defaultMapboxModuleCreator = r3;
        instanceCreators = new ModuleInstanceProvider[]{r0, r1, r2, r3};
    }

    public final <T> T createModule(MapboxModuleType mapboxModuleType, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) throws Exception {
        mapboxModuleType.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            Class<?> cls = Class.forName("com.mapbox.module.".concat(String.format("Mapbox_%sModuleConfiguration", Arrays.copyOf(new Object[]{mapboxModuleType.getSimplifiedName()}, 1))));
            T t = null;
            Object objInvoke = cls.getMethod(asGetterFun("enableConfiguration"), null).invoke(null, null);
            objInvoke.getClass();
            if (((Boolean) objInvoke).booleanValue()) {
                Field declaredField = cls.getDeclaredField("moduleProvider");
                declaredField.getClass();
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new MapboxInvalidModuleException(mapboxModuleType);
                }
                Class<?> type = declaredField.getType();
                type.getClass();
                Method declaredMethod = type.getDeclaredMethod(String.format("create%s", Arrays.copyOf(new Object[]{mapboxModuleType.getSimplifiedName()}, 1)), null);
                declaredMethod.getClass();
                T t2 = (T) declaredMethod.invoke(obj, null);
                t2.getClass();
                return t2;
            }
            Object objInvoke2 = cls.getMethod(asGetterFun("implClass"), null).invoke(null, null);
            objInvoke2.getClass();
            Class<?> cls2 = (Class) objInvoke2;
            ArrayList arrayList = new ArrayList();
            for (ModuleInstanceProvider moduleInstanceProvider : instanceCreators) {
                try {
                    t = (T) moduleInstanceProvider.getInstance(cls2, mapboxModuleType, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                } catch (Exception e) {
                    if (e instanceof MapboxInvalidModuleException) {
                        throw e;
                    }
                    arrayList.add(e);
                }
                if (t != null) {
                    break;
                }
            }
            if (t == null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    SentryLogcatAdapter.read(TAG, "Module loading failed", (Throwable) it.next());
                }
            }
            if (t != null) {
                return t;
            }
            throw new MapboxInvalidModuleException(mapboxModuleType);
        } catch (Exception e2) {
            if (e2 instanceof MapboxInvalidModuleException) {
                throw e2;
            }
            e2.printStackTrace();
            throw new MapboxInvalidModuleException(mapboxModuleType);
        }
    }

    private final String asGetterFun(String str) {
        return "get" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
