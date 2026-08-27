package androidx.room;

import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.IntPair;
import coil3.util.UtilsKt;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.RegexKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.DefaultContentCardView;
import o.DefaultInAppMessageModalViewFactory;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.ImageOnlyContentCardViewViewHolder;
import o.InAppMessageBackEventHandler;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.accessgetInAppMessageViewp;
import o.accessgetSystemNavigationDowncp;
import o.clipRectmtrdDE;
import o.createFromParcel;
import o.createInAppMessageViewlambda0;
import o.createInAppMessageViewlambda10;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getFunctionEK5gGoQ;
import o.getGEK5gGoQ;
import o.getGraveEK5gGoQ;
import o.getGuideEK5gGoQ;
import o.getHelpEK5gGoQ;
import o.getHenkanEK5gGoQ;
import o.getHomeEK5gGoQ;
import o.getIEK5gGoQ;
import o.getInfoEK5gGoQ;
import o.getOffVariationName;
import o.getRemoteBitmaplambda4;
import o.getUnregisteredInAppMessageannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onAnimationEndlambda1;
import o.prepareInAppMessageWithHtmllambda1;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.resizeToBitmapDimensions;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes.dex */
public abstract class Room {
    public static UserManager MediaBrowserCompatMediaItem = null;
    public static volatile boolean MediaDescriptionCompat = false;

    public static Type IconCompatParcelizer(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            DrawableTransformation.write();
            return null;
        }
        Type typeSerializer = getRemoteBitmaplambda4.serializer(type, Collection.class, getRemoteBitmaplambda4.serializer(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeSerializer instanceof WildcardType) {
            typeSerializer = ((WildcardType) typeSerializer).getUpperBounds()[0];
        }
        return typeSerializer instanceof ParameterizedType ? ((ParameterizedType) typeSerializer).getActualTypeArguments()[0] : Object.class;
    }

    public static getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getIEK5gGoQ getiek5ggoq) {
        String str = getiek5ggoq.RemoteActionCompatParcelizer;
        ArrayList arrayList = getiek5ggoq.serializer;
        getFunctionEK5gGoQ getfunctionek5ggoq = zzbvVar.read(str);
        if (getfunctionek5ggoq == null) {
            IBraze$$ExternalSyntheticBUOutline0.m(ff$$ExternalSyntheticOutline0.m("Function '", str, "' is not supported"));
            return null;
        }
        if (getfunctionek5ggoq instanceof getGraveEK5gGoQ) {
            return ((getGraveEK5gGoQ) getfunctionek5ggoq).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(zzbvVar, (getFunctionEK5gGoQ[]) arrayList.toArray(new getFunctionEK5gGoQ[arrayList.size()]));
        }
        IBraze$$ExternalSyntheticBUOutline0.m(ff$$ExternalSyntheticOutline0.m("Function '", str, "' is not a function"));
        return null;
    }

    public static getFunctionEK5gGoQ IconCompatParcelizer(Object obj) {
        if (obj == null) {
            return getHelpEK5gGoQ.serializer;
        }
        if (obj instanceof getFunctionEK5gGoQ) {
            return (getFunctionEK5gGoQ) obj;
        }
        if (obj instanceof Boolean) {
            return new getGuideEK5gGoQ((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new getGEK5gGoQ(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new getGEK5gGoQ(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new getGEK5gGoQ(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new getGEK5gGoQ(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new getGEK5gGoQ((Double) obj);
        }
        if (obj instanceof Byte) {
            return new getInfoEK5gGoQ(obj.toString());
        }
        if (obj instanceof Character) {
            return new getInfoEK5gGoQ(obj.toString());
        }
        if (obj instanceof String) {
            return new getInfoEK5gGoQ((String) obj);
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(IconCompatParcelizer(it.next()));
            }
            return new getHenkanEK5gGoQ(arrayList);
        }
        if (obj instanceof Map) {
            HashMap map = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(entry.getKey() instanceof String);
                map.put((String) entry.getKey(), IconCompatParcelizer(entry.getValue()));
            }
            return new getHomeEK5gGoQ(map);
        }
        if (!(obj instanceof Bundle)) {
            IBraze$$ExternalSyntheticBUOutline0.m("Type not supported: ".concat(String.valueOf(obj.getClass())));
            return null;
        }
        HashMap map2 = new HashMap();
        Bundle bundle = (Bundle) obj;
        for (String str : bundle.keySet()) {
            map2.put(str, IconCompatParcelizer(bundle.get(str)));
        }
        return new getHomeEK5gGoQ(map2);
    }

    public static boolean write(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static Object IconCompatParcelizer(ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder, Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, shortNewsContentCardViewViewHolder);
    }

    public static TextAnnouncementContentCardView IconCompatParcelizer(ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder, ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        imageOnlyContentCardViewViewHolder.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shortNewsContentCardViewViewHolder.getKey(), imageOnlyContentCardViewViewHolder}, getCieXyz.write())).booleanValue() ? r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write : shortNewsContentCardViewViewHolder;
    }

    public static final clipRectmtrdDE RemoteActionCompatParcelizer(Context context, Class cls, String str) {
        context.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new clipRectmtrdDE(context, cls, str);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static getFunctionEK5gGoQ RemoteActionCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ getfunctionek5ggoq) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq);
        if (!serializer(getfunctionek5ggoq) && !(getfunctionek5ggoq instanceof getGraveEK5gGoQ) && !(getfunctionek5ggoq instanceof getHenkanEK5gGoQ) && !(getfunctionek5ggoq instanceof getHomeEK5gGoQ)) {
            if (!(getfunctionek5ggoq instanceof getIEK5gGoQ)) {
                IBraze$$ExternalSyntheticBUOutline0.m("Attempting to evaluate unknown type");
                return null;
            }
            getfunctionek5ggoq = IconCompatParcelizer(zzbvVar, (getIEK5gGoQ) getfunctionek5ggoq);
        }
        if (getfunctionek5ggoq == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AbstractType evaluated to Java null");
            return null;
        }
        if (!(getfunctionek5ggoq instanceof getIEK5gGoQ)) {
            return getfunctionek5ggoq;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("AbstractType evaluated to illegal type Statement.");
        return null;
    }

    public static final prepareInAppMessageWithHtmllambda1 RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, resetTransientState resettransientstate) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        if (regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0) {
            return prepareInAppMessageWithHtmllambda1.POLY_OBJ;
        }
        Object[] objArr = {regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return prepareInAppMessageWithHtmllambda1.LIST;
        }
        Object[] objArr2 = {regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return prepareInAppMessageWithHtmllambda1.OBJ;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0), resettransientstate.RemoteActionCompatParcelizer);
        RegexKt regexKtRemoteActionCompatParcelizer2 = r8lambda92m0p9sit5uf70mvjf4rwmruda2.RemoteActionCompatParcelizer();
        if (!(regexKtRemoteActionCompatParcelizer2 instanceof DefaultInAppMessageModalViewFactory)) {
            Object[] objArr3 = {regexKtRemoteActionCompatParcelizer2, r8lambda7TbKsIS1F2Je6e1BPmbF7ukhpw.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                throw IntPair.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda2);
            }
        }
        return prepareInAppMessageWithHtmllambda1.MAP;
    }

    public static TextAnnouncementContentCardView read(ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        textAnnouncementContentCardView.getClass();
        return textAnnouncementContentCardView == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write ? shortNewsContentCardViewViewHolder : (TextAnnouncementContentCardView) textAnnouncementContentCardView.fold(shortNewsContentCardViewViewHolder, new DefaultContentCardView(26));
    }

    public static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        prepareinappmessagewithzippedassethtml.getClass();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), createInAppMessageViewlambda10.write}, getCieXyz.write())).booleanValue()) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda.write() ? read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0), prepareinappmessagewithzippedassethtml) : r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = UtilsKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = (getunregisteredinappmessageannotations == null || (setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer = prepareinappmessagewithzippedassethtml.RemoteActionCompatParcelizer(getunregisteredinappmessageannotations, instance_delegatelambda0.write)) == null) ? null : setgraphicmodalmaxwidthdpRemoteActionCompatParcelizer.getDescriptor();
        return (descriptor == null || (r8lambda92m0p9sit5uf70mvjf4rwmruda2 = read(descriptor, prepareinappmessagewithzippedassethtml)) == null) ? r8lambda92m0p9sit5uf70mvjf4rwmruda : r8lambda92m0p9sit5uf70mvjf4rwmruda2;
    }

    public static ShortNewsContentCardViewViewHolder write(ShortNewsContentCardViewViewHolder shortNewsContentCardViewViewHolder, ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        imageOnlyContentCardViewViewHolder.getClass();
        Object[] objArr = {shortNewsContentCardViewViewHolder.getKey(), imageOnlyContentCardViewViewHolder};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return shortNewsContentCardViewViewHolder;
        }
        return null;
    }

    public static boolean RemoteActionCompatParcelizer(getFunctionEK5gGoQ getfunctionek5ggoq) {
        if (getfunctionek5ggoq == getHelpEK5gGoQ.RemoteActionCompatParcelizer || getfunctionek5ggoq == getHelpEK5gGoQ.IconCompatParcelizer) {
            return true;
        }
        return (getfunctionek5ggoq instanceof getHelpEK5gGoQ) && ((getHelpEK5gGoQ) getfunctionek5ggoq).MediaBrowserCompatMediaItem;
    }

    public static final Expression literal(List list) {
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("literal");
        expressionBuilder.arguments.add(new Expression(list));
        return expressionBuilder.build();
    }

    public static getHelpEK5gGoQ serializer(zzbv zzbvVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getFunctionEK5gGoQ getfunctionek5ggoq = (getFunctionEK5gGoQ) it.next();
            accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoq instanceof getIEK5gGoQ);
            getFunctionEK5gGoQ getfunctionek5ggoqRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(zzbvVar, getfunctionek5ggoq);
            if (RemoteActionCompatParcelizer(getfunctionek5ggoqRemoteActionCompatParcelizer)) {
                return (getHelpEK5gGoQ) getfunctionek5ggoqRemoteActionCompatParcelizer;
            }
        }
        return getHelpEK5gGoQ.read;
    }

    public static boolean serializer(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return serializer(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof resizeToBitmapDimensions) {
                actualTypeArguments = ((resizeToBitmapDimensions) parameterizedType).IconCompatParcelizer;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof resizeToBitmapDimensions) {
                actualTypeArguments2 = ((resizeToBitmapDimensions) parameterizedType2).IconCompatParcelizer;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            return serializer(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return serializer(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return serializer(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Class write(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) write(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return write(((WildcardType) type).getUpperBounds()[0]);
        }
        getOffVariationName.read("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static void write(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(c8$$ExternalSyntheticOutline0.m(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitClose(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView) {
        InAppMessageBackEventHandler inAppMessageBackEventHandler;
        if (shortNewsContentCardView instanceof InAppMessageBackEventHandler) {
            inAppMessageBackEventHandler = (InAppMessageBackEventHandler) shortNewsContentCardView;
            int i = inAppMessageBackEventHandler.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                inAppMessageBackEventHandler.write = i - Integer.MIN_VALUE;
            } else {
                inAppMessageBackEventHandler = new InAppMessageBackEventHandler(shortNewsContentCardView);
            }
        } else {
            inAppMessageBackEventHandler = new InAppMessageBackEventHandler(shortNewsContentCardView);
        }
        Object obj = inAppMessageBackEventHandler.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = inAppMessageBackEventHandler.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (inAppMessageBackEventHandler.getContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer) != inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                inAppMessageBackEventHandler.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                inAppMessageBackEventHandler.write = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(inAppMessageBackEventHandler));
                cancellableContinuationImpl.read();
                ((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).serializer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new accessgetInAppMessageViewp(0, cancellableContinuationImpl));
                if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = inAppMessageBackEventHandler.read;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            throw th;
        }
    }

    public static ProducerCoroutine read(getContentViewGroupParentLayout getcontentviewgroupparentlayout, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        IInAppMessageViewWrapper iInAppMessageViewWrapper = IInAppMessageViewWrapper.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(SQLite.write(getcontentviewgroupparentlayout, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write), SQLite.IconCompatParcelizer(i, 4, iInAppMessageViewWrapper));
        coroutineStart.invoke(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, producerCoroutine, producerCoroutine);
        return producerCoroutine;
    }

    public static void read(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(m1$$ExternalSyntheticOutline0.m(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                write(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                write(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                write(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                write(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static boolean serializer(getFunctionEK5gGoQ getfunctionek5ggoq) {
        return (getfunctionek5ggoq instanceof getGuideEK5gGoQ) || (getfunctionek5ggoq instanceof getGEK5gGoQ) || (getfunctionek5ggoq instanceof getInfoEK5gGoQ) || getfunctionek5ggoq == getHelpEK5gGoQ.serializer || getfunctionek5ggoq == getHelpEK5gGoQ.read;
    }

    public static resizeToBitmapDimensions IconCompatParcelizer(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new resizeToBitmapDimensions(null, cls, typeArr);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(cls, "Missing type arguments for "));
        return null;
    }

    public static Bundle read(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof getInfoEK5gGoQ) {
                bundle.putString((String) entry.getKey(), ((getInfoEK5gGoQ) entry.getValue()).RemoteActionCompatParcelizer);
            } else if (entry.getValue() instanceof getGuideEK5gGoQ) {
                bundle.putBoolean((String) entry.getKey(), ((getGuideEK5gGoQ) entry.getValue()).RemoteActionCompatParcelizer.booleanValue());
            } else if (entry.getValue() instanceof getGEK5gGoQ) {
                bundle.putDouble((String) entry.getKey(), ((getGEK5gGoQ) entry.getValue()).serializer.doubleValue());
            } else if (entry.getValue() instanceof getHomeEK5gGoQ) {
                bundle.putBundle((String) entry.getKey(), read(((getHomeEK5gGoQ) entry.getValue()).write));
            } else {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", new Object[]{entry.getKey()});
                return null;
            }
        }
        return bundle;
    }
}
