package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesUtils {
    public final FirebaseApp serializer;

    public /* synthetic */ SharedPreferencesUtils(FirebaseApp firebaseApp) {
        this.serializer = firebaseApp;
    }

    public void read(String str, boolean z) {
        FirebaseApp firebaseApp = this.serializer;
        firebaseApp.IconCompatParcelizer();
        SharedPreferences.Editor editorEdit = ((Application) firebaseApp.read).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z);
        editorEdit.apply();
    }
}
