package com.deliveryhero.performance.core.screenmetric;

import android.app.ApplicationExitInfo;
import android.os.Looper;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.perseus.PerseusApp;
import com.deliveryhero.perseus.data.local.db.TrackingDatabase;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.UnknownFieldException;
import o.getArcStartY;
import o.getPathMeasure;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ScreenStartObserver$$ExternalSyntheticLambda0 implements Function, getArcStartY {
    public final /* synthetic */ int write;

    public static /* synthetic */ void read(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void write(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        ((Callable) obj).getClass();
        return AndroidSchedulers.serializer(Looper.getMainLooper());
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // o.getArcStartY
    public Object B_() {
        switch (this.write) {
            case 26:
                return PerseusApp.serializer;
            case 27:
                TrackingDatabase trackingDatabase = getPathMeasure.IconCompatParcelizer;
                Calendar calendar = Calendar.getInstance();
                calendar.getClass();
                return calendar;
            case 28:
                TrackingDatabase trackingDatabase2 = getPathMeasure.IconCompatParcelizer;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.getClass();
                return calendar2;
            default:
                TrackingDatabase trackingDatabase3 = getPathMeasure.IconCompatParcelizer;
                Calendar calendar3 = Calendar.getInstance();
                calendar3.getClass();
                return calendar3;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void read() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void IconCompatParcelizer(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void serializer(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void IconCompatParcelizer(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void write(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void IconCompatParcelizer() {
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ void write(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void write(int i, String str, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void write(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void serializer(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void write(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void IconCompatParcelizer(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo cd_(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(String str, Object obj, Object obj2, Object obj3, Object obj4, Throwable th) {
        throw new RuntimeException(str + obj + obj2 + obj3 + obj4, th);
    }

    public static /* synthetic */ void write(String str, Object obj, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    public static /* synthetic */ void write(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void read(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static void serializer(int i) {
        throw new UnknownFieldException(c8$$ExternalSyntheticOutline0.m(i, "An unknown field for index "));
    }
}
