package com.mapbox.navigation.ui.maps.util;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2;
import androidx.compose.ui.graphics.Color;
import com.huawei.agconnect.config.impl.m;
import kotlin.jvm.internal.Lambda;
import o.CompositionLocalMapInjectionElement;
import o.IconCompatParcelizer;
import o.createFromParcel;
import o.foldIn;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getPostalCode;
import o.materialize;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheResultUtils$cacheResult$5 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ int $r8$classId;
    public final Object handler;

    public CacheResultUtils$cacheResult$5(CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2, LruCache lruCache) {
        this.$r8$classId = 0;
        this.handler = new m(crossfadeKt$Crossfade$5$1$alpha$2, 12, lruCache);
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(final Object obj, final Object obj2, final Object obj3) {
        int i = this.$r8$classId;
        CompositionLocalMapInjectionElement compositionLocalMapInjectionElement = CompositionLocalMapInjectionElement.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.handler;
        if (i == 0) {
            return ((m) obj4).invoke(new CacheResultUtils$CacheResultCall(obj, obj2, obj3) { // from class: com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultKey3
                public final Object p1;
                public final Object p2;
                public final Object p3;

                public final int hashCode() {
                    Object obj5 = this.p1;
                    int iHashCode = obj5 == null ? 0 : obj5.hashCode();
                    Object obj6 = this.p2;
                    int iHashCode2 = obj6 == null ? 0 : obj6.hashCode();
                    Object obj7 = this.p3;
                    return (((iHashCode * 31) + iHashCode2) * 31) + (obj7 != null ? obj7.hashCode() : 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.mapbox.navigation.ui.maps.util.CacheResultUtils$CacheResultCall
                public final Object invoke(Lambda lambda) {
                    return ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) lambda).invoke(this.p1, this.p2, this.p3);
                }

                {
                    this.p1 = obj;
                    this.p2 = obj2;
                    this.p3 = obj3;
                }

                public final boolean equals(Object obj5) {
                    if (this == obj5) {
                        return true;
                    }
                    if (!(obj5 instanceof CacheResultUtils$CacheResultKey3)) {
                        return false;
                    }
                    CacheResultUtils$CacheResultKey3 cacheResultUtils$CacheResultKey3 = (CacheResultUtils$CacheResultKey3) obj5;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p1, cacheResultUtils$CacheResultKey3.p1}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2, cacheResultUtils$CacheResultKey3.p2}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p3, cacheResultUtils$CacheResultKey3.p3}, getCieXyz.write())).booleanValue();
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CacheResultKey3(p1=");
                    sb.append(this.p1);
                    sb.append(", p2=");
                    sb.append(this.p2);
                    sb.append(", p3=");
                    return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.p3, ')');
                }
            });
        }
        if (i == 1) {
            long jM732unboximpl = ((Color) obj).m732unboximpl();
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= ((getPostalCode) getbirthdatefull).serializer(jM732unboximpl) ? 4 : 2;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                materialize.write(((foldIn) obj4).write, jM732unboximpl, getpostalcode, (iIntValue << 3) & 112);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i != 2) {
            ((Color) obj).m732unboximpl();
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
            int iIntValue2 = ((Number) obj3).intValue();
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                compositionLocalMapInjectionElement.write(((RemoteAction) obj4).getIcon(), getpostalcode2, 48);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        ((Color) obj).m732unboximpl();
        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj2;
        int iIntValue3 = ((Number) obj3).intValue();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
        if (getpostalcode3.write(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
            compositionLocalMapInjectionElement.read((Drawable) obj4, getpostalcode3, 48);
        } else {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }

    public /* synthetic */ CacheResultUtils$cacheResult$5(int i, Object obj) {
        this.$r8$classId = i;
        this.handler = obj;
    }
}
