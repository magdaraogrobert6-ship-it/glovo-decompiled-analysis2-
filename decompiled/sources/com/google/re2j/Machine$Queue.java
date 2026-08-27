package com.google.re2j;

import android.content.Context;
import android.os.Bundle;
import android.os.LocaleList;
import com.mapbox.navigation.base.formatter.DistanceFormatterOptions;
import com.mapbox.navigation.base.formatter.UnitType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.FwFClientgetEvaluations1;
import o.InfiniteAnimationPolicyKt;
import o.accessbootstrapIfNeeded;
import o.cubicTo;
import o.getCyan0d7_KjU;
import o.getTrackDrawable;
import o.isAppSetIdReadingEnabled;
import o.onViewAttachedToWindowlambda0;
import o.setNativeShader;
import o.validateColorStops;

/* JADX INFO: loaded from: classes2.dex */
public class Machine$Queue {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public Object write;

    public Machine$Queue(Context context) {
        this.RemoteActionCompatParcelizer = 3;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.IconCompatParcelizer = applicationContext;
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        locales.getClass();
        Locale locale = (locales.isEmpty() || locales.get(0) == null) ? Locale.getDefault() : locales.get(0);
        locale.getClass();
        this.serializer = locale;
        this.read = -1;
    }

    public void unitType(UnitType unitType) {
        this.write = unitType;
    }

    public Object RemoteActionCompatParcelizer() {
        Object objRemoveLast;
        synchronized (this.serializer) {
            objRemoveLast = ((ArrayDeque) this.IconCompatParcelizer).removeLast();
        }
        return objRemoveLast;
    }

    public DistanceFormatterOptions build() {
        Context context = (Context) this.IconCompatParcelizer;
        Locale locale = (Locale) this.serializer;
        UnitType unitType = (UnitType) this.write;
        if (unitType == null) {
            locale.getClass();
            String country = locale.getCountry();
            country.getClass();
            String upperCase = country.toUpperCase(locale);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            unitType = (iHashCode == 2438 ? upperCase.equals("LR") : iHashCode == 2464 ? upperCase.equals("MM") : iHashCode == 2718 && upperCase.equals("US")) ? UnitType.IMPERIAL : UnitType.METRIC;
        }
        return new DistanceFormatterOptions(context, locale, unitType, this.read);
    }

    public boolean serializer() {
        boolean zIsEmpty;
        synchronized (this.serializer) {
            zIsEmpty = ((ArrayDeque) this.IconCompatParcelizer).isEmpty();
        }
        return zIsEmpty;
    }

    public String toString() {
        if (this.RemoteActionCompatParcelizer != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < this.read; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((int[]) this.serializer)[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public Machine$Queue(int i) {
        this.RemoteActionCompatParcelizer = 0;
        this.write = new int[i];
        this.serializer = new int[i];
        this.IconCompatParcelizer = new InfiniteAnimationPolicyKt[i];
    }

    public Machine$Queue(Bundle bundle) {
        this.RemoteActionCompatParcelizer = 2;
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            this.IconCompatParcelizer = string;
            this.read = getCyan0d7_KjU.write(bundle, "nav-entry-state:destination-id");
            Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
            if (bundle2 != null) {
                this.serializer = bundle2;
                Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
                if (bundle3 != null) {
                    this.write = bundle3;
                    return;
                } else {
                    accessbootstrapIfNeeded.write("nav-entry-state:saved-state");
                    throw null;
                }
            }
            accessbootstrapIfNeeded.write("nav-entry-state:args");
            throw null;
        }
        accessbootstrapIfNeeded.write("nav-entry-state:id");
        throw null;
    }

    public Machine$Queue(int i, getTrackDrawable gettrackdrawable) {
        this.RemoteActionCompatParcelizer = 1;
        this.serializer = new Object();
        this.read = i;
        this.IconCompatParcelizer = new ArrayDeque(i);
        this.write = gettrackdrawable;
    }

    public Machine$Queue(cubicTo cubicto, int i) {
        this.RemoteActionCompatParcelizer = 2;
        this.IconCompatParcelizer = cubicto.serializer;
        this.read = i;
        validateColorStops validatecolorstops = cubicto.MediaBrowserCompatMediaItem;
        this.serializer = validatecolorstops.RemoteActionCompatParcelizer();
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        Bundle bundle = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
        this.write = bundle;
        validatecolorstops.PlaybackStateCompat.read(bundle);
    }

    public Machine$Queue() {
        this.RemoteActionCompatParcelizer = 4;
        this.IconCompatParcelizer = FwFClientgetEvaluations1.FROM_APPLICATION_ONLY;
        this.read = -1;
        this.serializer = new ArrayList();
        this.write = new ArrayList();
    }
}
