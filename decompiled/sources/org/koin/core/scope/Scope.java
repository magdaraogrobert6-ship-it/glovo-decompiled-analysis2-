package org.koin.core.scope;

import bo.app.ff$$ExternalSyntheticOutline0;
import io.sentry.JsonObjectSerializer;
import io.sentry.util.ComponentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeContentCardsManager;
import o.FwFClientCompanion;
import o.FwFClientbootstrapIfNeeded1;
import o.getConfigfwf_client_release;
import o.getHttpClientfwf_client_release;
import o.getLoggerfwf_client_release;
import o.getProvidedCachefwf_client_release;
import o.getTrackingServicefwf_client_release;
import o.getUserfwf_client_release;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes4.dex */
public final class Scope {
    public final ThreadLocal IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final getUserfwf_client_release MediaSessionCompatQueueItem;
    public final ArrayList RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public final getConfigfwf_client_release read;
    public boolean serializer;
    public final ArrayList write;

    public final Object RemoteActionCompatParcelizer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getUserfwf_client_release getuserfwf_client_release) throws ClosedScopeException, NoBeanDefFoundException {
        JsonObjectSerializer jsonObjectSerializer = this.read.read;
        if (!jsonObjectSerializer.write(getProvidedCachefwf_client_release.DEBUG)) {
            return serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucgighn8fiyv_vccodeafjfpedk, getuserfwf_client_release);
        }
        if (getuserfwf_client_release != null) {
            Objects.toString(getuserfwf_client_release);
        }
        FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        jsonObjectSerializer.getClass();
        System.nanoTime();
        Object objSerializer = serializer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucgighn8fiyv_vccodeafjfpedk, getuserfwf_client_release);
        System.nanoTime();
        FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        jsonObjectSerializer.getClass();
        return objSerializer;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    public final Object serializer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getUserfwf_client_release getuserfwf_client_release) throws ClosedScopeException, NoBeanDefFoundException {
        BrazeContentCardsManager brazeContentCardsManager;
        String str;
        getTrackingServicefwf_client_release gettrackingservicefwf_client_release;
        getConfigfwf_client_release getconfigfwf_client_release = this.read;
        JsonObjectSerializer jsonObjectSerializer = getconfigfwf_client_release.read;
        if (this.serializer) {
            throw new ClosedScopeException(ff$$ExternalSyntheticOutline0.m(new StringBuilder("Scope '"), this.MediaBrowserCompatMediaItem, "' is closed"));
        }
        Object objWrite = null;
        getTrackingServicefwf_client_release gettrackingservicefwf_client_release2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null ? (getTrackingServicefwf_client_release) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke() : null;
        ThreadLocal threadLocal = this.IconCompatParcelizer;
        if (gettrackingservicefwf_client_release2 != null) {
            getProvidedCachefwf_client_release getprovidedcachefwf_client_release = getProvidedCachefwf_client_release.DEBUG;
            FwFClientbootstrapIfNeeded1 fwFClientbootstrapIfNeeded1 = new FwFClientbootstrapIfNeeded1(19, gettrackingservicefwf_client_release2);
            jsonObjectSerializer.getClass();
            getprovidedcachefwf_client_release.getClass();
            if (jsonObjectSerializer.write(getprovidedcachefwf_client_release)) {
                fwFClientbootstrapIfNeeded1.invoke();
            }
            brazeContentCardsManager = (BrazeContentCardsManager) threadLocal.get();
            if (brazeContentCardsManager == null) {
                brazeContentCardsManager = new BrazeContentCardsManager();
                threadLocal.set(brazeContentCardsManager);
            }
            brazeContentCardsManager.addFirst(gettrackingservicefwf_client_release2);
        } else {
            brazeContentCardsManager = null;
        }
        ComponentActivity componentActivity = new ComponentActivity(jsonObjectSerializer, this, gettrackingservicefwf_client_release2);
        ComponentActivity componentActivity2 = getconfigfwf_client_release.RemoteActionCompatParcelizer;
        componentActivity2.getClass();
        getUserfwf_client_release getuserfwf_client_release2 = this.MediaSessionCompatQueueItem;
        getuserfwf_client_release2.getClass();
        getLoggerfwf_client_release getloggerfwf_client_release = (getLoggerfwf_client_release) ((ConcurrentHashMap) componentActivity2.write).get(getHttpClientfwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedk, getuserfwf_client_release, getuserfwf_client_release2));
        Object objSerializer = getloggerfwf_client_release != null ? getloggerfwf_client_release.serializer(componentActivity) : null;
        if (objSerializer == null) {
            objSerializer = null;
        }
        if (objSerializer == null) {
            String str2 = "|- ? t:'" + FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk) + "' - q:'" + getuserfwf_client_release + "' look in injected parameters";
            jsonObjectSerializer.getClass();
            getProvidedCachefwf_client_release getprovidedcachefwf_client_release2 = getProvidedCachefwf_client_release.DEBUG;
            jsonObjectSerializer.serializer(getprovidedcachefwf_client_release2, str2);
            BrazeContentCardsManager brazeContentCardsManager2 = (BrazeContentCardsManager) threadLocal.get();
            objSerializer = (brazeContentCardsManager2 == null || (gettrackingservicefwf_client_release = (getTrackingServicefwf_client_release) brazeContentCardsManager2.write()) == null) ? null : gettrackingservicefwf_client_release.write(r8lambdaucgighn8fiyv_vccodeafjfpedk);
            if (objSerializer == null) {
                if (this.MediaDescriptionCompat) {
                    objSerializer = null;
                } else {
                    FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk);
                    Objects.toString(getuserfwf_client_release);
                    jsonObjectSerializer.write(getprovidedcachefwf_client_release2);
                    Object obj = this.RemoteActionCompatParcelizer;
                    if (obj == null || !r8lambdaucgighn8fiyv_vccodeafjfpedk.read(obj) || getuserfwf_client_release != null || (objSerializer = this.RemoteActionCompatParcelizer) == null) {
                        objSerializer = null;
                    }
                }
                if (objSerializer == null) {
                    FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk);
                    Objects.toString(getuserfwf_client_release);
                    jsonObjectSerializer.write(getprovidedcachefwf_client_release2);
                    Iterator it = this.RatingCompat.iterator();
                    while (it.hasNext() && (objWrite = ((Scope) it.next()).write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucgighn8fiyv_vccodeafjfpedk, getuserfwf_client_release)) == null) {
                    }
                    objSerializer = objWrite;
                    if (objSerializer == null) {
                        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                            threadLocal.remove();
                            jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, "|- << parameters");
                        }
                        if (getuserfwf_client_release != null) {
                            str = " and qualifier '" + getuserfwf_client_release + '\'';
                        } else {
                            str = "";
                        }
                        throw new NoBeanDefFoundException("No definition found for type '" + FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!");
                    }
                }
            }
        }
        if (brazeContentCardsManager != null) {
            jsonObjectSerializer.getClass();
            jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, "| << parameters");
            brazeContentCardsManager.RatingCompat();
        }
        return objSerializer;
    }

    public final Object write(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getUserfwf_client_release getuserfwf_client_release) {
        JsonObjectSerializer jsonObjectSerializer = this.read.read;
        try {
            return RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaucgighn8fiyv_vccodeafjfpedk, getuserfwf_client_release);
        } catch (ClosedScopeException unused) {
            String str = "* Scope closed - no instance found for " + FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk) + " on scope " + this;
            jsonObjectSerializer.getClass();
            jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, str);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            String str2 = "* No instance found for type '" + FwFClientCompanion.IconCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk) + "' on scope '" + this + '\'';
            jsonObjectSerializer.getClass();
            jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, str2);
            return null;
        }
    }

    public Scope(getUserfwf_client_release getuserfwf_client_release, String str, boolean z, getConfigfwf_client_release getconfigfwf_client_release) {
        getuserfwf_client_release.getClass();
        this.MediaSessionCompatQueueItem = getuserfwf_client_release;
        this.MediaBrowserCompatMediaItem = str;
        this.MediaDescriptionCompat = z;
        this.read = getconfigfwf_client_release;
        this.RatingCompat = new ArrayList();
        this.write = new ArrayList();
        this.IconCompatParcelizer = new ThreadLocal();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("['"), this.MediaBrowserCompatMediaItem, "']");
    }
}
