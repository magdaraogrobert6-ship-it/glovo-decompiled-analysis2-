package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import coil3.RealImageLoader;
import com.deliveryhero.performance.core.aqs.AppQualityScore$enableScreenMetrics$1$1;
import com.google.android.gms.stats.zza;
import com.mapbox.maps.MapboxLifecycleObserver;
import com.mapbox.maps.MapboxLogger;
import java.util.LinkedHashMap;
import o.CSSParseException;
import o.StrokeCapCompanion;
import o.addPathUv8p0NAdefault;
import o.drawCachedImageFqjB98A;
import o.getContactsEK5gGoQ;
import o.getRadiusui_graphics;
import o.getSpreadD9Ej5fM;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcp implements ComponentCallbacks2 {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ zzcp(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.write;
        if (i != 0) {
            if (i == 1) {
                StrokeCapCompanion strokeCapCompanion = (StrokeCapCompanion) this.read;
                synchronized (strokeCapCompanion) {
                    if (((RealImageLoader) strokeCapCompanion.RemoteActionCompatParcelizer.get()) == null) {
                        strokeCapCompanion.serializer();
                    }
                }
                return;
            }
            if (i == 2) {
                configuration.getClass();
            } else if (i != 3) {
                configuration.getClass();
            } else {
                configuration.getClass();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        int i = this.write;
        if (i != 0) {
            if (i == 1) {
                onTrimMemory(80);
            } else {
                if (i == 2 || i == 3) {
                    return;
                }
                ((MapboxLifecycleObserver) this.read).onLowMemory();
            }
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        getRadiusui_graphics getradiusui_graphicsWrite;
        long jRemoteActionCompatParcelizer;
        AppQualityScore$enableScreenMetrics$1$1 appQualityScore$enableScreenMetrics$1$1;
        int i2 = this.write;
        if (i2 == 0) {
            if (i == 20) {
                ((getContactsEK5gGoQ) this.read).MediaBrowserCompatMediaItem.execute(new zza(16, this));
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.read;
                if (r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer || i != 20) {
                    return;
                }
                r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer();
                r8lambdalmkbrrgswwtv97obrsj7trj7ai.RemoteActionCompatParcelizer = true;
                return;
            }
            if (i2 == 3) {
                if (i != 20 || (appQualityScore$enableScreenMetrics$1$1 = ((drawCachedImageFqjB98A) this.read).MediaMetadataCompat) == null) {
                    return;
                }
                appQualityScore$enableScreenMetrics$1$1.IconCompatParcelizer(getSpreadD9Ej5fM.write);
                return;
            }
            if (i == 10 || i == 15) {
                MapboxLogger.logW("MapboxLifecyclePlugin", "onTrimMemory with level " + i + " is received, reduceMemoryUse will be called.");
                ((MapboxLifecycleObserver) this.read).onLowMemory();
                return;
            }
            return;
        }
        StrokeCapCompanion strokeCapCompanion = (StrokeCapCompanion) this.read;
        synchronized (strokeCapCompanion) {
            RealImageLoader realImageLoader = (RealImageLoader) strokeCapCompanion.RemoteActionCompatParcelizer.get();
            if (realImageLoader != null) {
                addPathUv8p0NAdefault addpathuv8p0nadefault = realImageLoader.write;
                if (i >= 40) {
                    getRadiusui_graphics getradiusui_graphicsWrite2 = realImageLoader.write();
                    if (getradiusui_graphicsWrite2 != null) {
                        synchronized (getradiusui_graphicsWrite2.RemoteActionCompatParcelizer) {
                            getradiusui_graphicsWrite2.IconCompatParcelizer.RemoteActionCompatParcelizer.write(-1L);
                            CSSParseException cSSParseException = getradiusui_graphicsWrite2.serializer;
                            cSSParseException.IconCompatParcelizer = 0;
                            ((LinkedHashMap) cSSParseException.RemoteActionCompatParcelizer).clear();
                        }
                    }
                } else if (i >= 20) {
                    strokeCapCompanion.read.write(addpathuv8p0nadefault.serializer);
                } else if (i >= 10 && (getradiusui_graphicsWrite = realImageLoader.write()) != null) {
                    synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                        jRemoteActionCompatParcelizer = getradiusui_graphicsWrite.IconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    }
                    long j = jRemoteActionCompatParcelizer / 2;
                    synchronized (getradiusui_graphicsWrite.RemoteActionCompatParcelizer) {
                        getradiusui_graphicsWrite.IconCompatParcelizer.RemoteActionCompatParcelizer.write(j);
                    }
                }
            } else {
                strokeCapCompanion.serializer();
            }
        }
    }
}
