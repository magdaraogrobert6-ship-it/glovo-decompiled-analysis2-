package com.data.util.exception;

import android.annotation.SuppressLint;
import java.util.Locale;
import o.updatePathOutline;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint
public class FoodoraMigrationException extends Exception {
    public FoodoraMigrationException(Class cls, updatePathOutline updatepathoutline) {
        super(String.format(Locale.getDefault(), "cannot migrate %s %s", cls.getSimpleName(), updatepathoutline));
    }
}
