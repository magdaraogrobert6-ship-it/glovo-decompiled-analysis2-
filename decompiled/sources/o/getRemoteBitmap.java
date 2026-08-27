package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.BundleUtil;
import com.squareup.moshi.ClassJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.MapJsonAdapter;
import com.squareup.moshi.StandardJsonAdapters;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public final class getRemoteBitmap {
    public final /* synthetic */ int read;

    public /* synthetic */ getRemoteBitmap(int i) {
        this.read = i;
    }

    public static void IconCompatParcelizer(Type type, Class cls) {
        Class<?> clsWrite = androidx.room.Room.write(type);
        if (cls.isAssignableFrom(clsWrite)) {
            StringBuilder sb = new StringBuilder("No JsonAdapter for ");
            sb.append(type);
            String simpleName = cls.getSimpleName();
            String simpleName2 = clsWrite.getSimpleName();
            sb.append(", you should probably use ");
            sb.append(simpleName);
            sb.append(" instead of ");
            sb.append(simpleName2);
            sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final JsonAdapter serializer(Type type, Set set, getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        Class clsWrite;
        Type[] actualTypeArguments;
        char c;
        char c2;
        Type componentType;
        Class cls;
        getDensityDpi getdensitydpi;
        Set setUnmodifiableSet;
        JsonAdapter jsonAdapterNullSafe;
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type typeSerializer = type;
        int i = this.read;
        int i2 = 0;
        if (i == 0) {
            if (set.isEmpty() && (clsWrite = androidx.room.Room.write(type)) == Map.class) {
                if (typeSerializer == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (Map.class.isAssignableFrom(clsWrite)) {
                        Type typeSerializer2 = getRemoteBitmaplambda4.serializer(typeSerializer, clsWrite, getRemoteBitmaplambda4.serializer(typeSerializer, clsWrite, Map.class), new LinkedHashSet());
                        if (typeSerializer2 instanceof ParameterizedType) {
                            actualTypeArguments = ((ParameterizedType) typeSerializer2).getActualTypeArguments();
                        } else {
                            c = 0;
                            c2 = 1;
                            actualTypeArguments = new Type[]{Object.class, Object.class};
                        }
                        return new MapJsonAdapter(getruntime_memory_image_loader_usage_quotientannotations, actualTypeArguments[c], actualTypeArguments[c2]).nullSafe();
                    }
                    DrawableTransformation.write();
                }
                c = 0;
                c2 = 1;
                return new MapJsonAdapter(getruntime_memory_image_loader_usage_quotientannotations, actualTypeArguments[c], actualTypeArguments[c2]).nullSafe();
            }
            return null;
        }
        if (i == 1) {
            if (typeSerializer instanceof GenericArrayType) {
                componentType = ((GenericArrayType) typeSerializer).getGenericComponentType();
            } else {
                componentType = typeSerializer instanceof Class ? ((Class) typeSerializer).getComponentType() : null;
            }
            if (componentType != null && set.isEmpty()) {
                return new MapJsonAdapter(androidx.room.Room.write(componentType), getruntime_memory_image_loader_usage_quotientannotations.read(componentType, getRemoteBitmaplambda4.read, null)).nullSafe();
            }
            return null;
        }
        if (i == 2) {
            if ((typeSerializer instanceof Class) || (typeSerializer instanceof ParameterizedType)) {
                Class clsWrite2 = androidx.room.Room.write(type);
                if (!clsWrite2.isInterface() && !clsWrite2.isEnum() && set.isEmpty()) {
                    if (getRemoteBitmaplambda4.serializer(clsWrite2)) {
                        IconCompatParcelizer(typeSerializer, List.class);
                        IconCompatParcelizer(typeSerializer, Set.class);
                        IconCompatParcelizer(typeSerializer, Map.class);
                        IconCompatParcelizer(typeSerializer, Collection.class);
                        String str = "Platform " + clsWrite2;
                        if (typeSerializer instanceof ParameterizedType) {
                            str = str + " in " + typeSerializer;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(str.concat(" requires explicit JsonAdapter to be registered"));
                        return null;
                    }
                    if (!clsWrite2.isAnonymousClass()) {
                        if (!clsWrite2.isLocalClass()) {
                            if (clsWrite2.getEnclosingClass() != null && !java.lang.reflect.Modifier.isStatic(clsWrite2.getModifiers())) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot serialize non-static nested class ".concat(clsWrite2.getName()));
                                return null;
                            }
                            if (!java.lang.reflect.Modifier.isAbstract(clsWrite2.getModifiers())) {
                                Class<? extends Annotation> cls3 = getRemoteBitmaplambda4.RemoteActionCompatParcelizer;
                                if (cls3 != null && clsWrite2.isAnnotationPresent(cls3)) {
                                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Cannot serialize Kotlin type ", clsWrite2.getName(), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                                    return null;
                                }
                                calculateInSampleSizelambda1 calculateinsamplesizelambda1IconCompatParcelizer = calculateInSampleSizelambda1.IconCompatParcelizer(clsWrite2);
                                TreeMap treeMap = new TreeMap();
                                while (typeSerializer != Object.class) {
                                    Class clsWrite3 = androidx.room.Room.write(typeSerializer);
                                    boolean zSerializer = getRemoteBitmaplambda4.serializer(clsWrite3);
                                    Field[] declaredFields = clsWrite3.getDeclaredFields();
                                    int length = declaredFields.length;
                                    int i3 = i2;
                                    while (i3 < length) {
                                        Field field = declaredFields[i3];
                                        int modifiers = field.getModifiers();
                                        if (java.lang.reflect.Modifier.isStatic(modifiers) || java.lang.reflect.Modifier.isTransient(modifiers) || (!(java.lang.reflect.Modifier.isPublic(modifiers) || java.lang.reflect.Modifier.isProtected(modifiers) || !zSerializer) || ((getdensitydpi = (getDensityDpi) field.getAnnotation(getDensityDpi.class)) != null && getdensitydpi.RemoteActionCompatParcelizer()))) {
                                            cls = clsWrite3;
                                        } else {
                                            Type typeSerializer3 = getRemoteBitmaplambda4.serializer(typeSerializer, clsWrite3, field.getGenericType(), new LinkedHashSet());
                                            Annotation[] annotations = field.getAnnotations();
                                            int length2 = annotations.length;
                                            int i4 = 0;
                                            LinkedHashSet linkedHashSet = null;
                                            while (i4 < length2) {
                                                Annotation annotation = annotations[i4];
                                                int i5 = length2;
                                                Class cls4 = clsWrite3;
                                                if (annotation.annotationType().isAnnotationPresent(getDestinationHeightAndWidthPixelslambda0.class)) {
                                                    LinkedHashSet linkedHashSet2 = linkedHashSet == null ? new LinkedHashSet() : linkedHashSet;
                                                    linkedHashSet2.add(annotation);
                                                    linkedHashSet = linkedHashSet2;
                                                }
                                                i4++;
                                                length2 = i5;
                                                clsWrite3 = cls4;
                                            }
                                            cls = clsWrite3;
                                            if (linkedHashSet != null) {
                                                setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                                            } else {
                                                setUnmodifiableSet = getRemoteBitmaplambda4.read;
                                            }
                                            String name = field.getName();
                                            JsonAdapter jsonAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(typeSerializer3, setUnmodifiableSet, name);
                                            field.setAccessible(true);
                                            if (getdensitydpi != null) {
                                                String strSerializer = getdensitydpi.serializer();
                                                if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strSerializer)) {
                                                    name = strSerializer;
                                                }
                                            }
                                            getDestinationHeightAndWidthPixels getdestinationheightandwidthpixels = (getDestinationHeightAndWidthPixels) treeMap.put(name, new getDestinationHeightAndWidthPixels(name, field, jsonAdapter));
                                            if (getdestinationheightandwidthpixels != null) {
                                                DrawableTransformation.read("Conflicting fields:\n    ", getdestinationheightandwidthpixels.IconCompatParcelizer, "\n    ", field);
                                            }
                                        }
                                        i3++;
                                        clsWrite3 = cls;
                                    }
                                    Class clsWrite4 = androidx.room.Room.write(typeSerializer);
                                    typeSerializer = getRemoteBitmaplambda4.serializer(typeSerializer, clsWrite4, clsWrite4.getGenericSuperclass(), new LinkedHashSet());
                                    i2 = 0;
                                }
                                return new ClassJsonAdapter(calculateinsamplesizelambda1IconCompatParcelizer, treeMap).nullSafe();
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot serialize abstract class ".concat(clsWrite2.getName()));
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot serialize local class ".concat(clsWrite2.getName()));
                        }
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot serialize anonymous class ".concat(clsWrite2.getName()));
                    }
                }
            }
            return null;
        }
        if (i != 3) {
            if (i == 4 || !set.isEmpty()) {
                return null;
            }
            Class cls5 = Boolean.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions = StandardJsonAdapters.serializer;
            if (typeSerializer == cls5) {
                return resizeimageviewtobitmapdimensions;
            }
            Class cls6 = Byte.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions2 = StandardJsonAdapters.write;
            if (typeSerializer == cls6) {
                return resizeimageviewtobitmapdimensions2;
            }
            Class cls7 = Character.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions3 = StandardJsonAdapters.RemoteActionCompatParcelizer;
            if (typeSerializer == cls7) {
                return resizeimageviewtobitmapdimensions3;
            }
            Class cls8 = Double.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions4 = StandardJsonAdapters.read;
            if (typeSerializer == cls8) {
                return resizeimageviewtobitmapdimensions4;
            }
            Class cls9 = Float.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions5 = StandardJsonAdapters.MediaMetadataCompat;
            if (typeSerializer == cls9) {
                return resizeimageviewtobitmapdimensions5;
            }
            Class cls10 = Integer.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions6 = StandardJsonAdapters.MediaDescriptionCompat;
            if (typeSerializer == cls10) {
                return resizeimageviewtobitmapdimensions6;
            }
            Class cls11 = Long.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions7 = StandardJsonAdapters.MediaSessionCompatQueueItem;
            if (typeSerializer == cls11) {
                return resizeimageviewtobitmapdimensions7;
            }
            Class cls12 = Short.TYPE;
            resizeImageViewToBitmapDimensions resizeimageviewtobitmapdimensions8 = StandardJsonAdapters.MediaBrowserCompatMediaItem;
            if (typeSerializer == cls12) {
                return resizeimageviewtobitmapdimensions8;
            }
            if (typeSerializer == Boolean.class) {
                return resizeimageviewtobitmapdimensions.nullSafe();
            }
            if (typeSerializer == Byte.class) {
                return resizeimageviewtobitmapdimensions2.nullSafe();
            }
            if (typeSerializer == Character.class) {
                return resizeimageviewtobitmapdimensions3.nullSafe();
            }
            if (typeSerializer == Double.class) {
                return resizeimageviewtobitmapdimensions4.nullSafe();
            }
            if (typeSerializer == Float.class) {
                return resizeimageviewtobitmapdimensions5.nullSafe();
            }
            if (typeSerializer == Integer.class) {
                return resizeimageviewtobitmapdimensions6.nullSafe();
            }
            if (typeSerializer == Long.class) {
                return resizeimageviewtobitmapdimensions7.nullSafe();
            }
            if (typeSerializer == Short.class) {
                return resizeimageviewtobitmapdimensions8.nullSafe();
            }
            if (typeSerializer == String.class) {
                return StandardJsonAdapters.RatingCompat.nullSafe();
            }
            if (typeSerializer == Object.class) {
                return new StandardJsonAdapters.ObjectJsonAdapter(getruntime_memory_image_loader_usage_quotientannotations).nullSafe();
            }
            Class clsWrite5 = androidx.room.Room.write(type);
            Set set2 = getRemoteBitmaplambda4.read;
            getImageLoaderCacheSize getimageloadercachesize = (getImageLoaderCacheSize) clsWrite5.getAnnotation(getImageLoaderCacheSize.class);
            if (getimageloadercachesize == null || !getimageloadercachesize.write()) {
                jsonAdapterNullSafe = null;
            } else {
                try {
                    try {
                        cls2 = Class.forName(clsWrite5.getName().replace("$", BundleUtil.UNDERLINE_TAG) + "JsonAdapter", true, clsWrite5.getClassLoader());
                        try {
                            if (typeSerializer instanceof ParameterizedType) {
                                Type[] actualTypeArguments2 = ((ParameterizedType) typeSerializer).getActualTypeArguments();
                                try {
                                    declaredConstructor = cls2.getDeclaredConstructor(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations.class, Type[].class);
                                    objArr = new Object[]{getruntime_memory_image_loader_usage_quotientannotations, actualTypeArguments2};
                                } catch (NoSuchMethodException unused) {
                                    declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                    objArr = new Object[]{actualTypeArguments2};
                                }
                            } else {
                                try {
                                    declaredConstructor = cls2.getDeclaredConstructor(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations.class);
                                    objArr = new Object[]{getruntime_memory_image_loader_usage_quotientannotations};
                                } catch (NoSuchMethodException unused2) {
                                    declaredConstructor = cls2.getDeclaredConstructor(null);
                                    objArr = new Object[0];
                                }
                            }
                            declaredConstructor.setAccessible(true);
                            jsonAdapterNullSafe = ((JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
                        } catch (NoSuchMethodException e) {
                            e = e;
                            if (!(typeSerializer instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                                StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                                sb.append(typeSerializer);
                                String canonicalName = cls2.getCanonicalName();
                                sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                                sb.append(canonicalName);
                                sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                                throw new RuntimeException(sb.toString(), e);
                            }
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Failed to find the generated JsonAdapter constructor for ", typeSerializer, e);
                            return null;
                        }
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        cls2 = null;
                    }
                } catch (ClassNotFoundException e3) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Failed to find the generated JsonAdapter class for ", typeSerializer, e3);
                    return null;
                } catch (IllegalAccessException e4) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Failed to access the generated JsonAdapter for ", typeSerializer, e4);
                    return null;
                } catch (InstantiationException e5) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.RemoteActionCompatParcelizer("Failed to instantiate the generated JsonAdapter for ", typeSerializer, e5);
                    return null;
                } catch (InvocationTargetException e6) {
                    getRemoteBitmaplambda4.serializer(e6);
                    throw null;
                }
            }
            if (jsonAdapterNullSafe != null) {
                return jsonAdapterNullSafe;
            }
            if (clsWrite5.isEnum()) {
                return new StandardJsonAdapters.EnumJsonAdapter(clsWrite5).nullSafe();
            }
            return null;
        }
        Class clsWrite6 = androidx.room.Room.write(type);
        if (!set.isEmpty()) {
            return null;
        }
        if (clsWrite6 != List.class && clsWrite6 != Collection.class) {
            if (clsWrite6 == Set.class) {
                return new getBitmapdefault(getruntime_memory_image_loader_usage_quotientannotations.read(androidx.room.Room.IconCompatParcelizer(type), getRemoteBitmaplambda4.read, null)).nullSafe();
            }
            return null;
        }
        return new getBitmapMetadataFromStream(getruntime_memory_image_loader_usage_quotientannotations.read(androidx.room.Room.IconCompatParcelizer(type), getRemoteBitmaplambda4.read, null)).nullSafe();
    }
}
