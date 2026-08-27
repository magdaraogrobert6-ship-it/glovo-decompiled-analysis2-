package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hmf.tasks.CancellationToken;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.location.router.RouterTaskHandler;
import com.huawei.location.router.entity.RouterRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import o.ViewLayerCompanionOutlineProvider1;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes2.dex */
public class x<TResult, TClient extends AnyClient, TOption extends Api.ApiOptions> implements InvocationHandler {
    private static final Object[] d = new Object[0];
    private final Object a;
    private final WeakReference<Context> b;
    private RouterTaskHandler c;

    public class a extends CancellationToken {
        @Override // com.huawei.hmf.tasks.CancellationToken
        public boolean isCancellationRequested() {
            return false;
        }

        @Override // com.huawei.hmf.tasks.CancellationToken
        public CancellationToken register(Runnable runnable) {
            return null;
        }

        public a() {
        }
    }

    private setShouldUseDispatchDrawui a(Object[] objArr) {
        ApiException apiException;
        ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1 = new ViewLayerCompanionOutlineProvider1();
        if (objArr == null || objArr.length == 0) {
            apiException = new ApiException(Status.FAILURE);
        } else {
            if (this.c == null) {
                RouterTaskHandler routerTaskHandler = RouterTaskHandler.getInstance();
                this.c = routerTaskHandler;
                routerTaskHandler.initTaskCall(this.b.get());
            }
            b<TClient, TResult> bVarA = null;
            AbstractClientBuilder abstractClientBuilder = null;
            for (Object obj : objArr) {
                if (obj instanceof b) {
                    bVarA = a((b) obj);
                }
                if (obj instanceof AbstractClientBuilder) {
                    abstractClientBuilder = (AbstractClientBuilder) obj;
                }
            }
            if (bVarA != null && abstractClientBuilder != null) {
                synchronized (d) {
                    RouterRequest routerRequest = new RouterRequest(bVarA.getUri(), bVarA.getRequestJson(), bVarA.getTransactionId(), new v(bVarA, viewLayerCompanionOutlineProvider1, abstractClientBuilder), bVarA.getParcelable());
                    if (y.a()) {
                        routerRequest.setResendFromHMS(true);
                    }
                    this.c.enqueue(routerRequest);
                    HMSLog.i("LiteSDKApiProxyHandler", "handlerLiteTask success");
                }
                return viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
            }
            apiException = new ApiException(Status.FAILURE);
        }
        viewLayerCompanionOutlineProvider1.read(apiException);
        return viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        if (!method.isAnnotationPresent(w.class)) {
            return method.invoke(this.a, objArr);
        }
        HMSLog.i("LiteSDKApiProxyHandler", "not find HMS Core ,try use lite");
        return a(objArr);
    }

    private x(Context context, Object obj) {
        this.a = obj;
        this.b = new WeakReference<>(context);
    }

    private b<TClient, TResult> a(b<TClient, TResult> bVar) {
        bVar.setToken(new a());
        return bVar;
    }

    public static Object a(Context context, Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new x(context, obj));
    }
}
